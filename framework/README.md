# Activity-REST
[![CircleCI](https://circleci.com/gh/cawal/Activity-REST.svg?style=svg&circle-token=7037acaf2b97687ed15fdee570066962f365b307)](https://circleci.com/gh/cawal/Activity-REST)


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
