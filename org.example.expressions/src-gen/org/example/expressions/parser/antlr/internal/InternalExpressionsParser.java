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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExpressionsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'+'", "'-'", "'('", "')'", "'true'", "'false'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalExpressionsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExpressionsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExpressionsParser.tokenNames; }
    public String getGrammarFileName() { return "../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g"; }



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



    // $ANTLR start "entryRuleExpressionModel"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:67:1: entryRuleExpressionModel returns [EObject current=null] : iv_ruleExpressionModel= ruleExpressionModel EOF ;
    public final EObject entryRuleExpressionModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionModel = null;


        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:68:2: (iv_ruleExpressionModel= ruleExpressionModel EOF )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:69:2: iv_ruleExpressionModel= ruleExpressionModel EOF
            {
             newCompositeNode(grammarAccess.getExpressionModelRule()); 
            pushFollow(FOLLOW_ruleExpressionModel_in_entryRuleExpressionModel75);
            iv_ruleExpressionModel=ruleExpressionModel();

            state._fsp--;

             current =iv_ruleExpressionModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionModel"


    // $ANTLR start "ruleExpressionModel"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:76:1: ruleExpressionModel returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleExpressionModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:79:28: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:80:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:80:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_STRING)||LA1_0==14||(LA1_0>=16 && LA1_0<=17)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:81:1: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:81:1: (lv_elements_0_0= ruleAbstractElement )
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:82:3: lv_elements_0_0= ruleAbstractElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpressionModelAccess().getElementsAbstractElementParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractElement_in_ruleExpressionModel130);
            	    lv_elements_0_0=ruleAbstractElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExpressionModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_0_0, 
            	            		"AbstractElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionModel"


    // $ANTLR start "entryRuleAbstractElement"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:106:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:107:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:108:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement166);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:115:1: ruleAbstractElement returns [EObject current=null] : (this_Variable_0= ruleVariable | this_Expression_1= ruleExpression ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_0 = null;

        EObject this_Expression_1 = null;


         enterRule(); 
            
        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:118:28: ( (this_Variable_0= ruleVariable | this_Expression_1= ruleExpression ) )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:119:1: (this_Variable_0= ruleVariable | this_Expression_1= ruleExpression )
            {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:119:1: (this_Variable_0= ruleVariable | this_Expression_1= ruleExpression )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||(LA2_1>=RULE_ID && LA2_1<=RULE_STRING)||(LA2_1>=12 && LA2_1<=14)||(LA2_1>=16 && LA2_1<=17)) ) {
                    alt2=2;
                }
                else if ( (LA2_1==11) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA2_0>=RULE_INT && LA2_0<=RULE_STRING)||LA2_0==14||(LA2_0>=16 && LA2_0<=17)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:120:5: this_Variable_0= ruleVariable
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getVariableParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleVariable_in_ruleAbstractElement223);
                    this_Variable_0=ruleVariable();

                    state._fsp--;

                     
                            current = this_Variable_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:130:5: this_Expression_1= ruleExpression
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_ruleAbstractElement250);
                    this_Expression_1=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleVariable"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:146:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:147:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:148:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable285);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable295); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:155:1: ruleVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:158:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:159:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:159:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:159:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:159:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:160:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:160:1: (lv_name_0_0= RULE_ID )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:161:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable337); 

            			newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleVariable354); 

                	newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getEqualsSignKeyword_1());
                
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:181:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:182:1: (lv_expression_2_0= ruleExpression )
            {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:182:1: (lv_expression_2_0= ruleExpression )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:183:3: lv_expression_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleVariable375);
            lv_expression_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_2_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleExpression"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:207:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:208:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:209:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression411);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression421); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:216:1: ruleExpression returns [EObject current=null] : (this_Atomic_0= ruleAtomic ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleAtomic ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Atomic_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:219:28: ( (this_Atomic_0= ruleAtomic ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleAtomic ) ) )* ) )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:220:1: (this_Atomic_0= ruleAtomic ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleAtomic ) ) )* )
            {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:220:1: (this_Atomic_0= ruleAtomic ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleAtomic ) ) )* )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:221:5: this_Atomic_0= ruleAtomic ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleAtomic ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getAtomicParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAtomic_in_ruleExpression468);
            this_Atomic_0=ruleAtomic();

            state._fsp--;

             
                    current = this_Atomic_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:229:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleAtomic ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=12 && LA4_0<=13)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:229:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleAtomic ) )
            	    {
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:229:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==12) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==13) ) {
            	        alt3=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:229:3: ( () otherlv_2= '+' )
            	            {
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:229:3: ( () otherlv_2= '+' )
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:229:4: () otherlv_2= '+'
            	            {
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:229:4: ()
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:230:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getExpressionAccess().getPlusLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleExpression491); 

            	                	newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getPlusSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:240:6: ( () otherlv_4= '-' )
            	            {
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:240:6: ( () otherlv_4= '-' )
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:240:7: () otherlv_4= '-'
            	            {
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:240:7: ()
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:241:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getExpressionAccess().getMinusLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleExpression520); 

            	                	newLeafNode(otherlv_4, grammarAccess.getExpressionAccess().getHyphenMinusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:250:3: ( (lv_right_5_0= ruleAtomic ) )
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:251:1: (lv_right_5_0= ruleAtomic )
            	    {
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:251:1: (lv_right_5_0= ruleAtomic )
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:252:3: lv_right_5_0= ruleAtomic
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpressionAccess().getRightAtomicParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAtomic_in_ruleExpression543);
            	    lv_right_5_0=ruleAtomic();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"Atomic");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAtomic"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:276:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:277:2: (iv_ruleAtomic= ruleAtomic EOF )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:278:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic581);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic591); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:285:1: ruleAtomic returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) ) | ( () ( (otherlv_10= RULE_ID ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_value_4_0=null;
        Token lv_value_6_0=null;
        Token lv_value_8_1=null;
        Token lv_value_8_2=null;
        Token otherlv_10=null;
        EObject this_Expression_1 = null;


         enterRule(); 
            
        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:288:28: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) ) | ( () ( (otherlv_10= RULE_ID ) ) ) ) )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:289:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) ) | ( () ( (otherlv_10= RULE_ID ) ) ) )
            {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:289:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) ) | ( () ( (otherlv_10= RULE_ID ) ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt6=1;
                }
                break;
            case RULE_INT:
                {
                alt6=2;
                }
                break;
            case RULE_STRING:
                {
                alt6=3;
                }
                break;
            case 16:
            case 17:
                {
                alt6=4;
                }
                break;
            case RULE_ID:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:289:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:289:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:289:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleAtomic629); 

                        	newLeafNode(otherlv_0, grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getAtomicAccess().getExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_ruleAtomic651);
                    this_Expression_1=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleAtomic662); 

                        	newLeafNode(otherlv_2, grammarAccess.getAtomicAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:307:6: ( () ( (lv_value_4_0= RULE_INT ) ) )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:307:6: ( () ( (lv_value_4_0= RULE_INT ) ) )
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:307:7: () ( (lv_value_4_0= RULE_INT ) )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:307:7: ()
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:308:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getIntConstantAction_1_0(),
                                current);
                        

                    }

                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:313:2: ( (lv_value_4_0= RULE_INT ) )
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:314:1: (lv_value_4_0= RULE_INT )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:314:1: (lv_value_4_0= RULE_INT )
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:315:3: lv_value_4_0= RULE_INT
                    {
                    lv_value_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtomic696); 

                    			newLeafNode(lv_value_4_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_4_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:332:6: ( () ( (lv_value_6_0= RULE_STRING ) ) )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:332:6: ( () ( (lv_value_6_0= RULE_STRING ) ) )
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:332:7: () ( (lv_value_6_0= RULE_STRING ) )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:332:7: ()
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:333:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getStringConstantAction_2_0(),
                                current);
                        

                    }

                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:338:2: ( (lv_value_6_0= RULE_STRING ) )
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:339:1: (lv_value_6_0= RULE_STRING )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:339:1: (lv_value_6_0= RULE_STRING )
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:340:3: lv_value_6_0= RULE_STRING
                    {
                    lv_value_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtomic735); 

                    			newLeafNode(lv_value_6_0, grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:357:6: ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:357:6: ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) )
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:357:7: () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:357:7: ()
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:358:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getBoolConstantAction_3_0(),
                                current);
                        

                    }

                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:363:2: ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) )
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:364:1: ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:364:1: ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) )
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:365:1: (lv_value_8_1= 'true' | lv_value_8_2= 'false' )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:365:1: (lv_value_8_1= 'true' | lv_value_8_2= 'false' )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==16) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==17) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:366:3: lv_value_8_1= 'true'
                            {
                            lv_value_8_1=(Token)match(input,16,FOLLOW_16_in_ruleAtomic777); 

                                    newLeafNode(lv_value_8_1, grammarAccess.getAtomicAccess().getValueTrueKeyword_3_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAtomicRule());
                            	        }
                                   		setWithLastConsumed(current, "value", lv_value_8_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:378:8: lv_value_8_2= 'false'
                            {
                            lv_value_8_2=(Token)match(input,17,FOLLOW_17_in_ruleAtomic806); 

                                    newLeafNode(lv_value_8_2, grammarAccess.getAtomicAccess().getValueFalseKeyword_3_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAtomicRule());
                            	        }
                                   		setWithLastConsumed(current, "value", lv_value_8_2, null);
                            	    

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:394:6: ( () ( (otherlv_10= RULE_ID ) ) )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:394:6: ( () ( (otherlv_10= RULE_ID ) ) )
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:394:7: () ( (otherlv_10= RULE_ID ) )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:394:7: ()
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:395:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getVariableRefAction_4_0(),
                                current);
                        

                    }

                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:400:2: ( (otherlv_10= RULE_ID ) )
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:401:1: (otherlv_10= RULE_ID )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:401:1: (otherlv_10= RULE_ID )
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:402:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomic859); 

                    		newLeafNode(otherlv_10, grammarAccess.getAtomicAccess().getVariableVariableCrossReference_4_1_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomic"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleExpressionModel_in_entryRuleExpressionModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleExpressionModel130 = new BitSet(new long[]{0x0000000000034072L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleAbstractElement223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAbstractElement250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable337 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleVariable354 = new BitSet(new long[]{0x0000000000034070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariable375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_ruleExpression468 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_12_in_ruleExpression491 = new BitSet(new long[]{0x0000000000037070L});
    public static final BitSet FOLLOW_13_in_ruleExpression520 = new BitSet(new long[]{0x0000000000037070L});
    public static final BitSet FOLLOW_ruleAtomic_in_ruleExpression543 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleAtomic629 = new BitSet(new long[]{0x000000000003C070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAtomic651 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAtomic662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtomic696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtomic735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleAtomic777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleAtomic806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomic859 = new BitSet(new long[]{0x0000000000000002L});

}