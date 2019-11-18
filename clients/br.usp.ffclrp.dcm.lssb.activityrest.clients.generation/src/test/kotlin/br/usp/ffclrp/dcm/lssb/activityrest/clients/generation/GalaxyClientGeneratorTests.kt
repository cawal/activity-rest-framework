package br.usp.ffclrp.dcm.lssb.activityrest.clients.generation

import br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy.ModelsService
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*
import br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy.GalaxyClientGenerator
import java.io.File

class GalaxyClientGeneratorTests {

    val activity by lazy {
        var inputStream = this::class.java.getResourceAsStream("./david.aadl")
        ModelsService.retrieveAADLModel(inputStream)
    }


    val deployment by lazy {
        var inputStream = this::class.java.getResourceAsStream("./david.deployment")
        ModelsService.retrieveDeploymentModel(inputStream)
    }



    @Test
    fun `Execution creates a Maven project`() {
        val generator = GalaxyClientGenerator();
        val project = generator.generateClient(activity, deployment)


        File(project,"pom.xml").also{print(it)}.renameTo(File(project,"pommm.xml"))
        
        assertAll("Returned file is not a Maven project!",
                { assertNotNull(project, "Returned null") },
                { assertTrue(project.exists(), "Directory does not exists")},
                { assertTrue(
                        File(project, "pom.xml")
                        	.also { print("File: ${it}") }
                            .exists(),
                		"POM file does not exists")
                }
        )

    }

}