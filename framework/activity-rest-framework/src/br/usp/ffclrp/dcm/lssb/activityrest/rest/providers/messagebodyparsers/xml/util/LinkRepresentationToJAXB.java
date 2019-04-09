package br.usp.ffclrp.dcm.lssb.activityrest.rest.providers.messagebodyparsers.xml.util;

import javax.ws.rs.core.Link;

import br.usp.ffclrp.dcm.lssb.activityrest.rest.providers.messagebodyparsers.xml.representations.JAXBLinkRepresentation;


public class LinkRepresentationToJAXB {
	
	/**
	 * Receives a Link instance (JAX-RS) and return  a JAXB bounded object.
	 * @param link the Link instance
	 * @return A object JAXB can marshall
	 */
	public static JAXBLinkRepresentation apply(Link link) {
		return new JAXBLinkRepresentation() {{
			this.href = link.getUri().toString();
			this.rel = link.getRel();
			this.method = link.getType();
		}};
	}
	
}
