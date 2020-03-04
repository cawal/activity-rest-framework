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
import javax.ws.rs.client.Entity
import javax.ws.rs.core.Response
import br.usp.ffclrp.dcm.lssb.activityrest.client.exceptions.UnexpectedResponseStatus

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

        validate(instance)

        connectToService()

        when (validate(instance)) {
            true -> {
                val createdInstance = createInstanceOnService(instance)
                sendInputs(createdInstance.inputDatasets)
                sendParameters(createdInstance.parameters)
                val readyInstance = updateState(createdInstance)
                System.exit(0)
                val completedInstance = submitForProcessing(readyInstance)
               // waitForProcessingAndReturnState(readyInstance)
                when (completedInstance.state) {
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


    public fun connectToService(): Map<String, URI> {
        val response = restClient
                .target(baseUrl)
                .request(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .get()

        return when (response.getStatus()) {
            200 -> getHateoasControls(response.getLinks())
            else -> throw ServiceUnavailable()
        }
    }


    fun getHateoasControls(links: Set<Link>): Map<String, URI> {
        links.forEach {
            hateoasControls.set(it.getRel(), it.getUri())
        }
        println(hateoasControls)
        return hateoasControls
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

        description.getInputDatasets().map {
            val items = datasets.get(it.getName()) ?: emptyList()

            if (it.getMaximumCardinality().toInt() > 1)
                sendCollectionInputDataset(
                        it.getName(), items)
            else sendSingleFileInputDataset(
                    it.getName(), items)
        }
    }

    fun sendCollectionInputDataset(name: String, items: List<DatasetItem>)
            : Boolean {
        return items.map {
            restClient
                    .target(hateoasControls.get(inputDatasetControlFor(name)))
                    .request(MediaType.APPLICATION_JSON)
                    .accept(MediaType.APPLICATION_JSON)
                    .post(
                            Entity.entity(
                                    it.content,
                                    MediaType.APPLICATION_JSON
                            ))
        }.map {
            getHateoasControls(it.getLinks())
            it.getStatus() in listOf(200, 201)
        }.all { it == true }
    }

    fun inputDatasetControlFor(datasetName: String) = datasetName;

    fun sendSingleFileInputDataset(name: String, items: List<DatasetItem>)
            : Boolean {
        return items.map {
            restClient
                    .target(hateoasControls.get(inputDatasetControlFor(name)))
                    .request(MediaType.APPLICATION_JSON)
                    .accept(MediaType.APPLICATION_JSON)
                    .put(
                            Entity.entity(
                                    it.content,
                                    MediaType.APPLICATION_JSON
                            ))
        }.map {
            getHateoasControls(it.getLinks())
            it.getStatus() in listOf(200, 201)
        }.all { it == true }
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

    private fun sendParameters(parameters: Map<String, Any>): Boolean {
        getParametersHateoasControls()

        return restClient.target(hateoasControls.get("parameters"))
                .request(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .put(Entity.entity(parameters, MediaType.APPLICATION_JSON))
                
                .also { getHateoasControls(it.getLinks()) }
                .let {
                    it.getStatus() in listOf(200, 201)
                }
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
    
    fun updateState(instance : ActivityInstance) : ActivityInstance{
        restClient
                .target(hateoasControls.get("instance"))
                .request(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .get()
        
                .also{ getHateoasControls(it.getLinks())}
        		.also{
                    println(hateoasControls)
                    val serviceInstance = it.readEntity(object : GenericType<ActivityInstance>() {})
                    println(serviceInstance)
                    instance.state = serviceInstance.state
                }.let {
                    return instance
                }
    }
    
    fun submitForProcessing(instance : ActivityInstance) : ActivityInstance {
        restClient
                .target(hateoasControls.get("start-execution"))
                .request(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .post(null)
        
                .also{ getHateoasControls(it.getLinks())}
        		.also{
                    println(hateoasControls)
                    println(it.getStatus())
                    //println(it.getEntity())
                    val serviceInstance = it.readEntity(object : GenericType<ActivityInstance>() {})
                    println(serviceInstance)
                    instance.state = serviceInstance.state
                }.let {
                    return instance
                }
    }

    private fun waitForProcessingAndReturnState(instance: ActivityInstance)
            : ActivityInstance {
        var response : Response;
        do {
            Thread.sleep(500)
            response = restClient
                .target(hateoasControls.get("start-execution"))
                .request(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .get()
        } while (response.getStatus() in listOf(200))
        
        println(response.getEntity())
        
        val serviceInstance = response.readEntity(
                object : GenericType<ActivityInstance>() {})
        //instance.state = serviceInstance.state
        
        if(response.getStatus() == 410){
            instance.state = State.FAILED
            
        } else if (response.getStatus() == 303 ) {
            val location = response.getLocation()
            hateoasControls.put("instance", location)
            instance.state = State.SUCCEEDED
        
        } else {
            throw UnexpectedResponseStatus(response.getStatus().toString())
        }

        
        return instance
    }

    private fun retrieveOutputs(succeededInstance: ActivityInstance): Map<String, List<DatasetItem>> {
        //description.getOutputDatasets()
        return emptyMap()
    }

    private fun retrieveErrorLog(suceededInstance: ActivityInstance): String {
        return ""
    }


}