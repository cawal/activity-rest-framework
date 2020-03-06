@file:JvmName("App")
@file:JvmMultifileClass

package br.usp.ffclrp.dcm.lssb.activityrest.jbpmclient

import br.usp.ffclrp.dcm.lssb.activityrest.domain.*
import picocli.CommandLine
import picocli.CommandLine.Command
import picocli.CommandLine.Option
import picocli.CommandLine.Parameters
import java.io.File
import java.util.concurrent.Callable
import org.apache.commons.io.IOUtils
import java.io.FileWriter


fun main(args: Array<String>) : Unit {
	 System.exit(CommandLine(AppCallable()).execute(*args))
}

fun test(args: Array<String>) = CommandLine(AppCallable()).execute(*(args.also{it.forEach{s -> print("${s} ")}}))


fun execute(config: AppCallable): Int {

    val activityInstance = getActivityInstance(config)
    val executionService = ExecutionService(bpmnResources,executedProcessId)
    val resultActivityInstance = executionService.execute(activityInstance)
    val outputDatasets = resultActivityInstance.outputDatasets
    writeOutputDatasets(config, outputDatasets)
    return 0
}


