/*
* generated by Xtext
*/
grammar InternalExpressions;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.example.expressions.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.example.expressions.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.example.expressions.services.ExpressionsGrammarAccess;

}

@parser::members {
 
 	private ExpressionsGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(ExpressionsGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleExpressionModel
entryRuleExpressionModel 
:
{ before(grammarAccess.getExpressionModelRule()); }
	 ruleExpressionModel
{ after(grammarAccess.getExpressionModelRule()); } 
	 EOF 
;

// Rule ExpressionModel
ruleExpressionModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getExpressionModelAccess().getElementsAssignment()); }
(rule__ExpressionModel__ElementsAssignment)*
{ after(grammarAccess.getExpressionModelAccess().getElementsAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAbstractElement
entryRuleAbstractElement 
:
{ before(grammarAccess.getAbstractElementRule()); }
	 ruleAbstractElement
{ after(grammarAccess.getAbstractElementRule()); } 
	 EOF 
;

// Rule AbstractElement
ruleAbstractElement
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAbstractElementAccess().getAlternatives()); }
(rule__AbstractElement__Alternatives)
{ after(grammarAccess.getAbstractElementAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleVariable
entryRuleVariable 
:
{ before(grammarAccess.getVariableRule()); }
	 ruleVariable
{ after(grammarAccess.getVariableRule()); } 
	 EOF 
;

// Rule Variable
ruleVariable
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getVariableAccess().getGroup()); }
(rule__Variable__Group__0)
{ after(grammarAccess.getVariableAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleExpression
entryRuleExpression 
:
{ before(grammarAccess.getExpressionRule()); }
	 ruleExpression
{ after(grammarAccess.getExpressionRule()); } 
	 EOF 
;

// Rule Expression
ruleExpression
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getExpressionAccess().getAlternatives()); }
(rule__Expression__Alternatives)
{ after(grammarAccess.getExpressionAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__AbstractElement__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAbstractElementAccess().getVariableParserRuleCall_0()); }
	ruleVariable
{ after(grammarAccess.getAbstractElementAccess().getVariableParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getAbstractElementAccess().getExpressionParserRuleCall_1()); }
	ruleExpression
{ after(grammarAccess.getAbstractElementAccess().getExpressionParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExpressionAccess().getGroup_0()); }
(rule__Expression__Group_0__0)
{ after(grammarAccess.getExpressionAccess().getGroup_0()); }
)

    |(
{ before(grammarAccess.getExpressionAccess().getGroup_1()); }
(rule__Expression__Group_1__0)
{ after(grammarAccess.getExpressionAccess().getGroup_1()); }
)

    |(
{ before(grammarAccess.getExpressionAccess().getGroup_2()); }
(rule__Expression__Group_2__0)
{ after(grammarAccess.getExpressionAccess().getGroup_2()); }
)

    |(
{ before(grammarAccess.getExpressionAccess().getGroup_3()); }
(rule__Expression__Group_3__0)
{ after(grammarAccess.getExpressionAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__ValueAlternatives_2_1_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExpressionAccess().getValueTrueKeyword_2_1_0_0()); }

	'true' 

{ after(grammarAccess.getExpressionAccess().getValueTrueKeyword_2_1_0_0()); }
)

    |(
{ before(grammarAccess.getExpressionAccess().getValueFalseKeyword_2_1_0_1()); }

	'false' 

{ after(grammarAccess.getExpressionAccess().getValueFalseKeyword_2_1_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Variable__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Variable__Group__0__Impl
	rule__Variable__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVariableAccess().getNameAssignment_0()); }
(rule__Variable__NameAssignment_0)
{ after(grammarAccess.getVariableAccess().getNameAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Variable__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Variable__Group__1__Impl
	rule__Variable__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVariableAccess().getEqualsSignKeyword_1()); }

	'=' 

{ after(grammarAccess.getVariableAccess().getEqualsSignKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Variable__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Variable__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVariableAccess().getExpressionAssignment_2()); }
(rule__Variable__ExpressionAssignment_2)
{ after(grammarAccess.getVariableAccess().getExpressionAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Expression__Group_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Expression__Group_0__0__Impl
	rule__Expression__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExpressionAccess().getIntConstantAction_0_0()); }
(

)
{ after(grammarAccess.getExpressionAccess().getIntConstantAction_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Expression__Group_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Expression__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExpressionAccess().getValueAssignment_0_1()); }
(rule__Expression__ValueAssignment_0_1)
{ after(grammarAccess.getExpressionAccess().getValueAssignment_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Expression__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Expression__Group_1__0__Impl
	rule__Expression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExpressionAccess().getStringConstantAction_1_0()); }
(

)
{ after(grammarAccess.getExpressionAccess().getStringConstantAction_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Expression__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Expression__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExpressionAccess().getValueAssignment_1_1()); }
(rule__Expression__ValueAssignment_1_1)
{ after(grammarAccess.getExpressionAccess().getValueAssignment_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Expression__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Expression__Group_2__0__Impl
	rule__Expression__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExpressionAccess().getBoolConstantAction_2_0()); }
(

)
{ after(grammarAccess.getExpressionAccess().getBoolConstantAction_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Expression__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Expression__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExpressionAccess().getValueAssignment_2_1()); }
(rule__Expression__ValueAssignment_2_1)
{ after(grammarAccess.getExpressionAccess().getValueAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Expression__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Expression__Group_3__0__Impl
	rule__Expression__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExpressionAccess().getVariableRefAction_3_0()); }
(

)
{ after(grammarAccess.getExpressionAccess().getVariableRefAction_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Expression__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Expression__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExpressionAccess().getVariableAssignment_3_1()); }
(rule__Expression__VariableAssignment_3_1)
{ after(grammarAccess.getExpressionAccess().getVariableAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__ExpressionModel__ElementsAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExpressionModelAccess().getElementsAbstractElementParserRuleCall_0()); }
	ruleAbstractElement{ after(grammarAccess.getExpressionModelAccess().getElementsAbstractElementParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__NameAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); }
	RULE_ID{ after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__ExpressionAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_2_0()); }
	ruleExpression{ after(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__ValueAssignment_0_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExpressionAccess().getValueINTTerminalRuleCall_0_1_0()); }
	RULE_INT{ after(grammarAccess.getExpressionAccess().getValueINTTerminalRuleCall_0_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__ValueAssignment_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0()); }
	RULE_STRING{ after(grammarAccess.getExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__ValueAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExpressionAccess().getValueAlternatives_2_1_0()); }
(rule__Expression__ValueAlternatives_2_1_0)
{ after(grammarAccess.getExpressionAccess().getValueAlternatives_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__VariableAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExpressionAccess().getVariableVariableCrossReference_3_1_0()); }
(
{ before(grammarAccess.getExpressionAccess().getVariableVariableIDTerminalRuleCall_3_1_0_1()); }
	RULE_ID{ after(grammarAccess.getExpressionAccess().getVariableVariableIDTerminalRuleCall_3_1_0_1()); }
)
{ after(grammarAccess.getExpressionAccess().getVariableVariableCrossReference_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


