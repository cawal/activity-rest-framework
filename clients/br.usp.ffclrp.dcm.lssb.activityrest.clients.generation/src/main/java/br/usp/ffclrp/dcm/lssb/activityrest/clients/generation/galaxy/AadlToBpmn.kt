import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity
import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.Deployment
import java.io.File
import java.nio.file.Files
import br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy.ModelsService
import br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy.TransformationService
import java.io.FileOutputStream

class AadlToBpmn () {
    fun generateBpmn(activity: Activity, deployment: Deployment): File {
        val activityInStream = ModelsService.writeAADLModelToStream(activity)
        val bpmnFile = File.createTempFile("temp",".bpmn2")
        val bpmnOutStream = FileOutputStream(bpmnFile)
        TransformationService.aadl2bpmn(activityInStream,bpmnOutStream,null)
        
        
        return bpmnFile
    }
    
}