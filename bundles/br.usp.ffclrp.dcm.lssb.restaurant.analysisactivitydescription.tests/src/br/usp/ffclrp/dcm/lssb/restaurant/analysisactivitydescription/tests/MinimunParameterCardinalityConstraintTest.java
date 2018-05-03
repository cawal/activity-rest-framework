/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.tests;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionFactory;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MinimunParameterCardinalityConstraint;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Minimun Parameter Cardinality Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MinimunParameterCardinalityConstraintTest extends ParameterConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MinimunParameterCardinalityConstraintTest.class);
	}

	/**
	 * Constructs a new Minimun Parameter Cardinality Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinimunParameterCardinalityConstraintTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Minimun Parameter Cardinality Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MinimunParameterCardinalityConstraint getFixture() {
		return (MinimunParameterCardinalityConstraint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AnalysisActivityDescriptionFactory.eINSTANCE.createMinimunParameterCardinalityConstraint());
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
	
} //MinimunParameterCardinalityConstraintTest
