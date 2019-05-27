---
title: Activity-REST Framework
layout: default
---
# Activity-REST Framework

[![CircleCI](https://circleci.com/gh/cawal/activity-rest-framework.svg?style=svg&circle-token=7821e416a427c1defc5d6a76601f4bf555123888)](https://circleci.com/gh/cawal/activity-rest-framework)

The Activity-REST framework facilitates the development of RESTful adapter services that wraps command line analysis tools.


## Usage

The Activity-REST framework was not published to a Maven repository yet.
Thus, in order to use it for your projects, first download the repository and install the bundles at your user's local repository.
You can follow the following commands for this step:

```bash
git clone https://github.com/cawal/activity-rest-framework
cd activity-rest-framework
mvn clean install -DskipTests
```

Then, the easiest way to use the Activity-REST framework to create a new analysis service is to use the provided Maven artifact.
In the example bellow, set the values for the variables `MY_GROUP_ID`, `MY_SERVICE_ID` and `MY_VERSION` with the desired values for these properties in your service. 


```bash
MY_GROUP_ID=<base package identifier>
MY_SERVICE_ID=<service identifier>
MY_VERSION=<a version string>

mvn archetype:generate \
	-DarchetypeGroupId=activity-rest \
	-DarchetypeArtifactId=archetype \
	-DarchetypeVersion=1.0-SNAPSHOT \
	-DgroupId=${MY_GROUP_ID} \
	-DartifactId=${MY_SERVICE_ID} \
	-Dversion=${MY_VERSION}
```

Then, edit the `activity.aadl` file in the main service folder in order to describe the analysis activity and the underlying command line tool.
Information about the Analysis Activity Description Language can be found [here](https://cawal.github.io/activity-rest-framework/aadl).
Finally, compile the service code and obtain the  deployable WAR using Maven:

```bash
mvn clean
mvn package
```

The produced WAR can be deployed to a Java/Jakarta EE application server **which has the analysis tool already installed** (The analysis tool must be in the application path of the application server and be executable).
The service root will be accessible at `<host>:<port>/${MY_SERVICE_ID/}`, where `<host>`and  `<port>` are the host and port binded to the application server and `${MY_SERVICE_ID}` is the service id used to create the project using the Maven archetype.
Nowadays, the Activity-REST framework is tested against [Tomcat v9.0](http://tomcat.apache.org/tomcat-9.0-doc/index.html).

More information about the use can be found in the [extended documentation](activityrest/).

## Contributing

Feel free to [submit issues and enhancement requests](https://github.com/cawal/activity-rest-framework/issues).
