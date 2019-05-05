/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.util;

import br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.StringListManipulatorsPackage
 * @generated
 */
public class StringListManipulatorsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StringListManipulatorsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringListManipulatorsSwitch() {
		if (modelPackage == null) {
			modelPackage = StringListManipulatorsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case StringListManipulatorsPackage.STRING_LIST_MANIPULATOR: {
				StringListManipulator stringListManipulator = (StringListManipulator)theEObject;
				T result = caseStringListManipulator(stringListManipulator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StringListManipulatorsPackage.JOIN: {
				Join join = (Join)theEObject;
				T result = caseJoin(join);
				if (result == null) result = caseStringListManipulator(join);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StringListManipulatorsPackage.PREPEND_EACH: {
				PrependEach prependEach = (PrependEach)theEObject;
				T result = casePrependEach(prependEach);
				if (result == null) result = caseStringListManipulator(prependEach);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StringListManipulatorsPackage.APPEND_EACH: {
				AppendEach appendEach = (AppendEach)theEObject;
				T result = caseAppendEach(appendEach);
				if (result == null) result = caseStringListManipulator(appendEach);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StringListManipulatorsPackage.APPEND_LIST_WITH: {
				AppendListWith appendListWith = (AppendListWith)theEObject;
				T result = caseAppendListWith(appendListWith);
				if (result == null) result = caseStringListManipulator(appendListWith);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StringListManipulatorsPackage.PREPEND_LIST_WITH: {
				PrependListWith prependListWith = (PrependListWith)theEObject;
				T result = casePrependListWith(prependListWith);
				if (result == null) result = caseStringListManipulator(prependListWith);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StringListManipulatorsPackage.TO_FLAG: {
				ToFlag toFlag = (ToFlag)theEObject;
				T result = caseToFlag(toFlag);
				if (result == null) result = caseStringListManipulator(toFlag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String List Manipulator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String List Manipulator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringListManipulator(StringListManipulator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoin(Join object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prepend Each</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prepend Each</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrependEach(PrependEach object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Append Each</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Append Each</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppendEach(AppendEach object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Append List With</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Append List With</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppendListWith(AppendListWith object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prepend List With</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prepend List With</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrependListWith(PrependListWith object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>To Flag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To Flag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToFlag(ToFlag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //StringListManipulatorsSwitch
