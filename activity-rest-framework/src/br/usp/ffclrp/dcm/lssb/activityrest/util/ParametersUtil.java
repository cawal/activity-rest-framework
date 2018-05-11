package br.usp.ffclrp.dcm.lssb.activityrest.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Parameter;

public class ParametersUtil {
	
	public static Map<String, Object> toMap(List<Parameter> parameterList) {
		Map<String, Object> map = new HashMap<>();
		
		for (Parameter p : parameterList) {
			switch (p.getDescription().getParameterKind()) {
			case SINGLE_VALUE:
				if(p.getValues().size() > 0) {
					map.put(p.getName(), p.getValues().get(0));
				} else {
					map.put(p.getName(), null);
				}
				break;
			case LIST:
				map.put(p.getName(), p.getValues());
				break;
			}
		}
		return map;
	}
	
	public static Map<String, Object> parameterDescriptionsToMap(
			List<ParameterDescription> descriptionList) {
		Map<String, Object> map = new HashMap<>();
		
		for (ParameterDescription p : descriptionList) {
			switch (p.getParameterKind()) {
			case SINGLE_VALUE:
				if(p.getDefaultValue().size() > 0) {
					map.put(p.getName(), p.getDefaultValue().get(0));
				} else {
					map.put(p.getName(), null);
				}
				break;
			case LIST:
				map.put(p.getName(), p.getDefaultValue());
				break;
			}
		}
		return map;
	}
	
}
