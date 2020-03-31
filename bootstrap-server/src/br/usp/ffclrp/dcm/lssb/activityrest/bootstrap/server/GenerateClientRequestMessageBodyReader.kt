package br.usp.ffclrp.dcm.lssb.activityrest.bootstrap.server

import java.io.IOException
import java.io.InputStream
import java.lang.reflect.Type
import javax.json.Json
import javax.ws.rs.Consumes
import javax.ws.rs.WebApplicationException
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.MultivaluedMap
import javax.ws.rs.ext.MessageBodyReader
import javax.ws.rs.ext.Provider


@Provider
@Consumes(MediaType.APPLICATION_JSON)
class GenerateClientRequestMessageBodyReader : MessageBodyReader<Any> {
    /**
     * Do this MessageBodyReader can produce an instance of a particular type?
     * @return true, since it should work for all objects.
     */
    override fun isReadable(
        type: Class<*>?,
        genericType: Type,
        annotations: Array<Annotation>,
        mediaType: MediaType
    ): Boolean {
        return type?.isAssignableFrom(GenerateClientRequest::class.java) ?: false
    }

    /**
     * Read from the InputStream and deserialize the instance.
     */
    @Throws(IOException::class, WebApplicationException::class)
    override fun readFrom(
        type: Class<Any>,
        genericType: Type,
        annotations: Array<Annotation>,
        mediaType: MediaType,
        httpHeaders: MultivaluedMap<String, String>,
        entityStream: InputStream
    ): Any {

        val jsonReader =
            Json.createReader(entityStream)
        val jsonObject = jsonReader.readObject()
        println(jsonObject)

        val activityParser = DtoToActivity()
        val activityDto = jsonObject.getJsonObject("activity")
        val activity = activityParser.getActivity(activityDto)

        val deploymentParser = DtoToDeployment()
        val deploymentDto = jsonObject.getJsonObject("deployment")
        val deployment = deploymentParser.transform(deploymentDto)

        return GenerateClientRequest(
            activity = activity,
            deployment = deployment
        )
    }
}

