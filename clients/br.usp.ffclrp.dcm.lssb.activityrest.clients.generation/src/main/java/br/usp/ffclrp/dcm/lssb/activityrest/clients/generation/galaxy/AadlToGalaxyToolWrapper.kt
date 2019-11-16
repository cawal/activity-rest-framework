package br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity
import java.io.File

class AadlToGalaxyToolWrapper {
    
    fun generate(activity : Activity) : File {
        val toolWrapper = File.createTempFile("tool",".xml")
        val xmlWrapper = createXml(activity)
       
        toolWrapper.writeText(xmlWrapper,Charsets.UTF_8)

        return toolWrapper;
    }
    
    fun createXml(activity : Activity) =
    """
    |<?xml version="1.0"?>
    |<tool>
    |</tool>
    """.trimMargin();
    
}