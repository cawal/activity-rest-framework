package br.usp.ffclrp.dcm.lssb.activityrest.dao;

import br.usp.ffclrp.dcm.lssb.activityrest.dao.exceptions.AnalysisActivityCreationFailedException;
import br.usp.ffclrp.dcm.lssb.activityrest.dao.exceptions.AnalysisActivityNotFoundException;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity;

public interface ActivityRepository {
	
	/**
	 * Creates a new AnalysisActivity.
	 * 
	 * @return the ID of the created analysis activity.
	 * @throws AnalysisActivityCreationFailedException
	 */
	String create() throws AnalysisActivityCreationFailedException;
	
	/**
	 * Gets the analysis activity by its id.
	 * 
	 * @param analysisId
	 *            the string id of the analysis activity
	 * @return an analysis activity instance if found
	 * @throws AnalysisActivityNotFoundException
	 */
	AnalysisActivity get(String analysisId)
			throws AnalysisActivityNotFoundException;
	
	/**
	 * Updates the analysis activity in the persistent storage.
	 * 
	 * @param aa
	 * @throws AnalysisActivityNotFoundException
	 */
	void update(AnalysisActivity aa)
			throws AnalysisActivityNotFoundException;
	
	/**
	 * Deletes the analysis activity from the storage.
	 * 
	 * @param analysisId
	 *            the string id of the analysis activity to be deleted.
	 * @throws AnalysisActivityNotFoundException
	 */
	void delete(String analysisId)
			throws AnalysisActivityNotFoundException;
	
}