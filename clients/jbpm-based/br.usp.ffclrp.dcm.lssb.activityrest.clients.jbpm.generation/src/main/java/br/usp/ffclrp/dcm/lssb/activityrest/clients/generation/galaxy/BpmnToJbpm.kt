package br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy

import java.io.File
import javax.xml.transform.stream.StreamSource
import javax.xml.transform.Source
import javax.xml.transform.TransformerFactory
import javax.xml.transform.Transformer
import javax.xml.transform.stream.StreamResult

class BpmnToJbpm {
    
    val xsltUri = "./Bpmn2Jbpm.xslt";
    
    fun transform(bpmnFile : File) : File {
        val result = File.createTempFile("temp-jbpm",".bpmn2")
        val xsltFile = this::class.java.getResourceAsStream(xsltUri); 
        val xslt = StreamSource(xsltFile);
        val bpmn = StreamSource(bpmnFile);

        val factory = TransformerFactory.newInstance();
        val transformer = factory.newTransformer(xslt);
        
        transformer.transform(bpmn, StreamResult(result));
        return result;
    }
    
}