package br.usp.ffclrp.dcm.lssb.activityrest.domain.validation;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Constraint;

public class InputDatasetValidatorNotFoundException extends Exception {
	
	Constraint c;

	public InputDatasetValidatorNotFoundException(Constraint c) {
		this.c = c;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public String getMessage() {
		return "Parameter validator for constraint '"+c.getName()+" not found!";
	}
	
}
