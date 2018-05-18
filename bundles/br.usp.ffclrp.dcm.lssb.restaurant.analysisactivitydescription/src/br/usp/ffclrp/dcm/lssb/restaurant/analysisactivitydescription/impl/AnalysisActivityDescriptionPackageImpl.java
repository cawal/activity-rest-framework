/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescription;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionFactory;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineEntryList;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetCommandLineEntryList;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetConstraint;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetDescription;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetKind;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.LiteralCommandLineEntryList;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MaximunDatasetCardinalityConstraint;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MaximunParameterCardinalityConstraint;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MinimunDatasetCardinalityConstraint;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MinimunParameterCardinalityConstraint;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterCommandLineEntryList;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterConstraint;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterKind;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterType;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ReadinessConstraint;

import br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.StringListManipulatorsPackage;
import br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.StringListManipulatorsPackageImpl;
import java.util.List;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.ETypeParameter;
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
	private EClass analysisActivityDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datasetDescriptionEClass = null;

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
	private EClass datasetConstraintEClass = null;

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
	private EClass parameterConstraintEClass = null;

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
	private EEnum parameterKindEEnum = null;

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
	private EEnum datasetKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listEDataType = null;

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
		AnalysisActivityDescriptionPackageImpl theAnalysisActivityDescriptionPackage = (AnalysisActivityDescriptionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AnalysisActivityDescriptionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AnalysisActivityDescriptionPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		StringListManipulatorsPackageImpl theStringListManipulatorsPackage = (StringListManipulatorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StringListManipulatorsPackage.eNS_URI) instanceof StringListManipulatorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StringListManipulatorsPackage.eNS_URI) : StringListManipulatorsPackage.eINSTANCE);

		// Create package meta-data objects
		theAnalysisActivityDescriptionPackage.createPackageContents();
		theStringListManipulatorsPackage.createPackageContents();

		// Initialize created meta-data
		theAnalysisActivityDescriptionPackage.initializePackageContents();
		theStringListManipulatorsPackage.initializePackageContents();

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
	public EClass getAnalysisActivityDescription() {
		return analysisActivityDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisActivityDescription_Parameters() {
		return (EReference)analysisActivityDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisActivityDescription_InputDatasets() {
		return (EReference)analysisActivityDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisActivityDescription_OutputDatasets() {
		return (EReference)analysisActivityDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisActivityDescription_CommandLineTemplate() {
		return (EReference)analysisActivityDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisActivityDescription_ReadinessContraints() {
		return (EReference)analysisActivityDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterDescription() {
		return parameterDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterDescription_Name() {
		return (EAttribute)parameterDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterDescription_ParameterKind() {
		return (EAttribute)parameterDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterDescription_ParameterType() {
		return (EAttribute)parameterDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterDescription_DefaultValue() {
		return (EAttribute)parameterDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterDescription__IsValidValue__EList() {
		return parameterDescriptionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterDescription__IsValidValue__Object() {
		return parameterDescriptionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterDescription__IsValidValue__List() {
		return parameterDescriptionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatasetDescription() {
		return datasetDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatasetDescription_Name() {
		return (EAttribute)datasetDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatasetDescription_Mimetype() {
		return (EAttribute)datasetDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatasetDescription_DatasetKind() {
		return (EAttribute)datasetDescriptionEClass.getEStructuralFeatures().get(2);
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
	public EClass getDatasetConstraint() {
		return datasetConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatasetConstraint_Dataset() {
		return (EReference)datasetConstraintEClass.getEStructuralFeatures().get(0);
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
	public EClass getParameterConstraint() {
		return parameterConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterConstraint_Parameter() {
		return (EReference)parameterConstraintEClass.getEStructuralFeatures().get(0);
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
	public EEnum getParameterKind() {
		return parameterKindEEnum;
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
	public EEnum getDatasetKind() {
		return datasetKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getList() {
		return listEDataType;
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
		analysisActivityDescriptionEClass = createEClass(ANALYSIS_ACTIVITY_DESCRIPTION);
		createEReference(analysisActivityDescriptionEClass, ANALYSIS_ACTIVITY_DESCRIPTION__PARAMETERS);
		createEReference(analysisActivityDescriptionEClass, ANALYSIS_ACTIVITY_DESCRIPTION__INPUT_DATASETS);
		createEReference(analysisActivityDescriptionEClass, ANALYSIS_ACTIVITY_DESCRIPTION__OUTPUT_DATASETS);
		createEReference(analysisActivityDescriptionEClass, ANALYSIS_ACTIVITY_DESCRIPTION__COMMAND_LINE_TEMPLATE);
		createEReference(analysisActivityDescriptionEClass, ANALYSIS_ACTIVITY_DESCRIPTION__READINESS_CONTRAINTS);

		parameterDescriptionEClass = createEClass(PARAMETER_DESCRIPTION);
		createEAttribute(parameterDescriptionEClass, PARAMETER_DESCRIPTION__NAME);
		createEAttribute(parameterDescriptionEClass, PARAMETER_DESCRIPTION__PARAMETER_KIND);
		createEAttribute(parameterDescriptionEClass, PARAMETER_DESCRIPTION__PARAMETER_TYPE);
		createEAttribute(parameterDescriptionEClass, PARAMETER_DESCRIPTION__DEFAULT_VALUE);
		createEOperation(parameterDescriptionEClass, PARAMETER_DESCRIPTION___IS_VALID_VALUE__ELIST);
		createEOperation(parameterDescriptionEClass, PARAMETER_DESCRIPTION___IS_VALID_VALUE__OBJECT);
		createEOperation(parameterDescriptionEClass, PARAMETER_DESCRIPTION___IS_VALID_VALUE__LIST);

		datasetDescriptionEClass = createEClass(DATASET_DESCRIPTION);
		createEAttribute(datasetDescriptionEClass, DATASET_DESCRIPTION__NAME);
		createEAttribute(datasetDescriptionEClass, DATASET_DESCRIPTION__MIMETYPE);
		createEAttribute(datasetDescriptionEClass, DATASET_DESCRIPTION__DATASET_KIND);

		commandLineEntryListEClass = createEClass(COMMAND_LINE_ENTRY_LIST);
		createEReference(commandLineEntryListEClass, COMMAND_LINE_ENTRY_LIST__MANIPULATORS);

		literalCommandLineEntryListEClass = createEClass(LITERAL_COMMAND_LINE_ENTRY_LIST);
		createEAttribute(literalCommandLineEntryListEClass, LITERAL_COMMAND_LINE_ENTRY_LIST__LITERALS);

		datasetCommandLineEntryListEClass = createEClass(DATASET_COMMAND_LINE_ENTRY_LIST);
		createEReference(datasetCommandLineEntryListEClass, DATASET_COMMAND_LINE_ENTRY_LIST__DATASET);

		parameterCommandLineEntryListEClass = createEClass(PARAMETER_COMMAND_LINE_ENTRY_LIST);
		createEReference(parameterCommandLineEntryListEClass, PARAMETER_COMMAND_LINE_ENTRY_LIST__PARAMETER);

		readinessConstraintEClass = createEClass(READINESS_CONSTRAINT);

		datasetConstraintEClass = createEClass(DATASET_CONSTRAINT);
		createEReference(datasetConstraintEClass, DATASET_CONSTRAINT__DATASET);

		minimunDatasetCardinalityConstraintEClass = createEClass(MINIMUN_DATASET_CARDINALITY_CONSTRAINT);
		createEAttribute(minimunDatasetCardinalityConstraintEClass, MINIMUN_DATASET_CARDINALITY_CONSTRAINT__VALUE);

		maximunDatasetCardinalityConstraintEClass = createEClass(MAXIMUN_DATASET_CARDINALITY_CONSTRAINT);
		createEAttribute(maximunDatasetCardinalityConstraintEClass, MAXIMUN_DATASET_CARDINALITY_CONSTRAINT__VALUE);

		parameterConstraintEClass = createEClass(PARAMETER_CONSTRAINT);
		createEReference(parameterConstraintEClass, PARAMETER_CONSTRAINT__PARAMETER);

		minimunParameterCardinalityConstraintEClass = createEClass(MINIMUN_PARAMETER_CARDINALITY_CONSTRAINT);
		createEAttribute(minimunParameterCardinalityConstraintEClass, MINIMUN_PARAMETER_CARDINALITY_CONSTRAINT__VALUE);

		maximunParameterCardinalityConstraintEClass = createEClass(MAXIMUN_PARAMETER_CARDINALITY_CONSTRAINT);
		createEAttribute(maximunParameterCardinalityConstraintEClass, MAXIMUN_PARAMETER_CARDINALITY_CONSTRAINT__VALUE);

		// Create enums
		parameterKindEEnum = createEEnum(PARAMETER_KIND);
		parameterTypeEEnum = createEEnum(PARAMETER_TYPE);
		datasetKindEEnum = createEEnum(DATASET_KIND);

		// Create data types
		listEDataType = createEDataType(LIST);
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
		addETypeParameter(listEDataType, "A");

		// Set bounds for type parameters

		// Add supertypes to classes
		literalCommandLineEntryListEClass.getESuperTypes().add(this.getCommandLineEntryList());
		datasetCommandLineEntryListEClass.getESuperTypes().add(this.getCommandLineEntryList());
		parameterCommandLineEntryListEClass.getESuperTypes().add(this.getCommandLineEntryList());
		datasetConstraintEClass.getESuperTypes().add(this.getReadinessConstraint());
		minimunDatasetCardinalityConstraintEClass.getESuperTypes().add(this.getDatasetConstraint());
		maximunDatasetCardinalityConstraintEClass.getESuperTypes().add(this.getDatasetConstraint());
		parameterConstraintEClass.getESuperTypes().add(this.getReadinessConstraint());
		minimunParameterCardinalityConstraintEClass.getESuperTypes().add(this.getParameterConstraint());
		maximunParameterCardinalityConstraintEClass.getESuperTypes().add(this.getParameterConstraint());

		// Initialize classes, features, and operations; add parameters
		initEClass(analysisActivityDescriptionEClass, AnalysisActivityDescription.class, "AnalysisActivityDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalysisActivityDescription_Parameters(), this.getParameterDescription(), null, "parameters", null, 0, -1, AnalysisActivityDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAnalysisActivityDescription_InputDatasets(), this.getDatasetDescription(), null, "inputDatasets", null, 0, -1, AnalysisActivityDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisActivityDescription_OutputDatasets(), this.getDatasetDescription(), null, "outputDatasets", null, 0, -1, AnalysisActivityDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisActivityDescription_CommandLineTemplate(), this.getCommandLineEntryList(), null, "commandLineTemplate", null, 1, -1, AnalysisActivityDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisActivityDescription_ReadinessContraints(), this.getReadinessConstraint(), null, "readinessContraints", null, 0, -1, AnalysisActivityDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(parameterDescriptionEClass, ParameterDescription.class, "ParameterDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterDescription_Name(), ecorePackage.getEString(), "name", null, 1, 1, ParameterDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterDescription_ParameterKind(), this.getParameterKind(), "parameterKind", null, 1, 1, ParameterDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterDescription_ParameterType(), this.getParameterType(), "parameterType", null, 1, 1, ParameterDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterDescription_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, -1, ParameterDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getParameterDescription__IsValidValue__EList(), ecorePackage.getEBoolean(), "isValidValue", 1, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "A");
		EGenericType g1 = createEGenericType(t1);
		addEParameter(op, g1, "value", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getParameterDescription__IsValidValue__Object(), ecorePackage.getEBoolean(), "isValidValue", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "A");
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameterDescription__IsValidValue__List(), ecorePackage.getEBoolean(), "isValidValue", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "A");
		g1 = createEGenericType(this.getList());
		EGenericType g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(datasetDescriptionEClass, DatasetDescription.class, "DatasetDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatasetDescription_Name(), ecorePackage.getEString(), "name", null, 1, 1, DatasetDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatasetDescription_Mimetype(), ecorePackage.getEString(), "mimetype", null, 0, 1, DatasetDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatasetDescription_DatasetKind(), this.getDatasetKind(), "datasetKind", null, 1, 1, DatasetDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commandLineEntryListEClass, CommandLineEntryList.class, "CommandLineEntryList", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommandLineEntryList_Manipulators(), theStringListManipulatorsPackage.getStringListManipulator(), null, "manipulators", null, 0, -1, CommandLineEntryList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalCommandLineEntryListEClass, LiteralCommandLineEntryList.class, "LiteralCommandLineEntryList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralCommandLineEntryList_Literals(), ecorePackage.getEString(), "literals", null, 0, -1, LiteralCommandLineEntryList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datasetCommandLineEntryListEClass, DatasetCommandLineEntryList.class, "DatasetCommandLineEntryList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatasetCommandLineEntryList_Dataset(), this.getDatasetDescription(), null, "dataset", null, 1, 1, DatasetCommandLineEntryList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterCommandLineEntryListEClass, ParameterCommandLineEntryList.class, "ParameterCommandLineEntryList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterCommandLineEntryList_Parameter(), this.getParameterDescription(), null, "parameter", null, 1, 1, ParameterCommandLineEntryList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(readinessConstraintEClass, ReadinessConstraint.class, "ReadinessConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(datasetConstraintEClass, DatasetConstraint.class, "DatasetConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatasetConstraint_Dataset(), this.getDatasetDescription(), null, "dataset", null, 1, 1, DatasetConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(minimunDatasetCardinalityConstraintEClass, MinimunDatasetCardinalityConstraint.class, "MinimunDatasetCardinalityConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMinimunDatasetCardinalityConstraint_Value(), ecorePackage.getEBigInteger(), "value", null, 0, 1, MinimunDatasetCardinalityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(maximunDatasetCardinalityConstraintEClass, MaximunDatasetCardinalityConstraint.class, "MaximunDatasetCardinalityConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaximunDatasetCardinalityConstraint_Value(), ecorePackage.getEBigInteger(), "value", null, 0, 1, MaximunDatasetCardinalityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterConstraintEClass, ParameterConstraint.class, "ParameterConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterConstraint_Parameter(), this.getParameterDescription(), null, "parameter", null, 1, 1, ParameterConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(minimunParameterCardinalityConstraintEClass, MinimunParameterCardinalityConstraint.class, "MinimunParameterCardinalityConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMinimunParameterCardinalityConstraint_Value(), ecorePackage.getEBigInteger(), "value", null, 0, 1, MinimunParameterCardinalityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(maximunParameterCardinalityConstraintEClass, MaximunParameterCardinalityConstraint.class, "MaximunParameterCardinalityConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaximunParameterCardinalityConstraint_Value(), ecorePackage.getEBigInteger(), "value", null, 0, 1, MaximunParameterCardinalityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(parameterKindEEnum, ParameterKind.class, "ParameterKind");
		addEEnumLiteral(parameterKindEEnum, ParameterKind.SINGLE_VALUE);
		addEEnumLiteral(parameterKindEEnum, ParameterKind.LIST);

		initEEnum(parameterTypeEEnum, ParameterType.class, "ParameterType");
		addEEnumLiteral(parameterTypeEEnum, ParameterType.STRING);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.INTEGER);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.REAL);

		initEEnum(datasetKindEEnum, DatasetKind.class, "DatasetKind");
		addEEnumLiteral(datasetKindEEnum, DatasetKind.STANDARD_INPUT);
		addEEnumLiteral(datasetKindEEnum, DatasetKind.STANDARD_OUTPUT);
		addEEnumLiteral(datasetKindEEnum, DatasetKind.STANDARD_ERROR);
		addEEnumLiteral(datasetKindEEnum, DatasetKind.SINGLE_FILE);
		addEEnumLiteral(datasetKindEEnum, DatasetKind.FILE_COLLECTION);

		// Initialize data types
		initEDataType(listEDataType, List.class, "List", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/OCL/Collection
		createCollectionAnnotations();
		// http://www.obeo.fr/dsl/dnc/archetype
		createArchetypeAnnotations();
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
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Collection</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCollectionAnnotations() {
		String source = "http://www.eclipse.org/OCL/Collection";	
		addAnnotation
		  (getAnalysisActivityDescription_Parameters(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getAnalysisActivityDescription_InputDatasets(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getAnalysisActivityDescription_OutputDatasets(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getAnalysisActivityDescription_CommandLineTemplate(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getAnalysisActivityDescription_ReadinessContraints(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  ((getParameterDescription__IsValidValue__EList()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getParameterDescription_DefaultValue(), 
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

	/**
	 * Initializes the annotations for <b>http://www.obeo.fr/dsl/dnc/archetype</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createArchetypeAnnotations() {
		String source = "http://www.obeo.fr/dsl/dnc/archetype";	
		addAnnotation
		  (parameterDescriptionEClass, 
		   source, 
		   new String[] {
			 "archetype", "Thing"
		   });
	}

} //AnalysisActivityDescriptionPackageImpl
