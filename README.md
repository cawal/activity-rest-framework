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

## Contributing


