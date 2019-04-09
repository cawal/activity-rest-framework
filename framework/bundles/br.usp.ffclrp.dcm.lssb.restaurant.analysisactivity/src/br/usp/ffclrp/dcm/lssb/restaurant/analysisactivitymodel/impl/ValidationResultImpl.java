/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.impl;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivityModelPackage;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.ValidationResult;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validation Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.impl.ValidationResultImpl#getIsValid <em>Is Valid</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.impl.ValidationResultImpl#getInvalidValues <em>Invalid Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValidationResultImpl extends MinimalEObjectImpl.Container implements ValidationResult {
	/**
	 * The default value of the '{@link #getIsValid() <em>Is Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsValid()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_VALID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsValid() <em>Is Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsValid()
	 * @generated
	 * @ordered
	 */
	protected Boolean isValid = IS_VALID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInvalidValues() <em>Invalid Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvalidValues()
	 * @generated
	 * @ordered
	 */
	protected Map<String, Object> invalidValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidationResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisActivityModelPackage.Literals.VALIDATION_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsValid() {
		return isValid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsValid(Boolean newIsValid) {
		Boolean oldIsValid = isValid;
		isValid = newIsValid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisActivityModelPackage.VALIDATION_RESULT__IS_VALID, oldIsValid, isValid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Map<String, Object> getInvalidValues() {
		if (invalidValues != null && ((EObject)invalidValues).eIsProxy()) {
			InternalEObject oldInvalidValues = (InternalEObject)invalidValues;
			invalidValues = (Map<String, Object>)eResolveProxy(oldInvalidValues);
			if (invalidValues != oldInvalidValues) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysisActivityModelPackage.VALIDATION_RESULT__INVALID_VALUES, oldInvalidValues, invalidValues));
			}
		}
		return invalidValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<String, Object> basicGetInvalidValues() {
		return invalidValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvalidValues(Map<String, Object> newInvalidValues) {
		Map<String, Object> oldInvalidValues = invalidValues;
		invalidValues = newInvalidValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisActivityModelPackage.VALIDATION_RESULT__INVALID_VALUES, oldInvalidValues, invalidValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnalysisActivityModelPackage.VALIDATION_RESULT__IS_VALID:
				return getIsValid();
			case AnalysisActivityModelPackage.VALIDATION_RESULT__INVALID_VALUES:
				if (resolve) return getInvalidValues();
				return basicGetInvalidValues();
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
			case AnalysisActivityModelPackage.VALIDATION_RESULT__IS_VALID:
				setIsValid((Boolean)newValue);
				return;
			case AnalysisActivityModelPackage.VALIDATION_RESULT__INVALID_VALUES:
				setInvalidValues((Map<String, Object>)newValue);
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
			case AnalysisActivityModelPackage.VALIDATION_RESULT__IS_VALID:
				setIsValid(IS_VALID_EDEFAULT);
				return;
			case AnalysisActivityModelPackage.VALIDATION_RESULT__INVALID_VALUES:
				setInvalidValues((Map<String, Object>)null);
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
			case AnalysisActivityModelPackage.VALIDATION_RESULT__IS_VALID:
				return IS_VALID_EDEFAULT == null ? isValid != null : !IS_VALID_EDEFAULT.equals(isValid);
			case AnalysisActivityModelPackage.VALIDATION_RESULT__INVALID_VALUES:
				return invalidValues != null;
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
		result.append(" (isValid: ");
		result.append(isValid);
		result.append(')');
		return result.toString();
	}

} //ValidationResultImpl
