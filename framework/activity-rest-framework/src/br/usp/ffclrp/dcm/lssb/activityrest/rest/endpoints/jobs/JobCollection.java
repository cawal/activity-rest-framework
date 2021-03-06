package br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.jobs;

import br.usp.ffclrp.dcm.lssb.activityrest.dao.ActivityRepository;
import br.usp.ffclrp.dcm.lssb.activityrest.dao.FileSystemActivityRepository;
import br.usp.ffclrp.dcm.lssb.activityrest.dao.RepositoryTransferService;
import br.usp.ffclrp.dcm.lssb.activityrest.dao.exceptions.AnalysisActivityNotFoundException;
import br.usp.ffclrp.dcm.lssb.activityrest.dao.exceptions.AnalysisActivityUpdateFailure;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.validation.ValidationService;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.Job;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.JobFactory;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.JobManager;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.JobState;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.exceptions.JobCreationFail;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.exceptions.JobNotFoundException;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.impl.JobFactoryImpl;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.jobs.exceptions.JobCantStartException;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.representations.AnalysisActivityRepresentation;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.representations.AnalysisActivityStateRepresentation;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity;
import org.apache.commons.io.FileUtils;

import javax.inject.Singleton;
import javax.ws.rs.*;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.*;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.sse.Sse;
import javax.ws.rs.sse.SseEventSink;
import java.io.File;
import java.net.URI;

@Singleton
public class JobCollection {

    @Context
    UriInfo uriInfo;
    Activity activityDescription;

    ActivityRepository nonExecutedDao;
    FileSystemActivityRepository runningDao;
    ActivityRepository succeededDAO;
    ActivityRepository failedDAO;
    JobManager jobManager;
	URI absolutePathURI;

    public JobCollection(Activity activityDescription,
                         UriInfo uriInfo,
                         ActivityRepository nonExecutedAnalysisActivityDao,
                         FileSystemActivityRepository runningAnalysisActivityDao,
                         ActivityRepository succeededAnalysisActivityDao,
                         ActivityRepository failedAnalysisActivityDao,
                         JobManager jobManager) {

        this.activityDescription = activityDescription;
        this.uriInfo = uriInfo;
        this.nonExecutedDao = nonExecutedAnalysisActivityDao;
        this.runningDao = runningAnalysisActivityDao;
        this.succeededDAO = succeededAnalysisActivityDao;
        this.failedDAO = failedAnalysisActivityDao;
        this.jobManager = jobManager;
    }


    @POST
    @Path("{analysisID}")
    public Response
    startProcessing(@PathParam("analysisID") String analysisId) {
        try {
            AnalysisActivity analysis =
                    nonExecutedDao.get(analysisId);

            if (ValidationService.isReady(analysis)) {
                // if analysis is ready, move it for the directory of executing
                RepositoryTransferService.moveInstance(analysis.getId(),
                        nonExecutedDao, runningDao);

                // get the new location
                analysis = runningDao.get(analysisId);
                File workingDirectory =
                        runningDao
                                .getAnalysisDirectoryInLocalStorage(analysisId);


                // create the job
                JobFactory jobFactory = new JobFactoryImpl();
                Job job = jobFactory.createJob(analysis,
                        analysis.getDescription().getFunctionalEntity(),
                        workingDirectory);

                // register a observer to move the job to the correct
                // collection after it is finished
                MoveInstanceJobObserver observer = new MoveInstanceJobObserver(
                        nonExecutedDao,
                        runningDao,
                        succeededDAO,
                        failedDAO);
                job.addObserver(observer);
                System.err.println("job");
                System.err.println(job);

                // start the analysis job or send a batch job and return the
                // link for polling
                jobManager.submit(analysisId, job);

                System.err.println("submeteu");

                URI jobURI = uriInfo.getAbsolutePath();

                Link pollingEventsURI =
                        Link.fromUri(getUriForPollingEvents(analysisId))
                                .rel("polling-events")
                                .build();


                AnalysisActivityRepresentation representation =
                        new AnalysisActivityRepresentation(analysisId,
                                AnalysisActivityStateRepresentation.RUNNING);

                System.err.println(pollingEventsURI);
                return Response.created(jobURI).links(pollingEventsURI).entity(representation).build();

            } else { // if analysis is not ready, return BAD REQUEST
                Throwable t = new JobCantStartException(analysis);
                throw new BadRequestException(t);
            }
        } catch (AnalysisActivityNotFoundException
                | br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.exceptions.JobCantStartException e) {
            throw new NotFoundException(e);
        } catch (JobCreationFail e) {
            e.printStackTrace();
            throw new ServerErrorException(Status.INTERNAL_SERVER_ERROR, e);
        } catch (AnalysisActivityUpdateFailure e) {
            e.printStackTrace();
            throw new ServerErrorException(Status.INTERNAL_SERVER_ERROR, e);
        }
    }

    /**
     * Pooling of the job
     *
     * @param analysisId
     * @return
     */
    @GET
    @Path("{analysisID}")
    public Response
    poolProcessing(@PathParam("analysisID") String analysisId) {

        try {
            JobState jobState = jobManager.getState(analysisId);

            switch (jobState) {
                case RUNNING:
                    return responseForExecutingJob(analysisId);
                case SUCCEEDED:
                    return processSucceededJob(analysisId);
                case FAILED:
                    return processFailedJob(analysisId);

                default:
                    throw new NotFoundException();
            }

        } catch (JobNotFoundException e) {
            throw new NotFoundException();
        }
    }


