
\section{RESTful Interaction Model (RIM)} 
\label{section-restful-interaction-model}

This section proposes a RESTful interaction model for analysis services to support the definition of suitable interfaces and related interaction steps for these services.
The RESTful Interaction Model (RIM) for bioinformatics analysis services defines: 
\begin{enumerate*}[label=\roman*)] 
	\item a life cycle for analysis activity instances handled by such services;
	\item a number of RESTful interactions that must be performed to create, execute and retrieve the results of a general analysis activity instance; and
	\item guidelines for resource addressing and representation.
\end{enumerate*}



\subsection{Life cycle of an analysis activity instance}

%An analysis activity may be compared to a computer program: both describe the steps executed for obtain a desired result from a parametrized input whose value is only known at runtime.
%In this regard, a computational program can be instantiated (i.e., executed) multiple times as different processes that receives possibly different input sets at a time.
%Similarly, an analysis activity can also be instantiated several times over different input datasets and execution parameters, possibly yielding different (independent) output datasets.

Similarly to a process that evolves through different states of its life cycle, an analysis activity instance also evolves through a set of states during its execution.
Figure \ref{life-cycle} depicts the life cycle of a general analysis activity instance. 

\begin{figure}[ht]
	\centering
	\includegraphics[width=0.95\textwidth]{img/analysis-state-machine-no-removed}
	\caption{Life cycle of an analysis activity instance.}
	\label{life-cycle}
\end{figure}

In the \texttt{START} state the analysis activity instance does not exist.
Subsequent events create, prepare and execute the analysis activity instance, retrieving the produced output datasets.

The first event in the analysis activity instance life cycle is t/he creation of the instance.
This instance becomes an addressable concrete resource, allowing the association of datasets, execution parameters and other information to the instance.
The creation of the analysis activity instance triggers a state transition from \texttt{START} to \texttt{CREATED}.  

In the \texttt{CREATED} state, the analysis activity instance is not yet ready to be executed.
The user must submit the needed input datasets and parameters that will be used for the execution of such instance.
Only after all required datasets and parameters have been provided, the activity instance moves to the \texttt{READY} state.

A \texttt{READY} analysis activity instance can be immediately executed.
Input datasets and execution parameters can still be changed at any time before the processing begins, but not afterwards.
The start of the analysis activity instance execution triggers the transition to the \texttt{RUNNING} state.

During execution, the analysis activity instance remains in the \texttt{RUNNING} state.
When the processing of the analysis activity instance starts, the functional entity used  to support its execution is invoked.
This entity receives the associated input datasets and parameters and processes the analysis activity instance until it successfully ends, or until a processing error occurs.
Further, the user does not interact directly with the analysis activity instance:
the instance inputs cannot be changed anymore and its results are yet not available.
Thus, the user waits for the analysis activity instance execution to end, periodically polling its state using a reference resource (job handler).
Additionally, this job handler may allow the user to halt the execution of the analysis activity instance if the underlying functional entity also provides such support.

The end of the execution phase of the analysis activity instance triggers a transition to either the \texttt{SUCCEEDED} or the \texttt{FAILED} states, which indicates the successful or failed completion of the analysis activity instance execution, respectively.
In the \texttt{SUCCEEDED} state, the user can retrieve the resulting output datasets, while in the \texttt{FAILED} state the user can retrieve an error report containing some information about the causes of the failure.

At any state, the user can remove the analysis activity instance and release any related computational resources from the service. 
The removal of an analysis activity instance triggers the transition to the \texttt{FINISHED} state.
At this state, the user cannot interact with the activity instance anymore.
%This transition can also be automatically triggered by the hosting system in the case of automatic garbage collection.


\subsection{RESTful interactions}

A typical usage scenario was defined to describe the RESTful interactions performed by a user in order to create and execute an analysis activity instance. 
This scenario takes in account the conceptual/structural model of analysis services, the behavioural requirements do these services, as well as the life cycle of a analysis activity instance.

