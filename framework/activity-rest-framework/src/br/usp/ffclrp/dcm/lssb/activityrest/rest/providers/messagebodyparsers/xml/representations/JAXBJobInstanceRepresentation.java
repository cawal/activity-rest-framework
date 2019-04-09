package br.usp.ffclrp.dcm.lssb.activityrest.rest.providers.messagebodyparsers.xml.representations;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "job-instance",
namespace = "http://kode.ffclrp.usp.br:8080/david-chart-report/xsd")
public class JAXBJobInstanceRepresentation {
	@XmlAttribute
	public String id;
	@XmlAttribute
	public String state;
	@XmlElement(name="error-report")
	public String errorReport;
	
	@XmlElementWrapper(name="links",namespace="http://kode.ffclrp.usp.br:8080/david-chart-report/xsd")
	@XmlElement(name="link", required=false, namespace="http://kode.ffclrp.usp.br:8080/david-chart-report/xsd")
	public List<JAXBLinkRepresentation> links = new ArrayList<>();
}
