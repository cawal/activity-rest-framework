package br.usp.ffclrp.dcm.lssb.activityrest.rest.representations;

import lombok.Data;

@Data
public class JobInstanceRepresentation {
	private String id;
	private AnalysisActivityStateRepresentation state;
	private String errorReport;
}
