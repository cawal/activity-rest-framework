package tests.dao;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.usp.ffclrp.dcm.lssb.activityrest.dao.AnalysisActivityDao;
import br.usp.ffclrp.dcm.lssb.activityrest.dao.FileSystemDao;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescription;

public class FileSystemDaoTest {

	static File localStorage;
	static AnalysisActivityDescription aaDescription;
	static AnalysisActivityDao dao;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dao = new FileSystemDao(localStorage, aaDescription);
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
	public void test() {
		fail("Not yet implemented");
	}
	
}
