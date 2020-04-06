package br.usp.ffclrp.dcm.lssb.activityrest.bootstrap.server

import br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy.GalaxyClientGenerator
import br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy.JavaProjectGenerator
import java.io.File
import javax.ws.rs.*
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response


@Path("/")
class RootEndpoint {

    @GET
    fun getRoot(): Response {
        return Response.ok("bootstrap-generator").build()
    }

    @POST
    @Path("generate-galaxy-client")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_OCTET_STREAM)
    fun generateGalaxyClient(request: GenerateClientRequest): Response {
        val generator = GenerateGalaxyClient();
        val file = generator.generate(request)
//        val file = File("/tmp/cawal.rofi.pid")
        val response = Response.ok(file as Any)
        response.header("Content-Disposition", "attachment; filename=\"${file.name}\"")
        return response.build()
    }

    @POST
    @Path("generate-service")
    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_OCTET_STREAM)
    fun generateService(request: GenerateServiceRequest): Response {
        val generator = GenerateActivityRestServiceClient();
        val file = generator.generate(request)
        val response = Response.ok(file as Any)
        response.header("Content-Disposition", "attachment; filename=\"${file.name}\"")
        return response.build()
    }
}