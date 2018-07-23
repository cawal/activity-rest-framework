package br.usp.ffclrp.dcm.lssb.activityrest.rest.representations;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity;
import lombok.Data;

@Data
public class AnalysisActivityRepresentation {
	
	public AnalysisActivityRepresentation() {
	}
	
	public AnalysisActivityRepresentation(AnalysisActivity a, AnalysisActivityStateRepresentation state) {
		this.id = a.getId();
		this.state = state;
	}
	
	private String id;
	
	private AnalysisActivityStateRepresentation state;
	
	private String errorReport;
	
}
