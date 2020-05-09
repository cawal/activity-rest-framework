package br.usp.ffclrp.dcm.lssb.activityrest.clients.generation

import br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy.ModelsService
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*
import br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy.GalaxyClientGenerator
import java.io.File
import org.junit.Ignore

@Ignore
class GalaxyClientGeneratorTests {

    val activity by lazy {
        var inputStream = this::class.java.getResourceAsStream("./activity.aadl")
        ModelsService.retrieveAADLModel(inputStream)
    }


    val deployment by lazy {
        var inputStream = this::class.java.getResourceAsStream("./activity.deployment")
        ModelsService.retrieveDeploymentModel(inputStream)
    }

    val generator = GalaxyClientGenerator();
    val generatedProject by lazy {
        generator.generateClient(activity, deployment)
    }


    @Test
    fun `Execution creates a Maven project`() {
        val pomFile = File(generatedProject, "pom.xml")

        assertAll("Returned file is not a Maven project!",
                { assertNotNull(generatedProject, "Returned null") },
                { assertTrue(generatedProject.exists(), "Directory does not exists") },
                {
                    assertTrue(pomFile.exists(),
                            "POM file does not exists")
                }
        )

    }
    
    @Test
    fun `Execution includes tool xml file`() {
        val toolFile = File(generatedProject,"galaxy/tool.xml")
        assertTrue(toolFile.exists())
    }

}