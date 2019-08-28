/**
 */
package br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.tests;

import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.Contact;
import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.DeploymentModelFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Contact</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContactTest extends TestCase {

	/**
	 * The fixture for this Contact test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Contact fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ContactTest.class);
	}

	/**
	 * Constructs a new Contact test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Contact test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Contact fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Contact test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Contact getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DeploymentModelFactory.eINSTANCE.createContact());
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

} //ContactTest
