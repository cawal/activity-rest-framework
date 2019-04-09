package br.usp.ffclrp.dcm.lssb.activityrest.rest.representations;

import lombok.Data;

@Data
public class AnalysisActivityRepresentation {
	private final String id;
	private final AnalysisActivityStateRepresentation state;
	private String errorReport;
}

