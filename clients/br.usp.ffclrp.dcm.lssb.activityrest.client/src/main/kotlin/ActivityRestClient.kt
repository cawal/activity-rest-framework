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
import org.glassfish.jersey.client.ClientProperties
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.OutputDataset
import br.usp.ffclrp.dcm.lssb.activityrest.domain.DatasetContent
import br.usp.ffclrp.dcm.lssb.activityrest.client.exceptions.InstanceExecutionFailed
import br.usp.ffclrp.dcm.lssb.activityrest.client.exceptions.InvalidActivityInstance

typealias HateoasControls = MutableMap<String,URI>

class ActivityRestClient(
        val baseUrl: URI,
        val description: Activity
) {

    val restClient: Client = ClientBuilder.newBuilder()
            .property(ClientProperties.FOLLOW_REDIRECTS, false)
            .register(JacksonJsonProvider::class.java)
            .build()

    val target = restClient.target(baseUrl)


    fun execute(instance: ActivityInstance): ActivityInstance {

        validate(instance)
        
        val hateoasControls = connectToService()


        when (validate(instance)) {
            true -> {
                val createdInstance =
                        createInstanceOnService(instance, hateoasControls)

                sendInputs(createdInstance.inputDatasets, hateoasControls)
                sendParameters(createdInstance.parameters, hateoasControls)

                val readyInstance =
                        updateInstance(createdInstance, hateoasControls)
                val runningInstance =
                        submitForProcessing(readyInstance, hateoasControls)

                waitForProcessingAndReturnState(runningInstance, hateoasControls)

                val completedInstance =
                        updateInstance(runningInstance, hateoasControls)
                when (completedInstance.state) {
                    State.SUCCEEDED -> {
                        println("SUCCEEDED! =)")
                        instance.outputDatasets =
                                retrieveOutputs(createdInstance, hateoasControls)
                    }
                    State.FAILED -> {
                        println("FAILED! =(")
                        instance.errorReport =
                                retrieveErrorLog(createdInstance, hateoasControls)
                    }
                    else -> {
                    }
                }

                return instance
            }
            false -> {
                throw InvalidActivityInstance()
            }
        }
    }


    private fun validate(instance: ActivityInstance): Boolean {
        return validParameters(instance)
                && validInputDatasets(instance)
    }

    private fun validParameters(instance: ActivityInstance) = true;

    private fun validInputDatasets(instance: ActivityInstance) = true;

    public fun connectToService(): HateoasControls {
        val response = restClient
                .target(baseUrl)
                .request(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .get()

        return when (response.getStatus()) {
            200 -> getHateoasControls(response.getLinks(),HashMap<String,URI>())
            else -> throw ServiceUnavailable()
        }
    }


    fun getHateoasControls(links: Set<Link>,
                           hateoasControls: HateoasControls)
            : HateoasControls {
        links.forEach {
            hateoasControls.set(it.getRel(), it.getUri())
        }
        println(hateoasControls)
        return hateoasControls
    }


    public fun createInstanceOnService(instance: ActivityInstance,
                                       hateoasControls: HateoasControls)
            : ActivityInstance {

        val response = restClient
                .target(hateoasControls.get("create-instance"))
                .request(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .post(null)

        if (response.getStatus() in listOf(200, 201)) {

            val location = response.getLocation()
            hateoasControls.put("instance", location)
            getHateoasControls(response.getLinks(),hateoasControls)

            updateInstance(instance,hateoasControls)

            println(hateoasControls)

            return instance
        } else {
            throw ActivityCannotBeCreated()
        }
    }


    private fun sendInputs(datasets: Map<String, List<DatasetItem>>,
                           hateoasControls: HateoasControls): Boolean {
        getInputDatasetsHateoasControls(hateoasControls)

        return description.getInputDatasets().map {
            val items = datasets.get(it.getName()) ?: emptyList()

            if (it.getMaximumCardinality().toInt() > 1)
                sendCollectionInputDataset(
                        it.getName(), items,hateoasControls)
            else sendSingleFileInputDataset(
                    it.getName(), items,hateoasControls)
        }.all { it == true }
    }

    fun sendCollectionInputDataset(name: String, items: List<DatasetItem>,
                                   hateoasControls: HateoasControls)
            : Boolean {
        println("collection file dataset")
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
            getHateoasControls(it.getLinks(),hateoasControls)
            it.getStatus() in listOf(200, 201)
        }.all { it == true }
    }

    fun inputDatasetControlFor(datasetName: String) = datasetName;

    fun sendSingleFileInputDataset(name: String, items: List<DatasetItem>,
                                   hateoasControls: HateoasControls)
            : Boolean {
        println(items)
        println("single file dataset")
        return items.map {
            println("single file dataset")
            println(it)
            restClient
                    .target(hateoasControls.get(inputDatasetControlFor(name)))
                    .request(MediaType.APPLICATION_JSON)
                    .accept(MediaType.APPLICATION_JSON)
                    .put(
                            Entity.entity(
                                    it.content.content,
                                    MediaType.APPLICATION_JSON
                            ))
        }.map {
            getHateoasControls(it.getLinks(),hateoasControls)
            it.getStatus() in listOf(200, 201)
        }.all { it == true }
    }

    fun getInputDatasetsHateoasControls(hateoasControls: HateoasControls) {
        val inputsResourceResponse = restClient
                .target(hateoasControls.get("inputs"))
                .request(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .get()
        getHateoasControls(inputsResourceResponse.getLinks(),hateoasControls)

        println(hateoasControls)
    }

    private fun sendParameters(parameters: Map<String, Any>,
                               hateoasControls: HateoasControls): Boolean {
        getParametersHateoasControls(hateoasControls)

        return restClient.target(hateoasControls.get("parameters"))
                .request(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .put(Entity.entity(parameters, MediaType.APPLICATION_JSON))

                .also { getHateoasControls(it.getLinks(),hateoasControls) }
                .let {
                    it.getStatus() in listOf(200, 201)
                }
    }

    fun getParametersHateoasControls(hateoasControls: HateoasControls) {
        val parameterResourceResponse = restClient
                .target(hateoasControls.get("parameters"))
                .request(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .get()
        getHateoasControls(parameterResourceResponse.getLinks(),hateoasControls)

        println(hateoasControls)
    }

    fun updateInstance(instance: ActivityInstance,
                       hateoasControls: HateoasControls): ActivityInstance {
        println(hateoasControls.get("instance"))
        restClient
                .target(hateoasControls.get("instance"))
                .request(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .get()
                .also { println(it.getStatus()) }
                .also { getHateoasControls(it.getLinks(),hateoasControls) }
                .also {
                    println(hateoasControls)
                    val serviceInstance = it.readEntity(object : GenericType<ActivityInstance>() {})
                    println(serviceInstance)
                    instance.state = serviceInstance.state
                }.let {
                    return instance
                }
    }

    fun submitForProcessing(instance: ActivityInstance,
                            hateoasControls: HateoasControls): ActivityInstance {
        restClient
                .target(hateoasControls.get("start-execution"))
                .request(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .post(null)

                .also { getHateoasControls(it.getLinks(),hateoasControls) }
                .also {
                    println(hateoasControls)
                    println(it.getStatus())
                    //println(it.getEntity())
                    val serviceInstance = it.readEntity(object : GenericType<ActivityInstance>() {})
                    //println(serviceInstance)
                    instance.state = serviceInstance.state
                    println(instance.state)
                }.let {
                    return instance
                }
    }

    private fun waitForProcessingAndReturnState(instance: ActivityInstance,
                                                hateoasControls: HateoasControls)
            : ActivityInstance {
        var response: Response;
        do {
            Thread.sleep(500)
            response = restClient
                    .target(hateoasControls.get("start-execution"))
                    .request(MediaType.APPLICATION_JSON)
                    .accept(MediaType.APPLICATION_JSON)
                    .get()
        } while (response.getStatus() in listOf(200))

        if (response.getStatus() == 410) {
            instance.state = State.FAILED

        } else if (response.getStatus() == 303) {
            val location = response.getLocation()
            hateoasControls.put("instance", location)
            instance.state = State.SUCCEEDED
            println(hateoasControls)

        } else {
            throw UnexpectedResponseStatus(response.getStatus().toString())
        }


        return instance
    }

    private fun retrieveOutputs(succeededInstance: ActivityInstance,
                                hateoasControls: HateoasControls)
            : Map<String, List<DatasetItem>> {
        getOutputDatasetsHateoasControls(hateoasControls)

        return description.getOutputDatasets().map {
            retrieveOutputDataset(it,hateoasControls).also { println(it) }
        }.toMap().also { println(it) }
    }

    fun retrieveOutputDataset(dataset: OutputDataset,
                              hateoasControls: HateoasControls)
            : Pair<String, List<DatasetItem>> {
        println(hateoasControls)
        return if (dataset.getMaximumCardinality().toInt() > 1) {
            val items = retrieveCollectionOutputDataset(
                    dataset.getName(),hateoasControls)
            Pair(dataset.getName(), items)
        } else {
            val item = retrieveSingleFileOutputDataset(
                    dataset.getName(),hateoasControls)
            Pair(dataset.getName(), listOf(item))
        }
    }

    fun retrieveCollectionOutputDataset(name: String,
                                        hateoasControls: HateoasControls)
            : List<DatasetItem> {
        println("collection file dataset")

        val datasetResponse =
                restClient
                        .target(hateoasControls.get(outputDatasetControlFor(name)))
                        .request(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON)
                        .get()

        val itemLinks = datasetResponse.getLinks()

        return itemLinks.filter { it.getRel() != "self" }
                .map {
                    val itemResponse = restClient
                            .target(it.getUri())
                            .request(MediaType.APPLICATION_JSON)
                            .accept(MediaType.APPLICATION_JSON)
                            .get()


                    val content = itemResponse.readEntity(
                            object : GenericType<DatasetItem>() {})

                    println(content)

                    content
                }.toList()
    }

    fun outputDatasetControlFor(datasetName: String) = datasetName;

    fun retrieveSingleFileOutputDataset(name: String,
                                        hateoasControls: HateoasControls)
            : DatasetItem {
        println("single file dataset")


        val datasetResponse =
                restClient
                        .target(hateoasControls.get(outputDatasetControlFor(name)))
                        .request(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON)
                        .get()

        val content = datasetResponse.readEntity(
                object : GenericType<DatasetItem>() {})

        println(content.content.content)

        return content

    }

    private fun getOutputDatasetsHateoasControls(
            hateoasControls: HateoasControls) {
        val inputsResourceResponse = restClient
                .target(hateoasControls.get("outputs"))
                .request(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .get()
        getHateoasControls(inputsResourceResponse.getLinks(),hateoasControls)

        println(hateoasControls)
    }

    private fun retrieveErrorLog(suceededInstance: ActivityInstance,
                                 hateoasControls: HateoasControls): String {
        return restClient
                .target(hateoasControls.get("instance"))
                .request(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .get()
                .also { println(it.getStatus()) }
                .also { getHateoasControls(it.getLinks(),hateoasControls) }
                .let {
                    println(hateoasControls)
                    val serviceInstance =
                            it.readEntity(
                                    object : GenericType<ActivityInstance>() {})

                    serviceInstance.errorReport ?: ""
                }
    }


}