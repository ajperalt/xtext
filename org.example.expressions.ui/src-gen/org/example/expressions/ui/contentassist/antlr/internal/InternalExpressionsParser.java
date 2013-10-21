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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExpressionsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'='", "'+'", "'-'", "'('", "')'"
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
    public String getGrammarFileName() { return "../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g"; }


     
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




    // $ANTLR start "entryRuleExpressionModel"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:60:1: entryRuleExpressionModel : ruleExpressionModel EOF ;
    public final void entryRuleExpressionModel() throws RecognitionException {
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:61:1: ( ruleExpressionModel EOF )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:62:1: ruleExpressionModel EOF
            {
             before(grammarAccess.getExpressionModelRule()); 
            pushFollow(FOLLOW_ruleExpressionModel_in_entryRuleExpressionModel61);
            ruleExpressionModel();

            state._fsp--;

             after(grammarAccess.getExpressionModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressionModel"


    // $ANTLR start "ruleExpressionModel"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:69:1: ruleExpressionModel : ( ( rule__ExpressionModel__ElementsAssignment )* ) ;
    public final void ruleExpressionModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:73:2: ( ( ( rule__ExpressionModel__ElementsAssignment )* ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:74:1: ( ( rule__ExpressionModel__ElementsAssignment )* )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:74:1: ( ( rule__ExpressionModel__ElementsAssignment )* )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:75:1: ( rule__ExpressionModel__ElementsAssignment )*
            {
             before(grammarAccess.getExpressionModelAccess().getElementsAssignment()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:76:1: ( rule__ExpressionModel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_STRING)||(LA1_0>=11 && LA1_0<=12)||LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:76:2: rule__ExpressionModel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__ExpressionModel__ElementsAssignment_in_ruleExpressionModel94);
            	    rule__ExpressionModel__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getExpressionModelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionModel"


    // $ANTLR start "entryRuleAbstractElement"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:88:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:89:1: ( ruleAbstractElement EOF )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:90:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement122);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:97:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:101:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:102:1: ( ( rule__AbstractElement__Alternatives ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:102:1: ( ( rule__AbstractElement__Alternatives ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:103:1: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:104:1: ( rule__AbstractElement__Alternatives )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:104:2: rule__AbstractElement__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractElement__Alternatives_in_ruleAbstractElement155);
            rule__AbstractElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleVariable"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:116:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:117:1: ( ruleVariable EOF )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:118:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable182);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:125:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:129:2: ( ( ( rule__Variable__Group__0 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:130:1: ( ( rule__Variable__Group__0 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:130:1: ( ( rule__Variable__Group__0 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:131:1: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:132:1: ( rule__Variable__Group__0 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:132:2: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_rule__Variable__Group__0_in_ruleVariable215);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleExpression"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:144:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:145:1: ( ruleExpression EOF )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:146:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression242);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:153:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:157:2: ( ( ( rule__Expression__Group__0 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:158:1: ( ( rule__Expression__Group__0 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:158:1: ( ( rule__Expression__Group__0 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:159:1: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:160:1: ( rule__Expression__Group__0 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:160:2: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_rule__Expression__Group__0_in_ruleExpression275);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAtomic"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:172:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:173:1: ( ruleAtomic EOF )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:174:1: ruleAtomic EOF
            {
             before(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic302);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getAtomicRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:181:1: ruleAtomic : ( ( rule__Atomic__Alternatives ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:185:2: ( ( ( rule__Atomic__Alternatives ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:186:1: ( ( rule__Atomic__Alternatives ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:186:1: ( ( rule__Atomic__Alternatives ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:187:1: ( rule__Atomic__Alternatives )
            {
             before(grammarAccess.getAtomicAccess().getAlternatives()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:188:1: ( rule__Atomic__Alternatives )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:188:2: rule__Atomic__Alternatives
            {
            pushFollow(FOLLOW_rule__Atomic__Alternatives_in_ruleAtomic335);
            rule__Atomic__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:200:1: rule__AbstractElement__Alternatives : ( ( ruleVariable ) | ( ruleExpression ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:204:1: ( ( ruleVariable ) | ( ruleExpression ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||(LA2_1>=RULE_ID && LA2_1<=RULE_STRING)||(LA2_1>=11 && LA2_1<=12)||(LA2_1>=14 && LA2_1<=16)) ) {
                    alt2=2;
                }
                else if ( (LA2_1==13) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA2_0>=RULE_INT && LA2_0<=RULE_STRING)||(LA2_0>=11 && LA2_0<=12)||LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:205:1: ( ruleVariable )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:205:1: ( ruleVariable )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:206:1: ruleVariable
                    {
                     before(grammarAccess.getAbstractElementAccess().getVariableParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleVariable_in_rule__AbstractElement__Alternatives371);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getVariableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:211:6: ( ruleExpression )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:211:6: ( ruleExpression )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:212:1: ruleExpression
                    {
                     before(grammarAccess.getAbstractElementAccess().getExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleExpression_in_rule__AbstractElement__Alternatives388);
                    ruleExpression();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getExpressionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractElement__Alternatives"


    // $ANTLR start "rule__Expression__Alternatives_1_0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:222:1: rule__Expression__Alternatives_1_0 : ( ( ( rule__Expression__Group_1_0_0__0 ) ) | ( ( rule__Expression__Group_1_0_1__0 ) ) );
    public final void rule__Expression__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:226:1: ( ( ( rule__Expression__Group_1_0_0__0 ) ) | ( ( rule__Expression__Group_1_0_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:227:1: ( ( rule__Expression__Group_1_0_0__0 ) )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:227:1: ( ( rule__Expression__Group_1_0_0__0 ) )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:228:1: ( rule__Expression__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_1_0_0()); 
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:229:1: ( rule__Expression__Group_1_0_0__0 )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:229:2: rule__Expression__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Expression__Group_1_0_0__0_in_rule__Expression__Alternatives_1_0420);
                    rule__Expression__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:233:6: ( ( rule__Expression__Group_1_0_1__0 ) )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:233:6: ( ( rule__Expression__Group_1_0_1__0 ) )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:234:1: ( rule__Expression__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_1_0_1()); 
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:235:1: ( rule__Expression__Group_1_0_1__0 )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:235:2: rule__Expression__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Expression__Group_1_0_1__0_in_rule__Expression__Alternatives_1_0438);
                    rule__Expression__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Alternatives_1_0"


    // $ANTLR start "rule__Atomic__Alternatives"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:244:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ( rule__Atomic__Group_4__0 ) ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:248:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ( rule__Atomic__Group_4__0 ) ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt4=1;
                }
                break;
            case RULE_INT:
                {
                alt4=2;
                }
                break;
            case RULE_STRING:
                {
                alt4=3;
                }
                break;
            case 11:
            case 12:
                {
                alt4=4;
                }
                break;
            case RULE_ID:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:249:1: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:249:1: ( ( rule__Atomic__Group_0__0 ) )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:250:1: ( rule__Atomic__Group_0__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:251:1: ( rule__Atomic__Group_0__0 )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:251:2: rule__Atomic__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_0__0_in_rule__Atomic__Alternatives471);
                    rule__Atomic__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:255:6: ( ( rule__Atomic__Group_1__0 ) )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:255:6: ( ( rule__Atomic__Group_1__0 ) )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:256:1: ( rule__Atomic__Group_1__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_1()); 
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:257:1: ( rule__Atomic__Group_1__0 )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:257:2: rule__Atomic__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_1__0_in_rule__Atomic__Alternatives489);
                    rule__Atomic__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:261:6: ( ( rule__Atomic__Group_2__0 ) )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:261:6: ( ( rule__Atomic__Group_2__0 ) )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:262:1: ( rule__Atomic__Group_2__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_2()); 
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:263:1: ( rule__Atomic__Group_2__0 )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:263:2: rule__Atomic__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_2__0_in_rule__Atomic__Alternatives507);
                    rule__Atomic__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:267:6: ( ( rule__Atomic__Group_3__0 ) )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:267:6: ( ( rule__Atomic__Group_3__0 ) )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:268:1: ( rule__Atomic__Group_3__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_3()); 
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:269:1: ( rule__Atomic__Group_3__0 )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:269:2: rule__Atomic__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_3__0_in_rule__Atomic__Alternatives525);
                    rule__Atomic__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:273:6: ( ( rule__Atomic__Group_4__0 ) )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:273:6: ( ( rule__Atomic__Group_4__0 ) )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:274:1: ( rule__Atomic__Group_4__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_4()); 
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:275:1: ( rule__Atomic__Group_4__0 )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:275:2: rule__Atomic__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_4__0_in_rule__Atomic__Alternatives543);
                    rule__Atomic__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Alternatives"


    // $ANTLR start "rule__Atomic__ValueAlternatives_3_1_0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:284:1: rule__Atomic__ValueAlternatives_3_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Atomic__ValueAlternatives_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:288:1: ( ( 'true' ) | ( 'false' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:289:1: ( 'true' )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:289:1: ( 'true' )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:290:1: 'true'
                    {
                     before(grammarAccess.getAtomicAccess().getValueTrueKeyword_3_1_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__Atomic__ValueAlternatives_3_1_0577); 
                     after(grammarAccess.getAtomicAccess().getValueTrueKeyword_3_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:297:6: ( 'false' )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:297:6: ( 'false' )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:298:1: 'false'
                    {
                     before(grammarAccess.getAtomicAccess().getValueFalseKeyword_3_1_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__Atomic__ValueAlternatives_3_1_0597); 
                     after(grammarAccess.getAtomicAccess().getValueFalseKeyword_3_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAlternatives_3_1_0"


    // $ANTLR start "rule__Variable__Group__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:312:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:316:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:317:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__0629);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__0632);
            rule__Variable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:324:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__NameAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:328:1: ( ( ( rule__Variable__NameAssignment_0 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:329:1: ( ( rule__Variable__NameAssignment_0 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:329:1: ( ( rule__Variable__NameAssignment_0 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:330:1: ( rule__Variable__NameAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:331:1: ( rule__Variable__NameAssignment_0 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:331:2: rule__Variable__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Variable__NameAssignment_0_in_rule__Variable__Group__0__Impl659);
            rule__Variable__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:341:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:345:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:346:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__1689);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable__Group__2_in_rule__Variable__Group__1692);
            rule__Variable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:353:1: rule__Variable__Group__1__Impl : ( '=' ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:357:1: ( ( '=' ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:358:1: ( '=' )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:358:1: ( '=' )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:359:1: '='
            {
             before(grammarAccess.getVariableAccess().getEqualsSignKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__Variable__Group__1__Impl720); 
             after(grammarAccess.getVariableAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__2"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:372:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:376:1: ( rule__Variable__Group__2__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:377:2: rule__Variable__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Variable__Group__2__Impl_in_rule__Variable__Group__2751);
            rule__Variable__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:383:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__ExpressionAssignment_2 ) ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:387:1: ( ( ( rule__Variable__ExpressionAssignment_2 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:388:1: ( ( rule__Variable__ExpressionAssignment_2 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:388:1: ( ( rule__Variable__ExpressionAssignment_2 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:389:1: ( rule__Variable__ExpressionAssignment_2 )
            {
             before(grammarAccess.getVariableAccess().getExpressionAssignment_2()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:390:1: ( rule__Variable__ExpressionAssignment_2 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:390:2: rule__Variable__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__Variable__ExpressionAssignment_2_in_rule__Variable__Group__2__Impl778);
            rule__Variable__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:406:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:410:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:411:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__0814);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__0817);
            rule__Expression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:418:1: rule__Expression__Group__0__Impl : ( ruleAtomic ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:422:1: ( ( ruleAtomic ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:423:1: ( ruleAtomic )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:423:1: ( ruleAtomic )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:424:1: ruleAtomic
            {
             before(grammarAccess.getExpressionAccess().getAtomicParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAtomic_in_rule__Expression__Group__0__Impl844);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getAtomicParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:435:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:439:1: ( rule__Expression__Group__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:440:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__1873);
            rule__Expression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:446:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )* ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:450:1: ( ( ( rule__Expression__Group_1__0 )* ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:451:1: ( ( rule__Expression__Group_1__0 )* )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:451:1: ( ( rule__Expression__Group_1__0 )* )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:452:1: ( rule__Expression__Group_1__0 )*
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:453:1: ( rule__Expression__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=14 && LA6_0<=15)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:453:2: rule__Expression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl900);
            	    rule__Expression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:467:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:471:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:472:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__0935);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__0938);
            rule__Expression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:479:1: rule__Expression__Group_1__0__Impl : ( ( rule__Expression__Alternatives_1_0 ) ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:483:1: ( ( ( rule__Expression__Alternatives_1_0 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:484:1: ( ( rule__Expression__Alternatives_1_0 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:484:1: ( ( rule__Expression__Alternatives_1_0 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:485:1: ( rule__Expression__Alternatives_1_0 )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives_1_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:486:1: ( rule__Expression__Alternatives_1_0 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:486:2: rule__Expression__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Expression__Alternatives_1_0_in_rule__Expression__Group_1__0__Impl965);
            rule__Expression__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:496:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:500:1: ( rule__Expression__Group_1__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:501:2: rule__Expression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__1995);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:507:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__RightAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:511:1: ( ( ( rule__Expression__RightAssignment_1_1 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:512:1: ( ( rule__Expression__RightAssignment_1_1 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:512:1: ( ( rule__Expression__RightAssignment_1_1 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:513:1: ( rule__Expression__RightAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_1_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:514:1: ( rule__Expression__RightAssignment_1_1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:514:2: rule__Expression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Expression__RightAssignment_1_1_in_rule__Expression__Group_1__1__Impl1022);
            rule__Expression__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__Expression__Group_1_0_0__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:528:1: rule__Expression__Group_1_0_0__0 : rule__Expression__Group_1_0_0__0__Impl rule__Expression__Group_1_0_0__1 ;
    public final void rule__Expression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:532:1: ( rule__Expression__Group_1_0_0__0__Impl rule__Expression__Group_1_0_0__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:533:2: rule__Expression__Group_1_0_0__0__Impl rule__Expression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Expression__Group_1_0_0__0__Impl_in_rule__Expression__Group_1_0_0__01056);
            rule__Expression__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1_0_0__1_in_rule__Expression__Group_1_0_0__01059);
            rule__Expression__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0_0__0"


    // $ANTLR start "rule__Expression__Group_1_0_0__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:540:1: rule__Expression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:544:1: ( ( () ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:545:1: ( () )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:545:1: ( () )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:546:1: ()
            {
             before(grammarAccess.getExpressionAccess().getPlusLeftAction_1_0_0_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:547:1: ()
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:549:1: 
            {
            }

             after(grammarAccess.getExpressionAccess().getPlusLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Expression__Group_1_0_0__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:559:1: rule__Expression__Group_1_0_0__1 : rule__Expression__Group_1_0_0__1__Impl ;
    public final void rule__Expression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:563:1: ( rule__Expression__Group_1_0_0__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:564:2: rule__Expression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group_1_0_0__1__Impl_in_rule__Expression__Group_1_0_0__11117);
            rule__Expression__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0_0__1"


    // $ANTLR start "rule__Expression__Group_1_0_0__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:570:1: rule__Expression__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__Expression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:574:1: ( ( '+' ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:575:1: ( '+' )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:575:1: ( '+' )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:576:1: '+'
            {
             before(grammarAccess.getExpressionAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,14,FOLLOW_14_in_rule__Expression__Group_1_0_0__1__Impl1145); 
             after(grammarAccess.getExpressionAccess().getPlusSignKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Expression__Group_1_0_1__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:593:1: rule__Expression__Group_1_0_1__0 : rule__Expression__Group_1_0_1__0__Impl rule__Expression__Group_1_0_1__1 ;
    public final void rule__Expression__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:597:1: ( rule__Expression__Group_1_0_1__0__Impl rule__Expression__Group_1_0_1__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:598:2: rule__Expression__Group_1_0_1__0__Impl rule__Expression__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Expression__Group_1_0_1__0__Impl_in_rule__Expression__Group_1_0_1__01180);
            rule__Expression__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1_0_1__1_in_rule__Expression__Group_1_0_1__01183);
            rule__Expression__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0_1__0"


    // $ANTLR start "rule__Expression__Group_1_0_1__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:605:1: rule__Expression__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:609:1: ( ( () ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:610:1: ( () )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:610:1: ( () )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:611:1: ()
            {
             before(grammarAccess.getExpressionAccess().getMinusLeftAction_1_0_1_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:612:1: ()
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:614:1: 
            {
            }

             after(grammarAccess.getExpressionAccess().getMinusLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1_0_1__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:624:1: rule__Expression__Group_1_0_1__1 : rule__Expression__Group_1_0_1__1__Impl ;
    public final void rule__Expression__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:628:1: ( rule__Expression__Group_1_0_1__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:629:2: rule__Expression__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group_1_0_1__1__Impl_in_rule__Expression__Group_1_0_1__11241);
            rule__Expression__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0_1__1"


    // $ANTLR start "rule__Expression__Group_1_0_1__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:635:1: rule__Expression__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__Expression__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:639:1: ( ( '-' ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:640:1: ( '-' )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:640:1: ( '-' )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:641:1: '-'
            {
             before(grammarAccess.getExpressionAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,15,FOLLOW_15_in_rule__Expression__Group_1_0_1__1__Impl1269); 
             after(grammarAccess.getExpressionAccess().getHyphenMinusKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Atomic__Group_0__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:658:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:662:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:663:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0__0__Impl_in_rule__Atomic__Group_0__01304);
            rule__Atomic__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_0__1_in_rule__Atomic__Group_0__01307);
            rule__Atomic__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__0"


    // $ANTLR start "rule__Atomic__Group_0__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:670:1: rule__Atomic__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:674:1: ( ( '(' ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:675:1: ( '(' )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:675:1: ( '(' )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:676:1: '('
            {
             before(grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,16,FOLLOW_16_in_rule__Atomic__Group_0__0__Impl1335); 
             after(grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__0__Impl"


    // $ANTLR start "rule__Atomic__Group_0__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:689:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl rule__Atomic__Group_0__2 ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:693:1: ( rule__Atomic__Group_0__1__Impl rule__Atomic__Group_0__2 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:694:2: rule__Atomic__Group_0__1__Impl rule__Atomic__Group_0__2
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0__1__Impl_in_rule__Atomic__Group_0__11366);
            rule__Atomic__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_0__2_in_rule__Atomic__Group_0__11369);
            rule__Atomic__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__1"


    // $ANTLR start "rule__Atomic__Group_0__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:701:1: rule__Atomic__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:705:1: ( ( ruleExpression ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:706:1: ( ruleExpression )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:706:1: ( ruleExpression )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:707:1: ruleExpression
            {
             before(grammarAccess.getAtomicAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Atomic__Group_0__1__Impl1396);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getAtomicAccess().getExpressionParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__1__Impl"


    // $ANTLR start "rule__Atomic__Group_0__2"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:718:1: rule__Atomic__Group_0__2 : rule__Atomic__Group_0__2__Impl ;
    public final void rule__Atomic__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:722:1: ( rule__Atomic__Group_0__2__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:723:2: rule__Atomic__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0__2__Impl_in_rule__Atomic__Group_0__21425);
            rule__Atomic__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__2"


    // $ANTLR start "rule__Atomic__Group_0__2__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:729:1: rule__Atomic__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Atomic__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:733:1: ( ( ')' ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:734:1: ( ')' )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:734:1: ( ')' )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:735:1: ')'
            {
             before(grammarAccess.getAtomicAccess().getRightParenthesisKeyword_0_2()); 
            match(input,17,FOLLOW_17_in_rule__Atomic__Group_0__2__Impl1453); 
             after(grammarAccess.getAtomicAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__2__Impl"


    // $ANTLR start "rule__Atomic__Group_1__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:754:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:758:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:759:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__0__Impl_in_rule__Atomic__Group_1__01490);
            rule__Atomic__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_1__1_in_rule__Atomic__Group_1__01493);
            rule__Atomic__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__0"


    // $ANTLR start "rule__Atomic__Group_1__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:766:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:770:1: ( ( () ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:771:1: ( () )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:771:1: ( () )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:772:1: ()
            {
             before(grammarAccess.getAtomicAccess().getIntConstantAction_1_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:773:1: ()
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:775:1: 
            {
            }

             after(grammarAccess.getAtomicAccess().getIntConstantAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__0__Impl"


    // $ANTLR start "rule__Atomic__Group_1__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:785:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:789:1: ( rule__Atomic__Group_1__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:790:2: rule__Atomic__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__1__Impl_in_rule__Atomic__Group_1__11551);
            rule__Atomic__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__1"


    // $ANTLR start "rule__Atomic__Group_1__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:796:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__ValueAssignment_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:800:1: ( ( ( rule__Atomic__ValueAssignment_1_1 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:801:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:801:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:802:1: ( rule__Atomic__ValueAssignment_1_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:803:1: ( rule__Atomic__ValueAssignment_1_1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:803:2: rule__Atomic__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_1_1_in_rule__Atomic__Group_1__1__Impl1578);
            rule__Atomic__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__1__Impl"


    // $ANTLR start "rule__Atomic__Group_2__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:817:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:821:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:822:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_2__0__Impl_in_rule__Atomic__Group_2__01612);
            rule__Atomic__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_2__1_in_rule__Atomic__Group_2__01615);
            rule__Atomic__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__0"


    // $ANTLR start "rule__Atomic__Group_2__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:829:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:833:1: ( ( () ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:834:1: ( () )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:834:1: ( () )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:835:1: ()
            {
             before(grammarAccess.getAtomicAccess().getStringConstantAction_2_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:836:1: ()
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:838:1: 
            {
            }

             after(grammarAccess.getAtomicAccess().getStringConstantAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__0__Impl"


    // $ANTLR start "rule__Atomic__Group_2__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:848:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:852:1: ( rule__Atomic__Group_2__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:853:2: rule__Atomic__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_2__1__Impl_in_rule__Atomic__Group_2__11673);
            rule__Atomic__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__1"


    // $ANTLR start "rule__Atomic__Group_2__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:859:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__ValueAssignment_2_1 ) ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:863:1: ( ( ( rule__Atomic__ValueAssignment_2_1 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:864:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:864:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:865:1: ( rule__Atomic__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:866:1: ( rule__Atomic__ValueAssignment_2_1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:866:2: rule__Atomic__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_2_1_in_rule__Atomic__Group_2__1__Impl1700);
            rule__Atomic__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__1__Impl"


    // $ANTLR start "rule__Atomic__Group_3__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:880:1: rule__Atomic__Group_3__0 : rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 ;
    public final void rule__Atomic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:884:1: ( rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:885:2: rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3__0__Impl_in_rule__Atomic__Group_3__01734);
            rule__Atomic__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_3__1_in_rule__Atomic__Group_3__01737);
            rule__Atomic__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__0"


    // $ANTLR start "rule__Atomic__Group_3__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:892:1: rule__Atomic__Group_3__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:896:1: ( ( () ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:897:1: ( () )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:897:1: ( () )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:898:1: ()
            {
             before(grammarAccess.getAtomicAccess().getBoolConstantAction_3_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:899:1: ()
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:901:1: 
            {
            }

             after(grammarAccess.getAtomicAccess().getBoolConstantAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__0__Impl"


    // $ANTLR start "rule__Atomic__Group_3__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:911:1: rule__Atomic__Group_3__1 : rule__Atomic__Group_3__1__Impl ;
    public final void rule__Atomic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:915:1: ( rule__Atomic__Group_3__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:916:2: rule__Atomic__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3__1__Impl_in_rule__Atomic__Group_3__11795);
            rule__Atomic__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__1"


    // $ANTLR start "rule__Atomic__Group_3__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:922:1: rule__Atomic__Group_3__1__Impl : ( ( rule__Atomic__ValueAssignment_3_1 ) ) ;
    public final void rule__Atomic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:926:1: ( ( ( rule__Atomic__ValueAssignment_3_1 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:927:1: ( ( rule__Atomic__ValueAssignment_3_1 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:927:1: ( ( rule__Atomic__ValueAssignment_3_1 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:928:1: ( rule__Atomic__ValueAssignment_3_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_3_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:929:1: ( rule__Atomic__ValueAssignment_3_1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:929:2: rule__Atomic__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_3_1_in_rule__Atomic__Group_3__1__Impl1822);
            rule__Atomic__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__1__Impl"


    // $ANTLR start "rule__Atomic__Group_4__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:943:1: rule__Atomic__Group_4__0 : rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1 ;
    public final void rule__Atomic__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:947:1: ( rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:948:2: rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_4__0__Impl_in_rule__Atomic__Group_4__01856);
            rule__Atomic__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_4__1_in_rule__Atomic__Group_4__01859);
            rule__Atomic__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_4__0"


    // $ANTLR start "rule__Atomic__Group_4__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:955:1: rule__Atomic__Group_4__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:959:1: ( ( () ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:960:1: ( () )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:960:1: ( () )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:961:1: ()
            {
             before(grammarAccess.getAtomicAccess().getVariableRefAction_4_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:962:1: ()
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:964:1: 
            {
            }

             after(grammarAccess.getAtomicAccess().getVariableRefAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_4__0__Impl"


    // $ANTLR start "rule__Atomic__Group_4__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:974:1: rule__Atomic__Group_4__1 : rule__Atomic__Group_4__1__Impl ;
    public final void rule__Atomic__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:978:1: ( rule__Atomic__Group_4__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:979:2: rule__Atomic__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_4__1__Impl_in_rule__Atomic__Group_4__11917);
            rule__Atomic__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_4__1"


    // $ANTLR start "rule__Atomic__Group_4__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:985:1: rule__Atomic__Group_4__1__Impl : ( ( rule__Atomic__VariableAssignment_4_1 ) ) ;
    public final void rule__Atomic__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:989:1: ( ( ( rule__Atomic__VariableAssignment_4_1 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:990:1: ( ( rule__Atomic__VariableAssignment_4_1 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:990:1: ( ( rule__Atomic__VariableAssignment_4_1 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:991:1: ( rule__Atomic__VariableAssignment_4_1 )
            {
             before(grammarAccess.getAtomicAccess().getVariableAssignment_4_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:992:1: ( rule__Atomic__VariableAssignment_4_1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:992:2: rule__Atomic__VariableAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Atomic__VariableAssignment_4_1_in_rule__Atomic__Group_4__1__Impl1944);
            rule__Atomic__VariableAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getVariableAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_4__1__Impl"


    // $ANTLR start "rule__ExpressionModel__ElementsAssignment"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1007:1: rule__ExpressionModel__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__ExpressionModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1011:1: ( ( ruleAbstractElement ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1012:1: ( ruleAbstractElement )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1012:1: ( ruleAbstractElement )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1013:1: ruleAbstractElement
            {
             before(grammarAccess.getExpressionModelAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__ExpressionModel__ElementsAssignment1983);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getExpressionModelAccess().getElementsAbstractElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionModel__ElementsAssignment"


    // $ANTLR start "rule__Variable__NameAssignment_0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1022:1: rule__Variable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1026:1: ( ( RULE_ID ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1027:1: ( RULE_ID )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1027:1: ( RULE_ID )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1028:1: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_02014); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment_0"


    // $ANTLR start "rule__Variable__ExpressionAssignment_2"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1037:1: rule__Variable__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__Variable__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1041:1: ( ( ruleExpression ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1042:1: ( ruleExpression )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1042:1: ( ruleExpression )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1043:1: ruleExpression
            {
             before(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Variable__ExpressionAssignment_22045);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__ExpressionAssignment_2"


    // $ANTLR start "rule__Expression__RightAssignment_1_1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1052:1: rule__Expression__RightAssignment_1_1 : ( ruleAtomic ) ;
    public final void rule__Expression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1056:1: ( ( ruleAtomic ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1057:1: ( ruleAtomic )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1057:1: ( ruleAtomic )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1058:1: ruleAtomic
            {
             before(grammarAccess.getExpressionAccess().getRightAtomicParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAtomic_in_rule__Expression__RightAssignment_1_12076);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getRightAtomicParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__RightAssignment_1_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_1_1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1067:1: rule__Atomic__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Atomic__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1071:1: ( ( RULE_INT ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1072:1: ( RULE_INT )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1072:1: ( RULE_INT )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1073:1: RULE_INT
            {
             before(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Atomic__ValueAssignment_1_12107); 
             after(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_1_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_2_1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1082:1: rule__Atomic__ValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Atomic__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1086:1: ( ( RULE_STRING ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1087:1: ( RULE_STRING )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1087:1: ( RULE_STRING )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1088:1: RULE_STRING
            {
             before(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Atomic__ValueAssignment_2_12138); 
             after(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_2_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_3_1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1097:1: rule__Atomic__ValueAssignment_3_1 : ( ( rule__Atomic__ValueAlternatives_3_1_0 ) ) ;
    public final void rule__Atomic__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1101:1: ( ( ( rule__Atomic__ValueAlternatives_3_1_0 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1102:1: ( ( rule__Atomic__ValueAlternatives_3_1_0 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1102:1: ( ( rule__Atomic__ValueAlternatives_3_1_0 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1103:1: ( rule__Atomic__ValueAlternatives_3_1_0 )
            {
             before(grammarAccess.getAtomicAccess().getValueAlternatives_3_1_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1104:1: ( rule__Atomic__ValueAlternatives_3_1_0 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1104:2: rule__Atomic__ValueAlternatives_3_1_0
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAlternatives_3_1_0_in_rule__Atomic__ValueAssignment_3_12169);
            rule__Atomic__ValueAlternatives_3_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAlternatives_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_3_1"


    // $ANTLR start "rule__Atomic__VariableAssignment_4_1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1113:1: rule__Atomic__VariableAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Atomic__VariableAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1117:1: ( ( ( RULE_ID ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1118:1: ( ( RULE_ID ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1118:1: ( ( RULE_ID ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1119:1: ( RULE_ID )
            {
             before(grammarAccess.getAtomicAccess().getVariableVariableCrossReference_4_1_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1120:1: ( RULE_ID )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1121:1: RULE_ID
            {
             before(grammarAccess.getAtomicAccess().getVariableVariableIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Atomic__VariableAssignment_4_12206); 
             after(grammarAccess.getAtomicAccess().getVariableVariableIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getAtomicAccess().getVariableVariableCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__VariableAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleExpressionModel_in_entryRuleExpressionModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionModel__ElementsAssignment_in_ruleExpressionModel94 = new BitSet(new long[]{0x0000000000011872L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractElement__Alternatives_in_ruleAbstractElement155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__0_in_ruleVariable215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0_in_ruleExpression275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Alternatives_in_ruleAtomic335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__AbstractElement__Alternatives371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__AbstractElement__Alternatives388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1_0_0__0_in_rule__Expression__Alternatives_1_0420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1_0_1__0_in_rule__Expression__Alternatives_1_0438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__0_in_rule__Atomic__Alternatives471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__0_in_rule__Atomic__Alternatives489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__0_in_rule__Atomic__Alternatives507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__0_in_rule__Atomic__Alternatives525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_4__0_in_rule__Atomic__Alternatives543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Atomic__ValueAlternatives_3_1_0577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Atomic__ValueAlternatives_3_1_0597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__0629 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__0632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__NameAssignment_0_in_rule__Variable__Group__0__Impl659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__1689 = new BitSet(new long[]{0x0000000000011870L});
    public static final BitSet FOLLOW_rule__Variable__Group__2_in_rule__Variable__Group__1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Variable__Group__1__Impl720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__2__Impl_in_rule__Variable__Group__2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__ExpressionAssignment_2_in_rule__Variable__Group__2__Impl778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__0814 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__0817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rule__Expression__Group__0__Impl844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl900 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__0935 = new BitSet(new long[]{0x0000000000011870L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__0938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Alternatives_1_0_in_rule__Expression__Group_1__0__Impl965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__RightAssignment_1_1_in_rule__Expression__Group_1__1__Impl1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1_0_0__0__Impl_in_rule__Expression__Group_1_0_0__01056 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Expression__Group_1_0_0__1_in_rule__Expression__Group_1_0_0__01059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1_0_0__1__Impl_in_rule__Expression__Group_1_0_0__11117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Expression__Group_1_0_0__1__Impl1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1_0_1__0__Impl_in_rule__Expression__Group_1_0_1__01180 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Expression__Group_1_0_1__1_in_rule__Expression__Group_1_0_1__01183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1_0_1__1__Impl_in_rule__Expression__Group_1_0_1__11241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Expression__Group_1_0_1__1__Impl1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__0__Impl_in_rule__Atomic__Group_0__01304 = new BitSet(new long[]{0x0000000000011870L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__1_in_rule__Atomic__Group_0__01307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Atomic__Group_0__0__Impl1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__1__Impl_in_rule__Atomic__Group_0__11366 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__2_in_rule__Atomic__Group_0__11369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Atomic__Group_0__1__Impl1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__2__Impl_in_rule__Atomic__Group_0__21425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Atomic__Group_0__2__Impl1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__0__Impl_in_rule__Atomic__Group_1__01490 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__1_in_rule__Atomic__Group_1__01493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__1__Impl_in_rule__Atomic__Group_1__11551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_1_1_in_rule__Atomic__Group_1__1__Impl1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__0__Impl_in_rule__Atomic__Group_2__01612 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__1_in_rule__Atomic__Group_2__01615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__1__Impl_in_rule__Atomic__Group_2__11673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_2_1_in_rule__Atomic__Group_2__1__Impl1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__0__Impl_in_rule__Atomic__Group_3__01734 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__1_in_rule__Atomic__Group_3__01737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__1__Impl_in_rule__Atomic__Group_3__11795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_3_1_in_rule__Atomic__Group_3__1__Impl1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_4__0__Impl_in_rule__Atomic__Group_4__01856 = new BitSet(new long[]{0x0000000000011870L});
    public static final BitSet FOLLOW_rule__Atomic__Group_4__1_in_rule__Atomic__Group_4__01859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_4__1__Impl_in_rule__Atomic__Group_4__11917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__VariableAssignment_4_1_in_rule__Atomic__Group_4__1__Impl1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__ExpressionModel__ElementsAssignment1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_02014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Variable__ExpressionAssignment_22045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rule__Expression__RightAssignment_1_12076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Atomic__ValueAssignment_1_12107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Atomic__ValueAssignment_2_12138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAlternatives_3_1_0_in_rule__Atomic__ValueAssignment_3_12169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Atomic__VariableAssignment_4_12206 = new BitSet(new long[]{0x0000000000000002L});

}