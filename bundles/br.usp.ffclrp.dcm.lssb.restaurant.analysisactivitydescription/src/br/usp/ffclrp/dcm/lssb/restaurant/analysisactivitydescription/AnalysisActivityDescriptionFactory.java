/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage
 * @generated
 */
public interface AnalysisActivityDescriptionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnalysisActivityDescriptionFactory eINSTANCE = br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity</em>'.
	 * @generated
	 */
	Activity createActivity();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Input Dataset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Dataset</em>'.
	 * @generated
	 */
	InputDataset createInputDataset();

	/**
	 * Returns a new object of class '<em>Output Dataset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Dataset</em>'.
	 * @generated
	 */
	OutputDataset createOutputDataset();

	/**
	 * Returns a new object of class '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint</em>'.
	 * @generated
	 */
	Constraint createConstraint();

	/**
	 * Returns a new object of class '<em>Literal Command Line Entry List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Command Line Entry List</em>'.
	 * @generated
	 */
	LiteralCommandLineEntryList createLiteralCommandLineEntryList();

	/**
	 * Returns a new object of class '<em>Dataset Command Line Entry List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dataset Command Line Entry List</em>'.
	 * @generated
	 */
	DatasetCommandLineEntryList createDatasetCommandLineEntryList();

	/**
	 * Returns a new object of class '<em>Parameter Command Line Entry List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Command Line Entry List</em>'.
	 * @generated
	 */
	ParameterCommandLineEntryList createParameterCommandLineEntryList();

	/**
	 * Returns a new object of class '<em>Command Line Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command Line Tool</em>'.
	 * @generated
	 */
	CommandLineTool createCommandLineTool();

	/**
	 * Returns a new object of class '<em>Exit Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exit Code</em>'.
	 * @generated
	 */
	ExitCode createExitCode();

	/**
	 * Returns a new object of class '<em>Tool Name Command Line Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tool Name Command Line Entry</em>'.
	 * @generated
	 */
	ToolNameCommandLineEntry createToolNameCommandLineEntry();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AnalysisActivityDescriptionPackage getAnalysisActivityDescriptionPackage();

} //AnalysisActivityDescriptionFactory
