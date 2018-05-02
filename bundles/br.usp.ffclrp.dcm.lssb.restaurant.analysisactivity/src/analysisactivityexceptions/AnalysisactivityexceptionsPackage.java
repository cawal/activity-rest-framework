/**
 */
package analysisactivityexceptions;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see analysisactivityexceptions.AnalysisactivityexceptionsFactory
 * @model kind="package"
 * @generated
 */
public interface AnalysisactivityexceptionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "analysisactivityexceptions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://dcm.ffclrp.usp.br/lssb/metamodels/activity-exceptions.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "aae";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnalysisactivityexceptionsPackage eINSTANCE = analysisactivityexceptions.impl.AnalysisactivityexceptionsPackageImpl.init();

	/**
	 * The meta object id for the '<em>Parameter Update Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.exceptions.ParameterUpdateException
	 * @see analysisactivityexceptions.impl.AnalysisactivityexceptionsPackageImpl#getParameterUpdateException()
	 * @generated
	 */
	int PARAMETER_UPDATE_EXCEPTION = 0;


	/**
	 * Returns the meta object for data type '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.exceptions.ParameterUpdateException <em>Parameter Update Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Parameter Update Exception</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.exceptions.ParameterUpdateException
	 * @model instanceClass="br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.exceptions.ParameterUpdateException" serializeable="false"
	 * @generated
	 */
	EDataType getParameterUpdateException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AnalysisactivityexceptionsFactory getAnalysisactivityexceptionsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '<em>Parameter Update Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.exceptions.ParameterUpdateException
		 * @see analysisactivityexceptions.impl.AnalysisactivityexceptionsPackageImpl#getParameterUpdateException()
		 * @generated
		 */
		EDataType PARAMETER_UPDATE_EXCEPTION = eINSTANCE.getParameterUpdateException();

	}

} //AnalysisactivityexceptionsPackage
