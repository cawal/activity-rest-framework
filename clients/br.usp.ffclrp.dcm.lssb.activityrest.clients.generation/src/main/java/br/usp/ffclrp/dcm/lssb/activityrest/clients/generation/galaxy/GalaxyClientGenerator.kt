package br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy

import br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.ClientGenerator
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity
import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.Deployment
import java.io.File
import java.nio.file.Files
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.util.AnalysisActivityDescriptionAdapterFactory
import AadlToBpmn
import br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy.BpmnToJbpm
import br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy.AadlToGalaxyToolWrapper
import br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy.JavaProjectGenerator

class GalaxyClientGenerator : ClientGenerator {
    
    override fun generateClient(activity: Activity, deployment: Deployment): File {
        
        val tempDirectory = createTempDir()
        
        val bpmn = AadlToBpmn().generateBpmn(activity)
        val jBpm = BpmnToJbpm().transform(bpmn)
        val xmlWrapper = AadlToGalaxyToolWrapper().generate(activity)
        val javaProject = JavaProjectGenerator().generate(activity,deployment)
        
        combineArtifacts(javaProject,bpmn,jBpm,xmlWrapper)
        
        return tempDirectory
    }
    
    
    fun combineArtifacts(project : File, bpmn : File, jbpmn : File, xmlWrapper : File){
        addBpmnFileToProject(project,bpmn)
        addJbpmFileToProject(project,jbpmn)
        addXmlWrapperToProject(project,xmlWrapper)
    }
    
    fun addBpmnFileToProject(project : File, bpmn : File){
    }
    
    fun addJbpmFileToProject(project : File, jbpm : File){
    }
    
    fun addXmlWrapperToProject(project : File, xmlWrapper : File){
        xmlWrapper.renameTo(File(project,"tool.xml"))
    }
}
