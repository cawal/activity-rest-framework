/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.impl;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.*;

import java.io.File;
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
public class AnalysisActivityModelFactoryImpl extends EFactoryImpl implements AnalysisActivityModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AnalysisActivityModelFactory init() {
		try {
			AnalysisActivityModelFactory theAnalysisActivityModelFactory = (AnalysisActivityModelFactory)EPackage.Registry.INSTANCE.getEFactory(AnalysisActivityModelPackage.eNS_URI);
			if (theAnalysisActivityModelFactory != null) {
				return theAnalysisActivityModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AnalysisActivityModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisActivityModelFactoryImpl() {
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
			case AnalysisActivityModelPackage.FILE_ADAPTER: return createFileAdapter();
			case AnalysisActivityModelPackage.ANALYSIS_ACTIVITY: return createAnalysisActivity();
			case AnalysisActivityModelPackage.DATASET: return createDataset();
			case AnalysisActivityModelPackage.PARAMETER_MAP: return createParameterMap();
			case AnalysisActivityModelPackage.VALIDATION_RESULT: return createValidationResult();
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
			case AnalysisActivityModelPackage.FILE:
				return createFileFromString(eDataType, initialValue);
			case AnalysisActivityModelPackage.OBJECT:
				return createObjectFromString(eDataType, initialValue);
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
			case AnalysisActivityModelPackage.FILE:
				return convertFileToString(eDataType, instanceValue);
			case AnalysisActivityModelPackage.OBJECT:
				return convertObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileAdapter createFileAdapter() {
		FileAdapterImpl fileAdapter = new FileAdapterImpl();
		return fileAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisActivity createAnalysisActivity() {
		AnalysisActivityImpl analysisActivity = new AnalysisActivityImpl();
		return analysisActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dataset createDataset() {
		DatasetImpl dataset = new DatasetImpl();
		return dataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterMap createParameterMap() {
		ParameterMapImpl parameterMap = new ParameterMapImpl();
		return parameterMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidationResult createValidationResult() {
		ValidationResultImpl validationResult = new ValidationResultImpl();
		return validationResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createFileFromString(EDataType eDataType, String initialValue) {
		return (File)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFileToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createObjectFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisActivityModelPackage getAnalysisActivityModelPackage() {
		return (AnalysisActivityModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AnalysisActivityModelPackage getPackage() {
		return AnalysisActivityModelPackage.eINSTANCE;
	}

} //AnalysisActivityModelFactoryImpl
