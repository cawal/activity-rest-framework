package br.usp.ffclrp.dcm.lssb.activityrest.clients.jbpm.workitemhandlers

import org.kie.api.runtime.process.WorkItemHandler

import org.kie.api.runtime.process.WorkItem
import org.kie.api.runtime.process.WorkItemManager
import java.io.File
import javax.ws.rs.client.Client
import javax.ws.rs.client.ClientBuilder
import javax.ws.rs.core.MediaType
import br.usp.ffclrp.dcm.lssb.activityrest.domain.ActivityInstance
import br.usp.ffclrp.dcm.lssb.activityrest.domain.DatasetItem
import javax.ws.rs.core.GenericType
import javax.ws.rs.client.Entity
import java.io.InputStream
import javax.xml.transform.Source
import org.apache.woden.WSDLFactory
import org.apache.woden.WSDLReader
import org.apache.woden.wsdl20.Description
import org.apache.woden.wsdl20.xml.DescriptionElement
import javax.ws.rs.core.Response
import br.usp.ffclrp.dcm.lssb.activityrest.domain.ActivityInstanceState
import org.glassfish.jersey.client.ClientProperties
import org.glassfish.jersey.jackson.internal.jackson.jaxrs.json.JacksonJsonProvider
import org.glassfish.jersey.client.ClientConfig

abstract class WsdlBasedWorkItemHandler : WorkItemHandler {
    var wsdl: Description

    constructor (wsdlString: String) {
        val factory: WSDLFactory = WSDLFactory.newInstance()
        val reader: WSDLReader = factory.newWSDLReader()
        reader.setFeature(WSDLReader.FEATURE_VALIDATION, true)
        wsdl = reader.readWSDL(wsdlString)
    }

    constructor (description: Description) {
        wsdl = description
    }
}

abstract class JaxRsClientWorkItemHandler : WorkItemHandler {
    val restClient: Client = ClientBuilder.newClient(ClientConfig(JacksonJsonProvider::class.java))
    val basePath: String = "http://kode.ffclrp.usp.br:8081/david-chart-report-by-dataset/"
    val target = restClient.target(basePath)
}

class CreateActivityInstance() : JaxRsClientWorkItemHandler() {
//val  cc = DefaultClientConfig();
//cc.getClasses().add(JacksonJsonProvider.class);
//Client clientWithJacksonSerializer = Client.create(cc);

    override fun executeWorkItem(item: WorkItem, manager: WorkItemManager) {
        println("ENTROU")
        val itemId = item.id
        val url = "${item.parameters.get("url") ?: basePath}"
        println(url)
        val response = restClient
            .target(url)
            .path("new-analyses")
            .request(MediaType.APPLICATION_JSON)
            .accept(MediaType.APPLICATION_JSON)
            .post(null)

        println(response)
        println(url)

        val location = response.getHeaders().get("Location")?.first().also { println(it) }
        val activityInstance = response.readEntity(object : GenericType<ActivityInstance>() {})
        val activityId = activityInstance.id

        println(activityId)
        println(activityInstance)
        val results = mapOf(
            "location" to location,
            "activityId" to activityId,
            "activityInstance" to activityInstance
        )

        manager.completeWorkItem(itemId, results)
    }

    override fun abortWorkItem(item: WorkItem, manager: WorkItemManager) {

    }
}

class SubmitParametersValues() : JaxRsClientWorkItemHandler() {


