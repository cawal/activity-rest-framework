package br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

import lombok.Builder;
import lombok.Singular;

@Builder(builderClassName="Builder")
public class Job implements Runnable {
	final String id;
	final JobConfig jobConfig; 
	
	
	@Singular private List<JobObserver> observers;
	



	public void run() {
		try {
			notifyStarted();
			
			
			// Create a process builder with the command line
			ProcessBuilder pb = new ProcessBuilder(
					jobConfig.getCommandLine().toArray(new String[0]));
			
			pb.directory(jobConfig.getWorkingDirectory());
			pb.redirectErrorStream(false);
			pb.redirectError(Redirect.appendTo(
					jobConfig.standardErrorPipedFile()));
			pb.redirectOutput(Redirect.appendTo(
					jobConfig.standardOutputPipedFile()));
			pb.redirectInput(Redirect.from(jobConfig.standardInputPipedFile()));
			
			Process process = pb.start();
			System.out.println("starting");
			process.waitFor();
			System.out.println("ended");
			System.out.println(process.exitValue());
			// When the process is finished
			switch (process.exitValue()) {
			// If the process was successfully finished
			case 0:
				notifySuccess();
				break;
			
			// If the process was not successfully finished
			default:
				FileUtils.writeStringToFile(jobConfig.getErrorReportFile(),
						provideErrorReport(jobConfig, process.exitValue()),true);
				notifyFailure();
				break;
			}
			
		} catch (IOException | InterruptedException  e) {
			e.printStackTrace();
			try {
				FileUtils.writeStringToFile(jobConfig.getErrorReportFile(), e.getMessage(),true);
				notifyFailure();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		
	}


	private String provideErrorReport(JobConfig jobConfig, int exitValue) {
		// TODO Better handling of the error report
		return "Failure code:" + exitValue;
	}
	


	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}



	/**
	 * @return the jobConfig
	 */
	public JobConfig getJobConfig() {
		return jobConfig;
	}
	
	
	public void addObserver(JobObserver observer) {
		if(this.observers == null) {
			this.observers = new ArrayList<>();
		}
		
		if(observer != null) {
			this.observers.add(observer);
		}
	}

	
	
	
	
	private void notifyStarted() {
		observers.forEach(o -> o.notifyStarted(this));
	}



	private void notifySuccess() {
		this.observers.forEach( o -> o.notifySuccess(this));
	}



	private void notifyFailure() {
		this.observers.forEach(o -> o.notifyFailure(this));
	}



}