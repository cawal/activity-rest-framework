/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.FunctionalEntity;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.InputDataset;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.OutputDataset;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Parameter;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ActivityImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ActivityImpl#getInputDatasets <em>Input Datasets</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ActivityImpl#getOutputDatasets <em>Output Datasets</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ActivityImpl#getFunctionalEntity <em>Functional Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityImpl extends IdentifiableElementImpl implements Activity {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getInputDatasets() <em>Input Datasets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputDatasets()
	 * @generated
	 * @ordered
	 */
	protected EList<InputDataset> inputDatasets;

	/**
	 * The cached value of the '{@link #getOutputDatasets() <em>Output Datasets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputDatasets()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputDataset> outputDatasets;

	/**
	 * The cached value of the '{@link #getFunctionalEntity() <em>Functional Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalEntity()
	 * @generated
	 * @ordered
	 */
	protected FunctionalEntity functionalEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisActivityDescriptionPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, AnalysisActivityDescriptionPackage.ACTIVITY__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputDataset> getInputDatasets() {
		if (inputDatasets == null) {
			inputDatasets = new EObjectContainmentEList<InputDataset>(InputDataset.class, this, AnalysisActivityDescriptionPackage.ACTIVITY__INPUT_DATASETS);
		}
		return inputDatasets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputDataset> getOutputDatasets() {
		if (outputDatasets == null) {
			outputDatasets = new EObjectContainmentEList<OutputDataset>(OutputDataset.class, this, AnalysisActivityDescriptionPackage.ACTIVITY__OUTPUT_DATASETS);
		}
		return outputDatasets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalEntity getFunctionalEntity() {
		return functionalEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunctionalEntity(FunctionalEntity newFunctionalEntity, NotificationChain msgs) {
		FunctionalEntity oldFunctionalEntity = functionalEntity;
		functionalEntity = newFunctionalEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysisActivityDescriptionPackage.ACTIVITY__FUNCTIONAL_ENTITY, oldFunctionalEntity, newFunctionalEntity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionalEntity(FunctionalEntity newFunctionalEntity) {
		if (newFunctionalEntity != functionalEntity) {
			NotificationChain msgs = null;
			if (functionalEntity != null)
				msgs = ((InternalEObject)functionalEntity).eInverseRemove(this, AnalysisActivityDescriptionPackage.FUNCTIONAL_ENTITY__ACTIVITY, FunctionalEntity.class, msgs);
			if (newFunctionalEntity != null)
				msgs = ((InternalEObject)newFunctionalEntity).eInverseAdd(this, AnalysisActivityDescriptionPackage.FUNCTIONAL_ENTITY__ACTIVITY, FunctionalEntity.class, msgs);
			msgs = basicSetFunctionalEntity(newFunctionalEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisActivityDescriptionPackage.ACTIVITY__FUNCTIONAL_ENTITY, newFunctionalEntity, newFunctionalEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnalysisActivityDescriptionPackage.ACTIVITY__FUNCTIONAL_ENTITY:
				if (functionalEntity != null)
					msgs = ((InternalEObject)functionalEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnalysisActivityDescriptionPackage.ACTIVITY__FUNCTIONAL_ENTITY, null, msgs);
				return basicSetFunctionalEntity((FunctionalEntity)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnalysisActivityDescriptionPackage.ACTIVITY__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case AnalysisActivityDescriptionPackage.ACTIVITY__INPUT_DATASETS:
				return ((InternalEList<?>)getInputDatasets()).basicRemove(otherEnd, msgs);
			case AnalysisActivityDescriptionPackage.ACTIVITY__OUTPUT_DATASETS:
				return ((InternalEList<?>)getOutputDatasets()).basicRemove(otherEnd, msgs);
			case AnalysisActivityDescriptionPackage.ACTIVITY__FUNCTIONAL_ENTITY:
				return basicSetFunctionalEntity(null, msgs);
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
			case AnalysisActivityDescriptionPackage.ACTIVITY__PARAMETERS:
				return getParameters();
			case AnalysisActivityDescriptionPackage.ACTIVITY__INPUT_DATASETS:
				return getInputDatasets();
			case AnalysisActivityDescriptionPackage.ACTIVITY__OUTPUT_DATASETS:
				return getOutputDatasets();
			case AnalysisActivityDescriptionPackage.ACTIVITY__FUNCTIONAL_ENTITY:
				return getFunctionalEntity();
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
			case AnalysisActivityDescriptionPackage.ACTIVITY__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case AnalysisActivityDescriptionPackage.ACTIVITY__INPUT_DATASETS:
				getInputDatasets().clear();
				getInputDatasets().addAll((Collection<? extends InputDataset>)newValue);
				return;
			case AnalysisActivityDescriptionPackage.ACTIVITY__OUTPUT_DATASETS:
				getOutputDatasets().clear();
				getOutputDatasets().addAll((Collection<? extends OutputDataset>)newValue);
				return;
			case AnalysisActivityDescriptionPackage.ACTIVITY__FUNCTIONAL_ENTITY:
				setFunctionalEntity((FunctionalEntity)newValue);
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
			case AnalysisActivityDescriptionPackage.ACTIVITY__PARAMETERS:
				getParameters().clear();
				return;
			case AnalysisActivityDescriptionPackage.ACTIVITY__INPUT_DATASETS:
				getInputDatasets().clear();
				return;
			case AnalysisActivityDescriptionPackage.ACTIVITY__OUTPUT_DATASETS:
				getOutputDatasets().clear();
				return;
			case AnalysisActivityDescriptionPackage.ACTIVITY__FUNCTIONAL_ENTITY:
				setFunctionalEntity((FunctionalEntity)null);
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
			case AnalysisActivityDescriptionPackage.ACTIVITY__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case AnalysisActivityDescriptionPackage.ACTIVITY__INPUT_DATASETS:
				return inputDatasets != null && !inputDatasets.isEmpty();
			case AnalysisActivityDescriptionPackage.ACTIVITY__OUTPUT_DATASETS:
				return outputDatasets != null && !outputDatasets.isEmpty();
			case AnalysisActivityDescriptionPackage.ACTIVITY__FUNCTIONAL_ENTITY:
				return functionalEntity != null;
		}
		return super.eIsSet(featureID);
	}

} //ActivityImpl
