package br.usp.ffclrp.dcm.lssb.activityrest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Callable;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

/**
 * Reads a AADL description and transforms it in a AADL XMI file.
 * @author cawal
 *
 */
@Command(description = "Reads a AADL description and transforms it in a AADL XMI file.")
public class App implements Callable<Integer> {

	@Parameters(index = "0",
			description = "The path of a directory were the AADL descriptions will be looked for.",
			paramLabel = "input_directory")
	private File inputAADLDirectory;
	

	@Parameters(index = "1",
			description = "The path of a directory were the AADL descriptions will be looked for.",
			paramLabel = "output_directory")
	private File outputXMIDirectory;
	
	
	public static void main(String[] args) throws Exception {
		int exitCode = new CommandLine(new App()).execute(args);
		System.exit(exitCode);
	}

	@Override
	public Integer call() throws Exception {
		if(inputAADLDirectory.exists() && inputAADLDirectory.isDirectory()) {

			outputXMIDirectory.mkdirs();
			
			Arrays.asList(inputAADLDirectory.listFiles()).stream()
				.filter(f -> f.getName().endsWith("aadl"))
				.forEachOrdered(this::transformFile);
			
			return 0;
		} else {
			return 1;
		}
	}

	private void transformFile(File input){
		
		try (InputStream aadlSource = new FileInputStream(input);) {
		
			Activity aadlModel = ModelsService.retrieveAADLModel(aadlSource);
			String outputPath = outputXMIDirectory.getPath() 
					+"/"+ input.getName().replaceAll("\\.aadl", ".xmi");
			
			ModelsService.writeAADLModelToXmi(aadlModel, outputPath);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
}
