package br.usp.ffclrp.dcm.lssb.activityrest.rest.providers.messagebodyparsers.xml.representations;

import java.io.InputStream;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement(name = "file",
		namespace = "http://kode.ffclrp.usp.br:8080/david-chart-report/xsd")
public class JAXBFileRepresentation {
	
	@XmlElement(nillable = true)
	public String name;
	
	@XmlElement(name="content-type")
	public String contentType;
	
	@XmlElement(required = true)
	public String content;
}
