/**
 */
package br.usp.ffclrp.dcm.lssb.activityrest.domain;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivityModelPackage
 * @generated
 */
public interface AnalysisActivityModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnalysisActivityModelFactory eINSTANCE = br.usp.ffclrp.dcm.lssb.activityrest.domain.impl.AnalysisActivityModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>File Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Adapter</em>'.
	 * @generated
	 */
	FileAdapter createFileAdapter();

	/**
	 * Returns a new object of class '<em>Analysis Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analysis Activity</em>'.
	 * @generated
	 */
	AnalysisActivity createAnalysisActivity();

	/**
	 * Returns a new object of class '<em>Dataset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dataset</em>'.
	 * @generated
	 */
	Dataset createDataset();

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
	AnalysisActivityModelPackage getAnalysisActivityModelPackage();

} //AnalysisActivityModelFactory
