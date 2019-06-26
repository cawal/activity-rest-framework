package br.usp.ffclrp.dcm.lssb.activityrest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.util.Arrays;
import java.util.concurrent.Callable;

import org.eclipse.emf.common.util.URI;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity;
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
	
	public static void main(String[] args) throws Exception {
		int exitCode = new CommandLine(new App()).execute(args);
		System.exit(exitCode);
	}
	
	@Override
	public Integer call() throws Exception {
		
		if (inputAADLDirectory.exists() && inputAADLDirectory.isDirectory()) {
			
			outputJSONDirectory.mkdirs();
			Arrays.asList(inputAADLDirectory.listFiles()).stream()
					.filter(f -> f.getName().endsWith(".xmi"))
					.forEachOrdered(this::transformOpenApiXmiToJsonFile);
			
			return 0;
			
		} else {
			return 1;
		}
		
	}
	
	private void transformOpenApiXmiToJsonFile(File input) {
		
		try (InputStream aadlSource = new FileInputStream(input);) {
			
			URI resourceUri = URI.createURI(input.getPath());
			Root root = ModelsService.retrieveOpenApiRootFromXmi(resourceUri);
			
			OpenAPIExporter exporter = ExporterBuilder.create();
			JsonObject jsonOb = exporter.toJson(root.getApi());
			
			System.out.println(jsonOb);
			
			String newFileName = input.getName()
					.replaceAll("\\.xmi", ".json");
			
			FileWriter writer = new FileWriter(new File(outputJSONDirectory,newFileName));
			Gson gson = new Gson();
			gson.toJson(jsonOb, writer);
			writer.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
}
