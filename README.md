# Activity-REST Framework

[![CircleCI](https://circleci.com/gh/cawal/activity-rest-framework.svg?style=svg&circle-token=7821e416a427c1defc5d6a76601f4bf555123888)](https://circleci.com/gh/cawal/activity-rest-framework)

The Activity-REST framework facilitates the development of RESTful adapter services that wraps command line analysis tools.


## Usage

The easiest way to use the Activity-REST framework to create a new analysis service is to use the provided Maven artifact.

```bash
MY_GROUP_ID=<base package identifier>
MY_SERVICE_ID=<service identifier>
MY_VERSION=<a version string>

mvn archetype:generate \
	-DarchetypeGroupId=activity-rest \
	-DarchetypeArtifactId=activity-rest-archetype \
	-DarchetypeVersion=1.0-SNAPSHOT \
	-DgroupId=${MY_GROUP_ID} \
	-DartifactId=${MY_SERVICE_ID} \
	-Dversion=$M{MY_VERSION}
```

Then, edit the `activity.aadl` file in the main service folder in order to describe the analysis activity and the underlying command line tool. Finally, compile and package the service code using Maven:

```bash
mvn clean
mvn package
```

## Repository organization

The `dsl` folder contains a number of Java projects related to the support for the Analysis Activity Description Language. 
These projects include the AADL metamodel created using [EMF](https://www.eclipse.org/modeling/emf/), as well as the AADL textual grammar and supporting editor created using [Xtext](https://www.eclipse.org/Xtext/).

The `framework`folder contains a number of Java projects related to the Activity-REST framework itself.
These projects includes the main framework project, as well as a additional project for aggregating resources that facilitate Activity-REST service tests and a Maven archetype project to facilitate the creation of new Activity-REST services.

The `docs` folder contains the main documentation of the project. These docs are compiled using [Jekyll](https://jekyllrb.com/) in order to produce a [github.io site](https://cawal.github.io/activity-rest-framework/).

## Contributing

Feel free to submit issues and enhancement requests.
