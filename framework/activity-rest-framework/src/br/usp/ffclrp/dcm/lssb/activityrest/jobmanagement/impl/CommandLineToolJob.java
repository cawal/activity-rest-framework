package br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.impl;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.util.Optional;

import org.apache.commons.io.FileUtils;

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
			jobConfig.getCommandLine().stream().forEach(System.err::println);
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
			int processExitValue = process.exitValue();
			// look for its status or the default one
			ExitCode exitCodeDescription = 
				jobConfig.getExitCodes().stream()
					.filter(e -> e.getExitCode() == processExitValue)
					.findFirst()
					.orElse(jobConfig.getDefaultTerminationStatus());
			
			
			FileUtils.writeStringToFile(jobConfig.getErrorReportFile(),
					provideErrorReport(exitCodeDescription),true);
			
			switch (exitCodeDescription.getStatus()) {
			// If the process was successfully finished
			case SUCCEEDED:
				notifySuccess();
				break;
	
			// If the process was not successfully finished
			case FAILED:
			default:
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


	private String provideErrorReport(ExitCode exitCode) {
		// TODO Better handling of the error report
		return exitCode.toString();
	}



	/**
	 * @return the jobConfig
	 */
	public JobConfig getJobConfig() {
		return jobConfig;
	}


}