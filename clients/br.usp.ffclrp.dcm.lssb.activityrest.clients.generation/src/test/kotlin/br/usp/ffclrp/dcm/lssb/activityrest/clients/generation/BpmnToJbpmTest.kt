package br.usp.ffclrp.dcm.lssb.activityrest.clients.generation

import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*
import AadlToBpmn
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionFactory
import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.DeploymentModelFactory
import br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy.ModelsService
import java.net.URI
import org.eclipse.emf.common.util.URI as EmfUri
import java.io.InputStream
import java.io.File
import br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy.BpmnToJbpm

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class BpmnToJbpmTest {

    private val transformationEngine = AadlToBpmn();

    val activity by lazy {  
        var inputStream = this::class.java.getResourceAsStream("./david.aadl")
        ModelsService.retrieveAADLModel(inputStream)
    }
    
    
    val deployment by lazy {  
        var inputStream = this::class.java.getResourceAsStream("./david.deployment")
        ModelsService.retrieveDeploymentModel(inputStream)
    }

    @Test
    fun `Execution creates a valid BPMN file`() {

        val bpmn = transformationEngine.generateBpmn(activity);
        val file = BpmnToJbpm().transform(bpmn);

        print(file)
        assertAll("File exists",
                { assertNotNull(file, "Returned a null File instance.") },
                { assertTrue(file.exists(), "BPMN file does not exists") },
                { assertEquals("bpmn2", file.extension, "Wrong extension!") },
                {
                    assertTrue(isValidBpmnFile(file))
                }
        )
    }

    fun isValidBpmnFile(file : File) : Boolean{
        val bpmnObject = ModelsService.retrieveBPMN(
                	EmfUri.createFileURI(file.getAbsolutePath())
        )
        
        return bpmnObject != null
    }

}