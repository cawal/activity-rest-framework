/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnalysisActivityDescriptionFactoryImpl extends EFactoryImpl implements AnalysisActivityDescriptionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AnalysisActivityDescriptionFactory init() {
		try {
			AnalysisActivityDescriptionFactory theAnalysisActivityDescriptionFactory = (AnalysisActivityDescriptionFactory)EPackage.Registry.INSTANCE.getEFactory(AnalysisActivityDescriptionPackage.eNS_URI);
			if (theAnalysisActivityDescriptionFactory != null) {
				return theAnalysisActivityDescriptionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AnalysisActivityDescriptionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisActivityDescriptionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AnalysisActivityDescriptionPackage.ACTIVITY: return createActivity();
			case AnalysisActivityDescriptionPackage.PARAMETER: return createParameter();
			case AnalysisActivityDescriptionPackage.INPUT_DATASET: return createInputDataset();
			case AnalysisActivityDescriptionPackage.OUTPUT_DATASET: return createOutputDataset();
			case AnalysisActivityDescriptionPackage.CONSTRAINT: return createConstraint();
			case AnalysisActivityDescriptionPackage.COMMAND_LINE_TOOL: return createCommandLineTool();
			case AnalysisActivityDescriptionPackage.EXIT_CODE: return createExitCode();
			case AnalysisActivityDescriptionPackage.TOOL_NAME_COMMAND_LINE_ENTRY: return createToolNameCommandLineEntry();
			case AnalysisActivityDescriptionPackage.LITERAL_COMMAND_LINE_ENTRY_LIST: return createLiteralCommandLineEntryList();
			case AnalysisActivityDescriptionPackage.DATASET_COMMAND_LINE_ENTRY_LIST: return createDatasetCommandLineEntryList();
			case AnalysisActivityDescriptionPackage.PARAMETER_COMMAND_LINE_ENTRY_LIST: return createParameterCommandLineEntryList();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AnalysisActivityDescriptionPackage.PARAMETER_TYPE:
				return createParameterTypeFromString(eDataType, initialValue);
			case AnalysisActivityDescriptionPackage.TERMINATION_STATUS:
				return createTerminationStatusFromString(eDataType, initialValue);
			case AnalysisActivityDescriptionPackage.FILE_PATH:
				return createFilePathFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AnalysisActivityDescriptionPackage.PARAMETER_TYPE:
				return convertParameterTypeToString(eDataType, instanceValue);
			case AnalysisActivityDescriptionPackage.TERMINATION_STATUS:
				return convertTerminationStatusToString(eDataType, instanceValue);
			case AnalysisActivityDescriptionPackage.FILE_PATH:
				return convertFilePathToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputDataset createInputDataset() {
		InputDatasetImpl inputDataset = new InputDatasetImpl();
		return inputDataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputDataset createOutputDataset() {
		OutputDatasetImpl outputDataset = new OutputDatasetImpl();
		return outputDataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralCommandLineEntryList createLiteralCommandLineEntryList() {
		LiteralCommandLineEntryListImpl literalCommandLineEntryList = new LiteralCommandLineEntryListImpl();
		return literalCommandLineEntryList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatasetCommandLineEntryList createDatasetCommandLineEntryList() {
		DatasetCommandLineEntryListImpl datasetCommandLineEntryList = new DatasetCommandLineEntryListImpl();
		return datasetCommandLineEntryList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterCommandLineEntryList createParameterCommandLineEntryList() {
		ParameterCommandLineEntryListImpl parameterCommandLineEntryList = new ParameterCommandLineEntryListImpl();
		return parameterCommandLineEntryList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommandLineTool createCommandLineTool() {
		CommandLineToolImpl commandLineTool = new CommandLineToolImpl();
		return commandLineTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExitCode createExitCode() {
		ExitCodeImpl exitCode = new ExitCodeImpl();
		return exitCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ToolNameCommandLineEntry createToolNameCommandLineEntry() {
		ToolNameCommandLineEntryImpl toolNameCommandLineEntry = new ToolNameCommandLineEntryImpl();
		return toolNameCommandLineEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType createParameterTypeFromString(EDataType eDataType, String initialValue) {
		ParameterType result = ParameterType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminationStatus createTerminationStatusFromString(EDataType eDataType, String initialValue) {
		TerminationStatus result = TerminationStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTerminationStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFilePathFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFilePathToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnalysisActivityDescriptionPackage getAnalysisActivityDescriptionPackage() {
		return (AnalysisActivityDescriptionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AnalysisActivityDescriptionPackage getPackage() {
		return AnalysisActivityDescriptionPackage.eINSTANCE;
	}

} //AnalysisActivityDescriptionFactoryImpl
