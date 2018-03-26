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
			case AnalysisActivityDescriptionPackage.PARAMETER_PROPERTIES: return createParameterProperties();
			case AnalysisActivityDescriptionPackage.DATASET_PROPERTIES: return createDatasetProperties();
			case AnalysisActivityDescriptionPackage.LITERAL_COMMAND_LINE_ENTRIES: return createLiteralCommandLineEntries();
			case AnalysisActivityDescriptionPackage.DATASET_COMMAND_LINE_ENTRIES: return createDatasetCommandLineEntries();
			case AnalysisActivityDescriptionPackage.PARAMETER_COMMAND_LINE_ENTRIES: return createParameterCommandLineEntries();
			case AnalysisActivityDescriptionPackage.MINIMUN_DATASET_CARDINALITY_CONSTRAINT: return createMinimunDatasetCardinalityConstraint();
			case AnalysisActivityDescriptionPackage.MAXIMUN_DATASET_CARDINALITY_CONSTRAINT: return createMaximunDatasetCardinalityConstraint();
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
			case AnalysisActivityDescriptionPackage.PARAMETER_KINDS:
				return createParameterKindsFromString(eDataType, initialValue);
			case AnalysisActivityDescriptionPackage.PARAMETER_TYPE:
				return createParameterTypeFromString(eDataType, initialValue);
			case AnalysisActivityDescriptionPackage.DATASET_KINDS:
				return createDatasetKindsFromString(eDataType, initialValue);
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
			case AnalysisActivityDescriptionPackage.PARAMETER_KINDS:
				return convertParameterKindsToString(eDataType, instanceValue);
			case AnalysisActivityDescriptionPackage.PARAMETER_TYPE:
				return convertParameterTypeToString(eDataType, instanceValue);
			case AnalysisActivityDescriptionPackage.DATASET_KINDS:
				return convertDatasetKindsToString(eDataType, instanceValue);
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
	public ParameterProperties createParameterProperties() {
		ParameterPropertiesImpl parameterProperties = new ParameterPropertiesImpl();
		return parameterProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetProperties createDatasetProperties() {
		DatasetPropertiesImpl datasetProperties = new DatasetPropertiesImpl();
		return datasetProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralCommandLineEntries createLiteralCommandLineEntries() {
		LiteralCommandLineEntriesImpl literalCommandLineEntries = new LiteralCommandLineEntriesImpl();
		return literalCommandLineEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetCommandLineEntries createDatasetCommandLineEntries() {
		DatasetCommandLineEntriesImpl datasetCommandLineEntries = new DatasetCommandLineEntriesImpl();
		return datasetCommandLineEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterCommandLineEntries createParameterCommandLineEntries() {
		ParameterCommandLineEntriesImpl parameterCommandLineEntries = new ParameterCommandLineEntriesImpl();
		return parameterCommandLineEntries;
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
	public ParameterKinds createParameterKindsFromString(EDataType eDataType, String initialValue) {
		ParameterKinds result = ParameterKinds.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterKindsToString(EDataType eDataType, Object instanceValue) {
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
	public DatasetKinds createDatasetKindsFromString(EDataType eDataType, String initialValue) {
		DatasetKinds result = DatasetKinds.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatasetKindsToString(EDataType eDataType, Object instanceValue) {
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