The analysis service exists independently of any analysis activity instance.
According to \cite{Fielding2002}, which specifies the HATEOAS principle for REST interfaces, in order to interact with a RESTful service a user need to know \emph{a priori} only the address for the root resource of the service.
In the responses for its user, the service must provide other URIs that may be requested in subsequent interactions in order to access other resources.
Terms of a vocabulary may be associated to the URIs provided when requesting some resource, representing relationships between the requested resource and the other service resources, as well as guiding the user during the interactions (hypermedia controls) \citep{Webber2010}.
Further, the provided URIs may be annotated using terms of some vocabulary, defining hypermedia controls \citep{Webber2010} that can represent relationships between the requested resource and the others, as well as guide the user during his interactions with the service.
Thus, following hypermedia controls, a user can use a RESTful service without \emph{a priori} knowledge of the addressing schema for its resources.


Following the HATEOAS principle, a user initiate the interaction with a RIM-compliant service using a \texttt{GET} request for the service's root resource.
The response to this request returns a URI for the collection that aggregates analysis activity instances not yet executed (collection \texttt{nonExecutedAnalysis}).
The user may not be authorized to list all resources under this collection, since may exists analysis instances for other users that he may not be allowed to discover, but he should be allowed to create and access new analysis instances on it.
Table \texttt{table-hypermedia} presents the examples of the main hypermedia controls defined to the RIM model.

\begin{table}[ht!]
	\centering
	\caption{Example of defined hypermedia controls of RIM.}
	\label{table-hypermedia}
	\begin{tabular}{p{3cm} p{3cm} p{4.5cm}}
		\hline

		Resource
		& Relation
		& Meaning
		\\ \hline

		\emph{Any}
		& \texttt{self}
		& The URI that identifies the represented resource.
		\\

		Root
		& \texttt{non-executed-instances}
		& The collection of non-executed analyses instances.
		\\

		Root
		& \texttt{succeeded-instances}
		& The collection of succeeded analyses instances.
		\\

		Root
		& \texttt{failed-instances}
		& The collection of failed analyses instances.
		\\
		
		Root
		& \texttt{jobs}
		& The collection of processing instance executions.
		\\

		Root 
		& \texttt{create-instance}
		& URI to post/create a new analysis instance.
		\\

		Analysis Instance 
		& \texttt{parameters}
		& URI of the parameters set resource.
		\\

		Analysis Instance 
		& \texttt{inputs}
		& URI of the input datasets resource.
		\\

		Analysis Instance 
		& \texttt{outputs}
		& URI of the output datasets resource.
		\\


		Analysis Instance 
		& \texttt{error-report}
		& URI of the error report resource.
		\\

		Analysis Instance 
		& \texttt{start-execution}
		& URI for submiting the analysis instance to its execution. Only provided for analysis instances in the \texttt{READY} state.
		\\

		Input/Output Dataset Collection 
		& \texttt{\emph{dataset-name}}
		& URI of the named dataset resource.
		\\

		Input/Output Dataset 
		& \texttt{item}
		& URI of one file under the dataset's collection.
		\\

		Parameter Collection 
		& \texttt{\emph{parameter-name}}
		& URI of the named parameter resource.
		\\

		\hline 
	\end{tabular}
\end{table}
 
An analysis activity instance is created after the user issues a \texttt{POST} request to the non-executed analysis instance collection.
The service validates this request and creates the new resource representing the analysis activity instance in the \texttt{CREATED} state.
Additionally, sub-resources of these instances (i.e., execution parameters and input datasets) are also created with empty or default values.
The service returns a \Created{} status code to this \texttt{POST} request, also returning the location of the created resources.

After a new analysis activity instance is created, the user must submit the execution parameters and input datasets.
Either submission can be performed with the analysis instance at both \texttt{CREATED} and \texttt{READY} states.
A state transition from \texttt{CREATED} to \texttt{READY} occurs when all parameters and datasets needed for the activity execution have been submitted.

