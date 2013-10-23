package org.example.smalljava.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.example.smalljava.SmallJavaInjectorProvider
import org.example.smalljava.smallJava.SJProgram
import org.example.smalljava.typing.SmallJavaTypeProvider
import org.junit.runner.RunWith

import static extension org.example.smalljava.util.SmallJavaModelUtil.*
import static extension org.junit.Assert.*
import org.example.smalljava.smallJava.SJStatement
import org.example.smalljava.smallJava.SJExpression
import org.junit.Test

@RunWith(XtextRunner)
@InjectWith(SmallJavaInjectorProvider)
class SmallJavaTypeProviderTest {
	
	@Inject extension ParseHelper<SJProgram>
	@Inject extension ValidationTestHelper
	@Inject extension SmallJavaTypeProvider
	
	def private assertType(CharSequence testExp,
						   String expectedClassName) {
		
		'''
		class R { public V v; }
		class P extends R { public R m() {return null;} }
		class V extends R { public N n; }
		class N extends R {}
		class F extends R {}
		
		class C extends R {
			F f;
			
			R m(P p) {
				V v = null;
				«testExp»;
				return null;
			}
			
		}
		'''.parse => [
			assertNoErrors
			expectedClassName.assertEquals(
				classes.last.methods.last.
					body.statements.get(1).statementExpressionsType.name
			)
		]
		
	}  
	
	def private statementExpressionsType(SJStatement s) {
		(s as SJExpression).typeFor
	}
	
	@Test def void thisType(){ "this".assertType("C") }
	@Test def void paramRefType() { "p".assertType("P") }
	@Test def void varRefType() { "v".assertType("V") }
	@Test def void newType() { "new N()".assertType("N") }
	@Test def void fieldSelectionType() { "this.f".assertType("F") }
	@Test def void intConstantType() { '10'.assertType("intType") }
	@Test def void nullType() { 'null'.assertType("nullType") }
}