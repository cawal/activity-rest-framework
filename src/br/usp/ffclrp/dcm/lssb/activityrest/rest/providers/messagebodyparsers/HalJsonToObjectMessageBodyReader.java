package br.usp.ffclrp.dcm.lssb.activityrest.rest.providers.messagebodyparsers;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Consumes;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.Provider;

import org.apache.commons.io.IOUtils;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.openapitools.jackson.dataformat.hal.HALMapper;

/**
 * This MessageBodyWriter can be registered in order to provide support for 
 * the representation of the response entities as application/hal+json
 * @author cawal
 */
@Provider
@Consumes("application/hal+json")
public class HalJsonToObjectMessageBodyReader implements MessageBodyReader<Object>{

	/**
	* Do this MessageBodyReader can produce an instance of a particular type?
	* @return true, since it should work for all objects.
	*/
	@Override
	public boolean isReadable(Class<?> type, Type genericType,
			Annotation[] annotations, MediaType mediaType) {
		return true;
	}

	
	/**
	 * Read from the InputStream and deserialize the instance.
	 */
	@Override
	public Object readFrom(Class<Object> type, Type genericType,
			Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, String> httpHeaders,
			InputStream entityStream)
			throws IOException, WebApplicationException {
		
		ObjectMapper halMapper = new HALMapper();
		Object entity = halMapper.readValue(IOUtils.toString(entityStream), type);
		
		return entity;
	}
	
}
