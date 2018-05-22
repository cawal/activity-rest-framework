package br.usp.ffclrp.dcm.lssb.activityrest.rest.providers.messagebodyparsers.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="AnalysisActivity")
class AnalysisActivityRepresentation {
	
	@XmlAttribute
	public String id;
	
	@XmlAttribute
	public String state;
	
	
}
