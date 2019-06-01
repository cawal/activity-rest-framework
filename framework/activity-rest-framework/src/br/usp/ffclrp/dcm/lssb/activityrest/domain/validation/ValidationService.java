package br.usp.ffclrp.dcm.lssb.activityrest.domain.validation;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.Dataset;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.ParameterMap;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.util.MultiplicityElementUtil;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Constraint;
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
			) throws ParameterValidatorNotFoundException {
		
		// foreach parameter, get the constraints an apply
		// returns false 
		ParameterMap parameters = activityInstance.getParameters();
		
		for(String key : parameters.keySet()) {
			Optional<Parameter> parameterDescriptionOp = parameterDescriptions.stream()
					.filter(d -> d.getName().equals(key))
					.findFirst();

			
			Parameter description = parameterDescriptionOp.get();
			List<Constraint> constraints = description.getConstraints();
			
			for(Constraint c : constraints) {
				ParameterValidator v = parameterValidators.get(c.getName());
				
				if(v == null) {
					throw new ParameterValidatorNotFoundException(c);
				}
				
				ValidationResult validationResult = 
						v.validate(key, parameters, activityInstance);
				if(!validationResult.isValid()) {
					return validationResult;
				}
			}
			
		}
		
		return new ValidationResult(true, Optional.empty());
	}

	public static ValidationResult validateInputDatasets(
			AnalysisActivity activityInstance,
			List<InputDataset> datasetDescriptions,
			Map<String,InputDatasetValidator> inputDatasetValidators
			) throws InputDatasetValidatorNotFoundException {
		
			
		//TODO write the new validation process 
		for(Dataset d : activityInstance.getInputs()) {
			ValidationResult datasetResult = 
					validateInputDataset(d, activityInstance, 
							datasetDescriptions, inputDatasetValidators);
			if(!datasetResult.isValid()) {
				return datasetResult;
			} else {
				continue;
			}
		}
		
		
		return new ValidationResult(true, Optional.empty());
	}
	
	public static ValidationResult validateInputDataset(
			Dataset inputDataset,
			AnalysisActivity activityInstance,
			List<InputDataset> datasetDescriptions,
			Map<String,InputDatasetValidator> validators
			) throws InputDatasetValidatorNotFoundException {

		String datasetName = inputDataset.getName();
		
		Optional<InputDataset> descriptionOp = datasetDescriptions.stream()
			.filter(d -> d.getName().equalsIgnoreCase(datasetName))
			.findFirst();
		
		InputDataset description = descriptionOp.get();
		List<Constraint> constraints = description.getConstraints();
		
		for(Constraint c : constraints) {
			InputDatasetValidator v = validators.get(c.getName());
			
			if(v == null) {
				throw new InputDatasetValidatorNotFoundException(c);
			}
			
			ValidationResult validationResult = 
					v.validate(inputDataset, activityInstance);
			if(!validationResult.isValid()) {
				return validationResult;
			}
		}
			
		return new ValidationResult(true, Optional.empty());
	}
	
}
