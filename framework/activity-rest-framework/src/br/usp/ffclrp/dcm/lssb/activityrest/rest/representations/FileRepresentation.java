package br.usp.ffclrp.dcm.lssb.activityrest.rest.representations;

import lombok.Data;

@Data
public class FileRepresentation {
	private final String name;
	private final String content;
	private final String contentType;
}

