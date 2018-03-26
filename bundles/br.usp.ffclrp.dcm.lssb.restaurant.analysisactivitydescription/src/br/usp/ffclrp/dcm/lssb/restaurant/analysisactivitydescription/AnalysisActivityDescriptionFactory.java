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
	 * Returns a new object of class '<em>Analysis Activity Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analysis Activity Description</em>'.
	 * @generated
	 */
	AnalysisActivityDescription createAnalysisActivityDescription();

	/**
	 * Returns a new object of class '<em>Parameter Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Properties</em>'.
	 * @generated
	 */
	ParameterProperties createParameterProperties();

	/**
	 * Returns a new object of class '<em>Dataset Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dataset Properties</em>'.
	 * @generated
	 */
	DatasetProperties createDatasetProperties();

	/**
	 * Returns a new object of class '<em>Literal Command Line Entries</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Command Line Entries</em>'.
	 * @generated
	 */
	LiteralCommandLineEntries createLiteralCommandLineEntries();

	/**
	 * Returns a new object of class '<em>Dataset Command Line Entries</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dataset Command Line Entries</em>'.
	 * @generated
	 */
	DatasetCommandLineEntries createDatasetCommandLineEntries();

	/**
	 * Returns a new object of class '<em>Parameter Command Line Entries</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Command Line Entries</em>'.
	 * @generated
	 */
	ParameterCommandLineEntries createParameterCommandLineEntries();

	/**
	 * Returns a new object of class '<em>Minimun Dataset Cardinality Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Minimun Dataset Cardinality Constraint</em>'.
	 * @generated
	 */
	MinimunDatasetCardinalityConstraint createMinimunDatasetCardinalityConstraint();

	/**
	 * Returns a new object of class '<em>Maximun Dataset Cardinality Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Maximun Dataset Cardinality Constraint</em>'.
	 * @generated
	 */
	MaximunDatasetCardinalityConstraint createMaximunDatasetCardinalityConstraint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AnalysisActivityDescriptionPackage getAnalysisActivityDescriptionPackage();

} //AnalysisActivityDescriptionFactory
