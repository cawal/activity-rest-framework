/**
 */
package br.usp.ffclrp.dcm.lssb.activityrest.domain.impl;

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
import org.eclipse.emf.ecore.impl.EPackageImpl;

import br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivityModelFactory;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivityModelPackage;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.Dataset;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.FileAdapter;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.ParameterMap;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.ValidationResult;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage;
import br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.StringListManipulatorsPackage;

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
	private EClass fileAdapterEClass = null;

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
	private EClass validationResultEClass = null;

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
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivityModelPackage#eNS_URI
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
		Object registeredAnalysisActivityModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AnalysisActivityModelPackageImpl theAnalysisActivityModelPackage = registeredAnalysisActivityModelPackage instanceof AnalysisActivityModelPackageImpl ? (AnalysisActivityModelPackageImpl)registeredAnalysisActivityModelPackage : new AnalysisActivityModelPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		AnalysisActivityDescriptionPackage.eINSTANCE.eClass();
		StringListManipulatorsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAnalysisActivityModelPackage.createPackageContents();

		// Initialize created meta-data
		theAnalysisActivityModelPackage.initializePackageContents();

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
	public EClass getFileAdapter() {
		return fileAdapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileAdapter_Name() {
		return (EAttribute)fileAdapterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileAdapter_Content() {
		return (EAttribute)fileAdapterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileAdapter_ContentType() {
		return (EAttribute)fileAdapterEClass.getEStructuralFeatures().get(2);
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
	public EReference getAnalysisActivity_Outputs() {
		return (EReference)analysisActivityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalysisActivity_ErrorReport() {
		return (EAttribute)analysisActivityEClass.getEStructuralFeatures().get(5);
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
	public EOperation getParameterMap__ValidateParameters__Map() {
		return parameterMapEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterMap__ValidateParameter__String_Object() {
		return parameterMapEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterMap__SetDefaultValues() {
		return parameterMapEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValidationResult() {
		return validationResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValidationResult_IsValid() {
		return (EAttribute)validationResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValidationResult_InvalidValues() {
		return (EReference)validationResultEClass.getEStructuralFeatures().get(1);
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
		fileAdapterEClass = createEClass(FILE_ADAPTER);
		createEAttribute(fileAdapterEClass, FILE_ADAPTER__NAME);
		createEAttribute(fileAdapterEClass, FILE_ADAPTER__CONTENT);
		createEAttribute(fileAdapterEClass, FILE_ADAPTER__CONTENT_TYPE);

		analysisActivityEClass = createEClass(ANALYSIS_ACTIVITY);
		createEAttribute(analysisActivityEClass, ANALYSIS_ACTIVITY__ID);
		createEReference(analysisActivityEClass, ANALYSIS_ACTIVITY__DESCRIPTION);
		createEReference(analysisActivityEClass, ANALYSIS_ACTIVITY__INPUTS);
		createEReference(analysisActivityEClass, ANALYSIS_ACTIVITY__PARAMETERS);
		createEReference(analysisActivityEClass, ANALYSIS_ACTIVITY__OUTPUTS);
		createEAttribute(analysisActivityEClass, ANALYSIS_ACTIVITY__ERROR_REPORT);
		createEOperation(analysisActivityEClass, ANALYSIS_ACTIVITY___INPUT_DATASET_FOR_NAME__STRING);
		createEOperation(analysisActivityEClass, ANALYSIS_ACTIVITY___OUTPUT_DATASET_FOR_NAME__STRING);

		datasetEClass = createEClass(DATASET);
		createEAttribute(datasetEClass, DATASET__NAME);
		createEReference(datasetEClass, DATASET__DESCRIPTION);
		createEAttribute(datasetEClass, DATASET__FILES);

		javaMapEClass = createEClass(JAVA_MAP);

		parameterMapEClass = createEClass(PARAMETER_MAP);
		createEReference(parameterMapEClass, PARAMETER_MAP__DESCRIPTIONS);
		createEOperation(parameterMapEClass, PARAMETER_MAP___VALIDATE_PARAMETERS__MAP);
		createEOperation(parameterMapEClass, PARAMETER_MAP___VALIDATE_PARAMETER__STRING_OBJECT);
		createEOperation(parameterMapEClass, PARAMETER_MAP___SET_DEFAULT_VALUES);

		validationResultEClass = createEClass(VALIDATION_RESULT);
		createEAttribute(validationResultEClass, VALIDATION_RESULT__IS_VALID);
		createEReference(validationResultEClass, VALIDATION_RESULT__INVALID_VALUES);

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
		initEClass(fileAdapterEClass, FileAdapter.class, "FileAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileAdapter_Name(), ecorePackage.getEString(), "name", null, 1, 1, FileAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileAdapter_Content(), this.getObject(), "content", null, 1, 1, FileAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileAdapter_ContentType(), ecorePackage.getEString(), "contentType", null, 0, 1, FileAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analysisActivityEClass, AnalysisActivity.class, "AnalysisActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnalysisActivity_Id(), ecorePackage.getEString(), "id", null, 1, 1, AnalysisActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisActivity_Description(), theAnalysisActivityDescriptionPackage.getActivity(), null, "description", null, 0, 1, AnalysisActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisActivity_Inputs(), this.getDataset(), null, "inputs", null, 0, -1, AnalysisActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisActivity_Parameters(), this.getParameterMap(), null, "parameters", null, 1, 1, AnalysisActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisActivity_Outputs(), this.getDataset(), null, "outputs", null, 0, -1, AnalysisActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalysisActivity_ErrorReport(), this.getFile(), "errorReport", null, 0, 1, AnalysisActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getAnalysisActivity__InputDatasetForName__String(), this.getDataset(), "inputDatasetForName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAnalysisActivity__OutputDatasetForName__String(), this.getDataset(), "outputDatasetForName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(datasetEClass, Dataset.class, "Dataset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataset_Name(), ecorePackage.getEString(), "name", null, 1, 1, Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataset_Description(), theAnalysisActivityDescriptionPackage.getDataset(), null, "description", null, 0, 1, Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataset_Files(), this.getFile(), "files", null, 0, -1, Dataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaMapEClass, Map.class, "JavaMap", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterMapEClass, ParameterMap.class, "ParameterMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterMap_Descriptions(), theAnalysisActivityDescriptionPackage.getParameter(), null, "descriptions", null, 0, -1, ParameterMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getParameterMap__ValidateParameters__Map(), this.getValidationResult(), "validateParameters", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getJavaMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "map", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameterMap__ValidateParameter__String_Object(), this.getValidationResult(), "validateParameter", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getParameterMap__SetDefaultValues(), null, "setDefaultValues", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(validationResultEClass, ValidationResult.class, "ValidationResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValidationResult_IsValid(), ecorePackage.getEBooleanObject(), "isValid", null, 0, 1, ValidationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getJavaMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getObject());
		g1.getETypeArguments().add(g2);
		initEReference(getValidationResult_InvalidValues(), g1, null, "invalidValues", null, 1, 1, ValidationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (getParameterMap_Descriptions(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
	}

} //AnalysisActivityModelPackageImpl