Figure \ref{fig-seq-initializing}  depicts the interactions performed to submit execution parameter values and input datasets.  
Execution parameters usually consist of small literal datasets, so that the user can easily submit these parameters by issuing a \texttt{PUT} request containing a structured representation of the parameters to replace the values for all parameters at once.
Default parameter values can be maintained with two different approaches: 
i) the user recovers a representation of the initial parameter values through a \texttt{GET} request for the parameters URI, changes the values for the other parameters in the representation, maintaining the default values unchanged, and then returns the updated representation to the service through a \texttt{PUT} request;
ii) the user issues different \texttt{PUT} requests for each of the individual parameters URIs.
While the former demands more local operations to decode, update and encode the parameters' representation, the latter usually demands more HTTP requests.
The service return the \NoContent{} status code in case it received valid values, or \BadRequest{} otherwise.
	
Input datasets can be submitted individually through \texttt{POST} requests, since this operation is not idempotent and (semantically) creates new resources in a RESTful service \citep{Fielding2002}.
The submission of each valid dataset is answered with a  \Created{} status code, as well as the URI of the new resource.
This URI can later be used to replace the resource through a \texttt{PUT} request if needed.
Again, a \BadRequest{} status code is returned in case the service invalidates the submitted dataset.



\begin{figure}[htbp]
	\centering
	\includegraphics[width=0.7\textwidth]{img/sequence-activity-input2}
	\caption{Initialization of parameters and datasets of an analysis activity instance.}
	\label{fig-seq-initializing}
\end{figure}

After the transition from \texttt{CREATED} to \texttt{READY}, responses to the requests depicted in Figure \ref{fig-seq-initializing} also carry an URI that can be used to start the execution of the analysis activity instance.  
The execution of the analysis activity instance follows the \emph{long running request} design pattern \citep{Pautasso2014,Haupt2015}.
However, we have extended this pattern to differentiate between successful and unsuccessful executions of an analysis activity instance.


Figure \ref{fig-seq-execution} depicts the interactions performed to execute an analysis activity instance.
The user starts the execution of the analysis activity instance by issuing a \texttt{POST} request to the URI received in one of the previous responses.
The service validates the request, submits the analysis activity instance to the underlying job handler and returns the response containing the \Created{} status code and the URI of the new \texttt{InstanceExecution} resource.
Then, the user polls the state of the execution by issuing \texttt{GET} requests to this resource and observing the returned status code.
 A \OK{} status code response means that the analysis activity instance is still processing, while a \SeeOther{} status code means that the processing ended and the user must invoke the embedded URI to find the final location of the analysis activity instance and its output datasets / sub-resources.
Further, a \Gone{} status code means that the execution of the analysis activity instance failed.
In this scenario, an error report and a link to the resource created within the \texttt{failedAnalyses} collection can also be returned. 

\begin{figure}[htbp]
	\centering
	\includegraphics[width=0.7\textwidth]{img/sequence-activity-running2}
	\caption{Execution and polling of an analysis activity instance.}
	\label{fig-seq-execution}
\end{figure}

After the analysis activity instance was successfully executed, the user can issue \texttt{GET} requests on each output dataset URI to retrieve the obtained results. 
Each request is answered with a \OK{} status code and the output data in the payload. 
Similarly, the user can retrieve the error report for a failed analysis activity instance using the URI  within the \Gone{} response previously returned by the service.

Finally, the user can remove all data stored in the service related to the analysis activity instance by issuing a \texttt{DELETE} request to the URI that represents the successful/failed analysis activity resource.
This request should be answered with \OK{}.



\subsection{RESTful resource addressing and representation}
\label{section-concretization}


URIs are assigned to analysis service resources according to our conceptual model (see Figure \ref{fig-conceptual-model}).
The analysis service itself is identified by its base URI (meta-attribute \texttt{AnalysisService::uri}).
Path segments are concatenated to the service's base URI  in order to produce  the (sub-) resources URIs.
These path segments are obtained by following the composite references  in our conceptual model, starting at the \texttt{AnalysisService} element until the desired resource is reached.
Each composite reference navigated during this process concatenates its name to the URI's path.
In this sense, we have standardized the reference names as hyphen-separated lowercase words (e.g., \texttt{non-executed-instances}, \texttt{succeeded-instances}).
Further, each resource reached during this process concatenates the value in its \texttt{uid} or \texttt{name} properties to the URI path.

