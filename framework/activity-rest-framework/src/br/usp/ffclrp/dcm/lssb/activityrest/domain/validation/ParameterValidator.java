package br.usp.ffclrp.dcm.lssb.activityrest.domain.validation;

import br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.ParameterMap;

public interface ParameterValidator {
	
	 public ValidationResult validate(
			 String parameterName, 
			 ParameterMap newValues, 
			 AnalysisActivity activityInstance);
	
}
