package org.example.smalljava.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.example.smalljava.SmallJavaInjectorProvider
import org.example.smalljava.smallJava.SJProgram
import org.example.smalljava.typing.SmallJavaTypeConformance
import org.example.smalljava.typing.SmallJavaTypeProvider
import org.junit.Test
import org.junit.runner.RunWith

import static extension org.example.smalljava.util.SmallJavaModelUtil.*
import static extension org.junit.Assert.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SmallJavaInjectorProvider))
class SmallJavaTypeConformanceTest {
	
	@Inject extension ParseHelper<SJProgram>
	@Inject extension SmallJavaTypeConformance
	@Inject extension SmallJavaTypeProvider
	
	@Test def void testClassConformance() {
		'''
		class A {}
		class B extends A {}
		class C {}
		'''.parse.classes => [
			// A subclass of A
			get(0).isConformant(get(0)).assertTrue
			// B subclass of A
			get(1).isConformant(get(0)).assertTrue
			// C not subclass of A
			get(2).isConformant(get(0)).assertFalse
		]
	}
	
	@Test def void testNullConformance() {
		'''
		class C {}
		class D {
			C m() { return null; }
		}
		'''.parse.classes => [
			val typeOfNull = last.methods.head.
				returnsStatment.expression.typeFor
			// null can be assigned to anything
			typeOfNull.isConformant(get(0)).assertTrue
			typeOfNull.isConformant(get(1)).assertTrue
		]
	}
	
}