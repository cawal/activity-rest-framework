package br.usp.ffclrp.dcm.lssb.activityrest.job;

import java.io.File;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

import org.apache.commons.io.FileUtils;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity;

public class Job implements Runnable {
	final JobConfig jobConfig; 
	
	
	
	public Job(JobConfig jobConfig) {
		super();
		this.jobConfig = jobConfig;
	}



	public void run() {
		try {
			
			FileUtils.writeStringToFile(jobConfig.getProcessingStateFile(), "RUNNING");
			
			
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
				FileUtils.writeStringToFile(jobConfig.getProcessingStateFile(), "SUCCEEDED");
				break;
			
			// If the process was not successfully finished
			default:
				FileUtils.writeStringToFile(jobConfig.getErrorReportFile(),
						provideErrorReport(jobConfig, process.exitValue()),true);
				FileUtils.writeStringToFile(jobConfig.getProcessingStateFile()
						, "FAILED");
				break;
			}
			
		} catch (IOException | InterruptedException  e) {
			e.printStackTrace();
			try {
				FileUtils.writeStringToFile(jobConfig.getProcessingStateFile(), "FAILED");
				FileUtils.writeStringToFile(jobConfig.getErrorReportFile(), e.getMessage(),true);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		
	}



	private String provideErrorReport(JobConfig jobConfig, int exitValue) {
		// TODO Better handling of the error report
		return "Failure code:" + exitValue;
	}
}