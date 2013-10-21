/*
* generated by Xtext
*/
grammar InternalExpressions;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.example.expressions.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.example.expressions.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.example.expressions.services.ExpressionsGrammarAccess;

}

@parser::members {

 	private ExpressionsGrammarAccess grammarAccess;
 	
    public InternalExpressionsParser(TokenStream input, ExpressionsGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "ExpressionModel";	
   	}
   	
   	@Override
   	protected ExpressionsGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleExpressionModel
entryRuleExpressionModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExpressionModelRule()); }
	 iv_ruleExpressionModel=ruleExpressionModel 
	 { $current=$iv_ruleExpressionModel.current; } 
	 EOF 
;

// Rule ExpressionModel
ruleExpressionModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getExpressionModelAccess().getElementsAbstractElementParserRuleCall_0()); 
	    }
		lv_elements_0_0=ruleAbstractElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExpressionModelRule());
	        }
       		add(
       			$current, 
       			"elements",
        		lv_elements_0_0, 
        		"AbstractElement");
	        afterParserOrEnumRuleCall();
	    }

)
)*
;





// Entry rule entryRuleAbstractElement
entryRuleAbstractElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAbstractElementRule()); }
	 iv_ruleAbstractElement=ruleAbstractElement 
	 { $current=$iv_ruleAbstractElement.current; } 
	 EOF 
;

// Rule AbstractElement
ruleAbstractElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getAbstractElementAccess().getVariableParserRuleCall_0()); 
    }
    this_Variable_0=ruleVariable
    { 
        $current = $this_Variable_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAbstractElementAccess().getExpressionParserRuleCall_1()); 
    }
    this_Expression_1=ruleExpression
    { 
        $current = $this_Expression_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleVariable
entryRuleVariable returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getVariableRule()); }
	 iv_ruleVariable=ruleVariable 
	 { $current=$iv_ruleVariable.current; } 
	 EOF 
;

// Rule Variable
ruleVariable returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getVariableRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)	otherlv_1='=' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getEqualsSignKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_2_0()); 
	    }
		lv_expression_2_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getVariableRule());
	        }
       		set(
       			$current, 
       			"expression",
        		lv_expression_2_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	 iv_ruleExpression=ruleExpression 
	 { $current=$iv_ruleExpression.current; } 
	 EOF 
;

// Rule Expression
ruleExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getExpressionAccess().getAtomicParserRuleCall_0()); 
    }
    this_Atomic_0=ruleAtomic
    { 
        $current = $this_Atomic_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getExpressionAccess().getPlusLeftAction_1_0(),
            $current);
    }
)	otherlv_2='+' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getPlusSignKeyword_1_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getExpressionAccess().getRightAtomicParserRuleCall_1_2_0()); 
	    }
		lv_right_3_0=ruleAtomic		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExpressionRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_3_0, 
        		"Atomic");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleAtomic
entryRuleAtomic returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAtomicRule()); }
	 iv_ruleAtomic=ruleAtomic 
	 { $current=$iv_ruleAtomic.current; } 
	 EOF 
;

// Rule Atomic
ruleAtomic returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((	otherlv_0='(' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_0_0());
    }

    { 
        newCompositeNode(grammarAccess.getAtomicAccess().getExpressionParserRuleCall_0_1()); 
    }
    this_Expression_1=ruleExpression
    { 
        $current = $this_Expression_1.current; 
        afterParserOrEnumRuleCall();
    }
	otherlv_2=')' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getAtomicAccess().getRightParenthesisKeyword_0_2());
    }
)
    |((
    {
        $current = forceCreateModelElement(
            grammarAccess.getAtomicAccess().getIntConstantAction_1_0(),
            $current);
    }
)(
(
		lv_value_4_0=RULE_INT
		{
			newLeafNode(lv_value_4_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_1_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtomicRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_4_0, 
        		"INT");
	    }

)
))
    |((
    {
        $current = forceCreateModelElement(
            grammarAccess.getAtomicAccess().getStringConstantAction_2_0(),
            $current);
    }
)(
(
		lv_value_6_0=RULE_STRING
		{
			newLeafNode(lv_value_6_0, grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtomicRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_6_0, 
        		"STRING");
	    }

)
))
    |((
    {
        $current = forceCreateModelElement(
            grammarAccess.getAtomicAccess().getBoolConstantAction_3_0(),
            $current);
    }
)(
(
(
		lv_value_8_1=	'true' 
    {
        newLeafNode(lv_value_8_1, grammarAccess.getAtomicAccess().getValueTrueKeyword_3_1_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtomicRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_8_1, null);
	    }

    |		lv_value_8_2=	'false' 
    {
        newLeafNode(lv_value_8_2, grammarAccess.getAtomicAccess().getValueFalseKeyword_3_1_0_1());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtomicRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_8_2, null);
	    }

)

)
))
    |((
    {
        $current = forceCreateModelElement(
            grammarAccess.getAtomicAccess().getVariableRefAction_4_0(),
            $current);
    }
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtomicRule());
	        }
        }
	otherlv_10=RULE_ID
	{
		newLeafNode(otherlv_10, grammarAccess.getAtomicAccess().getVariableVariableCrossReference_4_1_0()); 
	}

)
)))
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


