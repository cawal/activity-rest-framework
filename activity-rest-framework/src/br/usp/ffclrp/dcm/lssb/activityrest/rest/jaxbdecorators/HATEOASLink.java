package br.usp.ffclrp.dcm.lssb.activityrest.rest.jaxbdecorators;
import java.net.URI;

import javax.ws.rs.core.Link;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.sun.research.ws.wadl.HTTPMethods;

/**
 * Representation of a link for signaling HATEOAS relations.
 * @author cawal
 *
 */
@Deprecated
@XmlRootElement
public class HATEOASLink {
	public URI uri;
	public String relation;
	public HTTPMethods method;
	
	
	public HATEOASLink() {
		
	}
	
	public HATEOASLink(URI uri,String rel,HTTPMethods method) {
		this.uri = uri;
		this.relation = rel;
		this.method = method;
	}
	
	public HATEOASLink(Link link) {
		this.relation = link.getRel();
		//this.method = HTTPMethods.fromValue(link.getType());
		this.uri = link.getUri();
	}

	/**
	 * @return the uri
	 */
	public URI getUri() {
		return uri;
	}

	/**
	 * @param uri the uri to set
	 */
	public void setUri(URI uri) {
		this.uri = uri;
	}

	/**
	 * @return the rel
	 */
	@XmlAttribute(name = "rel")
	public String getRelation() {
		return relation;
	}

	/**
	 * @param rel the rel to set
	 */
	public void setRelation(String rel) {
		this.relation = rel;
	}

	/**
	 * @return the method
	 */
	public HTTPMethods getMethod() {
		return method;
	}

	/**
	 * @param method the method to set
	 */
	public void setMethod(HTTPMethods method) {
		this.method = method;
	}
	
	
}
