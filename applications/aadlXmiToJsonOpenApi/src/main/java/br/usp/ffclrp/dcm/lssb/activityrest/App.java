package br.usp.ffclrp.dcm.lssb.activityrest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
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

	private static final int SUCCEEDED_CODE = 0;
	private static final int FILE_NOT_FOUND_CODE = 1;
	private static final int IO_EXCEPTION_CODE = 2;
	private static final int UNKNOWN_FAILURE_CODE = 255;

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
			for (File f : Arrays.asList(inputAADLDirectory.listFiles())) {
				
				String newFileName = f.getName()
						.replaceAll("\\.xmi", ".json");
				File tempFile = transformActivityXmiToOpenApiXmi(f);
				transformOpenApiXmiToJsonFile(tempFile, newFileName);
				
			}
			
			return SUCCEEDED_CODE;
			
		} else {
			return UNKNOWN_FAILURE_CODE;
		}
		
	}
	
	private File transformActivityXmiToOpenApiXmi(File aadlXmi) {
		
		try {
			System.out.println("Transforming : " + aadlXmi.getName());
			File tempFile = File.createTempFile(
					aadlXmi.getName().replaceAll("\\.xmi", ""), ".xmi");
			
			IProgressMonitor monitor = null;
			InputStream aadlSource = new FileInputStream(aadlXmi);
			OutputStream openapiTarget = new FileOutputStream(tempFile);
			
			TransformationService.aadl2OpenAPI(aadlSource, openapiTarget, monitor);
			openapiTarget.flush();
			openapiTarget.close();
			return tempFile;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(FILE_NOT_FOUND_CODE);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(IO_EXCEPTION_CODE);
		}
		return null;
		
	}
	
	private void transformOpenApiXmiToJsonFile(File input, String newFileName) {
		
		try (InputStream aadlSource = new FileInputStream(input);) {
			
			URI resourceUri = URI.createURI(input.getPath());
			Root root = ModelsService.retrieveOpenApiRootFromXmi(resourceUri);
			
			OpenAPIExporter exporter = ExporterBuilder.create();
			JsonObject jsonOb = exporter.toJson(root.getApi());
			
			System.out.println(jsonOb);
			

			
			FileWriter writer =
					new FileWriter(new File(outputJSONDirectory, newFileName));
			Gson gson = new Gson();
			gson.toJson(jsonOb, writer);
			writer.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
}