    override fun executeWorkItem(item: WorkItem, manager: WorkItemManager) {

        val itemId = item.id
        val url = "${item.parameters.get("url") ?: basePath}"
        val activityId: String? = item.parameters.get("activityId") as? String
        val categoriesInResult: List<String>? = item.parameters.get("categoriesInResult") as? List<String>
        val columnName: String? = item.parameters.get("columnName") as? String
        val countCutoff: Int? = item.parameters.get("countCutoff") as? Int
        val email: String? = item.parameters.get("email") as? String
        val geneIdentifierType: String? = item.parameters.get("geneIdentifierType") as? String
        val threshold: Double? = item.parameters.get("threshold") as? Double

		println(item.parameters)
		
        val map: Map<String, Any?> = mapOf(
            "categories-in-result" to categoriesInResult,
            "column-name" to columnName,
            "count-cutoff" to countCutoff,
            "email" to email,
            "gene-identifier-type" to geneIdentifierType,
            "threshold" to threshold
        )

        println(map)

        val response = restClient
            .target(url)
            .path("new-analyses")
            .path("{activityId}")
            .path("parameters")
            .resolveTemplate("activityId", activityId)
            .request(MediaType.APPLICATION_JSON)
            .accept(MediaType.APPLICATION_JSON)
            .put(Entity.entity(map, MediaType.APPLICATION_JSON))

        println(response)
        println(url)

        val location = response.getHeaders().get("Location")?.first().also { println(it) }
        //val activityInstance = response.readEntity(object : GenericType<ActivityInstance>() {})

        println(activityId)
        val results = mapOf(
            "location" to location,
            "activityId" to activityId
        )

        manager.completeWorkItem(itemId, results)
    }

    override fun abortWorkItem(item: WorkItem, manager: WorkItemManager) {

    }
}


class SubmitSingleDataset() : JaxRsClientWorkItemHandler() {


    override fun executeWorkItem(item: WorkItem, manager: WorkItemManager) {
        println(item.parameters)

        val itemId = item.id
        val url = "${item.parameters.get("url") ?: basePath}"
        val activityId: String = item.parameters.get("activityId") as String
        val datasetName: String = item.parameters.get("datasetName") as String
        val datasetItems: List<DatasetItem> = (
                item.parameters.get("datasetItem") ?: emptyList<DatasetItem>()
                ) as List<DatasetItem>

        val response = restClient
            .target(url)
            .path("new-analyses")
            .path("{activityId}")
            .path("inputs")
            .path("{datasetName}")
            .resolveTemplate("activityId", activityId)
            .resolveTemplate("datasetName", datasetName)
            .request(MediaType.APPLICATION_JSON)
            .accept(MediaType.APPLICATION_JSON)
            .put(
                Entity.entity(
                    datasetItems.first().content,
                    MediaType.APPLICATION_JSON
                )
            )
        //val location = response.getHeaders().get("Location")?.first().also { println(it) }
        //val activityInstance = response.readEntity(object : GenericType<ActivityInstance>() {})

        val results = mapOf<String, Any>(
            "responseStatus" to response.getStatus()
        )


        manager.completeWorkItem(itemId, results)
    }

    override fun abortWorkItem(item: WorkItem, manager: WorkItemManager) {

    }
}


class SubmitCollectionDataset() : JaxRsClientWorkItemHandler() {

    override fun executeWorkItem(item: WorkItem, manager: WorkItemManager) {


        val itemId = item.id
        val url = "${item.parameters.get("url") ?: basePath}"
        val activityId: String = item.parameters.get("activityId") as String
        val datasetName: String = item.parameters.get("datasetName") as String
        val datasetItems: List<DatasetItem> = (
                item.parameters.get("categoriesInResult") ?: emptyList<DatasetItem>()
                ) as List<DatasetItem>

        val responses = datasetItems.map {
            restClient
                .target(url)
                .path("new-analyses")
                .path("{activityId}")
                .path("inputs")
                .path("{datasetName}")
                .resolveTemplate("activityId", activityId)
                .resolveTemplate("datasetName", datasetName)
                .request(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .post(
                    Entity.entity(
                        it.content,
                        MediaType.APPLICATION_JSON
                    )
                )
        }.toList()

        val results = mapOf<String, Any>(
            "responseStatuses" to responses.map { it.getStatus() }.toList()
        )


        manager.completeWorkItem(itemId, results)
    }

    override fun abortWorkItem(item: WorkItem, manager: WorkItemManager) {

    }
}


class SubmitInstanceForProcessing() : JaxRsClientWorkItemHandler() {


