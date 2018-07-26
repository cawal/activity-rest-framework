/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.util;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.*;

import java.util.List;
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
			case AnalysisActivityDescriptionPackage.ANALYSIS_ACTIVITY_DESCRIPTION:
				return validateAnalysisActivityDescription((AnalysisActivityDescription)value, diagnostics, context);
			case AnalysisActivityDescriptionPackage.PARAMETER_DESCRIPTION:
				return validateParameterDescription((ParameterDescription)value, diagnostics, context);
			case AnalysisActivityDescriptionPackage.DATASET_DESCRIPTION:
				return validateDatasetDescription((DatasetDescription)value, diagnostics, context);
			case AnalysisActivityDescriptionPackage.COMMAND_LINE_ENTRY_LIST:
				return validateCommandLineEntryList((CommandLineEntryList)value, diagnostics, context);
			case AnalysisActivityDescriptionPackage.LITERAL_COMMAND_LINE_ENTRY_LIST:
				return validateLiteralCommandLineEntryList((LiteralCommandLineEntryList)value, diagnostics, context);
			case AnalysisActivityDescriptionPackage.DATASET_COMMAND_LINE_ENTRY_LIST:
				return validateDatasetCommandLineEntryList((DatasetCommandLineEntryList)value, diagnostics, context);
			case AnalysisActivityDescriptionPackage.PARAMETER_COMMAND_LINE_ENTRY_LIST:
				return validateParameterCommandLineEntryList((ParameterCommandLineEntryList)value, diagnostics, context);
			case AnalysisActivityDescriptionPackage.READINESS_CONSTRAINT:
				return validateReadinessConstraint((ReadinessConstraint)value, diagnostics, context);
			case AnalysisActivityDescriptionPackage.DATASET_CONSTRAINT:
				return validateDatasetConstraint((DatasetConstraint)value, diagnostics, context);
			case AnalysisActivityDescriptionPackage.MINIMUN_DATASET_CARDINALITY_CONSTRAINT:
				return validateMinimunDatasetCardinalityConstraint((MinimunDatasetCardinalityConstraint)value, diagnostics, context);
			case AnalysisActivityDescriptionPackage.MAXIMUN_DATASET_CARDINALITY_CONSTRAINT:
				return validateMaximunDatasetCardinalityConstraint((MaximunDatasetCardinalityConstraint)value, diagnostics, context);
			case AnalysisActivityDescriptionPackage.PARAMETER_CONSTRAINT:
				return validateParameterConstraint((ParameterConstraint)value, diagnostics, context);
			case AnalysisActivityDescriptionPackage.MINIMUN_PARAMETER_CARDINALITY_CONSTRAINT:
				return validateMinimunParameterCardinalityConstraint((MinimunParameterCardinalityConstraint)value, diagnostics, context);
			case AnalysisActivityDescriptionPackage.MAXIMUN_PARAMETER_CARDINALITY_CONSTRAINT:
				return validateMaximunParameterCardinalityConstraint((MaximunParameterCardinalityConstraint)value, diagnostics, context);
			case AnalysisActivityDescriptionPackage.PARAMETER_KIND:
				return validateParameterKind((ParameterKind)value, diagnostics, context);
			case AnalysisActivityDescriptionPackage.PARAMETER_TYPE:
				return validateParameterType((ParameterType)value, diagnostics, context);
			case AnalysisActivityDescriptionPackage.DATASET_KIND:
				return validateDatasetKind((DatasetKind)value, diagnostics, context);
			case AnalysisActivityDescriptionPackage.LIST:
				return validateList((List<?>)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnalysisActivityDescription(AnalysisActivityDescription analysisActivityDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(analysisActivityDescription, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(analysisActivityDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(analysisActivityDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(analysisActivityDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(analysisActivityDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(analysisActivityDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(analysisActivityDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(analysisActivityDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(analysisActivityDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnalysisActivityDescription_noStdInAmongOutputs(analysisActivityDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnalysisActivityDescription_noStdOutOrStdErrAmongInputs(analysisActivityDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnalysisActivityDescription_onlyOneSdtInAmongInputs(analysisActivityDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnalysisActivityDescription_onlyOneSdtOutAmongOutputs(analysisActivityDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnalysisActivityDescription_onlyOneSdtErrAmongOutputs(analysisActivityDescription, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the noStdInAmongOutputs constraint of '<em>Analysis Activity Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ANALYSIS_ACTIVITY_DESCRIPTION__NO_STD_IN_AMONG_OUTPUTS__EEXPRESSION = "\n" +
		"            0 = self.outputDatasets->collect(d :DatasetDescription \n" +
		"                | d.datasetKind = '#STANDARD_INPUT'\n" +
		"            )->size()";

	/**
	 * Validates the noStdInAmongOutputs constraint of '<em>Analysis Activity Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnalysisActivityDescription_noStdInAmongOutputs(AnalysisActivityDescription analysisActivityDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AnalysisActivityDescriptionPackage.Literals.ANALYSIS_ACTIVITY_DESCRIPTION,
				 analysisActivityDescription,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noStdInAmongOutputs",
				 ANALYSIS_ACTIVITY_DESCRIPTION__NO_STD_IN_AMONG_OUTPUTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the noStdOutOrStdErrAmongInputs constraint of '<em>Analysis Activity Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ANALYSIS_ACTIVITY_DESCRIPTION__NO_STD_OUT_OR_STD_ERR_AMONG_INPUTS__EEXPRESSION = "\n" +
		"            0 = self.inputDatasets->collect(d :DatasetDescription \n" +
		"                | d.datasetKind = '#STANDARD_OUTPUT' or d.datasetKind = '#STANDARD_ERR'\n" +
		"            )->size()";

	/**
	 * Validates the noStdOutOrStdErrAmongInputs constraint of '<em>Analysis Activity Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnalysisActivityDescription_noStdOutOrStdErrAmongInputs(AnalysisActivityDescription analysisActivityDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AnalysisActivityDescriptionPackage.Literals.ANALYSIS_ACTIVITY_DESCRIPTION,
				 analysisActivityDescription,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noStdOutOrStdErrAmongInputs",
				 ANALYSIS_ACTIVITY_DESCRIPTION__NO_STD_OUT_OR_STD_ERR_AMONG_INPUTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the onlyOneSdtInAmongInputs constraint of '<em>Analysis Activity Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ANALYSIS_ACTIVITY_DESCRIPTION__ONLY_ONE_SDT_IN_AMONG_INPUTS__EEXPRESSION = " \n" +
		"            2 > self.inputDatasets->collect(d :DatasetDescription \n" +
		"                | d.datasetKind = '#STANDARD_INPUT'\n" +
		"            )->size()";

	/**
	 * Validates the onlyOneSdtInAmongInputs constraint of '<em>Analysis Activity Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnalysisActivityDescription_onlyOneSdtInAmongInputs(AnalysisActivityDescription analysisActivityDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AnalysisActivityDescriptionPackage.Literals.ANALYSIS_ACTIVITY_DESCRIPTION,
				 analysisActivityDescription,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "onlyOneSdtInAmongInputs",
				 ANALYSIS_ACTIVITY_DESCRIPTION__ONLY_ONE_SDT_IN_AMONG_INPUTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the onlyOneSdtOutAmongOutputs constraint of '<em>Analysis Activity Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ANALYSIS_ACTIVITY_DESCRIPTION__ONLY_ONE_SDT_OUT_AMONG_OUTPUTS__EEXPRESSION = " \n" +
		"            2 > self.outputDatasets->collect(d :DatasetDescription \n" +
		"                | d.datasetKind = '#STANDARD_OUTPUT'\n" +
		"            )->size()";

	/**
	 * Validates the onlyOneSdtOutAmongOutputs constraint of '<em>Analysis Activity Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnalysisActivityDescription_onlyOneSdtOutAmongOutputs(AnalysisActivityDescription analysisActivityDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AnalysisActivityDescriptionPackage.Literals.ANALYSIS_ACTIVITY_DESCRIPTION,
				 analysisActivityDescription,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "onlyOneSdtOutAmongOutputs",
				 ANALYSIS_ACTIVITY_DESCRIPTION__ONLY_ONE_SDT_OUT_AMONG_OUTPUTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the onlyOneSdtErrAmongOutputs constraint of '<em>Analysis Activity Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ANALYSIS_ACTIVITY_DESCRIPTION__ONLY_ONE_SDT_ERR_AMONG_OUTPUTS__EEXPRESSION = " \n" +
		"            2 > self.outputDatasets->collect(d :DatasetDescription \n" +
		"                | d.datasetKind = '#STANDARD_ERR'\n" +
		"            )->size()";

	/**
	 * Validates the onlyOneSdtErrAmongOutputs constraint of '<em>Analysis Activity Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnalysisActivityDescription_onlyOneSdtErrAmongOutputs(AnalysisActivityDescription analysisActivityDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AnalysisActivityDescriptionPackage.Literals.ANALYSIS_ACTIVITY_DESCRIPTION,
				 analysisActivityDescription,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "onlyOneSdtErrAmongOutputs",
				 ANALYSIS_ACTIVITY_DESCRIPTION__ONLY_ONE_SDT_ERR_AMONG_OUTPUTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterDescription(ParameterDescription parameterDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterDescription, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatasetDescription(DatasetDescription datasetDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datasetDescription, diagnostics, context);
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
	public boolean validateLiteralCommandLineEntryList(LiteralCommandLineEntryList literalCommandLineEntryList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(literalCommandLineEntryList, diagnostics, context);
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
	public boolean validateReadinessConstraint(ReadinessConstraint readinessConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(readinessConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatasetConstraint(DatasetConstraint datasetConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datasetConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMinimunDatasetCardinalityConstraint(MinimunDatasetCardinalityConstraint minimunDatasetCardinalityConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(minimunDatasetCardinalityConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(minimunDatasetCardinalityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(minimunDatasetCardinalityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(minimunDatasetCardinalityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(minimunDatasetCardinalityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(minimunDatasetCardinalityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(minimunDatasetCardinalityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(minimunDatasetCardinalityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(minimunDatasetCardinalityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateMinimunDatasetCardinalityConstraint_OnlyPositiveNumbers(minimunDatasetCardinalityConstraint, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OnlyPositiveNumbers constraint of '<em>Minimun Dataset Cardinality Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MINIMUN_DATASET_CARDINALITY_CONSTRAINT__ONLY_POSITIVE_NUMBERS__EEXPRESSION = "\n" +
		"            value >= 1";

	/**
	 * Validates the OnlyPositiveNumbers constraint of '<em>Minimun Dataset Cardinality Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMinimunDatasetCardinalityConstraint_OnlyPositiveNumbers(MinimunDatasetCardinalityConstraint minimunDatasetCardinalityConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AnalysisActivityDescriptionPackage.Literals.MINIMUN_DATASET_CARDINALITY_CONSTRAINT,
				 minimunDatasetCardinalityConstraint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OnlyPositiveNumbers",
				 MINIMUN_DATASET_CARDINALITY_CONSTRAINT__ONLY_POSITIVE_NUMBERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaximunDatasetCardinalityConstraint(MaximunDatasetCardinalityConstraint maximunDatasetCardinalityConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(maximunDatasetCardinalityConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(maximunDatasetCardinalityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(maximunDatasetCardinalityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(maximunDatasetCardinalityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(maximunDatasetCardinalityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(maximunDatasetCardinalityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(maximunDatasetCardinalityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(maximunDatasetCardinalityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(maximunDatasetCardinalityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateMaximunDatasetCardinalityConstraint_OnlyPositiveNumbersOrInfinite(maximunDatasetCardinalityConstraint, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OnlyPositiveNumbersOrInfinite constraint of '<em>Maximun Dataset Cardinality Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MAXIMUN_DATASET_CARDINALITY_CONSTRAINT__ONLY_POSITIVE_NUMBERS_OR_INFINITE__EEXPRESSION = "\n" +
		"            value = -1 or value > 0";

	/**
	 * Validates the OnlyPositiveNumbersOrInfinite constraint of '<em>Maximun Dataset Cardinality Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaximunDatasetCardinalityConstraint_OnlyPositiveNumbersOrInfinite(MaximunDatasetCardinalityConstraint maximunDatasetCardinalityConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AnalysisActivityDescriptionPackage.Literals.MAXIMUN_DATASET_CARDINALITY_CONSTRAINT,
				 maximunDatasetCardinalityConstraint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OnlyPositiveNumbersOrInfinite",
				 MAXIMUN_DATASET_CARDINALITY_CONSTRAINT__ONLY_POSITIVE_NUMBERS_OR_INFINITE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterConstraint(ParameterConstraint parameterConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMinimunParameterCardinalityConstraint(MinimunParameterCardinalityConstraint minimunParameterCardinalityConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(minimunParameterCardinalityConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(minimunParameterCardinalityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(minimunParameterCardinalityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(minimunParameterCardinalityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(minimunParameterCardinalityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(minimunParameterCardinalityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(minimunParameterCardinalityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(minimunParameterCardinalityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(minimunParameterCardinalityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateMinimunParameterCardinalityConstraint_OnlyPositiveNumbers(minimunParameterCardinalityConstraint, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OnlyPositiveNumbers constraint of '<em>Minimun Parameter Cardinality Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MINIMUN_PARAMETER_CARDINALITY_CONSTRAINT__ONLY_POSITIVE_NUMBERS__EEXPRESSION = "\n" +
		"            value >= 1";

	/**
	 * Validates the OnlyPositiveNumbers constraint of '<em>Minimun Parameter Cardinality Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMinimunParameterCardinalityConstraint_OnlyPositiveNumbers(MinimunParameterCardinalityConstraint minimunParameterCardinalityConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AnalysisActivityDescriptionPackage.Literals.MINIMUN_PARAMETER_CARDINALITY_CONSTRAINT,
				 minimunParameterCardinalityConstraint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OnlyPositiveNumbers",
				 MINIMUN_PARAMETER_CARDINALITY_CONSTRAINT__ONLY_POSITIVE_NUMBERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaximunParameterCardinalityConstraint(MaximunParameterCardinalityConstraint maximunParameterCardinalityConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(maximunParameterCardinalityConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(maximunParameterCardinalityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(maximunParameterCardinalityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(maximunParameterCardinalityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(maximunParameterCardinalityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(maximunParameterCardinalityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(maximunParameterCardinalityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(maximunParameterCardinalityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(maximunParameterCardinalityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateMaximunParameterCardinalityConstraint_OnlyPositiveNumbersOrInfinite(maximunParameterCardinalityConstraint, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OnlyPositiveNumbersOrInfinite constraint of '<em>Maximun Parameter Cardinality Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MAXIMUN_PARAMETER_CARDINALITY_CONSTRAINT__ONLY_POSITIVE_NUMBERS_OR_INFINITE__EEXPRESSION = "\n" +
		"            value = -1 or value > 0";

	/**
	 * Validates the OnlyPositiveNumbersOrInfinite constraint of '<em>Maximun Parameter Cardinality Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaximunParameterCardinalityConstraint_OnlyPositiveNumbersOrInfinite(MaximunParameterCardinalityConstraint maximunParameterCardinalityConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AnalysisActivityDescriptionPackage.Literals.MAXIMUN_PARAMETER_CARDINALITY_CONSTRAINT,
				 maximunParameterCardinalityConstraint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OnlyPositiveNumbersOrInfinite",
				 MAXIMUN_PARAMETER_CARDINALITY_CONSTRAINT__ONLY_POSITIVE_NUMBERS_OR_INFINITE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterKind(ParameterKind parameterKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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
	public boolean validateDatasetKind(DatasetKind datasetKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateList(List<?> list, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
