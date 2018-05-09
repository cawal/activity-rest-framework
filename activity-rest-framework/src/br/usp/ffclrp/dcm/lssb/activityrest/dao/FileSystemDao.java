package br.usp.ffclrp.dcm.lssb.activityrest.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;
import javax.validation.constraints.NotNull;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.NotImplementedException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import br.usp.ffclrp.dcm.lssb.activityrest.exceptions.AnalysisActivityCreationFailedException;
import br.usp.ffclrp.dcm.lssb.activityrest.exceptions.AnalysisActivityNotFoundException;
import br.usp.ffclrp.dcm.lssb.activityrest.exceptions.IllegalParameterException;
import br.usp.ffclrp.dcm.lssb.activityrest.util.ParametersUtil;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescription;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetDescription;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivityModelFactory;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Dataset;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Parameter;

public class FileSystemDao implements AnalysisActivityDao {
	
	private static final String SINGLE_FILE_DATASETS_DIR_PATH =
			"SINGLE_FILE_DATASETS";
	File localStorage;
	final protected AnalysisActivityDescription aaDesc;
	final String parametersSubpath = "/parameters.json";
	final String inputDatasetsSubpath = "/inputs/";
	final String outputDatasetsSubpath = "/outputs/";
	final String parametersTemplateResourceSubpath = "parameters-template.json";
	final String analysisStateFileSubpath = "/metadata/state";
	final String errorReportSubpath = "/errorReport";
	
	JsonbConfig jsonConfig;
	Jsonb jsonb;
	