    override fun executeWorkItem(item: WorkItem, manager: WorkItemManager) {


        val itemId = item.id
        val url = "${item.parameters.get("url") ?: basePath}"
        val activityId: String = item.parameters.get("activityId") as String


        val response = restClient
            .target(url)
            .path("instances")
            .path("{activityId}")
            .resolveTemplate("activityId", activityId)
            .request(MediaType.APPLICATION_JSON)
            .accept(MediaType.APPLICATION_JSON)
            .post(null)

        val results = mapOf<String, Any>(
            "responseStatus" to response.getStatus(),
            "processingStarted" to (response.getStatus() == 201)
        )


        manager.completeWorkItem(itemId, results)
    }

    override fun abortWorkItem(item: WorkItem, manager: WorkItemManager) {

    }
}

class RetrieveSingleItemOutputDataset() : JaxRsClientWorkItemHandler() {

    override fun executeWorkItem(item: WorkItem, manager: WorkItemManager) {
        println(item.parameters)

        val itemId = item.id
        val url = "${item.parameters.get("url") ?: basePath}"
        val activityId: String = item.parameters.get("activityId") as String
        val datasetName: String = item.parameters.get("datasetName") as String

        val response = restClient
            .target(url)
            .path("succeeded-analyses")
            .path("{activityId}")
            .path("outputs")
            .path("{datasetName}")
            .resolveTemplate("activityId", activityId)
            .resolveTemplate("datasetName", datasetName)
            .request(MediaType.APPLICATION_JSON)
            .accept(MediaType.APPLICATION_JSON)
            .get()
        //val location = response.getHeaders().get("Location")?.first().also { println(it) }
        //val activityInstance = response.readEntity(object : GenericType<ActivityInstance>() {})

        println(response)
        val results = mapOf<String, Any>(
            "responseStatus" to response,
            "datasetItem" to listOf(
                response.readEntity(object : GenericType<DatasetItem>() {})
            )
        )


        manager.completeWorkItem(itemId, results)
    }

    override fun abortWorkItem(item: WorkItem, manager: WorkItemManager) {

    }
}

class TimedWait() : WorkItemHandler {
    override fun executeWorkItem(item: WorkItem, manager: WorkItemManager) {
        println("Waiting!")
        val itemId = item.id
        val millis: Long = (item.parameters.get("milliseconds") as? Long) ?: 1000


		Thread.sleep(millis)
		
        val results = mapOf(
            "delayedTimeInMillis" to millis
        )

        manager.completeWorkItem(itemId, results)
    }

    override fun abortWorkItem(item: WorkItem, manager: WorkItemManager) {

    }
	
}

class PollProcessingState() : JaxRsClientWorkItemHandler() {

    override fun executeWorkItem(item: WorkItem, manager: WorkItemManager) {
        val itemId = item.id
        val activityId = "${item.parameters.get("activityId")}"
        val url = "${item.parameters.get("url") ?: basePath}"

        target.property(ClientProperties.FOLLOW_REDIRECTS, false)

        println(activityId)
        var response: Response = target
            .path("instances")
            .path("{activityId}")
            .resolveTemplate("activityId", activityId)
            .request(MediaType.APPLICATION_JSON)
            .accept(MediaType.APPLICATION_JSON)
            .get()

        println(response)

        val results = mapOf(
            "processingState" to getProcessingState(response).toString()
        )

        manager.completeWorkItem(itemId, results)
    }

    private fun getProcessingState(response: Response): ActivityInstanceState {
        return when (response.getStatus()) {
            303 -> {
                ActivityInstanceState.SUCCEEDED
            }
            410 -> {
                ActivityInstanceState.FAILED
            }
            200 -> {
                ActivityInstanceState.RUNNING
            }
            else -> {
                ActivityInstanceState.FAILED
            }
        }
    }

