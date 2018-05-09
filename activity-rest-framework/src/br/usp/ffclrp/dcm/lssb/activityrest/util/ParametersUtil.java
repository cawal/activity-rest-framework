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

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.exceptions.ParameterUpdateException;

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
		System.out.println("MAP");
		System.out.println(map);
		for(String parameterName : map.keySet()) {
			if(parameterName == null) System.out.println("Parameter name is null!!!!");
				
			Optional<Parameter> pOpt = ParametersUtil.getParameterByName(aa,parameterName);
			if(! pOpt.isPresent()) {
				System.out.println("Parameter \"" + parameterName + "\" not exists!:");
				throw new IllegalParameterException(parameterName,map.get(parameterName));
			} else {
				
				Parameter p = pOpt.get();
				Object value = map.get(p.getName());
				
				try {
					System.out.println("chamando checkandset value");
					p.checkAndSetValues(value);
				} catch (ParameterUpdateException e) {
					System.out.println("HERE");
					e.printStackTrace();
					throw new IllegalParameterException(p.getName(), value);
				}
				
				System.out.println(map.get(parameterName));
			}
			
		}
	}
	
}
