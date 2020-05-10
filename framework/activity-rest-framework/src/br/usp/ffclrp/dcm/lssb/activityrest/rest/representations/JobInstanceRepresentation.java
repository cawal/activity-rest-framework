package br.usp.ffclrp.dcm.lssb.activityrest.rest.representations;

import java.util.List;

import javax.ws.rs.core.Link;

import lombok.Data;

@Data
public class JobInstanceRepresentation {
	private final String id;
	private AnalysisActivityStateRepresentation state;
	private final String errorReport;
	private final List<LinkRepresentation> links;
}

