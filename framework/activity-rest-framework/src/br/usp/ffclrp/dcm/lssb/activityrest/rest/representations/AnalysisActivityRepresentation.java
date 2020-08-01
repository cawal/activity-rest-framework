package br.usp.ffclrp.dcm.lssb.activityrest.rest.representations;

public class AnalysisActivityRepresentation {
	private final String id;
	private final AnalysisActivityStateRepresentation state;
	private String errorReport;

	public AnalysisActivityRepresentation(String id, AnalysisActivityStateRepresentation state) {
		this.id = id;
		this.state = state;
	}

	public String getId() {
		return this.id;
	}

	public AnalysisActivityStateRepresentation getState() {
		return this.state;
	}

	public String getErrorReport() {
		return this.errorReport;
	}

	public void setErrorReport(String errorReport) {
		this.errorReport = errorReport;
	}

	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof AnalysisActivityRepresentation))
			return false;
		final AnalysisActivityRepresentation other = (AnalysisActivityRepresentation) o;
		if (!other.canEqual((Object) this)) return false;
		final Object this$id = this.getId();
		final Object other$id = other.getId();
		if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
		final Object this$state = this.getState();
		final Object other$state = other.getState();
		if (this$state == null ? other$state != null : !this$state.equals(other$state)) return false;
		final Object this$errorReport = this.getErrorReport();
		final Object other$errorReport = other.getErrorReport();
		if (this$errorReport == null ? other$errorReport != null : !this$errorReport.equals(other$errorReport))
			return false;
		return true;
	}

	protected boolean canEqual(final Object other) {
		return other instanceof AnalysisActivityRepresentation;
	}

	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final Object $id = this.getId();
		result = result * PRIME + ($id == null ? 43 : $id.hashCode());
		final Object $state = this.getState();
		result = result * PRIME + ($state == null ? 43 : $state.hashCode());
		final Object $errorReport = this.getErrorReport();
		result = result * PRIME + ($errorReport == null ? 43 : $errorReport.hashCode());
		return result;
	}

	public String toString() {
		return "AnalysisActivityRepresentation(id=" + this.getId() + ", state=" + this.getState() + ", errorReport=" + this.getErrorReport() + ")";
	}
}

