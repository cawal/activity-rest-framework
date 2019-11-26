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


        val bpmn = AadlToBpmn().generateBpmn(activity)
        val jBpm = BpmnToJbpm().transform(bpmn)
        val xmlWrapper = AadlToGalaxyToolWrapper().generate(activity,deployment)
        val javaProject = JavaProject(
                JavaProjectGenerator().generate(activity, deployment)
        )

        javaProject.combineArtifacts(bpmn, jBpm, xmlWrapper)

        return javaProject.directory
    }


}

class JavaProject(val directory: File) {
    fun combineArtifacts( bpmn: File, jbpmn: File, xmlWrapper: File) {
        addBpmnFileToProject(bpmn)
        addJbpmFileToProject(jbpmn)
        addXmlWrapperToProject(xmlWrapper)
    }


    fun addBpmnFileToProject(bpmn: File) {
        bpmn.renameTo(File(directory,"activity.bpmn2"))
    }

    fun addJbpmFileToProject(jbpm: File) {
    	jbpm.renameTo(File(directory,"src/main/resources/activity-jbpm.bpmn2"))
    }

    fun addXmlWrapperToProject(xmlWrapper: File) {
        xmlWrapper.renameTo(File(directory, "galaxy/tool.xml"))
    }

}