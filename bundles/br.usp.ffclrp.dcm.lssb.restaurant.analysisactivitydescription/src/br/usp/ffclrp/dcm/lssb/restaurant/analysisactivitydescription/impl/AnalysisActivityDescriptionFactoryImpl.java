/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnalysisActivityDescriptionFactoryImpl extends EFactoryImpl implements AnalysisActivityDescriptionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AnalysisActivityDescriptionFactory init() {
		try {
			AnalysisActivityDescriptionFactory theAnalysisActivityDescriptionFactory = (AnalysisActivityDescriptionFactory)EPackage.Registry.INSTANCE.getEFactory(AnalysisActivityDescriptionPackage.eNS_URI);
			if (theAnalysisActivityDescriptionFactory != null) {
				return theAnalysisActivityDescriptionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AnalysisActivityDescriptionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisActivityDescriptionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AnalysisActivityDescriptionPackage.ANALYSIS_ACTIVITY_DESCRIPTION: return createAnalysisActivityDescription();
			case AnalysisActivityDescriptionPackage.PARAMETER_DESCRIPTION: return createParameterDescription();
			case AnalysisActivityDescriptionPackage.DATASET_DESCRIPTION: return createDatasetDescription();
			case AnalysisActivityDescriptionPackage.LITERAL_COMMAND_LINE_ENTRY_LIST: return createLiteralCommandLineEntryList();
			case AnalysisActivityDescriptionPackage.DATASET_COMMAND_LINE_ENTRY_LIST: return createDatasetCommandLineEntryList();
			case AnalysisActivityDescriptionPackage.PARAMETER_COMMAND_LINE_ENTRY_LIST: return createParameterCommandLineEntryList();
			case AnalysisActivityDescriptionPackage.MINIMUN_DATASET_CARDINALITY_CONSTRAINT: return createMinimunDatasetCardinalityConstraint();
			case AnalysisActivityDescriptionPackage.MAXIMUN_DATASET_CARDINALITY_CONSTRAINT: return createMaximunDatasetCardinalityConstraint();
			case AnalysisActivityDescriptionPackage.MINIMUN_PARAMETER_CARDINALITY_CONSTRAINT: return createMinimunParameterCardinalityConstraint();
			case AnalysisActivityDescriptionPackage.MAXIMUN_PARAMETER_CARDINALITY_CONSTRAINT: return createMaximunParameterCardinalityConstraint();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AnalysisActivityDescriptionPackage.PARAMETER_KIND:
				return createParameterKindFromString(eDataType, initialValue);
			case AnalysisActivityDescriptionPackage.PARAMETER_TYPE:
				return createParameterTypeFromString(eDataType, initialValue);
			case AnalysisActivityDescriptionPackage.DATASET_KIND:
				return createDatasetKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AnalysisActivityDescriptionPackage.PARAMETER_KIND:
				return convertParameterKindToString(eDataType, instanceValue);
			case AnalysisActivityDescriptionPackage.PARAMETER_TYPE:
				return convertParameterTypeToString(eDataType, instanceValue);
			case AnalysisActivityDescriptionPackage.DATASET_KIND:
				return convertDatasetKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisActivityDescription createAnalysisActivityDescription() {
		AnalysisActivityDescriptionImpl analysisActivityDescription = new AnalysisActivityDescriptionImpl();
		return analysisActivityDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDescription createParameterDescription() {
		ParameterDescriptionImpl parameterDescription = new ParameterDescriptionImpl();
		return parameterDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetDescription createDatasetDescription() {
		DatasetDescriptionImpl datasetDescription = new DatasetDescriptionImpl();
		return datasetDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralCommandLineEntryList createLiteralCommandLineEntryList() {
		LiteralCommandLineEntryListImpl literalCommandLineEntryList = new LiteralCommandLineEntryListImpl();
		return literalCommandLineEntryList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetCommandLineEntryList createDatasetCommandLineEntryList() {
		DatasetCommandLineEntryListImpl datasetCommandLineEntryList = new DatasetCommandLineEntryListImpl();
		return datasetCommandLineEntryList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterCommandLineEntryList createParameterCommandLineEntryList() {
		ParameterCommandLineEntryListImpl parameterCommandLineEntryList = new ParameterCommandLineEntryListImpl();
		return parameterCommandLineEntryList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinimunDatasetCardinalityConstraint createMinimunDatasetCardinalityConstraint() {
		MinimunDatasetCardinalityConstraintImpl minimunDatasetCardinalityConstraint = new MinimunDatasetCardinalityConstraintImpl();
		return minimunDatasetCardinalityConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaximunDatasetCardinalityConstraint createMaximunDatasetCardinalityConstraint() {
		MaximunDatasetCardinalityConstraintImpl maximunDatasetCardinalityConstraint = new MaximunDatasetCardinalityConstraintImpl();
		return maximunDatasetCardinalityConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinimunParameterCardinalityConstraint createMinimunParameterCardinalityConstraint() {
		MinimunParameterCardinalityConstraintImpl minimunParameterCardinalityConstraint = new MinimunParameterCardinalityConstraintImpl();
		return minimunParameterCardinalityConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaximunParameterCardinalityConstraint createMaximunParameterCardinalityConstraint() {
		MaximunParameterCardinalityConstraintImpl maximunParameterCardinalityConstraint = new MaximunParameterCardinalityConstraintImpl();
		return maximunParameterCardinalityConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterKind createParameterKindFromString(EDataType eDataType, String initialValue) {
		ParameterKind result = ParameterKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType createParameterTypeFromString(EDataType eDataType, String initialValue) {
		ParameterType result = ParameterType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetKind createDatasetKindFromString(EDataType eDataType, String initialValue) {
		DatasetKind result = DatasetKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatasetKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisActivityDescriptionPackage getAnalysisActivityDescriptionPackage() {
		return (AnalysisActivityDescriptionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AnalysisActivityDescriptionPackage getPackage() {
		return AnalysisActivityDescriptionPackage.eINSTANCE;
	}

} //AnalysisActivityDescriptionFactoryImpl
