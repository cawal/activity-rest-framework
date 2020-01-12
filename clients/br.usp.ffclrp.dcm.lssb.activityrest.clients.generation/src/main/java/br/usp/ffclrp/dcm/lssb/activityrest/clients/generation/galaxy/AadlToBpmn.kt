import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity
import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.Deployment
import java.io.File
import java.nio.file.Files
import br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy.ModelsService
import br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy.TransformationService
import java.io.FileOutputStream
import org.eclipse.emf.common.util.URI as EmfUri

class AadlToBpmn () {
    fun generateBpmn(activity: Activity): File {
        val activityInStream = ModelsService.writeAADLModelToStream(activity)
        val bpmnXmiFile = File.createTempFile("temp-xmi-",".bpmn2")
        val bpmnOutStream = FileOutputStream(bpmnXmiFile)
        TransformationService.aadl2bpmn(activityInStream,bpmnOutStream,null)
        
        val bpmnFile = File.createTempFile("bpmn",".bpmn2") 
        val bpmnObject = ModelsService.retrieveBpmnFromXmi(
                EmfUri.createFileURI(bpmnXmiFile.getAbsolutePath())
        )
        val filePath = bpmnFile.getAbsolutePath()

        ModelsService.writeBpmn2Model(bpmnObject,
               filePath) 

        print(bpmnFile)
        return bpmnFile
    }
}