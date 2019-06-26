package br.usp.ffclrp.dcm.lssb.activityrest;

import java.io.File;
import java.io.FileWriter;
import java.util.concurrent.Callable;

import org.eclipse.emf.common.util.URI;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import edu.uoc.som.openapi.API;
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
	
	@Parameters(index = "0", 
			description = "The OpenAPI XMI file to convert.")
	private String inputFilePath;
	
	@Parameters(index = "1",
			description = "The path for the resulting OpenAPI JSON file.")
	private String outputJsonFilePath;
	
	public static void main(String[] args) throws Exception {
		int exitCode = new CommandLine(new App()).execute(args);
		System.exit(exitCode);
	}
	
	@Override
	public Integer call() throws Exception {
		
		URI resourceUri = URI.createURI(inputFilePath);
		Root root = ModelsService.retrieveOpenApiRootFromXmi(resourceUri);
		
		OpenAPIExporter exporter = ExporterBuilder.create();
		JsonObject jsonOb = exporter.toJson(root.getApi());
		
		System.out.println(jsonOb);
		
		FileWriter writer = new FileWriter(new File(outputJsonFilePath));
		Gson gson = new Gson();
		gson.toJson(jsonOb, writer);
		writer.close();
		
		return 0;
	}
}
