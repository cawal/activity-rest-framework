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



## Declaring input datasets

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

## Declaring execution parameters

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


## Declaring output datasets

The declaration of an output dataset is similar to the declaration of an input dataset, but occurs in the `produces { }` section of the AADL description.
The next code block present the declaration of a dataset identified by `result`.


```aadl
...
	produces {
		dataset 'result' : 'text/csv' [1,1];
	}
...
```


## Declaring the supporting analysis tool

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








Different 

- **Literal value lists**: Allow to add a sub-list with
- **Parameter value lists**:
- **Input/Output dataset file lists**:


### String List Manipulators

The following string list manipulators are available:

#### Join
Used to join all the current sub-list values using a delimiter.
A list with only one item is returned.
	
Syntax: `| Join 'delimiter'`

Example:
```aadl
...
	commandLineTemplate [
		literal ['a', 'b', 'c' ]
			| Join ':' // returns the sub-list ['a:b:c'] 
	]
```

#### PrependEach

Used to prepend a string to each item of the current sub-list.
A list with the same number of items is returned.

Syntax: `| PrependEach 'prefix'`

Example:
```aadl
...
	commandLineTemplate [
		literal ['a', 'b', 'c' ]
			| PrependEach 'P' // returns the sub-list ['Pa','Pb', 'Pc'] 
	]
```

#### AppendEach

Used to append a string to each item of the current sub-list.
A list with the same number of items is returned.

Syntax: `| AppendEach 'sulfix'`

Example:
```aadl
...
	commandLineTemplate [
		literal ['a', 'b', 'c' ]
			| AppendEach 'S' // returns the sub-list ['aS','bS', 'cS'] 
	]
```

#### PrependListWith

Used to prepend a string to the head of the current sub-list.
A list with N+1 values is returned.
The current list items are not changed.

Syntax: `| PrependListWith 'prefix'`

Example:
```aadl
...
	commandLineTemplate [
		literal ['a', 'b', 'c' ]
			| PrependListWith 'P' // returns the sub-list ['P', 'a','b', 'c'] 
	]
```

#### AppendListWith

Used to append a string to the tail of the current sub-list.
A list with N+1 values is returned.
The current list items are not changed.

Syntax: `| AppendListWith 'prefix'`

Example:
```aadl
...
	commandLineTemplate [
		literal ['a', 'b', 'c' ]
			| AppendListWith 'S' // returns the sub-list ['a','b', 'c','S'] 
	]
```

#### ToFlag

Used to substitute each BOOLEAN value in the current sub-list to a string value.
A list with the same number of items (or less) is returned.

This manipulator is useful for tools that uses flags to activate/deactivate features.
Two fields are available: `ifTrue` is the string that is returned if the current list value is `true`. 
`ifFalse` is the string that is returned otherwise.
If one of these fields is not informed, the produced sub-list will not contain a element for the provided case, suppressing the value. 

Syntax:

`| ToFlag { ifTrue: 'value-if-true'  }`: returns `'value-if-true'` for each item of the current list that is `true`, suppresses the value otherwise. 

`| ToFlag { ifFalse: 'value-if-false }`: returns `'value-if-false'` for each item of the current list that is `false`, suppresses the value otherwise.

`| ToFlag { ifTrue: 'value-if-true' ifFalse: 'value-if-false }`: returns values for both cases;



Example:
```aadl
...
	commandLineTemplate [
		parameter use-adjust // is defined as BOOLEAN [1,1]
			| ToFlag {ifTrue: '--use-adj' ifFalse: '--dont-adj' }
	]
```



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

