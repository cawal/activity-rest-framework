/**
 */
package br.usp.ffclrp.dcm.lssb.activityrest.model.impl;

import br.usp.ffclrp.dcm.lssb.activityrest.model.ActivityPackage;
import br.usp.ffclrp.dcm.lssb.activityrest.model.ParameterMap;
import br.usp.ffclrp.dcm.lssb.activityrest.model.ValidationResult;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Parameter;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterKind;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.activityrest.model.impl.ParameterMapImpl#getDescriptions <em>Descriptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterMapImpl extends MinimalEObjectImpl.Container implements ParameterMap {
	/**
	 * The cached value of the '{@link #getDescriptions() <em>Descriptions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> descriptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityPackage.Literals.PARAMETER_MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getDescriptions() {
		if (descriptions == null) {
			descriptions = new EObjectResolvingEList<Parameter>(Parameter.class, this, ActivityPackage.PARAMETER_MAP__DESCRIPTIONS);
		}
		return descriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidationResult validateParameters(Map<String, Object> map) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidationResult validateParameter(String name, Object value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValues() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivityPackage.PARAMETER_MAP__DESCRIPTIONS:
				return getDescriptions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ActivityPackage.PARAMETER_MAP__DESCRIPTIONS:
				getDescriptions().clear();
				getDescriptions().addAll((Collection<? extends Parameter>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ActivityPackage.PARAMETER_MAP__DESCRIPTIONS:
				getDescriptions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ActivityPackage.PARAMETER_MAP__DESCRIPTIONS:
				return descriptions != null && !descriptions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ActivityPackage.PARAMETER_MAP___VALIDATE_PARAMETERS__MAP:
				return validateParameters((Map<String, Object>)arguments.get(0));
			case ActivityPackage.PARAMETER_MAP___VALIDATE_PARAMETER__STRING_OBJECT:
				return validateParameter((String)arguments.get(0), arguments.get(1));
			case ActivityPackage.PARAMETER_MAP___SET_DEFAULT_VALUES:
				setDefaultValues();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}
	
	
	
	@SuppressWarnings("unchecked")
	protected Object sanitize(ParameterDescription description, Object value) {
		boolean valueIsList = value instanceof List;
		ParameterKind expectedParameterKind = description.getParameterKind();
		
		if (!valueIsList 
				&& (expectedParameterKind == ParameterKind.LIST)){
			throw new Error();
			
		}
		
		List<Object> values = null;
		
		if(!valueIsList) {
			values = Arrays.asList(value);
		} else {
			values = (List<Object>)value;
		}
		
		List<Object> sanitizedList = (List<Object>) values.stream()
				.map(v -> sanitizeValueItem(description,v))
				.collect(Collectors.toList());
		
		
		
		if(expectedParameterKind == ParameterKind.LIST) {
			return sanitizedList;

		} else if (expectedParameterKind == ParameterKind.SINGLE_VALUE){
					
				if(sanitizedList.size() > 0) {
					return sanitizedList.get(0);
				} 
				return null;	
		
		} else {
			throw new Error();
		}
	}
	
//	private List<Object> sanitizeList(ParameterDescription description,
//			Object value) {
//		List<Object> list;
//		
//		if (value instanceof Collection) {
//			list = (List<Object>) ((Collection) value).stream()
//					.map(v -> sanitizeValueItem(description, v))
//					.filter(a -> a != null)
//					.collect(Collectors.toList());
//			
//		} else {
//			return Collections.emptyList();
//		}
//		
//		return list;
//	}
	
	private Object sanitizeValueItem(ParameterDescription description,
			Object value) {
				
		if (value == null) 
			return null; // nothing to do
			
		if (value instanceof Collection)
			return null; // should not be collection
		
		try {
			if (value instanceof String || value instanceof Number) {
				Object sanitized = null;
				switch (description.getParameterType()) {
				case INTEGER:
					sanitized = Integer.parseInt(value.toString());
					break;
					
				case REAL:
					sanitized = Double.parseDouble(value.toString());
					break;
					
				case STRING:
					sanitized = value;
					break;
				}
				
				return sanitized;
			} else {
				return null;
			}
		} catch (NumberFormatException nfe) {
			nfe.printStackTrace();
			return null;
		}
	}

} //ParameterMapImpl
