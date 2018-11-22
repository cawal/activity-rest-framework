/**
 */
package br.usp.ffclrp.dcm.lssb.activityrest.domain;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivityModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import aad='../../br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription/model/analysis-activity-description.ecore#/' aae='activity-exceptions.ecore#/'"
 * @generated
 */
public interface AnalysisActivityModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "analysisactivitymodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://dcm.ffclrp.usp.br/lssb/metamodels/analysis-activity-model.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "aam";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnalysisActivityModelPackage eINSTANCE = br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.AnalysisActivityModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.FileAdapterImpl <em>File Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.FileAdapterImpl
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.AnalysisActivityModelPackageImpl#getFileAdapter()
	 * @generated
	 */
	int FILE_ADAPTER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ADAPTER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ADAPTER__CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ADAPTER__CONTENT_TYPE = 2;

	/**
	 * The number of structural features of the '<em>File Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ADAPTER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>File Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ADAPTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.AnalysisActivityImpl <em>Analysis Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.AnalysisActivityImpl
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.AnalysisActivityModelPackageImpl#getAnalysisActivity()
	 * @generated
	 */
	int ANALYSIS_ACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_ACTIVITY__ID = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_ACTIVITY__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_ACTIVITY__INPUTS = 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_ACTIVITY__PARAMETERS = 3;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_ACTIVITY__OUTPUTS = 4;

	/**
	 * The feature id for the '<em><b>Error Report</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_ACTIVITY__ERROR_REPORT = 5;

	/**
	 * The number of structural features of the '<em>Analysis Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_ACTIVITY_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Input Dataset For Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_ACTIVITY___INPUT_DATASET_FOR_NAME__STRING = 0;

	/**
	 * The operation id for the '<em>Output Dataset For Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_ACTIVITY___OUTPUT_DATASET_FOR_NAME__STRING = 1;

	/**
	 * The number of operations of the '<em>Analysis Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_ACTIVITY_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.DatasetImpl <em>Dataset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.DatasetImpl
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.AnalysisActivityModelPackageImpl#getDataset()
	 * @generated
	 */
	int DATASET = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Files</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__FILES = 2;

	/**
	 * The number of structural features of the '<em>Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.ParameterMapImpl <em>Parameter Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.ParameterMapImpl
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.AnalysisActivityModelPackageImpl#getParameterMap()
	 * @generated
	 */
	int PARAMETER_MAP = 4;

	/**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.AnalysisActivityModelPackageImpl#getList()
	 * @generated
	 */
	int LIST = 6;

	/**
	 * The meta object id for the '<em>File</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.File
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.AnalysisActivityModelPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 7;


	/**
	 * The meta object id for the '{@link java.util.Map <em>Java Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.AnalysisActivityModelPackageImpl#getJavaMap()
	 * @generated
	 */
	int JAVA_MAP = 3;

	/**
	 * The number of structural features of the '<em>Java Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_MAP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Java Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_MAP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAP__DESCRIPTIONS = JAVA_MAP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAP_FEATURE_COUNT = JAVA_MAP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAP___VALIDATE_PARAMETERS__MAP = JAVA_MAP_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAP___VALIDATE_PARAMETER__STRING_OBJECT = JAVA_MAP_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Set Default Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAP___SET_DEFAULT_VALUES = JAVA_MAP_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameter Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MAP_OPERATION_COUNT = JAVA_MAP_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.ValidationResultImpl <em>Validation Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.ValidationResultImpl
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.AnalysisActivityModelPackageImpl#getValidationResult()
	 * @generated
	 */
	int VALIDATION_RESULT = 5;

	/**
	 * The feature id for the '<em><b>Is Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RESULT__IS_VALID = 0;

	/**
	 * The feature id for the '<em><b>Invalid Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RESULT__INVALID_VALUES = 1;

	/**
	 * The number of structural features of the '<em>Validation Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RESULT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Validation Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.AnalysisActivityModelPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 8;


	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.FileAdapter <em>File Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Adapter</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.FileAdapter
	 * @generated
	 */
	EClass getFileAdapter();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.FileAdapter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.FileAdapter#getName()
	 * @see #getFileAdapter()
	 * @generated
	 */
	EAttribute getFileAdapter_Name();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.FileAdapter#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.FileAdapter#getContent()
	 * @see #getFileAdapter()
	 * @generated
	 */
	EAttribute getFileAdapter_Content();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.FileAdapter#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Type</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.FileAdapter#getContentType()
	 * @see #getFileAdapter()
	 * @generated
	 */
	EAttribute getFileAdapter_ContentType();

	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity <em>Analysis Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis Activity</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity
	 * @generated
	 */
	EClass getAnalysisActivity();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity#getId()
	 * @see #getAnalysisActivity()
	 * @generated
	 */
	EAttribute getAnalysisActivity_Id();

	/**
	 * Returns the meta object for the reference '{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Description</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity#getDescription()
	 * @see #getAnalysisActivity()
	 * @generated
	 */
	EReference getAnalysisActivity_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity#getInputs()
	 * @see #getAnalysisActivity()
	 * @generated
	 */
	EReference getAnalysisActivity_Inputs();

	/**
	 * Returns the meta object for the containment reference '{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameters</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity#getParameters()
	 * @see #getAnalysisActivity()
	 * @generated
	 */
	EReference getAnalysisActivity_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity#getOutputs()
	 * @see #getAnalysisActivity()
	 * @generated
	 */
	EReference getAnalysisActivity_Outputs();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity#getErrorReport <em>Error Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Report</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity#getErrorReport()
	 * @see #getAnalysisActivity()
	 * @generated
	 */
	EAttribute getAnalysisActivity_ErrorReport();

	/**
	 * Returns the meta object for the '{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity#inputDatasetForName(java.lang.String) <em>Input Dataset For Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Input Dataset For Name</em>' operation.
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity#inputDatasetForName(java.lang.String)
	 * @generated
	 */
	EOperation getAnalysisActivity__InputDatasetForName__String();

	/**
	 * Returns the meta object for the '{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity#outputDatasetForName(java.lang.String) <em>Output Dataset For Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Output Dataset For Name</em>' operation.
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity#outputDatasetForName(java.lang.String)
	 * @generated
	 */
	EOperation getAnalysisActivity__OutputDatasetForName__String();

	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.Dataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataset</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.Dataset
	 * @generated
	 */
	EClass getDataset();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.Dataset#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.Dataset#getName()
	 * @see #getDataset()
	 * @generated
	 */
	EAttribute getDataset_Name();

	/**
	 * Returns the meta object for the reference '{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.Dataset#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Description</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.Dataset#getDescription()
	 * @see #getDataset()
	 * @generated
	 */
	EReference getDataset_Description();

	/**
	 * Returns the meta object for the attribute list '{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.Dataset#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Files</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.Dataset#getFiles()
	 * @see #getDataset()
	 * @generated
	 */
	EAttribute getDataset_Files();

	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.ParameterMap <em>Parameter Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Map</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.ParameterMap
	 * @generated
	 */
	EClass getParameterMap();

	/**
	 * Returns the meta object for the reference list '{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.ParameterMap#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Descriptions</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.ParameterMap#getDescriptions()
	 * @see #getParameterMap()
	 * @generated
	 */
	EReference getParameterMap_Descriptions();

	/**
	 * Returns the meta object for the '{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.ParameterMap#validateParameters(java.util.Map) <em>Validate Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Parameters</em>' operation.
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.ParameterMap#validateParameters(java.util.Map)
	 * @generated
	 */
	EOperation getParameterMap__ValidateParameters__Map();

	/**
	 * Returns the meta object for the '{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.ParameterMap#validateParameter(java.lang.String, java.lang.Object) <em>Validate Parameter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Parameter</em>' operation.
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.ParameterMap#validateParameter(java.lang.String, java.lang.Object)
	 * @generated
	 */
	EOperation getParameterMap__ValidateParameter__String_Object();

	/**
	 * Returns the meta object for the '{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.ParameterMap#setDefaultValues() <em>Set Default Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Default Values</em>' operation.
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.ParameterMap#setDefaultValues()
	 * @generated
	 */
	EOperation getParameterMap__SetDefaultValues();

	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.ValidationResult <em>Validation Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validation Result</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.ValidationResult
	 * @generated
	 */
	EClass getValidationResult();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.ValidationResult#getIsValid <em>Is Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Valid</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.ValidationResult#getIsValid()
	 * @see #getValidationResult()
	 * @generated
	 */
	EAttribute getValidationResult_IsValid();

	/**
	 * Returns the meta object for the reference '{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.ValidationResult#getInvalidValues <em>Invalid Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invalid Values</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.ValidationResult#getInvalidValues()
	 * @see #getValidationResult()
	 * @generated
	 */
	EReference getValidationResult_InvalidValues();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List" serializeable="false" typeParameters="A"
	 * @generated
	 */
	EDataType getList();

	/**
	 * Returns the meta object for data type '{@link java.io.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>File</em>'.
	 * @see java.io.File
	 * @model instanceClass="java.io.File"
	 * @generated
	 */
	EDataType getFile();

	/**
	 * Returns the meta object for class '{@link java.util.Map <em>Java Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Map</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map" typeParameters="k v"
	 * @generated
	 */
	EClass getJavaMap();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Object</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AnalysisActivityModelFactory getAnalysisActivityModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.FileAdapterImpl <em>File Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.FileAdapterImpl
		 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.AnalysisActivityModelPackageImpl#getFileAdapter()
		 * @generated
		 */
		EClass FILE_ADAPTER = eINSTANCE.getFileAdapter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_ADAPTER__NAME = eINSTANCE.getFileAdapter_Name();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_ADAPTER__CONTENT = eINSTANCE.getFileAdapter_Content();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_ADAPTER__CONTENT_TYPE = eINSTANCE.getFileAdapter_ContentType();

		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.AnalysisActivityImpl <em>Analysis Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.AnalysisActivityImpl
		 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.AnalysisActivityModelPackageImpl#getAnalysisActivity()
		 * @generated
		 */
		EClass ANALYSIS_ACTIVITY = eINSTANCE.getAnalysisActivity();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS_ACTIVITY__ID = eINSTANCE.getAnalysisActivity_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_ACTIVITY__DESCRIPTION = eINSTANCE.getAnalysisActivity_Description();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_ACTIVITY__INPUTS = eINSTANCE.getAnalysisActivity_Inputs();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_ACTIVITY__PARAMETERS = eINSTANCE.getAnalysisActivity_Parameters();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_ACTIVITY__OUTPUTS = eINSTANCE.getAnalysisActivity_Outputs();

		/**
		 * The meta object literal for the '<em><b>Error Report</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS_ACTIVITY__ERROR_REPORT = eINSTANCE.getAnalysisActivity_ErrorReport();

		/**
		 * The meta object literal for the '<em><b>Input Dataset For Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANALYSIS_ACTIVITY___INPUT_DATASET_FOR_NAME__STRING = eINSTANCE.getAnalysisActivity__InputDatasetForName__String();

		/**
		 * The meta object literal for the '<em><b>Output Dataset For Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANALYSIS_ACTIVITY___OUTPUT_DATASET_FOR_NAME__STRING = eINSTANCE.getAnalysisActivity__OutputDatasetForName__String();

		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.DatasetImpl <em>Dataset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.DatasetImpl
		 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.AnalysisActivityModelPackageImpl#getDataset()
		 * @generated
		 */
		EClass DATASET = eINSTANCE.getDataset();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET__NAME = eINSTANCE.getDataset_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATASET__DESCRIPTION = eINSTANCE.getDataset_Description();

		/**
		 * The meta object literal for the '<em><b>Files</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET__FILES = eINSTANCE.getDataset_Files();

		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.ParameterMapImpl <em>Parameter Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.ParameterMapImpl
		 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.AnalysisActivityModelPackageImpl#getParameterMap()
		 * @generated
		 */
		EClass PARAMETER_MAP = eINSTANCE.getParameterMap();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_MAP__DESCRIPTIONS = eINSTANCE.getParameterMap_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Validate Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_MAP___VALIDATE_PARAMETERS__MAP = eINSTANCE.getParameterMap__ValidateParameters__Map();

		/**
		 * The meta object literal for the '<em><b>Validate Parameter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_MAP___VALIDATE_PARAMETER__STRING_OBJECT = eINSTANCE.getParameterMap__ValidateParameter__String_Object();

		/**
		 * The meta object literal for the '<em><b>Set Default Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_MAP___SET_DEFAULT_VALUES = eINSTANCE.getParameterMap__SetDefaultValues();

		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.ValidationResultImpl <em>Validation Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.ValidationResultImpl
		 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.AnalysisActivityModelPackageImpl#getValidationResult()
		 * @generated
		 */
		EClass VALIDATION_RESULT = eINSTANCE.getValidationResult();

		/**
		 * The meta object literal for the '<em><b>Is Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_RESULT__IS_VALID = eINSTANCE.getValidationResult_IsValid();

		/**
		 * The meta object literal for the '<em><b>Invalid Values</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATION_RESULT__INVALID_VALUES = eINSTANCE.getValidationResult_InvalidValues();

		/**
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.AnalysisActivityModelPackageImpl#getList()
		 * @generated
		 */
		EDataType LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em>File</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.File
		 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.AnalysisActivityModelPackageImpl#getFile()
		 * @generated
		 */
		EDataType FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '{@link java.util.Map <em>Java Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.AnalysisActivityModelPackageImpl#getJavaMap()
		 * @generated
		 */
		EClass JAVA_MAP = eINSTANCE.getJavaMap();

		/**
		 * The meta object literal for the '<em>Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.AnalysisActivityModelPackageImpl#getObject()
		 * @generated
		 */
		EDataType OBJECT = eINSTANCE.getObject();

	}

} //AnalysisActivityModelPackage
