import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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
public class ParameterDescriptionTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	@Before
	public void setUp() throws Exception {
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testIsValidValue__EmptyListOfStrings() {
		ParameterDescription description = AnalysisActivityDescriptionFactory.eINSTANCE.createParameterDescription();
		
		description.setName("myStringList");
		description.setParameterKind(ParameterKind.LIST);
		description.setParameterType(ParameterType.STRING);
		
		List<String> newList = Collections.emptyList();
		
		assertTrue(description.isValidValue(newList));
	}

	@Test
	public void testIsValidValue__SimpleListOfString() {
		ParameterDescription description = AnalysisActivityDescriptionFactory.eINSTANCE.createParameterDescription();
		
		description.setName("myStringList");
		description.setParameterKind(ParameterKind.LIST);
		description.setParameterType(ParameterType.STRING);
		
		List<Object> newList = new ArrayList<>();
			
		newList.add("test");
		
		assertTrue(description.isValidValue(newList));
	}

	@Test
	public void testIsValidValue__SingleString() {
		ParameterDescription description = AnalysisActivityDescriptionFactory.eINSTANCE.createParameterDescription();
		
		description.setName("mySingleString");
		description.setParameterKind(ParameterKind.SINGLE_VALUE);
		description.setParameterType(ParameterType.STRING);
		
		List<Object> newList = new ArrayList<>();
			
		newList.add("test");
		
		assertTrue(description.isValidValue(newList));
	}

	@Test
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

	@Test
	public void testIsValidValue__SingleInt() {
		ParameterDescription description = AnalysisActivityDescriptionFactory.eINSTANCE.createParameterDescription();
		
		description.setName("myStringList");
		description.setParameterKind(ParameterKind.SINGLE_VALUE);
		description.setParameterType(ParameterType.INTEGER);
		
		List<Integer> newList = new ArrayList<>();

		newList.add(1);
		
		assertTrue(description.isValidValue(newList));
	}

	@Test
	public void testIsValidValue__SingleIntAsString() {
		ParameterDescription description = AnalysisActivityDescriptionFactory.eINSTANCE.createParameterDescription();
		
		description.setName("myStringList");
		description.setParameterKind(ParameterKind.SINGLE_VALUE);
		description.setParameterType(ParameterType.INTEGER);
		
		List<String> newList = new ArrayList<>();

		newList.add("1");
		
		assertTrue(description.isValidValue(newList));
	}

	@Test
	public void testIsValidValue__InvalidIfNonIntAsString() {
		ParameterDescription description = AnalysisActivityDescriptionFactory.eINSTANCE.createParameterDescription();
		
		description.setName("myStringList");
		description.setParameterKind(ParameterKind.SINGLE_VALUE);
		description.setParameterType(ParameterType.INTEGER);
		
		List<String> newList = new ArrayList<>();

		newList.add("1a");
		
		assertFalse(description.isValidValue(newList));
	}

	@Test
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

	@Test
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
