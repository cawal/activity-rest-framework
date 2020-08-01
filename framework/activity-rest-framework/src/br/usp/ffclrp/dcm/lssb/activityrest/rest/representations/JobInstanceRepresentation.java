package br.usp.ffclrp.dcm.lssb.activityrest.rest.representations;

import java.util.List;

public class JobInstanceRepresentation {
	private final String id;
	private AnalysisActivityStateRepresentation state;
	private final String errorReport;
	private final List<LinkRepresentation> links;

	public JobInstanceRepresentation(String id, String errorReport, List<LinkRepresentation> links) {
		this.id = id;
		this.errorReport = errorReport;
		this.links = links;
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

	public List<LinkRepresentation> getLinks() {
		return this.links;
	}

	public void setState(AnalysisActivityStateRepresentation state) {
		this.state = state;
	}

	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof JobInstanceRepresentation))
			return false;
		final JobInstanceRepresentation other = (JobInstanceRepresentation) o;
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
		final Object this$links = this.getLinks();
		final Object other$links = other.getLinks();
		if (this$links == null ? other$links != null : !this$links.equals(other$links)) return false;
		return true;
	}

	protected boolean canEqual(final Object other) {
		return other instanceof JobInstanceRepresentation;
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
		final Object $links = this.getLinks();
		result = result * PRIME + ($links == null ? 43 : $links.hashCode());
		return result;
	}

	public String toString() {
		return "JobInstanceRepresentation(id=" + this.getId() + ", state=" + this.getState() + ", errorReport=" + this.getErrorReport() + ", links=" + this.getLinks() + ")";
	}
}

