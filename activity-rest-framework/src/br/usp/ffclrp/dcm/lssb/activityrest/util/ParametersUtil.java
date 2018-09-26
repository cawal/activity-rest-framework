package br.usp.ffclrp.dcm.lssb.activityrest.util;

import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterKind;

public class ParametersUtil {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	static public <A> boolean isValidValue(EList<A> value, ParameterDescription description) {
		return isValidListValue(value, description);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * d
	 */
	@SuppressWarnings("unchecked")
	static public <A> boolean isValidValue(A value, ParameterDescription description) {
		if(value instanceof List) {
			return isValidListValue((List) value, description);
		} else {
			List<A> list = new BasicEList<>();
			list.add(value);
			return isValidListValue(list, description);
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	static public <A> boolean isValidValue(List<A> value, ParameterDescription description) {
		return isValidListValue(value, description);
	}

	static private <A> Boolean isValidListValue(List<A> values, ParameterDescription description) {
		boolean isValid = true;
		
		isValid = isValid && checkSize(values, description);
		isValid = isValid && checkAssignability(values, description);
		
		return isValid;
	}
	
	static private <A> boolean checkSize(List<A> values, ParameterDescription description) {
		return (description.getParameterKind() == ParameterKind.SINGLE_VALUE)?
				values.size() == 0 || values.size() == 1 
				: true;  
	}
	
	static private <A> boolean checkAssignability(List<A> values, ParameterDescription description) {
		boolean isAssignable = true;
		switch (description.getParameterType()) {
		case STRING:
			isAssignable = values.stream().allMatch(a -> a instanceof String);
			break;
		case INTEGER:
			isAssignable = allElementsAreInteger(values);
			break;
		case REAL:
			isAssignable = allElementsAreReal(values);
			break;
		}
		
		return isAssignable;
	}
	
	static private <A> boolean allElementsAreInteger(List<A> values) {
		try {
			// Lists can not have primitive values as its items
			// if can create a Integer instance w/o exceptions, is  a integer
			return values.stream().allMatch(i -> {
				return (i instanceof Integer) 
						|| (i instanceof String && representsInteger((String) i));
			});
		} catch (NumberFormatException | ClassCastException e) {
			return false;
		}
		
	}

	static private boolean representsInteger(String i) {
		try {
			// if can create a Integer instance w/o exceptions, 
			// it is  a integer in a string
			new Integer(i);
			return true;
		} catch (NumberFormatException | ClassCastException e) {
			return false;
		}
	}
	
	static private <A> boolean allElementsAreReal(List<A> values) {
		try {
			// Lists can not have primitive values as its items
			// if can create a Integer instance w/o exceptions, is  a integer
			return values.stream().allMatch(i -> {
				return (i instanceof Double) 
						|| (i instanceof String && representsDouble((String) i));
			});
		} catch (NumberFormatException | ClassCastException e) {
			return false;
		}
		
	}

	static private boolean representsDouble(String i) {
		try {
			// if can create a Integer instance w/o exceptions, 
			// it is  a integer in a string
			new Double(i);
			return true;
		} catch (NumberFormatException | ClassCastException e) {
			return false;
		}
	}
	
}
