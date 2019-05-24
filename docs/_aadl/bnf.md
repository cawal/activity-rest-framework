---
title: AADL - EBNF
layout: page
---

This document is defined only for understanding support. 
The Analysis Activity Description Language Textual Grammar is defined using the Xtext at the [Activity-REST git repository](https://github.com/cawal/activity-rest-framework).


```ebnf
<Activity> ::= 
	"activity" <EString> "{" 
		( "remark" <EString> ";")? 
		( "on" "{" <InputDataset>+ "}" )?
		( "with" "{" <Parameter>+ "}" )?
		( "produces" "{" <OutputDataset>+ "}" )?
		"using" <Tool>
	"}";

<Tool> ::= <CommandLineTool>;

<Dataset> ::= <InputDataset> | <OutputDataset>;

<CommandLineEntryList> ::= 
	<LiteralCommandLineEntryList>
	| <DatasetCommandLineEntryList>
	| <ParameterCommandLineEntryList>; 

<StringListManipulator> ::= 
	<Join> 
	| <PrependEach> 
	| <AppendEach> 
	| <AppendListWith> 
	| <PrependListWith>
	| <ToFlag>;

<EString> ::= <MULTILINE_STRING> | <STRING> | <ID> ;

<Parameter> ::= 
	"parameter" <EString> ":" 
	<ParameterType> "[" <EBigInteger> "," <EBigInteger> "]"
	( "=" [ <EString> ( "," <EString> )* "]" )?
	( "{" 
        	( "remark"  <EString> ";" )?
        	( "constraints" "[" 
			<Constraint> ( "," <Constraint>)* 
		"]" )?
	"}" )?
	";" ;

<InputDataset> ::= 
	'dataset' <EString> ':'
	(<EString>)? '[' <EBigInteger> ',' <EBigInteger> ']'
	( '{'
		('remark' <EString> ';')?
		('constraints' '[' 
		    	<Constraint> 
			(',' <Constraint>)* 
		']' ';')?
      '}' )? 
      ';' ; 	

<OutputDataset> ::=
	'dataset' <EString> ':'
	(<EString>)? '[' <EBigInteger> ',' <EBigInteger> ']'
	( '{'
		('remark' <EString> ';')?
		('constraints' '[' 
		    	<Constraint> 
			(',' <Constraint>)* 
		']' ';')?
      '}' )? 
      ';' ; 	

<EBigInteger> ::= '-'? <INT>;

<ParameterType> ::= 'STRING' | 'INTEGER' | 'REAL' | 'BOOLEAN';

    

<Constraint> ::= 
	'Constraint' <EString>;	



<CommandLineTool> ::=
	'executable' <EString> '{'
		('redirecting' '{'
		(
		  ('stdin' 'from' <EString> ';')?
		  & ('stdout' 'to' <EString> ';')?
		  & ('stderr' 'to' <EString> ';')?
		)
		'}'
        	)?
        'commandLineTemplate' '[' 
		<CommandLineEntryList>
		( ',' <CommandLineEntryList>)* 
	']'  
	('returns' '{' <ExitCode>* '}' )?
	'}';


<ExitCode> ::=
	<EBigInteger> 'if' <TerminationStatus> (<EString>)? ';' 
	;


<LiteralCommandLineEntryList> ::=
	'literals' '[' <EString> ( ',' <EString> )* ']' 
	('|' <StringListManipulator>)*
	;

<DatasetCommandLineEntryList> ::=
	'dataset' <EString>
	('|' <StringListManipulator>)*
	;

<ParameterCommandLineEntryList> ::= 
	'parameter' <EString>
	('|' <StringListManipulator>)*
	;
	


<Join> ::= 'Join' <EString>;

<PrependEach> ::= 'PrependEach' <EString>;

<AppendEach> ::= 'AppendEach' <EString>;

<AppendListWith> ::= 'AppendListWith' <EString>;

<PrependListWith> ::= 'PrependListWith' <EString>;

<ToFlag> ::= 'ToFlag' '{' ('ifTrue:' <EString> )? ('ifFalse:' <EString>)? '}';

<TerminationStatus> ::= 'SUCCEEDED' | 'FAILED';
				
<MULTILINE_STRING> ::= "'''" -> "'''";
        
<ID> ::= '^'? ('a'..'z'|'A'..'Z'|'_') 
          (("-")?('a'..'z'|'A'..'Z'|'_'|'0'..'9'))*;

<INT> ::= ('0'..'9')+;

<STRING> ::=
	'"' ( '\\' . | !('\\'|'"') )* '"' 
	| "'" ( '\\' .  | !('\\'|"'") )* "'"
	;
```
