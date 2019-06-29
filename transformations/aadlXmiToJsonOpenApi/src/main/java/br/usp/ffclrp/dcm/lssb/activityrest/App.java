package br.usp.ffclrp.dcm.lssb.activityrest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import edu.uoc.som.openapi.Root;
import edu.uoc.som.openapi.io.ExporterBuilder;
import edu.uoc.som.openapi.io.OpenAPIExporter;
import picocli.CommandLine;
import picocli.CommandLine.Parameters;

/**
 * Hello world!
 *
 */
public class App implements Callable<Integer> {
	
	/*
	 * @Parameters(index = "0",
	 * description = "The OpenAPI XMI file to convert.")
	 * private String inputFilePath;
	 * 
	 * @Parameters(index = "1",
	 * description = "The path for the resulting OpenAPI JSON file.")
	 * private String outputJsonFilePath;
	 * 
	 */
	
	@Parameters(index = "0",
			description = "The path of a directory were the AADL XMI "
					+ "(*.xmi) will be looked for.",
			paramLabel = "input_directory")
	private File inputAADLDirectory;
	
	@Parameters(index = "1",
			description = "The path of a directory were the Open API Json "
					+ "files will be written.",
			paramLabel = "output_directory")
	private File outputJSONDirectory;
	
	private boolean verbose = false;
	
	public static void main(String[] args) throws Exception {
		int exitCode = new CommandLine(new App()).execute(args);
		System.exit(exitCode);
	}
	
	@Override
	public Integer call() throws Exception {
		if (inputAADLDirectory.exists() && inputAADLDirectory.isDirectory()) {
			
			outputJSONDirectory.mkdirs();
			for(File f : inputAADLDirectory.listFiles()) {
				if(f.getName().endsWith(".xmi"))
					transformOpenApiXmiToJsonFile(f);
			}
			return 0;
			
		} else {
			return 1;
		}
		
	}
	
	private void transformOpenApiXmiToJsonFile(File aadlXmi) {
		
		System.out.println("Transforming : " + aadlXmi.getName());
		try  {
			File tempFile = File.createTempFile(
					aadlXmi.getName().replaceAll("\\.xmi","")
					,".xmi");
			
			IProgressMonitor monitor = null;
			InputStream aadlSource = new FileInputStream(aadlXmi);
			OutputStream openapiTarget = new FileOutputStream(tempFile);
			
			TransformationService.aadl2OpenAPI(aadlSource, openapiTarget, monitor);
			openapiTarget.close();
			
			String newFileName = aadlXmi.getName()
				.replaceAll("\\.xmi", ".json");
			File openapiJson = new File(outputJSONDirectory,newFileName);
			openapiXmi2Json(tempFile, openapiJson);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	private void openapiXmi2Json(File openapiXmi,File openapiJson) throws IOException {
		URI resourceUri = URI.createURI(openapiXmi.getPath());
		Root root = ModelsService.retrieveOpenApiRootFromXmi(resourceUri);
		
		OpenAPIExporter exporter = ExporterBuilder.create();
		JsonObject jsonOb = exporter.toJson(root.getApi());
		
		log(jsonOb.toString());
		
		FileWriter writer = new FileWriter(openapiJson);
		Gson gson = new Gson();
		gson.toJson(jsonOb, writer);
		writer.close();
	}
	
	private void log(String s){ if(verbose) System.out.println(s);}
}
