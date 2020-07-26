# DAVID Chart Report

**DAVID Chart Report** is a RESTful semantic web service that allows the enrichment analysis of gene expression data. This service is implemented as a wrapper for a Python executable that invokes the SOAP-based DAVID web service. The enrichment analysis of gene expression data is carried out in this service using the Fisher's Exact statistical test. Further documentation about the SOAP-based DAVID web service can be found [here](https://david.ncifcrf.gov/content.jsp?file=WS.html)


## Generating WSDL files (not working: was limiting the construction of the service)

The [Axis2's Java2WSDL Maven plugin](https://axis.apache.org/axis2/java/core/tools/maven-plugins/maven-java2wsdl-plugin.html) is used for the generation of WSDL descriptions from the Java classes. In order to generate the WSDL files, use the following command in the root parent pom:

```bash
mvn process-classes 
```

Lately, these WSDL description must be united in a single document. (WIP)


Previously, the command to generate WSDL description was:
```bash 
mvn process-classes axis2:java2wsdl@root-resource axis2:java2wsdl@new-analyses-collection axis2:java2wsdl@succeeded-analyses-collection axis2:java2wsdl@failed-analyses-collection axis2:java2wsdl@job-manager

```
