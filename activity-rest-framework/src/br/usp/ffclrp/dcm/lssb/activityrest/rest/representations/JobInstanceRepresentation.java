package br.usp.ffclrp.dcm.lssb.activityrest.rest.representations;

import lombok.Data;

@Data
public class JobInstanceRepresentation {
	private final String id;
	private AnalysisActivityStateRepresentation state;
	private final String errorReport;
}

