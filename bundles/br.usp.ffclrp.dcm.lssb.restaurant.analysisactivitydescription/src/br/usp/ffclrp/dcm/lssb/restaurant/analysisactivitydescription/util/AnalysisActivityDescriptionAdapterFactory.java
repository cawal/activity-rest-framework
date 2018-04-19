/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.util;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage
 * @generated
 */
public class AnalysisActivityDescriptionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AnalysisActivityDescriptionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisActivityDescriptionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AnalysisActivityDescriptionPackage.eINSTANCE;
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
	protected AnalysisActivityDescriptionSwitch<Adapter> modelSwitch =
		new AnalysisActivityDescriptionSwitch<Adapter>() {
			@Override
			public Adapter caseAnalysisActivityDescription(AnalysisActivityDescription object) {
				return createAnalysisActivityDescriptionAdapter();
			}
			@Override
			public Adapter caseParameterDescription(ParameterDescription object) {
				return createParameterDescriptionAdapter();
			}
			@Override
			public Adapter caseDatasetDescription(DatasetDescription object) {
				return createDatasetDescriptionAdapter();
			}
			@Override
			public Adapter caseCommandLineEntryList(CommandLineEntryList object) {
				return createCommandLineEntryListAdapter();
			}
			@Override
			public Adapter caseLiteralCommandLineEntryList(LiteralCommandLineEntryList object) {
				return createLiteralCommandLineEntryListAdapter();
			}
			@Override
			public Adapter caseDatasetCommandLineEntryList(DatasetCommandLineEntryList object) {
				return createDatasetCommandLineEntryListAdapter();
			}
			@Override
			public Adapter caseParameterCommandLineEntryList(ParameterCommandLineEntryList object) {
				return createParameterCommandLineEntryListAdapter();
			}
			@Override
			public Adapter caseReadinessConstraint(ReadinessConstraint object) {
				return createReadinessConstraintAdapter();
			}
			@Override
			public Adapter caseDatasetConstraint(DatasetConstraint object) {
				return createDatasetConstraintAdapter();
			}
			@Override
			public Adapter caseMinimunDatasetCardinalityConstraint(MinimunDatasetCardinalityConstraint object) {
				return createMinimunDatasetCardinalityConstraintAdapter();
			}
			@Override
			public Adapter caseMaximunDatasetCardinalityConstraint(MaximunDatasetCardinalityConstraint object) {
				return createMaximunDatasetCardinalityConstraintAdapter();
			}
			@Override
			public Adapter caseParameterConstraint(ParameterConstraint object) {
				return createParameterConstraintAdapter();
			}
			@Override
			public Adapter caseMinimunParameterCardinalityConstraint(MinimunParameterCardinalityConstraint object) {
				return createMinimunParameterCardinalityConstraintAdapter();
			}
			@Override
			public Adapter caseMaximunParameterCardinalityConstraint(MaximunParameterCardinalityConstraint object) {
				return createMaximunParameterCardinalityConstraintAdapter();
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
	 * Creates a new adapter for an object of class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescription <em>Analysis Activity Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescription
	 * @generated
	 */
	public Adapter createAnalysisActivityDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription <em>Parameter Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription
	 * @generated
	 */
	public Adapter createParameterDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetDescription <em>Dataset Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetDescription
	 * @generated
	 */
	public Adapter createDatasetDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineEntryList <em>Command Line Entry List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineEntryList
	 * @generated
	 */
	public Adapter createCommandLineEntryListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.LiteralCommandLineEntryList <em>Literal Command Line Entry List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.LiteralCommandLineEntryList
	 * @generated
	 */
	public Adapter createLiteralCommandLineEntryListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetCommandLineEntryList <em>Dataset Command Line Entry List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetCommandLineEntryList
	 * @generated
	 */
	public Adapter createDatasetCommandLineEntryListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterCommandLineEntryList <em>Parameter Command Line Entry List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterCommandLineEntryList
	 * @generated
	 */
	public Adapter createParameterCommandLineEntryListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ReadinessConstraint <em>Readiness Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ReadinessConstraint
	 * @generated
	 */
	public Adapter createReadinessConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetConstraint <em>Dataset Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetConstraint
	 * @generated
	 */
	public Adapter createDatasetConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MinimunDatasetCardinalityConstraint <em>Minimun Dataset Cardinality Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MinimunDatasetCardinalityConstraint
	 * @generated
	 */
	public Adapter createMinimunDatasetCardinalityConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MaximunDatasetCardinalityConstraint <em>Maximun Dataset Cardinality Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MaximunDatasetCardinalityConstraint
	 * @generated
	 */
	public Adapter createMaximunDatasetCardinalityConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterConstraint <em>Parameter Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterConstraint
	 * @generated
	 */
	public Adapter createParameterConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MinimunParameterCardinalityConstraint <em>Minimun Parameter Cardinality Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MinimunParameterCardinalityConstraint
	 * @generated
	 */
	public Adapter createMinimunParameterCardinalityConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MaximunParameterCardinalityConstraint <em>Maximun Parameter Cardinality Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MaximunParameterCardinalityConstraint
	 * @generated
	 */
	public Adapter createMaximunParameterCardinalityConstraintAdapter() {
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

} //AnalysisActivityDescriptionAdapterFactory
