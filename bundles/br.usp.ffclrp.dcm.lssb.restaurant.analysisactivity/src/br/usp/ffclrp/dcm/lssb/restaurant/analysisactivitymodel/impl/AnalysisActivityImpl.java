/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.impl;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescription;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivityModelPackage;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Dataset;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Parameter;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analysis Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.impl.AnalysisActivityImpl#getId
 * <em>Id</em>}</li>
 * <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.impl.AnalysisActivityImpl#getDescription
 * <em>Description</em>}</li>
 * <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.impl.AnalysisActivityImpl#getInputs
 * <em>Inputs</em>}</li>
 * <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.impl.AnalysisActivityImpl#getParameters
 * <em>Parameters</em>}</li>
 * <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.impl.AnalysisActivityImpl#getOutputs
 * <em>Outputs</em>}</li>
 * <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.impl.AnalysisActivityImpl#getErrorReport
 * <em>Error Report</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalysisActivityImpl extends MinimalEObjectImpl.Container
		implements AnalysisActivity {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;
	
	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;
	
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}'
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected AnalysisActivityDescription description;
	
	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}'
	 * containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Dataset> inputs;
	
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}'
	 * containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;
	
	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}'
	 * containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Dataset> outputs;
	
	/**
	 * The default value of the '{@link #getErrorReport() <em>Error
	 * Report</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getErrorReport()
	 * @generated
	 * @ordered
	 */
	protected static final File ERROR_REPORT_EDEFAULT = null;
	
	/**
	 * The cached value of the '{@link #getErrorReport() <em>Error Report</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getErrorReport()
	 * @generated
	 * @ordered
	 */
	protected File errorReport = ERROR_REPORT_EDEFAULT;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AnalysisActivityImpl() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisActivityModelPackage.Literals.ANALYSIS_ACTIVITY;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__ID, oldId,
					id));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AnalysisActivityDescription getDescription() {
		if (description != null && description.eIsProxy()) {
			InternalEObject oldDescription = (InternalEObject) description;
			description =
					(AnalysisActivityDescription) eResolveProxy(oldDescription);
			if (description != oldDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__DESCRIPTION,
							oldDescription, description));
			}
		}
		return description;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AnalysisActivityDescription basicGetDescription() {
		return description;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDescription(AnalysisActivityDescription newDescription) {
		AnalysisActivityDescription oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__DESCRIPTION,
					oldDescription, description));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Dataset> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<Dataset>(Dataset.class, this,
					AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__INPUTS);
		}
		return inputs;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class,
					this,
					AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__PARAMETERS);
		}
		return parameters;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Dataset> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<Dataset>(Dataset.class, this,
					AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__OUTPUTS);
		}
		return outputs;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public File getErrorReport() {
		return errorReport;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setErrorReport(File newErrorReport) {
		File oldErrorReport = errorReport;
		errorReport = newErrorReport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__ERROR_REPORT,
					oldErrorReport, errorReport));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @return null if not found
	 *         <!-- end-user-doc -->
	 */
	public Dataset inputDatasetForName(String name) {
		
		for (Dataset d : this.getInputs()) {
			if (d.getName().equalsIgnoreCase(name)) {
				return d;
			}
		}
		
		return null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @return null if not found
	 *         <!-- end-user-doc -->
	 * 
	 */
	public Dataset outputDatasetForName(String name) {
		
		for (Dataset d : this.getOutputs()) {
			if (d.getName().equalsIgnoreCase(name)) {
				return d;
			}
		}
		
		return null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @return null if parameter not found
	 *         <!-- end-user-doc -->
	 * 
	 */
	public Parameter parameterForName(String name) {
		for (Parameter p : this.getParameters()) {
			if (p.getName().equalsIgnoreCase(name)) {
				return p;
			}
		}
		
		return null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__INPUTS:
			return ((InternalEList<?>) getInputs()).basicRemove(otherEnd, msgs);
		case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd,
					msgs);
		case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__OUTPUTS:
			return ((InternalEList<?>) getOutputs()).basicRemove(otherEnd,
					msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__ID:
			return getId();
		case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__DESCRIPTION:
			if (resolve)
				return getDescription();
			return basicGetDescription();
		case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__INPUTS:
			return getInputs();
		case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__PARAMETERS:
			return getParameters();
		case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__OUTPUTS:
			return getOutputs();
		case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__ERROR_REPORT:
			return getErrorReport();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__ID:
			setId((String) newValue);
			return;
		case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__DESCRIPTION:
			setDescription((AnalysisActivityDescription) newValue);
			return;
		case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__INPUTS:
			getInputs().clear();
			getInputs().addAll((Collection<? extends Dataset>) newValue);
			return;
		case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends Parameter>) newValue);
			return;
		case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__OUTPUTS:
			getOutputs().clear();
			getOutputs().addAll((Collection<? extends Dataset>) newValue);
			return;
		case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__ERROR_REPORT:
			setErrorReport((File) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__ID:
			setId(ID_EDEFAULT);
			return;
		case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__DESCRIPTION:
			setDescription((AnalysisActivityDescription) null);
			return;
		case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__INPUTS:
			getInputs().clear();
			return;
		case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__PARAMETERS:
			getParameters().clear();
			return;
		case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__OUTPUTS:
			getOutputs().clear();
			return;
		case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__ERROR_REPORT:
			setErrorReport(ERROR_REPORT_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__DESCRIPTION:
			return description != null;
		case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__INPUTS:
			return inputs != null && !inputs.isEmpty();
		case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__OUTPUTS:
			return outputs != null && !outputs.isEmpty();
		case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__ERROR_REPORT:
			return ERROR_REPORT_EDEFAULT == null ? errorReport != null
					: !ERROR_REPORT_EDEFAULT.equals(errorReport);
		}
		return super.eIsSet(featureID);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
		case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY___INPUT_DATASET_FOR_NAME__STRING:
			return inputDatasetForName((String) arguments.get(0));
		case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY___OUTPUT_DATASET_FOR_NAME__STRING:
			return outputDatasetForName((String) arguments.get(0));
		case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY___PARAMETER_FOR_NAME__STRING:
			return parameterForName((String) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();
		
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", errorReport: ");
		result.append(errorReport);
		result.append(')');
		return result.toString();
	}
	
} // AnalysisActivityImpl
