/**
 */
package br.usp.ffclrp.dcm.lssb.activityrest.domain.impl;

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

import br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivityModelFactory;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivityModelPackage;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.Dataset;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.ParameterMap;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analysis Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.AnalysisActivityImpl#getId <em>Id</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.AnalysisActivityImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.AnalysisActivityImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.AnalysisActivityImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.AnalysisActivityImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.AnalysisActivityImpl#getErrorReport <em>Error Report</em>}</li>
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
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;
	
	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;
	
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Activity description;
	
	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Dataset> inputs;
	
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected ParameterMap parameters;
	
	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Dataset> outputs;
	
	/**
	 * The default value of the '{@link #getErrorReport() <em>Error Report</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorReport()
	 * @generated
	 * @ordered
	 */
	protected static final File ERROR_REPORT_EDEFAULT = null;
	
	/**
	 * The cached value of the '{@link #getErrorReport() <em>Error Report</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorReport()
	 * @generated
	 * @ordered
	 */
	protected File errorReport = ERROR_REPORT_EDEFAULT;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysisActivityImpl() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisActivityModelPackage.Literals.ANALYSIS_ACTIVITY;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__ID, oldId, id));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getDescription() {
		if (description != null && description.eIsProxy()) {
			InternalEObject oldDescription = (InternalEObject)description;
			description = (Activity)eResolveProxy(oldDescription);
			if (description != oldDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__DESCRIPTION, oldDescription, description));
			}
		}
		return description;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetDescription() {
		return description;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(Activity newDescription) {
		Activity oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dataset> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<Dataset>(Dataset.class, this, AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__INPUTS);
		}
		return inputs;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	public ParameterMap getParameters() {
		if(this.parameters == null) 
			this.parameters = AnalysisActivityModelFactory.eINSTANCE.createParameterMap();
		return parameters;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameters(ParameterMap newParameters, NotificationChain msgs) {
		ParameterMap oldParameters = parameters;
		parameters = newParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__PARAMETERS, oldParameters, newParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameters(ParameterMap newParameters) {
		if (newParameters != parameters) {
			NotificationChain msgs = null;
			if (parameters != null)
				msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__PARAMETERS, null, msgs);
			if (newParameters != null)
				msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__PARAMETERS, null, msgs);
			msgs = basicSetParameters(newParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__PARAMETERS, newParameters, newParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dataset> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<Dataset>(Dataset.class, this, AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__OUTPUTS);
		}
		return outputs;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getErrorReport() {
		return errorReport;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorReport(File newErrorReport) {
		File oldErrorReport = errorReport;
		errorReport = newErrorReport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__ERROR_REPORT, oldErrorReport, errorReport));
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
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
			case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__PARAMETERS:
				return basicSetParameters(null, msgs);
			case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
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
			case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__ID:
				return getId();
			case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__DESCRIPTION:
				if (resolve) return getDescription();
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
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__ID:
				setId((String)newValue);
				return;
			case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__DESCRIPTION:
				setDescription((Activity)newValue);
				return;
			case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends Dataset>)newValue);
				return;
			case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__PARAMETERS:
				setParameters((ParameterMap)newValue);
				return;
			case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends Dataset>)newValue);
				return;
			case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__ERROR_REPORT:
				setErrorReport((File)newValue);
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
			case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__ID:
				setId(ID_EDEFAULT);
				return;
			case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__DESCRIPTION:
				setDescription((Activity)null);
				return;
			case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__INPUTS:
				getInputs().clear();
				return;
			case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__PARAMETERS:
				setParameters((ParameterMap)null);
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
				return parameters != null;
			case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY__ERROR_REPORT:
				return ERROR_REPORT_EDEFAULT == null ? errorReport != null : !ERROR_REPORT_EDEFAULT.equals(errorReport);
		}
		return super.eIsSet(featureID);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY___INPUT_DATASET_FOR_NAME__STRING:
				return inputDatasetForName((String)arguments.get(0));
			case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY___OUTPUT_DATASET_FOR_NAME__STRING:
				return outputDatasetForName((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", errorReport: ");
		result.append(errorReport);
		result.append(')');
		return result.toString();
	}
	
} // AnalysisActivityImpl
