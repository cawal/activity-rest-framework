package br.usp.ffclrp.dcm.lssb.activityrest.jbpmclient

import br.usp.ffclrp.dcm.lssb.activityrest.domain.ActivityInstance
import br.usp.ffclrp.dcm.lssb.activityrest.jbpmclient.workitemhandlers.*
import org.jbpm.process.core.context.variable.VariableScope
import org.jbpm.process.instance.ProcessInstance
import org.jbpm.process.instance.context.variable.VariableScopeInstance
import org.kie.api.io.ResourceType
import org.kie.api.runtime.KieSession
import org.kie.internal.io.ResourceFactory
import org.kie.internal.utils.KieHelper
import br.usp.ffclrp.dcm.lssb.activityrest.domain.DatasetItem
import java.io.File
import java.net.URI
import org.kie.api.runtime.process.WorkItemHandler
import org.kie.api.KieServices
import org.kie.api.builder.Message.Level


class ActivityRestService(val serviceRoot: URI,
                          val bpmnResources: List<BpmnProcessResource>,
                          val executedProcessId: String,
                          val dryRun : Boolean = false) {

    private val session: KieSession by lazy {
        preparejBpmEngine(bpmnResources)
    }


    fun execute(activityInstance: ActivityInstance): ActivityInstance {

        val processInstance: ProcessInstance = session.startProcess(
                executedProcessId, getExecutionParameters(activityInstance)
        ) as ProcessInstance

        print(processInstance.getState())

        val variableScope = processInstance.getContextInstance(VariableScope.VARIABLE_SCOPE)
                as VariableScopeInstance
        val variables = variableScope.getVariables();

        println(variables)
        println(variables.get("processingEnded"))
        println(variables.get("saida"))

        return processResult(activityInstance, variableScope)
    }

    private fun preparejBpmEngine(bpmResources: List<BpmnProcessResource>): KieSession {

        val kieHelper = KieHelper()
        for (bpmResource in bpmResources) {
            val resource = ResourceFactory.newClassPathResource(bpmResource.path)
            kieHelper.addResource(resource, bpmResource.type)//.build()
        }
        val kieBase = kieHelper.build()
        val session = kieBase.newKieSession()
        addCustomHandlers(session)
        return session
    }

    private fun addCustomHandlers(session: KieSession): Unit {
        if (dryRun) {
            getWorkItemHandlers().forEach {
                session.workItemManager.registerWorkItemHandler(it.key, it.value)
            }
        } else {
            getDummyWorkItemHandlers().forEach {
                session.workItemManager.registerWorkItemHandler(it.key, it.value)
            }

        }
//        val map: Map<String, WorkItemHandler> = mapOf(
//                "create-activity-instance" to CreateActivityInstance(),
//                "submit-parameters-values" to SubmitParametersValues(),
//                "submit-single-dataset" to SubmitSingleDataset(),
//                "submit-collection-dataset" to SubmitCollectionDataset(),
//                "submit-instance-for-processing" to SubmitInstanceForProcessing(),
//                "wait-activity-instance-to-complete" to WaitActivityInstanceToComplete(),
//                "retrieve-single-item-output-dataset" to RetrieveSingleItemOutputDataset(),
//                "timed-wait" to TimedWait(),
//                "poll-processing-state" to PollProcessingState()
//        )
//
//        map.entries.forEach {
//            session.workItemManager.registerWorkItemHandler(it.key, it.value)
//        }
    }

    private fun getExecutionParameters(activityInstance: ActivityInstance)
            : Map<String, Any> = activityInstance.parameters
            .plus(activityInstance.inputDatasets)

    private fun processResult(activityInstance: ActivityInstance,
                              variableScope: VariableScopeInstance)
            : ActivityInstance {

        val outputDatasets = variableScope.getVariables()
                .filterKeys { it in activityInstance.outputDatasets.keys.also { println(it) } }
        activityInstance.outputDatasets = outputDatasets as Map<String, List<DatasetItem>>
        return activityInstance
    }
}
