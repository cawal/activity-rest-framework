package org.br.usp.ffclrp.dcm.lssb.activityrest.clients.generation

import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*
import AadlToBpmn
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionFactory
import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.DeploymentModelFactory


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class AadlToBpmnTests {
    
    private val transformationEngine = AadlToBpmn();
    
    @Test
    fun `Execution creates a BPMN file`(){
        val activity = AnalysisActivityDescriptionFactory
                			.eINSTANCE.createActivity();
        val deploymentModel = DeploymentModelFactory
                			.eINSTANCE.createDeployment();
        
        val file = transformationEngine.generateBpmn(activity,deploymentModel);
        
        assertAll("File exists",
                { assertNotNull(file, "Returned a null File instance.") },
                {assertTrue(file.exists(),"BPMN file does not exists")},
                {assertEquals("bpmn2",file.extension,"Wrong extension!")}
        )
    }
    
    
}