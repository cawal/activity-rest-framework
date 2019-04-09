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
		

		
	}
	

}
