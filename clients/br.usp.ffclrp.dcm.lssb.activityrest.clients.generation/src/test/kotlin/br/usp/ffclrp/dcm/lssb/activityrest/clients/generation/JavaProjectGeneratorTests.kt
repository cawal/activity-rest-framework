package br.usp.ffclrp.dcm.lssb.activityrest.clients.generation

import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*
import br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy.ModelsService
import java.io.File
import br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy.JavaProjectGenerator
import org.junit.Ignore

@Ignore
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class JavaProjectGeneratorTests {

    private val generator = JavaProjectGenerator();

    val activity by lazy {  
        var inputStream = this::class.java.getResourceAsStream("./activity.aadl")
        ModelsService.retrieveAADLModel(inputStream)
    }
    
    val deployment by lazy {  
        var inputStream = this::class.java.getResourceAsStream("./activity.deployment")
        ModelsService.retrieveDeploymentModel(inputStream)
    }
    
    val generatedProject by lazy {
        generator.generate(activity,deployment);
    }
    

    @Test
    fun `Execution creates a directory`() {

        assertAll("File exists",
                { assertNotNull(generatedProject, "Returned a null File instance.") },
                { assertTrue(generatedProject.exists(), "Root directory does not exists") },
                { assertTrue(generatedProject.isDirectory(),"generated root is not a directory.")}
        )
    }
    
    @Test
    fun `Execution creates a Maven project`() {

        println("generated project: ${generatedProject.getAbsolutePath()}")
        val pomFile = File(generatedProject, "pom.xml")
        println("pomfile: ${pomFile.getAbsolutePath()}")
        assertAll("Returned file is not a Maven project!",
                { assertTrue((pomFile.exists()),
                         "POM file does not exists")
                }
        )

    }
    
    @Test
    fun `Execution creates activity-specific files`(){
        val cliFile = File(generatedProject,"src/main/java/${activity.name}/app-activity-specific.kt")
        assertAll("Do not generates the activity-specific files!",
                { assertTrue(cliFile.exists())}
        )
    }





}