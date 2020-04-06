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


    override fun generateClient(activity: Activity, deployment: Deployment)
            : File {

        val xmlWrapper = AadlToGalaxyToolWrapper().generate(activity,deployment)
        val javaProject = JavaProject(
                JavaProjectGenerator().generate(activity, deployment)
        )

        javaProject.combineArtifacts(xmlWrapper)

        return javaProject.directory
    }


}

class JavaProject(val directory: File) {
    fun combineArtifacts( xmlWrapper: File) {
        addXmlWrapperToProject(xmlWrapper)
    }

    fun addXmlWrapperToProject(xmlWrapper: File) {
        xmlWrapper.renameTo(File(directory, "galaxy/tool.xml"))
    }

}
