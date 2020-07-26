package br.usp.ffclrp.dcm.lssb.activityrest.client

import br.usp.ffclrp.dcm.lssb.activityrest.client.exceptions.ActivityCannotBeCreated
import br.usp.ffclrp.dcm.lssb.activityrest.client.exceptions.InvalidActivityInstance
import br.usp.ffclrp.dcm.lssb.activityrest.client.exceptions.ServiceUnavailable
import br.usp.ffclrp.dcm.lssb.activityrest.client.exceptions.UnexpectedResponseStatus
import br.usp.ffclrp.dcm.lssb.activityrest.domain.ActivityInstance
import br.usp.ffclrp.dcm.lssb.activityrest.domain.DatasetItem
import org.glassfish.jersey.client.ClientProperties
import org.glassfish.jersey.jackson.internal.jackson.jaxrs.json.JacksonJsonProvider
import java.lang.Exception
import java.net.URI
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import javax.ws.rs.client.Client
import javax.ws.rs.client.ClientBuilder
import javax.ws.rs.client.Entity
import javax.ws.rs.core.GenericType
import javax.ws.rs.core.Link
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response
import javax.ws.rs.sse.InboundSseEvent
import javax.ws.rs.sse.SseEventSource
import br.usp.ffclrp.dcm.lssb.activityrest.domain.ActivityInstanceState as State

typealias HateoasControls = MutableMap<String, URI>


