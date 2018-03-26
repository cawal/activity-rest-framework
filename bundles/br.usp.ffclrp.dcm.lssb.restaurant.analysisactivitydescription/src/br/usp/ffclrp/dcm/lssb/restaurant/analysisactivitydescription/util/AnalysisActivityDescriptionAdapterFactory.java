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
			public Adapter caseParameterProperties(ParameterProperties object) {
				return createParameterPropertiesAdapter();
			}
			@Override
			public Adapter caseDatasetProperties(DatasetProperties object) {
				return createDatasetPropertiesAdapter();
			}
			@Override
			public Adapter caseCommandLineEntries(CommandLineEntries object) {
				return createCommandLineEntriesAdapter();
			}
			@Override
			public Adapter caseLiteralCommandLineEntries(LiteralCommandLineEntries object) {
				return createLiteralCommandLineEntriesAdapter();
			}
			@Override
			public Adapter caseDatasetCommandLineEntries(DatasetCommandLineEntries object) {
				return createDatasetCommandLineEntriesAdapter();
			}
			@Override
			public Adapter caseParameterCommandLineEntries(ParameterCommandLineEntries object) {
				return createParameterCommandLineEntriesAdapter();
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
	 * Creates a new adapter for an object of class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterProperties <em>Parameter Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterProperties
	 * @generated
	 */
	public Adapter createParameterPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetProperties <em>Dataset Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetProperties
	 * @generated
	 */
	public Adapter createDatasetPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineEntries <em>Command Line Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineEntries
	 * @generated
	 */
	public Adapter createCommandLineEntriesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.LiteralCommandLineEntries <em>Literal Command Line Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.LiteralCommandLineEntries
	 * @generated
	 */
	public Adapter createLiteralCommandLineEntriesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetCommandLineEntries <em>Dataset Command Line Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetCommandLineEntries
	 * @generated
	 */
	public Adapter createDatasetCommandLineEntriesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterCommandLineEntries <em>Parameter Command Line Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterCommandLineEntries
	 * @generated
	 */
	public Adapter createParameterCommandLineEntriesAdapter() {
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
