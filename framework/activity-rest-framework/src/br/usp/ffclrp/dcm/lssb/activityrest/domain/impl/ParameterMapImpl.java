/**
 */
package br.usp.ffclrp.dcm.lssb.activityrest.domain.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collection;
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

import br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivityModelFactory;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivityModelPackage;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.ParameterMap;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.ValidationResult;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.util.MultiplicityElementUtil;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.ParameterMapImpl#getDescriptions
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
	protected EList<Parameter> descriptions;
	Map<String, Object> internalMap;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 *
	 **/
	protected ParameterMapImpl() {
		super();
		this.internalMap = new HashMap<String, Object>();
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
	public EList<Parameter> getDescriptions() {
		if (descriptions == null) {
			descriptions = new EObjectResolvingEList<Parameter>(Parameter.class,
					this,
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
						.map(e -> this.validateParameter(e.getKey(),
								e.getValue()))
						.collect(Collectors.toList());
		
		ValidationResult r =
				AnalysisActivityModelFactory.eINSTANCE.createValidationResult();
		
		r.setIsValid(individualResults.stream().allMatch(i -> i.getIsValid()));
		
		for (ValidationResult i : individualResults) {
			for (String key : i.getInvalidValues().keySet()) {
				r.getInvalidValues().put(key, i.getInvalidValues().get(key));
			}
		}
		
		return r;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ValidationResult validateParameter(String name, Object value) {
		ValidationResult valResult =
				AnalysisActivityModelFactory.eINSTANCE.createValidationResult();
		
		// TODO validate
		valResult.setIsValid(true);
		
		return valResult;
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
			getDescriptions()
					.addAll((Collection<? extends Parameter>) newValue);
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
		internalMap.clear();
		setDefaultValues();
	}
	
	@Override
	public boolean containsKey(Object key) {
		return internalMap.containsKey(key);
	}
	
	@Override
	public boolean containsValue(Object value) {
		return internalMap.containsValue(value);
	}
	
	@Override
	public Set<Entry<String, Object>> entrySet() {
		return internalMap.entrySet();
	}
	
	@Override
	public Object get(Object arg0) {
		return internalMap.get(arg0);
	}
	
	@Override
	public boolean isEmpty() {
		return internalMap.isEmpty();
	}
	
	@Override
	public Set<String> keySet() {
		return internalMap.keySet();
	}
	
	@Override
	public Object put(String key, Object value) {
		Optional<Parameter> description =
				this.getDescriptions().stream()
						.filter(d -> d.getName().equalsIgnoreCase(key))
						.findFirst();
		
		if (!description.isPresent())
			return null;
		
		Object sanitizedValue = sanitize(description.get(), value);
		return internalMap.put(key, sanitizedValue);
	}
	
	@Override
	public void putAll(Map<? extends String, ? extends Object> map) {
		map.entrySet().stream()
				.forEach(e -> this.put(e.getKey(), e.getValue()));
	}
	
	@Override
	public Object remove(Object value) {
		return internalMap.remove(value);
	}
	
	@Override
	public int size() {
		return internalMap.size();
	}
	
	@Override
	public Collection<Object> values() {
		return internalMap.values();
	}
	
	public void setDefaultValues() {
		this.internalMap.clear();
		for (Parameter d : this.getDescriptions()) {
			this.put(d.getName(), sanitize(d, d.getDefaultValue()));
		}
	}
	
	@SuppressWarnings("unchecked")
	protected Object sanitize(Parameter description, Object value) {
		boolean valueIsList = value instanceof List;
		boolean expectList = MultiplicityElementUtil.acceptsList(description);
		if (!valueIsList && expectList) {
			throw new Error();
		}
		
		List<Object> values = null;
		
		if (!valueIsList) {
			values = Arrays.asList(value);
		} else {
			values = (List<Object>) value;
		}
		
		List<Object> sanitizedList = (List<Object>) values.stream()
				.map(v -> sanitizeValueItem(description, v))
				.collect(Collectors.toList());
		
		if (expectList) {
			return sanitizedList;
			
		} else {
			
			if (sanitizedList.size() > 0) {
				return sanitizedList.get(0);
			}
			return null;
			
		}
	}
	
	// private List<Object> sanitizeList(Parameter description,
	// Object value) {
	// List<Object> list;
	//
	// if (value instanceof Collection) {
	// list = (List<Object>) ((Collection) value).stream()
	// .map(v -> sanitizeValueItem(description, v))
	// .filter(a -> a != null)
	// .collect(Collectors.toList());
	//
	// } else {
	// return Collections.emptyList();
	// }
	//
	// return list;
	// }
	
	private Object sanitizeValueItem(Parameter description,
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
	
} // ParameterMapImpl
