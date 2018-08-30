/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.InputDataset;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.OutputDataset;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Parameter;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ReadinessConstraint;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Tool;

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
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ActivityImpl#getReadinessContraints <em>Readiness Contraints</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ActivityImpl#getTool <em>Tool</em>}</li>
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
	 * The cached value of the '{@link #getReadinessContraints() <em>Readiness Contraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadinessContraints()
	 * @generated
	 * @ordered
	 */
	protected EList<ReadinessConstraint> readinessContraints;

	/**
	 * The cached value of the '{@link #getTool() <em>Tool</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTool()
	 * @generated
	 * @ordered
	 */
	protected Tool tool;

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
	public EList<ReadinessConstraint> getReadinessContraints() {
		if (readinessContraints == null) {
			readinessContraints = new EObjectContainmentEList<ReadinessConstraint>(ReadinessConstraint.class, this, AnalysisActivityDescriptionPackage.ACTIVITY__READINESS_CONTRAINTS);
		}
		return readinessContraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tool getTool() {
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTool(Tool newTool, NotificationChain msgs) {
		Tool oldTool = tool;
		tool = newTool;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysisActivityDescriptionPackage.ACTIVITY__TOOL, oldTool, newTool);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTool(Tool newTool) {
		if (newTool != tool) {
			NotificationChain msgs = null;
			if (tool != null)
				msgs = ((InternalEObject)tool).eInverseRemove(this, AnalysisActivityDescriptionPackage.TOOL__ACTIVITY, Tool.class, msgs);
			if (newTool != null)
				msgs = ((InternalEObject)newTool).eInverseAdd(this, AnalysisActivityDescriptionPackage.TOOL__ACTIVITY, Tool.class, msgs);
			msgs = basicSetTool(newTool, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisActivityDescriptionPackage.ACTIVITY__TOOL, newTool, newTool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnalysisActivityDescriptionPackage.ACTIVITY__TOOL:
				if (tool != null)
					msgs = ((InternalEObject)tool).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnalysisActivityDescriptionPackage.ACTIVITY__TOOL, null, msgs);
				return basicSetTool((Tool)otherEnd, msgs);
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
			case AnalysisActivityDescriptionPackage.ACTIVITY__READINESS_CONTRAINTS:
				return ((InternalEList<?>)getReadinessContraints()).basicRemove(otherEnd, msgs);
			case AnalysisActivityDescriptionPackage.ACTIVITY__TOOL:
				return basicSetTool(null, msgs);
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
			case AnalysisActivityDescriptionPackage.ACTIVITY__READINESS_CONTRAINTS:
				return getReadinessContraints();
			case AnalysisActivityDescriptionPackage.ACTIVITY__TOOL:
				return getTool();
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
			case AnalysisActivityDescriptionPackage.ACTIVITY__READINESS_CONTRAINTS:
				getReadinessContraints().clear();
				getReadinessContraints().addAll((Collection<? extends ReadinessConstraint>)newValue);
				return;
			case AnalysisActivityDescriptionPackage.ACTIVITY__TOOL:
				setTool((Tool)newValue);
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
			case AnalysisActivityDescriptionPackage.ACTIVITY__READINESS_CONTRAINTS:
				getReadinessContraints().clear();
				return;
			case AnalysisActivityDescriptionPackage.ACTIVITY__TOOL:
				setTool((Tool)null);
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
			case AnalysisActivityDescriptionPackage.ACTIVITY__READINESS_CONTRAINTS:
				return readinessContraints != null && !readinessContraints.isEmpty();
			case AnalysisActivityDescriptionPackage.ACTIVITY__TOOL:
				return tool != null;
		}
		return super.eIsSet(featureID);
	}

} //ActivityImpl
