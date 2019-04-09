/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.tests;

import br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.PrependEach;
import br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.StringListManipulatorsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Prepend Each</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrependEachTest extends StringListManipulatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PrependEachTest.class);
	}

	/**
	 * Constructs a new Prepend Each test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrependEachTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Prepend Each test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PrependEach getFixture() {
		return (PrependEach)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StringListManipulatorsFactory.eINSTANCE.createPrependEach());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //PrependEachTest
