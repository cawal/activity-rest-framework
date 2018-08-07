/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CustomDatasetReadinessConstraint;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Dataset;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetReadinessConstraint;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ReadinessConstraint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Dataset Readiness Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.CustomDatasetReadinessConstraintImpl#getDataset <em>Dataset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomDatasetReadinessConstraintImpl extends CustomConstraintImpl implements CustomDatasetReadinessConstraint {
	/**
	 * The cached value of the '{@link #getDataset() <em>Dataset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataset()
	 * @generated
	 * @ordered
	 */
	protected Dataset dataset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomDatasetReadinessConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisActivityDescriptionPackage.Literals.CUSTOM_DATASET_READINESS_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dataset getDataset() {
		if (dataset != null && dataset.eIsProxy()) {
			InternalEObject oldDataset = (InternalEObject)dataset;
			dataset = (Dataset)eResolveProxy(oldDataset);
			if (dataset != oldDataset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysisActivityDescriptionPackage.CUSTOM_DATASET_READINESS_CONSTRAINT__DATASET, oldDataset, dataset));
			}
		}
		return dataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dataset basicGetDataset() {
		return dataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataset(Dataset newDataset) {
		Dataset oldDataset = dataset;
		dataset = newDataset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisActivityDescriptionPackage.CUSTOM_DATASET_READINESS_CONSTRAINT__DATASET, oldDataset, dataset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnalysisActivityDescriptionPackage.CUSTOM_DATASET_READINESS_CONSTRAINT__DATASET:
				if (resolve) return getDataset();
				return basicGetDataset();
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
			case AnalysisActivityDescriptionPackage.CUSTOM_DATASET_READINESS_CONSTRAINT__DATASET:
				setDataset((Dataset)newValue);
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
			case AnalysisActivityDescriptionPackage.CUSTOM_DATASET_READINESS_CONSTRAINT__DATASET:
				setDataset((Dataset)null);
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
			case AnalysisActivityDescriptionPackage.CUSTOM_DATASET_READINESS_CONSTRAINT__DATASET:
				return dataset != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ReadinessConstraint.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == DatasetReadinessConstraint.class) {
			switch (derivedFeatureID) {
				case AnalysisActivityDescriptionPackage.CUSTOM_DATASET_READINESS_CONSTRAINT__DATASET: return AnalysisActivityDescriptionPackage.DATASET_READINESS_CONSTRAINT__DATASET;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ReadinessConstraint.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == DatasetReadinessConstraint.class) {
			switch (baseFeatureID) {
				case AnalysisActivityDescriptionPackage.DATASET_READINESS_CONSTRAINT__DATASET: return AnalysisActivityDescriptionPackage.CUSTOM_DATASET_READINESS_CONSTRAINT__DATASET;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //CustomDatasetReadinessConstraintImpl
