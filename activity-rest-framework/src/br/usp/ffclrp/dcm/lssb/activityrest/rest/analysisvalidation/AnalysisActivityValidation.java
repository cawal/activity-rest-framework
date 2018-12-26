package br.usp.ffclrp.dcm.lssb.activityrest.rest.analysisvalidation;

import java.util.List;

import br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.util.MultiplicityElementUtil;

// TODO Refactor the validation engine to include other constraints
public class AnalysisActivityValidation {
	
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
		
		/*for (ReadinessConstraint c : aa.getDescription()
				.getReadinessContraints()) {
			if (c instanceof DatasetConstraint) {
				DatasetDescription dp = ((DatasetConstraint) c).getDataset();
				Dataset dataset = aa.inputDatasetForName(dp.getName());
				
				if (!isReadyDataset(dataset, (DatasetConstraint) c))
					return false;
			}
			
			if (c instanceof ParameterConstraint) {
				ParameterDescription pp =
						((ParameterConstraint) c).getParameter();
				Object value = aa.getParameters().get(pp.getName());
				
				if (!isReadyParameter(value, (ParameterConstraint) c))
					return false;
			}
		}
		
		return true;*/
		
	}
	
/*	private static boolean isReadyParameter(Object value,
			ParameterConstraint c) {
		if(value instanceof Collection<?>) {
			if (c instanceof MinimunParameterCardinalityConstraint) {
				return ((Collection<?>)value).size() 
						>= ((MinimunParameterCardinalityConstraint) c)
								.getValue()
								.intValue();
				
			} else if (c instanceof MaximunParameterCardinalityConstraint) {
				return ((Collection<?>)value).size() 
						<= ((MaximunParameterCardinalityConstraint) c)
								.getValue()
								.intValue();
			}
		} else {
			return value != null;
		}
		
		return false;
	}
	
	private static boolean isReadyDataset(Dataset dataset,
			DatasetConstraint c) {
		if (c instanceof MinimunDatasetCardinalityConstraint) {
			return dataset.getFiles()
					.size() >= ((MinimunDatasetCardinalityConstraint) c)
							.getValue()
							.intValue();
			
		} else if (c instanceof MaximunDatasetCardinalityConstraint) {
			return dataset.getFiles()
					.size() <= ((MaximunDatasetCardinalityConstraint) c)
							.getValue()
							.intValue();
		}
		
		return false;
	}
	*/
}
