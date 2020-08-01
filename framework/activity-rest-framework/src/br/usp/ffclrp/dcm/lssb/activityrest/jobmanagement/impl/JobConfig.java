package br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.impl;

import java.io.File;
import java.util.Collections;
import java.util.List;

public class JobConfig {

	private final List<String> commandLine;
	private final File standardInputPipedFile;
	private final File standardOutputPipedFile;
	private final File standardErrorPipedFile;
	private final File workingDirectory;
	private final File errorReportFile;
	private final List<ExitCode> exitCodes;
	
	/**
	 * The termination status if the code is not found in the exitCodes list.
	 */
	private final ExitCode defaultTerminationStatus;
	
	public JobConfig(List<String> commandLine, 
			File standardInputPipe,
			File standardOutputPipe, 
			File standardErrorPipe,
			File workingDirectory,
			File errorReportFile,
			List<ExitCode> exitCodes,
			ExitCode defaultTerminationStatus) {
		super();
		this.commandLine = Collections.unmodifiableList(commandLine);
		this.standardInputPipedFile = standardInputPipe;
		this.standardOutputPipedFile = standardOutputPipe;
		this.standardErrorPipedFile = standardErrorPipe;
		this.workingDirectory = workingDirectory;
		this.errorReportFile = errorReportFile;
		this.exitCodes = exitCodes;
		this.defaultTerminationStatus = defaultTerminationStatus;

	}

	public static Builder builder() {
		return new Builder();
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

	public List<ExitCode> getExitCodes() {
		return exitCodes;
	}

	public ExitCode getDefaultTerminationStatus() {
		return defaultTerminationStatus;
	}

	public static class Builder {
		private List<String> commandLine;
		private File standardInputPipedFile;
		private File standardOutputPipedFile;
		private File standardErrorPipedFile;
		private File workingDirectory;
		private File errorReportFile;
		private List<ExitCode> exitCodes;
		private ExitCode defaultTerminationStatus;

		Builder() {
		}

		public Builder commandLine(List<String> commandLine) {
			this.commandLine = commandLine;
			return this;
		}

		public Builder standardInputPipedFile(File standardInputPipedFile) {
			this.standardInputPipedFile = standardInputPipedFile;
			return this;
		}

		public Builder standardOutputPipedFile(File standardOutputPipedFile) {
			this.standardOutputPipedFile = standardOutputPipedFile;
			return this;
		}

		public Builder standardErrorPipedFile(File standardErrorPipedFile) {
			this.standardErrorPipedFile = standardErrorPipedFile;
			return this;
		}

		public Builder workingDirectory(File workingDirectory) {
			this.workingDirectory = workingDirectory;
			return this;
		}

		public Builder errorReportFile(File errorReportFile) {
			this.errorReportFile = errorReportFile;
			return this;
		}

		public Builder exitCodes(List<ExitCode> exitCodes) {
			this.exitCodes = exitCodes;
			return this;
		}

		public Builder defaultTerminationStatus(ExitCode defaultTerminationStatus) {
			this.defaultTerminationStatus = defaultTerminationStatus;
			return this;
		}

		public JobConfig build() {
			return new JobConfig(commandLine, standardInputPipedFile, standardOutputPipedFile, standardErrorPipedFile, workingDirectory, errorReportFile, exitCodes, defaultTerminationStatus);
		}

		public String toString() {
			return "JobConfig.Builder(commandLine=" + this.commandLine + ", standardInputPipedFile=" + this.standardInputPipedFile + ", standardOutputPipedFile=" + this.standardOutputPipedFile + ", standardErrorPipedFile=" + this.standardErrorPipedFile + ", workingDirectory=" + this.workingDirectory + ", errorReportFile=" + this.errorReportFile + ", exitCodes=" + this.exitCodes + ", defaultTerminationStatus=" + this.defaultTerminationStatus + ")";
		}
	}
}
