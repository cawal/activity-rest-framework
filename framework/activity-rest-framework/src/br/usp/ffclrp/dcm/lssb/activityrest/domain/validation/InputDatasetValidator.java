package br.usp.ffclrp.dcm.lssb.activityrest.domain.validation;

import br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.Dataset;

public interface InputDatasetValidator {
	
	public ValidationResult validate(
			Dataset dataset,
			AnalysisActivity activityInstance);
	
}
