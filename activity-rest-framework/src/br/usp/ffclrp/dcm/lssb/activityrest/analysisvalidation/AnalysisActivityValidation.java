package br.usp.ffclrp.dcm.lssb.activityrest.analysisvalidation;

import java.util.Collection;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetConstraint;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetDescription;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MaximunDatasetCardinalityConstraint;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MaximunParameterCardinalityConstraint;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MinimunDatasetCardinalityConstraint;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MinimunParameterCardinalityConstraint;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterConstraint;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ReadinessConstraint;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Dataset;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Parameter;

// TODO Refactor the validation engine
public class AnalysisActivityValidation {
	
	/**
	 * 
	 * @param aa
	 * @return true if all known readiness constraints are valid.
	 *         false otherwise (state should be CREATED)
	 */
	public static boolean isReady(AnalysisActivity aa) {
		
		for (ReadinessConstraint c : aa.getDescription()
				.getReadinessContraints()) {
			if (c instanceof DatasetConstraint) {
				DatasetDescription dp = ((DatasetConstraint) c).getDataset();
				Dataset dataset = aa.inputDatasetForName(dp.getName());
				
				if (!isReadyDataset(dataset, (DatasetConstraint) c))
					return false;
			}
			
			if (c instanceof ParameterConstraint) {
				System.out.println(c.toString());
				ParameterDescription pp =
						((ParameterConstraint) c).getParameter();
				Object value = aa.getParameters().get(pp.getName());
				
				if (!isReadyParameter(value, (ParameterConstraint) c))
					return false;
			}
		}
		
		return true;
		
	}
	
	private static boolean isReadyParameter(Object value,
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
	
}
