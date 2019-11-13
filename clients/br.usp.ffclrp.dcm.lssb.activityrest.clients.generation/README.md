## Building

### 1: Getting non-mavenized dependencies:

1. Download the [Eclipse BPMN2 metamodel project](https://git.eclipse.org/c/bpmn2/org.eclipse.bpmn2.git/commit/),

2. Add the following information to the `<properties>` section of the `pom.xml` file at the root of the Eclipse project:

```xml
<properties>
		<eclipse-site>http://download.eclipse.org/releases/mars</eclipse-site>
</properties>
```

1. Compile the bundles and install it into the local maven repository.
```sh
mvn clean install
```

### 2: Compiling the project
