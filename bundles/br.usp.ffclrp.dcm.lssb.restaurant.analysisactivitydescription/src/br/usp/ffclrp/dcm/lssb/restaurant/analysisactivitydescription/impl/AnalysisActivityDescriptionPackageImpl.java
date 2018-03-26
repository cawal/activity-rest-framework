/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescription;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionFactory;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineEntries;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetCommandLineEntries;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetConstraint;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetKinds;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetProperties;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.LiteralCommandLineEntries;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MaximunDatasetCardinalityConstraint;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MinimunDatasetCardinalityConstraint;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterCommandLineEntries;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterConstraint;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterKinds;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterProperties;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterType;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ReadinessConstraint;

import br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.StringListManipulatorsPackage;
import br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.StringListManipulatorsPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
	private EClass parameterPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datasetPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandLineEntriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalCommandLineEntriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datasetCommandLineEntriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterCommandLineEntriesEClass = null;

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
	private EEnum parameterKindsEEnum = null;

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
	private EEnum datasetKindsEEnum = null;

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
	public EClass getParameterProperties() {
		return parameterPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterProperties_Name() {
		return (EAttribute)parameterPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterProperties_ParameterKind() {
		return (EAttribute)parameterPropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterProperties_ParameterType() {
		return (EAttribute)parameterPropertiesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterProperties_DefaultValue() {
		return (EAttribute)parameterPropertiesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatasetProperties() {
		return datasetPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatasetProperties_Name() {
		return (EAttribute)datasetPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatasetProperties_Mimetype() {
		return (EAttribute)datasetPropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatasetProperties_DatasetKind() {
		return (EAttribute)datasetPropertiesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandLineEntries() {
		return commandLineEntriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandLineEntries_Manipulators() {
		return (EReference)commandLineEntriesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralCommandLineEntries() {
		return literalCommandLineEntriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralCommandLineEntries_Literals() {
		return (EAttribute)literalCommandLineEntriesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatasetCommandLineEntries() {
		return datasetCommandLineEntriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatasetCommandLineEntries_Dataset() {
		return (EReference)datasetCommandLineEntriesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterCommandLineEntries() {
		return parameterCommandLineEntriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterCommandLineEntries_Parameter() {
		return (EReference)parameterCommandLineEntriesEClass.getEStructuralFeatures().get(0);
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
	public EEnum getParameterKinds() {
		return parameterKindsEEnum;
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
	public EEnum getDatasetKinds() {
		return datasetKindsEEnum;
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

		parameterPropertiesEClass = createEClass(PARAMETER_PROPERTIES);
		createEAttribute(parameterPropertiesEClass, PARAMETER_PROPERTIES__NAME);
		createEAttribute(parameterPropertiesEClass, PARAMETER_PROPERTIES__PARAMETER_KIND);
		createEAttribute(parameterPropertiesEClass, PARAMETER_PROPERTIES__PARAMETER_TYPE);
		createEAttribute(parameterPropertiesEClass, PARAMETER_PROPERTIES__DEFAULT_VALUE);

		datasetPropertiesEClass = createEClass(DATASET_PROPERTIES);
		createEAttribute(datasetPropertiesEClass, DATASET_PROPERTIES__NAME);
		createEAttribute(datasetPropertiesEClass, DATASET_PROPERTIES__MIMETYPE);
		createEAttribute(datasetPropertiesEClass, DATASET_PROPERTIES__DATASET_KIND);

		commandLineEntriesEClass = createEClass(COMMAND_LINE_ENTRIES);
		createEReference(commandLineEntriesEClass, COMMAND_LINE_ENTRIES__MANIPULATORS);

		literalCommandLineEntriesEClass = createEClass(LITERAL_COMMAND_LINE_ENTRIES);
		createEAttribute(literalCommandLineEntriesEClass, LITERAL_COMMAND_LINE_ENTRIES__LITERALS);

		datasetCommandLineEntriesEClass = createEClass(DATASET_COMMAND_LINE_ENTRIES);
		createEReference(datasetCommandLineEntriesEClass, DATASET_COMMAND_LINE_ENTRIES__DATASET);

		parameterCommandLineEntriesEClass = createEClass(PARAMETER_COMMAND_LINE_ENTRIES);
		createEReference(parameterCommandLineEntriesEClass, PARAMETER_COMMAND_LINE_ENTRIES__PARAMETER);

		readinessConstraintEClass = createEClass(READINESS_CONSTRAINT);

		datasetConstraintEClass = createEClass(DATASET_CONSTRAINT);
		createEReference(datasetConstraintEClass, DATASET_CONSTRAINT__DATASET);

		minimunDatasetCardinalityConstraintEClass = createEClass(MINIMUN_DATASET_CARDINALITY_CONSTRAINT);
		createEAttribute(minimunDatasetCardinalityConstraintEClass, MINIMUN_DATASET_CARDINALITY_CONSTRAINT__VALUE);

		maximunDatasetCardinalityConstraintEClass = createEClass(MAXIMUN_DATASET_CARDINALITY_CONSTRAINT);
		createEAttribute(maximunDatasetCardinalityConstraintEClass, MAXIMUN_DATASET_CARDINALITY_CONSTRAINT__VALUE);

		parameterConstraintEClass = createEClass(PARAMETER_CONSTRAINT);
		createEReference(parameterConstraintEClass, PARAMETER_CONSTRAINT__PARAMETER);

		// Create enums
		parameterKindsEEnum = createEEnum(PARAMETER_KINDS);
		parameterTypeEEnum = createEEnum(PARAMETER_TYPE);
		datasetKindsEEnum = createEEnum(DATASET_KINDS);
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
		literalCommandLineEntriesEClass.getESuperTypes().add(this.getCommandLineEntries());
		datasetCommandLineEntriesEClass.getESuperTypes().add(this.getCommandLineEntries());
		parameterCommandLineEntriesEClass.getESuperTypes().add(this.getCommandLineEntries());
		datasetConstraintEClass.getESuperTypes().add(this.getReadinessConstraint());
		minimunDatasetCardinalityConstraintEClass.getESuperTypes().add(this.getDatasetConstraint());
		maximunDatasetCardinalityConstraintEClass.getESuperTypes().add(this.getDatasetConstraint());
		parameterConstraintEClass.getESuperTypes().add(this.getReadinessConstraint());

		// Initialize classes, features, and operations; add parameters
		initEClass(analysisActivityDescriptionEClass, AnalysisActivityDescription.class, "AnalysisActivityDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalysisActivityDescription_Parameters(), this.getParameterProperties(), null, "parameters", null, 0, -1, AnalysisActivityDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAnalysisActivityDescription_InputDatasets(), this.getDatasetProperties(), null, "inputDatasets", null, 0, -1, AnalysisActivityDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisActivityDescription_OutputDatasets(), this.getDatasetProperties(), null, "outputDatasets", null, 0, -1, AnalysisActivityDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisActivityDescription_CommandLineTemplate(), this.getCommandLineEntries(), null, "commandLineTemplate", null, 1, -1, AnalysisActivityDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisActivityDescription_ReadinessContraints(), this.getReadinessConstraint(), null, "readinessContraints", null, 0, -1, AnalysisActivityDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(parameterPropertiesEClass, ParameterProperties.class, "ParameterProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterProperties_Name(), ecorePackage.getEString(), "name", null, 1, 1, ParameterProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterProperties_ParameterKind(), this.getParameterKinds(), "parameterKind", null, 1, 1, ParameterProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterProperties_ParameterType(), this.getParameterType(), "parameterType", null, 1, 1, ParameterProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterProperties_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, -1, ParameterProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(datasetPropertiesEClass, DatasetProperties.class, "DatasetProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatasetProperties_Name(), ecorePackage.getEString(), "name", null, 1, 1, DatasetProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatasetProperties_Mimetype(), ecorePackage.getEString(), "mimetype", null, 0, 1, DatasetProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatasetProperties_DatasetKind(), this.getDatasetKinds(), "datasetKind", null, 1, 1, DatasetProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commandLineEntriesEClass, CommandLineEntries.class, "CommandLineEntries", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommandLineEntries_Manipulators(), theStringListManipulatorsPackage.getStringListManipulator(), null, "manipulators", null, 0, -1, CommandLineEntries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalCommandLineEntriesEClass, LiteralCommandLineEntries.class, "LiteralCommandLineEntries", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralCommandLineEntries_Literals(), ecorePackage.getEString(), "literals", null, 0, -1, LiteralCommandLineEntries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datasetCommandLineEntriesEClass, DatasetCommandLineEntries.class, "DatasetCommandLineEntries", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatasetCommandLineEntries_Dataset(), this.getDatasetProperties(), null, "dataset", null, 1, 1, DatasetCommandLineEntries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterCommandLineEntriesEClass, ParameterCommandLineEntries.class, "ParameterCommandLineEntries", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterCommandLineEntries_Parameter(), this.getParameterProperties(), null, "parameter", null, 1, 1, ParameterCommandLineEntries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(readinessConstraintEClass, ReadinessConstraint.class, "ReadinessConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(datasetConstraintEClass, DatasetConstraint.class, "DatasetConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatasetConstraint_Dataset(), this.getDatasetProperties(), null, "dataset", null, 1, 1, DatasetConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(minimunDatasetCardinalityConstraintEClass, MinimunDatasetCardinalityConstraint.class, "MinimunDatasetCardinalityConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMinimunDatasetCardinalityConstraint_Value(), ecorePackage.getEBigInteger(), "value", null, 0, 1, MinimunDatasetCardinalityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(maximunDatasetCardinalityConstraintEClass, MaximunDatasetCardinalityConstraint.class, "MaximunDatasetCardinalityConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaximunDatasetCardinalityConstraint_Value(), ecorePackage.getEBigInteger(), "value", null, 0, 1, MaximunDatasetCardinalityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterConstraintEClass, ParameterConstraint.class, "ParameterConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterConstraint_Parameter(), this.getParameterProperties(), null, "parameter", null, 1, 1, ParameterConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(parameterKindsEEnum, ParameterKinds.class, "ParameterKinds");
		addEEnumLiteral(parameterKindsEEnum, ParameterKinds.SINGLE_VALUE);
		addEEnumLiteral(parameterKindsEEnum, ParameterKinds.LIST);

		initEEnum(parameterTypeEEnum, ParameterType.class, "ParameterType");
		addEEnumLiteral(parameterTypeEEnum, ParameterType.STRING);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.INTEGER);

		initEEnum(datasetKindsEEnum, DatasetKinds.class, "DatasetKinds");
		addEEnumLiteral(datasetKindsEEnum, DatasetKinds.STANDARD_INPUT);
		addEEnumLiteral(datasetKindsEEnum, DatasetKinds.STANDARD_OUTPUT);
		addEEnumLiteral(datasetKindsEEnum, DatasetKinds.STANDARD_ERROR);
		addEEnumLiteral(datasetKindsEEnum, DatasetKinds.SINGLE_FILE);
		addEEnumLiteral(datasetKindsEEnum, DatasetKinds.FILE_COLLECTION);

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
		  (getParameterProperties_DefaultValue(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getCommandLineEntries_Manipulators(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getLiteralCommandLineEntries_Literals(), 
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
		  (parameterPropertiesEClass, 
		   source, 
		   new String[] {
			 "archetype", "Thing"
		   });
	}

} //AnalysisActivityDescriptionPackageImpl
