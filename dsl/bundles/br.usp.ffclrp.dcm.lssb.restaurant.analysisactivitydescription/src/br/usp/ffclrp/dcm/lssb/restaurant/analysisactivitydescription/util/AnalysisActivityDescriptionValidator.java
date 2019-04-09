/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.util;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.*;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage
 * @generated
 */
public class AnalysisActivityDescriptionValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AnalysisActivityDescriptionValidator INSTANCE = new AnalysisActivityDescriptionValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisActivityDescriptionValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return AnalysisActivityDescriptionPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case AnalysisActivityDescriptionPackage.IDENTIFIABLE_ELEMENT:
				return validateIdentifiableElement((IdentifiableElement)value, diagnostics, context);
			case AnalysisActivityDescriptionPackage.ACTIVITY:
				return validateActivity((Activity)value, diagnostics, context);
			case AnalysisActivityDescriptionPackage.MULTIPLICITY_ELEMENT:
				return validateMultiplicityElement((MultiplicityElement)value, diagnostics, context);
			case AnalysisActivityDescriptionPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case AnalysisActivityDescriptionPackage.DATASET:
				return validateDataset((Dataset)value, diagnostics, context);
			case AnalysisActivityDescriptionPackage.INPUT_DATASET:
				return validateInputDataset((InputDataset)value, diagnostics, context);
			case AnalysisActivityDescriptionPackage.OUTPUT_DATASET:
				return validateOutputDataset((OutputDataset)value, diagnostics, context);
			case AnalysisActivityDescriptionPackage.CONSTRAINT:
				return validateConstraint((Constraint)value, diagnostics, context);
			case AnalysisActivityDescriptionPackage.FUNCTIONAL_ENTITY:
				return validateFunctionalEntity((FunctionalEntity)value, diagnostics, context);
			case AnalysisActivityDescriptionPackage.COMMAND_LINE_TOOL:
				return validateCommandLineTool((CommandLineTool)value, diagnostics, context);
			case AnalysisActivityDescriptionPackage.EXIT_CODE:
				return validateExitCode((ExitCode)value, diagnostics, context);
			case AnalysisActivityDescriptionPackage.COMMAND_LINE_ENTRY_LIST:
				return validateCommandLineEntryList((CommandLineEntryList)value, diagnostics, context);
			case AnalysisActivityDescriptionPackage.TOOL_NAME_COMMAND_LINE_ENTRY:
				return validateToolNameCommandLineEntry((ToolNameCommandLineEntry)value, diagnostics, context);
			case AnalysisActivityDescriptionPackage.LITERAL_COMMAND_LINE_ENTRY_LIST:
				return validateLiteralCommandLineEntryList((LiteralCommandLineEntryList)value, diagnostics, context);
			case AnalysisActivityDescriptionPackage.DATASET_COMMAND_LINE_ENTRY_LIST:
				return validateDatasetCommandLineEntryList((DatasetCommandLineEntryList)value, diagnostics, context);
			case AnalysisActivityDescriptionPackage.PARAMETER_COMMAND_LINE_ENTRY_LIST:
				return validateParameterCommandLineEntryList((ParameterCommandLineEntryList)value, diagnostics, context);
			case AnalysisActivityDescriptionPackage.PARAMETER_TYPE:
				return validateParameterType((ParameterType)value, diagnostics, context);
			case AnalysisActivityDescriptionPackage.TERMINATION_STATUS:
				return validateTerminationStatus((TerminationStatus)value, diagnostics, context);
			case AnalysisActivityDescriptionPackage.FILE_PATH:
				return validateFilePath((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifiableElement(IdentifiableElement identifiableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identifiableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivity(Activity activity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityElement(MultiplicityElement multiplicityElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(multiplicityElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_OnlyPositiveNumbersForMinimumCardinality(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_OnlyPositiveNumbersOrMinusOneForMaximumCardinality(multiplicityElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OnlyPositiveNumbersForMinimumCardinality constraint of '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MULTIPLICITY_ELEMENT__ONLY_POSITIVE_NUMBERS_FOR_MINIMUM_CARDINALITY__EEXPRESSION = "\n" +
		"            minimumCardinality >= 1";

	/**
	 * Validates the OnlyPositiveNumbersForMinimumCardinality constraint of '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityElement_OnlyPositiveNumbersForMinimumCardinality(MultiplicityElement multiplicityElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AnalysisActivityDescriptionPackage.Literals.MULTIPLICITY_ELEMENT,
				 multiplicityElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OnlyPositiveNumbersForMinimumCardinality",
				 MULTIPLICITY_ELEMENT__ONLY_POSITIVE_NUMBERS_FOR_MINIMUM_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the OnlyPositiveNumbersOrMinusOneForMaximumCardinality constraint of '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MULTIPLICITY_ELEMENT__ONLY_POSITIVE_NUMBERS_OR_MINUS_ONE_FOR_MAXIMUM_CARDINALITY__EEXPRESSION = "\n" +
		"            maximumCardinality >= 1 or maximumCardinality = -1";

	/**
	 * Validates the OnlyPositiveNumbersOrMinusOneForMaximumCardinality constraint of '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityElement_OnlyPositiveNumbersOrMinusOneForMaximumCardinality(MultiplicityElement multiplicityElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AnalysisActivityDescriptionPackage.Literals.MULTIPLICITY_ELEMENT,
				 multiplicityElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OnlyPositiveNumbersOrMinusOneForMaximumCardinality",
				 MULTIPLICITY_ELEMENT__ONLY_POSITIVE_NUMBERS_OR_MINUS_ONE_FOR_MAXIMUM_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(parameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_OnlyPositiveNumbersForMinimumCardinality(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_OnlyPositiveNumbersOrMinusOneForMaximumCardinality(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_defaultValueCardinalityMustBeLessThanMaximun(parameter, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the defaultValueCardinalityMustBeLessThanMaximun constraint of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PARAMETER__DEFAULT_VALUE_CARDINALITY_MUST_BE_LESS_THAN_MAXIMUN__EEXPRESSION = "\n" +
		"            if maximumCardinality > 1 then\n" +
		"                defaultValue->size() <= maximumCardinality\n" +
		"            else true endif";

	/**
	 * Validates the defaultValueCardinalityMustBeLessThanMaximun constraint of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter_defaultValueCardinalityMustBeLessThanMaximun(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AnalysisActivityDescriptionPackage.Literals.PARAMETER,
				 parameter,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "defaultValueCardinalityMustBeLessThanMaximun",
				 PARAMETER__DEFAULT_VALUE_CARDINALITY_MUST_BE_LESS_THAN_MAXIMUN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataset(Dataset dataset, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataset, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataset, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataset, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataset, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataset, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataset, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataset, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataset, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataset, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_OnlyPositiveNumbersForMinimumCardinality(dataset, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_OnlyPositiveNumbersOrMinusOneForMaximumCardinality(dataset, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputDataset(InputDataset inputDataset, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(inputDataset, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(inputDataset, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(inputDataset, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(inputDataset, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(inputDataset, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(inputDataset, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(inputDataset, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(inputDataset, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(inputDataset, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_OnlyPositiveNumbersForMinimumCardinality(inputDataset, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_OnlyPositiveNumbersOrMinusOneForMaximumCardinality(inputDataset, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputDataset(OutputDataset outputDataset, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(outputDataset, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(outputDataset, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(outputDataset, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(outputDataset, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(outputDataset, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(outputDataset, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(outputDataset, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(outputDataset, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(outputDataset, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_OnlyPositiveNumbersForMinimumCardinality(outputDataset, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_OnlyPositiveNumbersOrMinusOneForMaximumCardinality(outputDataset, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraint(Constraint constraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommandLineEntryList(CommandLineEntryList commandLineEntryList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(commandLineEntryList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateToolNameCommandLineEntry(ToolNameCommandLineEntry toolNameCommandLineEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(toolNameCommandLineEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralCommandLineEntryList(LiteralCommandLineEntryList literalCommandLineEntryList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(literalCommandLineEntryList, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(literalCommandLineEntryList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(literalCommandLineEntryList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(literalCommandLineEntryList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(literalCommandLineEntryList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(literalCommandLineEntryList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(literalCommandLineEntryList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(literalCommandLineEntryList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(literalCommandLineEntryList, diagnostics, context);
		if (result || diagnostics != null) result &= validateLiteralCommandLineEntryList_OneOrMoreLiterals(literalCommandLineEntryList, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OneOrMoreLiterals constraint of '<em>Literal Command Line Entry List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LITERAL_COMMAND_LINE_ENTRY_LIST__ONE_OR_MORE_LITERALS__EEXPRESSION = "\n" +
		"            literals->size() > 0";

	/**
	 * Validates the OneOrMoreLiterals constraint of '<em>Literal Command Line Entry List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralCommandLineEntryList_OneOrMoreLiterals(LiteralCommandLineEntryList literalCommandLineEntryList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AnalysisActivityDescriptionPackage.Literals.LITERAL_COMMAND_LINE_ENTRY_LIST,
				 literalCommandLineEntryList,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OneOrMoreLiterals",
				 LITERAL_COMMAND_LINE_ENTRY_LIST__ONE_OR_MORE_LITERALS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatasetCommandLineEntryList(DatasetCommandLineEntryList datasetCommandLineEntryList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datasetCommandLineEntryList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterCommandLineEntryList(ParameterCommandLineEntryList parameterCommandLineEntryList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterCommandLineEntryList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalEntity(FunctionalEntity functionalEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionalEntity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommandLineTool(CommandLineTool commandLineTool, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(commandLineTool, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(commandLineTool, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(commandLineTool, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(commandLineTool, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(commandLineTool, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(commandLineTool, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(commandLineTool, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(commandLineTool, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(commandLineTool, diagnostics, context);
		if (result || diagnostics != null) result &= validateCommandLineTool_stdInMustBeInputDatasetInRelatedActivity(commandLineTool, diagnostics, context);
		if (result || diagnostics != null) result &= validateCommandLineTool_stdOutMustBeOutputDatasetInRelatedActivity(commandLineTool, diagnostics, context);
		if (result || diagnostics != null) result &= validateCommandLineTool_stdErrMustBeOutputDatasetInRelatedActivity(commandLineTool, diagnostics, context);
		if (result || diagnostics != null) result &= validateCommandLineTool_stdInMustHave1AsCardinality(commandLineTool, diagnostics, context);
		if (result || diagnostics != null) result &= validateCommandLineTool_stdOutMustHave1AsCardinality(commandLineTool, diagnostics, context);
		if (result || diagnostics != null) result &= validateCommandLineTool_stdErrMustHave1AsCardinality(commandLineTool, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the stdInMustBeInputDatasetInRelatedActivity constraint of '<em>Command Line Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMMAND_LINE_TOOL__STD_IN_MUST_BE_INPUT_DATASET_IN_RELATED_ACTIVITY__EEXPRESSION = "\n" +
		"            if not self.standardInputStream.oclIsUndefined() then\n" +
		"                self.activity.inputDatasets->includes(self.standardInputStream)\n" +
		"            else true endif";

	/**
	 * Validates the stdInMustBeInputDatasetInRelatedActivity constraint of '<em>Command Line Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommandLineTool_stdInMustBeInputDatasetInRelatedActivity(CommandLineTool commandLineTool, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AnalysisActivityDescriptionPackage.Literals.COMMAND_LINE_TOOL,
				 commandLineTool,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "stdInMustBeInputDatasetInRelatedActivity",
				 COMMAND_LINE_TOOL__STD_IN_MUST_BE_INPUT_DATASET_IN_RELATED_ACTIVITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the stdOutMustBeOutputDatasetInRelatedActivity constraint of '<em>Command Line Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMMAND_LINE_TOOL__STD_OUT_MUST_BE_OUTPUT_DATASET_IN_RELATED_ACTIVITY__EEXPRESSION = "\n" +
		"            if not self.standardOutputStream.oclIsUndefined() then\n" +
		"                self.activity.outputDatasets->includes(self.standardOutputStream)\n" +
		"            else true endif";

	/**
	 * Validates the stdOutMustBeOutputDatasetInRelatedActivity constraint of '<em>Command Line Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommandLineTool_stdOutMustBeOutputDatasetInRelatedActivity(CommandLineTool commandLineTool, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AnalysisActivityDescriptionPackage.Literals.COMMAND_LINE_TOOL,
				 commandLineTool,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "stdOutMustBeOutputDatasetInRelatedActivity",
				 COMMAND_LINE_TOOL__STD_OUT_MUST_BE_OUTPUT_DATASET_IN_RELATED_ACTIVITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the stdErrMustBeOutputDatasetInRelatedActivity constraint of '<em>Command Line Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMMAND_LINE_TOOL__STD_ERR_MUST_BE_OUTPUT_DATASET_IN_RELATED_ACTIVITY__EEXPRESSION = "\n" +
		"            if not self.standardErrorStream.oclIsUndefined() then\n" +
		"                self.activity.outputDatasets->includes(self.standardErrorStream)\n" +
		"            else true endif";

	/**
	 * Validates the stdErrMustBeOutputDatasetInRelatedActivity constraint of '<em>Command Line Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommandLineTool_stdErrMustBeOutputDatasetInRelatedActivity(CommandLineTool commandLineTool, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AnalysisActivityDescriptionPackage.Literals.COMMAND_LINE_TOOL,
				 commandLineTool,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "stdErrMustBeOutputDatasetInRelatedActivity",
				 COMMAND_LINE_TOOL__STD_ERR_MUST_BE_OUTPUT_DATASET_IN_RELATED_ACTIVITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the stdInMustHave1AsCardinality constraint of '<em>Command Line Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMMAND_LINE_TOOL__STD_IN_MUST_HAVE1_AS_CARDINALITY__EEXPRESSION = "\n" +
		"            if not self.standardInputStream.oclIsUndefined() then\n" +
		"                self.standardInputStream.minimumCardinality = 1\n" +
		"                and self.standardInputStream.maximumCardinality = 1\n" +
		"            else \n" +
		"                true \n" +
		"            endif";

	/**
	 * Validates the stdInMustHave1AsCardinality constraint of '<em>Command Line Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommandLineTool_stdInMustHave1AsCardinality(CommandLineTool commandLineTool, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AnalysisActivityDescriptionPackage.Literals.COMMAND_LINE_TOOL,
				 commandLineTool,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "stdInMustHave1AsCardinality",
				 COMMAND_LINE_TOOL__STD_IN_MUST_HAVE1_AS_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the stdOutMustHave1AsCardinality constraint of '<em>Command Line Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMMAND_LINE_TOOL__STD_OUT_MUST_HAVE1_AS_CARDINALITY__EEXPRESSION = "\n" +
		"            if not self.standardOutputStream.oclIsUndefined() then\n" +
		"                self.standardOutputStream.minimumCardinality = 1\n" +
		"                and self.standardOutputStream.maximumCardinality = 1\n" +
		"            else \n" +
		"                true \n" +
		"            endif";

	/**
	 * Validates the stdOutMustHave1AsCardinality constraint of '<em>Command Line Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommandLineTool_stdOutMustHave1AsCardinality(CommandLineTool commandLineTool, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AnalysisActivityDescriptionPackage.Literals.COMMAND_LINE_TOOL,
				 commandLineTool,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "stdOutMustHave1AsCardinality",
				 COMMAND_LINE_TOOL__STD_OUT_MUST_HAVE1_AS_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the stdErrMustHave1AsCardinality constraint of '<em>Command Line Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMMAND_LINE_TOOL__STD_ERR_MUST_HAVE1_AS_CARDINALITY__EEXPRESSION = "\n" +
		"            if not self.standardErrorStream.oclIsUndefined() then\n" +
		"                self.standardErrorStream.minimumCardinality = 1\n" +
		"                and self.standardErrorStream.maximumCardinality = 1\n" +
		"            else \n" +
		"                true \n" +
		"            endif";

	/**
	 * Validates the stdErrMustHave1AsCardinality constraint of '<em>Command Line Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommandLineTool_stdErrMustHave1AsCardinality(CommandLineTool commandLineTool, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AnalysisActivityDescriptionPackage.Literals.COMMAND_LINE_TOOL,
				 commandLineTool,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "stdErrMustHave1AsCardinality",
				 COMMAND_LINE_TOOL__STD_ERR_MUST_HAVE1_AS_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExitCode(ExitCode exitCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exitCode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterType(ParameterType parameterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminationStatus(TerminationStatus terminationStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilePath(String filePath, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //AnalysisActivityDescriptionValidator
