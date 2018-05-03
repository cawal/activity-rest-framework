/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.tests;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionFactory;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MinimunDatasetCardinalityConstraint;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Minimun Dataset Cardinality Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MinimunDatasetCardinalityConstraintTest extends DatasetConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MinimunDatasetCardinalityConstraintTest.class);
	}

	/**
	 * Constructs a new Minimun Dataset Cardinality Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinimunDatasetCardinalityConstraintTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Minimun Dataset Cardinality Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MinimunDatasetCardinalityConstraint getFixture() {
		return (MinimunDatasetCardinalityConstraint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AnalysisActivityDescriptionFactory.eINSTANCE.createMinimunDatasetCardinalityConstraint());
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

	public void test_noTest() {
	}
	
} //MinimunDatasetCardinalityConstraintTest
