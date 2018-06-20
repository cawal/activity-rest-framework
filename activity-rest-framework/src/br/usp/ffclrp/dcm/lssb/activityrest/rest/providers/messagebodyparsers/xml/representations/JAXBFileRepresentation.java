package br.usp.ffclrp.dcm.lssb.activityrest.rest.providers.messagebodyparsers.xml.representations;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "file",
		namespace = "http://kode.ffclrp.usp.br:8080/david-chart-report/xsd")
public class JAXBFileRepresentation {
	
	@XmlElement(nillable = true)
	private String name;
	
	@XmlElement(required = true)
	private byte[] content;
}
