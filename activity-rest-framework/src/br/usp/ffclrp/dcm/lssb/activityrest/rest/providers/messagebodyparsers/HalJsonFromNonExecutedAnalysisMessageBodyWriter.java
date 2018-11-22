package br.usp.ffclrp.dcm.lssb.activityrest.rest.providers.messagebodyparsers;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.usp.ffclrp.dcm.lssb.activityrest.domain.*;
import io.openapitools.jackson.dataformat.hal.HALLink;
import io.openapitools.jackson.dataformat.hal.HALMapper;

/**
 * This MessageBodyWriter can be registered in order to provide support for 
 * the representation of the response entities as application/hal+json
 * @author cawal
 */

@Provider
@Produces("application/hal+json")
public class HalJsonFromNonExecutedAnalysisMessageBodyWriter implements MessageBodyWriter<Object>{

	/**
	* MessageBodyWriter supports the particular type?
	*/
	@Override
	public boolean isWriteable(Class<?> type, Type genericType,
			Annotation[] annotations, MediaType mediaType) {
		return type.isAssignableFrom(AnalysisActivity.class);
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
		
		
/*		this.self = new HALLink.Builder(analysisBaseUri).build();
		this.parameters = new HALLink.Builder(
				UriBuilder.fromUri(analysisBaseUri)
					.path("/parameters")
					.build(aa.getId())
				).build();
		*/
		ObjectMapper mapper = new HALMapper(); // create once, reuse
		String halJson = mapper.writeValueAsString(entity);
		
		entityStream.write(halJson.getBytes());
	}
	
}
