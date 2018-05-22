package br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.parameters;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription;

public class IllegalParameterException extends Exception {
	
	/**
	   * 
	   */
	private static final long serialVersionUID = 1L;
	
	private final String parameterName;
	private final Object newValue;
	
	public IllegalParameterException(String parameterName, Object newValue) {
		this.parameterName = parameterName;
		this.newValue = newValue;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public String getParameterName() {
		return parameterName;
	}
	
	public Object getNewValue() {
		return newValue;
	}
	
}
