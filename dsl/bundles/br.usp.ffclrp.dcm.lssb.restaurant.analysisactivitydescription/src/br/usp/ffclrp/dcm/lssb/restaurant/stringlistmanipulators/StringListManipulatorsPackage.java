/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.StringListManipulatorsFactory
 * @model kind="package"
 * @generated
 */
public interface StringListManipulatorsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "stringlistmanipulators";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://dcm.ffclrp.usp.br/lssb/metamodels/string-list-manipulator.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "slm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StringListManipulatorsPackage eINSTANCE = br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.StringListManipulatorsPackageImpl.init();

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.StringListManipulatorImpl <em>String List Manipulator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.StringListManipulatorImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.StringListManipulatorsPackageImpl#getStringListManipulator()
	 * @generated
	 */
	int STRING_LIST_MANIPULATOR = 0;

	/**
	 * The number of structural features of the '<em>String List Manipulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LIST_MANIPULATOR_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Transform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LIST_MANIPULATOR___TRANSFORM__ELIST = 0;

	/**
	 * The number of operations of the '<em>String List Manipulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LIST_MANIPULATOR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.JoinImpl <em>Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.JoinImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.StringListManipulatorsPackageImpl#getJoin()
	 * @generated
	 */
	int JOIN = 1;

	/**
	 * The feature id for the '<em><b>Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__DELIMITER = STRING_LIST_MANIPULATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FEATURE_COUNT = STRING_LIST_MANIPULATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Transform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN___TRANSFORM__ELIST = STRING_LIST_MANIPULATOR___TRANSFORM__ELIST;

	/**
	 * The number of operations of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_OPERATION_COUNT = STRING_LIST_MANIPULATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.PrependEachImpl <em>Prepend Each</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.PrependEachImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.StringListManipulatorsPackageImpl#getPrependEach()
	 * @generated
	 */
	int PREPEND_EACH = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPEND_EACH__VALUE = STRING_LIST_MANIPULATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Prepend Each</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPEND_EACH_FEATURE_COUNT = STRING_LIST_MANIPULATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Transform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPEND_EACH___TRANSFORM__ELIST = STRING_LIST_MANIPULATOR___TRANSFORM__ELIST;

	/**
	 * The number of operations of the '<em>Prepend Each</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPEND_EACH_OPERATION_COUNT = STRING_LIST_MANIPULATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.AppendEachImpl <em>Append Each</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.AppendEachImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.StringListManipulatorsPackageImpl#getAppendEach()
	 * @generated
	 */
	int APPEND_EACH = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEND_EACH__VALUE = STRING_LIST_MANIPULATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Append Each</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEND_EACH_FEATURE_COUNT = STRING_LIST_MANIPULATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Transform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEND_EACH___TRANSFORM__ELIST = STRING_LIST_MANIPULATOR___TRANSFORM__ELIST;

	/**
	 * The number of operations of the '<em>Append Each</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEND_EACH_OPERATION_COUNT = STRING_LIST_MANIPULATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.AppendListWithImpl <em>Append List With</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.AppendListWithImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.StringListManipulatorsPackageImpl#getAppendListWith()
	 * @generated
	 */
	int APPEND_LIST_WITH = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEND_LIST_WITH__VALUE = STRING_LIST_MANIPULATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Append List With</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEND_LIST_WITH_FEATURE_COUNT = STRING_LIST_MANIPULATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Transform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEND_LIST_WITH___TRANSFORM__ELIST = STRING_LIST_MANIPULATOR___TRANSFORM__ELIST;

	/**
	 * The number of operations of the '<em>Append List With</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEND_LIST_WITH_OPERATION_COUNT = STRING_LIST_MANIPULATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.PrependListWithImpl <em>Prepend List With</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.PrependListWithImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.StringListManipulatorsPackageImpl#getPrependListWith()
	 * @generated
	 */
	int PREPEND_LIST_WITH = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPEND_LIST_WITH__VALUE = STRING_LIST_MANIPULATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Prepend List With</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPEND_LIST_WITH_FEATURE_COUNT = STRING_LIST_MANIPULATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Transform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPEND_LIST_WITH___TRANSFORM__ELIST = STRING_LIST_MANIPULATOR___TRANSFORM__ELIST;

	/**
	 * The number of operations of the '<em>Prepend List With</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPEND_LIST_WITH_OPERATION_COUNT = STRING_LIST_MANIPULATOR_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.ToFlagImpl <em>To Flag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.ToFlagImpl
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.StringListManipulatorsPackageImpl#getToFlag()
	 * @generated
	 */
	int TO_FLAG = 6;

	/**
	 * The feature id for the '<em><b>If True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_FLAG__IF_TRUE = STRING_LIST_MANIPULATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>If False</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_FLAG__IF_FALSE = STRING_LIST_MANIPULATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>To Flag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_FLAG_FEATURE_COUNT = STRING_LIST_MANIPULATOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Transform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_FLAG___TRANSFORM__ELIST = STRING_LIST_MANIPULATOR___TRANSFORM__ELIST;

	/**
	 * The number of operations of the '<em>To Flag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_FLAG_OPERATION_COUNT = STRING_LIST_MANIPULATOR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.StringListManipulator <em>String List Manipulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String List Manipulator</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.StringListManipulator
	 * @generated
	 */
	EClass getStringListManipulator();

	/**
	 * Returns the meta object for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.StringListManipulator#transform(org.eclipse.emf.common.util.EList) <em>Transform</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform</em>' operation.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.StringListManipulator#transform(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getStringListManipulator__Transform__EList();

	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.Join
	 * @generated
	 */
	EClass getJoin();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.Join#getDelimiter <em>Delimiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delimiter</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.Join#getDelimiter()
	 * @see #getJoin()
	 * @generated
	 */
	EAttribute getJoin_Delimiter();

	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.PrependEach <em>Prepend Each</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prepend Each</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.PrependEach
	 * @generated
	 */
	EClass getPrependEach();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.PrependEach#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.PrependEach#getValue()
	 * @see #getPrependEach()
	 * @generated
	 */
	EAttribute getPrependEach_Value();

	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.AppendEach <em>Append Each</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Append Each</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.AppendEach
	 * @generated
	 */
	EClass getAppendEach();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.AppendEach#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.AppendEach#getValue()
	 * @see #getAppendEach()
	 * @generated
	 */
	EAttribute getAppendEach_Value();

	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.AppendListWith <em>Append List With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Append List With</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.AppendListWith
	 * @generated
	 */
	EClass getAppendListWith();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.AppendListWith#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.AppendListWith#getValue()
	 * @see #getAppendListWith()
	 * @generated
	 */
	EAttribute getAppendListWith_Value();

	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.PrependListWith <em>Prepend List With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prepend List With</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.PrependListWith
	 * @generated
	 */
	EClass getPrependListWith();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.PrependListWith#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.PrependListWith#getValue()
	 * @see #getPrependListWith()
	 * @generated
	 */
	EAttribute getPrependListWith_Value();

	/**
	 * Returns the meta object for class '{@link br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.ToFlag <em>To Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Flag</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.ToFlag
	 * @generated
	 */
	EClass getToFlag();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.ToFlag#getIfTrue <em>If True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If True</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.ToFlag#getIfTrue()
	 * @see #getToFlag()
	 * @generated
	 */
	EAttribute getToFlag_IfTrue();

	/**
	 * Returns the meta object for the attribute '{@link br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.ToFlag#getIfFalse <em>If False</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If False</em>'.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.ToFlag#getIfFalse()
	 * @see #getToFlag()
	 * @generated
	 */
	EAttribute getToFlag_IfFalse();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StringListManipulatorsFactory getStringListManipulatorsFactory();

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
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.StringListManipulatorImpl <em>String List Manipulator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.StringListManipulatorImpl
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.StringListManipulatorsPackageImpl#getStringListManipulator()
		 * @generated
		 */
		EClass STRING_LIST_MANIPULATOR = eINSTANCE.getStringListManipulator();

		/**
		 * The meta object literal for the '<em><b>Transform</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRING_LIST_MANIPULATOR___TRANSFORM__ELIST = eINSTANCE.getStringListManipulator__Transform__EList();

		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.JoinImpl <em>Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.JoinImpl
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.StringListManipulatorsPackageImpl#getJoin()
		 * @generated
		 */
		EClass JOIN = eINSTANCE.getJoin();

		/**
		 * The meta object literal for the '<em><b>Delimiter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN__DELIMITER = eINSTANCE.getJoin_Delimiter();

		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.PrependEachImpl <em>Prepend Each</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.PrependEachImpl
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.StringListManipulatorsPackageImpl#getPrependEach()
		 * @generated
		 */
		EClass PREPEND_EACH = eINSTANCE.getPrependEach();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREPEND_EACH__VALUE = eINSTANCE.getPrependEach_Value();

		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.AppendEachImpl <em>Append Each</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.AppendEachImpl
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.StringListManipulatorsPackageImpl#getAppendEach()
		 * @generated
		 */
		EClass APPEND_EACH = eINSTANCE.getAppendEach();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPEND_EACH__VALUE = eINSTANCE.getAppendEach_Value();

		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.AppendListWithImpl <em>Append List With</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.AppendListWithImpl
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.StringListManipulatorsPackageImpl#getAppendListWith()
		 * @generated
		 */
		EClass APPEND_LIST_WITH = eINSTANCE.getAppendListWith();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPEND_LIST_WITH__VALUE = eINSTANCE.getAppendListWith_Value();

		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.PrependListWithImpl <em>Prepend List With</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.PrependListWithImpl
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.StringListManipulatorsPackageImpl#getPrependListWith()
		 * @generated
		 */
		EClass PREPEND_LIST_WITH = eINSTANCE.getPrependListWith();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREPEND_LIST_WITH__VALUE = eINSTANCE.getPrependListWith_Value();

		/**
		 * The meta object literal for the '{@link br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.ToFlagImpl <em>To Flag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.ToFlagImpl
		 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.StringListManipulatorsPackageImpl#getToFlag()
		 * @generated
		 */
		EClass TO_FLAG = eINSTANCE.getToFlag();

		/**
		 * The meta object literal for the '<em><b>If True</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_FLAG__IF_TRUE = eINSTANCE.getToFlag_IfTrue();

		/**
		 * The meta object literal for the '<em><b>If False</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_FLAG__IF_FALSE = eINSTANCE.getToFlag_IfFalse();

	}

} //StringListManipulatorsPackage
