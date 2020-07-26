package br.usp.ffclrp.dcm.lssb.activityrest.clients.generation

import java.io.File
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity
import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.Deployment

fun main(args: Array<String>) {
    println("Hello, World")
}

interface ClientGenerator {
    fun generateClient(activity : Activity,
                       deployment : Deployment) : File;
}