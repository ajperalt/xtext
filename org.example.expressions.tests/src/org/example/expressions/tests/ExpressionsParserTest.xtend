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
	

	
}