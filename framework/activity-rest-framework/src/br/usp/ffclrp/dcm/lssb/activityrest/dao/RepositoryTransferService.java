package br.usp.ffclrp.dcm.lssb.activityrest.dao;

import br.usp.ffclrp.dcm.lssb.activityrest.dao.exceptions.AnalysisActivityNotFoundException;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity;

public class RepositoryTransferService {
	
	/*public static void moveInstance(String id, 
			ActivityRepository from, 
			ActivityRepository to) throws AnalysisActivityNotFoundException {
		
		AnalysisActivity instance = from.get(id);
		//to.save(instance);//
		from.delete(id);
		
	}*/
	
	
	public static AnalysisActivity moveInstance(String id, 
			FileSystemActivityRepository from, 
			FileSystemActivityRepository to) throws AnalysisActivityNotFoundException {
		return to.moveFrom(id, from);
	}
	
}
