package org.example.expressions.tests

import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.example.expressions.ExpressionsInjectorProvider
import org.example.expressions.expressions.ExpressionModel
import com.google.inject.Inject
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.example.expressions.expressions.VariableRef

import static extension org.junit.Assert.*;
import org.example.expressions.expressions.Expression
import org.example.expressions.expressions.Plus
import org.example.expressions.expressions.IntConstant
import org.example.expressions.expressions.BoolConstant
import org.example.expressions.expressions.StringConstant
import org.example.expressions.expressions.Minus
import org.example.expressions.expressions.MulOrDiv

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(ExpressionsInjectorProvider))
class ExpressionsParserTest {
	
	@Inject extension ParseHelper<ExpressionModel>
	@Inject extension ValidationTestHelper
	
	@Test
	def void testSimpleExpression() {
		'''10'''.parse.assertNoErrors
	}
	
	@Test
	def	void testVariableExpression() {
		'''i = 10'''.parse.assertNoErrors
	}
	
	
	@Test
	def void testSimpleString()  {
		'''"simpleString"'''.parse.assertNoErrors		
	}
	
//	@Test
//	def void testSimpleStringWithoutQuotes() {
//		'''simpleString'''.parse.assertError()
//	}
	
	@Test
	def void testVariableString() {
		'''s = "String with variable"'''.parse.assertNoErrors
	}
	
	@Test
	def void testTrueBoolean() {
		'''true'''.parse.assertNoErrors
	}
	
	@Test
	def void testFalseBoolean() {
		'''false'''.parse.assertNoErrors
	}
	
	@Test
	def void testVariableTrueBoolean() {
		'''t = true'''.parse.assertNoErrors
	}
	
	@Test
	def void testVariableFalseBoolean() {
		'''f = false'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleInteger() {
		'''10'''.parse.assertNoErrors
	}
	
	@Test
	def void testVariableInteger() {
		'''a = 19'''.parse.assertNoErrors
	}					

	@Test
	def void testVariableReference() {
		val e =
		'''
		i = 10
		i
		'''.parse
		e.assertNoErrors;
		
		(e.elements.get(1) as VariableRef).variable.
		assertSame(e.elements.get(0))
	}
	
	def stringRepr(Expression e) {
		switch(e) {
			Plus:
			'''(«e.left.stringRepr» + «e.right.stringRepr»)'''
			Minus:
			'''(«e.left.stringRepr» - «e.right.stringRepr»)'''
			MulOrDiv:
			'''(«e.left.stringRepr» «e.op» «e.right.stringRepr»)'''
			IntConstant: '''«e.value»''' 
			StringConstant: '''«e.value»'''
			BoolConstant: '''«e.value»'''
			VariableRef: '''«e.variable.name»'''
		}.toString
		
	}
	
	def assertRepr(CharSequence input, CharSequence expected) {
		input.parse => [
			assertNoErrors;
			expected.assertEquals((elements.last as Expression).stringRepr
			)
		]
	}
	
	@Test 
	def void testPlus() {
		'''10 + 5 + 1 + 2'''.assertRepr("(((10 + 5) + 1) + 2)")
	}
	
	@Test 
	def void testMinus() {
		'''10 - 5 - 1 - 2'''.assertRepr("(((10 - 5) - 1) - 2)")
	}
	
	@Test 
	def void testPlusWithMinus() {
		'''10 - 5 + 1 - 2'''.assertRepr("(((10 - 5) + 1) - 2)")
	}
	
	@Test
	def void testParenthesis() {
		'''(10)'''.parse.elements.get(0) as IntConstant
	}

	@Test
	def void testPlusWithParenthesis() {
		"( 10 + 5 ) + ( 1 + 2 )".assertRepr("((10 + 5) + (1 + 2))")
	}
	
	@Test
	def void testPlusMulPrecedence() {
		"10 + 5 * 2 - 5 / 1".assertRepr("((10 + (5*2)) - (5/1))")
	}
	
}