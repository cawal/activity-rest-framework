package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.util;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MultiplicityElement;

public class MultiplicityElementUtil {
	
	public static boolean acceptsList(MultiplicityElement element) {
		return element.getMaximumCardinality().intValue() == -1
				|| element.getMaximumCardinality().intValue() > 1;
	}
	
}
