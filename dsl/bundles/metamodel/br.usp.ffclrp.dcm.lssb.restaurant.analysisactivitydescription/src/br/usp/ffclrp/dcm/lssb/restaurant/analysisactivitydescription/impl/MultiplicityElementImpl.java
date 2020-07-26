/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MultiplicityElement;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiplicity Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.MultiplicityElementImpl#getMinimumCardinality <em>Minimum Cardinality</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.MultiplicityElementImpl#getMaximumCardinality <em>Maximum Cardinality</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MultiplicityElementImpl extends MinimalEObjectImpl.Container implements MultiplicityElement {
	/**
	 * The default value of the '{@link #getMinimumCardinality() <em>Minimum Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MINIMUM_CARDINALITY_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getMinimumCardinality() <em>Minimum Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumCardinality()
	 * @generated
	 * @ordered
	 */
	protected BigInteger minimumCardinality = MINIMUM_CARDINALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumCardinality() <em>Maximum Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAXIMUM_CARDINALITY_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getMaximumCardinality() <em>Maximum Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumCardinality()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maximumCardinality = MAXIMUM_CARDINALITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplicityElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisActivityDescriptionPackage.Literals.MULTIPLICITY_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getMinimumCardinality() {
		return minimumCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinimumCardinality(BigInteger newMinimumCardinality) {
		BigInteger oldMinimumCardinality = minimumCardinality;
		minimumCardinality = newMinimumCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisActivityDescriptionPackage.MULTIPLICITY_ELEMENT__MINIMUM_CARDINALITY, oldMinimumCardinality, minimumCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getMaximumCardinality() {
		return maximumCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumCardinality(BigInteger newMaximumCardinality) {
		BigInteger oldMaximumCardinality = maximumCardinality;
		maximumCardinality = newMaximumCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisActivityDescriptionPackage.MULTIPLICITY_ELEMENT__MAXIMUM_CARDINALITY, oldMaximumCardinality, maximumCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnalysisActivityDescriptionPackage.MULTIPLICITY_ELEMENT__MINIMUM_CARDINALITY:
				return getMinimumCardinality();
			case AnalysisActivityDescriptionPackage.MULTIPLICITY_ELEMENT__MAXIMUM_CARDINALITY:
				return getMaximumCardinality();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AnalysisActivityDescriptionPackage.MULTIPLICITY_ELEMENT__MINIMUM_CARDINALITY:
				setMinimumCardinality((BigInteger)newValue);
				return;
			case AnalysisActivityDescriptionPackage.MULTIPLICITY_ELEMENT__MAXIMUM_CARDINALITY:
				setMaximumCardinality((BigInteger)newValue);
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
			case AnalysisActivityDescriptionPackage.MULTIPLICITY_ELEMENT__MINIMUM_CARDINALITY:
				setMinimumCardinality(MINIMUM_CARDINALITY_EDEFAULT);
				return;
			case AnalysisActivityDescriptionPackage.MULTIPLICITY_ELEMENT__MAXIMUM_CARDINALITY:
				setMaximumCardinality(MAXIMUM_CARDINALITY_EDEFAULT);
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
			case AnalysisActivityDescriptionPackage.MULTIPLICITY_ELEMENT__MINIMUM_CARDINALITY:
				return MINIMUM_CARDINALITY_EDEFAULT == null ? minimumCardinality != null : !MINIMUM_CARDINALITY_EDEFAULT.equals(minimumCardinality);
			case AnalysisActivityDescriptionPackage.MULTIPLICITY_ELEMENT__MAXIMUM_CARDINALITY:
				return MAXIMUM_CARDINALITY_EDEFAULT == null ? maximumCardinality != null : !MAXIMUM_CARDINALITY_EDEFAULT.equals(maximumCardinality);
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
		result.append(" (minimumCardinality: ");
		result.append(minimumCardinality);
		result.append(", maximumCardinality: ");
		result.append(maximumCardinality);
		result.append(')');
		return result.toString();
	}

} //MultiplicityElementImpl
