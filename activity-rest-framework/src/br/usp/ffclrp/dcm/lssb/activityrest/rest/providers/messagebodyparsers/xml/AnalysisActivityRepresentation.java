package br.usp.ffclrp.dcm.lssb.activityrest.rest.providers.messagebodyparsers.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="AnalysisActivity")
public class AnalysisActivityRepresentation {
	
	@XmlAttribute
	String id;
	
	@XmlAttribute
	String state;
	
	
}
