package br.usp.ffclrp.dcm.lssb.activityrest.wsdl

import java.net.InetAddress

data class DeploymentModel(
    val protocol : String,
    val host : InetAddress,
    val port : Int,
    val basePath : String) {
    
    fun serviceRootPath() : String =
     """${protocol}://${host.hostAddress}:${port}/${basePath}"""

};
