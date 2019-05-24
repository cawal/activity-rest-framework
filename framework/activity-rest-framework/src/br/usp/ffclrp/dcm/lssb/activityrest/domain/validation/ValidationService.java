package br.usp.ffclrp.dcm.lssb.activityrest.domain.validation;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.util.MultiplicityElementUtil;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.InputDataset;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Parameter;

// TODO Refactor the validation engine to include other constraints
public class ValidationService {
	
	/**
	 * 
	 * @param aa
	 * @return true if all known readiness constraints are valid.
	 *         false otherwise (state should be CREATED)
	 */
	public static boolean isReady(AnalysisActivity aa) {
		

		boolean parametersReady = aa.getDescription().getParameters().stream()
				.allMatch(d -> {
					Object p = aa.getParameters().get(d.getName());
					
					if(p instanceof List) {
						List l = (List) p; 
						return MultiplicityElementUtil.validCardinality(l.size(), d);
					} else if (p != null) {
						return MultiplicityElementUtil.validCardinality(1, d);
					} else {
						return false;
					}
				});
		
		boolean inputsReady = aa.getInputs().stream().allMatch(d -> { 
			int cardinality = d.getFiles().size();
			return MultiplicityElementUtil.validCardinality(cardinality,d.getDescription()); 
		});
		
		return parametersReady && inputsReady;
		

		
	}
	
	public static ValidationResult validateParameters(
			AnalysisActivity activityInstance,
			List<Parameter> parameterDescriptions,
			Map<String,ParameterValidator> parameterValidators
			) {
		
		//TODO write the new validation process 
		
		return new ValidationResult(true, Optional.empty());
	}

	public static ValidationResult validateInputDatasets(
			AnalysisActivity activityInstance,
			List<InputDataset> datasetDescription,
			Map<String,InputDatasetValidator> inputDatasetValidators
			) {
		
			
		//TODO write the new validation process 
		
		return new ValidationResult(true, Optional.empty());
	}
	
}
