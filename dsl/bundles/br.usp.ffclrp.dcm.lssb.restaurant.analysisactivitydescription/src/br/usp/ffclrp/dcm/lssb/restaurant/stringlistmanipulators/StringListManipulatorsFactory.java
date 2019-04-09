/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.StringListManipulatorsPackage
 * @generated
 */
public interface StringListManipulatorsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StringListManipulatorsFactory eINSTANCE = br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.StringListManipulatorsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Join</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Join</em>'.
	 * @generated
	 */
	Join createJoin();

	/**
	 * Returns a new object of class '<em>Prepend Each</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prepend Each</em>'.
	 * @generated
	 */
	PrependEach createPrependEach();

	/**
	 * Returns a new object of class '<em>Append Each</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Append Each</em>'.
	 * @generated
	 */
	AppendEach createAppendEach();

	/**
	 * Returns a new object of class '<em>Append List With</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Append List With</em>'.
	 * @generated
	 */
	AppendListWith createAppendListWith();

	/**
	 * Returns a new object of class '<em>Prepend List With</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prepend List With</em>'.
	 * @generated
	 */
	PrependListWith createPrependListWith();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StringListManipulatorsPackage getStringListManipulatorsPackage();

} //StringListManipulatorsFactory
