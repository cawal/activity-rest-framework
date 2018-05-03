package br.usp.ffclrp.dcm.lssb.activityrest.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import br.usp.ffclrp.dcm.lssb.activityrest.exceptions.IllegalParameterException;
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
	
	public static void setParametersFromMap(AnalysisActivity aa, Map<String,Object> map) 
			throws IllegalParameterException {
		for(String parameterName : map.keySet()) {
			if(parameterName == null) System.out.println("ParameterName is null!!!!");
				
			Optional<Parameter> pOpt = ParametersUtil.getParameterByName(aa,parameterName);
			if(! pOpt.isPresent()) {
				System.out.println("Parameter \"" + parameterName + "\" not exists!:");
				throw new IllegalParameterException(parameterName,map.get(parameterName));
			} else {
				Parameter p = pOpt.get();
				Object value = null;
				
				p.setValue(map.get(p.getName()));
				
				switch (p.getDescription().getParameterKind()) {
				case SINGLE_VALUE:
					value = map.get(parameterName);
					if (value instanceof Collection ) {
						throw new IllegalParameterException(parameterName,map.get(parameterName));
						
					} else {
							p.getValues().clear();
							if(value instanceof String) {
								p.getValues().add((String) value);
							} else {
								p.getValues().add(Integer.toString(value));
							}
					}
					
					break;
					
				case LIST:
					value = map.get(parameterName);
					
					if (value instanceof List) {
						List<? extends String> values = new ArrayList<>();
						values.addAll((List)value);
						p.getValues().clear();
						p.getValues().addAll(values);
						
					} else {
						System.out.println("Should be list: " + parameterName);
						throw new IllegalParameterException(parameterName,map.get(parameterName));
					}
					
					break;
				}
				
				System.out.println(map.get(parameterName));
			}
			
		}
	}
	
}
