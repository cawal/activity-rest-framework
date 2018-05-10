/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.impl;

import analysisactivityexceptions.AnalysisactivityexceptionsPackage;
import analysisactivityexceptions.impl.AnalysisactivityexceptionsPackageImpl;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivityModelFactory;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivityModelPackage;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Dataset;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Parameter;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.ParameterMap;
import br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.StringListManipulatorsPackage;

import java.io.File;

import java.util.List;
import java.util.Map;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class AnalysisActivityModelPackageImpl extends EPackageImpl implements AnalysisActivityModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysisActivityEClass = null;

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
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fileEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType objectEDataType = null;

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
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivityModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AnalysisActivityModelPackageImpl() {
		super(eNS_URI, AnalysisActivityModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AnalysisActivityModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AnalysisActivityModelPackage init() {
		if (isInited) return (AnalysisActivityModelPackage)EPackage.Registry.INSTANCE.getEPackage(AnalysisActivityModelPackage.eNS_URI);

		// Obtain or create and register package
		AnalysisActivityModelPackageImpl theAnalysisActivityModelPackage = (AnalysisActivityModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AnalysisActivityModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AnalysisActivityModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		AnalysisActivityDescriptionPackage.eINSTANCE.eClass();
		StringListManipulatorsPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		AnalysisactivityexceptionsPackageImpl theAnalysisactivityexceptionsPackage = (AnalysisactivityexceptionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AnalysisactivityexceptionsPackage.eNS_URI) instanceof AnalysisactivityexceptionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AnalysisactivityexceptionsPackage.eNS_URI) : AnalysisactivityexceptionsPackage.eINSTANCE);

		// Create package meta-data objects
		theAnalysisActivityModelPackage.createPackageContents();
		theAnalysisactivityexceptionsPackage.createPackageContents();

		// Initialize created meta-data
		theAnalysisActivityModelPackage.initializePackageContents();
		theAnalysisactivityexceptionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAnalysisActivityModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AnalysisActivityModelPackage.eNS_URI, theAnalysisActivityModelPackage);
		return theAnalysisActivityModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalysisActivity() {
		return analysisActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalysisActivity_Id() {
		return (EAttribute)analysisActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisActivity_Description() {
		return (EReference)analysisActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisActivity_Inputs() {
		return (EReference)analysisActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisActivity_Parameters() {
		return (EReference)analysisActivityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisActivity_ParameterMap() {
		return (EReference)analysisActivityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisActivity_Outputs() {
		return (EReference)analysisActivityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalysisActivity_ErrorReport() {
		return (EAttribute)analysisActivityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnalysisActivity__InputDatasetForName__String() {
		return analysisActivityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnalysisActivity__OutputDatasetForName__String() {
		return analysisActivityEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnalysisActivity__ParameterForName__String() {
		return analysisActivityEClass.getEOperations().get(2);
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
	public EReference getDataset_Description() {
		return (EReference)datasetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataset_Files() {
		return (EAttribute)datasetEClass.getEStructuralFeatures().get(2);
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
	public EReference getParameter_Description() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Values() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameter__CheckAndSetValues__Object() {
		return parameterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterMap() {
		return parameterMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterMap_Descriptions() {
		return (EReference)parameterMapEClass.getEStructuralFeatures().get(0);
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
	public EDataType getFile() {
		return fileEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaMap() {
		return javaMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getObject() {
		return objectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisActivityModelFactory getAnalysisActivityModelFactory() {
		return (AnalysisActivityModelFactory)getEFactoryInstance();
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
		analysisActivityEClass = createEClass(ANALYSIS_ACTIVITY);
		createEAttribute(analysisActivityEClass, ANALYSIS_ACTIVITY__ID);
		createEReference(analysisActivityEClass, ANALYSIS_ACTIVITY__DESCRIPTION);
		createEReference(analysisActivityEClass, ANALYSIS_ACTIVITY__INPUTS);
		createEReference(analysisActivityEClass, ANALYSIS_ACTIVITY__PARAMETERS);
		createEReference(analysisActivityEClass, ANALYSIS_ACTIVITY__PARAMETER_MAP);
		createEReference(analysisActivityEClass, ANALYSIS_ACTIVITY__OUTPUTS);
		createEAttribute(analysisActivityEClass, ANALYSIS_ACTIVITY__ERROR_REPORT);
		createEOperation(analysisActivityEClass, ANALYSIS_ACTIVITY___INPUT_DATASET_FOR_NAME__STRING);
		createEOperation(analysisActivityEClass, ANALYSIS_ACTIVITY___OUTPUT_DATASET_FOR_NAME__STRING);
		createEOperation(analysisActivityEClass, ANALYSIS_ACTIVITY___PARAMETER_FOR_NAME__STRING);

		datasetEClass = createEClass(DATASET);
		createEAttribute(datasetEClass, DATASET__NAME);
		createEReference(datasetEClass, DATASET__DESCRIPTION);
		createEAttribute(datasetEClass, DATASET__FILES);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);
		createEReference(parameterEClass, PARAMETER__DESCRIPTION);
		createEAttribute(parameterEClass, PARAMETER__VALUES);
		createEOperation(parameterEClass, PARAMETER___CHECK_AND_SET_VALUES__OBJECT);

		javaMapEClass = createEClass(JAVA_MAP);

		parameterMapEClass = createEClass(PARAMETER_MAP);
		createEReference(parameterMapEClass, PARAMETER_MAP__DESCRIPTIONS);

		// Create data types
		listEDataType = createEDataType(LIST);
		fileEDataType = createEDataType(FILE);
		objectEDataType = createEDataType(OBJECT);
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
		AnalysisActivityDescriptionPackage theAnalysisActivityDescriptionPackage = (AnalysisActivityDescriptionPackage)EPackage.Registry.INSTANCE.getEPackage(AnalysisActivityDescriptionPackage.eNS_URI);
		AnalysisactivityexceptionsPackage theAnalysisactivityexceptionsPackage = (AnalysisactivityexceptionsPackage)EPackage.Registry.INSTANCE.getEPackage(AnalysisactivityexceptionsPackage.eNS_URI);

		// Create type parameters
		addETypeParameter(javaMapEClass, "k");
		addETypeParameter(javaMapEClass, "v");
		addETypeParameter(listEDataType, "A");

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(this.getJavaMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getObject());
		g1.getETypeArguments().add(g2);
		parameterMapEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(analysisActivityEClass, AnalysisActivity.class, "AnalysisActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnalysisActivity_Id(), ecorePackage.getEString(), "id", null, 1, 1, AnalysisActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisActivity_Description(), theAnalysisActivityDescriptionPackage.getAnalysisActivityDescription(), null, "description", null, 1, 1, AnalysisActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisActivity_Inputs(), this.getDataset(), null, "inputs", null, 0, -1, AnalysisActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisActivity_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, AnalysisActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisActivity_ParameterMap(), this.getParameterMap(), null, "parameterMap", null, 0, 1, AnalysisActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisActivity_Outputs(), this.getDataset(), null, "outputs", null, 0, -1, AnalysisActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalysisActivity_ErrorReport(), this.getFile(), "errorReport", null, 0, 1, AnalysisActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getAnalysisActivity__InputDatasetForName__String(), this.getDataset(), "inputDatasetForName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAnalysisActivity__OutputDatasetForName__String(), this.getDataset(), "outputDatasetForName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAnalysisActivity__ParameterForName__String(), this.getParameter(), "parameterForName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(datasetEClass, Dataset.class, "Dataset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataset_Name(), ecorePackage.getEString(), "name", null, 1, 1, Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataset_Description(), theAnalysisActivityDescriptionPackage.getDatasetDescription(), null, "description", null, 1, 1, Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataset_Files(), this.getFile(), "files", null, 0, -1, Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Description(), theAnalysisActivityDescriptionPackage.getParameterDescription(), null, "description", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Values(), ecorePackage.getEString(), "values", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getParameter__CheckAndSetValues__Object(), null, "checkAndSetValues", 0, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "A");
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theAnalysisactivityexceptionsPackage.getParameterUpdateException());

		initEClass(javaMapEClass, Map.class, "JavaMap", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterMapEClass, ParameterMap.class, "ParameterMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterMap_Descriptions(), theAnalysisActivityDescriptionPackage.getParameterDescription(), null, "descriptions", null, 0, -1, ParameterMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize data types
		initEDataType(listEDataType, List.class, "List", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fileEDataType, File.class, "File", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(objectEDataType, Object.class, "Object", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/OCL/Collection
		createCollectionAnnotations();
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
			 "aad", "../../br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription/model/analysis-activity-description.ecore#/",
			 "aae", "activity-exceptions.ecore#/"
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
		  (getAnalysisActivity_Inputs(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getAnalysisActivity_Parameters(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getAnalysisActivity_Outputs(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getDataset_Files(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getParameter_Values(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getParameterMap_Descriptions(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });
	}

} //AnalysisActivityModelPackageImpl
