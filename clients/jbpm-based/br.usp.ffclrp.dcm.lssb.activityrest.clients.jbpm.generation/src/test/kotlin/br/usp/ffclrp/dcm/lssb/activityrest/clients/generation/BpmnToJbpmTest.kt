package br.usp.ffclrp.dcm.lssb.activityrest.clients.generation

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
import org.kie.api.io.ResourceType
import br.usp.ffclrp.dcm.lssb.activityrest.jbpmclient.*
import br.usp.ffclrp.dcm.lssb.activityrest.domain.ActivityInstance
import org.jbpm.test.JbpmJUnitBaseTestCase
import org.kie.api.runtime.manager.RuntimeEngine
import org.kie.api.runtime.KieSession

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class BpmnToJbpmTest : JbpmJUnitBaseTestCase(true,false){

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

        // create runtime manager with single process - hello.bpmn
        createRuntimeManager("hello.bpmn");

        // take RuntimeManager to work with jBPM engine
        val runtimeEngine = getRuntimeEngine();

        // get access to KieSession instance
        val ksession = runtimeEngine.getKieSession();

        // start process
        val processInstance = ksession.startProcess("com.sample.bpmn.hello");

        // check whether the process instance has completed successfully
        assertProcessInstanceCompleted(processInstance.getId(), ksession);

        // check what nodes have been triggered
        assertNodeTriggered(processInstance.getId(), "StartProcess", "Hello", "EndProcess");


//        executeFile(file);
//        file.renameTo(File("/home/cawal/git/lssb/phd-tests-scratch-project/a.bpmn2"))
        assertAll("File exists",
                { assertNotNull(file, "Returned a null File instance.") },
//                { assertTrue(file.exists(), "BPMN file does not exists") },
                { assertEquals("bpmn2", file.extension, "Wrong extension!") },
                {
                    assertTrue(isValidBpmnFile(file))
                }

        )
    }

    fun executeFile(file: File) {
        val serviceRootUri = URI("http://dummy.uri")
        val bpmnResources = listOf(BpmnProcessResource(
                "david-chart-report",
                file.getAbsolutePath(),
                ResourceType.BPMN2
        ))

        val executedProcessId = "david-chart-report"
        val dryRun: Boolean = true

        val service = ActivityRestService(serviceRootUri,
                bpmnResources,
                executedProcessId,
                dryRun)

        service.execute(ActivityInstance())

    }

    fun isValidBpmnFile(file: File): Boolean {
        val bpmnObject = ModelsService.retrieveBPMN(
                EmfUri.createFileURI(file.getAbsolutePath())
        )

        return bpmnObject != null
    }

}