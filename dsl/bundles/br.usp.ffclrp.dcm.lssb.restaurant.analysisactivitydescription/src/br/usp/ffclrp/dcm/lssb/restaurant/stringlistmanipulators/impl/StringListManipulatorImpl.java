/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl;

import br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.StringListManipulator;
import br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.StringListManipulatorsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String List Manipulator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class StringListManipulatorImpl extends MinimalEObjectImpl.Container implements StringListManipulator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringListManipulatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StringListManipulatorsPackage.Literals.STRING_LIST_MANIPULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> transform(EList<String> stringList) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case StringListManipulatorsPackage.STRING_LIST_MANIPULATOR___TRANSFORM__ELIST:
				return transform((EList<String>)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //StringListManipulatorImpl
