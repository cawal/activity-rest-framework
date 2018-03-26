/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.util;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage
 * @generated
 */
public class AnalysisActivityDescriptionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AnalysisActivityDescriptionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisActivityDescriptionSwitch() {
		if (modelPackage == null) {
			modelPackage = AnalysisActivityDescriptionPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AnalysisActivityDescriptionPackage.ANALYSIS_ACTIVITY_DESCRIPTION: {
				AnalysisActivityDescription analysisActivityDescription = (AnalysisActivityDescription)theEObject;
				T result = caseAnalysisActivityDescription(analysisActivityDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisActivityDescriptionPackage.PARAMETER_PROPERTIES: {
				ParameterProperties parameterProperties = (ParameterProperties)theEObject;
				T result = caseParameterProperties(parameterProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisActivityDescriptionPackage.DATASET_PROPERTIES: {
				DatasetProperties datasetProperties = (DatasetProperties)theEObject;
				T result = caseDatasetProperties(datasetProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisActivityDescriptionPackage.COMMAND_LINE_ENTRIES: {
				CommandLineEntries commandLineEntries = (CommandLineEntries)theEObject;
				T result = caseCommandLineEntries(commandLineEntries);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisActivityDescriptionPackage.LITERAL_COMMAND_LINE_ENTRIES: {
				LiteralCommandLineEntries literalCommandLineEntries = (LiteralCommandLineEntries)theEObject;
				T result = caseLiteralCommandLineEntries(literalCommandLineEntries);
				if (result == null) result = caseCommandLineEntries(literalCommandLineEntries);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisActivityDescriptionPackage.DATASET_COMMAND_LINE_ENTRIES: {
				DatasetCommandLineEntries datasetCommandLineEntries = (DatasetCommandLineEntries)theEObject;
				T result = caseDatasetCommandLineEntries(datasetCommandLineEntries);
				if (result == null) result = caseCommandLineEntries(datasetCommandLineEntries);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisActivityDescriptionPackage.PARAMETER_COMMAND_LINE_ENTRIES: {
				ParameterCommandLineEntries parameterCommandLineEntries = (ParameterCommandLineEntries)theEObject;
				T result = caseParameterCommandLineEntries(parameterCommandLineEntries);
				if (result == null) result = caseCommandLineEntries(parameterCommandLineEntries);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisActivityDescriptionPackage.READINESS_CONSTRAINT: {
				ReadinessConstraint readinessConstraint = (ReadinessConstraint)theEObject;
				T result = caseReadinessConstraint(readinessConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisActivityDescriptionPackage.DATASET_CONSTRAINT: {
				DatasetConstraint datasetConstraint = (DatasetConstraint)theEObject;
				T result = caseDatasetConstraint(datasetConstraint);
				if (result == null) result = caseReadinessConstraint(datasetConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisActivityDescriptionPackage.MINIMUN_DATASET_CARDINALITY_CONSTRAINT: {
				MinimunDatasetCardinalityConstraint minimunDatasetCardinalityConstraint = (MinimunDatasetCardinalityConstraint)theEObject;
				T result = caseMinimunDatasetCardinalityConstraint(minimunDatasetCardinalityConstraint);
				if (result == null) result = caseDatasetConstraint(minimunDatasetCardinalityConstraint);
				if (result == null) result = caseReadinessConstraint(minimunDatasetCardinalityConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisActivityDescriptionPackage.MAXIMUN_DATASET_CARDINALITY_CONSTRAINT: {
				MaximunDatasetCardinalityConstraint maximunDatasetCardinalityConstraint = (MaximunDatasetCardinalityConstraint)theEObject;
				T result = caseMaximunDatasetCardinalityConstraint(maximunDatasetCardinalityConstraint);
				if (result == null) result = caseDatasetConstraint(maximunDatasetCardinalityConstraint);
				if (result == null) result = caseReadinessConstraint(maximunDatasetCardinalityConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisActivityDescriptionPackage.PARAMETER_CONSTRAINT: {
				ParameterConstraint parameterConstraint = (ParameterConstraint)theEObject;
				T result = caseParameterConstraint(parameterConstraint);
				if (result == null) result = caseReadinessConstraint(parameterConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analysis Activity Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analysis Activity Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalysisActivityDescription(AnalysisActivityDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterProperties(ParameterProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dataset Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dataset Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatasetProperties(DatasetProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Line Entries</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Line Entries</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandLineEntries(CommandLineEntries object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Command Line Entries</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Command Line Entries</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralCommandLineEntries(LiteralCommandLineEntries object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dataset Command Line Entries</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dataset Command Line Entries</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatasetCommandLineEntries(DatasetCommandLineEntries object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Command Line Entries</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Command Line Entries</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterCommandLineEntries(ParameterCommandLineEntries object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Readiness Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Readiness Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadinessConstraint(ReadinessConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dataset Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dataset Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatasetConstraint(DatasetConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minimun Dataset Cardinality Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minimun Dataset Cardinality Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinimunDatasetCardinalityConstraint(MinimunDatasetCardinalityConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maximun Dataset Cardinality Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maximun Dataset Cardinality Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaximunDatasetCardinalityConstraint(MaximunDatasetCardinalityConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterConstraint(ParameterConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AnalysisActivityDescriptionSwitch
