/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetCommandLineEntries;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetProperties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dataset Command Line Entries</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.DatasetCommandLineEntriesImpl#getDataset <em>Dataset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatasetCommandLineEntriesImpl extends CommandLineEntriesImpl implements DatasetCommandLineEntries {
	/**
	 * The cached value of the '{@link #getDataset() <em>Dataset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataset()
	 * @generated
	 * @ordered
	 */
	protected DatasetProperties dataset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatasetCommandLineEntriesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisActivityDescriptionPackage.Literals.DATASET_COMMAND_LINE_ENTRIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetProperties getDataset() {
		if (dataset != null && dataset.eIsProxy()) {
			InternalEObject oldDataset = (InternalEObject)dataset;
			dataset = (DatasetProperties)eResolveProxy(oldDataset);
			if (dataset != oldDataset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysisActivityDescriptionPackage.DATASET_COMMAND_LINE_ENTRIES__DATASET, oldDataset, dataset));
			}
		}
		return dataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetProperties basicGetDataset() {
		return dataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataset(DatasetProperties newDataset) {
		DatasetProperties oldDataset = dataset;
		dataset = newDataset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisActivityDescriptionPackage.DATASET_COMMAND_LINE_ENTRIES__DATASET, oldDataset, dataset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnalysisActivityDescriptionPackage.DATASET_COMMAND_LINE_ENTRIES__DATASET:
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
			case AnalysisActivityDescriptionPackage.DATASET_COMMAND_LINE_ENTRIES__DATASET:
				setDataset((DatasetProperties)newValue);
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
			case AnalysisActivityDescriptionPackage.DATASET_COMMAND_LINE_ENTRIES__DATASET:
				setDataset((DatasetProperties)null);
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
			case AnalysisActivityDescriptionPackage.DATASET_COMMAND_LINE_ENTRIES__DATASET:
				return dataset != null;
		}
		return super.eIsSet(featureID);
	}

} //DatasetCommandLineEntriesImpl
