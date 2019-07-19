@file:JvmName("ActivityToWsdlTransformationService")
package br.usp.ffclrp.dcm.lssb.activityrest.wsdl

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Parameter
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Dataset
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.InputDataset
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.OutputDataset
import java.net.InetAddress




fun toWsdl(activity : Activity, deploymentModel : DeploymentModel) : String =
   """<?xml version="1.0" encoding="UTF-8"?>
<wsdl:description
	xmlns:wsdl="http://www.w3.org/ns/wsdl"
	xmlns:xs="http://www.w3.org/2001/XMLSchema"
	xmlns:whttp="http://www.w3.org/ns/wsdl/http"
	xmlns:wsdlx="http://www.w3.org/ns/wsdl-extension"
	xmlns:wrpc="http://www.w3.org/ns/wsdl/rpc"
	targetNamespace="${deploymentModel.serviceRootPath()}/wsdl"
	xmlns:tns="${deploymentModel.serviceRootPath()}/wsdl"
	xmlns:aa="${deploymentModel.serviceRootPath()}/xsd"
    >


 	${getXsdImport(deploymentModel)}

 	${getWsdlInterface(activity)}
   
 	${getWsdlBindings(activity)}

 	${getWsdlService(deploymentModel)}

</wsdl:description>
   """ 

private fun getXsdImport(deploymentModel : DeploymentModel) =
	"""<wsdl:types>
		<xs:import
			namespace="${deploymentModel.serviceRootPath()}/xsd"
			schemaLocation="./xsd" />
	</wsdl:types>
    """

private fun getWsdlInterface(activity :Activity) =
    	"""<wsdl:interface name="interface">
      <!-- ROOT RESOURCE -->
       
      <!-- NEW ANALYSES COLLECTION -->
		<wsdl:operation
			name="PostNewAnalysisActivity"
			pattern="http://www.w3.org/ns/wsdl/in-out"
			wsdlx:safe="true"
		>
			<wsdl:documentation>
				This operation creates a new analysis activity
				resource.
			</wsdl:documentation>
			<wsdl:output
				messageLabel="Out"
				element="aa:AnalysisActivity" />
		</wsdl:operation>


       <!-- NEW ANALYSIS RESOURCE -->
		<wsdl:operation
			name="GetNewAnalysisActivity"
			pattern="http://www.w3.org/ns/wsdl/in-out"
			wsdlx:safe="true"
			style="http://www.w3.org/ns/wsdl/style/iri"
		>
			<wsdl:documentation>
				This operation retrieves an analysis activity
				representation.
			</wsdl:documentation>
			<wsdl:input element="aa:ActivityIdBasedRequest" />
			<wsdl:output element="aa:AnalysisActivity" />
		</wsdl:operation>


		<wsdl:operation
			name="DeleteNewAnalysisActivity"
			pattern="http://www.w3.org/ns/wsdl/in-out"
			wsdlx:safe="false"
		>
			<wsdl:documentation>
				This operation retrieves an analysis activity
				representation.
			</wsdl:documentation>
			<wsdl:input element="aa:ActivityIdBasedRequest" />
		</wsdl:operation>
        
        
        <!-- PARAMETER SET RESOURCE -->

		<wsdl:operation
			name="GetParameterSet"
			pattern="http://www.w3.org/ns/wsdl/in-out"
			wsdlx:safe="true"
		>
			<wsdl:documentation>
				This operation retrieves a map with the values
				for all
				the parameters
				of the
				analysis activity. There are two kinds
				of parameters:
				single
				-valued an list-valued. Additionally,
				parameters
				can have values
				(or
				list-items) of a number of primitive types:
				Strings, integers,
				doubles.
			</wsdl:documentation>
			<wsdl:input element="aa:ActivityIdBasedRequest" />
			<wsdl:output element="aa:parameters" />
		</wsdl:operation>

        
        
        <!-- for each parameter, operations to set and retrieve its values -->
        <!-- create elements here -->

        
        <!-- INPUT DATASETS RESOURCE -->
        <!-- create elements here -->
        
        
        <!-- OUTPUT DATASETS RESOURCE -->
        <!-- create elements here -->

        
        
        
        <!-- JOB COLLECTION -->
		<wsdl:operation
			name="PostStartProcessing"
			pattern="http://www.w3.org/ns/wsdl/in-out"
			wsdlx:safe="true"
		>
			<wsdl:input element="aa:ActivityIdBasedRequest" />
			<wsdl:output element="aa:AnalysisActivity" />
		</wsdl:operation>


		<wsdl:operation
			name="GetPoolProcessing"
			pattern="http://www.w3.org/ns/wsdl/in-out"
			wsdlx:safe="true"
		>
			<wsdl:input element="aa:ActivityIdBasedRequest" />
			<wsdl:output element="aa:AnalysisActivity" />
		</wsdl:operation>


	</wsdl:interface>
 		"""


private fun getWsdlBindings(activity : Activity) =
    """<!-- WSDL Bindings 
       type: HTTP
    -->
	<wsdl:binding
		name="binding"
		interface="tns:interface"
		type="http://www.w3.org/ns/wsdl/http"
		whttp:methodDefault="GET"
		wsdlx:safe="true"
	>

		<wsdl:operation
			ref="tns:PostNewAnalysisActivity"
			whttp:method="POST"
			whttp:location="new-analyses"
			whttp:inputSerialization="application/xml"
			whttp:outputSerialization="application/xml"
		>
		</wsdl:operation>



		<wsdl:operation
			ref="tns:GetNewAnalysisActivity"
			whttp:method="GET"
			whttp:location="new-analyses/{id}"
			whttp:inputSerialization="application/xml"
			whttp:outputSerialization="application/xml"
		>
		</wsdl:operation>



		<wsdl:operation
			ref="tns:DeleteNewAnalysisActivity"
			whttp:method="DELETE"
			whttp:location="new-analyses/{id}"
			whttp:inputSerialization="application/xml"
			whttp:outputSerialization="application/xml"
		>
		</wsdl:operation>

        <!-- PARAMETER SET RESOURCE -->
        <!-- for each parameter, operations to set and retrieve its values -->
        <!-- create elements here -->

        
        <!-- INPUT DATASETS RESOURCE -->
        <!-- create elements here -->
        
        
        <!-- OUTPUT DATASETS RESOURCE -->
        <!-- create elements here -->

        
        <!-- job manager -->
		<wsdl:operation
			ref="tns:PostStartProcessing"
			whttp:method="POST"
			whttp:location="instances/{id}"
			whttp:inputSerialization="application/xml"
			whttp:outputSerialization="application/xml"
		>
		</wsdl:operation>


		<wsdl:operation
			ref="tns:GetPoolProcessing"
			whttp:method="GET"
			whttp:location="instances/{id}"
			whttp:inputSerialization="application/xml"
			whttp:outputSerialization="application/xml"
		>

		</wsdl:operation>





	</wsdl:binding>
 """

private fun getWsdlService(deploymentModel : DeploymentModel) =
   """<wsdl:service
		name="service"
		interface="tns:interface"
	>
		<wsdl:endpoint
			name="RootResourceHTTPEndpoint"
			binding="tns:binding"
			address="${deploymentModel.serviceRootPath()}" />
	</wsdl:service>
	""" 