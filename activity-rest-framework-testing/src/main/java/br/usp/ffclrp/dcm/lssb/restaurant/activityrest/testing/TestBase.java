package br.usp.ffclrp.dcm.lssb.restaurant.activityrest.testing;


import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.sun.research.ws.wadl.HTTPMethods;

import br.usp.ffclrp.dcm.lssb.activityrest.rest.jaxbdecorators.HATEOASLink;
import io.restassured.RestAssured;
import io.restassured.http.Header;
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
	
	public List<HATEOASLink> processHeadersForLinks(Headers headers) {
		ArrayList<HATEOASLink> list = new ArrayList<HATEOASLink>();
		
		for (Header h : headers.asList()) {
			if (h.getName().equalsIgnoreCase("Link")) {
				String value = h.getValue();
				
				URI uri = getLinkURI(value);
				HTTPMethods method = getLinkMethod(value);
				String rel = getLinkRelation(value);
				
				list.add(new HATEOASLink(uri, rel, method));
				
			}
			
		}
		
		return list;
	}
	
	private String getLinkRelation(String value) {
		Pattern p = Pattern.compile("rel=\"([^\"]+)\""); // the pattern to
		// search for
		Matcher m = p.matcher(value);
		
		// if we find a match, get the group
		if (m.find()) {
			// we're only looking for one group, so get it
			String rel = m.group(1);
			
			return rel;
			
		}
		return null;
	}
	
	private HTTPMethods getLinkMethod(String value) {
		Pattern p = Pattern.compile("type=\"([^\"]+)\""); // the pattern to
															// search for
		Matcher m = p.matcher(value);
		
		// if we find a match, get the group
		if (m.find()) {
			// we're only looking for one group, so get it
			String method = m.group(1);
			
			return HTTPMethods.fromValue(method);
			
		}
		return null;
	}
	
	private URI getLinkURI(String value) {
		Pattern p = Pattern.compile("<([^>]+)>"); // the pattern to search for
		Matcher m = p.matcher(value);
		
		// if we find a match, get the group
		if (m.find()) {
			// we're only looking for one group, so get it
			String uri = m.group(1);
			try {
				return new URI(uri);
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}
		return null;
	}
	
}
