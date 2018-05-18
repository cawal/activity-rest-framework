/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.tests;

import br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.PrependListWith;
import br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.StringListManipulatorsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Prepend List With</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrependListWithTest extends StringListManipulatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PrependListWithTest.class);
	}

	/**
	 * Constructs a new Prepend List With test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrependListWithTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Prepend List With test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PrependListWith getFixture() {
		return (PrependListWith)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StringListManipulatorsFactory.eINSTANCE.createPrependListWith());
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

} //PrependListWithTest
