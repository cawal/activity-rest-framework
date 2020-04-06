package br.usp.ffclrp.dcm.lssb.activityrest.bootstrap.server

import br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy.GalaxyClientGenerator
import br.usp.ffclrp.dcm.lssb.activityrest.services.generation.JavaEEServiceGenerator
import java.io.File

class GenerateActivityRestServiceClient(){
    fun generate(request: GenerateServiceRequest) : File {

        print(request)
        val generator = JavaEEServiceGenerator();
        val activity = request.activity
        val deployment = request.deployment
        val functionalEntity = request.functionalEntity
        val projectDir = generator.generateService(
            activity = activity,
            functionalInterface = functionalEntity,
            deployment = deployment)

        return ZipDir.main(projectDir)
    }
}