package br.usp.ffclrp.dcm.lssb.activityrest.rest.providers.messagebodyparsers.xml;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

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

import br.usp.ffclrp.dcm.lssb.activityrest.rest.representations.AnalysisActivityRepresentation;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity;

/**
 * This MessageBodyWriter can be registered in order to provide support for 
 * the representation of the response entities as application/hal+json
 * @author cawal
 */

@Provider
@Produces(MediaType.APPLICATION_XML)
public class AnalysisActivityXMLMessageBodyWriter implements MessageBodyWriter<Object>{

	/**
	* MessageBodyWriter supports the particular type?
	*/
	@Override
	public boolean isWriteable(Class<?> type, Type genericType,
			Annotation[] annotations, MediaType mediaType) {
		return AnalysisActivityRepresentation.class.isAssignableFrom(type);
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
		// TODO implement writeTo()
		JAXBAnalysisActivityRepresentation xmlRepresentation = 
				new JAXBAnalysisActivityRepresentation();
		AnalysisActivityRepresentation analysisActivity = 
				(AnalysisActivityRepresentation) entity;
		xmlRepresentation.id = analysisActivity.getId();
		xmlRepresentation.state = analysisActivity.getState().toString();
		
		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(JAXBAnalysisActivityRepresentation.class);
			Marshaller marshaler = jaxbContext.createMarshaller();
			
			marshaler.marshal(xmlRepresentation, entityStream);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw  new ServerErrorException(500);
		}
		
		//entityStream.write(halJson.getBytes());
	}
	
}
