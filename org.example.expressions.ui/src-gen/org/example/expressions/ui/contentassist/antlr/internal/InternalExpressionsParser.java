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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'='"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__12=12;
    public static final int T__11=11;
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

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_STRING)||(LA1_0>=11 && LA1_0<=12)) ) {
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:153:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:157:2: ( ( ( rule__Expression__Alternatives ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:158:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:158:1: ( ( rule__Expression__Alternatives ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:159:1: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:160:1: ( rule__Expression__Alternatives )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:160:2: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_rule__Expression__Alternatives_in_ruleExpression275);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

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


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:172:1: rule__AbstractElement__Alternatives : ( ( ruleVariable ) | ( ruleExpression ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:176:1: ( ( ruleVariable ) | ( ruleExpression ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||(LA2_1>=RULE_ID && LA2_1<=RULE_STRING)||(LA2_1>=11 && LA2_1<=12)) ) {
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
            else if ( ((LA2_0>=RULE_INT && LA2_0<=RULE_STRING)||(LA2_0>=11 && LA2_0<=12)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:177:1: ( ruleVariable )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:177:1: ( ruleVariable )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:178:1: ruleVariable
                    {
                     before(grammarAccess.getAbstractElementAccess().getVariableParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleVariable_in_rule__AbstractElement__Alternatives311);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getVariableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:183:6: ( ruleExpression )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:183:6: ( ruleExpression )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:184:1: ruleExpression
                    {
                     before(grammarAccess.getAbstractElementAccess().getExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleExpression_in_rule__AbstractElement__Alternatives328);
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


    // $ANTLR start "rule__Expression__Alternatives"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:194:1: rule__Expression__Alternatives : ( ( ( rule__Expression__Group_0__0 ) ) | ( ( rule__Expression__Group_1__0 ) ) | ( ( rule__Expression__Group_2__0 ) ) | ( ( rule__Expression__Group_3__0 ) ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:198:1: ( ( ( rule__Expression__Group_0__0 ) ) | ( ( rule__Expression__Group_1__0 ) ) | ( ( rule__Expression__Group_2__0 ) ) | ( ( rule__Expression__Group_3__0 ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt3=1;
                }
                break;
            case RULE_STRING:
                {
                alt3=2;
                }
                break;
            case 11:
            case 12:
                {
                alt3=3;
                }
                break;
            case RULE_ID:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:199:1: ( ( rule__Expression__Group_0__0 ) )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:199:1: ( ( rule__Expression__Group_0__0 ) )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:200:1: ( rule__Expression__Group_0__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_0()); 
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:201:1: ( rule__Expression__Group_0__0 )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:201:2: rule__Expression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Expression__Group_0__0_in_rule__Expression__Alternatives360);
                    rule__Expression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:205:6: ( ( rule__Expression__Group_1__0 ) )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:205:6: ( ( rule__Expression__Group_1__0 ) )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:206:1: ( rule__Expression__Group_1__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_1()); 
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:207:1: ( rule__Expression__Group_1__0 )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:207:2: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Alternatives378);
                    rule__Expression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:211:6: ( ( rule__Expression__Group_2__0 ) )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:211:6: ( ( rule__Expression__Group_2__0 ) )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:212:1: ( rule__Expression__Group_2__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_2()); 
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:213:1: ( rule__Expression__Group_2__0 )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:213:2: rule__Expression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Expression__Group_2__0_in_rule__Expression__Alternatives396);
                    rule__Expression__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:217:6: ( ( rule__Expression__Group_3__0 ) )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:217:6: ( ( rule__Expression__Group_3__0 ) )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:218:1: ( rule__Expression__Group_3__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_3()); 
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:219:1: ( rule__Expression__Group_3__0 )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:219:2: rule__Expression__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Expression__Group_3__0_in_rule__Expression__Alternatives414);
                    rule__Expression__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__Expression__ValueAlternatives_2_1_0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:228:1: rule__Expression__ValueAlternatives_2_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Expression__ValueAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:232:1: ( ( 'true' ) | ( 'false' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:233:1: ( 'true' )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:233:1: ( 'true' )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:234:1: 'true'
                    {
                     before(grammarAccess.getExpressionAccess().getValueTrueKeyword_2_1_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__Expression__ValueAlternatives_2_1_0448); 
                     after(grammarAccess.getExpressionAccess().getValueTrueKeyword_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:241:6: ( 'false' )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:241:6: ( 'false' )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:242:1: 'false'
                    {
                     before(grammarAccess.getExpressionAccess().getValueFalseKeyword_2_1_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__Expression__ValueAlternatives_2_1_0468); 
                     after(grammarAccess.getExpressionAccess().getValueFalseKeyword_2_1_0_1()); 

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
    // $ANTLR end "rule__Expression__ValueAlternatives_2_1_0"


    // $ANTLR start "rule__Variable__Group__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:256:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:260:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:261:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__0500);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__0503);
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:268:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__NameAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:272:1: ( ( ( rule__Variable__NameAssignment_0 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:273:1: ( ( rule__Variable__NameAssignment_0 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:273:1: ( ( rule__Variable__NameAssignment_0 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:274:1: ( rule__Variable__NameAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:275:1: ( rule__Variable__NameAssignment_0 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:275:2: rule__Variable__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Variable__NameAssignment_0_in_rule__Variable__Group__0__Impl530);
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:285:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:289:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:290:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__1560);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable__Group__2_in_rule__Variable__Group__1563);
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:297:1: rule__Variable__Group__1__Impl : ( '=' ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:301:1: ( ( '=' ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:302:1: ( '=' )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:302:1: ( '=' )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:303:1: '='
            {
             before(grammarAccess.getVariableAccess().getEqualsSignKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__Variable__Group__1__Impl591); 
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:316:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:320:1: ( rule__Variable__Group__2__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:321:2: rule__Variable__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Variable__Group__2__Impl_in_rule__Variable__Group__2622);
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:327:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__ExpressionAssignment_2 ) ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:331:1: ( ( ( rule__Variable__ExpressionAssignment_2 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:332:1: ( ( rule__Variable__ExpressionAssignment_2 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:332:1: ( ( rule__Variable__ExpressionAssignment_2 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:333:1: ( rule__Variable__ExpressionAssignment_2 )
            {
             before(grammarAccess.getVariableAccess().getExpressionAssignment_2()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:334:1: ( rule__Variable__ExpressionAssignment_2 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:334:2: rule__Variable__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__Variable__ExpressionAssignment_2_in_rule__Variable__Group__2__Impl649);
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


    // $ANTLR start "rule__Expression__Group_0__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:350:1: rule__Expression__Group_0__0 : rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1 ;
    public final void rule__Expression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:354:1: ( rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:355:2: rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1
            {
            pushFollow(FOLLOW_rule__Expression__Group_0__0__Impl_in_rule__Expression__Group_0__0685);
            rule__Expression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_0__1_in_rule__Expression__Group_0__0688);
            rule__Expression__Group_0__1();

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
    // $ANTLR end "rule__Expression__Group_0__0"


    // $ANTLR start "rule__Expression__Group_0__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:362:1: rule__Expression__Group_0__0__Impl : ( () ) ;
    public final void rule__Expression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:366:1: ( ( () ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:367:1: ( () )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:367:1: ( () )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:368:1: ()
            {
             before(grammarAccess.getExpressionAccess().getIntConstantAction_0_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:369:1: ()
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:371:1: 
            {
            }

             after(grammarAccess.getExpressionAccess().getIntConstantAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0__0__Impl"


    // $ANTLR start "rule__Expression__Group_0__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:381:1: rule__Expression__Group_0__1 : rule__Expression__Group_0__1__Impl ;
    public final void rule__Expression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:385:1: ( rule__Expression__Group_0__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:386:2: rule__Expression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group_0__1__Impl_in_rule__Expression__Group_0__1746);
            rule__Expression__Group_0__1__Impl();

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
    // $ANTLR end "rule__Expression__Group_0__1"


    // $ANTLR start "rule__Expression__Group_0__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:392:1: rule__Expression__Group_0__1__Impl : ( ( rule__Expression__ValueAssignment_0_1 ) ) ;
    public final void rule__Expression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:396:1: ( ( ( rule__Expression__ValueAssignment_0_1 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:397:1: ( ( rule__Expression__ValueAssignment_0_1 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:397:1: ( ( rule__Expression__ValueAssignment_0_1 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:398:1: ( rule__Expression__ValueAssignment_0_1 )
            {
             before(grammarAccess.getExpressionAccess().getValueAssignment_0_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:399:1: ( rule__Expression__ValueAssignment_0_1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:399:2: rule__Expression__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Expression__ValueAssignment_0_1_in_rule__Expression__Group_0__1__Impl773);
            rule__Expression__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getValueAssignment_0_1()); 

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
    // $ANTLR end "rule__Expression__Group_0__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:413:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:417:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:418:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__0807);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__0810);
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:425:1: rule__Expression__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:429:1: ( ( () ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:430:1: ( () )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:430:1: ( () )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:431:1: ()
            {
             before(grammarAccess.getExpressionAccess().getStringConstantAction_1_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:432:1: ()
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:434:1: 
            {
            }

             after(grammarAccess.getExpressionAccess().getStringConstantAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:444:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:448:1: ( rule__Expression__Group_1__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:449:2: rule__Expression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__1868);
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:455:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__ValueAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:459:1: ( ( ( rule__Expression__ValueAssignment_1_1 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:460:1: ( ( rule__Expression__ValueAssignment_1_1 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:460:1: ( ( rule__Expression__ValueAssignment_1_1 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:461:1: ( rule__Expression__ValueAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getValueAssignment_1_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:462:1: ( rule__Expression__ValueAssignment_1_1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:462:2: rule__Expression__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Expression__ValueAssignment_1_1_in_rule__Expression__Group_1__1__Impl895);
            rule__Expression__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getValueAssignment_1_1()); 

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


    // $ANTLR start "rule__Expression__Group_2__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:476:1: rule__Expression__Group_2__0 : rule__Expression__Group_2__0__Impl rule__Expression__Group_2__1 ;
    public final void rule__Expression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:480:1: ( rule__Expression__Group_2__0__Impl rule__Expression__Group_2__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:481:2: rule__Expression__Group_2__0__Impl rule__Expression__Group_2__1
            {
            pushFollow(FOLLOW_rule__Expression__Group_2__0__Impl_in_rule__Expression__Group_2__0929);
            rule__Expression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_2__1_in_rule__Expression__Group_2__0932);
            rule__Expression__Group_2__1();

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
    // $ANTLR end "rule__Expression__Group_2__0"


    // $ANTLR start "rule__Expression__Group_2__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:488:1: rule__Expression__Group_2__0__Impl : ( () ) ;
    public final void rule__Expression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:492:1: ( ( () ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:493:1: ( () )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:493:1: ( () )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:494:1: ()
            {
             before(grammarAccess.getExpressionAccess().getBoolConstantAction_2_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:495:1: ()
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:497:1: 
            {
            }

             after(grammarAccess.getExpressionAccess().getBoolConstantAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_2__0__Impl"


    // $ANTLR start "rule__Expression__Group_2__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:507:1: rule__Expression__Group_2__1 : rule__Expression__Group_2__1__Impl ;
    public final void rule__Expression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:511:1: ( rule__Expression__Group_2__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:512:2: rule__Expression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group_2__1__Impl_in_rule__Expression__Group_2__1990);
            rule__Expression__Group_2__1__Impl();

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
    // $ANTLR end "rule__Expression__Group_2__1"


    // $ANTLR start "rule__Expression__Group_2__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:518:1: rule__Expression__Group_2__1__Impl : ( ( rule__Expression__ValueAssignment_2_1 ) ) ;
    public final void rule__Expression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:522:1: ( ( ( rule__Expression__ValueAssignment_2_1 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:523:1: ( ( rule__Expression__ValueAssignment_2_1 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:523:1: ( ( rule__Expression__ValueAssignment_2_1 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:524:1: ( rule__Expression__ValueAssignment_2_1 )
            {
             before(grammarAccess.getExpressionAccess().getValueAssignment_2_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:525:1: ( rule__Expression__ValueAssignment_2_1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:525:2: rule__Expression__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Expression__ValueAssignment_2_1_in_rule__Expression__Group_2__1__Impl1017);
            rule__Expression__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getValueAssignment_2_1()); 

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
    // $ANTLR end "rule__Expression__Group_2__1__Impl"


    // $ANTLR start "rule__Expression__Group_3__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:539:1: rule__Expression__Group_3__0 : rule__Expression__Group_3__0__Impl rule__Expression__Group_3__1 ;
    public final void rule__Expression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:543:1: ( rule__Expression__Group_3__0__Impl rule__Expression__Group_3__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:544:2: rule__Expression__Group_3__0__Impl rule__Expression__Group_3__1
            {
            pushFollow(FOLLOW_rule__Expression__Group_3__0__Impl_in_rule__Expression__Group_3__01051);
            rule__Expression__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_3__1_in_rule__Expression__Group_3__01054);
            rule__Expression__Group_3__1();

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
    // $ANTLR end "rule__Expression__Group_3__0"


    // $ANTLR start "rule__Expression__Group_3__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:551:1: rule__Expression__Group_3__0__Impl : ( () ) ;
    public final void rule__Expression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:555:1: ( ( () ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:556:1: ( () )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:556:1: ( () )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:557:1: ()
            {
             before(grammarAccess.getExpressionAccess().getVariableRefAction_3_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:558:1: ()
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:560:1: 
            {
            }

             after(grammarAccess.getExpressionAccess().getVariableRefAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_3__0__Impl"


    // $ANTLR start "rule__Expression__Group_3__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:570:1: rule__Expression__Group_3__1 : rule__Expression__Group_3__1__Impl ;
    public final void rule__Expression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:574:1: ( rule__Expression__Group_3__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:575:2: rule__Expression__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group_3__1__Impl_in_rule__Expression__Group_3__11112);
            rule__Expression__Group_3__1__Impl();

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
    // $ANTLR end "rule__Expression__Group_3__1"


    // $ANTLR start "rule__Expression__Group_3__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:581:1: rule__Expression__Group_3__1__Impl : ( ( rule__Expression__VariableAssignment_3_1 ) ) ;
    public final void rule__Expression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:585:1: ( ( ( rule__Expression__VariableAssignment_3_1 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:586:1: ( ( rule__Expression__VariableAssignment_3_1 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:586:1: ( ( rule__Expression__VariableAssignment_3_1 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:587:1: ( rule__Expression__VariableAssignment_3_1 )
            {
             before(grammarAccess.getExpressionAccess().getVariableAssignment_3_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:588:1: ( rule__Expression__VariableAssignment_3_1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:588:2: rule__Expression__VariableAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Expression__VariableAssignment_3_1_in_rule__Expression__Group_3__1__Impl1139);
            rule__Expression__VariableAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getVariableAssignment_3_1()); 

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
    // $ANTLR end "rule__Expression__Group_3__1__Impl"


    // $ANTLR start "rule__ExpressionModel__ElementsAssignment"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:603:1: rule__ExpressionModel__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__ExpressionModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:607:1: ( ( ruleAbstractElement ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:608:1: ( ruleAbstractElement )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:608:1: ( ruleAbstractElement )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:609:1: ruleAbstractElement
            {
             before(grammarAccess.getExpressionModelAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__ExpressionModel__ElementsAssignment1178);
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:618:1: rule__Variable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:622:1: ( ( RULE_ID ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:623:1: ( RULE_ID )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:623:1: ( RULE_ID )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:624:1: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_01209); 
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:633:1: rule__Variable__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__Variable__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:637:1: ( ( ruleExpression ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:638:1: ( ruleExpression )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:638:1: ( ruleExpression )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:639:1: ruleExpression
            {
             before(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Variable__ExpressionAssignment_21240);
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


    // $ANTLR start "rule__Expression__ValueAssignment_0_1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:648:1: rule__Expression__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Expression__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:652:1: ( ( RULE_INT ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:653:1: ( RULE_INT )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:653:1: ( RULE_INT )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:654:1: RULE_INT
            {
             before(grammarAccess.getExpressionAccess().getValueINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Expression__ValueAssignment_0_11271); 
             after(grammarAccess.getExpressionAccess().getValueINTTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Expression__ValueAssignment_0_1"


    // $ANTLR start "rule__Expression__ValueAssignment_1_1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:663:1: rule__Expression__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Expression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:667:1: ( ( RULE_STRING ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:668:1: ( RULE_STRING )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:668:1: ( RULE_STRING )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:669:1: RULE_STRING
            {
             before(grammarAccess.getExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Expression__ValueAssignment_1_11302); 
             after(grammarAccess.getExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Expression__ValueAssignment_1_1"


    // $ANTLR start "rule__Expression__ValueAssignment_2_1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:678:1: rule__Expression__ValueAssignment_2_1 : ( ( rule__Expression__ValueAlternatives_2_1_0 ) ) ;
    public final void rule__Expression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:682:1: ( ( ( rule__Expression__ValueAlternatives_2_1_0 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:683:1: ( ( rule__Expression__ValueAlternatives_2_1_0 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:683:1: ( ( rule__Expression__ValueAlternatives_2_1_0 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:684:1: ( rule__Expression__ValueAlternatives_2_1_0 )
            {
             before(grammarAccess.getExpressionAccess().getValueAlternatives_2_1_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:685:1: ( rule__Expression__ValueAlternatives_2_1_0 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:685:2: rule__Expression__ValueAlternatives_2_1_0
            {
            pushFollow(FOLLOW_rule__Expression__ValueAlternatives_2_1_0_in_rule__Expression__ValueAssignment_2_11333);
            rule__Expression__ValueAlternatives_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getValueAlternatives_2_1_0()); 

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
    // $ANTLR end "rule__Expression__ValueAssignment_2_1"


    // $ANTLR start "rule__Expression__VariableAssignment_3_1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:694:1: rule__Expression__VariableAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Expression__VariableAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:698:1: ( ( ( RULE_ID ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:699:1: ( ( RULE_ID ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:699:1: ( ( RULE_ID ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:700:1: ( RULE_ID )
            {
             before(grammarAccess.getExpressionAccess().getVariableVariableCrossReference_3_1_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:701:1: ( RULE_ID )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:702:1: RULE_ID
            {
             before(grammarAccess.getExpressionAccess().getVariableVariableIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Expression__VariableAssignment_3_11370); 
             after(grammarAccess.getExpressionAccess().getVariableVariableIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getExpressionAccess().getVariableVariableCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__Expression__VariableAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleExpressionModel_in_entryRuleExpressionModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionModel__ElementsAssignment_in_ruleExpressionModel94 = new BitSet(new long[]{0x0000000000001872L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractElement__Alternatives_in_ruleAbstractElement155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__0_in_ruleVariable215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Alternatives_in_ruleExpression275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__AbstractElement__Alternatives311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__AbstractElement__Alternatives328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_0__0_in_rule__Expression__Alternatives360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Alternatives378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_2__0_in_rule__Expression__Alternatives396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_3__0_in_rule__Expression__Alternatives414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Expression__ValueAlternatives_2_1_0448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Expression__ValueAlternatives_2_1_0468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__0500 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__0503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__NameAssignment_0_in_rule__Variable__Group__0__Impl530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__1560 = new BitSet(new long[]{0x0000000000001870L});
    public static final BitSet FOLLOW_rule__Variable__Group__2_in_rule__Variable__Group__1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Variable__Group__1__Impl591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__2__Impl_in_rule__Variable__Group__2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__ExpressionAssignment_2_in_rule__Variable__Group__2__Impl649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_0__0__Impl_in_rule__Expression__Group_0__0685 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Expression__Group_0__1_in_rule__Expression__Group_0__0688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_0__1__Impl_in_rule__Expression__Group_0__1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__ValueAssignment_0_1_in_rule__Expression__Group_0__1__Impl773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__0807 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__0810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__ValueAssignment_1_1_in_rule__Expression__Group_1__1__Impl895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_2__0__Impl_in_rule__Expression__Group_2__0929 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Expression__Group_2__1_in_rule__Expression__Group_2__0932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_2__1__Impl_in_rule__Expression__Group_2__1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__ValueAssignment_2_1_in_rule__Expression__Group_2__1__Impl1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_3__0__Impl_in_rule__Expression__Group_3__01051 = new BitSet(new long[]{0x0000000000001870L});
    public static final BitSet FOLLOW_rule__Expression__Group_3__1_in_rule__Expression__Group_3__01054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_3__1__Impl_in_rule__Expression__Group_3__11112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__VariableAssignment_3_1_in_rule__Expression__Group_3__1__Impl1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__ExpressionModel__ElementsAssignment1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_01209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Variable__ExpressionAssignment_21240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Expression__ValueAssignment_0_11271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Expression__ValueAssignment_1_11302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__ValueAlternatives_2_1_0_in_rule__Expression__ValueAssignment_2_11333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Expression__VariableAssignment_3_11370 = new BitSet(new long[]{0x0000000000000002L});

}