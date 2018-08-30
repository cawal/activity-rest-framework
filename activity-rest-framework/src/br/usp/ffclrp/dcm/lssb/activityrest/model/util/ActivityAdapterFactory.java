/**
 */
package br.usp.ffclrp.dcm.lssb.activityrest.model.util;

import br.usp.ffclrp.dcm.lssb.activityrest.model.*;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see br.usp.ffclrp.dcm.lssb.activityrest.model.ActivityPackage
 * @generated
 */
public class ActivityAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ActivityPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ActivityPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivitySwitch<Adapter> modelSwitch =
		new ActivitySwitch<Adapter>() {
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseDataset(Dataset object) {
				return createDatasetAdapter();
			}
			@Override
			public Adapter caseFileAdapter(FileAdapter object) {
				return createFileAdapterAdapter();
			}
			@Override
			public Adapter caseInputDataset(InputDataset object) {
				return createInputDatasetAdapter();
			}
			@Override
			public Adapter caseOutputDataset(OutputDataset object) {
				return createOutputDatasetAdapter();
			}
			@Override
			public <k, v> Adapter caseJavaMap(Map<k, v> object) {
				return createJavaMapAdapter();
			}
			@Override
			public Adapter caseParameterMap(ParameterMap object) {
				return createParameterMapAdapter();
			}
			@Override
			public Adapter caseValidationResult(ValidationResult object) {
				return createValidationResultAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link br.usp.ffclrp.dcm.lssb.activityrest.model.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.model.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.usp.ffclrp.dcm.lssb.activityrest.model.Dataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.model.Dataset
	 * @generated
	 */
	public Adapter createDatasetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.usp.ffclrp.dcm.lssb.activityrest.model.FileAdapter <em>File Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.model.FileAdapter
	 * @generated
	 */
	public Adapter createFileAdapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.usp.ffclrp.dcm.lssb.activityrest.model.InputDataset <em>Input Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.model.InputDataset
	 * @generated
	 */
	public Adapter createInputDatasetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.usp.ffclrp.dcm.lssb.activityrest.model.OutputDataset <em>Output Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.model.OutputDataset
	 * @generated
	 */
	public Adapter createOutputDatasetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map <em>Java Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map
	 * @generated
	 */
	public Adapter createJavaMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.usp.ffclrp.dcm.lssb.activityrest.model.ParameterMap <em>Parameter Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.model.ParameterMap
	 * @generated
	 */
	public Adapter createParameterMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.usp.ffclrp.dcm.lssb.activityrest.model.ValidationResult <em>Validation Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.model.ValidationResult
	 * @generated
	 */
	public Adapter createValidationResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ActivityAdapterFactory
