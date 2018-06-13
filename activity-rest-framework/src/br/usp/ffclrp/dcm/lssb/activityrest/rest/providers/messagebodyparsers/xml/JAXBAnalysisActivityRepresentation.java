package br.usp.ffclrp.dcm.lssb.activityrest.rest.providers.messagebodyparsers.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement(name="AnalysisActivity", namespace="http://dcm.fflclrp.usp.br/lssb/activity-rest/")
@XmlRootElement(name = "AnalysisActivity",
		namespace = "http://kode.ffclrp.usp.br:8080/david-chart-report/xsd")
class JAXBAnalysisActivityRepresentation {
	
	@XmlAttribute
	public String id;
	
	@XmlAttribute
	public String state;
	
}