    /**
     * Register cliente to receive server sent events
     * about the activity states.
     *
     * @param analysisId The activity ID
     * @param eventSink  Injected by JAX-RS
     * @param sse        Injected by JAX-RS
     */
    @GET
    @Path("{analysisId}/events")
    @Produces(MediaType.SERVER_SENT_EVENTS)
    public void registerClientToJobEvents(
            @PathParam("analysisId") String analysisId,
            @Context SseEventSink eventSink,
            @Context  Sse sse) {

        System.err.println("Starting SSE for " + analysisId);

        try {
            Sse s = sse;
            System.err.println("S");
            System.err.println(s);
            System.err.println("SSE");
            System.err.println(sse);
            System.err.println("event sink => '");
            System.err.println(eventSink);

            Job job = jobManager.getJob(analysisId);
            SSENotifierJobObserver observer =
                    new SSENotifierJobObserver(eventSink, sse, uriInfo);
            // add observer if activity not ended, provide event otherwise
            if (job.getState() == JobState.RUNNING
                    || job.getState() == JobState.CREATED) {
                job.addObserver(observer);
                observer.notifyState(job);

                System.err.println(sse);
                System.err.println("Adicionou o observer");
            } else {
                observer.notifyState(job);

            }

        } catch (JobNotFoundException e) {
            throw new NotFoundException(e);
        }
    }


    @DELETE
    @Path("{analysisID}")
    public Response
    cancelProcessing(@PathParam("analysisID") String analysisId) {

        try {
            JobState jobState = jobManager.getState(analysisId);
            switch (jobState) {
                case RUNNING:
                    return tryToCancelAndReturnResponse(analysisId);
                default:
                    throw new NotFoundException();
            }
        } catch (JobNotFoundException e) {
            e.printStackTrace();
            throw new NotFoundException();
        }
    }

    private Response tryToCancelAndReturnResponse(String analysisId) {

        try {
            jobManager.cancel(analysisId);
            RepositoryTransferService.moveInstance(analysisId, runningDao,
                    nonExecutedDao);
            URI analysisURI = uriInfo.getBaseUriBuilder()
                    .path("non-executed-instances")
                    .path(analysisId)
                    .build();

            return Response.seeOther(analysisURI).build();
        } catch (Throwable e) {
            throw new ServerErrorException(510);
        }
    }

    private void moveAnalysisActivityForSuceeededCollection(String analysisId)
            throws AnalysisActivityUpdateFailure {
        try {
            AnalysisActivity analysis = runningDao.get(analysisId);
            RepositoryTransferService.moveInstance(analysis.getId(), runningDao,
                    succeededDAO);
        } catch (AnalysisActivityNotFoundException e) {
            // already moved? do nothing
        }
    }

    private void moveAnalysisActivityForFailedCollection(String analysisId)
            throws AnalysisActivityUpdateFailure {
        try {
            AnalysisActivity analysis = runningDao.get(analysisId);
            RepositoryTransferService.moveInstance(analysis.getId(), runningDao,
                    failedDAO);

        } catch (AnalysisActivityNotFoundException e) {
            // already moved, do nothing
        }
    }

    private Response responseForExecutingJob(String analysisId) {

        AnalysisActivityRepresentation representation =
                new AnalysisActivityRepresentation(analysisId,
                        AnalysisActivityStateRepresentation.RUNNING);

        return Response.ok()
                .entity(representation)
                .links()
                .build();
    }

    private Response processFailedJob(String analysisId) {

        try {

            moveAnalysisActivityForFailedCollection(analysisId);

            AnalysisActivity analysis = failedDAO.get(analysisId);
            File errorReportFile = analysis.getErrorReport();
            String errorReport =
                    FileUtils.readFileToString(errorReportFile);

            // create representation
            AnalysisActivityRepresentation representation =
                    new AnalysisActivityRepresentation(
                            analysisId,
                            AnalysisActivityStateRepresentation.FAILED);
            representation.setErrorReport(errorReport);

            URI failedURI = uriInfo.getBaseUriBuilder()
                    .path("failed-instances")
                    .path(analysisId)
                    .build();

            Link failedLink = Link.fromUri(failedURI)
                    .rel("failedInstance")
                    .build();

            return Response.status(Status.GONE)
                    .links(failedLink)
                    .entity(representation)
                    .build();

        } catch (Exception e) {
            throw new ServerErrorException(500);
        }

    }

    private Response processSucceededJob(String analysisId) {

        try {
            moveAnalysisActivityForSuceeededCollection(analysisId);

            URI succeededURI = uriInfo.getBaseUriBuilder()
                    .path("succeeded-instances")
                    .path(analysisId)
                    .build();

            return Response.seeOther(succeededURI).build();

        } catch (AnalysisActivityUpdateFailure e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new ServerErrorException(500);
        }
    }

    private URI getUriForPollingEvents(String analysisId) {
        System.err.println(analysisId);
        URI uri = uriInfo.getBaseUriBuilder()
                .path("executions")
                .path(analysisId)
                .path("events")
                .build();
        System.err.println(uri);
        return uri;
    }


}