	public FileSystemDao(
			@NotNull File localStorage,
			@NotNull AnalysisActivityDescription aaDesc) {
		
		this.localStorage = localStorage;
		this.aaDesc = aaDesc;
		
		if (!localStorage.exists()) {
			localStorage.mkdirs();
		}
		
		jsonConfig = new JsonbConfig()
				.withFormatting(true)
				.withNullValues(true);
		jsonb = JsonbBuilder.create(jsonConfig);
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.dao.AnalysisActivityDao#create()
	 */
	@Override
	public String create() throws AnalysisActivityCreationFailedException {
		
		UUID newAnalysisId = UUID.randomUUID();
		
		AnalysisActivity analysis =
				AnalysisActivityModelFactory.eINSTANCE.createAnalysisActivity();
		
		analysis.setId(newAnalysisId.toString());
		File analysisRoot = new File(localStorage, analysis.getId());
		
		
		try {
			analysisRoot.mkdirs();
			
			createParametersFile(analysisRoot);
			createInputDatasetsDirectories(analysisRoot);
			createOutputDatasetsDirectories(analysisRoot);
			createErrorReport(analysisRoot);
			
			return analysis.getId();
			
		} catch (IOException e) {
			analysisRoot.delete();
			AnalysisActivityCreationFailedException aacfe =
					new AnalysisActivityCreationFailedException();
			aacfe.initCause(e);
			throw aacfe;
		}
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.usp.ffclrp.dcm.lssb.activityrest.dao.AnalysisActivityDao#get(java.lang
	 * .String)
	 */
	@Override
	public AnalysisActivity get(String analysisId)
			throws AnalysisActivityNotFoundException {
		
		File analysisRoot = new File(localStorage, analysisId);
		
		AnalysisActivity analysis =
				AnalysisActivityModelFactory.eINSTANCE
						.createAnalysisActivity();
		analysis.setId(analysisId);
		
		setDescriptionForAnalysis(analysis);
		
		if (analysisRoot.exists()) {
			try {
				
				getParameters(analysis);
				getInputDatasets(analysis);
				getOutputDatasets(analysis);
				getErrorReport(analysis);
				
				return analysis;
				
			} catch (Exception e) {
				AnalysisActivityNotFoundException aux =
						new AnalysisActivityNotFoundException(analysisId);
				aux.setStackTrace(e.getStackTrace());
				throw aux;
			}
		} else {
			throw new AnalysisActivityNotFoundException(analysisId);
		}
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.usp.ffclrp.dcm.lssb.activityrest.dao.AnalysisActivityDao#update(br.usp
	 * .ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity)
	 */
	@Override
	public void update(AnalysisActivity aa)
			throws AnalysisActivityNotFoundException {
		
		if (aa == null)
			throw new AnalysisActivityNotFoundException(
					"analysisActivity is null");
		
		try {
			saveParameters(aa);
			saveInputDatasets(aa);
			saveOutputDatasets(aa);
			saveErrorReport(aa);
			
		} catch (Exception e) {
			throw new AnalysisActivityNotFoundException(aa.getId());
		}
		
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.usp.ffclrp.dcm.lssb.activityrest.dao.AnalysisActivityDao#delete(java.
	 * lang.String)
	 */
	@Override
	public void delete(String analysisId)
			throws AnalysisActivityNotFoundException {
		File analysisRoot = new File(localStorage, analysisId);
		try {
			FileUtils.deleteDirectory(analysisRoot);
		} catch (IOException e) {
			e.printStackTrace();
			throw new AnalysisActivityNotFoundException(analysisId);
		}
	}
	
	public File getAnalysisDirectoryInLocalStorage(String analysisId) {
		File analysisRoot = new File(localStorage, analysisId);
		return analysisRoot;
	}
	
	public AnalysisActivity moveFrom(String analysisId, FileSystemDao from)
			throws AnalysisActivityNotFoundException {
		File fromDir = from.getAnalysisDirectoryInLocalStorage(analysisId);
		File toDir = this.getAnalysisDirectoryInLocalStorage(analysisId);
		fromDir.renameTo(toDir);
		return this.get(analysisId);
	}
	
	private void setDescriptionForAnalysis(AnalysisActivity aa) {
		AnalysisActivityDescription descCopy = EcoreUtil.copy(aaDesc);
		aa.setDescription(descCopy);
		
		for (DatasetDescription dp : descCopy.getInputDatasets()) {
			Dataset d = AnalysisActivityModelFactory.eINSTANCE.createDataset();
			d.setName(dp.getName());
			d.setDescription(dp);
			aa.getInputs().add(d);
		}
		
		for (DatasetDescription dp : descCopy.getOutputDatasets()) {
			Dataset d = AnalysisActivityModelFactory.eINSTANCE.createDataset();
			d.setName(dp.getName());
			d.setDescription(dp);
			aa.getOutputs().add(d);
		}
		
	}
	
	// PARAMETERS -------------------------------------------------------------
	
	private void createParametersFile(File analysisRoot) throws IOException {
		File parametersFile =
				new File(analysisRoot, parametersSubpath);
		
		if (!parametersFile.exists()) {
			parametersFile.createNewFile();
		}
		
		// save/overwrite parameters
		Map<String, Object> parametersMap =
				ParametersUtil
						.parameterDescriptionsToMap(aaDesc.getParameters());
		
		FileWriter parametersStream = new FileWriter(parametersFile);
		
		jsonb.toJson(parametersMap, parametersStream);
		parametersStream.close();
	}
	
	private void saveParameters(AnalysisActivity aa)
			throws AnalysisActivityNotFoundException, IOException {
		File analysisRoot = getAnalysisDirectoryInLocalStorage(aa.getId());
		File parametersFile =
				new File(analysisRoot, parametersSubpath);
		
		// save parameters
		Map<String, Object> parametersMap =
				ParametersUtil.toMap(aa.getParameters());
		
		FileWriter parametersStream = new FileWriter(parametersFile);
		jsonb.toJson(parametersMap, parametersStream);
		parametersStream.close();
	}
	
	private void getParameters(AnalysisActivity aa)
			throws AnalysisActivityNotFoundException {
		File analysisRoot = getAnalysisDirectoryInLocalStorage(aa.getId());
		File parametersFile =
				new File(analysisRoot, parametersSubpath);
		
		// create parameters with default values
		// TODO: move for better place
		aa.getParameters().clear();
		for (ParameterDescription pp : aa.getDescription().getParameters()) {
			Parameter p =
					AnalysisActivityModelFactory.eINSTANCE.createParameter();
			p.setName(pp.getName());
			p.getValues().addAll(pp.getDefaultValue());
			p.setDescription(pp);
			aa.getParameters().add(p);
		}
		
		// get values from file
		try {
			
			Jsonb jsonb = JsonbBuilder.create();
			System.out.println(parametersFile);
			@SuppressWarnings("unchecked")
			Map<String, Object> parametersSet = jsonb
					.fromJson(new FileReader(parametersFile),
							Map.class);
			
			System.out.println(parametersSet);
			System.out.println("chamando função");
			ParametersUtil.setParametersFromMap(aa, parametersSet);

		} catch (FileNotFoundException | IllegalParameterException e) {
//		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new AnalysisActivityNotFoundException(aa.getId());
		}
		
	}
	
	// INPUT DATASETS ----------------------------------------------------------
	
	private void createInputDatasetsDirectories(File analysisRoot) {
		File inputSubdirectory =
				new File(analysisRoot, inputDatasetsSubpath);
		if (!inputSubdirectory.exists()) {
			inputSubdirectory.mkdir();
		}
		
		for (DatasetDescription dp : aaDesc.getInputDatasets()) {
			
			switch (dp.getDatasetKind()) {
			case FILE_COLLECTION: // files are inside a dir with the dataset
									// name
				File datasetSubdirectory =
						new File(inputSubdirectory, dp.getName());
				datasetSubdirectory.mkdirs();
				break;
			
			case SINGLE_FILE: // file has the dataset name
				File singleFileDatasetDir =
						new File(inputSubdirectory,
								SINGLE_FILE_DATASETS_DIR_PATH);
				singleFileDatasetDir.mkdirs();
				break;
			default:
				throw new NotImplementedException(
						"Must provide implementation for "
								+ dp.getDatasetKind()
								+ " at " + Thread.currentThread());
			}
		}
	}
	
	private void getInputDatasets(AnalysisActivity aa)
			throws AnalysisActivityNotFoundException {
		
		clearDatasetsFiles(aa.getInputs());
		
		File inputDatasetsDirectory =
				new File(getAnalysisDirectoryInLocalStorage(aa.getId()),
						inputDatasetsSubpath);
		
		for (DatasetDescription dp : aa.getDescription().getInputDatasets()) {
			Dataset dataset = aa.inputDatasetForName(dp.getName());
			
			switch (dp.getDatasetKind()) {
			case FILE_COLLECTION: // files are inside a dir with the dataset
									// name
				File[] files = new File(inputDatasetsDirectory, dp.getName())
						.listFiles();
				dataset.getFiles().addAll(Arrays.asList(files));
				break;
			
			case SINGLE_FILE: // file has the dataset name
				File singleFileDatasetDir =
						new File(inputDatasetsDirectory,
								SINGLE_FILE_DATASETS_DIR_PATH);
				File datasetFile =
						new File(singleFileDatasetDir, dataset.getName());
				dataset.getFiles().add(datasetFile);
				break;
			default:
				System.err.println("Must provide implementation for "
						+ dp.getDatasetKind()
						+ " at "
						+ Thread.currentThread().getStackTrace().toString());
				break;
			}
		}
		
	}
	
	private void saveInputDatasets(AnalysisActivity aa)
			throws AnalysisActivityNotFoundException {
		try {
			File analysisRoot = getAnalysisDirectoryInLocalStorage(aa.getId());
			
			createInputDatasetsDirectories(analysisRoot);
			File inputSubdirectory =
					new File(analysisRoot, inputDatasetsSubpath);
			
			for (DatasetDescription dp : aaDesc.getInputDatasets()) {
				
				Dataset dataset = aa.inputDatasetForName(dp.getName());
				
				switch (dp.getDatasetKind()) {
				case FILE_COLLECTION: // files are inside a dir with the dataset
										// name
					File datasetSubdirectory =
							new File(inputSubdirectory, dp.getName());
					for (int i = 0; i < dataset.getFiles().size(); i++) {
						File f = dataset.getFiles().get(i);
						File expectedFile =
								new File(datasetSubdirectory, f.getName());
						
						if (!f.getAbsolutePath()
								.equalsIgnoreCase(
										expectedFile.getAbsolutePath())) {
							Files.move(f.toPath(), expectedFile.toPath());
							dataset.getFiles().remove(i);
							dataset.getFiles().add(expectedFile);
							
						}
					}
					break;
				
				case SINGLE_FILE: // file has the dataset name
					File singleFileDatasetDir =
							new File(inputSubdirectory,
									SINGLE_FILE_DATASETS_DIR_PATH);
					File singleFile = dataset.getFiles().get(0);
					if (singleFile != null) {
						File expectedFile =
								new File(singleFileDatasetDir, dp.getName());
						if (!singleFile.getAbsolutePath()
								.equalsIgnoreCase(
										expectedFile.getAbsolutePath())) {
							Files.move(singleFile.toPath(),
									expectedFile.toPath());
						}
						dataset.getFiles().remove(0);
						dataset.getFiles().add(expectedFile);
					}
					break;
				default:
					System.err.println("Must provide implementation for "
							+ dp.getDatasetKind()
							+ " at " + Thread.currentThread().getStackTrace()
									.toString());
					break;
				}
				
			}
			
			// reloadInputDatasetsFiles(aa);
			
		} catch (IOException e) {
			e.printStackTrace();
			throw new AnalysisActivityNotFoundException(aa.getId());
		}
		
	}
	
	private void clearDatasetsFiles(EList<Dataset> datasets) {
		for (Dataset d : datasets) {
			d.getFiles().clear();
		}
		
	}
	
	// OUTPUT DATASETS ---------------------------------------------------------
	
	private void getOutputDatasets(AnalysisActivity aa)
			throws AnalysisActivityNotFoundException {
		
		File outputDatasetsDirectory =
				new File(getAnalysisDirectoryInLocalStorage(aa.getId()),
						outputDatasetsSubpath);
		
		clearDatasetsFiles(aa.getOutputs());
		
		for (DatasetDescription dp : aa.getDescription().getOutputDatasets()) {
			
			Dataset dataset = aa.outputDatasetForName(dp.getName());
			
			switch (dp.getDatasetKind()) {
			case FILE_COLLECTION: // files are inside a dir with the dataset
									// name
				File datasetDir =
						new File(outputDatasetsDirectory, dp.getName());
				datasetDir.mkdirs();
				File[] files = datasetDir.listFiles();
				dataset.getFiles().addAll(Arrays.asList(files));
				break;
			
			case SINGLE_FILE: // file has the dataset name
				
				File singleFileDatasetDir =
						new File(outputDatasetsDirectory,
								SINGLE_FILE_DATASETS_DIR_PATH);
				singleFileDatasetDir.mkdirs();
				File datasetFile =
						new File(singleFileDatasetDir, dataset.getName());
				dataset.getFiles().add(datasetFile);
				break;
			
			default:
				throw new NotImplementedException(
						"Must provide implementation for "
								+ dp.getDatasetKind()
								+ " at " + Thread.currentThread());
			}
		}
		
	}
	
	private void createOutputDatasetsDirectories(File analysisRoot) {
		File outputSubdirectory =
				new File(analysisRoot, inputDatasetsSubpath);
		if (!outputSubdirectory.exists()) {
			outputSubdirectory.mkdir();
		}
		
		for (DatasetDescription dp : aaDesc.getOutputDatasets()) {
			
			switch (dp.getDatasetKind()) {
			case FILE_COLLECTION: // files are inside a dir with the dataset
									// name
				File datasetSubdirectory =
						new File(outputSubdirectory, dp.getName());
				datasetSubdirectory.mkdirs();
				break;
			
			case SINGLE_FILE: // file has the dataset name
				File singleFileDatasetDir =
						new File(outputSubdirectory,
								SINGLE_FILE_DATASETS_DIR_PATH);
				singleFileDatasetDir.mkdirs();
				break;
			default:
				throw new NotImplementedException(
						"Must provide implementation for "
								+ dp.getDatasetKind()
								+ " at " + Thread.currentThread());
			}
		}
	}
	
	private void saveOutputDatasets(AnalysisActivity aa)
			throws AnalysisActivityNotFoundException {
		try {
			File analysisRoot = getAnalysisDirectoryInLocalStorage(aa.getId());
			
			createOutputDatasetsDirectories(analysisRoot);
			File outputSubdirectory =
					new File(analysisRoot, outputDatasetsSubpath);
			
			for (DatasetDescription dp : aaDesc.getOutputDatasets()) {
				
				Dataset dataset = aa.outputDatasetForName(dp.getName());
				
				switch (dp.getDatasetKind()) {
				case FILE_COLLECTION: // files are inside a dir with the dataset
										// name
					File datasetSubdirectory =
							new File(outputSubdirectory, dp.getName());
					for (int i = 0; i < dataset.getFiles().size(); i++) {
						File f = dataset.getFiles().get(i);
						File expectedFile =
								new File(datasetSubdirectory, f.getName());
						
						if (!f.getAbsolutePath()
								.equalsIgnoreCase(
										expectedFile.getAbsolutePath())) {
							Files.move(f.toPath(), expectedFile.toPath());
							dataset.getFiles().remove(i);
							dataset.getFiles().add(expectedFile);
							
						}
					}
					break;
				
				case SINGLE_FILE: // file has the dataset name
					File singleFileDatasetDir =
							new File(outputSubdirectory,
									SINGLE_FILE_DATASETS_DIR_PATH);
					File singleFile = dataset.getFiles().get(0);
					if (singleFile != null) {
						File expectedFile =
								new File(singleFileDatasetDir, dp.getName());
						if (singleFile.exists()
								&& !singleFile.getAbsolutePath()
										.equalsIgnoreCase(expectedFile
												.getAbsolutePath())) {
							
							Files.move(singleFile.toPath(),
									expectedFile.toPath());
						}
						dataset.getFiles().remove(0);
						dataset.getFiles().add(expectedFile);
					}
					break;
				default:
					System.err.println("Must provide implementation for "
							+ dp.getDatasetKind()
							+ " at " + Thread.currentThread().getStackTrace()
									.toString());
					break;
				}
				
			}
			
			// reloadInputDatasetsFiles(aa);
			
		} catch (IOException e) {
			e.printStackTrace();
			throw new AnalysisActivityNotFoundException(aa.getId());
		}
		
	}
	
	// ERROR REPORT
	// --------------------------------------------------------------
	private void createErrorReport(File analysisRoot) throws IOException {
		
		File errorReportFile = new File(analysisRoot, errorReportSubpath);
		if (!errorReportFile.exists())
			errorReportFile.createNewFile();
	}
	
	private void getErrorReport(AnalysisActivity aa)
			throws AnalysisActivityNotFoundException, IOException {
		
		File analysisRoot = this.getAnalysisDirectoryInLocalStorage(aa.getId());
		File errorReportFile = new File(analysisRoot, errorReportSubpath);
		aa.setErrorReport(errorReportFile);
		
	}
	
	private void saveErrorReport(AnalysisActivity aa)
			throws AnalysisActivityNotFoundException, IOException {
		
		File analysisRoot = this.getAnalysisDirectoryInLocalStorage(aa.getId());
		File expectedFile = new File(analysisRoot, errorReportSubpath);
		
		if (!aa.getErrorReport().getAbsolutePath()
				.equalsIgnoreCase(expectedFile.getAbsolutePath())) {
			Files.move(aa.getErrorReport().toPath(), expectedFile.toPath());
			aa.setErrorReport(expectedFile);
		}
	}
	
	
}
