/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterKind;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ParameterDescriptionImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ParameterDescriptionImpl#getParameterKind <em>Parameter Kind</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ParameterDescriptionImpl#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ParameterDescriptionImpl#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterDescriptionImpl extends MinimalEObjectImpl.Container implements ParameterDescription {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getParameterKind() <em>Parameter Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterKind()
	 * @generated
	 * @ordered
	 */
	protected static final ParameterKind PARAMETER_KIND_EDEFAULT = ParameterKind.SINGLE_VALUE;

	/**
	 * The cached value of the '{@link #getParameterKind() <em>Parameter Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterKind()
	 * @generated
	 * @ordered
	 */
	protected ParameterKind parameterKind = PARAMETER_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getParameterType() <em>Parameter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterType()
	 * @generated
	 * @ordered
	 */
	protected static final ParameterType PARAMETER_TYPE_EDEFAULT = ParameterType.STRING;

	/**
	 * The cached value of the '{@link #getParameterType() <em>Parameter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterType()
	 * @generated
	 * @ordered
	 */
	protected ParameterType parameterType = PARAMETER_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected EList<String> defaultValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisActivityDescriptionPackage.Literals.PARAMETER_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisActivityDescriptionPackage.PARAMETER_DESCRIPTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterKind getParameterKind() {
		return parameterKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterKind(ParameterKind newParameterKind) {
		ParameterKind oldParameterKind = parameterKind;
		parameterKind = newParameterKind == null ? PARAMETER_KIND_EDEFAULT : newParameterKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisActivityDescriptionPackage.PARAMETER_DESCRIPTION__PARAMETER_KIND, oldParameterKind, parameterKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType getParameterType() {
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterType(ParameterType newParameterType) {
		ParameterType oldParameterType = parameterType;
		parameterType = newParameterType == null ? PARAMETER_TYPE_EDEFAULT : newParameterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisActivityDescriptionPackage.PARAMETER_DESCRIPTION__PARAMETER_TYPE, oldParameterType, parameterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDefaultValue() {
		if (defaultValue == null) {
			defaultValue = new EDataTypeUniqueEList<String>(String.class, this, AnalysisActivityDescriptionPackage.PARAMETER_DESCRIPTION__DEFAULT_VALUE);
		}
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnalysisActivityDescriptionPackage.PARAMETER_DESCRIPTION__NAME:
				return getName();
			case AnalysisActivityDescriptionPackage.PARAMETER_DESCRIPTION__PARAMETER_KIND:
				return getParameterKind();
			case AnalysisActivityDescriptionPackage.PARAMETER_DESCRIPTION__PARAMETER_TYPE:
				return getParameterType();
			case AnalysisActivityDescriptionPackage.PARAMETER_DESCRIPTION__DEFAULT_VALUE:
				return getDefaultValue();
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
			case AnalysisActivityDescriptionPackage.PARAMETER_DESCRIPTION__NAME:
				setName((String)newValue);
				return;
			case AnalysisActivityDescriptionPackage.PARAMETER_DESCRIPTION__PARAMETER_KIND:
				setParameterKind((ParameterKind)newValue);
				return;
			case AnalysisActivityDescriptionPackage.PARAMETER_DESCRIPTION__PARAMETER_TYPE:
				setParameterType((ParameterType)newValue);
				return;
			case AnalysisActivityDescriptionPackage.PARAMETER_DESCRIPTION__DEFAULT_VALUE:
				getDefaultValue().clear();
				getDefaultValue().addAll((Collection<? extends String>)newValue);
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
			case AnalysisActivityDescriptionPackage.PARAMETER_DESCRIPTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AnalysisActivityDescriptionPackage.PARAMETER_DESCRIPTION__PARAMETER_KIND:
				setParameterKind(PARAMETER_KIND_EDEFAULT);
				return;
			case AnalysisActivityDescriptionPackage.PARAMETER_DESCRIPTION__PARAMETER_TYPE:
				setParameterType(PARAMETER_TYPE_EDEFAULT);
				return;
			case AnalysisActivityDescriptionPackage.PARAMETER_DESCRIPTION__DEFAULT_VALUE:
				getDefaultValue().clear();
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
			case AnalysisActivityDescriptionPackage.PARAMETER_DESCRIPTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AnalysisActivityDescriptionPackage.PARAMETER_DESCRIPTION__PARAMETER_KIND:
				return parameterKind != PARAMETER_KIND_EDEFAULT;
			case AnalysisActivityDescriptionPackage.PARAMETER_DESCRIPTION__PARAMETER_TYPE:
				return parameterType != PARAMETER_TYPE_EDEFAULT;
			case AnalysisActivityDescriptionPackage.PARAMETER_DESCRIPTION__DEFAULT_VALUE:
				return defaultValue != null && !defaultValue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", parameterKind: ");
		result.append(parameterKind);
		result.append(", parameterType: ");
		result.append(parameterType);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(')');
		return result.toString();
	}

} //ParameterDescriptionImpl
