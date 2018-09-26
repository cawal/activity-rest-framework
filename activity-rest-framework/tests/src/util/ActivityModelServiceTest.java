package util;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.usp.ffclrp.dcm.lssb.activityrest.util.ModelsService;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity;

public class ActivityModelServiceTest {
	
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
	public void retrieveAADLModelFromInputStream() throws IOException {
		InputStream modelInputStream = this.getClass().getResourceAsStream("ls.aadl");
		Activity model = ModelsService.retrieveAADLModel(modelInputStream);
		assertNotNull(model);
		assertEquals("list-files", model.getName());
	}
	
}
