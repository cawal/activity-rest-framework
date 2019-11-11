package org.br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy

import org.br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.ClientGenerator
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity
import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.Deployment
import java.io.File
import java.nio.file.Files
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.util.AnalysisActivityDescriptionAdapterFactory

class GalaxyClientGenerator : ClientGenerator {
    override fun generateClient(activity: Activity, deployment: Deployment): File {
        val tempDirectory = createTempDir();
        
        val bpmn = generateBpmn(activity,deployment)
        val xmlWrapper = generateXmlWrapper(activity)
        val javaProject = generateJavaProject(activity,deployment)
        
        combineArtifacts(javaProject,bpmn,xmlWrapper)
        
        return tempDirectory;
    }
    
    fun generateJavaProject(activity: Activity, deployment: Deployment): File{
        TODO()
    }
    
    fun generateXmlWrapper(activity: Activity) : File {
        TODO()
    }
    
    fun combineArtifacts(project : File, bpmn : File, xmlWrapper : File){
        TODO()
    }
    
}