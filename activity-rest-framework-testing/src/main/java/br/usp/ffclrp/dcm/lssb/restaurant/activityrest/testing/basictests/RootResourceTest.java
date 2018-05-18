package br.usp.ffclrp.dcm.lssb.restaurant.activityrest.testing.basictests;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.net.URI;
import java.util.List;

import org.apache.http.HttpStatus;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.usp.ffclrp.dcm.lssb.activityrest.rest.ResourceRelations;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.hal.ServiceResourcesHal;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.jaxbdecorators.HATEOASLink;
import br.usp.ffclrp.dcm.lssb.restaurant.activityrest.testing.TestBase;
import io.openapitools.jackson.dataformat.hal.HALMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RootResourceTest extends TestBase {
	
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
	public void serviceIsUp() {
		Response r = given()
				.get()
				.andReturn();
		// service is up?
		assertEquals(HttpStatus.SC_OK, r.statusCode());
	}
	
	
	@Test
	@Ignore
	public void rootResourceProvidesHalLinks()
			throws JsonParseException, JsonMappingException, IOException {

		URI baseUri = URI.create(
				RestAssured.baseURI
				+ ":" 
				+ RestAssured.port
				+ RestAssured.basePath)
			.normalize();
		
		URI newAnalysisUri = URI.create(
				RestAssured.baseURI
				+ ":"+RestAssured.port
				+ RestAssured.basePath
				+ "/new-analyses")
			.normalize();
		
		RequestSpecification request = given()
				.accept("application/hal+json");
		Response r = request.get()
				.andReturn();
		
		r.prettyPrint();
		 
		ObjectMapper halMapper = new HALMapper();
		ServiceResourcesHal sr = halMapper.readValue(
			r.body().asString(), ServiceResourcesHal.class
		);
		


		assertNotNull(sr.self.getHref());
		assertTrue(URI.create(sr.self.getHref()).normalize()
				.equals(baseUri.normalize()));
		
		assertNotNull(sr.createAnalysis.getHref());
		assertTrue(
				URI.create(sr.createAnalysis.getHref()).normalize()
				.equals(newAnalysisUri.normalize()));
		
	}
	
	
	@Test
	public void rootResourceJsonProvidesLinks()
			throws JsonParseException, JsonMappingException, IOException {

		URI baseUri = URI.create(
				RestAssured.baseURI
				+ ":" 
				+ RestAssured.port
				+ RestAssured.basePath)
			.normalize();
		
		URI newAnalysisUri = URI.create(
				RestAssured.baseURI
				+ ":"+RestAssured.port
				+ RestAssured.basePath
				+ "/new-analyses")
			.normalize();
		
		RequestSpecification request = given()
				.accept("application/json");
		Response r = request.get()
				.andReturn();
				
		
		List<HATEOASLink> headerList =  processHeadersForLinks(r.getHeaders());
		
		headerList.stream().forEach(h -> 
			System.out.println(h.relation + ": " + h.getMethod() + " "+ h.uri.toString()));

		HATEOASLink selfLink = headerList.stream()
				.filter(h -> h.relation.equalsIgnoreCase(ResourceRelations.SELF))
				.findFirst().get();
		

		HATEOASLink newAnalysisLink = headerList.stream()
				.filter(h -> h.relation.equalsIgnoreCase(ResourceRelations.ROOT_2_NEW_ANALYSES_COLLECTION))
				.findFirst().get();
		

		assertNotNull(selfLink);
		assertTrue(selfLink.getUri().normalize() + " != " + baseUri.normalize(), 
				selfLink.getUri().normalize().equals(baseUri.normalize()));
		
		assertNotNull(newAnalysisLink);
		assertTrue(newAnalysisLink.getUri().normalize()
				.equals(newAnalysisUri.normalize()));
		
	}
	
	
	@Test
	public void methodsNotAllowed() {
		
		RequestSpecification request = given()
				.accept("application/json");
		Response response = request.post()
				.andReturn();
		assertEquals("POST should not be allowed for root resource.", 
				HttpStatus.SC_METHOD_NOT_ALLOWED,response.statusCode());
		
		request = given()
				.accept("application/json");
		response = request.put()
				.andReturn();
		assertEquals("PUT should not be allowed for root resource.", 
				HttpStatus.SC_METHOD_NOT_ALLOWED,response.statusCode());
		
		request = given()
				.accept("application/json");
		response = request.delete()
				.andReturn();
		assertEquals("DELETE should not be allowed for root resource.", 
				HttpStatus.SC_METHOD_NOT_ALLOWED,response.statusCode());
	}

	
	@Test
	public void swaggerSpecificationIsProvided() {
		RequestSpecification request = given()
				.accept("application/json");
		Response r = request.get("swagger.json")
				.andReturn();
		
		assertEquals("Swagger JSON description not found.",
				HttpStatus.SC_OK, r.getStatusCode());
	}
	
	
	@Test
	@Ignore
	public void swaggerSpecificationIsCorrect() {
		RequestSpecification request = given()
				.accept("application/json");
		Response r = request.get("swagger.json")
				.andReturn();
		
		assertEquals("Swagger JSON description not found.",
				HttpStatus.SC_OK, r.getStatusCode());
	}
	
}
