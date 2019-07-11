@file:JvmName("ActivityToXsdTransformationService")
package br.usp.ffclrp.dcm.lssb.activityrest.wsdl

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Parameter
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Dataset
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.InputDataset
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.OutputDataset
import java.net.InetAddress


val xsdCommonElementsResource = "./xsd-commons.xml"

fun DeploymentModel.serviceRootPath() : String =
     """${protocol}://${host}:${port}/${basePath}}"""

private fun xsdCommonElements() : String {
    return object {}.javaClass.getResource(xsdCommonElementsResource).readText()
} 
    
private fun Parameter.isUnbounded() : Boolean = (getMaximumCardinality().toInt() < 0)

private fun Parameter.toXsdElement() : String = """
 <xs:element name="${name}">
 	<xs:complexType>
 		<xs:element name="analysis-id" type="aa:analysis-id" maxOccurs="1" />
 		<xs:element name="value"
 			type="aa:Value_Type"
 			minOccurs="0"
 			maxOccurs="${ if (isUnbounded()) "unbounded"
 						  else getMaximumCardinality()?.toString()}" />
 	</xs:complexType>
 </xs:element>
 """

private fun Dataset.toXsdElement() : String = """
 <xs:element name="${name}" type="aa:File_Type" />
 """ 

fun toXsd(activity : Activity, deploymentModel : DeploymentModel) : String {
   return """
<?xml version="1.0" encoding="UTF-8"?>
<xs:schema
 xmlns="http://www.w3.org/2001/XMLSchema"
 xmlns:xs="http://www.w3.org/2001/XMLSchema"
 xmlns:aa="${deploymentModel.serviceRootPath()}/xsd"
 elementFormDefault="unqualified"
 >
 
 ${xsdCommonElements()}
 
 ${activity.getParameters()
       .map {it.toXsdElement()}
   		.joinToString(separator = "\n")}
 
 ${activity.getInputDatasets()
       .map {it.toXsdElement()}
   		.joinToString(separator = "\n")}
 
 ${activity.getOutputDatasets()
       .map {it.toXsdElement()}
   		.joinToString(separator = "\n")}
 
</xs:schema>
""" 
}



