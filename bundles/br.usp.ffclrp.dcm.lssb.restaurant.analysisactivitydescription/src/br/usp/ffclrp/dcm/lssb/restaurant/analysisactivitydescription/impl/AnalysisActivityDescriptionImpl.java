/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescription;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineEntryList;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetDescription;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ReadinessConstraint;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analysis Activity Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionImpl#getInputDatasets <em>Input Datasets</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionImpl#getOutputDatasets <em>Output Datasets</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionImpl#getCommandLineTemplate <em>Command Line Template</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionImpl#getReadinessContraints <em>Readiness Contraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalysisActivityDescriptionImpl extends MinimalEObjectImpl.Container implements AnalysisActivityDescription {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterDescription> parameters;

	/**
	 * The cached value of the '{@link #getInputDatasets() <em>Input Datasets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputDatasets()
	 * @generated
	 * @ordered
	 */
	protected EList<DatasetDescription> inputDatasets;

	/**
	 * The cached value of the '{@link #getOutputDatasets() <em>Output Datasets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputDatasets()
	 * @generated
	 * @ordered
	 */
	protected EList<DatasetDescription> outputDatasets;

	/**
	 * The cached value of the '{@link #getCommandLineTemplate() <em>Command Line Template</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandLineTemplate()
	 * @generated
	 * @ordered
	 */
	protected EList<CommandLineEntryList> commandLineTemplate;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysisActivityDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisActivityDescriptionPackage.Literals.ANALYSIS_ACTIVITY_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterDescription> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<ParameterDescription>(ParameterDescription.class, this, AnalysisActivityDescriptionPackage.ANALYSIS_ACTIVITY_DESCRIPTION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatasetDescription> getInputDatasets() {
		if (inputDatasets == null) {
			inputDatasets = new EObjectContainmentEList<DatasetDescription>(DatasetDescription.class, this, AnalysisActivityDescriptionPackage.ANALYSIS_ACTIVITY_DESCRIPTION__INPUT_DATASETS);
		}
		return inputDatasets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatasetDescription> getOutputDatasets() {
		if (outputDatasets == null) {
			outputDatasets = new EObjectContainmentEList<DatasetDescription>(DatasetDescription.class, this, AnalysisActivityDescriptionPackage.ANALYSIS_ACTIVITY_DESCRIPTION__OUTPUT_DATASETS);
		}
		return outputDatasets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommandLineEntryList> getCommandLineTemplate() {
		if (commandLineTemplate == null) {
			commandLineTemplate = new EObjectContainmentEList<CommandLineEntryList>(CommandLineEntryList.class, this, AnalysisActivityDescriptionPackage.ANALYSIS_ACTIVITY_DESCRIPTION__COMMAND_LINE_TEMPLATE);
		}
		return commandLineTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReadinessConstraint> getReadinessContraints() {
		if (readinessContraints == null) {
			readinessContraints = new EObjectContainmentEList<ReadinessConstraint>(ReadinessConstraint.class, this, AnalysisActivityDescriptionPackage.ANALYSIS_ACTIVITY_DESCRIPTION__READINESS_CONTRAINTS);
		}
		return readinessContraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnalysisActivityDescriptionPackage.ANALYSIS_ACTIVITY_DESCRIPTION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case AnalysisActivityDescriptionPackage.ANALYSIS_ACTIVITY_DESCRIPTION__INPUT_DATASETS:
				return ((InternalEList<?>)getInputDatasets()).basicRemove(otherEnd, msgs);
			case AnalysisActivityDescriptionPackage.ANALYSIS_ACTIVITY_DESCRIPTION__OUTPUT_DATASETS:
				return ((InternalEList<?>)getOutputDatasets()).basicRemove(otherEnd, msgs);
			case AnalysisActivityDescriptionPackage.ANALYSIS_ACTIVITY_DESCRIPTION__COMMAND_LINE_TEMPLATE:
				return ((InternalEList<?>)getCommandLineTemplate()).basicRemove(otherEnd, msgs);
			case AnalysisActivityDescriptionPackage.ANALYSIS_ACTIVITY_DESCRIPTION__READINESS_CONTRAINTS:
				return ((InternalEList<?>)getReadinessContraints()).basicRemove(otherEnd, msgs);
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
			case AnalysisActivityDescriptionPackage.ANALYSIS_ACTIVITY_DESCRIPTION__PARAMETERS:
				return getParameters();
			case AnalysisActivityDescriptionPackage.ANALYSIS_ACTIVITY_DESCRIPTION__INPUT_DATASETS:
				return getInputDatasets();
			case AnalysisActivityDescriptionPackage.ANALYSIS_ACTIVITY_DESCRIPTION__OUTPUT_DATASETS:
				return getOutputDatasets();
			case AnalysisActivityDescriptionPackage.ANALYSIS_ACTIVITY_DESCRIPTION__COMMAND_LINE_TEMPLATE:
				return getCommandLineTemplate();
			case AnalysisActivityDescriptionPackage.ANALYSIS_ACTIVITY_DESCRIPTION__READINESS_CONTRAINTS:
				return getReadinessContraints();
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
			case AnalysisActivityDescriptionPackage.ANALYSIS_ACTIVITY_DESCRIPTION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends ParameterDescription>)newValue);
				return;
			case AnalysisActivityDescriptionPackage.ANALYSIS_ACTIVITY_DESCRIPTION__INPUT_DATASETS:
				getInputDatasets().clear();
				getInputDatasets().addAll((Collection<? extends DatasetDescription>)newValue);
				return;
			case AnalysisActivityDescriptionPackage.ANALYSIS_ACTIVITY_DESCRIPTION__OUTPUT_DATASETS:
				getOutputDatasets().clear();
				getOutputDatasets().addAll((Collection<? extends DatasetDescription>)newValue);
				return;
			case AnalysisActivityDescriptionPackage.ANALYSIS_ACTIVITY_DESCRIPTION__COMMAND_LINE_TEMPLATE:
				getCommandLineTemplate().clear();
				getCommandLineTemplate().addAll((Collection<? extends CommandLineEntryList>)newValue);
				return;
			case AnalysisActivityDescriptionPackage.ANALYSIS_ACTIVITY_DESCRIPTION__READINESS_CONTRAINTS:
				getReadinessContraints().clear();
				getReadinessContraints().addAll((Collection<? extends ReadinessConstraint>)newValue);
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
			case AnalysisActivityDescriptionPackage.ANALYSIS_ACTIVITY_DESCRIPTION__PARAMETERS:
				getParameters().clear();
				return;
			case AnalysisActivityDescriptionPackage.ANALYSIS_ACTIVITY_DESCRIPTION__INPUT_DATASETS:
				getInputDatasets().clear();
				return;
			case AnalysisActivityDescriptionPackage.ANALYSIS_ACTIVITY_DESCRIPTION__OUTPUT_DATASETS:
				getOutputDatasets().clear();
				return;
			case AnalysisActivityDescriptionPackage.ANALYSIS_ACTIVITY_DESCRIPTION__COMMAND_LINE_TEMPLATE:
				getCommandLineTemplate().clear();
				return;
			case AnalysisActivityDescriptionPackage.ANALYSIS_ACTIVITY_DESCRIPTION__READINESS_CONTRAINTS:
				getReadinessContraints().clear();
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
			case AnalysisActivityDescriptionPackage.ANALYSIS_ACTIVITY_DESCRIPTION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case AnalysisActivityDescriptionPackage.ANALYSIS_ACTIVITY_DESCRIPTION__INPUT_DATASETS:
				return inputDatasets != null && !inputDatasets.isEmpty();
			case AnalysisActivityDescriptionPackage.ANALYSIS_ACTIVITY_DESCRIPTION__OUTPUT_DATASETS:
				return outputDatasets != null && !outputDatasets.isEmpty();
			case AnalysisActivityDescriptionPackage.ANALYSIS_ACTIVITY_DESCRIPTION__COMMAND_LINE_TEMPLATE:
				return commandLineTemplate != null && !commandLineTemplate.isEmpty();
			case AnalysisActivityDescriptionPackage.ANALYSIS_ACTIVITY_DESCRIPTION__READINESS_CONTRAINTS:
				return readinessContraints != null && !readinessContraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AnalysisActivityDescriptionImpl
