/**
 */
package br.usp.ffclrp.dcm.lssb.activityrest.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see br.usp.ffclrp.dcm.lssb.activityrest.model.ActivityPackage
 * @generated
 */
public interface ActivityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActivityFactory eINSTANCE = br.usp.ffclrp.dcm.lssb.activityrest.model.impl.ActivityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity</em>'.
	 * @generated
	 */
	Activity createActivity();

	/**
	 * Returns a new object of class '<em>Dataset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dataset</em>'.
	 * @generated
	 */
	Dataset createDataset();

	/**
	 * Returns a new object of class '<em>File Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Adapter</em>'.
	 * @generated
	 */
	FileAdapter createFileAdapter();

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
	 * Returns a new object of class '<em>Parameter Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Map</em>'.
	 * @generated
	 */
	ParameterMap createParameterMap();

	/**
	 * Returns a new object of class '<em>Validation Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Validation Result</em>'.
	 * @generated
	 */
	ValidationResult createValidationResult();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ActivityPackage getActivityPackage();

} //ActivityFactory
