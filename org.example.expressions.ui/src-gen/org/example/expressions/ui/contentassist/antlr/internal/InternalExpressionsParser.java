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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'/'", "'true'", "'false'", "'='", "'+'", "'-'", "'('", "')'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

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

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_STRING)||(LA1_0>=13 && LA1_0<=14)||LA1_0==18) ) {
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:153:1: ruleExpression : ( rulePlusOrMinus ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:157:2: ( ( rulePlusOrMinus ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:158:1: ( rulePlusOrMinus )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:158:1: ( rulePlusOrMinus )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:159:1: rulePlusOrMinus
            {
             before(grammarAccess.getExpressionAccess().getPlusOrMinusParserRuleCall()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_ruleExpression275);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getPlusOrMinusParserRuleCall()); 

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


    // $ANTLR start "entryRulePlusOrMinus"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:172:1: entryRulePlusOrMinus : rulePlusOrMinus EOF ;
    public final void entryRulePlusOrMinus() throws RecognitionException {
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:173:1: ( rulePlusOrMinus EOF )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:174:1: rulePlusOrMinus EOF
            {
             before(grammarAccess.getPlusOrMinusRule()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_entryRulePlusOrMinus301);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusOrMinus308); 

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
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:181:1: rulePlusOrMinus : ( ( rule__PlusOrMinus__Group__0 ) ) ;
    public final void rulePlusOrMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:185:2: ( ( ( rule__PlusOrMinus__Group__0 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:186:1: ( ( rule__PlusOrMinus__Group__0 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:186:1: ( ( rule__PlusOrMinus__Group__0 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:187:1: ( rule__PlusOrMinus__Group__0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:188:1: ( rule__PlusOrMinus__Group__0 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:188:2: rule__PlusOrMinus__Group__0
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group__0_in_rulePlusOrMinus334);
            rule__PlusOrMinus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getGroup()); 

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
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:200:1: entryRuleMulOrDiv : ruleMulOrDiv EOF ;
    public final void entryRuleMulOrDiv() throws RecognitionException {
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:201:1: ( ruleMulOrDiv EOF )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:202:1: ruleMulOrDiv EOF
            {
             before(grammarAccess.getMulOrDivRule()); 
            pushFollow(FOLLOW_ruleMulOrDiv_in_entryRuleMulOrDiv361);
            ruleMulOrDiv();

            state._fsp--;

             after(grammarAccess.getMulOrDivRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMulOrDiv368); 

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
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:209:1: ruleMulOrDiv : ( ( rule__MulOrDiv__Group__0 ) ) ;
    public final void ruleMulOrDiv() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:213:2: ( ( ( rule__MulOrDiv__Group__0 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:214:1: ( ( rule__MulOrDiv__Group__0 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:214:1: ( ( rule__MulOrDiv__Group__0 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:215:1: ( rule__MulOrDiv__Group__0 )
            {
             before(grammarAccess.getMulOrDivAccess().getGroup()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:216:1: ( rule__MulOrDiv__Group__0 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:216:2: rule__MulOrDiv__Group__0
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group__0_in_ruleMulOrDiv394);
            rule__MulOrDiv__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getGroup()); 

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
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRuleAtomic"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:228:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:229:1: ( ruleAtomic EOF )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:230:1: ruleAtomic EOF
            {
             before(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic421);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getAtomicRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic428); 

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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:237:1: ruleAtomic : ( ( rule__Atomic__Alternatives ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:241:2: ( ( ( rule__Atomic__Alternatives ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:242:1: ( ( rule__Atomic__Alternatives ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:242:1: ( ( rule__Atomic__Alternatives ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:243:1: ( rule__Atomic__Alternatives )
            {
             before(grammarAccess.getAtomicAccess().getAlternatives()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:244:1: ( rule__Atomic__Alternatives )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:244:2: rule__Atomic__Alternatives
            {
            pushFollow(FOLLOW_rule__Atomic__Alternatives_in_ruleAtomic454);
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:256:1: rule__AbstractElement__Alternatives : ( ( ruleVariable ) | ( ruleExpression ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:260:1: ( ( ruleVariable ) | ( ruleExpression ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||(LA2_1>=RULE_ID && LA2_1<=RULE_STRING)||(LA2_1>=11 && LA2_1<=14)||(LA2_1>=16 && LA2_1<=18)) ) {
                    alt2=2;
                }
                else if ( (LA2_1==15) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA2_0>=RULE_INT && LA2_0<=RULE_STRING)||(LA2_0>=13 && LA2_0<=14)||LA2_0==18) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:261:1: ( ruleVariable )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:261:1: ( ruleVariable )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:262:1: ruleVariable
                    {
                     before(grammarAccess.getAbstractElementAccess().getVariableParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleVariable_in_rule__AbstractElement__Alternatives490);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getVariableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:267:6: ( ruleExpression )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:267:6: ( ruleExpression )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:268:1: ruleExpression
                    {
                     before(grammarAccess.getAbstractElementAccess().getExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleExpression_in_rule__AbstractElement__Alternatives507);
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


    // $ANTLR start "rule__PlusOrMinus__Alternatives_1_0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:278:1: rule__PlusOrMinus__Alternatives_1_0 : ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) );
    public final void rule__PlusOrMinus__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:282:1: ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:283:1: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:283:1: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:284:1: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:285:1: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:285:2: rule__PlusOrMinus__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_0__0_in_rule__PlusOrMinus__Alternatives_1_0539);
                    rule__PlusOrMinus__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:289:6: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:289:6: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:290:1: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:291:1: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:291:2: rule__PlusOrMinus__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_1__0_in_rule__PlusOrMinus__Alternatives_1_0557);
                    rule__PlusOrMinus__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 

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
    // $ANTLR end "rule__PlusOrMinus__Alternatives_1_0"


    // $ANTLR start "rule__MulOrDiv__OpAlternatives_1_0_1_0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:300:1: rule__MulOrDiv__OpAlternatives_1_0_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__MulOrDiv__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:304:1: ( ( '*' ) | ( '/' ) )
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
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:305:1: ( '*' )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:305:1: ( '*' )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:306:1: '*'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_0_1_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__MulOrDiv__OpAlternatives_1_0_1_0591); 
                     after(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:313:6: ( '/' )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:313:6: ( '/' )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:314:1: '/'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_0_1_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__MulOrDiv__OpAlternatives_1_0_1_0611); 
                     after(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_0_1_0_1()); 

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
    // $ANTLR end "rule__MulOrDiv__OpAlternatives_1_0_1_0"


    // $ANTLR start "rule__Atomic__Alternatives"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:326:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ( rule__Atomic__Group_4__0 ) ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:330:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ( rule__Atomic__Group_4__0 ) ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt5=1;
                }
                break;
            case RULE_INT:
                {
                alt5=2;
                }
                break;
            case RULE_STRING:
                {
                alt5=3;
                }
                break;
            case 13:
            case 14:
                {
                alt5=4;
                }
                break;
            case RULE_ID:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:331:1: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:331:1: ( ( rule__Atomic__Group_0__0 ) )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:332:1: ( rule__Atomic__Group_0__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:333:1: ( rule__Atomic__Group_0__0 )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:333:2: rule__Atomic__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_0__0_in_rule__Atomic__Alternatives645);
                    rule__Atomic__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:337:6: ( ( rule__Atomic__Group_1__0 ) )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:337:6: ( ( rule__Atomic__Group_1__0 ) )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:338:1: ( rule__Atomic__Group_1__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_1()); 
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:339:1: ( rule__Atomic__Group_1__0 )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:339:2: rule__Atomic__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_1__0_in_rule__Atomic__Alternatives663);
                    rule__Atomic__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:343:6: ( ( rule__Atomic__Group_2__0 ) )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:343:6: ( ( rule__Atomic__Group_2__0 ) )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:344:1: ( rule__Atomic__Group_2__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_2()); 
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:345:1: ( rule__Atomic__Group_2__0 )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:345:2: rule__Atomic__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_2__0_in_rule__Atomic__Alternatives681);
                    rule__Atomic__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:349:6: ( ( rule__Atomic__Group_3__0 ) )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:349:6: ( ( rule__Atomic__Group_3__0 ) )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:350:1: ( rule__Atomic__Group_3__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_3()); 
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:351:1: ( rule__Atomic__Group_3__0 )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:351:2: rule__Atomic__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_3__0_in_rule__Atomic__Alternatives699);
                    rule__Atomic__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:355:6: ( ( rule__Atomic__Group_4__0 ) )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:355:6: ( ( rule__Atomic__Group_4__0 ) )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:356:1: ( rule__Atomic__Group_4__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_4()); 
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:357:1: ( rule__Atomic__Group_4__0 )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:357:2: rule__Atomic__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_4__0_in_rule__Atomic__Alternatives717);
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:366:1: rule__Atomic__ValueAlternatives_3_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Atomic__ValueAlternatives_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:370:1: ( ( 'true' ) | ( 'false' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:371:1: ( 'true' )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:371:1: ( 'true' )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:372:1: 'true'
                    {
                     before(grammarAccess.getAtomicAccess().getValueTrueKeyword_3_1_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__Atomic__ValueAlternatives_3_1_0751); 
                     after(grammarAccess.getAtomicAccess().getValueTrueKeyword_3_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:379:6: ( 'false' )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:379:6: ( 'false' )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:380:1: 'false'
                    {
                     before(grammarAccess.getAtomicAccess().getValueFalseKeyword_3_1_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__Atomic__ValueAlternatives_3_1_0771); 
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:394:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:398:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:399:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__0803);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__0806);
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:406:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__NameAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:410:1: ( ( ( rule__Variable__NameAssignment_0 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:411:1: ( ( rule__Variable__NameAssignment_0 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:411:1: ( ( rule__Variable__NameAssignment_0 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:412:1: ( rule__Variable__NameAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:413:1: ( rule__Variable__NameAssignment_0 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:413:2: rule__Variable__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Variable__NameAssignment_0_in_rule__Variable__Group__0__Impl833);
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:423:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:427:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:428:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__1863);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable__Group__2_in_rule__Variable__Group__1866);
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:435:1: rule__Variable__Group__1__Impl : ( '=' ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:439:1: ( ( '=' ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:440:1: ( '=' )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:440:1: ( '=' )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:441:1: '='
            {
             before(grammarAccess.getVariableAccess().getEqualsSignKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__Variable__Group__1__Impl894); 
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:454:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:458:1: ( rule__Variable__Group__2__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:459:2: rule__Variable__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Variable__Group__2__Impl_in_rule__Variable__Group__2925);
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:465:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__ExpressionAssignment_2 ) ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:469:1: ( ( ( rule__Variable__ExpressionAssignment_2 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:470:1: ( ( rule__Variable__ExpressionAssignment_2 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:470:1: ( ( rule__Variable__ExpressionAssignment_2 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:471:1: ( rule__Variable__ExpressionAssignment_2 )
            {
             before(grammarAccess.getVariableAccess().getExpressionAssignment_2()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:472:1: ( rule__Variable__ExpressionAssignment_2 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:472:2: rule__Variable__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__Variable__ExpressionAssignment_2_in_rule__Variable__Group__2__Impl952);
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


    // $ANTLR start "rule__PlusOrMinus__Group__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:488:1: rule__PlusOrMinus__Group__0 : rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 ;
    public final void rule__PlusOrMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:492:1: ( rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:493:2: rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group__0__Impl_in_rule__PlusOrMinus__Group__0988);
            rule__PlusOrMinus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlusOrMinus__Group__1_in_rule__PlusOrMinus__Group__0991);
            rule__PlusOrMinus__Group__1();

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
    // $ANTLR end "rule__PlusOrMinus__Group__0"


    // $ANTLR start "rule__PlusOrMinus__Group__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:500:1: rule__PlusOrMinus__Group__0__Impl : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:504:1: ( ( ruleMulOrDiv ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:505:1: ( ruleMulOrDiv )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:505:1: ( ruleMulOrDiv )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:506:1: ruleMulOrDiv
            {
             before(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__Group__0__Impl1018);
            ruleMulOrDiv();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 

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
    // $ANTLR end "rule__PlusOrMinus__Group__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:517:1: rule__PlusOrMinus__Group__1 : rule__PlusOrMinus__Group__1__Impl ;
    public final void rule__PlusOrMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:521:1: ( rule__PlusOrMinus__Group__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:522:2: rule__PlusOrMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group__1__Impl_in_rule__PlusOrMinus__Group__11047);
            rule__PlusOrMinus__Group__1__Impl();

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
    // $ANTLR end "rule__PlusOrMinus__Group__1"


    // $ANTLR start "rule__PlusOrMinus__Group__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:528:1: rule__PlusOrMinus__Group__1__Impl : ( ( rule__PlusOrMinus__Group_1__0 )* ) ;
    public final void rule__PlusOrMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:532:1: ( ( ( rule__PlusOrMinus__Group_1__0 )* ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:533:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:533:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:534:1: ( rule__PlusOrMinus__Group_1__0 )*
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:535:1: ( rule__PlusOrMinus__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=16 && LA7_0<=17)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:535:2: rule__PlusOrMinus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__0_in_rule__PlusOrMinus__Group__1__Impl1074);
            	    rule__PlusOrMinus__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 

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
    // $ANTLR end "rule__PlusOrMinus__Group__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:549:1: rule__PlusOrMinus__Group_1__0 : rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 ;
    public final void rule__PlusOrMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:553:1: ( rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:554:2: rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__0__Impl_in_rule__PlusOrMinus__Group_1__01109);
            rule__PlusOrMinus__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__1_in_rule__PlusOrMinus__Group_1__01112);
            rule__PlusOrMinus__Group_1__1();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:561:1: rule__PlusOrMinus__Group_1__0__Impl : ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) ;
    public final void rule__PlusOrMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:565:1: ( ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:566:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:566:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:567:1: ( rule__PlusOrMinus__Alternatives_1_0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:568:1: ( rule__PlusOrMinus__Alternatives_1_0 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:568:2: rule__PlusOrMinus__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Alternatives_1_0_in_rule__PlusOrMinus__Group_1__0__Impl1139);
            rule__PlusOrMinus__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 

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
    // $ANTLR end "rule__PlusOrMinus__Group_1__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:578:1: rule__PlusOrMinus__Group_1__1 : rule__PlusOrMinus__Group_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:582:1: ( rule__PlusOrMinus__Group_1__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:583:2: rule__PlusOrMinus__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__1__Impl_in_rule__PlusOrMinus__Group_1__11169);
            rule__PlusOrMinus__Group_1__1__Impl();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:589:1: rule__PlusOrMinus__Group_1__1__Impl : ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:593:1: ( ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:594:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:594:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:595:1: ( rule__PlusOrMinus__RightAssignment_1_1 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:596:1: ( rule__PlusOrMinus__RightAssignment_1_1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:596:2: rule__PlusOrMinus__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__RightAssignment_1_1_in_rule__PlusOrMinus__Group_1__1__Impl1196);
            rule__PlusOrMinus__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 

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
    // $ANTLR end "rule__PlusOrMinus__Group_1__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:610:1: rule__PlusOrMinus__Group_1_0_0__0 : rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 ;
    public final void rule__PlusOrMinus__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:614:1: ( rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:615:2: rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_0__0__Impl_in_rule__PlusOrMinus__Group_1_0_0__01230);
            rule__PlusOrMinus__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_0__1_in_rule__PlusOrMinus__Group_1_0_0__01233);
            rule__PlusOrMinus__Group_1_0_0__1();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:622:1: rule__PlusOrMinus__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:626:1: ( ( () ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:627:1: ( () )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:627:1: ( () )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:628:1: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:629:1: ()
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:631:1: 
            {
            }

             after(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:641:1: rule__PlusOrMinus__Group_1_0_0__1 : rule__PlusOrMinus__Group_1_0_0__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:645:1: ( rule__PlusOrMinus__Group_1_0_0__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:646:2: rule__PlusOrMinus__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_0__1__Impl_in_rule__PlusOrMinus__Group_1_0_0__11291);
            rule__PlusOrMinus__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:652:1: rule__PlusOrMinus__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:656:1: ( ( '+' ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:657:1: ( '+' )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:657:1: ( '+' )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:658:1: '+'
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,16,FOLLOW_16_in_rule__PlusOrMinus__Group_1_0_0__1__Impl1319); 
             after(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:675:1: rule__PlusOrMinus__Group_1_0_1__0 : rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 ;
    public final void rule__PlusOrMinus__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:679:1: ( rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:680:2: rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_1__0__Impl_in_rule__PlusOrMinus__Group_1_0_1__01354);
            rule__PlusOrMinus__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_1__1_in_rule__PlusOrMinus__Group_1_0_1__01357);
            rule__PlusOrMinus__Group_1_0_1__1();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:687:1: rule__PlusOrMinus__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:691:1: ( ( () ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:692:1: ( () )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:692:1: ( () )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:693:1: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:694:1: ()
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:696:1: 
            {
            }

             after(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:706:1: rule__PlusOrMinus__Group_1_0_1__1 : rule__PlusOrMinus__Group_1_0_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:710:1: ( rule__PlusOrMinus__Group_1_0_1__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:711:2: rule__PlusOrMinus__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_1__1__Impl_in_rule__PlusOrMinus__Group_1_0_1__11415);
            rule__PlusOrMinus__Group_1_0_1__1__Impl();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:717:1: rule__PlusOrMinus__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:721:1: ( ( '-' ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:722:1: ( '-' )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:722:1: ( '-' )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:723:1: '-'
            {
             before(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,17,FOLLOW_17_in_rule__PlusOrMinus__Group_1_0_1__1__Impl1443); 
             after(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:740:1: rule__MulOrDiv__Group__0 : rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 ;
    public final void rule__MulOrDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:744:1: ( rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:745:2: rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group__0__Impl_in_rule__MulOrDiv__Group__01478);
            rule__MulOrDiv__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MulOrDiv__Group__1_in_rule__MulOrDiv__Group__01481);
            rule__MulOrDiv__Group__1();

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
    // $ANTLR end "rule__MulOrDiv__Group__0"


    // $ANTLR start "rule__MulOrDiv__Group__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:752:1: rule__MulOrDiv__Group__0__Impl : ( ruleAtomic ) ;
    public final void rule__MulOrDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:756:1: ( ( ruleAtomic ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:757:1: ( ruleAtomic )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:757:1: ( ruleAtomic )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:758:1: ruleAtomic
            {
             before(grammarAccess.getMulOrDivAccess().getAtomicParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAtomic_in_rule__MulOrDiv__Group__0__Impl1508);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getMulOrDivAccess().getAtomicParserRuleCall_0()); 

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
    // $ANTLR end "rule__MulOrDiv__Group__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:769:1: rule__MulOrDiv__Group__1 : rule__MulOrDiv__Group__1__Impl ;
    public final void rule__MulOrDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:773:1: ( rule__MulOrDiv__Group__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:774:2: rule__MulOrDiv__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group__1__Impl_in_rule__MulOrDiv__Group__11537);
            rule__MulOrDiv__Group__1__Impl();

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
    // $ANTLR end "rule__MulOrDiv__Group__1"


    // $ANTLR start "rule__MulOrDiv__Group__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:780:1: rule__MulOrDiv__Group__1__Impl : ( ( rule__MulOrDiv__Group_1__0 )* ) ;
    public final void rule__MulOrDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:784:1: ( ( ( rule__MulOrDiv__Group_1__0 )* ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:785:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:785:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:786:1: ( rule__MulOrDiv__Group_1__0 )*
            {
             before(grammarAccess.getMulOrDivAccess().getGroup_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:787:1: ( rule__MulOrDiv__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=11 && LA8_0<=12)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:787:2: rule__MulOrDiv__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MulOrDiv__Group_1__0_in_rule__MulOrDiv__Group__1__Impl1564);
            	    rule__MulOrDiv__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getMulOrDivAccess().getGroup_1()); 

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
    // $ANTLR end "rule__MulOrDiv__Group__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:801:1: rule__MulOrDiv__Group_1__0 : rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 ;
    public final void rule__MulOrDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:805:1: ( rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:806:2: rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__0__Impl_in_rule__MulOrDiv__Group_1__01599);
            rule__MulOrDiv__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__1_in_rule__MulOrDiv__Group_1__01602);
            rule__MulOrDiv__Group_1__1();

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
    // $ANTLR end "rule__MulOrDiv__Group_1__0"


    // $ANTLR start "rule__MulOrDiv__Group_1__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:813:1: rule__MulOrDiv__Group_1__0__Impl : ( ( rule__MulOrDiv__Group_1_0__0 ) ) ;
    public final void rule__MulOrDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:817:1: ( ( ( rule__MulOrDiv__Group_1_0__0 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:818:1: ( ( rule__MulOrDiv__Group_1_0__0 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:818:1: ( ( rule__MulOrDiv__Group_1_0__0 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:819:1: ( rule__MulOrDiv__Group_1_0__0 )
            {
             before(grammarAccess.getMulOrDivAccess().getGroup_1_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:820:1: ( rule__MulOrDiv__Group_1_0__0 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:820:2: rule__MulOrDiv__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group_1_0__0_in_rule__MulOrDiv__Group_1__0__Impl1629);
            rule__MulOrDiv__Group_1_0__0();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getGroup_1_0()); 

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
    // $ANTLR end "rule__MulOrDiv__Group_1__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:830:1: rule__MulOrDiv__Group_1__1 : rule__MulOrDiv__Group_1__1__Impl ;
    public final void rule__MulOrDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:834:1: ( rule__MulOrDiv__Group_1__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:835:2: rule__MulOrDiv__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__1__Impl_in_rule__MulOrDiv__Group_1__11659);
            rule__MulOrDiv__Group_1__1__Impl();

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
    // $ANTLR end "rule__MulOrDiv__Group_1__1"


    // $ANTLR start "rule__MulOrDiv__Group_1__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:841:1: rule__MulOrDiv__Group_1__1__Impl : ( ( rule__MulOrDiv__RightAssignment_1_1 ) ) ;
    public final void rule__MulOrDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:845:1: ( ( ( rule__MulOrDiv__RightAssignment_1_1 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:846:1: ( ( rule__MulOrDiv__RightAssignment_1_1 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:846:1: ( ( rule__MulOrDiv__RightAssignment_1_1 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:847:1: ( rule__MulOrDiv__RightAssignment_1_1 )
            {
             before(grammarAccess.getMulOrDivAccess().getRightAssignment_1_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:848:1: ( rule__MulOrDiv__RightAssignment_1_1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:848:2: rule__MulOrDiv__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MulOrDiv__RightAssignment_1_1_in_rule__MulOrDiv__Group_1__1__Impl1686);
            rule__MulOrDiv__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getRightAssignment_1_1()); 

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
    // $ANTLR end "rule__MulOrDiv__Group_1__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1_0__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:862:1: rule__MulOrDiv__Group_1_0__0 : rule__MulOrDiv__Group_1_0__0__Impl rule__MulOrDiv__Group_1_0__1 ;
    public final void rule__MulOrDiv__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:866:1: ( rule__MulOrDiv__Group_1_0__0__Impl rule__MulOrDiv__Group_1_0__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:867:2: rule__MulOrDiv__Group_1_0__0__Impl rule__MulOrDiv__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group_1_0__0__Impl_in_rule__MulOrDiv__Group_1_0__01720);
            rule__MulOrDiv__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MulOrDiv__Group_1_0__1_in_rule__MulOrDiv__Group_1_0__01723);
            rule__MulOrDiv__Group_1_0__1();

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
    // $ANTLR end "rule__MulOrDiv__Group_1_0__0"


    // $ANTLR start "rule__MulOrDiv__Group_1_0__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:874:1: rule__MulOrDiv__Group_1_0__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:878:1: ( ( () ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:879:1: ( () )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:879:1: ( () )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:880:1: ()
            {
             before(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:881:1: ()
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:883:1: 
            {
            }

             after(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1_0__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1_0__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:893:1: rule__MulOrDiv__Group_1_0__1 : rule__MulOrDiv__Group_1_0__1__Impl ;
    public final void rule__MulOrDiv__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:897:1: ( rule__MulOrDiv__Group_1_0__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:898:2: rule__MulOrDiv__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group_1_0__1__Impl_in_rule__MulOrDiv__Group_1_0__11781);
            rule__MulOrDiv__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__MulOrDiv__Group_1_0__1"


    // $ANTLR start "rule__MulOrDiv__Group_1_0__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:904:1: rule__MulOrDiv__Group_1_0__1__Impl : ( ( rule__MulOrDiv__OpAssignment_1_0_1 ) ) ;
    public final void rule__MulOrDiv__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:908:1: ( ( ( rule__MulOrDiv__OpAssignment_1_0_1 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:909:1: ( ( rule__MulOrDiv__OpAssignment_1_0_1 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:909:1: ( ( rule__MulOrDiv__OpAssignment_1_0_1 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:910:1: ( rule__MulOrDiv__OpAssignment_1_0_1 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAssignment_1_0_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:911:1: ( rule__MulOrDiv__OpAssignment_1_0_1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:911:2: rule__MulOrDiv__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__MulOrDiv__OpAssignment_1_0_1_in_rule__MulOrDiv__Group_1_0__1__Impl1808);
            rule__MulOrDiv__OpAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getOpAssignment_1_0_1()); 

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
    // $ANTLR end "rule__MulOrDiv__Group_1_0__1__Impl"


    // $ANTLR start "rule__Atomic__Group_0__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:925:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:929:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:930:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0__0__Impl_in_rule__Atomic__Group_0__01842);
            rule__Atomic__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_0__1_in_rule__Atomic__Group_0__01845);
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:937:1: rule__Atomic__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:941:1: ( ( '(' ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:942:1: ( '(' )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:942:1: ( '(' )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:943:1: '('
            {
             before(grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,18,FOLLOW_18_in_rule__Atomic__Group_0__0__Impl1873); 
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:956:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl rule__Atomic__Group_0__2 ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:960:1: ( rule__Atomic__Group_0__1__Impl rule__Atomic__Group_0__2 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:961:2: rule__Atomic__Group_0__1__Impl rule__Atomic__Group_0__2
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0__1__Impl_in_rule__Atomic__Group_0__11904);
            rule__Atomic__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_0__2_in_rule__Atomic__Group_0__11907);
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:968:1: rule__Atomic__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:972:1: ( ( ruleExpression ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:973:1: ( ruleExpression )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:973:1: ( ruleExpression )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:974:1: ruleExpression
            {
             before(grammarAccess.getAtomicAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Atomic__Group_0__1__Impl1934);
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:985:1: rule__Atomic__Group_0__2 : rule__Atomic__Group_0__2__Impl ;
    public final void rule__Atomic__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:989:1: ( rule__Atomic__Group_0__2__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:990:2: rule__Atomic__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0__2__Impl_in_rule__Atomic__Group_0__21963);
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:996:1: rule__Atomic__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Atomic__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1000:1: ( ( ')' ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1001:1: ( ')' )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1001:1: ( ')' )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1002:1: ')'
            {
             before(grammarAccess.getAtomicAccess().getRightParenthesisKeyword_0_2()); 
            match(input,19,FOLLOW_19_in_rule__Atomic__Group_0__2__Impl1991); 
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1021:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1025:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1026:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__0__Impl_in_rule__Atomic__Group_1__02028);
            rule__Atomic__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_1__1_in_rule__Atomic__Group_1__02031);
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1033:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1037:1: ( ( () ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1038:1: ( () )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1038:1: ( () )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1039:1: ()
            {
             before(grammarAccess.getAtomicAccess().getIntConstantAction_1_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1040:1: ()
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1042:1: 
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1052:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1056:1: ( rule__Atomic__Group_1__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1057:2: rule__Atomic__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__1__Impl_in_rule__Atomic__Group_1__12089);
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1063:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__ValueAssignment_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1067:1: ( ( ( rule__Atomic__ValueAssignment_1_1 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1068:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1068:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1069:1: ( rule__Atomic__ValueAssignment_1_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1070:1: ( rule__Atomic__ValueAssignment_1_1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1070:2: rule__Atomic__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_1_1_in_rule__Atomic__Group_1__1__Impl2116);
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1084:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1088:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1089:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_2__0__Impl_in_rule__Atomic__Group_2__02150);
            rule__Atomic__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_2__1_in_rule__Atomic__Group_2__02153);
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1096:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1100:1: ( ( () ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1101:1: ( () )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1101:1: ( () )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1102:1: ()
            {
             before(grammarAccess.getAtomicAccess().getStringConstantAction_2_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1103:1: ()
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1105:1: 
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1115:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1119:1: ( rule__Atomic__Group_2__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1120:2: rule__Atomic__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_2__1__Impl_in_rule__Atomic__Group_2__12211);
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1126:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__ValueAssignment_2_1 ) ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1130:1: ( ( ( rule__Atomic__ValueAssignment_2_1 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1131:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1131:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1132:1: ( rule__Atomic__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1133:1: ( rule__Atomic__ValueAssignment_2_1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1133:2: rule__Atomic__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_2_1_in_rule__Atomic__Group_2__1__Impl2238);
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1147:1: rule__Atomic__Group_3__0 : rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 ;
    public final void rule__Atomic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1151:1: ( rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1152:2: rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3__0__Impl_in_rule__Atomic__Group_3__02272);
            rule__Atomic__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_3__1_in_rule__Atomic__Group_3__02275);
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1159:1: rule__Atomic__Group_3__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1163:1: ( ( () ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1164:1: ( () )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1164:1: ( () )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1165:1: ()
            {
             before(grammarAccess.getAtomicAccess().getBoolConstantAction_3_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1166:1: ()
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1168:1: 
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1178:1: rule__Atomic__Group_3__1 : rule__Atomic__Group_3__1__Impl ;
    public final void rule__Atomic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1182:1: ( rule__Atomic__Group_3__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1183:2: rule__Atomic__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3__1__Impl_in_rule__Atomic__Group_3__12333);
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1189:1: rule__Atomic__Group_3__1__Impl : ( ( rule__Atomic__ValueAssignment_3_1 ) ) ;
    public final void rule__Atomic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1193:1: ( ( ( rule__Atomic__ValueAssignment_3_1 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1194:1: ( ( rule__Atomic__ValueAssignment_3_1 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1194:1: ( ( rule__Atomic__ValueAssignment_3_1 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1195:1: ( rule__Atomic__ValueAssignment_3_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_3_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1196:1: ( rule__Atomic__ValueAssignment_3_1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1196:2: rule__Atomic__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_3_1_in_rule__Atomic__Group_3__1__Impl2360);
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1210:1: rule__Atomic__Group_4__0 : rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1 ;
    public final void rule__Atomic__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1214:1: ( rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1215:2: rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_4__0__Impl_in_rule__Atomic__Group_4__02394);
            rule__Atomic__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_4__1_in_rule__Atomic__Group_4__02397);
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1222:1: rule__Atomic__Group_4__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1226:1: ( ( () ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1227:1: ( () )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1227:1: ( () )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1228:1: ()
            {
             before(grammarAccess.getAtomicAccess().getVariableRefAction_4_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1229:1: ()
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1231:1: 
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1241:1: rule__Atomic__Group_4__1 : rule__Atomic__Group_4__1__Impl ;
    public final void rule__Atomic__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1245:1: ( rule__Atomic__Group_4__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1246:2: rule__Atomic__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_4__1__Impl_in_rule__Atomic__Group_4__12455);
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1252:1: rule__Atomic__Group_4__1__Impl : ( ( rule__Atomic__VariableAssignment_4_1 ) ) ;
    public final void rule__Atomic__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1256:1: ( ( ( rule__Atomic__VariableAssignment_4_1 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1257:1: ( ( rule__Atomic__VariableAssignment_4_1 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1257:1: ( ( rule__Atomic__VariableAssignment_4_1 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1258:1: ( rule__Atomic__VariableAssignment_4_1 )
            {
             before(grammarAccess.getAtomicAccess().getVariableAssignment_4_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1259:1: ( rule__Atomic__VariableAssignment_4_1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1259:2: rule__Atomic__VariableAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Atomic__VariableAssignment_4_1_in_rule__Atomic__Group_4__1__Impl2482);
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1274:1: rule__ExpressionModel__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__ExpressionModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1278:1: ( ( ruleAbstractElement ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1279:1: ( ruleAbstractElement )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1279:1: ( ruleAbstractElement )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1280:1: ruleAbstractElement
            {
             before(grammarAccess.getExpressionModelAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__ExpressionModel__ElementsAssignment2521);
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1289:1: rule__Variable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1293:1: ( ( RULE_ID ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1294:1: ( RULE_ID )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1294:1: ( RULE_ID )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1295:1: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_02552); 
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1304:1: rule__Variable__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__Variable__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1308:1: ( ( ruleExpression ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1309:1: ( ruleExpression )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1309:1: ( ruleExpression )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1310:1: ruleExpression
            {
             before(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Variable__ExpressionAssignment_22583);
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


    // $ANTLR start "rule__PlusOrMinus__RightAssignment_1_1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1319:1: rule__PlusOrMinus__RightAssignment_1_1 : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1323:1: ( ( ruleMulOrDiv ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1324:1: ( ruleMulOrDiv )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1324:1: ( ruleMulOrDiv )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1325:1: ruleMulOrDiv
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__RightAssignment_1_12614);
            ruleMulOrDiv();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__PlusOrMinus__RightAssignment_1_1"


    // $ANTLR start "rule__MulOrDiv__OpAssignment_1_0_1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1334:1: rule__MulOrDiv__OpAssignment_1_0_1 : ( ( rule__MulOrDiv__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__MulOrDiv__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1338:1: ( ( ( rule__MulOrDiv__OpAlternatives_1_0_1_0 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1339:1: ( ( rule__MulOrDiv__OpAlternatives_1_0_1_0 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1339:1: ( ( rule__MulOrDiv__OpAlternatives_1_0_1_0 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1340:1: ( rule__MulOrDiv__OpAlternatives_1_0_1_0 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_0_1_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1341:1: ( rule__MulOrDiv__OpAlternatives_1_0_1_0 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1341:2: rule__MulOrDiv__OpAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_rule__MulOrDiv__OpAlternatives_1_0_1_0_in_rule__MulOrDiv__OpAssignment_1_0_12645);
            rule__MulOrDiv__OpAlternatives_1_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_0_1_0()); 

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
    // $ANTLR end "rule__MulOrDiv__OpAssignment_1_0_1"


    // $ANTLR start "rule__MulOrDiv__RightAssignment_1_1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1350:1: rule__MulOrDiv__RightAssignment_1_1 : ( ruleAtomic ) ;
    public final void rule__MulOrDiv__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1354:1: ( ( ruleAtomic ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1355:1: ( ruleAtomic )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1355:1: ( ruleAtomic )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1356:1: ruleAtomic
            {
             before(grammarAccess.getMulOrDivAccess().getRightAtomicParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAtomic_in_rule__MulOrDiv__RightAssignment_1_12678);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getMulOrDivAccess().getRightAtomicParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__MulOrDiv__RightAssignment_1_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_1_1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1365:1: rule__Atomic__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Atomic__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1369:1: ( ( RULE_INT ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1370:1: ( RULE_INT )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1370:1: ( RULE_INT )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1371:1: RULE_INT
            {
             before(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Atomic__ValueAssignment_1_12709); 
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1380:1: rule__Atomic__ValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Atomic__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1384:1: ( ( RULE_STRING ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1385:1: ( RULE_STRING )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1385:1: ( RULE_STRING )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1386:1: RULE_STRING
            {
             before(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Atomic__ValueAssignment_2_12740); 
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1395:1: rule__Atomic__ValueAssignment_3_1 : ( ( rule__Atomic__ValueAlternatives_3_1_0 ) ) ;
    public final void rule__Atomic__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1399:1: ( ( ( rule__Atomic__ValueAlternatives_3_1_0 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1400:1: ( ( rule__Atomic__ValueAlternatives_3_1_0 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1400:1: ( ( rule__Atomic__ValueAlternatives_3_1_0 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1401:1: ( rule__Atomic__ValueAlternatives_3_1_0 )
            {
             before(grammarAccess.getAtomicAccess().getValueAlternatives_3_1_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1402:1: ( rule__Atomic__ValueAlternatives_3_1_0 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1402:2: rule__Atomic__ValueAlternatives_3_1_0
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAlternatives_3_1_0_in_rule__Atomic__ValueAssignment_3_12771);
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
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1411:1: rule__Atomic__VariableAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Atomic__VariableAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1415:1: ( ( ( RULE_ID ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1416:1: ( ( RULE_ID ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1416:1: ( ( RULE_ID ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1417:1: ( RULE_ID )
            {
             before(grammarAccess.getAtomicAccess().getVariableVariableCrossReference_4_1_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1418:1: ( RULE_ID )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1419:1: RULE_ID
            {
             before(grammarAccess.getAtomicAccess().getVariableVariableIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Atomic__VariableAssignment_4_12808); 
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
    public static final BitSet FOLLOW_rule__ExpressionModel__ElementsAssignment_in_ruleExpressionModel94 = new BitSet(new long[]{0x0000000000046072L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractElement__Alternatives_in_ruleAbstractElement155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__0_in_ruleVariable215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_ruleExpression275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_entryRulePlusOrMinus301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusOrMinus308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group__0_in_rulePlusOrMinus334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_entryRuleMulOrDiv361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMulOrDiv368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group__0_in_ruleMulOrDiv394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Alternatives_in_ruleAtomic454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__AbstractElement__Alternatives490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__AbstractElement__Alternatives507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_0__0_in_rule__PlusOrMinus__Alternatives_1_0539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_1__0_in_rule__PlusOrMinus__Alternatives_1_0557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__MulOrDiv__OpAlternatives_1_0_1_0591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__MulOrDiv__OpAlternatives_1_0_1_0611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__0_in_rule__Atomic__Alternatives645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__0_in_rule__Atomic__Alternatives663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__0_in_rule__Atomic__Alternatives681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__0_in_rule__Atomic__Alternatives699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_4__0_in_rule__Atomic__Alternatives717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Atomic__ValueAlternatives_3_1_0751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Atomic__ValueAlternatives_3_1_0771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__0803 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__0806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__NameAssignment_0_in_rule__Variable__Group__0__Impl833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__1863 = new BitSet(new long[]{0x0000000000046070L});
    public static final BitSet FOLLOW_rule__Variable__Group__2_in_rule__Variable__Group__1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Variable__Group__1__Impl894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__2__Impl_in_rule__Variable__Group__2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__ExpressionAssignment_2_in_rule__Variable__Group__2__Impl952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group__0__Impl_in_rule__PlusOrMinus__Group__0988 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group__1_in_rule__PlusOrMinus__Group__0991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__Group__0__Impl1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group__1__Impl_in_rule__PlusOrMinus__Group__11047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__0_in_rule__PlusOrMinus__Group__1__Impl1074 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__0__Impl_in_rule__PlusOrMinus__Group_1__01109 = new BitSet(new long[]{0x0000000000046070L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__1_in_rule__PlusOrMinus__Group_1__01112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Alternatives_1_0_in_rule__PlusOrMinus__Group_1__0__Impl1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__1__Impl_in_rule__PlusOrMinus__Group_1__11169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__RightAssignment_1_1_in_rule__PlusOrMinus__Group_1__1__Impl1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_0__0__Impl_in_rule__PlusOrMinus__Group_1_0_0__01230 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_0__1_in_rule__PlusOrMinus__Group_1_0_0__01233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_0__1__Impl_in_rule__PlusOrMinus__Group_1_0_0__11291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PlusOrMinus__Group_1_0_0__1__Impl1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_1__0__Impl_in_rule__PlusOrMinus__Group_1_0_1__01354 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_1__1_in_rule__PlusOrMinus__Group_1_0_1__01357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_1__1__Impl_in_rule__PlusOrMinus__Group_1_0_1__11415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PlusOrMinus__Group_1_0_1__1__Impl1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group__0__Impl_in_rule__MulOrDiv__Group__01478 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group__1_in_rule__MulOrDiv__Group__01481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rule__MulOrDiv__Group__0__Impl1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group__1__Impl_in_rule__MulOrDiv__Group__11537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__0_in_rule__MulOrDiv__Group__1__Impl1564 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__0__Impl_in_rule__MulOrDiv__Group_1__01599 = new BitSet(new long[]{0x0000000000046070L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__1_in_rule__MulOrDiv__Group_1__01602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1_0__0_in_rule__MulOrDiv__Group_1__0__Impl1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__1__Impl_in_rule__MulOrDiv__Group_1__11659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__RightAssignment_1_1_in_rule__MulOrDiv__Group_1__1__Impl1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1_0__0__Impl_in_rule__MulOrDiv__Group_1_0__01720 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1_0__1_in_rule__MulOrDiv__Group_1_0__01723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1_0__1__Impl_in_rule__MulOrDiv__Group_1_0__11781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__OpAssignment_1_0_1_in_rule__MulOrDiv__Group_1_0__1__Impl1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__0__Impl_in_rule__Atomic__Group_0__01842 = new BitSet(new long[]{0x0000000000046070L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__1_in_rule__Atomic__Group_0__01845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Atomic__Group_0__0__Impl1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__1__Impl_in_rule__Atomic__Group_0__11904 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__2_in_rule__Atomic__Group_0__11907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Atomic__Group_0__1__Impl1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__2__Impl_in_rule__Atomic__Group_0__21963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Atomic__Group_0__2__Impl1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__0__Impl_in_rule__Atomic__Group_1__02028 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__1_in_rule__Atomic__Group_1__02031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__1__Impl_in_rule__Atomic__Group_1__12089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_1_1_in_rule__Atomic__Group_1__1__Impl2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__0__Impl_in_rule__Atomic__Group_2__02150 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__1_in_rule__Atomic__Group_2__02153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__1__Impl_in_rule__Atomic__Group_2__12211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_2_1_in_rule__Atomic__Group_2__1__Impl2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__0__Impl_in_rule__Atomic__Group_3__02272 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__1_in_rule__Atomic__Group_3__02275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__1__Impl_in_rule__Atomic__Group_3__12333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_3_1_in_rule__Atomic__Group_3__1__Impl2360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_4__0__Impl_in_rule__Atomic__Group_4__02394 = new BitSet(new long[]{0x0000000000046070L});
    public static final BitSet FOLLOW_rule__Atomic__Group_4__1_in_rule__Atomic__Group_4__02397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_4__1__Impl_in_rule__Atomic__Group_4__12455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__VariableAssignment_4_1_in_rule__Atomic__Group_4__1__Impl2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__ExpressionModel__ElementsAssignment2521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_02552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Variable__ExpressionAssignment_22583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__RightAssignment_1_12614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__OpAlternatives_1_0_1_0_in_rule__MulOrDiv__OpAssignment_1_0_12645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rule__MulOrDiv__RightAssignment_1_12678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Atomic__ValueAssignment_1_12709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Atomic__ValueAssignment_2_12740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAlternatives_3_1_0_in_rule__Atomic__ValueAssignment_3_12771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Atomic__VariableAssignment_4_12808 = new BitSet(new long[]{0x0000000000000002L});

}