/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl;

import br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StringListManipulatorsFactoryImpl extends EFactoryImpl implements StringListManipulatorsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StringListManipulatorsFactory init() {
		try {
			StringListManipulatorsFactory theStringListManipulatorsFactory = (StringListManipulatorsFactory)EPackage.Registry.INSTANCE.getEFactory(StringListManipulatorsPackage.eNS_URI);
			if (theStringListManipulatorsFactory != null) {
				return theStringListManipulatorsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StringListManipulatorsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringListManipulatorsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StringListManipulatorsPackage.JOIN: return createJoin();
			case StringListManipulatorsPackage.PREPEND_EACH: return createPrependEach();
			case StringListManipulatorsPackage.APPEND_EACH: return createAppendEach();
			case StringListManipulatorsPackage.APPEND_LIST_WITH: return createAppendListWith();
			case StringListManipulatorsPackage.PREPEND_LIST_WITH: return createPrependListWith();
			case StringListManipulatorsPackage.TO_FLAG: return createToFlag();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Join createJoin() {
		JoinImpl join = new JoinImpl();
		return join;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrependEach createPrependEach() {
		PrependEachImpl prependEach = new PrependEachImpl();
		return prependEach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AppendEach createAppendEach() {
		AppendEachImpl appendEach = new AppendEachImpl();
		return appendEach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AppendListWith createAppendListWith() {
		AppendListWithImpl appendListWith = new AppendListWithImpl();
		return appendListWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrependListWith createPrependListWith() {
		PrependListWithImpl prependListWith = new PrependListWithImpl();
		return prependListWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ToFlag createToFlag() {
		ToFlagImpl toFlag = new ToFlagImpl();
		return toFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringListManipulatorsPackage getStringListManipulatorsPackage() {
		return (StringListManipulatorsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StringListManipulatorsPackage getPackage() {
		return StringListManipulatorsPackage.eINSTANCE;
	}

} //StringListManipulatorsFactoryImpl
