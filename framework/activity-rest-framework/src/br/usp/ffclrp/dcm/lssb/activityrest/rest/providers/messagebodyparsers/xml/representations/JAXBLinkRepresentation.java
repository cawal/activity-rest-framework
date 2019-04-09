package br.usp.ffclrp.dcm.lssb.activityrest.rest.providers.messagebodyparsers.xml.representations;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "link",
namespace = "http://kode.ffclrp.usp.br:8080/david-chart-report/xsd")
public class JAXBLinkRepresentation {
	
	@XmlAttribute
	public String rel;

	@XmlAttribute
	public String href;

	@XmlAttribute(required=false)
	public String method;
		
}
