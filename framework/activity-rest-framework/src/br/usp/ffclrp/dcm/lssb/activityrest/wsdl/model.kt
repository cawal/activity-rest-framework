package br.usp.ffclrp.dcm.lssb.activityrest.wsdl

import java.net.InetAddress

/**
 * This class presents the deployment-related information
 * about a  Activity-REST service. This information are not
 * provided by an AADL description as it is not inherently
 * related to the activity the service provides, being only
 * related to *how the service may be accessed*.
 *
 * @property protocol the protocol identifier.
 * 						(Ex: http, https, ...)
 * @property host the service host machine address
 * @property port the service port
 * @property basePath the base path for the service's root resource
 */
data class DeploymentModel(
    val protocol : String,
    val host : InetAddress,
    val port : Int,
    val basePath : String) {
    
    fun serviceRootPath() : String =
     """${protocol}://${host.hostAddress}:${port}/${basePath}"""

};
