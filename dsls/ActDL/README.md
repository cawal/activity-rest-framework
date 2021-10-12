# Activity Domain Language

A domain language to represent analysis activity datasets, parameters and tool invocation. 

## Build

```sh
export JAVA_HOME='<path to Java 8>'
mvn compile package
```

The build of the project follows the [Eclipse Tycho Tutorial](http://www.vogella.com/tutorials/EclipseTycho/article.html) in [www.vogella.com](www.vogella.com). **For some reason, the building process does not work in Java 9**. So, please verify if Maven is being executed in Java 8 and, if it is not, use `JAVA_HOME=<Java 8 JRE>; export JAVA_HOME`.
