package tests;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.usp.ffclrp.dcm.lssb.activityrest.domain.IntegerValue;


public class ParameterValueTest {
	
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
	public void integerParameterTest() {
		IntegerValue val1 = new IntegerValue(1);
		IntegerValue val2 = new IntegerValue(1);	
		assertEquals(val1, val2);
		
		
	}

	
}
