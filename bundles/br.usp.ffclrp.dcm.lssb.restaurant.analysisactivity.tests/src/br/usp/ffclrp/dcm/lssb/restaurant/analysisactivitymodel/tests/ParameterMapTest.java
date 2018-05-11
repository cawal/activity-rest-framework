/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.event.ListSelectionEvent;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionFactory;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterKind;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterType;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivityModelFactory;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Parameter;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.ParameterMap;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.exceptions.ParameterUpdateException;
import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Parameter#checkAndSetValues(java.lang.Object) <em>Check And Set Values</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ParameterMapTest extends TestCase {

	private static final AnalysisActivityDescriptionFactory AADP_INSTANCE =
			AnalysisActivityDescriptionFactory.eINSTANCE;
	/**
	 * The fixture for this Parameter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterMap fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ParameterMapTest.class);
	}

	/**
	 * Constructs a new Parameter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterMapTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Parameter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ParameterMap fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Parameter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterMap getFixture() {
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
		setFixture(AnalysisActivityModelFactory.eINSTANCE.createParameterMap());
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

	/**
	 * Tests the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Parameter#checkAndSetValues(java.lang.Object) <em>Check And Set Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws ParameterUpdateException 
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Parameter#checkAndSetValues(java.lang.Object)
	 * @generated
	 */



	public void testCreateDefaultValues() throws ParameterUpdateException {
		ParameterDescription description = 
				AADP_INSTANCE.createParameterDescription();
		
		description.setName("myStringList");
		description.setParameterKind(ParameterKind.LIST);
		description.setParameterType(ParameterType.STRING);
		
		fixture.getDescriptions().clear();
		fixture.getDescriptions().add(description);
		
		fixture.put("myStringList", Arrays.asList("test", "test1"));
		
		System.out.println(fixture.get("myStringList"));
		
		List<Object> newList = Collections.emptyList();
		
		Parameter parameter = AnalysisActivityModelFactory.eINSTANCE.createParameter();
		parameter.setDescription(description);
		parameter.checkAndSetValues(newList);
		

		System.out.println(parameter.getValues());
		assertTrue(parameter.getValues().size() == 0);
		
	}
	
	public void testCheckAndSetValues__SimpleListOfString() throws ParameterUpdateException {
		ParameterDescription description = AADP_INSTANCE.createParameterDescription();
		
		description.setName("myStringList");
		description.setParameterKind(ParameterKind.LIST);
		description.setParameterType(ParameterType.STRING);
		
		List<Object> newList = new ArrayList<>();
			
		newList.add("test");
		
		Parameter parameter = AnalysisActivityModelFactory.eINSTANCE.createParameter();
		parameter.setDescription(description);
		parameter.checkAndSetValues(newList);
		

		System.out.println(parameter.getValues());
		assertTrue(parameter.getValues().size() == 1);
		
	}
	
	public void testCheckAndSetValues__SingleString() throws ParameterUpdateException {
		ParameterDescription description = AADP_INSTANCE.createParameterDescription();
		
		description.setName("mySingleString");
		description.setParameterKind(ParameterKind.SINGLE_VALUE);
		description.setParameterType(ParameterType.STRING);
		
		List<Object> newList = new ArrayList<>();
			
		newList.add("test");
		
		Parameter parameter = AnalysisActivityModelFactory.eINSTANCE.createParameter();
		parameter.setDescription(description);
		parameter.checkAndSetValues(newList);
		

		System.out.println(parameter.getValues());
		assertTrue(parameter.getValues().size() == 1);
	}
	
	
	public void testCheckAndSetValues__SingleStringNotList() throws ParameterUpdateException {
		ParameterDescription description = AADP_INSTANCE.createParameterDescription();
		
		description.setName("myStringList");
		description.setParameterKind(ParameterKind.SINGLE_VALUE);
		description.setParameterType(ParameterType.STRING);
		
		List<Object> newList = new ArrayList<>();

		newList.add("test");
		newList.add("test2");
		try {
			Parameter parameter = AnalysisActivityModelFactory.eINSTANCE.createParameter();
			parameter.setDescription(description);
			parameter.checkAndSetValues(newList);
			fail("Missing exception");
		} catch (ParameterUpdateException e) {
			
	 	}
	}

	public void testCheckAndSetValues__SingleInt() throws ParameterUpdateException {
		ParameterDescription description = AADP_INSTANCE.createParameterDescription();
		
		description.setName("myStringList");
		description.setParameterKind(ParameterKind.SINGLE_VALUE);
		description.setParameterType(ParameterType.INTEGER);
		
		List<Integer> newList = new ArrayList<>();

		newList.add(1);
		
		Parameter parameter = AnalysisActivityModelFactory.eINSTANCE.createParameter();
		parameter.setDescription(description);
		parameter.checkAndSetValues(newList);
		
		System.out.println(parameter.getValues());
		assertTrue(parameter.getValues().size() == 1);
	}
	
	public void testCheckAndSetValues__SingleIntAsString() throws ParameterUpdateException {
		ParameterDescription description = AADP_INSTANCE.createParameterDescription();
		
		description.setName("myStringList");
		description.setParameterKind(ParameterKind.SINGLE_VALUE);
		description.setParameterType(ParameterType.INTEGER);
		
		fixture.getDescriptions().add(description);
		System.out.println("aqui");
		fixture.put("myStringList", "a");
		
		System.out.println(fixture.get("myStringList"));
	}
	
	public void testCheckAndSetValues__InvalidIfNonIntAsString() {
		ParameterDescription description = AADP_INSTANCE.createParameterDescription();
		
		description.setName("myStringList");
		description.setParameterKind(ParameterKind.SINGLE_VALUE);
		description.setParameterType(ParameterType.INTEGER);
		
		List<String> newList = new ArrayList<>();

		newList.add("1a");
		
		try {
			Parameter parameter = AnalysisActivityModelFactory.eINSTANCE.createParameter();
			parameter.setDescription(description);
			parameter.checkAndSetValues(newList);
			fail("Missing exception");
		} catch (ParameterUpdateException e) {
			
	 	}
	}
	
	public void testCheckAndSetValues__ValidIfIntAsStringList() throws ParameterUpdateException {
		ParameterDescription description = AADP_INSTANCE.createParameterDescription();
		
		description.setName("myStringList");
		description.setParameterKind(ParameterKind.LIST);
		description.setParameterType(ParameterType.INTEGER);
		
		List<String> newList = new ArrayList<>();

		newList.add("1");
		newList.add("2");
		newList.add("3");

		
		Parameter parameter = AnalysisActivityModelFactory.eINSTANCE.createParameter();
		parameter.setDescription(description);
		parameter.checkAndSetValues(newList);
		
		assertTrue(parameter.getValues().size() == 3);
	}
	
	public void testCheckAndSetValues__InvalidIfMoreThanSingleIntInStringList() {
		ParameterDescription description = AADP_INSTANCE.createParameterDescription();
		
		description.setName("myStringList");
		description.setParameterKind(ParameterKind.SINGLE_VALUE);
		description.setParameterType(ParameterType.INTEGER);
		
		List<String> newList = new ArrayList<>();

		newList.add("1");
		newList.add("2");
		newList.add("3");
		
		try {
			Parameter parameter = AnalysisActivityModelFactory.eINSTANCE.createParameter();
			parameter.setDescription(description);
			parameter.checkAndSetValues(newList);
			fail("Missing exception");
		} catch (ParameterUpdateException e) {
			
	 	}
	}

	
	public void testCheckAndSetValues__ValidIfIntegerAsInt() throws ParameterUpdateException {
		ParameterDescription description = AADP_INSTANCE.createParameterDescription();
		System.out.println(
				"ParameterTest.testCheckAndSetValues__ValidIfIntegerAsInt()");
		description.setName("myStringList");
		description.setParameterKind(ParameterKind.SINGLE_VALUE);
		description.setParameterType(ParameterType.INTEGER);
		
		Parameter parameter = AnalysisActivityModelFactory.eINSTANCE.createParameter();
		parameter.setDescription(description);
		parameter.checkAndSetValues(1);
		
		System.out.println(parameter.getValues());
		assertTrue(parameter.getValues().size() == 1);
	}
	
	
} //ParameterTest