    override fun abortWorkItem(item: WorkItem, manager: WorkItemManager) {

    }
	
}

class WaitActivityInstanceToComplete() : JaxRsClientWorkItemHandler() {


    override fun executeWorkItem(item: WorkItem, manager: WorkItemManager) {
        println("começou")
        val itemId = item.id
        val activityId = "${item.parameters.get("activityId")}"
        val millis: Long = (item.parameters.get("milliseconds") as? Long) ?: 1000
        val url = "${item.parameters.get("url") ?: basePath}"

        target.property(ClientProperties.FOLLOW_REDIRECTS, false)

        println(activityId)
        var response: Response = target
            .path("instances")
            .path("{activityId}")
            .resolveTemplate("activityId", activityId)
            .request(MediaType.APPLICATION_JSON)
            .accept(MediaType.APPLICATION_JSON)
            .get()

        println(response)
        while (getProcessingState(response) == ActivityInstanceState.RUNNING) {
            println("Waiting ${millis} milliseconds..")
            Thread.sleep(millis)
            response = target
                .path("instances")
                .path("{activityId}")
                .resolveTemplate("activityId", activityId)
                .request(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .get()

            println(response)
            println(response.getDate())
        }
        val results = mapOf(
            "finalProcessingState" to getProcessingState(response).toString()
        )

        manager.completeWorkItem(itemId, results)
    }

    private fun getProcessingState(response: Response): ActivityInstanceState {
        return when (response.getStatus()) {
            303 -> {
                ActivityInstanceState.SUCCEEDED
            }
            410 -> {
                ActivityInstanceState.FAILED
            }
            200 -> {
                ActivityInstanceState.RUNNING
            }
            else -> {
                ActivityInstanceState.FAILED
            }
        }
    }

    override fun abortWorkItem(item: WorkItem, manager: WorkItemManager) {

    }
}

class TimedWaitHandler() : WorkItemHandler {
    override fun executeWorkItem(item: WorkItem, manager: WorkItemManager) {

        val itemId = item.id
        val millis = (item.parameters.get("milliseconds") as String).toLong()

        println("Waiting ${millis} milliseconds..")
        Thread.sleep(millis)

        val results = mapOf(
            "result" to emptyArray<String>(),
            "processingEnded" to true
        )

        println("Waiting ended: ${results.get("processingEnded")}")

        manager.completeWorkItem(itemId, results)
    }

    override fun abortWorkItem(item: WorkItem, manager: WorkItemManager) {

    }
}


class PingLocalHost() : WorkItemHandler {

    val restClient: Client = ClientBuilder.newClient();
    val basePath: String = "http://localhost:8080/david-chart-report/"
    val target = restClient.target(basePath)

    override fun executeWorkItem(item: WorkItem, manager: WorkItemManager) {

        val itemId = item.id
        val url = item.parameters.get("url")
        val response = restClient
            .target(basePath)
            //.path(String.valueOf(id))
            .request(MediaType.APPLICATION_JSON)
            .get()

        println(response)
        println(url)

        val obj = "nice"
        val processingEnded = Math.random() < .2
        val results = mapOf(
            "result" to obj,
            "processingEnded" to processingEnded
        )

        println("PROCESSING ENDED: ${processingEnded}")

        manager.completeWorkItem(itemId, results)
    }

    override fun abortWorkItem(item: WorkItem, manager: WorkItemManager) {

    }
}

class ProduceResultDummy() : WorkItemHandler {
    override fun executeWorkItem(workItem: WorkItem, manager: WorkItemManager) {
        val itemId = workItem.id

        println("ProduceResultDummy::executeWorkItem")

        val results = mapOf(
            "files" to File(".").listFiles().toList<File>()
        )

        manager.completeWorkItem(itemId, results)
    }

    override fun abortWorkItem(workItem: WorkItem, manager: WorkItemManager) {
        TODO()
    }
}