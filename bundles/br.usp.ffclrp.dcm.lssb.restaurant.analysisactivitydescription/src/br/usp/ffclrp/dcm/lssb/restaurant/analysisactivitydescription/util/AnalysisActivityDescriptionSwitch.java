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
			case AnalysisActivityDescriptionPackage.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisActivityDescriptionPackage.MULTIPLICITY_ELEMENT: {
				MultiplicityElement multiplicityElement = (MultiplicityElement)theEObject;
				T result = caseMultiplicityElement(multiplicityElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisActivityDescriptionPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseMultiplicityElement(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisActivityDescriptionPackage.DATASET: {
				Dataset dataset = (Dataset)theEObject;
				T result = caseDataset(dataset);
				if (result == null) result = caseMultiplicityElement(dataset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisActivityDescriptionPackage.INPUT_DATASET: {
				InputDataset inputDataset = (InputDataset)theEObject;
				T result = caseInputDataset(inputDataset);
				if (result == null) result = caseDataset(inputDataset);
				if (result == null) result = caseMultiplicityElement(inputDataset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisActivityDescriptionPackage.OUTPUT_DATASET: {
				OutputDataset outputDataset = (OutputDataset)theEObject;
				T result = caseOutputDataset(outputDataset);
				if (result == null) result = caseDataset(outputDataset);
				if (result == null) result = caseMultiplicityElement(outputDataset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisActivityDescriptionPackage.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				T result = caseConstraint(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisActivityDescriptionPackage.PARAMETER_CONSTRAINT: {
				ParameterConstraint parameterConstraint = (ParameterConstraint)theEObject;
				T result = caseParameterConstraint(parameterConstraint);
				if (result == null) result = caseConstraint(parameterConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisActivityDescriptionPackage.DATASET_CONSTRAINT: {
				DatasetConstraint datasetConstraint = (DatasetConstraint)theEObject;
				T result = caseDatasetConstraint(datasetConstraint);
				if (result == null) result = caseConstraint(datasetConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisActivityDescriptionPackage.CUSTOM_CONSTRAINT: {
				CustomConstraint customConstraint = (CustomConstraint)theEObject;
				T result = caseCustomConstraint(customConstraint);
				if (result == null) result = caseConstraint(customConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisActivityDescriptionPackage.CUSTOM_PARAMETER_CONSTRAINT: {
				CustomParameterConstraint customParameterConstraint = (CustomParameterConstraint)theEObject;
				T result = caseCustomParameterConstraint(customParameterConstraint);
				if (result == null) result = caseCustomConstraint(customParameterConstraint);
				if (result == null) result = caseParameterConstraint(customParameterConstraint);
				if (result == null) result = caseConstraint(customParameterConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisActivityDescriptionPackage.CUSTOM_DATASET_CONSTRAINT: {
				CustomDatasetConstraint customDatasetConstraint = (CustomDatasetConstraint)theEObject;
				T result = caseCustomDatasetConstraint(customDatasetConstraint);
				if (result == null) result = caseCustomConstraint(customDatasetConstraint);
				if (result == null) result = caseDatasetConstraint(customDatasetConstraint);
				if (result == null) result = caseConstraint(customDatasetConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisActivityDescriptionPackage.READINESS_CONSTRAINT: {
				ReadinessConstraint readinessConstraint = (ReadinessConstraint)theEObject;
				T result = caseReadinessConstraint(readinessConstraint);
				if (result == null) result = caseConstraint(readinessConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisActivityDescriptionPackage.DATASET_READINESS_CONSTRAINT: {
				DatasetReadinessConstraint datasetReadinessConstraint = (DatasetReadinessConstraint)theEObject;
				T result = caseDatasetReadinessConstraint(datasetReadinessConstraint);
				if (result == null) result = caseReadinessConstraint(datasetReadinessConstraint);
				if (result == null) result = caseConstraint(datasetReadinessConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisActivityDescriptionPackage.PARAMETER_READINESS_CONSTRAINT: {
				ParameterReadinessConstraint parameterReadinessConstraint = (ParameterReadinessConstraint)theEObject;
				T result = caseParameterReadinessConstraint(parameterReadinessConstraint);
				if (result == null) result = caseReadinessConstraint(parameterReadinessConstraint);
				if (result == null) result = caseConstraint(parameterReadinessConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisActivityDescriptionPackage.CUSTOM_PARAMETER_READINESS_CONSTRAINT: {
				CustomParameterReadinessConstraint customParameterReadinessConstraint = (CustomParameterReadinessConstraint)theEObject;
				T result = caseCustomParameterReadinessConstraint(customParameterReadinessConstraint);
				if (result == null) result = caseCustomConstraint(customParameterReadinessConstraint);
				if (result == null) result = caseParameterReadinessConstraint(customParameterReadinessConstraint);
				if (result == null) result = caseReadinessConstraint(customParameterReadinessConstraint);
				if (result == null) result = caseConstraint(customParameterReadinessConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisActivityDescriptionPackage.CUSTOM_DATASET_READINESS_CONSTRAINT: {
				CustomDatasetReadinessConstraint customDatasetReadinessConstraint = (CustomDatasetReadinessConstraint)theEObject;
				T result = caseCustomDatasetReadinessConstraint(customDatasetReadinessConstraint);
				if (result == null) result = caseCustomConstraint(customDatasetReadinessConstraint);
				if (result == null) result = caseDatasetReadinessConstraint(customDatasetReadinessConstraint);
				if (result == null) result = caseReadinessConstraint(customDatasetReadinessConstraint);
				if (result == null) result = caseConstraint(customDatasetReadinessConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisActivityDescriptionPackage.TOOL: {
				Tool tool = (Tool)theEObject;
				T result = caseTool(tool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisActivityDescriptionPackage.COMMAND_LINE_TOOL: {
				CommandLineTool commandLineTool = (CommandLineTool)theEObject;
				T result = caseCommandLineTool(commandLineTool);
				if (result == null) result = caseTool(commandLineTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisActivityDescriptionPackage.EXIT_CODE: {
				ExitCode exitCode = (ExitCode)theEObject;
				T result = caseExitCode(exitCode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisActivityDescriptionPackage.COMMAND_LINE_ENTRY_LIST: {
				CommandLineEntryList commandLineEntryList = (CommandLineEntryList)theEObject;
				T result = caseCommandLineEntryList(commandLineEntryList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisActivityDescriptionPackage.TOOL_NAME_COMMAND_LINE_ENTRY: {
				ToolNameCommandLineEntry toolNameCommandLineEntry = (ToolNameCommandLineEntry)theEObject;
				T result = caseToolNameCommandLineEntry(toolNameCommandLineEntry);
				if (result == null) result = caseCommandLineEntryList(toolNameCommandLineEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisActivityDescriptionPackage.LITERAL_COMMAND_LINE_ENTRY_LIST: {
				LiteralCommandLineEntryList literalCommandLineEntryList = (LiteralCommandLineEntryList)theEObject;
				T result = caseLiteralCommandLineEntryList(literalCommandLineEntryList);
				if (result == null) result = caseCommandLineEntryList(literalCommandLineEntryList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisActivityDescriptionPackage.DATASET_COMMAND_LINE_ENTRY_LIST: {
				DatasetCommandLineEntryList datasetCommandLineEntryList = (DatasetCommandLineEntryList)theEObject;
				T result = caseDatasetCommandLineEntryList(datasetCommandLineEntryList);
				if (result == null) result = caseCommandLineEntryList(datasetCommandLineEntryList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnalysisActivityDescriptionPackage.PARAMETER_COMMAND_LINE_ENTRY_LIST: {
				ParameterCommandLineEntryList parameterCommandLineEntryList = (ParameterCommandLineEntryList)theEObject;
				T result = caseParameterCommandLineEntryList(parameterCommandLineEntryList);
				if (result == null) result = caseCommandLineEntryList(parameterCommandLineEntryList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicity Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicityElement(MultiplicityElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dataset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dataset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataset(Dataset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Dataset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Dataset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputDataset(InputDataset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Dataset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Dataset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputDataset(OutputDataset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Command Line Entry List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Line Entry List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandLineEntryList(CommandLineEntryList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool Name Command Line Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool Name Command Line Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToolNameCommandLineEntry(ToolNameCommandLineEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Command Line Entry List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Command Line Entry List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralCommandLineEntryList(LiteralCommandLineEntryList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dataset Command Line Entry List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dataset Command Line Entry List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatasetCommandLineEntryList(DatasetCommandLineEntryList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Command Line Entry List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Command Line Entry List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterCommandLineEntryList(ParameterCommandLineEntryList object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Dataset Readiness Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dataset Readiness Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatasetReadinessConstraint(DatasetReadinessConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Readiness Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Readiness Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterReadinessConstraint(ParameterReadinessConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Parameter Readiness Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Parameter Readiness Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomParameterReadinessConstraint(CustomParameterReadinessConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Dataset Readiness Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Dataset Readiness Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomDatasetReadinessConstraint(CustomDatasetReadinessConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomConstraint(CustomConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Parameter Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Parameter Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomParameterConstraint(CustomParameterConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Dataset Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Dataset Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomDatasetConstraint(CustomDatasetConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTool(Tool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Line Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Line Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandLineTool(CommandLineTool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exit Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exit Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExitCode(ExitCode object) {
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
