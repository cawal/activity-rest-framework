package br.usp.ffclrp.dcm.lssb.activityrest.rest.representations;

import lombok.Data;

@Data
public class FileRepresentation {
	private String name;
	private byte[] content;
}
