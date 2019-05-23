---
title: Analysis Activity Description Language
layout:  page
---

The Analysis Activity Description Language (AADL) consists of an Domain-Specific Language (DSL) for the abstract description of bioinformatics analysis activities.
AADL also aims at allowing the description of the underlying functional entity that supports the activity execution, in order to facilitate the adaptation of these entities within other software systems through model-based development strategies.
Nowadays, AADL only allows the description of analysis activities that are supported by an underlying command-line analysis tool.


* TOC
{:toc}


## Definition of analysis activity 

For our purposes, an analysis activity consists of a operation defined to be executed over a number of initial input datasets in order to obtain a number of output datasets.
The execution of an analysis activity is supported by a given functional entity that receives input datasets and parameters, processes them and, finally, create the resulting output datasets.

An input dataset consists of an (named) list of one or more files containing biological information that are read during the analysis activity execution. 
These files are submitted by the user previously to the analysis activity execution.
An analysis activity requires zero or more input datasets, each associated to an identifier (its name).

An output dataset consists of one or more files containing biological information that are written during the analysis activity execution.
The analysis activity execution MUST create one or more output datasets, each associated to an identifier.
The intersection of the set of files present in an analysis activity instance's input datasets with the set of files produced for the analysis activity instance's output datasets MUST be empty.
Further, input dataset identifiers and output dataset identifiers are unique within the identifiers defined by the analysis activity.

Alongside the input datasets, the analysis activity instance's execution may also requires a number of (execution) parameters.
An execution parameter consists of a ordered list of literal values that guides the analysis activity execution, changing the file contents of the output datasets.
For our requirements, the value  provided for an execution parameters MUST NOT change the definition of the input or the output datasets, and MUST NOT add or remove datasets of the analysis activity definition.



## Creating an AADL description for a analysis activity

A EBNF grammar for the Analysis Activity Description Language is [provided](./aadl/bnf) and may be consulted for further understanding of the language. 

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



### Declaring input datasets

The first item to define is the input datasets in the `on {}` section of the AADL description.
The simple input dataset declaration starts with the `dataset` keyword, followed by the dataset name/identifier, a colon (`:`), the dataset MIME type and the file multiplicity definition.
The declaration ends with a semi-colon (`;`). 
The `csv-dataset` in the next code block presents this syntax construct.
This declaration can be read as *"The csv-dataset is composed of one or more `text/csv` files."*.
More than one dataset may be defined in the `on { }` section. 


```aadl
...
	on {
		dataset 'csv-dataset' : 'text/csv' [1,-1];
		dataset 'txt-dataset' : 'text/plain' [1,1];
	}
...
```

The extended dataset declaration adds a declaration body to the simple dataset declaration.
In the extended dataset declaration body, the user may associate remarks and external constraints to the dataset definition.
In an AADL description, an external constraint is represented only by a string identifier.
The constraint validation itself must be provided by an external software mechanism that looks for this identifier in a constraint database and validates each file submitted for the dataset. 
The dataset declaration in the next code block associates a remark and two external constraint to the previously declared `csv-dataset`.


```aadl
...
	on {
		dataset 'csv-dataset' : 'text/csv' [1,-1] { 
			remarks 'This file must have...';
			constraints [ 'maxSize100M', 'provideHeaders' ];
		};
	}
...
```

### Declaring execution parameters

The next item to define is the analysis activity's execution parameters.
Similarly to the input dataset declaration, the parameter declaration also provides a simple and an extended forms.
The simple form initiates with keyword `parameter` followed by the parameter identifier/name, a colon (`:`), the parameter type and the multiplicity declaration, ending with a semi-colon (`;`).
The extended form adds a declaration body that allows to associate a textual remark and external constraint identifiers to the parameter declaration.
Both forms can be seen in the next code block.

```aadl
...
	with {
		parameter 'column-ids' : INTEGER [1,5];
		parameter 'use-adjust' : BOOLEAN [1,1];
		parameter 'p-value' : REAL [1,1];
		parameter 'email' : STRING [1,1] {
			constraints ['isEmail'];
		}
	}
...

```


The allowed parameter types are:

- `INTEGER`: Accepts only integer numbers. 
- `REAL`: Accepts numbers with decimal part after a dot (ex: 2.0);
- `STRING`: Accepts unrestricted strings (Ex: "PAC1", "my.email@host.com", etc);
- `BOOLEAN`: Accepts the boolean values `false` and `true`.


### Declaring output datasets

The declaration of an output dataset is similar to the declaration of an input dataset, but occurs in the `produces { }` section of the AADL description.
The next code block present the declaration of a dataset identified by `result`.


```aadl
...
	produces {
		dataset 'result' : 'text/csv' [1,1];
	}
...
```


### Declaring the supporting analysis tool

The last step is to declare the underlying analysis tool in the `using ...` section of the AADL description.
In the current version, only the description of command-line analysis tools are allowed.

The description of a command-line analysis tool starts with the keyword `executable` followed by the tool name and the declaration body.
The command-line tool declaration body contains up to three sections:

- The first section, `redirecting { }`, is optional and allows to define redirections from/to input/output datasets and the standard input/output streams (`stdin`, `stdout` e `stderr`) of the tool.
These redirections only apply to datasets declared with the maximum multiplicity of  1 (`[1,1]`).
- The second section, `commandLineTemplate [ ]`, is mandatory and is used to define how the arguments are passed during tool invocation based on the runtime-informed parameter values and input dataset files.
This section is presented in more details in the next section.
- Finally, the third section, `returns { }`, is used to define the expected exit codes returned by the tool after its execution.
Each exit code is associated with the expected exit status (`SUCCEEDED` or `FAILED`) and may be associated to an intelligible report message describing the exit code meaning.


```aadl
...
	using executable 'tool-name' {
		redirecting { // optional section
			stdin from 'txt-dataset'; 
			stdout to result;
			// stderr to result;
		}

		commandLineTemplate [
			... 
		]

		returns {
			0 if SUCCEEDED;
			1 if FAILED 'Input file error';
			2 if FAILED 'Unknown error'
		}
	}
```

### Command Line Template

The `commandLineTemplate [ ]` section  is used to describe the construction of the arguments of the analysis tool based on the parameter values and dataset files the user submits to the analysis activity.
The whole section defines a string list that is passed to the command line tool as its arguments, being each declaration in the section responsible to define a fragment (sub-list) of this argument list.


Different methods can be used to create the initial value for a argument sub-list. 
Each method is denoted by a special keyword in the `commandLineTemplate [ ]` section:


- `parameter <parameter-id>`: Defines a sub-list based on the informed values for a execution parameter.
- `dataset <dataset-id>`: Defines a sub-list based on the paths of the files submitted to a input dataset or the path of the file that will be created for a output dataset.
- `literal [ <comma separated string list> ]`: Defines  a initial sub-list containing literal string values.


The argument sub-list can be further processed using string list manipulators.
A string list manipulator receives an argument sub-list and executes an operation on it, producing a resulting sub-list that may be used by a subsequent string list manipulator.
The pipe symbol (`|`) is used for concatenate the string list manipulators to process argument sub-lists.
A [complete list of StringListManipulators](./aadl/string-list-manipulators) is provided, showing their syntaxes and some examples.


## An AADL description example

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

