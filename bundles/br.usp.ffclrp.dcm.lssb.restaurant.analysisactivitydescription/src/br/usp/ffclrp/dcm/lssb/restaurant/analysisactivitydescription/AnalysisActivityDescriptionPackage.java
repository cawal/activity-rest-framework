/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ParameterPropertiesImpl <em>Parameter Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ParameterPropertiesImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getParameterProperties()
	 * @generated
	 */
	int PARAMETER_PROPERTIES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_PROPERTIES__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parameter Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_PROPERTIES__PARAMETER_KIND = 1;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_PROPERTIES__PARAMETER_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_PROPERTIES__DEFAULT_VALUE = 3;

	/**
	 * The number of structural features of the '<em>Parameter Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_PROPERTIES_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Parameter Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.DatasetPropertiesImpl <em>Dataset Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.DatasetPropertiesImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getDatasetProperties()
	 * @generated
	 */
	int DATASET_PROPERTIES = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_PROPERTIES__NAME = 0;

	/**
	 * The feature id for the '<em><b>Mimetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_PROPERTIES__MIMETYPE = 1;

	/**
	 * The feature id for the '<em><b>Dataset Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_PROPERTIES__DATASET_KIND = 2;

	/**
	 * The number of structural features of the '<em>Dataset Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_PROPERTIES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Dataset Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.CommandLineEntriesImpl <em>Command Line Entries</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.CommandLineEntriesImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getCommandLineEntries()
	 * @generated
	 */
	int COMMAND_LINE_ENTRIES = 3;

	/**
	 * The feature id for the '<em><b>Manipulators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE_ENTRIES__MANIPULATORS = 0;

	/**
	 * The number of structural features of the '<em>Command Line Entries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE_ENTRIES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Command Line Entries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE_ENTRIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.LiteralCommandLineEntriesImpl <em>Literal Command Line Entries</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.LiteralCommandLineEntriesImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getLiteralCommandLineEntries()
	 * @generated
	 */
	int LITERAL_COMMAND_LINE_ENTRIES = 4;

	/**
	 * The feature id for the '<em><b>Manipulators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_COMMAND_LINE_ENTRIES__MANIPULATORS = COMMAND_LINE_ENTRIES__MANIPULATORS;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_COMMAND_LINE_ENTRIES__LITERALS = COMMAND_LINE_ENTRIES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Command Line Entries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_COMMAND_LINE_ENTRIES_FEATURE_COUNT = COMMAND_LINE_ENTRIES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal Command Line Entries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_COMMAND_LINE_ENTRIES_OPERATION_COUNT = COMMAND_LINE_ENTRIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.DatasetCommandLineEntriesImpl <em>Dataset Command Line Entries</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.DatasetCommandLineEntriesImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getDatasetCommandLineEntries()
	 * @generated
	 */
	int DATASET_COMMAND_LINE_ENTRIES = 5;

	/**
	 * The feature id for the '<em><b>Manipulators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_COMMAND_LINE_ENTRIES__MANIPULATORS = COMMAND_LINE_ENTRIES__MANIPULATORS;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_COMMAND_LINE_ENTRIES__DATASET = COMMAND_LINE_ENTRIES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dataset Command Line Entries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_COMMAND_LINE_ENTRIES_FEATURE_COUNT = COMMAND_LINE_ENTRIES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dataset Command Line Entries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_COMMAND_LINE_ENTRIES_OPERATION_COUNT = COMMAND_LINE_ENTRIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ParameterCommandLineEntriesImpl <em>Parameter Command Line Entries</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ParameterCommandLineEntriesImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getParameterCommandLineEntries()
	 * @generated
	 */
	int PARAMETER_COMMAND_LINE_ENTRIES = 6;

	/**
	 * The feature id for the '<em><b>Manipulators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_COMMAND_LINE_ENTRIES__MANIPULATORS = COMMAND_LINE_ENTRIES__MANIPULATORS;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_COMMAND_LINE_ENTRIES__PARAMETER = COMMAND_LINE_ENTRIES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Command Line Entries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_COMMAND_LINE_ENTRIES_FEATURE_COUNT = COMMAND_LINE_ENTRIES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Command Line Entries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_COMMAND_LINE_ENTRIES_OPERATION_COUNT = COMMAND_LINE_ENTRIES_OPERATION_COUNT + 0;

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
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterKinds <em>Parameter Kinds</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterKinds
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getParameterKinds()
	 * @generated
	 */
	int PARAMETER_KINDS = 12;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterType <em>Parameter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterType
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 13;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetKinds <em>Dataset Kinds</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetKinds
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getDatasetKinds()
	 * @generated
	 */
	int DATASET_KINDS = 14;


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
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterProperties <em>Parameter Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Properties</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterProperties
	 * @generated
	 */
	EClass getParameterProperties();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterProperties#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterProperties#getName()
	 * @see #getParameterProperties()
	 * @generated
	 */
	EAttribute getParameterProperties_Name();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterProperties#getParameterKind <em>Parameter Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Kind</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterProperties#getParameterKind()
	 * @see #getParameterProperties()
	 * @generated
	 */
	EAttribute getParameterProperties_ParameterKind();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterProperties#getParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Type</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterProperties#getParameterType()
	 * @see #getParameterProperties()
	 * @generated
	 */
	EAttribute getParameterProperties_ParameterType();

	/**
	 * Returns the meta object for the attribute list '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterProperties#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Default Value</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterProperties#getDefaultValue()
	 * @see #getParameterProperties()
	 * @generated
	 */
	EAttribute getParameterProperties_DefaultValue();

	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetProperties <em>Dataset Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataset Properties</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetProperties
	 * @generated
	 */
	EClass getDatasetProperties();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetProperties#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetProperties#getName()
	 * @see #getDatasetProperties()
	 * @generated
	 */
	EAttribute getDatasetProperties_Name();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetProperties#getMimetype <em>Mimetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mimetype</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetProperties#getMimetype()
	 * @see #getDatasetProperties()
	 * @generated
	 */
	EAttribute getDatasetProperties_Mimetype();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetProperties#getDatasetKind <em>Dataset Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dataset Kind</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetProperties#getDatasetKind()
	 * @see #getDatasetProperties()
	 * @generated
	 */
	EAttribute getDatasetProperties_DatasetKind();

	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineEntries <em>Command Line Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Line Entries</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineEntries
	 * @generated
	 */
	EClass getCommandLineEntries();

	/**
	 * Returns the meta object for the containment reference list '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineEntries#getManipulators <em>Manipulators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Manipulators</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineEntries#getManipulators()
	 * @see #getCommandLineEntries()
	 * @generated
	 */
	EReference getCommandLineEntries_Manipulators();

	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.LiteralCommandLineEntries <em>Literal Command Line Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Command Line Entries</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.LiteralCommandLineEntries
	 * @generated
	 */
	EClass getLiteralCommandLineEntries();

	/**
	 * Returns the meta object for the attribute list '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.LiteralCommandLineEntries#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Literals</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.LiteralCommandLineEntries#getLiterals()
	 * @see #getLiteralCommandLineEntries()
	 * @generated
	 */
	EAttribute getLiteralCommandLineEntries_Literals();

	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetCommandLineEntries <em>Dataset Command Line Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataset Command Line Entries</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetCommandLineEntries
	 * @generated
	 */
	EClass getDatasetCommandLineEntries();

	/**
	 * Returns the meta object for the reference '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetCommandLineEntries#getDataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dataset</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetCommandLineEntries#getDataset()
	 * @see #getDatasetCommandLineEntries()
	 * @generated
	 */
	EReference getDatasetCommandLineEntries_Dataset();

	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterCommandLineEntries <em>Parameter Command Line Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Command Line Entries</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterCommandLineEntries
	 * @generated
	 */
	EClass getParameterCommandLineEntries();

	/**
	 * Returns the meta object for the reference '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterCommandLineEntries#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterCommandLineEntries#getParameter()
	 * @see #getParameterCommandLineEntries()
	 * @generated
	 */
	EReference getParameterCommandLineEntries_Parameter();

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
	 * Returns the meta object for enum '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterKinds <em>Parameter Kinds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Kinds</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterKinds
	 * @generated
	 */
	EEnum getParameterKinds();

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
	 * Returns the meta object for enum '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetKinds <em>Dataset Kinds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dataset Kinds</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetKinds
	 * @generated
	 */
	EEnum getDatasetKinds();

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
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ParameterPropertiesImpl <em>Parameter Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ParameterPropertiesImpl
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getParameterProperties()
		 * @generated
		 */
		EClass PARAMETER_PROPERTIES = eINSTANCE.getParameterProperties();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_PROPERTIES__NAME = eINSTANCE.getParameterProperties_Name();

		/**
		 * The meta object literal for the '<em><b>Parameter Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_PROPERTIES__PARAMETER_KIND = eINSTANCE.getParameterProperties_ParameterKind();

		/**
		 * The meta object literal for the '<em><b>Parameter Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_PROPERTIES__PARAMETER_TYPE = eINSTANCE.getParameterProperties_ParameterType();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_PROPERTIES__DEFAULT_VALUE = eINSTANCE.getParameterProperties_DefaultValue();

		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.DatasetPropertiesImpl <em>Dataset Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.DatasetPropertiesImpl
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getDatasetProperties()
		 * @generated
		 */
		EClass DATASET_PROPERTIES = eINSTANCE.getDatasetProperties();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET_PROPERTIES__NAME = eINSTANCE.getDatasetProperties_Name();

		/**
		 * The meta object literal for the '<em><b>Mimetype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET_PROPERTIES__MIMETYPE = eINSTANCE.getDatasetProperties_Mimetype();

		/**
		 * The meta object literal for the '<em><b>Dataset Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET_PROPERTIES__DATASET_KIND = eINSTANCE.getDatasetProperties_DatasetKind();

		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.CommandLineEntriesImpl <em>Command Line Entries</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.CommandLineEntriesImpl
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getCommandLineEntries()
		 * @generated
		 */
		EClass COMMAND_LINE_ENTRIES = eINSTANCE.getCommandLineEntries();

		/**
		 * The meta object literal for the '<em><b>Manipulators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_LINE_ENTRIES__MANIPULATORS = eINSTANCE.getCommandLineEntries_Manipulators();

		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.LiteralCommandLineEntriesImpl <em>Literal Command Line Entries</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.LiteralCommandLineEntriesImpl
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getLiteralCommandLineEntries()
		 * @generated
		 */
		EClass LITERAL_COMMAND_LINE_ENTRIES = eINSTANCE.getLiteralCommandLineEntries();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_COMMAND_LINE_ENTRIES__LITERALS = eINSTANCE.getLiteralCommandLineEntries_Literals();

		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.DatasetCommandLineEntriesImpl <em>Dataset Command Line Entries</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.DatasetCommandLineEntriesImpl
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getDatasetCommandLineEntries()
		 * @generated
		 */
		EClass DATASET_COMMAND_LINE_ENTRIES = eINSTANCE.getDatasetCommandLineEntries();

		/**
		 * The meta object literal for the '<em><b>Dataset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATASET_COMMAND_LINE_ENTRIES__DATASET = eINSTANCE.getDatasetCommandLineEntries_Dataset();

		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ParameterCommandLineEntriesImpl <em>Parameter Command Line Entries</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ParameterCommandLineEntriesImpl
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getParameterCommandLineEntries()
		 * @generated
		 */
		EClass PARAMETER_COMMAND_LINE_ENTRIES = eINSTANCE.getParameterCommandLineEntries();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_COMMAND_LINE_ENTRIES__PARAMETER = eINSTANCE.getParameterCommandLineEntries_Parameter();

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
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterKinds <em>Parameter Kinds</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterKinds
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getParameterKinds()
		 * @generated
		 */
		EEnum PARAMETER_KINDS = eINSTANCE.getParameterKinds();

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
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetKinds <em>Dataset Kinds</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetKinds
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getDatasetKinds()
		 * @generated
		 */
		EEnum DATASET_KINDS = eINSTANCE.getDatasetKinds();

	}

} //AnalysisActivityDescriptionPackage