Figure \ref{rim-service-structure-overview} illustrates using a tree diagram, the overall schema for all URIs accessible through the interface of a RESTful Interaction Model analysis service.
The classes \texttt{NonExecutedAnalysisInstance} (\texttt{NEAI}), \texttt{SucceededAnalysisInstance} (\texttt{SAI}), \texttt{FailedAnalysisInstance} (\texttt{FAI}) and \texttt{InstanceExecution} (\texttt{IJ}) are abbreviated for conciseness purposes.
The traversal of each tree level represents the addition of a path segment to the base URI.
Italicized identifiers represent the path segment obtained from the value of the associated property.
Other (non-italicized) identifiers are added as path segments literally.
Finally, the label on the left of a rectangle represents the cardinality of the marked sub-resource at the parent resource: \texttt{1} for sub-resources with unitary cardinality and \texttt{*} for sub-resources with multiple cardinality.



\begin{figure}[hp]
%\scalebox{0.7}
\hbox{\scalebox{0.7}{
    \begin{forest}
        for tree={
            grow'=0,
            draw, 
            l sep=85,
%            s sep=100,
            fit=rectangle,%band,
            folder,
            parent anchor=south,
            font=\ttfamily,
            delay={
                edge label/.wrap value={
                node[
                   %midway,
                   above left,
                   %fill=white, 
                   font=\scriptsize\ttfamily]{#1}},
            }, 
        },    
  		[\emph{AnalysisService:uri}, %text=white, fill=blue
            [non-executed-instances,edge label=1
                [\emph{NEAI::uid},edge label=*
                	[parameters,edge label=1
                		[\emph{Parameter::name},edge label=*]
                	],
                	[inputs, edge label = 1
                		[\emph{Dataset::name},edge label=*
                			[\emph{file-id},edge label=*]
                		]
                	]
                ]
            ]
            [executions,edge label=1
            	[\emph{IE::uid},edge label=*]
            ]
            [succeeded-instances,edge label=1
                [\emph{SAI::uid},edge label=*
                	[parameters,edge label=1
                		[\emph{Parameter::name},edge label=*]
                	],
                	[inputs, edge label = 1
                		[\emph{Dataset::name},edge label=*
                			[\emph{file-id},edge label=*]
                		]
                	],
                	[outputs, edge label = 1
                		[\emph{Dataset::name},edge label=*
                			[\emph{file-id},edge label=*]
                		]
                	]
                ]
            ]
            [failed-instances,edge label=1
                [\emph{FAI::uid},edge label=*
                	[parameters,edge label=1
                		[\emph{Parameter::name},edge label=*]
                	],
                	[inputs, edge label = 1
                		[\emph{Dataset::name},edge label=*
                			[\emph{file-id},edge label=*]
                		]
                	],
                	[error-report,edge label=1]
                ]
            ]
        ]
    \end{forest}
}}
    \caption{URI schema for standard sub-resources of an RIM analysis service.}
    \label{rim-service-structure-overview}
\end{figure}




The REST principle require that a serialization format shall be provided for the representation of the RESTful resources and the exchange of information between the service and its user.
For the representation of the input/output datasets, we prescribe the use of a serialization format already recognized by the underlying tool.
However, for the representation of other RESTful resources we prescribe the use of JavaScript Object Notation (JSON) and EXtensible Markup Language (XML).

Resource URIs can be exchanged between the service and its user using the HTTP headers \texttt{Link} option and/or fields of the payload entities using the JSON Hypertext Application Language (JSON-HAL) \citep{Kelly2016} and dedicated XML structures.
The preferred representation of a URI is its non-templated absolute form.
This choice was made in order to reduce the number of user-side operations to access the service resources.


