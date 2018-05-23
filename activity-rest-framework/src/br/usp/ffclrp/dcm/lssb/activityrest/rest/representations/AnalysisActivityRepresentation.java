package br.usp.ffclrp.dcm.lssb.activityrest.rest.representations;

import lombok.Data;

@Data
public class AnalysisActivityRepresentation {
	
	private String id;
	
	private AnalysisActivityState state;
	
}
