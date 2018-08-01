/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionFactory;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineEntryList;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineTool;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CustomConstraint;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CustomDatasetConstraint;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CustomParameterConstraint;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Dataset;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetCommandLineEntryList;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetReadinessConstraint;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ExitCode;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.InputDataset;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.LiteralCommandLineEntryList;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MaximunDatasetCardinalityConstraint;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MaximunParameterCardinalityConstraint;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MinimunDatasetCardinalityConstraint;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MinimunParameterCardinalityConstraint;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MultiplicityElement;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.OutputDataset;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Parameter;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterCommandLineEntryList;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterReadinessConstraint;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterType;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ReadinessConstraint;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.TerminationStatus;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Tool;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ToolNameCommandLineEntry;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.util.AnalysisActivityDescriptionValidator;
import br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.StringListManipulatorsPackage;
import br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.StringListManipulatorsPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnalysisActivityDescriptionPackageImpl extends EPackageImpl implements AnalysisActivityDescriptionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicityElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datasetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputDatasetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputDatasetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandLineEntryListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolNameCommandLineEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalCommandLineEntryListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datasetCommandLineEntryListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterCommandLineEntryListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readinessConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datasetReadinessConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterReadinessConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minimunDatasetCardinalityConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maximunDatasetCardinalityConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minimunParameterCardinalityConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maximunParameterCardinalityConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customParameterConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customDatasetConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandLineToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exitCodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum terminationStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType filePathEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AnalysisActivityDescriptionPackageImpl() {
		super(eNS_URI, AnalysisActivityDescriptionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AnalysisActivityDescriptionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AnalysisActivityDescriptionPackage init() {
		if (isInited) return (AnalysisActivityDescriptionPackage)EPackage.Registry.INSTANCE.getEPackage(AnalysisActivityDescriptionPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAnalysisActivityDescriptionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AnalysisActivityDescriptionPackageImpl theAnalysisActivityDescriptionPackage = registeredAnalysisActivityDescriptionPackage instanceof AnalysisActivityDescriptionPackageImpl ? (AnalysisActivityDescriptionPackageImpl)registeredAnalysisActivityDescriptionPackage : new AnalysisActivityDescriptionPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StringListManipulatorsPackage.eNS_URI);
		StringListManipulatorsPackageImpl theStringListManipulatorsPackage = (StringListManipulatorsPackageImpl)(registeredPackage instanceof StringListManipulatorsPackageImpl ? registeredPackage : StringListManipulatorsPackage.eINSTANCE);

		// Create package meta-data objects
		theAnalysisActivityDescriptionPackage.createPackageContents();
		theStringListManipulatorsPackage.createPackageContents();

		// Initialize created meta-data
		theAnalysisActivityDescriptionPackage.initializePackageContents();
		theStringListManipulatorsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theAnalysisActivityDescriptionPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return AnalysisActivityDescriptionValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theAnalysisActivityDescriptionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AnalysisActivityDescriptionPackage.eNS_URI, theAnalysisActivityDescriptionPackage);
		return theAnalysisActivityDescriptionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_Name() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_Description() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Parameters() {
		return (EReference)activityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_InputDatasets() {
		return (EReference)activityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_OutputDatasets() {
		return (EReference)activityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_ReadinessContraints() {
		return (EReference)activityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Tool() {
		return (EReference)activityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplicityElement() {
		return multiplicityElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_MinimumCardinality() {
		return (EAttribute)multiplicityElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_MaximumCardinality() {
		return (EAttribute)multiplicityElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Name() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_ParameterType() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_DefaultValue() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataset() {
		return datasetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataset_Name() {
		return (EAttribute)datasetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataset_Mimetype() {
		return (EAttribute)datasetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputDataset() {
		return inputDatasetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputDataset() {
		return outputDatasetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandLineEntryList() {
		return commandLineEntryListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandLineEntryList_Manipulators() {
		return (EReference)commandLineEntryListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToolNameCommandLineEntry() {
		return toolNameCommandLineEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralCommandLineEntryList() {
		return literalCommandLineEntryListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralCommandLineEntryList_Literals() {
		return (EAttribute)literalCommandLineEntryListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatasetCommandLineEntryList() {
		return datasetCommandLineEntryListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatasetCommandLineEntryList_Dataset() {
		return (EReference)datasetCommandLineEntryListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterCommandLineEntryList() {
		return parameterCommandLineEntryListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterCommandLineEntryList_Parameter() {
		return (EReference)parameterCommandLineEntryListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadinessConstraint() {
		return readinessConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatasetReadinessConstraint() {
		return datasetReadinessConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatasetReadinessConstraint_Dataset() {
		return (EReference)datasetReadinessConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterReadinessConstraint() {
		return parameterReadinessConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterReadinessConstraint_Parameter() {
		return (EReference)parameterReadinessConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinimunDatasetCardinalityConstraint() {
		return minimunDatasetCardinalityConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMinimunDatasetCardinalityConstraint_Value() {
		return (EAttribute)minimunDatasetCardinalityConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaximunDatasetCardinalityConstraint() {
		return maximunDatasetCardinalityConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaximunDatasetCardinalityConstraint_Value() {
		return (EAttribute)maximunDatasetCardinalityConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinimunParameterCardinalityConstraint() {
		return minimunParameterCardinalityConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMinimunParameterCardinalityConstraint_Value() {
		return (EAttribute)minimunParameterCardinalityConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaximunParameterCardinalityConstraint() {
		return maximunParameterCardinalityConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaximunParameterCardinalityConstraint_Value() {
		return (EAttribute)maximunParameterCardinalityConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomConstraint() {
		return customConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomConstraint_Name() {
		return (EAttribute)customConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomParameterConstraint() {
		return customParameterConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomDatasetConstraint() {
		return customDatasetConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTool() {
		return toolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTool_Name() {
		return (EAttribute)toolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTool_Activity() {
		return (EReference)toolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandLineTool() {
		return commandLineToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandLineTool_ExecutablePath() {
		return (EAttribute)commandLineToolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandLineTool_CommandLineTemplate() {
		return (EReference)commandLineToolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandLineTool_StandardInputStream() {
		return (EReference)commandLineToolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandLineTool_StandardOutputStream() {
		return (EReference)commandLineToolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandLineTool_StandardErrorStream() {
		return (EReference)commandLineToolEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandLineTool_ExitCodes() {
		return (EReference)commandLineToolEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExitCode() {
		return exitCodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExitCode_Code() {
		return (EAttribute)exitCodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExitCode_ReportMessage() {
		return (EAttribute)exitCodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExitCode_Status() {
		return (EAttribute)exitCodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParameterType() {
		return parameterTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTerminationStatus() {
		return terminationStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFilePath() {
		return filePathEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisActivityDescriptionFactory getAnalysisActivityDescriptionFactory() {
		return (AnalysisActivityDescriptionFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		activityEClass = createEClass(ACTIVITY);
		createEAttribute(activityEClass, ACTIVITY__NAME);
		createEAttribute(activityEClass, ACTIVITY__DESCRIPTION);
		createEReference(activityEClass, ACTIVITY__PARAMETERS);
		createEReference(activityEClass, ACTIVITY__INPUT_DATASETS);
		createEReference(activityEClass, ACTIVITY__OUTPUT_DATASETS);
		createEReference(activityEClass, ACTIVITY__READINESS_CONTRAINTS);
		createEReference(activityEClass, ACTIVITY__TOOL);

		multiplicityElementEClass = createEClass(MULTIPLICITY_ELEMENT);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__MINIMUM_CARDINALITY);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__MAXIMUM_CARDINALITY);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);
		createEAttribute(parameterEClass, PARAMETER__PARAMETER_TYPE);
		createEAttribute(parameterEClass, PARAMETER__DEFAULT_VALUE);

		datasetEClass = createEClass(DATASET);
		createEAttribute(datasetEClass, DATASET__NAME);
		createEAttribute(datasetEClass, DATASET__MIMETYPE);

		inputDatasetEClass = createEClass(INPUT_DATASET);

		outputDatasetEClass = createEClass(OUTPUT_DATASET);

		readinessConstraintEClass = createEClass(READINESS_CONSTRAINT);

		datasetReadinessConstraintEClass = createEClass(DATASET_READINESS_CONSTRAINT);
		createEReference(datasetReadinessConstraintEClass, DATASET_READINESS_CONSTRAINT__DATASET);

		parameterReadinessConstraintEClass = createEClass(PARAMETER_READINESS_CONSTRAINT);
		createEReference(parameterReadinessConstraintEClass, PARAMETER_READINESS_CONSTRAINT__PARAMETER);

		minimunDatasetCardinalityConstraintEClass = createEClass(MINIMUN_DATASET_CARDINALITY_CONSTRAINT);
		createEAttribute(minimunDatasetCardinalityConstraintEClass, MINIMUN_DATASET_CARDINALITY_CONSTRAINT__VALUE);

		maximunDatasetCardinalityConstraintEClass = createEClass(MAXIMUN_DATASET_CARDINALITY_CONSTRAINT);
		createEAttribute(maximunDatasetCardinalityConstraintEClass, MAXIMUN_DATASET_CARDINALITY_CONSTRAINT__VALUE);

		minimunParameterCardinalityConstraintEClass = createEClass(MINIMUN_PARAMETER_CARDINALITY_CONSTRAINT);
		createEAttribute(minimunParameterCardinalityConstraintEClass, MINIMUN_PARAMETER_CARDINALITY_CONSTRAINT__VALUE);

		maximunParameterCardinalityConstraintEClass = createEClass(MAXIMUN_PARAMETER_CARDINALITY_CONSTRAINT);
		createEAttribute(maximunParameterCardinalityConstraintEClass, MAXIMUN_PARAMETER_CARDINALITY_CONSTRAINT__VALUE);

		customConstraintEClass = createEClass(CUSTOM_CONSTRAINT);
		createEAttribute(customConstraintEClass, CUSTOM_CONSTRAINT__NAME);

		customParameterConstraintEClass = createEClass(CUSTOM_PARAMETER_CONSTRAINT);

		customDatasetConstraintEClass = createEClass(CUSTOM_DATASET_CONSTRAINT);

		toolEClass = createEClass(TOOL);
		createEAttribute(toolEClass, TOOL__NAME);
		createEReference(toolEClass, TOOL__ACTIVITY);

		commandLineToolEClass = createEClass(COMMAND_LINE_TOOL);
		createEAttribute(commandLineToolEClass, COMMAND_LINE_TOOL__EXECUTABLE_PATH);
		createEReference(commandLineToolEClass, COMMAND_LINE_TOOL__COMMAND_LINE_TEMPLATE);
		createEReference(commandLineToolEClass, COMMAND_LINE_TOOL__STANDARD_INPUT_STREAM);
		createEReference(commandLineToolEClass, COMMAND_LINE_TOOL__STANDARD_OUTPUT_STREAM);
		createEReference(commandLineToolEClass, COMMAND_LINE_TOOL__STANDARD_ERROR_STREAM);
		createEReference(commandLineToolEClass, COMMAND_LINE_TOOL__EXIT_CODES);

		exitCodeEClass = createEClass(EXIT_CODE);
		createEAttribute(exitCodeEClass, EXIT_CODE__CODE);
		createEAttribute(exitCodeEClass, EXIT_CODE__REPORT_MESSAGE);
		createEAttribute(exitCodeEClass, EXIT_CODE__STATUS);

		commandLineEntryListEClass = createEClass(COMMAND_LINE_ENTRY_LIST);
		createEReference(commandLineEntryListEClass, COMMAND_LINE_ENTRY_LIST__MANIPULATORS);

		toolNameCommandLineEntryEClass = createEClass(TOOL_NAME_COMMAND_LINE_ENTRY);

		literalCommandLineEntryListEClass = createEClass(LITERAL_COMMAND_LINE_ENTRY_LIST);
		createEAttribute(literalCommandLineEntryListEClass, LITERAL_COMMAND_LINE_ENTRY_LIST__LITERALS);

		datasetCommandLineEntryListEClass = createEClass(DATASET_COMMAND_LINE_ENTRY_LIST);
		createEReference(datasetCommandLineEntryListEClass, DATASET_COMMAND_LINE_ENTRY_LIST__DATASET);

		parameterCommandLineEntryListEClass = createEClass(PARAMETER_COMMAND_LINE_ENTRY_LIST);
		createEReference(parameterCommandLineEntryListEClass, PARAMETER_COMMAND_LINE_ENTRY_LIST__PARAMETER);

		// Create enums
		parameterTypeEEnum = createEEnum(PARAMETER_TYPE);
		terminationStatusEEnum = createEEnum(TERMINATION_STATUS);

		// Create data types
		filePathEDataType = createEDataType(FILE_PATH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		StringListManipulatorsPackage theStringListManipulatorsPackage = (StringListManipulatorsPackage)EPackage.Registry.INSTANCE.getEPackage(StringListManipulatorsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		parameterEClass.getESuperTypes().add(this.getMultiplicityElement());
		datasetEClass.getESuperTypes().add(this.getMultiplicityElement());
		inputDatasetEClass.getESuperTypes().add(this.getDataset());
		outputDatasetEClass.getESuperTypes().add(this.getDataset());
		datasetReadinessConstraintEClass.getESuperTypes().add(this.getReadinessConstraint());
		parameterReadinessConstraintEClass.getESuperTypes().add(this.getReadinessConstraint());
		minimunDatasetCardinalityConstraintEClass.getESuperTypes().add(this.getDatasetReadinessConstraint());
		maximunDatasetCardinalityConstraintEClass.getESuperTypes().add(this.getDatasetReadinessConstraint());
		minimunParameterCardinalityConstraintEClass.getESuperTypes().add(this.getParameterReadinessConstraint());
		maximunParameterCardinalityConstraintEClass.getESuperTypes().add(this.getParameterReadinessConstraint());
		customConstraintEClass.getESuperTypes().add(this.getReadinessConstraint());
		customParameterConstraintEClass.getESuperTypes().add(this.getCustomConstraint());
		customParameterConstraintEClass.getESuperTypes().add(this.getParameterReadinessConstraint());
		customDatasetConstraintEClass.getESuperTypes().add(this.getCustomConstraint());
		customDatasetConstraintEClass.getESuperTypes().add(this.getDatasetReadinessConstraint());
		commandLineToolEClass.getESuperTypes().add(this.getTool());
		toolNameCommandLineEntryEClass.getESuperTypes().add(this.getCommandLineEntryList());
		literalCommandLineEntryListEClass.getESuperTypes().add(this.getCommandLineEntryList());
		datasetCommandLineEntryListEClass.getESuperTypes().add(this.getCommandLineEntryList());
		parameterCommandLineEntryListEClass.getESuperTypes().add(this.getCommandLineEntryList());

		// Initialize classes, features, and operations; add parameters
		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivity_Name(), ecorePackage.getEString(), "name", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_Description(), ecorePackage.getEString(), "description", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivity_InputDatasets(), this.getInputDataset(), null, "inputDatasets", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_OutputDatasets(), this.getOutputDataset(), null, "outputDatasets", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_ReadinessContraints(), this.getReadinessConstraint(), null, "readinessContraints", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivity_Tool(), this.getTool(), this.getTool_Activity(), "tool", null, 1, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiplicityElementEClass, MultiplicityElement.class, "MultiplicityElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiplicityElement_MinimumCardinality(), ecorePackage.getEBigInteger(), "minimumCardinality", "1", 1, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplicityElement_MaximumCardinality(), ecorePackage.getEBigInteger(), "maximumCardinality", "1", 1, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_ParameterType(), this.getParameterType(), "parameterType", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(datasetEClass, Dataset.class, "Dataset", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataset_Name(), ecorePackage.getEString(), "name", null, 1, 1, Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataset_Mimetype(), ecorePackage.getEString(), "mimetype", null, 0, 1, Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputDatasetEClass, InputDataset.class, "InputDataset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outputDatasetEClass, OutputDataset.class, "OutputDataset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(readinessConstraintEClass, ReadinessConstraint.class, "ReadinessConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(datasetReadinessConstraintEClass, DatasetReadinessConstraint.class, "DatasetReadinessConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatasetReadinessConstraint_Dataset(), this.getDataset(), null, "dataset", null, 1, 1, DatasetReadinessConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterReadinessConstraintEClass, ParameterReadinessConstraint.class, "ParameterReadinessConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterReadinessConstraint_Parameter(), this.getParameter(), null, "parameter", null, 1, 1, ParameterReadinessConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(minimunDatasetCardinalityConstraintEClass, MinimunDatasetCardinalityConstraint.class, "MinimunDatasetCardinalityConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMinimunDatasetCardinalityConstraint_Value(), ecorePackage.getEBigInteger(), "value", null, 0, 1, MinimunDatasetCardinalityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(maximunDatasetCardinalityConstraintEClass, MaximunDatasetCardinalityConstraint.class, "MaximunDatasetCardinalityConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaximunDatasetCardinalityConstraint_Value(), ecorePackage.getEBigInteger(), "value", null, 0, 1, MaximunDatasetCardinalityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(minimunParameterCardinalityConstraintEClass, MinimunParameterCardinalityConstraint.class, "MinimunParameterCardinalityConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMinimunParameterCardinalityConstraint_Value(), ecorePackage.getEBigInteger(), "value", null, 0, 1, MinimunParameterCardinalityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(maximunParameterCardinalityConstraintEClass, MaximunParameterCardinalityConstraint.class, "MaximunParameterCardinalityConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaximunParameterCardinalityConstraint_Value(), ecorePackage.getEBigInteger(), "value", null, 0, 1, MaximunParameterCardinalityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customConstraintEClass, CustomConstraint.class, "CustomConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomConstraint_Name(), ecorePackage.getEString(), "name", null, 1, 1, CustomConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customParameterConstraintEClass, CustomParameterConstraint.class, "CustomParameterConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(customDatasetConstraintEClass, CustomDatasetConstraint.class, "CustomDatasetConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(toolEClass, Tool.class, "Tool", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTool_Name(), ecorePackage.getEString(), "name", null, 1, 1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTool_Activity(), this.getActivity(), this.getActivity_Tool(), "activity", null, 0, 1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commandLineToolEClass, CommandLineTool.class, "CommandLineTool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommandLineTool_ExecutablePath(), this.getFilePath(), "executablePath", null, 0, 1, CommandLineTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommandLineTool_CommandLineTemplate(), this.getCommandLineEntryList(), null, "commandLineTemplate", null, 1, -1, CommandLineTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommandLineTool_StandardInputStream(), this.getInputDataset(), null, "standardInputStream", null, 0, 1, CommandLineTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommandLineTool_StandardOutputStream(), this.getOutputDataset(), null, "standardOutputStream", null, 0, 1, CommandLineTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommandLineTool_StandardErrorStream(), this.getOutputDataset(), null, "standardErrorStream", null, 0, 1, CommandLineTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommandLineTool_ExitCodes(), this.getExitCode(), null, "exitCodes", null, 0, -1, CommandLineTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(exitCodeEClass, ExitCode.class, "ExitCode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExitCode_Code(), ecorePackage.getEBigInteger(), "code", null, 1, 1, ExitCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExitCode_ReportMessage(), ecorePackage.getEString(), "reportMessage", null, 0, 1, ExitCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExitCode_Status(), this.getTerminationStatus(), "status", null, 1, 1, ExitCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commandLineEntryListEClass, CommandLineEntryList.class, "CommandLineEntryList", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommandLineEntryList_Manipulators(), theStringListManipulatorsPackage.getStringListManipulator(), null, "manipulators", null, 0, -1, CommandLineEntryList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(toolNameCommandLineEntryEClass, ToolNameCommandLineEntry.class, "ToolNameCommandLineEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(literalCommandLineEntryListEClass, LiteralCommandLineEntryList.class, "LiteralCommandLineEntryList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralCommandLineEntryList_Literals(), ecorePackage.getEString(), "literals", null, 0, -1, LiteralCommandLineEntryList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datasetCommandLineEntryListEClass, DatasetCommandLineEntryList.class, "DatasetCommandLineEntryList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatasetCommandLineEntryList_Dataset(), this.getDataset(), null, "dataset", null, 1, 1, DatasetCommandLineEntryList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterCommandLineEntryListEClass, ParameterCommandLineEntryList.class, "ParameterCommandLineEntryList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterCommandLineEntryList_Parameter(), this.getParameter(), null, "parameter", null, 1, 1, ParameterCommandLineEntryList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(parameterTypeEEnum, ParameterType.class, "ParameterType");
		addEEnumLiteral(parameterTypeEEnum, ParameterType.STRING);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.INTEGER);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.REAL);

		initEEnum(terminationStatusEEnum, TerminationStatus.class, "TerminationStatus");
		addEEnumLiteral(terminationStatusEEnum, TerminationStatus.SUCCEEDED);
		addEEnumLiteral(terminationStatusEEnum, TerminationStatus.FAILED);

		// Initialize data types
		initEDataType(filePathEDataType, String.class, "FilePath", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/OCL/Collection
		createCollectionAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "slm", "string-list-manipulators.ecore#/"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });
		addAnnotation
		  (multiplicityElementEClass,
		   source,
		   new String[] {
			   "constraints", "OnlyPositiveNumbersForMinimumCardinality OnlyPositiveNumbersOrMinusOneForMaximumCardinality"
		   });
		addAnnotation
		  (parameterEClass,
		   source,
		   new String[] {
			   "constraints", "defaultValueCardinalityMustBeLessThanMaximun"
		   });
		addAnnotation
		  (minimunDatasetCardinalityConstraintEClass,
		   source,
		   new String[] {
			   "constraints", "OnlyPositiveNumbers"
		   });
		addAnnotation
		  (maximunDatasetCardinalityConstraintEClass,
		   source,
		   new String[] {
			   "constraints", "OnlyPositiveNumbersOrInfinite"
		   });
		addAnnotation
		  (minimunParameterCardinalityConstraintEClass,
		   source,
		   new String[] {
			   "constraints", "OnlyPositiveNumbers"
		   });
		addAnnotation
		  (maximunParameterCardinalityConstraintEClass,
		   source,
		   new String[] {
			   "constraints", "OnlyPositiveNumbersOrInfinite"
		   });
		addAnnotation
		  (commandLineToolEClass,
		   source,
		   new String[] {
			   "constraints", "stdInMustBeInputDatasetInRelatedActivity stdOutMustBeOutputDatasetInRelatedActivity stdErrMustBeOutputDatasetInRelatedActivity stdInMustHave1AsCardinality stdOutMustHave1AsCardinality stdErrMustHave1AsCardinality"
		   });
		addAnnotation
		  (literalCommandLineEntryListEClass,
		   source,
		   new String[] {
			   "constraints", "OneOrMoreLiterals"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (multiplicityElementEClass,
		   source,
		   new String[] {
			   "OnlyPositiveNumbersForMinimumCardinality", "\n            minimumCardinality >= 1",
			   "OnlyPositiveNumbersOrMinusOneForMaximumCardinality", "\n            maximumCardinality >= 1 or maximumCardinality = -1"
		   });
		addAnnotation
		  (parameterEClass,
		   source,
		   new String[] {
			   "defaultValueCardinalityMustBeLessThanMaximun", "\n            if maximumCardinality > 1 then\n                defaultValue->size() <= maximumCardinality\n            else true endif"
		   });
		addAnnotation
		  (minimunDatasetCardinalityConstraintEClass,
		   source,
		   new String[] {
			   "OnlyPositiveNumbers", "\n            value >= 1"
		   });
		addAnnotation
		  (maximunDatasetCardinalityConstraintEClass,
		   source,
		   new String[] {
			   "OnlyPositiveNumbersOrInfinite", "\n            value = -1 or value > 0"
		   });
		addAnnotation
		  (minimunParameterCardinalityConstraintEClass,
		   source,
		   new String[] {
			   "OnlyPositiveNumbers", "\n            value >= 1"
		   });
		addAnnotation
		  (maximunParameterCardinalityConstraintEClass,
		   source,
		   new String[] {
			   "OnlyPositiveNumbersOrInfinite", "\n            value = -1 or value > 0"
		   });
		addAnnotation
		  (commandLineToolEClass,
		   source,
		   new String[] {
			   "stdInMustBeInputDatasetInRelatedActivity", "\n            if not self.standardInputStream.oclIsUndefined() then\n                self.activity.inputDatasets->includes(self.standardInputStream)\n            else true endif",
			   "stdOutMustBeOutputDatasetInRelatedActivity", "\n            if not self.standardOutputStream.oclIsUndefined() then\n                self.activity.outputDatasets->includes(self.standardOutputStream)\n            else true endif",
			   "stdErrMustBeOutputDatasetInRelatedActivity", "\n            if not self.standardErrorStream.oclIsUndefined() then\n                self.activity.outputDatasets->includes(self.standardErrorStream)\n            else true endif",
			   "stdInMustHave1AsCardinality", "\n            if not self.standardInputStream.oclIsUndefined() then\n                self.standardInputStream.minimumCardinality = 1\n                and self.standardInputStream.maximumCardinality = 1\n            else \n                true \n            endif",
			   "stdOutMustHave1AsCardinality", "\n            if not self.standardOutputStream.oclIsUndefined() then\n                self.standardOutputStream.minimumCardinality = 1\n                and self.standardOutputStream.maximumCardinality = 1\n            else \n                true \n            endif",
			   "stdErrMustHave1AsCardinality", "\n            if not self.standardErrorStream.oclIsUndefined() then\n                self.standardErrorStream.minimumCardinality = 1\n                and self.standardErrorStream.maximumCardinality = 1\n            else \n                true \n            endif"
		   });
		addAnnotation
		  (literalCommandLineEntryListEClass,
		   source,
		   new String[] {
			   "OneOrMoreLiterals", "\n            literals->size() > 0"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Collection</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCollectionAnnotations() {
		String source = "http://www.eclipse.org/OCL/Collection";
		addAnnotation
		  (getActivity_Parameters(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getActivity_InputDatasets(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getActivity_OutputDatasets(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getActivity_ReadinessContraints(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getParameter_DefaultValue(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getCommandLineTool_CommandLineTemplate(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getCommandLineTool_ExitCodes(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getCommandLineEntryList_Manipulators(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getLiteralCommandLineEntryList_Literals(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
	}

} //AnalysisActivityDescriptionPackageImpl
