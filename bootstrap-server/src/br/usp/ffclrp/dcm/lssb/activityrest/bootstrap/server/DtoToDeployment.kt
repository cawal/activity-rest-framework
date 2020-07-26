package br.usp.ffclrp.dcm.lssb.activityrest.bootstrap.server

import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.*
import java.net.URI
import java.net.URL
import javax.json.JsonObject


class DtoToDeployment() {

    init {
        DeploymentModelPackage.eINSTANCE.eClass()
    }

    private var factory = DeploymentModelFactory.eINSTANCE

    fun transform(dto: JsonObject): Deployment {
        return getDeployment(dto)
    }

    fun getDeployment(dto : JsonObject) : Deployment {
        val dep = factory.createDeployment();
        dep.service = dto.objectOrNull("service")
            ?.let { getService(it) }
        dep.container = dto.objectOrNull("container")
            ?.let { getServiceContainer(it) }
        return dep;
    }

    fun getService(dto : JsonObject) : Service {
        val service = factory.createService()
        service.name = dto.string("name")
        service.apiVersion = dto.string("apiVersion")
        service.description = dto.string("description")
        return service
    }

    fun getServiceContainer(dto : JsonObject) : ServiceContainer {
        val c = factory.createServiceContainer()
        c.name = dto.string("name")
        c.description = dto.string("description")
        c.baseUrl = dto.string("baseUrl")
            ?.let { URL(it) }
        return c
    }

    fun getContact(dto : JsonObject) : Contact {
        val c = factory.createContact()
        c.name = dto.string("name")
        c.email = dto.string("email")
        c.url = dto.string("url")
            ?.let { URL(it) }
        c.name
        return c
    }

}