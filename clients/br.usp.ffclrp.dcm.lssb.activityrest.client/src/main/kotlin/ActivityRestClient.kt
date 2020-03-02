package br.usp.ffclrp.dcm.lssb.activityrest.client

import java.net.URI
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity
import br.usp.ffclrp.dcm.lssb.activityrest.domain.ActivityInstance
import br.usp.ffclrp.dcm.lssb.activityrest.domain.ActivityInstanceState as State
import br.usp.ffclrp.dcm.lssb.activityrest.domain.DatasetItem

class ActivityRestClient(
        val baseUrl: URI,
        val description: Activity
) {

    fun execute(instance: ActivityInstance): ActivityInstance {
        return when (validate(instance)) {
            true -> {
                instance.id = createInstanceOnService()
                sendInputs(instance.inputDatasets)
                sendParameters(instance.parameters)
                val endState = waitForProcessingAndReturnState(instance)
                when (endState) {
                    State.SUCCEEDED -> {
                        instance.outputDatasets = retrieveOutputs()
                    }
                    State.FAILED -> {
                        instance.errorReport = retrieveErrorLog()
                    }
                    else -> {
                    }
                }

                return instance
            }
            false -> {
                instance.state = State.FAILED
                instance.errorReport = """
            	{
                	"error": "Invalid inputs or parameters. Check the activity description."
            	}
                """.trimMargin()
            	return instance
            }
        }
    }

    private fun validate(instance: ActivityInstance): Boolean {
        return false
    }

    private fun createInstanceOnServer() : String {
        var id : String = ""
        
        return id
    }
    
    private fun sendInputs(datasets: Map<String, List<DatasetItem>>) {
        description.inputDatasets

    }

    private fun sendParameters(parameters: Map<String, Any>) {
    	description.getParameters()
    }

    private fun waitForProcessingAndReturnState(instance: ActivityInstance)
            : State {
        return State.FAILED
    }

    private fun retrieveOutputs(): Map<String, List<DatasetItem>> {
        description.getOutputDatasets()
    	return emptyMap()
    }

    private fun retrieveErrorLog(): String {
        return ""
    }


}