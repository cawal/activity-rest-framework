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
			public Adapter caseIdentifiableElement(IdentifiableElement object) {
				return createIdentifiableElementAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseMultiplicityElement(MultiplicityElement object) {
				return createMultiplicityElementAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseDataset(Dataset object) {
				return createDatasetAdapter();
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
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			@Override
			public Adapter caseFunctionalEntity(FunctionalEntity object) {
				return createFunctionalEntityAdapter();
			}
			@Override
			public Adapter caseCommandLineTool(CommandLineTool object) {
				return createCommandLineToolAdapter();
			}
			@Override
			public Adapter caseExitCode(ExitCode object) {
				return createExitCodeAdapter();
			}
			@Override
			public Adapter caseCommandLineEntryList(CommandLineEntryList object) {
				return createCommandLineEntryListAdapter();
			}
			@Override
			public Adapter caseToolNameCommandLineEntry(ToolNameCommandLineEntry object) {
				return createToolNameCommandLineEntryAdapter();
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
	 * Creates a new adapter for an object of class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.IdentifiableElement <em>Identifiable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.IdentifiableElement
	 * @generated
	 */
	public Adapter createIdentifiableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MultiplicityElement <em>Multiplicity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MultiplicityElement
	 * @generated
	 */
	public Adapter createMultiplicityElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Dataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Dataset
	 * @generated
	 */
	public Adapter createDatasetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.InputDataset <em>Input Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.InputDataset
	 * @generated
	 */
	public Adapter createInputDatasetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.OutputDataset <em>Output Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.OutputDataset
	 * @generated
	 */
	public Adapter createOutputDatasetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
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
	 * Creates a new adapter for an object of class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ToolNameCommandLineEntry <em>Tool Name Command Line Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ToolNameCommandLineEntry
	 * @generated
	 */
	public Adapter createToolNameCommandLineEntryAdapter() {
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
	 * Creates a new adapter for an object of class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.FunctionalEntity <em>Functional Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.FunctionalEntity
	 * @generated
	 */
	public Adapter createFunctionalEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineTool <em>Command Line Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineTool
	 * @generated
	 */
	public Adapter createCommandLineToolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ExitCode <em>Exit Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ExitCode
	 * @generated
	 */
	public Adapter createExitCodeAdapter() {
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
