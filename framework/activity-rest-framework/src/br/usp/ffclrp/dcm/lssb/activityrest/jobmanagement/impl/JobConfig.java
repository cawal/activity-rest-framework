package br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.impl;

import java.io.File;
import java.util.Collections;
import java.util.List;

import lombok.Builder;

@Builder(builderClassName = "Builder")
public class JobConfig {

	private final List<String> commandLine;
	private final File standardInputPipedFile;
	private final File standardOutputPipedFile;
	private final File standardErrorPipedFile;
	private final File workingDirectory;
	private final File errorReportFile;
	
	public JobConfig(List<String> commandLine, 
			File standardInputPipe,
			File standardOutputPipe, 
			File standardErrorPipe,
			File workingDirectory,
			File errorReportFile) {
		super();
		this.commandLine = Collections.unmodifiableList(commandLine);
		this.standardInputPipedFile = standardInputPipe;
		this.standardOutputPipedFile = standardOutputPipe;
		this.standardErrorPipedFile = standardErrorPipe;
		this.workingDirectory = workingDirectory;
		this.errorReportFile = errorReportFile;
	}
	
	/**
	 * @return the commandLine
	 */
	public List<String> getCommandLine() {
		return commandLine;
	}
	/**
	 * @return the standardInputPipe
	 */
	public File standardInputPipedFile() {
		return standardInputPipedFile;
	}
	/**
	 * @return the standardOutputPipe
	 */
	public File standardOutputPipedFile() {
		return standardOutputPipedFile;
	}
	/**
	 * @return the standardErrorPipe
	 */
	public File standardErrorPipedFile() {
		return standardErrorPipedFile;
	}
	/**
	 * @return the workingDirectory
	 */
	public File getWorkingDirectory() {
		return workingDirectory;
	}

	/**
	 * @return the errorReportFile
	 */
	public File getErrorReportFile() {
		return errorReportFile;
	}
}