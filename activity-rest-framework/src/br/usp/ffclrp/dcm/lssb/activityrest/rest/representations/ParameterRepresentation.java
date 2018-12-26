package br.usp.ffclrp.dcm.lssb.activityrest.rest.representations;

import java.util.List;

import lombok.Data;

@Data
public class ParameterRepresentation {
	private final String name;
	private final List<Object> value;
}

