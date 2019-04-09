#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import br.usp.ffclrp.dcm.lssb.activityrest.dao.FileSystemRepositoryProperties;

public class FileSystemDaoPropertiesImpl implements FileSystemRepositoryProperties {

	public FileSystemDaoPropertiesImpl() {
		super();
	}

	@Override
	public String getNonExecutedAnalysesRootDirectory() {
		return "/tmp/${artifactId}/new-analyses";
	}

	@Override
	public String getSucceededAnalysesRootDirectory() {
		return "/tmp/${artifactId}/succeeded-analyses";
	}

	@Override
	public String getFailedAnalysesRootDirectory() {
		return "/tmp/${artifactId}/failed-analyses";
	}

	@Override
	public String getRunningAnalysesRootDirectory() {
		return "/tmp/${artifactId}/running-analyses";
	}
	
}
