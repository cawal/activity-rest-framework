/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionFactory;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterKind;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterType;
import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Parameter Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription#isValidValue(org.eclipse.emf.common.util.EList) <em>Is Valid Value</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ParameterDescriptionTest extends TestCase {

	/**
	 * The fixture for this Parameter Description test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterDescription fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ParameterDescriptionTest.class);
	}

	/**
	 * Constructs a new Parameter Description test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDescriptionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Parameter Description test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ParameterDescription fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Parameter Description test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterDescription getFixture() {
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
		setFixture(AnalysisActivityDescriptionFactory.eINSTANCE.createParameterDescription());
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



	public void testIsValidValue__EmptyListOfStrings() {
		ParameterDescription description = AnalysisActivityDescriptionFactory.eINSTANCE.createParameterDescription();
		
		description.setName("myStringList");
		description.setParameterKind(ParameterKind.LIST);
		description.setParameterType(ParameterType.STRING);
		
		List<Object> newList = Collections.emptyList();
		
		assertTrue(description.isValidValue(newList));
	}
	
	public void testIsValidValue__SimpleListOfString() {
		ParameterDescription description = AnalysisActivityDescriptionFactory.eINSTANCE.createParameterDescription();
		
		description.setName("myStringList");
		description.setParameterKind(ParameterKind.LIST);
		description.setParameterType(ParameterType.STRING);
		
		List<Object> newList = new ArrayList<>();
			
		newList.add("test");
		
		assertTrue(description.isValidValue(newList));
	}
	
	public void testIsValidValue__SingleString() {
		ParameterDescription description = AnalysisActivityDescriptionFactory.eINSTANCE.createParameterDescription();
		
		description.setName("mySingleString");
		description.setParameterKind(ParameterKind.SINGLE_VALUE);
		description.setParameterType(ParameterType.STRING);
		
		List<Object> newList = new ArrayList<>();
			
		newList.add("test");
		
		assertTrue(description.isValidValue(newList));
	}
	
	public void testIsValidValue__SingleStringNotList() {
		ParameterDescription description = AnalysisActivityDescriptionFactory.eINSTANCE.createParameterDescription();
		
		description.setName("myStringList");
		description.setParameterKind(ParameterKind.SINGLE_VALUE);
		description.setParameterType(ParameterType.STRING);
		
		List<Object> newList = new ArrayList<>();

		newList.add("test");
		newList.add("test2");
		
		assertFalse(description.isValidValue(newList));
	}

	public void testIsValidValue__SingleInt() {
		ParameterDescription description = AnalysisActivityDescriptionFactory.eINSTANCE.createParameterDescription();
		
		description.setName("myStringList");
		description.setParameterKind(ParameterKind.SINGLE_VALUE);
		description.setParameterType(ParameterType.INTEGER);
		
		List<Integer> newList = new ArrayList<>();

		newList.add(1);
		
		assertTrue(description.isValidValue(newList));
	}
	
	public void testIsValidValue__SingleIntAsString() {
		ParameterDescription description = AnalysisActivityDescriptionFactory.eINSTANCE.createParameterDescription();
		
		description.setName("myStringList");
		description.setParameterKind(ParameterKind.SINGLE_VALUE);
		description.setParameterType(ParameterType.INTEGER);
		
		List<String> newList = new ArrayList<>();

		newList.add("1");
		
		assertTrue(description.isValidValue(newList));
	}
	
	public void testIsValidValue__InvalidIfNonIntAsString() {
		ParameterDescription description = AnalysisActivityDescriptionFactory.eINSTANCE.createParameterDescription();
		
		description.setName("myStringList");
		description.setParameterKind(ParameterKind.SINGLE_VALUE);
		description.setParameterType(ParameterType.INTEGER);
		
		List<String> newList = new ArrayList<>();

		newList.add("1a");
		
		assertFalse(description.isValidValue(newList));
	}
	
	public void testIsValidValue__ValidIfIntAsStringList() {
		ParameterDescription description = AnalysisActivityDescriptionFactory.eINSTANCE.createParameterDescription();
		
		description.setName("myStringList");
		description.setParameterKind(ParameterKind.LIST);
		description.setParameterType(ParameterType.INTEGER);
		
		List<String> newList = new ArrayList<>();

		newList.add("1");
		newList.add("2");
		newList.add("3");
		
		assertTrue(description.isValidValue(newList));
	}
	
	public void testIsValidValue__InvalidIfMoreThanSingleIntInStringList() {
		ParameterDescription description = AnalysisActivityDescriptionFactory.eINSTANCE.createParameterDescription();
		
		description.setName("myStringList");
		description.setParameterKind(ParameterKind.SINGLE_VALUE);
		description.setParameterType(ParameterType.INTEGER);
		
		List<String> newList = new ArrayList<>();

		newList.add("1");
		newList.add("2");
		newList.add("3");
		
		assertFalse(description.isValidValue(newList));
	}
	
} //ParameterDescriptionTest
