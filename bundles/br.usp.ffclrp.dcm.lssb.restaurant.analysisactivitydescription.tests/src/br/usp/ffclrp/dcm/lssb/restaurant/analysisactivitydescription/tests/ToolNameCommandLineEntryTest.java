/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.tests;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionFactory;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ToolNameCommandLineEntry;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tool Name Command Line Entry</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToolNameCommandLineEntryTest extends CommandLineEntryListTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ToolNameCommandLineEntryTest.class);
	}

	/**
	 * Constructs a new Tool Name Command Line Entry test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolNameCommandLineEntryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Tool Name Command Line Entry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ToolNameCommandLineEntry getFixture() {
		return (ToolNameCommandLineEntry)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AnalysisActivityDescriptionFactory.eINSTANCE.createToolNameCommandLineEntry());
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

} //ToolNameCommandLineEntryTest
