package br.usp.ffclrp.dcm.lssb.activityrest.rest.providers.messagebodyparsers.xml;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.ws.rs.Produces;
import javax.ws.rs.ServerErrorException;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Link;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import br.usp.ffclrp.dcm.lssb.activityrest.rest.providers.messagebodyparsers.xml.representations.JAXBAnalysisActivityRepresentation;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.providers.messagebodyparsers.xml.util.LinkRepresentationToJAXB;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.representations.AnalysisActivityRepresentation;

/**
 * This MessageBodyWriter can be registered in order to provide support for 
 * the representation of the response entities as application/hal+json
 * @author cawal
 */

@Provider
@Produces(MediaType.APPLICATION_XML)
public class ParameterMapXMLMessageBodyWriter implements MessageBodyWriter<Object>{

	/**
	* MessageBodyWriter supports the particular type?
	*/
	@Override
	public boolean isWriteable(Class<?> type, Type genericType,
			Annotation[] annotations, MediaType mediaType) {
		return Map.class.isAssignableFrom(type);
	}

	/**
	* Deprecated by JAX-RS 2.0. Ignored by Jersey.
	*/
	@Override
	public long getSize(Object entity, Class<?> type, Type genericType,
			Annotation[] annotations, MediaType mediaType) {
		// SHOULD return -1
		return -1;
	}

	/**
	 * Converts the object to the media type and writes the HTTP response.
	 */
	@Override
	public void writeTo(Object entity, Class<?> type, Type genericType,
			Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, Object> httpHeaders,
			OutputStream entityStream)
			throws IOException, WebApplicationException {
		// TODO implement 
		// cast the entity
		AnalysisActivityRepresentation analysisActivity = 
				(AnalysisActivityRepresentation) entity;
		
		// creates the binding object
		JAXBAnalysisActivityRepresentation xmlRepresentation = 
				new JAXBAnalysisActivityRepresentation();
		xmlRepresentation.id = analysisActivity.getId();
		xmlRepresentation.state = analysisActivity.getState().toString();
		
		// create link elements from headers
		List<Object> links = 
				Optional.ofNullable(httpHeaders.get("Link"))
				.orElse(Collections.emptyList());
				
		xmlRepresentation.links = links.stream()
				.map(x -> (Link) x)
				.map(LinkRepresentationToJAXB::apply)
				//.map(AnalysisActivityXMLMessageBodyWriter::transformLinkToJaxb)
				.collect(Collectors.toList());
		
		// marshall to XML
		try {
			JAXBContext jaxbContext = 
					JAXBContext.newInstance(JAXBAnalysisActivityRepresentation.class);
			Marshaller marshaler = jaxbContext.createMarshaller();
			marshaler.marshal(xmlRepresentation, entityStream);
			
		} catch (JAXBException e) {
			e.printStackTrace();
			throw  new ServerErrorException(500);
		}
		
	}
	
}
