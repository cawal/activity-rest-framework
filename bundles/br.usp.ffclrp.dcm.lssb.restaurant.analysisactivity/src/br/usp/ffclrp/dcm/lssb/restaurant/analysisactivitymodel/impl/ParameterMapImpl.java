/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.impl;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivityModelFactory;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivityModelPackage;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.ParameterMap;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.ValidationResult;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
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
 * <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.impl.ParameterMapImpl#getDescriptions
 * <em>Descriptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterMapImpl extends MinimalEObjectImpl.Container
		implements ParameterMap {
	/**
	 * The cached value of the '{@link #getDescriptions()
	 * <em>Descriptions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterDescription> descriptions;
	Map<String, Object> m;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ParameterMapImpl() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisActivityModelPackage.Literals.PARAMETER_MAP;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ParameterDescription> getDescriptions() {
		if (descriptions == null) {
			descriptions = new EObjectResolvingEList<ParameterDescription>(
					ParameterDescription.class, this,
					AnalysisActivityModelPackage.PARAMETER_MAP__DESCRIPTIONS);
		}
		return descriptions;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->=
	 */
	public ValidationResult validateParameters(Map<String, Object> map) {
		
		List<ValidationResult> individualResults = 
				map.entrySet().stream()
					.map(e -> this.validateParameter(e.getKey(),e.getValue()))
					.collect(Collectors.toList());
		
		ValidationResult r =
				AnalysisActivityModelFactory.eINSTANCE.createValidationResult();
		
		r.setIsValid(true);
		
		
		return r;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@SuppressWarnings("serial")
	public ValidationResult validateParameter(String name, Object value) {
		return false;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AnalysisActivityModelPackage.PARAMETER_MAP__DESCRIPTIONS:
			return getDescriptions();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AnalysisActivityModelPackage.PARAMETER_MAP__DESCRIPTIONS:
			getDescriptions().clear();
			getDescriptions().addAll(
					(Collection<? extends ParameterDescription>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case AnalysisActivityModelPackage.PARAMETER_MAP__DESCRIPTIONS:
			getDescriptions().clear();
			return;
		}
		super.eUnset(featureID);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case AnalysisActivityModelPackage.PARAMETER_MAP__DESCRIPTIONS:
			return descriptions != null && !descriptions.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
		case AnalysisActivityModelPackage.PARAMETER_MAP___VALIDATE_PARAMETERS__MAP:
			return validateParameters((Map<String, Object>) arguments.get(0));
		case AnalysisActivityModelPackage.PARAMETER_MAP___VALIDATE_PARAMETER__STRING_OBJECT:
			return validateParameter((String) arguments.get(0),
					arguments.get(1));
		case AnalysisActivityModelPackage.PARAMETER_MAP___SET_DEFAULT_VALUES:
			setDefaultValues();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}
	
	@Override
	public void clear() {
		m.clear();
		setDefaultValues();
	}
	
	@Override
	public boolean containsKey(Object key) {
		return m.containsKey(key);
	}
	
	@Override
	public boolean containsValue(Object value) {
		return m.containsValue(value);
	}
	
	@Override
	public Set<Entry<String, Object>> entrySet() {
		return m.entrySet();
	}
	
	@Override
	public Object get(Object arg0) {
		return m.get(arg0);
	}
	
	@Override
	public boolean isEmpty() {
		return m.isEmpty();
	}
	
	@Override
	public Set<String> keySet() {
		return m.keySet();
	}
	
	@Override
	public Object put(String key, Object value) {
		Optional<ParameterDescription> description =
				this.getDescriptions().stream()
						.filter(d -> d.getName().equalsIgnoreCase(key))
						.findFirst();
		
		if (!description.isPresent())
			return null;
		
		return m.put(key, sanitize(description.get(), value));
	}
	
	@Override
	public void putAll(Map<? extends String, ? extends Object> map) {
		map.entrySet().stream()
				.forEach(e -> this.put(e.getKey(), e.getValue()));
	}
	
	@Override
	public Object remove(Object value) {
		return m.remove(value);
	}
	
	@Override
	public int size() {
		return m.size();
	}
	
	@Override
	public Collection<Object> values() {
		return m.values();
	}
	
	public void setDefaultValues() {
		this.m.clear();
		for (ParameterDescription d : this.getDescriptions()) {
			this.put(d.getName(), sanitize(d, d.getDefaultValue()));
		}
	}
	
	protected Object sanitize(ParameterDescription description, Object value) {
		switch (description.getParameterKind()) {
		case LIST:
			return sanitizeList(description, value);
		
		case SINGLE_VALUE:
			return sanitizeSingleValue(description, value);
		
		default:
			return null;
		}
	}
	
	private Object sanitizeSingleValue(ParameterDescription description,
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
					
				case REAL:
					sanitized = Double.parseDouble(value.toString());
					
				case STRING:
					sanitized = value;
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
	
	private Object sanitizeList(ParameterDescription description,
			Object value) {
		List<Object> list;
		
		if (value instanceof Collection) {
			list = (List<Object>) ((Collection) value).stream()
					.map(v -> sanitizeSingleValue(description, v))
					.filter(a -> a != null)
					.collect(Collectors.toList());
			
		} else {
			return Collections.emptyList();
		}
		
		return list;
	}
	
} // ParameterMapImpl
