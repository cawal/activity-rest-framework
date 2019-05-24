---
title: String List Manipulators
layout: page
---

String list manipulators are metaclasses that denote operations that must be performed over the parameter/dataset values in order to obtain the correct command line arguments for the execution of an underlying analysis tool.

The following string list manipulators are available:

## Join
Used to join all the current sub-list values using a delimiter.
A list with only one item is returned.
	
Syntax: `Join 'delimiter'`

Example:
```aadl
...
	commandLineTemplate [
		literal ['a', 'b', 'c' ]
			| Join ':' // returns the sub-list ['a:b:c'] 
	]
...
```

## PrependEach

Used to prepend a string to each item of the current sub-list.
A list with the same number of items is returned.

Syntax: `PrependEach 'prefix'`

Example:
```aadl
...
	commandLineTemplate [
		literal ['a', 'b', 'c' ]
			| PrependEach 'P' // returns the sub-list ['Pa','Pb', 'Pc'] 
	]
...
```

## AppendEach

Used to append a string to each item of the current sub-list.
A list with the same number of items is returned.

Syntax: `AppendEach 'sulfix'`

Example:
```aadl
...
	commandLineTemplate [
		literal ['a', 'b', 'c' ]
			| AppendEach 'S' // returns the sub-list ['aS','bS', 'cS'] 
	]
...
```

## PrependListWith

Used to prepend a string to the head of the current sub-list.
A list with N+1 values is returned.
The current list items are not changed.

Syntax: `PrependListWith 'prefix'`

Example:
```aadl
...
	commandLineTemplate [
		literal ['a', 'b', 'c' ]
			| PrependListWith 'P' // returns the sub-list ['P', 'a','b', 'c'] 
	]
...
```

## AppendListWith

Used to append a string to the tail of the current sub-list.
A list with N+1 values is returned.
The current list items are not changed.

Syntax: `AppendListWith 'prefix'`

Example:
```aadl
...
	commandLineTemplate [
		literal ['a', 'b', 'c' ]
			| AppendListWith 'S' // returns the sub-list ['a','b', 'c','S'] 
	]
...
```

## ToFlag

Used to substitute each BOOLEAN value in the current sub-list to a string value.
A list with the same number of items (or less) is returned.

This manipulator is useful for tools that uses flags to activate/deactivate features.
Two fields are available: `ifTrue` is the string that is returned if the current list value is `true`. 
`ifFalse` is the string that is returned otherwise.
If one of these fields is not informed, the produced sub-list will not contain a element for the provided case, suppressing the value. 

Syntax:

`ToFlag { ifTrue: 'value-if-true'  }`: returns `'value-if-true'` for each item of the current list that is `true`, suppresses the value otherwise. 

`ToFlag { ifFalse: 'value-if-false }`: returns `'value-if-false'` for each item of the current list that is `false`, suppresses the value otherwise.

`ToFlag { ifTrue: 'value-if-true' ifFalse: 'value-if-false }`: returns values for both cases;



Example:
```aadl
...
	commandLineTemplate [
		parameter use-adjust // is defined as BOOLEAN [1,1]
			| ToFlag {ifTrue: '--use-adj' ifFalse: '--dont-adj' }
	]
...
```
