import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity
import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.Deployment
import java.io.File
import java.nio.file.Files

class AadlToBpmn () {
    fun generateBpmn(activity: Activity, deployment: Deployment): File {
        return File.createTempFile("temp",".bpmn2")
    }
    
}