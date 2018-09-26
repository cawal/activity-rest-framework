package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.util;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MultiplicityElement;

public class MultiplicityElementUtil {
	
	public static boolean acceptsList(MultiplicityElement element) {
		return element.getMaximumCardinality().intValue() == -1
				|| element.getMaximumCardinality().intValue() > 1;
	}
	
	public static boolean validCardinality(int cardinality, MultiplicityElement e) {
		boolean acceptedMinumum = (cardinality >= e.getMinimumCardinality().intValue()); 
		boolean isInfinityCardinality = (e.getMaximumCardinality().intValue() == -1);
		boolean acceptedMaximum = isInfinityCardinality 
				|| (cardinality >= e.getMaximumCardinality().intValue());
		boolean valid = acceptedMinumum && acceptedMaximum;
		
		return valid; 
	}
	
}
