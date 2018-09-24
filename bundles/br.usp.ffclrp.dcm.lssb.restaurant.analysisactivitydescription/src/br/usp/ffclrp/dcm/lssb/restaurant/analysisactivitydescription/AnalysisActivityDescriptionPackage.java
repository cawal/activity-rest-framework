/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
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
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.IdentifiableElementImpl <em>Identifiable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.IdentifiableElementImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getIdentifiableElement()
	 * @generated
	 */
	int IDENTIFIABLE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT__REMARK = 1;

	/**
	 * The number of structural features of the '<em>Identifiable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Identifiable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ActivityImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = IDENTIFIABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__REMARK = IDENTIFIABLE_ELEMENT__REMARK;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PARAMETERS = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Datasets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INPUT_DATASETS = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Datasets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OUTPUT_DATASETS = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Functional Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__FUNCTIONAL_ENTITY = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = IDENTIFIABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.MultiplicityElementImpl <em>Multiplicity Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.MultiplicityElementImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getMultiplicityElement()
	 * @generated
	 */
	int MULTIPLICITY_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Minimum Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__MINIMUM_CARDINALITY = 0;

	/**
	 * The feature id for the '<em><b>Maximum Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__MAXIMUM_CARDINALITY = 1;

	/**
	 * The number of structural features of the '<em>Multiplicity Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Multiplicity Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ParameterImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Minimum Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MINIMUM_CARDINALITY = MULTIPLICITY_ELEMENT__MINIMUM_CARDINALITY;

	/**
	 * The feature id for the '<em><b>Maximum Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MAXIMUM_CARDINALITY = MULTIPLICITY_ELEMENT__MAXIMUM_CARDINALITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__REMARK = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PARAMETER_TYPE = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DEFAULT_VALUE = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CONSTRAINTS = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = MULTIPLICITY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.DatasetImpl <em>Dataset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.DatasetImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getDataset()
	 * @generated
	 */
	int DATASET = 4;

	/**
	 * The feature id for the '<em><b>Minimum Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__MINIMUM_CARDINALITY = MULTIPLICITY_ELEMENT__MINIMUM_CARDINALITY;

	/**
	 * The feature id for the '<em><b>Maximum Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__MAXIMUM_CARDINALITY = MULTIPLICITY_ELEMENT__MAXIMUM_CARDINALITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__NAME = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__REMARK = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mimetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__MIMETYPE = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__CONSTRAINTS = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_FEATURE_COUNT = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_OPERATION_COUNT = MULTIPLICITY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.InputDatasetImpl <em>Input Dataset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.InputDatasetImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getInputDataset()
	 * @generated
	 */
	int INPUT_DATASET = 5;

	/**
	 * The feature id for the '<em><b>Minimum Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATASET__MINIMUM_CARDINALITY = DATASET__MINIMUM_CARDINALITY;

	/**
	 * The feature id for the '<em><b>Maximum Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATASET__MAXIMUM_CARDINALITY = DATASET__MAXIMUM_CARDINALITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATASET__NAME = DATASET__NAME;

	/**
	 * The feature id for the '<em><b>Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATASET__REMARK = DATASET__REMARK;

	/**
	 * The feature id for the '<em><b>Mimetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATASET__MIMETYPE = DATASET__MIMETYPE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATASET__CONSTRAINTS = DATASET__CONSTRAINTS;

	/**
	 * The number of structural features of the '<em>Input Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATASET_FEATURE_COUNT = DATASET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATASET_OPERATION_COUNT = DATASET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.OutputDatasetImpl <em>Output Dataset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.OutputDatasetImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getOutputDataset()
	 * @generated
	 */
	int OUTPUT_DATASET = 6;

	/**
	 * The feature id for the '<em><b>Minimum Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DATASET__MINIMUM_CARDINALITY = DATASET__MINIMUM_CARDINALITY;

	/**
	 * The feature id for the '<em><b>Maximum Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DATASET__MAXIMUM_CARDINALITY = DATASET__MAXIMUM_CARDINALITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DATASET__NAME = DATASET__NAME;

	/**
	 * The feature id for the '<em><b>Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DATASET__REMARK = DATASET__REMARK;

	/**
	 * The feature id for the '<em><b>Mimetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DATASET__MIMETYPE = DATASET__MIMETYPE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DATASET__CONSTRAINTS = DATASET__CONSTRAINTS;

	/**
	 * The number of structural features of the '<em>Output Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DATASET_FEATURE_COUNT = DATASET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Output Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DATASET_OPERATION_COUNT = DATASET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ConstraintImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.CommandLineEntryListImpl <em>Command Line Entry List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.CommandLineEntryListImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getCommandLineEntryList()
	 * @generated
	 */
	int COMMAND_LINE_ENTRY_LIST = 11;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ToolNameCommandLineEntryImpl <em>Tool Name Command Line Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ToolNameCommandLineEntryImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getToolNameCommandLineEntry()
	 * @generated
	 */
	int TOOL_NAME_COMMAND_LINE_ENTRY = 12;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.LiteralCommandLineEntryListImpl <em>Literal Command Line Entry List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.LiteralCommandLineEntryListImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getLiteralCommandLineEntryList()
	 * @generated
	 */
	int LITERAL_COMMAND_LINE_ENTRY_LIST = 13;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.DatasetCommandLineEntryListImpl <em>Dataset Command Line Entry List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.DatasetCommandLineEntryListImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getDatasetCommandLineEntryList()
	 * @generated
	 */
	int DATASET_COMMAND_LINE_ENTRY_LIST = 14;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ParameterCommandLineEntryListImpl <em>Parameter Command Line Entry List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ParameterCommandLineEntryListImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getParameterCommandLineEntryList()
	 * @generated
	 */
	int PARAMETER_COMMAND_LINE_ENTRY_LIST = 15;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.FunctionalEntityImpl <em>Functional Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.FunctionalEntityImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getFunctionalEntity()
	 * @generated
	 */
	int FUNCTIONAL_ENTITY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_ENTITY__NAME = IDENTIFIABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_ENTITY__REMARK = IDENTIFIABLE_ELEMENT__REMARK;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_ENTITY__ACTIVITY = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Functional Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_ENTITY_FEATURE_COUNT = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Functional Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_ENTITY_OPERATION_COUNT = IDENTIFIABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.CommandLineToolImpl <em>Command Line Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.CommandLineToolImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getCommandLineTool()
	 * @generated
	 */
	int COMMAND_LINE_TOOL = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE_TOOL__NAME = FUNCTIONAL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE_TOOL__REMARK = FUNCTIONAL_ENTITY__REMARK;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE_TOOL__ACTIVITY = FUNCTIONAL_ENTITY__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Command Line Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE_TOOL__COMMAND_LINE_TEMPLATE = FUNCTIONAL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Standard Input Stream</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE_TOOL__STANDARD_INPUT_STREAM = FUNCTIONAL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Standard Output Stream</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE_TOOL__STANDARD_OUTPUT_STREAM = FUNCTIONAL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Standard Error Stream</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE_TOOL__STANDARD_ERROR_STREAM = FUNCTIONAL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Exit Codes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE_TOOL__EXIT_CODES = FUNCTIONAL_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Command Line Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE_TOOL_FEATURE_COUNT = FUNCTIONAL_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Command Line Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE_TOOL_OPERATION_COUNT = FUNCTIONAL_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ExitCodeImpl <em>Exit Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ExitCodeImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getExitCode()
	 * @generated
	 */
	int EXIT_CODE = 10;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_CODE__CODE = 0;

	/**
	 * The feature id for the '<em><b>Report Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_CODE__REPORT_MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_CODE__STATUS = 2;

	/**
	 * The number of structural features of the '<em>Exit Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_CODE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Exit Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_CODE_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Manipulators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_NAME_COMMAND_LINE_ENTRY__MANIPULATORS = COMMAND_LINE_ENTRY_LIST__MANIPULATORS;

	/**
	 * The number of structural features of the '<em>Tool Name Command Line Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_NAME_COMMAND_LINE_ENTRY_FEATURE_COUNT = COMMAND_LINE_ENTRY_LIST_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tool Name Command Line Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_NAME_COMMAND_LINE_ENTRY_OPERATION_COUNT = COMMAND_LINE_ENTRY_LIST_OPERATION_COUNT + 0;

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
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterType <em>Parameter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterType
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 16;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.TerminationStatus <em>Termination Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.TerminationStatus
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getTerminationStatus()
	 * @generated
	 */
	int TERMINATION_STATUS = 17;

	/**
	 * The meta object id for the '<em>File Path</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getFilePath()
	 * @generated
	 */
	int FILE_PATH = 18;

	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.IdentifiableElement <em>Identifiable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable Element</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.IdentifiableElement
	 * @generated
	 */
	EClass getIdentifiableElement();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.IdentifiableElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.IdentifiableElement#getName()
	 * @see #getIdentifiableElement()
	 * @generated
	 */
	EAttribute getIdentifiableElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.IdentifiableElement#getRemark <em>Remark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remark</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.IdentifiableElement#getRemark()
	 * @see #getIdentifiableElement()
	 * @generated
	 */
	EAttribute getIdentifiableElement_Remark();

	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity#getParameters()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity#getInputDatasets <em>Input Datasets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Datasets</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity#getInputDatasets()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_InputDatasets();

	/**
	 * Returns the meta object for the containment reference list '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity#getOutputDatasets <em>Output Datasets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Datasets</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity#getOutputDatasets()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_OutputDatasets();

	/**
	 * Returns the meta object for the containment reference '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity#getFunctionalEntity <em>Functional Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Functional Entity</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity#getFunctionalEntity()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_FunctionalEntity();

	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MultiplicityElement <em>Multiplicity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicity Element</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MultiplicityElement
	 * @generated
	 */
	EClass getMultiplicityElement();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MultiplicityElement#getMinimumCardinality <em>Minimum Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Cardinality</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MultiplicityElement#getMinimumCardinality()
	 * @see #getMultiplicityElement()
	 * @generated
	 */
	EAttribute getMultiplicityElement_MinimumCardinality();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MultiplicityElement#getMaximumCardinality <em>Maximum Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Cardinality</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MultiplicityElement#getMaximumCardinality()
	 * @see #getMultiplicityElement()
	 * @generated
	 */
	EAttribute getMultiplicityElement_MaximumCardinality();

	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Parameter#getParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Type</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Parameter#getParameterType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_ParameterType();

	/**
	 * Returns the meta object for the attribute list '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Parameter#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Default Value</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Parameter#getDefaultValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_DefaultValue();

	/**
	 * Returns the meta object for the containment reference list '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Parameter#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Parameter#getConstraints()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Constraints();

	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Dataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataset</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Dataset
	 * @generated
	 */
	EClass getDataset();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Dataset#getMimetype <em>Mimetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mimetype</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Dataset#getMimetype()
	 * @see #getDataset()
	 * @generated
	 */
	EAttribute getDataset_Mimetype();

	/**
	 * Returns the meta object for the containment reference list '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Dataset#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Dataset#getConstraints()
	 * @see #getDataset()
	 * @generated
	 */
	EReference getDataset_Constraints();

	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.InputDataset <em>Input Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Dataset</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.InputDataset
	 * @generated
	 */
	EClass getInputDataset();

	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.OutputDataset <em>Output Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Dataset</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.OutputDataset
	 * @generated
	 */
	EClass getOutputDataset();

	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Constraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Constraint#getName()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Name();

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
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ToolNameCommandLineEntry <em>Tool Name Command Line Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Name Command Line Entry</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ToolNameCommandLineEntry
	 * @generated
	 */
	EClass getToolNameCommandLineEntry();

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
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.FunctionalEntity <em>Functional Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Entity</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.FunctionalEntity
	 * @generated
	 */
	EClass getFunctionalEntity();

	/**
	 * Returns the meta object for the container reference '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.FunctionalEntity#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Activity</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.FunctionalEntity#getActivity()
	 * @see #getFunctionalEntity()
	 * @generated
	 */
	EReference getFunctionalEntity_Activity();

	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineTool <em>Command Line Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Line Tool</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineTool
	 * @generated
	 */
	EClass getCommandLineTool();

	/**
	 * Returns the meta object for the containment reference list '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineTool#getCommandLineTemplate <em>Command Line Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Command Line Template</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineTool#getCommandLineTemplate()
	 * @see #getCommandLineTool()
	 * @generated
	 */
	EReference getCommandLineTool_CommandLineTemplate();

	/**
	 * Returns the meta object for the reference '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineTool#getStandardInputStream <em>Standard Input Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Standard Input Stream</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineTool#getStandardInputStream()
	 * @see #getCommandLineTool()
	 * @generated
	 */
	EReference getCommandLineTool_StandardInputStream();

	/**
	 * Returns the meta object for the reference '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineTool#getStandardOutputStream <em>Standard Output Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Standard Output Stream</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineTool#getStandardOutputStream()
	 * @see #getCommandLineTool()
	 * @generated
	 */
	EReference getCommandLineTool_StandardOutputStream();

	/**
	 * Returns the meta object for the reference '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineTool#getStandardErrorStream <em>Standard Error Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Standard Error Stream</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineTool#getStandardErrorStream()
	 * @see #getCommandLineTool()
	 * @generated
	 */
	EReference getCommandLineTool_StandardErrorStream();

	/**
	 * Returns the meta object for the containment reference list '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineTool#getExitCodes <em>Exit Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exit Codes</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineTool#getExitCodes()
	 * @see #getCommandLineTool()
	 * @generated
	 */
	EReference getCommandLineTool_ExitCodes();

	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ExitCode <em>Exit Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exit Code</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ExitCode
	 * @generated
	 */
	EClass getExitCode();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ExitCode#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ExitCode#getCode()
	 * @see #getExitCode()
	 * @generated
	 */
	EAttribute getExitCode_Code();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ExitCode#getReportMessage <em>Report Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Report Message</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ExitCode#getReportMessage()
	 * @see #getExitCode()
	 * @generated
	 */
	EAttribute getExitCode_ReportMessage();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ExitCode#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ExitCode#getStatus()
	 * @see #getExitCode()
	 * @generated
	 */
	EAttribute getExitCode_Status();

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
	 * Returns the meta object for enum '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.TerminationStatus <em>Termination Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Termination Status</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.TerminationStatus
	 * @generated
	 */
	EEnum getTerminationStatus();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>File Path</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getFilePath();

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
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.IdentifiableElementImpl <em>Identifiable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.IdentifiableElementImpl
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getIdentifiableElement()
		 * @generated
		 */
		EClass IDENTIFIABLE_ELEMENT = eINSTANCE.getIdentifiableElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE_ELEMENT__NAME = eINSTANCE.getIdentifiableElement_Name();

		/**
		 * The meta object literal for the '<em><b>Remark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE_ELEMENT__REMARK = eINSTANCE.getIdentifiableElement_Remark();

		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ActivityImpl
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__PARAMETERS = eINSTANCE.getActivity_Parameters();

		/**
		 * The meta object literal for the '<em><b>Input Datasets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__INPUT_DATASETS = eINSTANCE.getActivity_InputDatasets();

		/**
		 * The meta object literal for the '<em><b>Output Datasets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__OUTPUT_DATASETS = eINSTANCE.getActivity_OutputDatasets();

		/**
		 * The meta object literal for the '<em><b>Functional Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__FUNCTIONAL_ENTITY = eINSTANCE.getActivity_FunctionalEntity();

		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.MultiplicityElementImpl <em>Multiplicity Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.MultiplicityElementImpl
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getMultiplicityElement()
		 * @generated
		 */
		EClass MULTIPLICITY_ELEMENT = eINSTANCE.getMultiplicityElement();

		/**
		 * The meta object literal for the '<em><b>Minimum Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_ELEMENT__MINIMUM_CARDINALITY = eINSTANCE.getMultiplicityElement_MinimumCardinality();

		/**
		 * The meta object literal for the '<em><b>Maximum Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_ELEMENT__MAXIMUM_CARDINALITY = eINSTANCE.getMultiplicityElement_MaximumCardinality();

		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ParameterImpl
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Parameter Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__PARAMETER_TYPE = eINSTANCE.getParameter_ParameterType();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DEFAULT_VALUE = eINSTANCE.getParameter_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__CONSTRAINTS = eINSTANCE.getParameter_Constraints();

		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.DatasetImpl <em>Dataset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.DatasetImpl
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getDataset()
		 * @generated
		 */
		EClass DATASET = eINSTANCE.getDataset();

		/**
		 * The meta object literal for the '<em><b>Mimetype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET__MIMETYPE = eINSTANCE.getDataset_Mimetype();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATASET__CONSTRAINTS = eINSTANCE.getDataset_Constraints();

		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.InputDatasetImpl <em>Input Dataset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.InputDatasetImpl
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getInputDataset()
		 * @generated
		 */
		EClass INPUT_DATASET = eINSTANCE.getInputDataset();

		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.OutputDatasetImpl <em>Output Dataset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.OutputDatasetImpl
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getOutputDataset()
		 * @generated
		 */
		EClass OUTPUT_DATASET = eINSTANCE.getOutputDataset();

		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ConstraintImpl
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__NAME = eINSTANCE.getConstraint_Name();

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
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ToolNameCommandLineEntryImpl <em>Tool Name Command Line Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ToolNameCommandLineEntryImpl
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getToolNameCommandLineEntry()
		 * @generated
		 */
		EClass TOOL_NAME_COMMAND_LINE_ENTRY = eINSTANCE.getToolNameCommandLineEntry();

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
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.FunctionalEntityImpl <em>Functional Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.FunctionalEntityImpl
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getFunctionalEntity()
		 * @generated
		 */
		EClass FUNCTIONAL_ENTITY = eINSTANCE.getFunctionalEntity();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_ENTITY__ACTIVITY = eINSTANCE.getFunctionalEntity_Activity();

		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.CommandLineToolImpl <em>Command Line Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.CommandLineToolImpl
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getCommandLineTool()
		 * @generated
		 */
		EClass COMMAND_LINE_TOOL = eINSTANCE.getCommandLineTool();

		/**
		 * The meta object literal for the '<em><b>Command Line Template</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_LINE_TOOL__COMMAND_LINE_TEMPLATE = eINSTANCE.getCommandLineTool_CommandLineTemplate();

		/**
		 * The meta object literal for the '<em><b>Standard Input Stream</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_LINE_TOOL__STANDARD_INPUT_STREAM = eINSTANCE.getCommandLineTool_StandardInputStream();

		/**
		 * The meta object literal for the '<em><b>Standard Output Stream</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_LINE_TOOL__STANDARD_OUTPUT_STREAM = eINSTANCE.getCommandLineTool_StandardOutputStream();

		/**
		 * The meta object literal for the '<em><b>Standard Error Stream</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_LINE_TOOL__STANDARD_ERROR_STREAM = eINSTANCE.getCommandLineTool_StandardErrorStream();

		/**
		 * The meta object literal for the '<em><b>Exit Codes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_LINE_TOOL__EXIT_CODES = eINSTANCE.getCommandLineTool_ExitCodes();

		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ExitCodeImpl <em>Exit Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.ExitCodeImpl
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getExitCode()
		 * @generated
		 */
		EClass EXIT_CODE = eINSTANCE.getExitCode();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXIT_CODE__CODE = eINSTANCE.getExitCode_Code();

		/**
		 * The meta object literal for the '<em><b>Report Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXIT_CODE__REPORT_MESSAGE = eINSTANCE.getExitCode_ReportMessage();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXIT_CODE__STATUS = eINSTANCE.getExitCode_Status();

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
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.TerminationStatus <em>Termination Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.TerminationStatus
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getTerminationStatus()
		 * @generated
		 */
		EEnum TERMINATION_STATUS = eINSTANCE.getTerminationStatus();

		/**
		 * The meta object literal for the '<em>File Path</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl#getFilePath()
		 * @generated
		 */
		EDataType FILE_PATH = eINSTANCE.getFilePath();

	}

} //AnalysisActivityDescriptionPackage
