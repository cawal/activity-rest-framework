## Building

### 1: Getting non-mavenized dependencies:

1. Download or clone the [Eclipse BPMN2 metamodel project](https://git.eclipse.org/c/bpmn2/org.eclipse.bpmn2.git/commit/),

2 .Change the address of Maven Central Respository from `http:` to `https:` in the `pom.xml` file;

3. Add execution permission to the `.build.sh` file: 

```
chmod +x build.sh
```

4. Compile and install the bundles:
```
	./build.sh
```

An already updated version can bee found a [the branch https-in-maven  my fork of the BPMN2 Eclipse's Project](https://github.com/cawal/org.eclipse.bpmn2/tree/https-in-maven).