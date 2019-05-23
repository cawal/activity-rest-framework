package br.usp.ffclrp.dcm.lssb.activityrest.domain.validation;

import java.io.File;

import br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity;

public interface InputDatasetValidator {
	
	public ValidationResult validate(
			File newFile, 
			AnalysisActivity activityInstance);
	
}
