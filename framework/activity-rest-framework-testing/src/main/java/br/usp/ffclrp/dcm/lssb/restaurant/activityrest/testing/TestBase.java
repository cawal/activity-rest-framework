package br.usp.ffclrp.dcm.lssb.restaurant.activityrest.testing;


import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

import javax.ws.rs.core.Link;

import io.restassured.RestAssured;
import io.restassured.http.Headers;

public class TestBase {
	
	public static final int MAX_TIME_TO_JOB_COMPLETION = 60;
	public static final String NEW_ANALYSES_URI_FRAGMENT = "new-analyses/";
	public static final String JOB_MANAGER_URI_FRAGMENT = "instances/";
	
	/**
	 * 
	 * @param configFileIS A InputStream for the configuration file (.properties).
	 * @throws Exception
	 */
	public static void setUpRestAssured(InputStream configFileIS) throws Exception {
		
		Properties properties = new Properties();
		properties.load(configFileIS);
		
		String port = System.getProperty("service.port");
		if (port == null) {
			RestAssured.port =
					Integer.valueOf(properties.getProperty("service.port"));
		} else {
			RestAssured.port = Integer.valueOf(port);
		}
		
		String basePath = System.getProperty("service.base");
		if (basePath == null) {
			basePath = properties.getProperty("service.base");
		}
		RestAssured.basePath = basePath;
		
		String baseHost = System.getProperty("service.host");
		if (baseHost == null) {
			baseHost = properties.getProperty("service.host");
		}
		RestAssured.baseURI = baseHost;
	}
	
	/**
	 * Return the links in a HTTP Header (RESTAssured)
	 * @param headers
	 * @return
	 */
	public List<Link> processHeadersForLinks(Headers headers) {
		return headers.asList().stream()
			.filter(h -> h.getName().equalsIgnoreCase("Link"))
			.map(h -> Link.valueOf(h.getValue()))
			.collect(Collectors.toList());
	}
	
}
