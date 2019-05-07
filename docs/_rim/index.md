---
title: RESTful Interaction Model for Bioinformatics Analysis Activities
layout: default
--- 

# RESTful Interaction Model for Bioinformatics Analysis Activities 

This document is working draft for the RESTful Interaction Model for Bioinformatics Analysis Activities (RIM). RIM is documented in a number of places of my (ongooing) PhD. Thesis. The information therein is being translated and added to this new definition document. 


## Scope



## Hypermedia controls


| Resource                        | Relation           | Meaning                                                  |
| :--------                       | : ------           | :-------                                                 |
| *                               | self               | The URI of the represented resource                      |
| Root                            | new-analyses       | The collection of non-executed analyses                  |
| Root                            | succeeded-analyses | The collection of succeeded analyses                     |
| Root                            | failed-analyses    | The collection of failed analyses                        |
| Root                            | jobs               | The collection of non-executed analyses                  |
| Root                            | createAnalysis     | URI to post/create a new analysis instance               |
| Analysis Instance               | parameters         | URI of the parameters set resource                       |
| Analysis Instance               | inputs             | URI of the input datasets resource                       |
| Analysis Instance               | outputs            | URI of the output datasets resource                      |
| Analysis Instance               | outputs            | URI of the parameters set resource                       |
| Analysis Instance               | error-report       | URI of the error report resource                         |
| Analysis Instance               | startProcessing    | URI for submiting the analysis instance to its execution |
| Input/Output Dataset Collection | *dataset-name*     | Resource that represent the named dataset                |
| Input/Output Dataset            | item               | One file under the dataset                               |
| Parameter Collection            | *parameter-name*   | Resource that represent the named parameter              |
