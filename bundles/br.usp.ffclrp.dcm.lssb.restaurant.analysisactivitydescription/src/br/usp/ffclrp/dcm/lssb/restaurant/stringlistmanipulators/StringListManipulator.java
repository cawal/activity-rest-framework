/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String List Manipulator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Subclasses must implement a closure on lists of strings.
 * <!-- end-model-doc -->
 *
 *
 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.StringListManipulatorsPackage#getStringListManipulator()
 * @model abstract="true"
 * @generated
 */
public interface StringListManipulator extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" stringListMany="true" stringListOrdered="false"
	 *        stringListAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<String> transform(EList<String> stringList);

} // StringListManipulator
