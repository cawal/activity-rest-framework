/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Parameter;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterConstraint;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ParameterImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ParameterImpl#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ParameterImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ParameterImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends MultiplicityElementImpl implements Parameter {
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
	 * The default value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected static final String REMARKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected String remarks = REMARKS_EDEFAULT;

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
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterConstraint> constraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisActivityDescriptionPackage.Literals.PARAMETER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisActivityDescriptionPackage.PARAMETER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemarks(String newRemarks) {
		String oldRemarks = remarks;
		remarks = newRemarks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisActivityDescriptionPackage.PARAMETER__REMARKS, oldRemarks, remarks));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisActivityDescriptionPackage.PARAMETER__PARAMETER_TYPE, oldParameterType, parameterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDefaultValue() {
		if (defaultValue == null) {
			defaultValue = new EDataTypeUniqueEList<String>(String.class, this, AnalysisActivityDescriptionPackage.PARAMETER__DEFAULT_VALUE);
		}
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterConstraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<ParameterConstraint>(ParameterConstraint.class, this, AnalysisActivityDescriptionPackage.PARAMETER__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnalysisActivityDescriptionPackage.PARAMETER__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnalysisActivityDescriptionPackage.PARAMETER__NAME:
				return getName();
			case AnalysisActivityDescriptionPackage.PARAMETER__REMARKS:
				return getRemarks();
			case AnalysisActivityDescriptionPackage.PARAMETER__PARAMETER_TYPE:
				return getParameterType();
			case AnalysisActivityDescriptionPackage.PARAMETER__DEFAULT_VALUE:
				return getDefaultValue();
			case AnalysisActivityDescriptionPackage.PARAMETER__CONSTRAINTS:
				return getConstraints();
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
			case AnalysisActivityDescriptionPackage.PARAMETER__NAME:
				setName((String)newValue);
				return;
			case AnalysisActivityDescriptionPackage.PARAMETER__REMARKS:
				setRemarks((String)newValue);
				return;
			case AnalysisActivityDescriptionPackage.PARAMETER__PARAMETER_TYPE:
				setParameterType((ParameterType)newValue);
				return;
			case AnalysisActivityDescriptionPackage.PARAMETER__DEFAULT_VALUE:
				getDefaultValue().clear();
				getDefaultValue().addAll((Collection<? extends String>)newValue);
				return;
			case AnalysisActivityDescriptionPackage.PARAMETER__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends ParameterConstraint>)newValue);
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
			case AnalysisActivityDescriptionPackage.PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AnalysisActivityDescriptionPackage.PARAMETER__REMARKS:
				setRemarks(REMARKS_EDEFAULT);
				return;
			case AnalysisActivityDescriptionPackage.PARAMETER__PARAMETER_TYPE:
				setParameterType(PARAMETER_TYPE_EDEFAULT);
				return;
			case AnalysisActivityDescriptionPackage.PARAMETER__DEFAULT_VALUE:
				getDefaultValue().clear();
				return;
			case AnalysisActivityDescriptionPackage.PARAMETER__CONSTRAINTS:
				getConstraints().clear();
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
			case AnalysisActivityDescriptionPackage.PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AnalysisActivityDescriptionPackage.PARAMETER__REMARKS:
				return REMARKS_EDEFAULT == null ? remarks != null : !REMARKS_EDEFAULT.equals(remarks);
			case AnalysisActivityDescriptionPackage.PARAMETER__PARAMETER_TYPE:
				return parameterType != PARAMETER_TYPE_EDEFAULT;
			case AnalysisActivityDescriptionPackage.PARAMETER__DEFAULT_VALUE:
				return defaultValue != null && !defaultValue.isEmpty();
			case AnalysisActivityDescriptionPackage.PARAMETER__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", remarks: ");
		result.append(remarks);
		result.append(", parameterType: ");
		result.append(parameterType);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(')');
		return result.toString();
	}

} //ParameterImpl
