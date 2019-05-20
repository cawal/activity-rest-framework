---
title: Analysis Activity Description Language
layout:  page
---

The Analysis Activity Description Language (AADL) consists of an Domain-Specific Language (DSL) for the abstract description of bioinformatics analysis activities.
AADL also aims at allowing the description of the underlying functional entity that supports the activity execution, in order to facilitate the adaptation of these entities within other software systems through model-based development strategies.
Nowadays, AADL only allows the description of analysis activities that are supported by an underlying command-line analysis tool.


* TOC
{:toc}

## Notational conventions

The key words "MUST", "MUST NOT", "REQUIRED", "SHALL", "SHALL NOT", "SHOULD", "SHOULD NOT", "RECOMMENDED",  "MAY", and "OPTIONAL" in this document are to be interpreted as described in [RFC 2119](https://tools.ietf.org/html/rfc2119) and [RFC 8174](https://tools.ietf.org/html/rfc8174) when, and only when, they are written using uppercase letters as presented above.


## Definition of analysis activity 

For our purposes, an analysis activity consists of a operation defined to be executed over a number of initial input datasets in order to obtain a number of output datasets.
A input dataset consists of an ordered list of one or more files containing  biological information that are read during the analysis activity execution. 
The analysis activity execution requires zero or more input datasets, each associated to an identifier.
A output dataset consists of one or more files containing biological information that are written during the analysis activity execution.
The analysis activity execution MUST create one or more output datasets, each associated to an identifier.
The intersection of the set of files present in an analysis activity instance's input datasets with the set of files produced for the analysis activity instance's output datasets MUST be empty.
Further, Input dataset identifiers and output dataset identifiers are unique within the identifiers defined by the analysis activity.

Alongside the input datasets, the analysis activity instance's execution may also requires a number of (execution) parameters.
An execution parameter consists of a ordered list of literal values that guides the analysis activity execution, changing the file contents of the output datasets.
For our requirements, the value  provided for an execution parameters MUST NOT change the definition of the input or the output datasets, and MUST NOT add or remove datasets of the analysis activity definition.



## Analysis Activity Description Language Metamodel (AADL-MM)



## Analysis Activity Description Language Textual Grammar (AADL-TG)


### Document structure

In the present version, the AADL description is a single document that abstractly models an analysis activity and a command line tool invocation. 
AADL-TG is **case-sensitive**, thus keywords and identifiers casing must be carefully observed.

The outline of an AADL description is shown below. The root element of the AADL description is the Activity that is described.
The AADL description is mnemonically read as "The ACTIVITY *name* is performed ON *some input datasets* WITH *some execution parameters* and PRODUCES *some output datasets* USING *a given support functional entity*.


```aadl
activity <name> {
	on {
		... // input datasets definitions
	}
	with {
		... // execution parameters definitions
	}
	produces {
		... // output datasets definitions
	}
	using ... // functional tool (invocation) definition
}
```

The order of dataset/parameter declarations present inside `on { ... }`, `with { ... }` and `produces { ... }` sections  does not change the resulting AADL description.



### String list manipulators



## AADL description examples

The following AADL description presents the activity *nucleotide local alignment*, that is supported by the BLAST-N analysis tool.



```aadl
activity nucleotide-local-alignment {
	on {
		dataset query-sequence : 'chemical/seq-na-fasta' [1,1];
	}
	with {
		parameter queried-database : STRING [1,1];
	}
	produces {
		dataset result : 'text/plain' [1,1];
	}
	using executable 'blastn' {
		commandLineTemplate [
			parameter 'queried-database'
				| PrependListWith '-db'
				,
			dataset 'query-sequence'
				| PrependListWith '-query'
				,
			dataset 'result'
				| PrependListWith '-out'
		]
		returns {
			0 if SUCCEEDED;
			1 if FAILED 'Error in query sequence(s) or BLAST options';
			2 if FAILED 'Error in BLAST database';
			3 if FAILED 'Error in BLAST engine';
			4 if FAILED 'Out of memory';
			5 if FAILED 'Network error connecting to NCBI to fetch sequence data';
			6 if FAILED 'Error creating output files';
			255 if FAILED 'Unknown error';
		}
	}
}

```

