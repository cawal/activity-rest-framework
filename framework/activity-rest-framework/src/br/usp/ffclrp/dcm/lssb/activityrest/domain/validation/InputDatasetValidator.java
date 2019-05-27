package br.usp.ffclrp.dcm.lssb.activityrest.domain.validation;

import java.io.File;

import br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Dataset;

public interface InputDatasetValidator {
	
	public ValidationResult validate(
			Dataset dataset,
			AnalysisActivity activityInstance);
	
}
