define(["ace/lib/oop", "ace/mode/text", "ace/mode/text_highlight_rules"], function(oop, mText, mTextHighlightRules) {
	var HighlightRules = function() {
		var keywords = "Activity|AppendEach|AppendListWith|CommandLineTool|CustomDatasetConstraint|CustomParameterConstraint|Dataset|DatasetCommandLineEntryList|ExitCode|FAILED|INTEGER|Join|LiteralCommandLineEntryList|MaximunDatasetCardinalityConstraint|MaximunParameterCardinalityConstraint|MinimunDatasetCardinalityConstraint|MinimunParameterCardinalityConstraint|Parameter|ParameterCommandLineEntryList|PrependEach|PrependListWith|REAL|STRING|SUCCEEDED|ToolNameCommandLineEntry|code|commandLineTemplate|dataset|defaultValues|description|executablePath|exitCodes|inputDatasets|literals|manipulators|maximumCardinality|mimetype|minimumCardinality|outputDatasets|parameter|parameterType|parameters|readinessContraints|remarks|reportMessage|standardErrorStream|standardInputStream|standardOutputStream|status|tool|value";
		this.$rules = {
			"start": [
				{token: "comment", regex: "\\/\\/.*$"},
				{token: "comment", regex: "\\/\\*", next : "comment"},
				{token: "string", regex: '["](?:(?:\\\\.)|(?:[^"\\\\]))*?["]'},
				{token: "string", regex: "['](?:(?:\\\\.)|(?:[^'\\\\]))*?[']"},
				{token: "constant.numeric", regex: "[+-]?\\d+(?:(?:\\.\\d*)?(?:[eE][+-]?\\d+)?)?\\b"},
				{token: "lparen", regex: "[{]"},
				{token: "rparen", regex: "[}]"},
				{token: "keyword", regex: "\\b(?:" + keywords + ")\\b"}
			],
			"comment": [
				{token: "comment", regex: ".*?\\*\\/", next : "start"},
				{token: "comment", regex: ".+"}
			]
		};
	};
	oop.inherits(HighlightRules, mTextHighlightRules.TextHighlightRules);
	
	var Mode = function() {
		this.HighlightRules = HighlightRules;
	};
	oop.inherits(Mode, mText.Mode);
	Mode.prototype.$id = "xtext/aadt";
	Mode.prototype.getCompletions = function(state, session, pos, prefix) {
		return [];
	}
	
	return {
		Mode: Mode
	};
});
