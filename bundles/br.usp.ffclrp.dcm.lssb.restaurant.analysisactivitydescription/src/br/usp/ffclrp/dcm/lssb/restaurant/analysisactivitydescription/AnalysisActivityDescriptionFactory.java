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
	 * Returns a new object of class '<em>Parameter Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Description</em>'.
	 * @generated
	 */
	ParameterDescription createParameterDescription();

	/**
	 * Returns a new object of class '<em>Dataset Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dataset Description</em>'.
	 * @generated
	 */
	DatasetDescription createDatasetDescription();

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
	 * Returns a new object of class '<em>Minimun Parameter Cardinality Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Minimun Parameter Cardinality Constraint</em>'.
	 * @generated
	 */
	MinimunParameterCardinalityConstraint createMinimunParameterCardinalityConstraint();

	/**
	 * Returns a new object of class '<em>Maximun Parameter Cardinality Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Maximun Parameter Cardinality Constraint</em>'.
	 * @generated
	 */
	MaximunParameterCardinalityConstraint createMaximunParameterCardinalityConstraint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AnalysisActivityDescriptionPackage getAnalysisActivityDescriptionPackage();

} //AnalysisActivityDescriptionFactory
