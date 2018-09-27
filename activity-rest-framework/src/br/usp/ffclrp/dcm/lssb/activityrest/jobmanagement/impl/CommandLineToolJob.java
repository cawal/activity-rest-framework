package br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.impl;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.JobObserver;
import lombok.Builder;
import lombok.Singular;

public class CommandLineToolJob extends AbstractJob {
	protected JobConfig jobConfig; 

	public void setJobConfig(JobConfig jobConfig) {
		this.jobConfig = jobConfig;
	}
	
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
			process.waitFor();
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
	 * @return the jobConfig
	 */
	public JobConfig getJobConfig() {
		return jobConfig;
	}


}