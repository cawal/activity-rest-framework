/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>stringlistmanipulators</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class StringListManipulatorsTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new StringListManipulatorsTests("stringlistmanipulators Tests");
		suite.addTestSuite(JoinTest.class);
		suite.addTestSuite(PrependEachTest.class);
		suite.addTestSuite(AppendEachTest.class);
		suite.addTestSuite(AppendListWithTest.class);
		suite.addTestSuite(PrependListWithTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringListManipulatorsTests(String name) {
		super(name);
	}

} //StringListManipulatorsTests
