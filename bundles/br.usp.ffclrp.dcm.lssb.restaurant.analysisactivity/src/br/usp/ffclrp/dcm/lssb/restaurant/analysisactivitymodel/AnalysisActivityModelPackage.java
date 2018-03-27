/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel;

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
 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivityModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import aad='../../br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription/model/analysis-activity-description.ecore#/'"
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
	AnalysisActivityModelPackage eINSTANCE = br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.impl.AnalysisActivityModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.impl.AnalysisActivityImpl <em>Analysis Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.impl.AnalysisActivityImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.impl.AnalysisActivityModelPackageImpl#getAnalysisActivity()
	 * @generated
	 */
	int ANALYSIS_ACTIVITY = 0;

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
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
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
	 * The operation id for the '<em>Parameter For Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_ACTIVITY___PARAMETER_FOR_NAME__STRING = 2;

	/**
	 * The number of operations of the '<em>Analysis Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_ACTIVITY_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.impl.DatasetImpl <em>Dataset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.impl.DatasetImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.impl.AnalysisActivityModelPackageImpl#getDataset()
	 * @generated
	 */
	int DATASET = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__PROPERTIES = 1;

	/**
	 * The feature id for the '<em><b>Datasets</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__DATASETS = 2;

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
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.impl.ParameterImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.impl.AnalysisActivityModelPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PROPERTIES = 1;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUES = 2;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>File</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.File
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.impl.AnalysisActivityModelPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 3;


	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity <em>Analysis Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis Activity</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity
	 * @generated
	 */
	EClass getAnalysisActivity();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity#getId()
	 * @see #getAnalysisActivity()
	 * @generated
	 */
	EAttribute getAnalysisActivity_Id();

	/**
	 * Returns the meta object for the reference '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Description</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity#getDescription()
	 * @see #getAnalysisActivity()
	 * @generated
	 */
	EReference getAnalysisActivity_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity#getInputs()
	 * @see #getAnalysisActivity()
	 * @generated
	 */
	EReference getAnalysisActivity_Inputs();

	/**
	 * Returns the meta object for the containment reference list '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity#getParameters()
	 * @see #getAnalysisActivity()
	 * @generated
	 */
	EReference getAnalysisActivity_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity#getOutputs()
	 * @see #getAnalysisActivity()
	 * @generated
	 */
	EReference getAnalysisActivity_Outputs();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity#getErrorReport <em>Error Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Report</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity#getErrorReport()
	 * @see #getAnalysisActivity()
	 * @generated
	 */
	EAttribute getAnalysisActivity_ErrorReport();

	/**
	 * Returns the meta object for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity#inputDatasetForName(java.lang.String) <em>Input Dataset For Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Input Dataset For Name</em>' operation.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity#inputDatasetForName(java.lang.String)
	 * @generated
	 */
	EOperation getAnalysisActivity__InputDatasetForName__String();

	/**
	 * Returns the meta object for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity#outputDatasetForName(java.lang.String) <em>Output Dataset For Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Output Dataset For Name</em>' operation.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity#outputDatasetForName(java.lang.String)
	 * @generated
	 */
	EOperation getAnalysisActivity__OutputDatasetForName__String();

	/**
	 * Returns the meta object for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity#parameterForName(java.lang.String) <em>Parameter For Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Parameter For Name</em>' operation.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity#parameterForName(java.lang.String)
	 * @generated
	 */
	EOperation getAnalysisActivity__ParameterForName__String();

	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Dataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataset</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Dataset
	 * @generated
	 */
	EClass getDataset();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Dataset#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Dataset#getName()
	 * @see #getDataset()
	 * @generated
	 */
	EAttribute getDataset_Name();

	/**
	 * Returns the meta object for the reference '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Dataset#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Properties</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Dataset#getProperties()
	 * @see #getDataset()
	 * @generated
	 */
	EReference getDataset_Properties();

	/**
	 * Returns the meta object for the attribute list '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Dataset#getDatasets <em>Datasets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Datasets</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Dataset#getDatasets()
	 * @see #getDataset()
	 * @generated
	 */
	EAttribute getDataset_Datasets();

	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the reference '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Parameter#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Properties</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Parameter#getProperties()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Properties();

	/**
	 * Returns the meta object for the attribute list '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Parameter#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Parameter#getValues()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Values();

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
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.impl.AnalysisActivityImpl <em>Analysis Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.impl.AnalysisActivityImpl
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.impl.AnalysisActivityModelPackageImpl#getAnalysisActivity()
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
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
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
		 * The meta object literal for the '<em><b>Parameter For Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANALYSIS_ACTIVITY___PARAMETER_FOR_NAME__STRING = eINSTANCE.getAnalysisActivity__ParameterForName__String();

		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.impl.DatasetImpl <em>Dataset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.impl.DatasetImpl
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.impl.AnalysisActivityModelPackageImpl#getDataset()
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
		 * The meta object literal for the '<em><b>Properties</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATASET__PROPERTIES = eINSTANCE.getDataset_Properties();

		/**
		 * The meta object literal for the '<em><b>Datasets</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET__DATASETS = eINSTANCE.getDataset_Datasets();

		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.impl.ParameterImpl
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.impl.AnalysisActivityModelPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__PROPERTIES = eINSTANCE.getParameter_Properties();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUES = eINSTANCE.getParameter_Values();

		/**
		 * The meta object literal for the '<em>File</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.File
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.impl.AnalysisActivityModelPackageImpl#getFile()
		 * @generated
		 */
		EDataType FILE = eINSTANCE.getFile();

	}

} //AnalysisActivityModelPackage
