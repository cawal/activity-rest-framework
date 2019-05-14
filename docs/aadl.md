---
title: Analysis Activity Description Language
layout:  page
---

The Analysis Activity Description Language (AADL) consists of an Domain-Specific Language (DSL) for the abstract description of bioinformatics analysis activities.
AADL also aims at allowing the description of the underlying (command-line) tools that support these activities, in order to facilitate the adaptation of these tools in/within other software systems through model-based development strategies.


* TOC
{:toc}

## Notational conventions

The key words "MUST", "MUST NOT", "REQUIRED", "SHALL", "SHALL NOT", "SHOULD", "SHOULD NOT", "RECOMMENDED",  "MAY", and "OPTIONAL" in this document are to be interpreted as described in [RFC 2119](https://tools.ietf.org/html/rfc2119) and [RFC 8174](https://tools.ietf.org/html/rfc8174) when, and only when, they are written using uppercase letters as presented above.




## Definition of an analysis activity (instance)

For our purposes, an analysis activity consists of a operation defined to be executed over a number of initial input datasets in order to obtain a number of output datasets.
A input dataset consists of an ordered list of one or more files containing  biological information that are read during the analysis activity execution. 
The analysis activity execution requires zero or more input datasets, each associated to an identifier.
A output dataset consists of one or more files containing biological information that are written during the analysis activity execution.
The analysis activity execution MUST create one or more output datasets, each associated to an identifier.
The intersection of the set of files present in an analysis activity instance's input datasets with the set of files produced for the analysis activity instance's output datasets MUST be empty.
Further, Input dataset identifiers and output dataset identifiers are unique within the identifiers defined by the analysis activity.

Alongside the input datasets, the analysis activity instance's execution may also requires a number of (execution) parameters.
An execution parameter consists of a ordered list of literal values that guides the analysis activity execution, changing the file contents of the output datasets.
For our purposes, an execution parameter MUST NOT change the definition of an input or an output dataset, and MUST NOT add or remove datasets of the analysis activity definition.


## Analysis Activity Description Language Metamodel (AADL-MM)



## Analysis Activity Description Language Textual Grammar (AADL-TG)
