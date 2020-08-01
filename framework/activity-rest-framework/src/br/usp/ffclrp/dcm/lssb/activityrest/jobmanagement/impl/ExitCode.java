package br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.impl;

public class ExitCode {

	private final int exitCode;
	private final TerminationStatus status;
	private final String description;

	public ExitCode(int exitCode, TerminationStatus status, String description) {
		this.exitCode = exitCode;
		this.status = status;
		this.description = description;
	}

	public int getExitCode() {
		return this.exitCode;
	}

	public TerminationStatus getStatus() {
		return this.status;
	}

	public String getDescription() {
		return this.description;
	}

	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof ExitCode)) return false;
		final ExitCode other = (ExitCode) o;
		if (!other.canEqual((Object) this)) return false;
		if (this.getExitCode() != other.getExitCode()) return false;
		final Object this$status = this.getStatus();
		final Object other$status = other.getStatus();
		if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
		final Object this$description = this.getDescription();
		final Object other$description = other.getDescription();
		if (this$description == null ? other$description != null : !this$description.equals(other$description))
			return false;
		return true;
	}

	protected boolean canEqual(final Object other) {
		return other instanceof ExitCode;
	}

	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		result = result * PRIME + this.getExitCode();
		final Object $status = this.getStatus();
		result = result * PRIME + ($status == null ? 43 : $status.hashCode());
		final Object $description = this.getDescription();
		result = result * PRIME + ($description == null ? 43 : $description.hashCode());
		return result;
	}

	public String toString() {
		return "ExitCode(exitCode=" + this.getExitCode() + ", status=" + this.getStatus() + ", description=" + this.getDescription() + ")";
	}
}
