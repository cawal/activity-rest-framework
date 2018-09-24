/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionFactory;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineEntryList;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineTool;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Constraint;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Dataset;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetCommandLineEntryList;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ExitCode;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.FunctionalEntity;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.IdentifiableElement;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.InputDataset;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.LiteralCommandLineEntryList;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MultiplicityElement;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.OutputDataset;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Parameter;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterCommandLineEntryList;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterType;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.TerminationStatus;
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
	private EClass identifiableElementEClass = null;

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
	private EClass constraintEClass = null;

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
	private EClass functionalEntityEClass = null;

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
	public EClass getIdentifiableElement() {
		return identifiableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiableElement_Name() {
		return (EAttribute)identifiableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiableElement_Remark() {
		return (EAttribute)identifiableElementEClass.getEStructuralFeatures().get(1);
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
	public EReference getActivity_Parameters() {
		return (EReference)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_InputDatasets() {
		return (EReference)activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_OutputDatasets() {
		return (EReference)activityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_FunctionalEntity() {
		return (EReference)activityEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getParameter_ParameterType() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_DefaultValue() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Constraints() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getDataset_Mimetype() {
		return (EAttribute)datasetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataset_Constraints() {
		return (EReference)datasetEClass.getEStructuralFeatures().get(1);
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
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_Name() {
		return (EAttribute)constraintEClass.getEStructuralFeatures().get(0);
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
	public EClass getFunctionalEntity() {
		return functionalEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalEntity_Activity() {
		return (EReference)functionalEntityEClass.getEStructuralFeatures().get(0);
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
	public EReference getCommandLineTool_CommandLineTemplate() {
		return (EReference)commandLineToolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandLineTool_StandardInputStream() {
		return (EReference)commandLineToolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandLineTool_StandardOutputStream() {
		return (EReference)commandLineToolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandLineTool_StandardErrorStream() {
		return (EReference)commandLineToolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandLineTool_ExitCodes() {
		return (EReference)commandLineToolEClass.getEStructuralFeatures().get(4);
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
		identifiableElementEClass = createEClass(IDENTIFIABLE_ELEMENT);
		createEAttribute(identifiableElementEClass, IDENTIFIABLE_ELEMENT__NAME);
		createEAttribute(identifiableElementEClass, IDENTIFIABLE_ELEMENT__REMARK);

		activityEClass = createEClass(ACTIVITY);
		createEReference(activityEClass, ACTIVITY__PARAMETERS);
		createEReference(activityEClass, ACTIVITY__INPUT_DATASETS);
		createEReference(activityEClass, ACTIVITY__OUTPUT_DATASETS);
		createEReference(activityEClass, ACTIVITY__FUNCTIONAL_ENTITY);

		multiplicityElementEClass = createEClass(MULTIPLICITY_ELEMENT);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__MINIMUM_CARDINALITY);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__MAXIMUM_CARDINALITY);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__PARAMETER_TYPE);
		createEAttribute(parameterEClass, PARAMETER__DEFAULT_VALUE);
		createEReference(parameterEClass, PARAMETER__CONSTRAINTS);

		datasetEClass = createEClass(DATASET);
		createEAttribute(datasetEClass, DATASET__MIMETYPE);
		createEReference(datasetEClass, DATASET__CONSTRAINTS);

		inputDatasetEClass = createEClass(INPUT_DATASET);

		outputDatasetEClass = createEClass(OUTPUT_DATASET);

		constraintEClass = createEClass(CONSTRAINT);
		createEAttribute(constraintEClass, CONSTRAINT__NAME);

		functionalEntityEClass = createEClass(FUNCTIONAL_ENTITY);
		createEReference(functionalEntityEClass, FUNCTIONAL_ENTITY__ACTIVITY);

		commandLineToolEClass = createEClass(COMMAND_LINE_TOOL);
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
		activityEClass.getESuperTypes().add(this.getIdentifiableElement());
		parameterEClass.getESuperTypes().add(this.getMultiplicityElement());
		parameterEClass.getESuperTypes().add(this.getIdentifiableElement());
		datasetEClass.getESuperTypes().add(this.getMultiplicityElement());
		datasetEClass.getESuperTypes().add(this.getIdentifiableElement());
		inputDatasetEClass.getESuperTypes().add(this.getDataset());
		outputDatasetEClass.getESuperTypes().add(this.getDataset());
		functionalEntityEClass.getESuperTypes().add(this.getIdentifiableElement());
		commandLineToolEClass.getESuperTypes().add(this.getFunctionalEntity());
		toolNameCommandLineEntryEClass.getESuperTypes().add(this.getCommandLineEntryList());
		literalCommandLineEntryListEClass.getESuperTypes().add(this.getCommandLineEntryList());
		datasetCommandLineEntryListEClass.getESuperTypes().add(this.getCommandLineEntryList());
		parameterCommandLineEntryListEClass.getESuperTypes().add(this.getCommandLineEntryList());

		// Initialize classes, features, and operations; add parameters
		initEClass(identifiableElementEClass, IdentifiableElement.class, "IdentifiableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiableElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, IdentifiableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifiableElement_Remark(), ecorePackage.getEString(), "remark", null, 0, 1, IdentifiableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivity_InputDatasets(), this.getInputDataset(), null, "inputDatasets", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_OutputDatasets(), this.getOutputDataset(), null, "outputDatasets", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_FunctionalEntity(), this.getFunctionalEntity(), this.getFunctionalEntity_Activity(), "functionalEntity", null, 1, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiplicityElementEClass, MultiplicityElement.class, "MultiplicityElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiplicityElement_MinimumCardinality(), ecorePackage.getEBigInteger(), "minimumCardinality", "1", 1, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplicityElement_MaximumCardinality(), ecorePackage.getEBigInteger(), "maximumCardinality", "1", 1, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_ParameterType(), this.getParameterType(), "parameterType", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParameter_Constraints(), this.getConstraint(), null, "constraints", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(datasetEClass, Dataset.class, "Dataset", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataset_Mimetype(), ecorePackage.getEString(), "mimetype", null, 0, 1, Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataset_Constraints(), this.getConstraint(), null, "constraints", null, 0, -1, Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(inputDatasetEClass, InputDataset.class, "InputDataset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outputDatasetEClass, OutputDataset.class, "OutputDataset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstraint_Name(), ecorePackage.getEString(), "name", null, 1, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionalEntityEClass, FunctionalEntity.class, "FunctionalEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionalEntity_Activity(), this.getActivity(), this.getActivity_FunctionalEntity(), "activity", null, 0, 1, FunctionalEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commandLineToolEClass, CommandLineTool.class, "CommandLineTool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
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
		  (getParameter_DefaultValue(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getParameter_Constraints(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getDataset_Constraints(),
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
