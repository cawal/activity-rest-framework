package br.usp.ffclrp.dcm.lssb.activityrest.rest.representations;

import java.util.List;

import lombok.Data;

@Data
public class ParameterRepresentation {
	private String name;
	private List<Object> value;
}
