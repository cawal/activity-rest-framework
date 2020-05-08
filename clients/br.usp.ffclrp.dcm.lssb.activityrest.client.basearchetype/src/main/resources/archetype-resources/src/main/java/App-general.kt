@file:JvmName("App")
@file:JvmMultifileClass

package br.usp.ffclrp.dcm.lssb.activityrest.client

import br.usp.ffclrp.dcm.lssb.activityrest.domain.*
import picocli.CommandLine
import picocli.CommandLine.Command
import picocli.CommandLine.Option
import picocli.CommandLine.Parameters
import java.io.File
import java.util.concurrent.Callable
import org.apache.commons.io.IOUtils
import java.io.FileWriter
import java.net.URI


fun main(args: Array<String>) : Unit {
	 System.exit(CommandLine(AppCallable()).execute(*args))
}

fun test(args: Array<String>) = CommandLine(AppCallable()).execute(*(args.also{it.forEach{s -> print("${s} ")}}))


fun execute(config: AppCallable): Int {

    val activityInstance = getActivityInstance(config)
    val baseUrl = URI.create(config.service_url)

    
	val client = ActivityRestClient(baseUrl)
    val executedInstance = client.execute(activityInstance,config.use_sse);
    
    if(executedInstance.state == ActivityInstanceState.SUCCEEDED){
    	val outputDatasets = executedInstance.outputDatasets
    	writeOutputDatasets(config, outputDatasets)
    	return 0
        
    } else {
        val errorReport = executedInstance.errorReport
        System.err.println(errorReport)
        return 1;
    }
}


