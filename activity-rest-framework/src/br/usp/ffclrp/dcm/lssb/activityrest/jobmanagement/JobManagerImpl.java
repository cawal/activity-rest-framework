package br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.exceptions.*;

public class JobManagerImpl implements JobManager {
	
	File stateManagementDirectory;
	JobObserver jobObserver = new MyJobObserver();
	
	class MyJobObserver implements JobObserver{
			
		@Override
		public void notifyStarted(Job job) {
			File stateFile = new File(stateManagementDirectory,job.getId());
			try {
				FileUtils.writeStringToFile(stateFile, JobState.RUNNING.toString());
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		@Override
		public void notifyFailure(Job job) {
			File stateFile = new File(stateManagementDirectory,job.getId());
			try {
				FileUtils.writeStringToFile(stateFile, JobState.FAILED.toString());
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
			@Override
			public void notifySuccess(Job job) {
				File stateFile = new File(stateManagementDirectory,job.getId());
				try {
					FileUtils.writeStringToFile(stateFile, JobState.SUCCEEDED.toString());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	
	public JobManagerImpl() {
		stateManagementDirectory = new File("/tmp/JobManager");
		if(!stateManagementDirectory.exists())
			stateManagementDirectory.mkdirs();
	}
	
	
	@Override
	public void submit(String jobId, JobConfig jobConfig)
			throws JobCantStartException {
		
		Job job = Job.builder()
				.id(jobId)
				.jobConfig(jobConfig)
				.observer(jobObserver)
				.build();
		
		
		try {
			File stateFile = retrieveStateFileForId(jobId);
			if(stateFile.exists()) {
				boolean jobIsNotCanceled = 
						JobState.CANCELED != 
						JobState.valueOf(FileUtils.readFileToString(stateFile));
				if(jobIsNotCanceled)
					// job exists!
					throw new JobCantStartException(jobId);
			} else {
				stateFile.createNewFile();
			}
			FileUtils.writeStringToFile(stateFile, JobState.RUNNING.toString());
		} catch (Exception e) {
			throw new JobCantStartException(jobId);
		}
		
		Thread t = new Thread(job);
		t.setName(jobId);
		t.start();
		
	}
	
	@Override
	public JobState getState(String jobId) throws JobNotFoundException {
		File stateFile = retrieveStateFileForId(jobId);
		if(! stateFile.exists()) {
			throw new JobNotFoundException(jobId);
		}

		try {
			return JobState.valueOf(FileUtils.readFileToString(stateFile));
		} catch (IOException e) {
			throw new JobNotFoundException(jobId);
		}
	}
	
	@Override
	public void cancel(String jobId) throws JobCancellationException {
		File stateFile = retrieveStateFileForId(jobId);
		try {
			if(JobState.RUNNING == JobState.valueOf(FileUtils.readFileToString(stateFile))) {
				// TODO Implement job cancellation logic
				// get the thread and stop it
				throw new JobCancellationException(jobId);
				
			} else {
				throw new JobCancellationException(jobId);
			}
		} catch (IOException e) {
			e.printStackTrace();
			throw new JobCancellationException(jobId);
		}
	}


	
	
	private File retrieveStateFileForId(String jobId) {
		return new File(stateManagementDirectory,jobId);
	}
}
