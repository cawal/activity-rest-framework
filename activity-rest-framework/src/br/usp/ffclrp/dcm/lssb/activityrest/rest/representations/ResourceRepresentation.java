package br.usp.ffclrp.dcm.lssb.activityrest.rest.representations;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Link;


/**
 * A RESTful resource representation may
 * provide links for other related resources.
 * These links are represented by javax.ws.rs.core.Link.
 * @see javax.ws.rs.core.Link
 * @author cawal
 */
public abstract class ResourceRepresentation {
	protected List<Link> links;
	
	public ResourceRepresentation() {
		links = new ArrayList<Link>();
	}
	
	public void setLinks(List<Link> links) {
		this.links = links;
	}
	
	public List<Link> getLinks(){
		return links;
	}
}
