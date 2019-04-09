/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.tests;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionFactory;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.InputDataset;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Input Dataset</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InputDatasetTest extends DatasetTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InputDatasetTest.class);
	}

	/**
	 * Constructs a new Input Dataset test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputDatasetTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Input Dataset test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InputDataset getFixture() {
		return (InputDataset)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AnalysisActivityDescriptionFactory.eINSTANCE.createInputDataset());
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

} //InputDatasetTest
