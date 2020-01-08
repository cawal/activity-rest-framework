<?xml version="1.0"?>
<!-- A guide: https://www.vogella.com/tutorials/XSLT/article.html -->
<xsl:stylesheet
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:bpmn2="http://www.omg.org/spec/BPMN/20100524/MODEL"
    xmlns:bpmndi="http://www.omg.org/spec/BPMN/20100524/DI"
    xmlns:dc="http://www.omg.org/spec/DD/20100524/DC"
    xmlns:di="http://www.omg.org/spec/DD/20100524/DI" 
    xmlns:java="http://www.java.com/javaTypes" 
    xmlns:tns="http://www.jboss.org/drools" 
    xmlns="http://www.jboss.org/drools" 
	version="1.0"
>
<!--     xsi:schemaLocation="http://www.omg.org/spec/BPMN/20100524/MODEL BPMN20.xsd http://www.jboss.org/drools drools.xsd http://www.bpsim.org/schemas/1.0 bpsim.xsd"  -->
<!--     id="Definition"  -->
<!--     exporter="org.eclipse.bpmn2.modeler.core"  -->
<!--     exporterVersion="1.5.1.Final-v20190425-2005-B1"  -->
<!--     expressionLanguage="http://www.mvel.org/2.0"  -->
<!--     targetNamespace="http://www.jboss.org/drools"  -->
<!--     typeLanguage="http://www.java.com/javaTypes" -->

	<xsl:output method="xml" />

    <!-- Copy everything -->
	<xsl:template match="node()">
		<xsl:copy>
			<xsl:copy-of select="@*" />
			<xsl:apply-templates />
		</xsl:copy>
	</xsl:template>

	<xsl:template match="bpmn2:task">
	<xsl:message>teste</xsl:message>
		<bpmn2:task>
			<bpmn2:extensionElements>
				<tns:metaData name="elementname">
					<tns:metaValue>
					<xsl:value-of select="@tns:name" />
					</tns:metaValue>
				</tns:metaData>
			</bpmn2:extensionElements>
			<xsl:apply-templates />
		</bpmn2:task>
	</xsl:template>


</xsl:stylesheet>