class ActivityRestClient(
    val baseUrl: URI
) {

    val restClient: Client = ClientBuilder.newBuilder()
        .property(ClientProperties.FOLLOW_REDIRECTS, false)
        .register(JacksonJsonProvider::class.java)
        .build()

    val target = restClient.target(baseUrl)


    fun execute(instance: ActivityInstance,
                useSSE: Boolean = false,
                deleteCompleted : Boolean = false)
            : ActivityInstance {

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

                if (useSSE) {
                    waitForProcessingAndReturnStateAsync(runningInstance, hateoasControls)
                } else {
                    waitForProcessingAndReturnState(runningInstance, hateoasControls)
                }

                val completedInstance =
                    updateInstance(runningInstance, hateoasControls)

                when (completedInstance.state) {
                    State.SUCCEEDED -> {
                        instance.outputDatasets =
                            retrieveOutputs(hateoasControls)
                    }
                    State.FAILED -> {
                        instance.errorReport =
                            retrieveErrorLog(hateoasControls)
                    }
                    else -> {
                    }
                }

                if(deleteCompleted){
                    deleteInstance(hateoasControls);
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

    fun connectToService(): HateoasControls {
        val response = restClient
            .target(baseUrl)
            .request(MediaType.APPLICATION_JSON)
            .accept(MediaType.APPLICATION_JSON)
            .get()

        return when (response.getStatus()) {
            200 -> getHateoasControls(response.getLinks(), HashMap<String, URI>())
            else -> throw ServiceUnavailable()
        }
    }


    fun getHateoasControls(
        links: Set<Link>,
        hateoasControls: HateoasControls
    )
            : HateoasControls {
        links.forEach {
            hateoasControls.set(it.getRel(), it.getUri())
        }
        println(hateoasControls)
        return hateoasControls
    }


    public fun createInstanceOnService(
        instance: ActivityInstance,
        hateoasControls: HateoasControls
    )
            : ActivityInstance {

        val response = restClient
            .target(hateoasControls.get("create-instance"))
            .request(MediaType.APPLICATION_JSON)
            .accept(MediaType.APPLICATION_JSON)
            .post(null)

        if (response.getStatus() in listOf(200, 201)) {

            val location = response.getLocation()
            hateoasControls.put("instance", location)
            getHateoasControls(response.getLinks(), hateoasControls)

            updateInstance(instance, hateoasControls)

            println(hateoasControls)

            return instance
        } else {
            throw ActivityCannotBeCreated()
        }
    }


    private fun sendInputs(
        datasets: Map<String, List<DatasetItem>>,
        hateoasControls: HateoasControls
    ): Boolean {
        getInputDatasetsHateoasControls(hateoasControls)

        println(datasets);
        return datasets.map {
            val name = it.key;
            val items = it.value;
            println(name)
            sendInputDataset(name, items, hateoasControls)
        }.all { it == true }
    }


    fun sendInputDataset(
        name: String, items: List<DatasetItem>,
        hateoasControls: HateoasControls
    )
            : Boolean {
        val sended = items.map {
            println(name)
            println(inputDatasetControlFor(name))
           println(hateoasControls.get(inputDatasetControlFor(name)))
            println(hateoasControls.get((name)))
            restClient
                .target(hateoasControls.get(inputDatasetControlFor(name)))
                .request(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .post(
                    Entity.entity(
                        it.content.content,
                        MediaType.APPLICATION_JSON
                    )
                )
        }.map {
            getHateoasControls(it.getLinks(), hateoasControls)
            it.getStatus() in listOf(200, 201)
        }.all { it == true }

        return sended
    }


    fun inputDatasetControlFor(datasetName: String) = "inputs/" + datasetName;


    fun getInputDatasetsHateoasControls(hateoasControls: HateoasControls) {
        val inputsResourceResponse = restClient
            .target(hateoasControls.get("inputs"))
            .request(MediaType.APPLICATION_JSON)
            .accept(MediaType.APPLICATION_JSON)
            .get()
        getHateoasControls(inputsResourceResponse.getLinks(), hateoasControls)

        println(hateoasControls)
    }


    private fun sendParameters(
        parameters: Map<String, Any>,
        hateoasControls: HateoasControls
    ): Boolean {

        getParametersHateoasControls(hateoasControls)

        return restClient.target(hateoasControls.get("parameters"))
            .request(MediaType.APPLICATION_JSON)
            .accept(MediaType.APPLICATION_JSON)
            .put(Entity.entity(parameters, MediaType.APPLICATION_JSON))

            .also { getHateoasControls(it.getLinks(), hateoasControls) }
            .let {
                it.getStatus() in listOf(200, 201)
            }
    }


    private fun getParametersHateoasControls(hateoasControls: HateoasControls) {
        val parameterResourceResponse = restClient
            .target(hateoasControls.get("parameters"))
            .request(MediaType.APPLICATION_JSON)
            .accept(MediaType.APPLICATION_JSON)
            .get()
        getHateoasControls(parameterResourceResponse.getLinks(), hateoasControls)

        println(hateoasControls)
    }


    private fun updateInstance(
        instance: ActivityInstance,
        hateoasControls: HateoasControls
    ): ActivityInstance {
        println(hateoasControls.get("instance"))
        restClient
            .target(hateoasControls.get("instance"))
            .request(MediaType.APPLICATION_JSON)
            .accept(MediaType.APPLICATION_JSON)
            .get()
            .also { println(it.getStatus()) }
            .also { getHateoasControls(it.getLinks(), hateoasControls) }
            .also {
                println(hateoasControls)
                val serviceInstance = it.readEntity(object : GenericType<ActivityInstance>() {})
                println(serviceInstance)
                instance.state = serviceInstance.state
            }.let {
                return instance
            }
    }


    fun submitForProcessing(
        instance: ActivityInstance,
        hateoasControls: HateoasControls
    ): ActivityInstance {
        restClient
            .target(hateoasControls.get("start-execution"))
            .request(MediaType.APPLICATION_JSON)
            .accept(MediaType.APPLICATION_JSON)
            .post(null)

            .also { getHateoasControls(it.getLinks(), hateoasControls) }
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


    private fun waitForProcessingAndReturnState(
        instance: ActivityInstance,
        hateoasControls: HateoasControls
    )
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


    private fun waitForProcessingAndReturnStateAsync(
        instance: ActivityInstance,
        hateoasControls: HateoasControls
    )
            : ActivityInstance {
        println("Começando SSE")
        println(hateoasControls);

        val completable: CompletableFuture<JobRepresentation> = CompletableFuture();
        val sseExceptionCompletable: CompletableFuture<Throwable> = CompletableFuture();

        //Client client = ClientBuilder.newBuilder().build();
        val target = restClient.target(hateoasControls.get("polling-events"));

        println(target)
        // o método build cria um source sem conectar automaticamente ao target
        val sseEventSource = SseEventSource.target(target).build();


        // Registra o lambda que serve de listener do evento.
        //  Esse lambda implementa `java.util.function.Consumer<InboundSseEvent>`
        // .`readData()` e executa internamente um `MessageBodyReader<T>`
        //  para desserializar o campo `data` do evento.
        sseEventSource.register(
            MessageConsumer(completable),
            ErrorConsumer(sseExceptionCompletable)
        )
        sseEventSource.open()

        println("Thread esperando...")

        if(sseExceptionCompletable.isDone){
            println("Deu falha")
            throw UnexpectedResponseStatus()

        } else {
            println("deu certo")
            val jobResult = completable.get()
            sseEventSource.close()
            println("E pegou o resultado")
            println(jobResult)
            instance.state = jobResult.state

            // save links
            val links = jobResult.links.forEach{
                hateoasControls.put(it.rel,URI.create(it.uri))
            }
            hateoasControls.put("instance",
                hateoasControls.get("Location") as URI)
            instance.state = State.SUCCEEDED

            println(hateoasControls)

            return instance
        }

    }


    private fun retrieveOutputs(hateoasControls: HateoasControls)
            : Map<String, List<DatasetItem>> {

        getOutputDatasetsHateoasControls(hateoasControls)

        val items = hateoasControls.filter { it.key.startsWith("outputs/") }
            .map {
                val rel = it.key
                val uri = it.value
                val datasetName = rel.split("/").get(1);
                val datasetItem = retrieveDatasetItem(uri)
                Pair(datasetName, datasetItem)
            }.toList().also { println(it) }


        val outputDatasets = HashMap<String, MutableList<DatasetItem>>()

        for (pair in items) {
            val dataset = outputDatasets.get(pair.component1())
                ?: ArrayList<DatasetItem>()

            dataset.add(pair.component2())
            outputDatasets.put(pair.component1(), dataset)
        }

        return outputDatasets.also { println(it) }

    }


    private fun retrieveDatasetItem(uri: URI): DatasetItem {

        val datasetResponse =
            restClient
                .target(uri)
                .request(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .get()

        val datasetItem = datasetResponse.readEntity(
            object : GenericType<DatasetItem>() {})

        println(datasetItem.content.content)
        return datasetItem
    }


    private fun outputDatasetControlFor(datasetName: String) =
        "outputs/" + datasetName;


    private fun getOutputDatasetsHateoasControls(
        hateoasControls: HateoasControls
    ) {
        val inputsResourceResponse = restClient
            .target(hateoasControls.get("outputs"))
            .request(MediaType.APPLICATION_JSON)
            .accept(MediaType.APPLICATION_JSON)
            .get()
        getHateoasControls(inputsResourceResponse.getLinks(), hateoasControls)

        println(hateoasControls)
    }


    private fun retrieveErrorLog(hateoasControls: HateoasControls): String {
        return restClient
            .target(hateoasControls.get("instance"))
            .request(MediaType.APPLICATION_JSON)
            .accept(MediaType.APPLICATION_JSON)
            .get()
            .also { println(it.getStatus()) }
            .also { getHateoasControls(it.getLinks(), hateoasControls) }
            .let {
                println(hateoasControls)
                val serviceInstance =
                    it.readEntity(
                        object : GenericType<ActivityInstance>() {})

                serviceInstance.errorReport ?: ""
            }
    }

    private fun deleteInstance(hateoasControls: HateoasControls) {
        restClient.target(hateoasControls.get("instance"))
            .request()
            .delete()
    }

}


class JobRepresentation() {
    var id: String = ""
    var state: State = State.CREATED
    var links: List<LinkRepresentation> = listOf()
    var errorReport : String? = "";
}

class LinkRepresentation() {
    var rel : String = ""
    var uri : String = ""
}


class MessageConsumer(val completable: CompletableFuture<JobRepresentation>) : Consumer<InboundSseEvent> {
    override fun accept(event: InboundSseEvent) {
        println(event)
        println(event.readData(String::class.java))
        val data = event.readData(JobRepresentation::class.java)
        println(data)

        when (data.state) {
            State.SUCCEEDED, State.FAILED -> {
                completable.complete(data);
            }
            else -> {
            }
        }
    }
}

class ErrorConsumer(val completable: CompletableFuture<Throwable>) : Consumer<Throwable> {
    override fun accept(throwable: Throwable) {
        println(throwable)
        completable.complete(throwable)
    }
}
