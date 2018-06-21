package br.usp.ffclrp.dcm.lssb.activityrest.rest.providers.messagebodyparsers.xml;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import javax.ws.rs.Produces;
import javax.ws.rs.ServerErrorException;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import br.usp.ffclrp.dcm.lssb.activityrest.rest.providers.messagebodyparsers.xml.representations.JAXBFileRepresentation;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.representations.FileRepresentation;

/**
 * 
 * 
 * @author cawal
 */

@Provider
@Produces(MediaType.APPLICATION_XML)
public class FileRepresentationXMLMessageBodyWriter
		implements MessageBodyWriter<Object> {
	
	/**
	 * MessageBodyWriter supports the particular type?
	 */
	@Override
	public boolean isWriteable(Class<?> type, Type genericType,
			Annotation[] annotations, MediaType mediaType) {
		return FileRepresentation.class.isAssignableFrom(type);
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
		
		// cast the entity
		FileRepresentation fileRepresentation =
				(FileRepresentation) entity;
		
		// creates the binding object
		JAXBFileRepresentation xmlRepresentation =
				new JAXBFileRepresentation();
		xmlRepresentation.name = fileRepresentation.getName();
		xmlRepresentation.content = fileRepresentation.getContent();
		xmlRepresentation.contentType = fileRepresentation.getContentType();
		
		// create link elements from headers
		//List<Object> links =
		//		Optional.ofNullable(httpHeaders.get("Link"))
		//				.orElse(Collections.emptyList());
		
		// xmlRepresentation.links = links.stream()
		// .map(x -> (Link) x)
		// .map(LinkRepresentationToJAXB::apply)
		// .collect(Collectors.toList());
		
		// marshall to XML
		try {
			JAXBContext jaxbContext =
					JAXBContext.newInstance(JAXBFileRepresentation.class);
			Marshaller marshaler = jaxbContext.createMarshaller();
			marshaler.marshal(xmlRepresentation, entityStream);
			
		} catch (JAXBException e) {
			e.printStackTrace();
			throw new ServerErrorException(500);
		}
		
	}
	
}
