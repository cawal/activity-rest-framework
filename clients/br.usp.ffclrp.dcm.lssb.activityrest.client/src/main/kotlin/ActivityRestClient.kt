package br.usp.ffclrp.dcm.lssb.activityrest.client

import java.net.URI
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity
import br.usp.ffclrp.dcm.lssb.activityrest.domain.ActivityInstance
import br.usp.ffclrp.dcm.lssb.activityrest.domain.ActivityInstanceState as State
import br.usp.ffclrp.dcm.lssb.activityrest.domain.DatasetItem
import javax.ws.rs.client.Client
import javax.ws.rs.client.ClientBuilder
import org.glassfish.jersey.client.ClientConfig
import org.glassfish.jersey.jackson.internal.jackson.jaxrs.json.JacksonJsonProvider
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.GenericType
import br.usp.ffclrp.dcm.lssb.activityrest.client.exceptions.ActivityCannotBeCreated
import sun.security.provider.certpath.OCSPResponse.ResponseStatus
import br.usp.ffclrp.dcm.lssb.activityrest.client.exceptions.ServiceUnavailable
import javax.ws.rs.core.Link

class ActivityRestClient(
        val baseUrl: URI,
        val description: Activity
) {

    val restClient: Client = ClientBuilder.newClient(
            ClientConfig(JacksonJsonProvider::class.java)
    )
    val target = restClient.target(baseUrl)
    val hateoasControls = HashMap<String, URI>()


    fun execute(instance: ActivityInstance): ActivityInstance {

        hateoasControls.clear()

        connectToService()

        return when (validate(instance)) {
            true -> {
                val createdInstance = createInstanceOnService(instance)
                sendInputs(createdInstance.inputDatasets)
                sendParameters(createdInstance.parameters)
                val endState = waitForProcessingAndReturnState(createdInstance)
                when (endState) {
                    State.SUCCEEDED -> {
                        instance.outputDatasets = retrieveOutputs(createdInstance)
                    }
                    State.FAILED -> {
                        instance.errorReport = retrieveErrorLog(createdInstance)
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
        return true
    }


    public fun connectToService() {
        val response = restClient
                .target(baseUrl)
                .request(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .get()

        when (response.getStatus()) {
            200 -> getHateoasControls(response.getLinks())
            else -> throw ServiceUnavailable()
        }
    }


    fun getHateoasControls(links: Set<Link>) {
        links.forEach {
            hateoasControls.set(it.getRel(), it.getUri())
        }
        println(hateoasControls)
    }


    public fun createInstanceOnService(instance: ActivityInstance)
            : ActivityInstance {

        val response = restClient
                .target(hateoasControls.get("create-instance"))
                .request(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .post(null)

        if (response.getStatus() in listOf(200, 201)) {

            val location = response.getLocation()
            hateoasControls.put("instance", location)
            getHateoasControls(response.getLinks())

            val entity = response.readEntity(
                    object : GenericType<ActivityInstance>() {})
            val activityId = entity.id

            instance.id = activityId

            val instanceResponse = restClient
                    .target(hateoasControls.get("instance"))
                    .request(MediaType.APPLICATION_JSON)
                    .accept(MediaType.APPLICATION_JSON)
                    .get()
            getHateoasControls(instanceResponse.getLinks())

            println(hateoasControls)

            return instance
        } else {
            throw ActivityCannotBeCreated()
        }
    }


    private fun sendInputs(datasets: Map<String, List<DatasetItem>>) {
        getInputDatasetsHateoasControls()
        TODO
        // description.getInputDatasets()

    }

    fun getInputDatasetsHateoasControls() {
        val inputsResourceResponse = restClient
                .target(hateoasControls.get("inputs"))
                .request(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .get()
        getHateoasControls(inputsResourceResponse.getLinks())
        
        println(hateoasControls)
    }

    private fun sendParameters(parameters: Map<String, Any>) {
        getParametersHateoasControls()
        
        
        // description.getParameters()
    }

    fun getParametersHateoasControls() {
        val parameterResourceResponse = restClient
                .target(hateoasControls.get("parameters"))
                .request(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .get()
        getHateoasControls(parameterResourceResponse.getLinks())
        
        println(hateoasControls)
    }

    private fun waitForProcessingAndReturnState(instance: ActivityInstance)
            : State {
        return State.FAILED
    }

    private fun retrieveOutputs(succeededInstance: ActivityInstance): Map<String, List<DatasetItem>> {
        //description.getOutputDatasets()
        return emptyMap()
    }

    private fun retrieveErrorLog(suceededInstance: ActivityInstance): String {
        return ""
    }


}