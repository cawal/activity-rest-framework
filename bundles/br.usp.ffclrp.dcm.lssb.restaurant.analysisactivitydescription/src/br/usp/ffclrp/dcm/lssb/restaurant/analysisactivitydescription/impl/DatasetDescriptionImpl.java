/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetDescription;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dataset Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.DatasetDescriptionImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.DatasetDescriptionImpl#getMimetype <em>Mimetype</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.DatasetDescriptionImpl#getDatasetKind <em>Dataset Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatasetDescriptionImpl extends MinimalEObjectImpl.Container implements DatasetDescription {
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
	 * The default value of the '{@link #getMimetype() <em>Mimetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimetype()
	 * @generated
	 * @ordered
	 */
	protected static final String MIMETYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMimetype() <em>Mimetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimetype()
	 * @generated
	 * @ordered
	 */
	protected String mimetype = MIMETYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatasetKind() <em>Dataset Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasetKind()
	 * @generated
	 * @ordered
	 */
	protected static final DatasetKind DATASET_KIND_EDEFAULT = DatasetKind.STANDARD_INPUT;

	/**
	 * The cached value of the '{@link #getDatasetKind() <em>Dataset Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasetKind()
	 * @generated
	 * @ordered
	 */
	protected DatasetKind datasetKind = DATASET_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatasetDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisActivityDescriptionPackage.Literals.DATASET_DESCRIPTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisActivityDescriptionPackage.DATASET_DESCRIPTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMimetype() {
		return mimetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMimetype(String newMimetype) {
		String oldMimetype = mimetype;
		mimetype = newMimetype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisActivityDescriptionPackage.DATASET_DESCRIPTION__MIMETYPE, oldMimetype, mimetype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetKind getDatasetKind() {
		return datasetKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatasetKind(DatasetKind newDatasetKind) {
		DatasetKind oldDatasetKind = datasetKind;
		datasetKind = newDatasetKind == null ? DATASET_KIND_EDEFAULT : newDatasetKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisActivityDescriptionPackage.DATASET_DESCRIPTION__DATASET_KIND, oldDatasetKind, datasetKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnalysisActivityDescriptionPackage.DATASET_DESCRIPTION__NAME:
				return getName();
			case AnalysisActivityDescriptionPackage.DATASET_DESCRIPTION__MIMETYPE:
				return getMimetype();
			case AnalysisActivityDescriptionPackage.DATASET_DESCRIPTION__DATASET_KIND:
				return getDatasetKind();
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
			case AnalysisActivityDescriptionPackage.DATASET_DESCRIPTION__NAME:
				setName((String)newValue);
				return;
			case AnalysisActivityDescriptionPackage.DATASET_DESCRIPTION__MIMETYPE:
				setMimetype((String)newValue);
				return;
			case AnalysisActivityDescriptionPackage.DATASET_DESCRIPTION__DATASET_KIND:
				setDatasetKind((DatasetKind)newValue);
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
			case AnalysisActivityDescriptionPackage.DATASET_DESCRIPTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AnalysisActivityDescriptionPackage.DATASET_DESCRIPTION__MIMETYPE:
				setMimetype(MIMETYPE_EDEFAULT);
				return;
			case AnalysisActivityDescriptionPackage.DATASET_DESCRIPTION__DATASET_KIND:
				setDatasetKind(DATASET_KIND_EDEFAULT);
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
			case AnalysisActivityDescriptionPackage.DATASET_DESCRIPTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AnalysisActivityDescriptionPackage.DATASET_DESCRIPTION__MIMETYPE:
				return MIMETYPE_EDEFAULT == null ? mimetype != null : !MIMETYPE_EDEFAULT.equals(mimetype);
			case AnalysisActivityDescriptionPackage.DATASET_DESCRIPTION__DATASET_KIND:
				return datasetKind != DATASET_KIND_EDEFAULT;
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
		result.append(", mimetype: ");
		result.append(mimetype);
		result.append(", datasetKind: ");
		result.append(datasetKind);
		result.append(')');
		return result.toString();
	}

} //DatasetDescriptionImpl
