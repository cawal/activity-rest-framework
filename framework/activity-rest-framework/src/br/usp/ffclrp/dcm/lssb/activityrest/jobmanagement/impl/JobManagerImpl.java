package br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.impl;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;

import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.Job;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.JobManager;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.JobObserver;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.JobState;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.exceptions.JobCancellationException;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.exceptions.JobCantStartException;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.exceptions.JobNotFoundException;

public class JobManagerImpl implements JobManager {
	
	File stateManagementDirectory;
	JobObserver jobObserver = new MyJobObserver();
	Map<String,Job> jobs = Collections.synchronizedMap(new HashMap<String,Job>());
	
	class MyJobObserver implements JobObserver{
			
		@Override
		public void notifyStarted(Job job) {
			System.out.println(job.getId());
			System.out.println(stateManagementDirectory.getAbsolutePath());
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
			File stateFile = new File(stateManagementDirectory, job.getId());
			try {
				FileUtils.writeStringToFile(stateFile,
						JobState.SUCCEEDED.toString());
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
	public void submit(String jobId, Job job)
			throws JobCantStartException {
		
		try {
			File stateFile = retrieveStateFileForId(jobId);
			if(stateFile.exists()) {
				boolean jobIsNotCanceled = 
						JobState.CANCELED != 
						JobState.valueOf(FileUtils.readFileToString(stateFile));
				if(jobIsNotCanceled) {// job exists!
					throw new JobCantStartException(jobId);
				}
			} else {
				stateFile.createNewFile();
			}
			FileUtils.writeStringToFile(stateFile, JobState.RUNNING.toString());
		} catch (Exception e) {
			throw new JobCantStartException(jobId);
		}
		
		// add  the instance observer to the job
		job.addObserver(jobObserver);
		
		// hold a reference to the job
		jobs.put(jobId, job);
		
		// start the new thread
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
	public Job getJob(String jobId) throws JobNotFoundException {
		Job job = jobs.get(jobId);
		if (job == null) {
			throw new JobNotFoundException(jobId);
		}
		return job;
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
