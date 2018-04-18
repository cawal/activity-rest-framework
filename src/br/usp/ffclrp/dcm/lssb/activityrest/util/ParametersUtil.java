package br.usp.ffclrp.dcm.lssb.activityrest.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity;
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
	
	
	public static Optional<Parameter> getParameterByName(AnalysisActivity aa, String name) {
		return aa.getParameters().stream()
				.filter(p -> p.getName().equalsIgnoreCase(name))
				.findFirst();
	}
	
	public static boolean setParametersFromMap(AnalysisActivity aa, Map<String,Object> map) {
		for(String parameterName : map.keySet()) {
			Optional<Parameter> pOpt = ParametersUtil.getParameterByName(aa,parameterName);
			if(! pOpt.isPresent()) {
				return false;
			} else {
				Parameter p = pOpt.get();
				Object value = null;
				switch (p.getDescription().getParameterKind()) {
				case SINGLE_VALUE:
					value = map.get(parameterName);
					if (value instanceof String) {
						p.getValues().clear();
						p.getValues().add((String) value);
						
					} else if (value == null) {
						p.getValues().clear();
						
					} else {
						return false;
					}
					
					break;
				case LIST:
					value = map.get(parameterName);
					
					if (value instanceof List) {
						List<? extends String> values =
								(List<? extends String>) value;
						p.getValues().clear();
						p.getValues().addAll(values);
						
					} else {
						return false;
					}
					
					break;
				}
				
				System.out.println(map.get(parameterName));
			}
			
		}
		
		return true;
	}
	
}
