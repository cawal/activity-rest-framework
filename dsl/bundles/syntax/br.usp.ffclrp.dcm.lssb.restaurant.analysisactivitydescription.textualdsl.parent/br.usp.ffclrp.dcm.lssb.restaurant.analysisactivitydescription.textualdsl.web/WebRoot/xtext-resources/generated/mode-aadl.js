define(["ace/lib/oop", "ace/mode/text", "ace/mode/text_highlight_rules"], function(oop, mText, mTextHighlightRules) {
	var HighlightRules = function() {
		var keywords = "AppendEach|AppendListWith|FAILED|INTEGER|Join|PrependEach|PrependListWith|REAL|STRING|SUCCEEDED|activity|commandLineTemplate|constraint|constraints|dataset|executable|from|if|literals|on|parameter|produces|redirecting|remark|returns|stderr|stdin|stdout|to|toolname|using|with";
		this.$rules = {
			"start": [
				{token: "keyword", regex: "\\b(?:" + keywords + ")\\b"}
			]
		};
	};
	oop.inherits(HighlightRules, mTextHighlightRules.TextHighlightRules);
	
	var Mode = function() {
		this.HighlightRules = HighlightRules;
	};
	oop.inherits(Mode, mText.Mode);
	Mode.prototype.$id = "xtext/aadl";
	Mode.prototype.getCompletions = function(state, session, pos, prefix) {
		return [];
	}
	
	return {
		Mode: Mode
	};
});
