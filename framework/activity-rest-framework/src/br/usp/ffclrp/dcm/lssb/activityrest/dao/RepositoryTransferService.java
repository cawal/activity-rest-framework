package br.usp.ffclrp.dcm.lssb.activityrest.dao;

import br.usp.ffclrp.dcm.lssb.activityrest.dao.exceptions.AnalysisActivityNotFoundException;
import br.usp.ffclrp.dcm.lssb.activityrest.dao.exceptions.AnalysisActivityUpdateFailure;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity;

public class RepositoryTransferService {
	
	/**
	 * Move an activity instance from a repository to another.
	 * @param id the id of the instance in the `from` repository 
	 * @param from the repository to remove the activity
	 * @param to the repository to include the activity
	 * @throws AnalysisActivityNotFoundException if the activity instance
	 *  is not found in the `from`repository
	 * @throws AnalysisActivityUpdateFailure if the activity instance cannot be 
	 * created at the `to` repository 
	 */
	public static void moveInstance(String id, 
			ActivityRepository from, 
			ActivityRepository to) throws AnalysisActivityNotFoundException, AnalysisActivityUpdateFailure {
		
		AnalysisActivity instance = from.get(id);
		to.save(instance);//
		from.delete(id);
		
	}
}
