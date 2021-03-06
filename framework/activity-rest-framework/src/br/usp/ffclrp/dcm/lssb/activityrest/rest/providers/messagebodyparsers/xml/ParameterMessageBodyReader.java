package br.usp.ffclrp.dcm.lssb.activityrest.rest.providers.messagebodyparsers.xml;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.Consumes;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.Provider;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import br.usp.ffclrp.dcm.lssb.activityrest.rest.representations.ParameterRepresentation;

/**
 * This MessageBodyWriter can be registered in order to provide support for
 * the representation of the response entities as application/hal+json
 * 
 * @author cawal
 */
@Provider
@Consumes(MediaType.APPLICATION_XML)
public class ParameterMessageBodyReader implements MessageBodyReader<Object> {
	
	/**
	 * Do this MessageBodyReader can produce an instance of a particular type?
	 * 
	 * @return true, since it should work for all objects.
	 */
	@Override
	public boolean isReadable(Class<?> type, Type genericType,
			Annotation[] annotations, MediaType mediaType) {
		return type == ParameterRepresentation.class;
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
		
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(entityStream);
			doc.getDocumentElement().normalize();
			List<Object> valueList = new ArrayList<>();
			ParameterRepresentation entity = new ParameterRepresentation(
					doc.getDocumentElement().getNodeName(),valueList);
	
			
			NodeList nList = doc.getElementsByTagName("value");
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					String textContent = eElement.getTextContent();
					valueList.add(textContent);
				} else if (nNode.getNodeType() == Node.COMMENT_NODE) {
				}
			}
			

			return entity;
			
		} catch (ParserConfigurationException | SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new BadRequestException();
		}
		
	}
	
}
