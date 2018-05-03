/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import slm='string-list-manipulators.ecore#/'"
 * @generated
 */
public interface AnalysisActivityDescriptionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "analysisactivitydescription";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://dcm.ffclrp.usp.br/lssb/metamodels/analysis-activity-description.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "aad";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnalysisActivityDescriptionPackage eINSTANCE = br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl.init();

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionImpl <em>Analysis Activity Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getAnalysisActivityDescription()
	 * @generated
	 */
	int ANALYSIS_ACTIVITY_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_ACTIVITY_DESCRIPTION__PARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Input Datasets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_ACTIVITY_DESCRIPTION__INPUT_DATASETS = 1;

	/**
	 * The feature id for the '<em><b>Output Datasets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_ACTIVITY_DESCRIPTION__OUTPUT_DATASETS = 2;

	/**
	 * The feature id for the '<em><b>Command Line Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_ACTIVITY_DESCRIPTION__COMMAND_LINE_TEMPLATE = 3;

	/**
	 * The feature id for the '<em><b>Readiness Contraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_ACTIVITY_DESCRIPTION__READINESS_CONTRAINTS = 4;

	/**
	 * The number of structural features of the '<em>Analysis Activity Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_ACTIVITY_DESCRIPTION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Analysis Activity Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_ACTIVITY_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ParameterDescriptionImpl <em>Parameter Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ParameterDescriptionImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getParameterDescription()
	 * @generated
	 */
	int PARAMETER_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DESCRIPTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parameter Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DESCRIPTION__PARAMETER_KIND = 1;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DESCRIPTION__PARAMETER_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DESCRIPTION__DEFAULT_VALUE = 3;

	/**
	 * The number of structural features of the '<em>Parameter Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DESCRIPTION_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Is Valid Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DESCRIPTION___IS_VALID_VALUE__BIGINTEGER = 0;

	/**
	 * The operation id for the '<em>Is Valid Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DESCRIPTION___IS_VALID_VALUE__OBJECT = 1;

	/**
	 * The operation id for the '<em>Is Valid Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DESCRIPTION___IS_VALID_VALUE__LIST = 2;

	/**
	 * The number of operations of the '<em>Parameter Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DESCRIPTION_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.DatasetDescriptionImpl <em>Dataset Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.DatasetDescriptionImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getDatasetDescription()
	 * @generated
	 */
	int DATASET_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_DESCRIPTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Mimetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_DESCRIPTION__MIMETYPE = 1;

	/**
	 * The feature id for the '<em><b>Dataset Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_DESCRIPTION__DATASET_KIND = 2;

	/**
	 * The number of structural features of the '<em>Dataset Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_DESCRIPTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Dataset Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.CommandLineEntryListImpl <em>Command Line Entry List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.CommandLineEntryListImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getCommandLineEntryList()
	 * @generated
	 */
	int COMMAND_LINE_ENTRY_LIST = 3;

	/**
	 * The feature id for the '<em><b>Manipulators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE_ENTRY_LIST__MANIPULATORS = 0;

	/**
	 * The number of structural features of the '<em>Command Line Entry List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE_ENTRY_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Command Line Entry List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE_ENTRY_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.LiteralCommandLineEntryListImpl <em>Literal Command Line Entry List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.LiteralCommandLineEntryListImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getLiteralCommandLineEntryList()
	 * @generated
	 */
	int LITERAL_COMMAND_LINE_ENTRY_LIST = 4;

	/**
	 * The feature id for the '<em><b>Manipulators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_COMMAND_LINE_ENTRY_LIST__MANIPULATORS = COMMAND_LINE_ENTRY_LIST__MANIPULATORS;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_COMMAND_LINE_ENTRY_LIST__LITERALS = COMMAND_LINE_ENTRY_LIST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Command Line Entry List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_COMMAND_LINE_ENTRY_LIST_FEATURE_COUNT = COMMAND_LINE_ENTRY_LIST_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal Command Line Entry List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_COMMAND_LINE_ENTRY_LIST_OPERATION_COUNT = COMMAND_LINE_ENTRY_LIST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.DatasetCommandLineEntryListImpl <em>Dataset Command Line Entry List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.DatasetCommandLineEntryListImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getDatasetCommandLineEntryList()
	 * @generated
	 */
	int DATASET_COMMAND_LINE_ENTRY_LIST = 5;

	/**
	 * The feature id for the '<em><b>Manipulators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_COMMAND_LINE_ENTRY_LIST__MANIPULATORS = COMMAND_LINE_ENTRY_LIST__MANIPULATORS;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_COMMAND_LINE_ENTRY_LIST__DATASET = COMMAND_LINE_ENTRY_LIST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dataset Command Line Entry List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_COMMAND_LINE_ENTRY_LIST_FEATURE_COUNT = COMMAND_LINE_ENTRY_LIST_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dataset Command Line Entry List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_COMMAND_LINE_ENTRY_LIST_OPERATION_COUNT = COMMAND_LINE_ENTRY_LIST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ParameterCommandLineEntryListImpl <em>Parameter Command Line Entry List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ParameterCommandLineEntryListImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getParameterCommandLineEntryList()
	 * @generated
	 */
	int PARAMETER_COMMAND_LINE_ENTRY_LIST = 6;

	/**
	 * The feature id for the '<em><b>Manipulators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_COMMAND_LINE_ENTRY_LIST__MANIPULATORS = COMMAND_LINE_ENTRY_LIST__MANIPULATORS;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_COMMAND_LINE_ENTRY_LIST__PARAMETER = COMMAND_LINE_ENTRY_LIST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Command Line Entry List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_COMMAND_LINE_ENTRY_LIST_FEATURE_COUNT = COMMAND_LINE_ENTRY_LIST_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Command Line Entry List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_COMMAND_LINE_ENTRY_LIST_OPERATION_COUNT = COMMAND_LINE_ENTRY_LIST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ReadinessConstraintImpl <em>Readiness Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ReadinessConstraintImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getReadinessConstraint()
	 * @generated
	 */
	int READINESS_CONSTRAINT = 7;

	/**
	 * The number of structural features of the '<em>Readiness Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READINESS_CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Readiness Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READINESS_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.DatasetConstraintImpl <em>Dataset Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.DatasetConstraintImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getDatasetConstraint()
	 * @generated
	 */
	int DATASET_CONSTRAINT = 8;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_CONSTRAINT__DATASET = READINESS_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dataset Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_CONSTRAINT_FEATURE_COUNT = READINESS_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dataset Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_CONSTRAINT_OPERATION_COUNT = READINESS_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.MinimunDatasetCardinalityConstraintImpl <em>Minimun Dataset Cardinality Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.MinimunDatasetCardinalityConstraintImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getMinimunDatasetCardinalityConstraint()
	 * @generated
	 */
	int MINIMUN_DATASET_CARDINALITY_CONSTRAINT = 9;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUN_DATASET_CARDINALITY_CONSTRAINT__DATASET = DATASET_CONSTRAINT__DATASET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUN_DATASET_CARDINALITY_CONSTRAINT__VALUE = DATASET_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Minimun Dataset Cardinality Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUN_DATASET_CARDINALITY_CONSTRAINT_FEATURE_COUNT = DATASET_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Minimun Dataset Cardinality Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUN_DATASET_CARDINALITY_CONSTRAINT_OPERATION_COUNT = DATASET_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.MaximunDatasetCardinalityConstraintImpl <em>Maximun Dataset Cardinality Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.MaximunDatasetCardinalityConstraintImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getMaximunDatasetCardinalityConstraint()
	 * @generated
	 */
	int MAXIMUN_DATASET_CARDINALITY_CONSTRAINT = 10;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMUN_DATASET_CARDINALITY_CONSTRAINT__DATASET = DATASET_CONSTRAINT__DATASET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMUN_DATASET_CARDINALITY_CONSTRAINT__VALUE = DATASET_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Maximun Dataset Cardinality Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMUN_DATASET_CARDINALITY_CONSTRAINT_FEATURE_COUNT = DATASET_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Maximun Dataset Cardinality Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMUN_DATASET_CARDINALITY_CONSTRAINT_OPERATION_COUNT = DATASET_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ParameterConstraintImpl <em>Parameter Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ParameterConstraintImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getParameterConstraint()
	 * @generated
	 */
	int PARAMETER_CONSTRAINT = 11;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONSTRAINT__PARAMETER = READINESS_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONSTRAINT_FEATURE_COUNT = READINESS_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONSTRAINT_OPERATION_COUNT = READINESS_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.MinimunParameterCardinalityConstraintImpl <em>Minimun Parameter Cardinality Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.MinimunParameterCardinalityConstraintImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getMinimunParameterCardinalityConstraint()
	 * @generated
	 */
	int MINIMUN_PARAMETER_CARDINALITY_CONSTRAINT = 12;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUN_PARAMETER_CARDINALITY_CONSTRAINT__PARAMETER = PARAMETER_CONSTRAINT__PARAMETER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUN_PARAMETER_CARDINALITY_CONSTRAINT__VALUE = PARAMETER_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Minimun Parameter Cardinality Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUN_PARAMETER_CARDINALITY_CONSTRAINT_FEATURE_COUNT = PARAMETER_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Minimun Parameter Cardinality Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUN_PARAMETER_CARDINALITY_CONSTRAINT_OPERATION_COUNT = PARAMETER_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.MaximunParameterCardinalityConstraintImpl <em>Maximun Parameter Cardinality Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.MaximunParameterCardinalityConstraintImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getMaximunParameterCardinalityConstraint()
	 * @generated
	 */
	int MAXIMUN_PARAMETER_CARDINALITY_CONSTRAINT = 13;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMUN_PARAMETER_CARDINALITY_CONSTRAINT__PARAMETER = PARAMETER_CONSTRAINT__PARAMETER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMUN_PARAMETER_CARDINALITY_CONSTRAINT__VALUE = PARAMETER_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Maximun Parameter Cardinality Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMUN_PARAMETER_CARDINALITY_CONSTRAINT_FEATURE_COUNT = PARAMETER_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Maximun Parameter Cardinality Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMUN_PARAMETER_CARDINALITY_CONSTRAINT_OPERATION_COUNT = PARAMETER_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterKind <em>Parameter Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterKind
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getParameterKind()
	 * @generated
	 */
	int PARAMETER_KIND = 14;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterType <em>Parameter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterType
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 15;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetKind <em>Dataset Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetKind
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getDatasetKind()
	 * @generated
	 */
	int DATASET_KIND = 16;

	/**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getList()
	 * @generated
	 */
	int LIST = 17;

	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescription <em>Analysis Activity Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis Activity Description</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescription
	 * @generated
	 */
	EClass getAnalysisActivityDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescription#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescription#getParameters()
	 * @see #getAnalysisActivityDescription()
	 * @generated
	 */
	EReference getAnalysisActivityDescription_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescription#getInputDatasets <em>Input Datasets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Datasets</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescription#getInputDatasets()
	 * @see #getAnalysisActivityDescription()
	 * @generated
	 */
	EReference getAnalysisActivityDescription_InputDatasets();

	/**
	 * Returns the meta object for the containment reference list '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescription#getOutputDatasets <em>Output Datasets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Datasets</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescription#getOutputDatasets()
	 * @see #getAnalysisActivityDescription()
	 * @generated
	 */
	EReference getAnalysisActivityDescription_OutputDatasets();

	/**
	 * Returns the meta object for the containment reference list '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescription#getCommandLineTemplate <em>Command Line Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Command Line Template</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescription#getCommandLineTemplate()
	 * @see #getAnalysisActivityDescription()
	 * @generated
	 */
	EReference getAnalysisActivityDescription_CommandLineTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescription#getReadinessContraints <em>Readiness Contraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Readiness Contraints</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescription#getReadinessContraints()
	 * @see #getAnalysisActivityDescription()
	 * @generated
	 */
	EReference getAnalysisActivityDescription_ReadinessContraints();

	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription <em>Parameter Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Description</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription
	 * @generated
	 */
	EClass getParameterDescription();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription#getName()
	 * @see #getParameterDescription()
	 * @generated
	 */
	EAttribute getParameterDescription_Name();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription#getParameterKind <em>Parameter Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Kind</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription#getParameterKind()
	 * @see #getParameterDescription()
	 * @generated
	 */
	EAttribute getParameterDescription_ParameterKind();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription#getParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Type</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription#getParameterType()
	 * @see #getParameterDescription()
	 * @generated
	 */
	EAttribute getParameterDescription_ParameterType();

	/**
	 * Returns the meta object for the attribute list '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Default Value</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription#getDefaultValue()
	 * @see #getParameterDescription()
	 * @generated
	 */
	EAttribute getParameterDescription_DefaultValue();

	/**
	 * Returns the meta object for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription#isValidValue(org.eclipse.emf.common.util.EList) <em>Is Valid Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid Value</em>' operation.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription#isValidValue(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getParameterDescription__IsValidValue__BigInteger();

	/**
	 * Returns the meta object for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription#isValidValue(java.lang.Object) <em>Is Valid Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid Value</em>' operation.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription#isValidValue(java.lang.Object)
	 * @generated
	 */
	EOperation getParameterDescription__IsValidValue__Object();

	/**
	 * Returns the meta object for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription#isValidValue(java.util.List) <em>Is Valid Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid Value</em>' operation.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription#isValidValue(java.util.List)
	 * @generated
	 */
	EOperation getParameterDescription__IsValidValue__List();

	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetDescription <em>Dataset Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataset Description</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetDescription
	 * @generated
	 */
	EClass getDatasetDescription();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetDescription#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetDescription#getName()
	 * @see #getDatasetDescription()
	 * @generated
	 */
	EAttribute getDatasetDescription_Name();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetDescription#getMimetype <em>Mimetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mimetype</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetDescription#getMimetype()
	 * @see #getDatasetDescription()
	 * @generated
	 */
	EAttribute getDatasetDescription_Mimetype();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetDescription#getDatasetKind <em>Dataset Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dataset Kind</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetDescription#getDatasetKind()
	 * @see #getDatasetDescription()
	 * @generated
	 */
	EAttribute getDatasetDescription_DatasetKind();

	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineEntryList <em>Command Line Entry List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Line Entry List</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineEntryList
	 * @generated
	 */
	EClass getCommandLineEntryList();

	/**
	 * Returns the meta object for the containment reference list '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineEntryList#getManipulators <em>Manipulators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Manipulators</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineEntryList#getManipulators()
	 * @see #getCommandLineEntryList()
	 * @generated
	 */
	EReference getCommandLineEntryList_Manipulators();

	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.LiteralCommandLineEntryList <em>Literal Command Line Entry List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Command Line Entry List</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.LiteralCommandLineEntryList
	 * @generated
	 */
	EClass getLiteralCommandLineEntryList();

	/**
	 * Returns the meta object for the attribute list '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.LiteralCommandLineEntryList#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Literals</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.LiteralCommandLineEntryList#getLiterals()
	 * @see #getLiteralCommandLineEntryList()
	 * @generated
	 */
	EAttribute getLiteralCommandLineEntryList_Literals();

	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetCommandLineEntryList <em>Dataset Command Line Entry List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataset Command Line Entry List</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetCommandLineEntryList
	 * @generated
	 */
	EClass getDatasetCommandLineEntryList();

	/**
	 * Returns the meta object for the reference '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetCommandLineEntryList#getDataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dataset</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetCommandLineEntryList#getDataset()
	 * @see #getDatasetCommandLineEntryList()
	 * @generated
	 */
	EReference getDatasetCommandLineEntryList_Dataset();

	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterCommandLineEntryList <em>Parameter Command Line Entry List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Command Line Entry List</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterCommandLineEntryList
	 * @generated
	 */
	EClass getParameterCommandLineEntryList();

	/**
	 * Returns the meta object for the reference '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterCommandLineEntryList#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterCommandLineEntryList#getParameter()
	 * @see #getParameterCommandLineEntryList()
	 * @generated
	 */
	EReference getParameterCommandLineEntryList_Parameter();

	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ReadinessConstraint <em>Readiness Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Readiness Constraint</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ReadinessConstraint
	 * @generated
	 */
	EClass getReadinessConstraint();

	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetConstraint <em>Dataset Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataset Constraint</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetConstraint
	 * @generated
	 */
	EClass getDatasetConstraint();

	/**
	 * Returns the meta object for the reference '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetConstraint#getDataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dataset</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetConstraint#getDataset()
	 * @see #getDatasetConstraint()
	 * @generated
	 */
	EReference getDatasetConstraint_Dataset();

	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MinimunDatasetCardinalityConstraint <em>Minimun Dataset Cardinality Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minimun Dataset Cardinality Constraint</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MinimunDatasetCardinalityConstraint
	 * @generated
	 */
	EClass getMinimunDatasetCardinalityConstraint();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MinimunDatasetCardinalityConstraint#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MinimunDatasetCardinalityConstraint#getValue()
	 * @see #getMinimunDatasetCardinalityConstraint()
	 * @generated
	 */
	EAttribute getMinimunDatasetCardinalityConstraint_Value();

	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MaximunDatasetCardinalityConstraint <em>Maximun Dataset Cardinality Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maximun Dataset Cardinality Constraint</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MaximunDatasetCardinalityConstraint
	 * @generated
	 */
	EClass getMaximunDatasetCardinalityConstraint();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MaximunDatasetCardinalityConstraint#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MaximunDatasetCardinalityConstraint#getValue()
	 * @see #getMaximunDatasetCardinalityConstraint()
	 * @generated
	 */
	EAttribute getMaximunDatasetCardinalityConstraint_Value();

	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterConstraint <em>Parameter Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Constraint</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterConstraint
	 * @generated
	 */
	EClass getParameterConstraint();

	/**
	 * Returns the meta object for the reference '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterConstraint#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterConstraint#getParameter()
	 * @see #getParameterConstraint()
	 * @generated
	 */
	EReference getParameterConstraint_Parameter();

	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MinimunParameterCardinalityConstraint <em>Minimun Parameter Cardinality Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minimun Parameter Cardinality Constraint</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MinimunParameterCardinalityConstraint
	 * @generated
	 */
	EClass getMinimunParameterCardinalityConstraint();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MinimunParameterCardinalityConstraint#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MinimunParameterCardinalityConstraint#getValue()
	 * @see #getMinimunParameterCardinalityConstraint()
	 * @generated
	 */
	EAttribute getMinimunParameterCardinalityConstraint_Value();

	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MaximunParameterCardinalityConstraint <em>Maximun Parameter Cardinality Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maximun Parameter Cardinality Constraint</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MaximunParameterCardinalityConstraint
	 * @generated
	 */
	EClass getMaximunParameterCardinalityConstraint();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MaximunParameterCardinalityConstraint#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MaximunParameterCardinalityConstraint#getValue()
	 * @see #getMaximunParameterCardinalityConstraint()
	 * @generated
	 */
	EAttribute getMaximunParameterCardinalityConstraint_Value();

	/**
	 * Returns the meta object for enum '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterKind <em>Parameter Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Kind</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterKind
	 * @generated
	 */
	EEnum getParameterKind();

	/**
	 * Returns the meta object for enum '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Type</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterType
	 * @generated
	 */
	EEnum getParameterType();

	/**
	 * Returns the meta object for enum '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetKind <em>Dataset Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dataset Kind</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetKind
	 * @generated
	 */
	EEnum getDatasetKind();

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
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AnalysisActivityDescriptionFactory getAnalysisActivityDescriptionFactory();

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
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionImpl <em>Analysis Activity Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionImpl
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getAnalysisActivityDescription()
		 * @generated
		 */
		EClass ANALYSIS_ACTIVITY_DESCRIPTION = eINSTANCE.getAnalysisActivityDescription();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_ACTIVITY_DESCRIPTION__PARAMETERS = eINSTANCE.getAnalysisActivityDescription_Parameters();

		/**
		 * The meta object literal for the '<em><b>Input Datasets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_ACTIVITY_DESCRIPTION__INPUT_DATASETS = eINSTANCE.getAnalysisActivityDescription_InputDatasets();

		/**
		 * The meta object literal for the '<em><b>Output Datasets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_ACTIVITY_DESCRIPTION__OUTPUT_DATASETS = eINSTANCE.getAnalysisActivityDescription_OutputDatasets();

		/**
		 * The meta object literal for the '<em><b>Command Line Template</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_ACTIVITY_DESCRIPTION__COMMAND_LINE_TEMPLATE = eINSTANCE.getAnalysisActivityDescription_CommandLineTemplate();

		/**
		 * The meta object literal for the '<em><b>Readiness Contraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_ACTIVITY_DESCRIPTION__READINESS_CONTRAINTS = eINSTANCE.getAnalysisActivityDescription_ReadinessContraints();

		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ParameterDescriptionImpl <em>Parameter Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ParameterDescriptionImpl
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getParameterDescription()
		 * @generated
		 */
		EClass PARAMETER_DESCRIPTION = eINSTANCE.getParameterDescription();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_DESCRIPTION__NAME = eINSTANCE.getParameterDescription_Name();

		/**
		 * The meta object literal for the '<em><b>Parameter Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_DESCRIPTION__PARAMETER_KIND = eINSTANCE.getParameterDescription_ParameterKind();

		/**
		 * The meta object literal for the '<em><b>Parameter Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_DESCRIPTION__PARAMETER_TYPE = eINSTANCE.getParameterDescription_ParameterType();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_DESCRIPTION__DEFAULT_VALUE = eINSTANCE.getParameterDescription_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Is Valid Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_DESCRIPTION___IS_VALID_VALUE__BIGINTEGER = eINSTANCE.getParameterDescription__IsValidValue__BigInteger();

		/**
		 * The meta object literal for the '<em><b>Is Valid Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_DESCRIPTION___IS_VALID_VALUE__OBJECT = eINSTANCE.getParameterDescription__IsValidValue__Object();

		/**
		 * The meta object literal for the '<em><b>Is Valid Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_DESCRIPTION___IS_VALID_VALUE__LIST = eINSTANCE.getParameterDescription__IsValidValue__List();

		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.DatasetDescriptionImpl <em>Dataset Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.DatasetDescriptionImpl
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getDatasetDescription()
		 * @generated
		 */
		EClass DATASET_DESCRIPTION = eINSTANCE.getDatasetDescription();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET_DESCRIPTION__NAME = eINSTANCE.getDatasetDescription_Name();

		/**
		 * The meta object literal for the '<em><b>Mimetype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET_DESCRIPTION__MIMETYPE = eINSTANCE.getDatasetDescription_Mimetype();

		/**
		 * The meta object literal for the '<em><b>Dataset Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET_DESCRIPTION__DATASET_KIND = eINSTANCE.getDatasetDescription_DatasetKind();

		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.CommandLineEntryListImpl <em>Command Line Entry List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.CommandLineEntryListImpl
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getCommandLineEntryList()
		 * @generated
		 */
		EClass COMMAND_LINE_ENTRY_LIST = eINSTANCE.getCommandLineEntryList();

		/**
		 * The meta object literal for the '<em><b>Manipulators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_LINE_ENTRY_LIST__MANIPULATORS = eINSTANCE.getCommandLineEntryList_Manipulators();

		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.LiteralCommandLineEntryListImpl <em>Literal Command Line Entry List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.LiteralCommandLineEntryListImpl
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getLiteralCommandLineEntryList()
		 * @generated
		 */
		EClass LITERAL_COMMAND_LINE_ENTRY_LIST = eINSTANCE.getLiteralCommandLineEntryList();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_COMMAND_LINE_ENTRY_LIST__LITERALS = eINSTANCE.getLiteralCommandLineEntryList_Literals();

		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.DatasetCommandLineEntryListImpl <em>Dataset Command Line Entry List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.DatasetCommandLineEntryListImpl
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getDatasetCommandLineEntryList()
		 * @generated
		 */
		EClass DATASET_COMMAND_LINE_ENTRY_LIST = eINSTANCE.getDatasetCommandLineEntryList();

		/**
		 * The meta object literal for the '<em><b>Dataset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATASET_COMMAND_LINE_ENTRY_LIST__DATASET = eINSTANCE.getDatasetCommandLineEntryList_Dataset();

		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ParameterCommandLineEntryListImpl <em>Parameter Command Line Entry List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ParameterCommandLineEntryListImpl
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getParameterCommandLineEntryList()
		 * @generated
		 */
		EClass PARAMETER_COMMAND_LINE_ENTRY_LIST = eINSTANCE.getParameterCommandLineEntryList();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_COMMAND_LINE_ENTRY_LIST__PARAMETER = eINSTANCE.getParameterCommandLineEntryList_Parameter();

		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ReadinessConstraintImpl <em>Readiness Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ReadinessConstraintImpl
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getReadinessConstraint()
		 * @generated
		 */
		EClass READINESS_CONSTRAINT = eINSTANCE.getReadinessConstraint();

		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.DatasetConstraintImpl <em>Dataset Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.DatasetConstraintImpl
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getDatasetConstraint()
		 * @generated
		 */
		EClass DATASET_CONSTRAINT = eINSTANCE.getDatasetConstraint();

		/**
		 * The meta object literal for the '<em><b>Dataset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATASET_CONSTRAINT__DATASET = eINSTANCE.getDatasetConstraint_Dataset();

		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.MinimunDatasetCardinalityConstraintImpl <em>Minimun Dataset Cardinality Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.MinimunDatasetCardinalityConstraintImpl
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getMinimunDatasetCardinalityConstraint()
		 * @generated
		 */
		EClass MINIMUN_DATASET_CARDINALITY_CONSTRAINT = eINSTANCE.getMinimunDatasetCardinalityConstraint();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINIMUN_DATASET_CARDINALITY_CONSTRAINT__VALUE = eINSTANCE.getMinimunDatasetCardinalityConstraint_Value();

		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.MaximunDatasetCardinalityConstraintImpl <em>Maximun Dataset Cardinality Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.MaximunDatasetCardinalityConstraintImpl
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getMaximunDatasetCardinalityConstraint()
		 * @generated
		 */
		EClass MAXIMUN_DATASET_CARDINALITY_CONSTRAINT = eINSTANCE.getMaximunDatasetCardinalityConstraint();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAXIMUN_DATASET_CARDINALITY_CONSTRAINT__VALUE = eINSTANCE.getMaximunDatasetCardinalityConstraint_Value();

		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ParameterConstraintImpl <em>Parameter Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ParameterConstraintImpl
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getParameterConstraint()
		 * @generated
		 */
		EClass PARAMETER_CONSTRAINT = eINSTANCE.getParameterConstraint();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_CONSTRAINT__PARAMETER = eINSTANCE.getParameterConstraint_Parameter();

		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.MinimunParameterCardinalityConstraintImpl <em>Minimun Parameter Cardinality Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.MinimunParameterCardinalityConstraintImpl
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getMinimunParameterCardinalityConstraint()
		 * @generated
		 */
		EClass MINIMUN_PARAMETER_CARDINALITY_CONSTRAINT = eINSTANCE.getMinimunParameterCardinalityConstraint();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINIMUN_PARAMETER_CARDINALITY_CONSTRAINT__VALUE = eINSTANCE.getMinimunParameterCardinalityConstraint_Value();

		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.MaximunParameterCardinalityConstraintImpl <em>Maximun Parameter Cardinality Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.MaximunParameterCardinalityConstraintImpl
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getMaximunParameterCardinalityConstraint()
		 * @generated
		 */
		EClass MAXIMUN_PARAMETER_CARDINALITY_CONSTRAINT = eINSTANCE.getMaximunParameterCardinalityConstraint();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAXIMUN_PARAMETER_CARDINALITY_CONSTRAINT__VALUE = eINSTANCE.getMaximunParameterCardinalityConstraint_Value();

		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterKind <em>Parameter Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterKind
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getParameterKind()
		 * @generated
		 */
		EEnum PARAMETER_KIND = eINSTANCE.getParameterKind();

		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterType <em>Parameter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterType
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getParameterType()
		 * @generated
		 */
		EEnum PARAMETER_TYPE = eINSTANCE.getParameterType();

		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetKind <em>Dataset Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetKind
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getDatasetKind()
		 * @generated
		 */
		EEnum DATASET_KIND = eINSTANCE.getDatasetKind();

		/**
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getList()
		 * @generated
		 */
		EDataType LIST = eINSTANCE.getList();

	}

} //AnalysisActivityDescriptionPackage
