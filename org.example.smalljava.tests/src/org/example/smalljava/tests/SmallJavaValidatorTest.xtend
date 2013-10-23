package org.example.smalljava.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.example.smalljava.SmallJavaInjectorProvider
import org.example.smalljava.smallJava.SJProgram
import org.example.smalljava.smallJava.SmallJavaPackage
import org.example.smalljava.validation.SmallJavaValidator
import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.core.runtime.preferences.IEclipsePreferences.INodeChangeListener
import org.eclipse.emf.ecore.EClass

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SmallJavaInjectorProvider))
class SmallJavaValidatorTest {
	
	@Inject extension ParseHelper<SJProgram>
	@Inject extension ValidationTestHelper
	
	@Test def void testClassHierarchyCycle() {
		'''
		class A extends C {}
		class C extends B {}
		class B extends A {}
		'''.parse => [
			assertHierarchyCycle("A")
			assertHierarchyCycle("A")
			assertHierarchyCycle("A")
		]
	}
	
	def private assertHierarchyCycle(SJProgram p, String expectedClassName) {
		p.assertError(
			SmallJavaPackage::eINSTANCE.SJClass,
			SmallJavaValidator::HIERARCHY_CYCLE,
			"cycle in hierarchy of class '" + expectedClassName + "'"
		)
	}
	
	@Test def void invocationOnField() {
		'''
			class A {
				A f;
				A m() {
					return this.f();
				}
			}
		'''.parse.assertError(
			SmallJavaPackage::eINSTANCE.SJMemberSelection,
			SmallJavaValidator::METHOD_INVOCATION_ON_FIELD,
			"Method invocation on a field"
		)
	}
	
	@Test def void fieldSelectionOnMethod() {
		'''
		class A {
			A m() {
				return this.m;
			}
		}
		'''.parse.assertError(
			SmallJavaPackage::eINSTANCE.SJMemberSelection,
			SmallJavaValidator::FIELD_SELECTION_ON_METHOD,
			"Field selection on a method"
		)
	}
	
	@Test def void testUnreachableCode(){
		'''
		class C {
			C m() {
				return null;
				this.m(); // the error should be placed here
			}
		}
		'''.parse.assertError(
				SmallJavaPackage::eINSTANCE.SJMemberSelection,
				SmallJavaValidator::UNREACHABLE_CODE,
				"Unreachable code")
	} 
	
	@Test def void testDuplicateMethods() {
		'''
		class C {
			C m() { return null; }
			C m() { return null; }
		}
		'''.parse.assertError(
			SmallJavaPackage::eINSTANCE.SJMethod,
			SmallJavaValidator::DUPLICATE_ELEMENT,
			"Duplicate member 'm'")
	}
	
	@Test def void testDuplicateFields() {
		'''
		class C {
			C f;
			C f;
		}
		'''.parse.assertError(
			SmallJavaPackage::eINSTANCE.SJField,
			SmallJavaValidator::DUPLICATE_ELEMENT,
			"Duplicate member 'f'")
	}
	
	@Test def void testFieldAndMethodWithTheSameNameAreOK() {
		'''
		class C {
			C f;
			C f() { return null; }
		}
		'''.parse.assertNoErrors
	}
	
	def void assertIncompatibleTypes(CharSequence methodBody, EClass c, String expectedType, String actualType) {
		'''
		class F {}
		class R {}
		class P {}
		class P1 {}
		class P2 {}
		class V {}
		class C {
			F f;
			R m(P p) {
				«methodBody»
			}
			R n(P1 p1, P2 p2) { return null; }
		}
		'''.parse.assertError(c,
			SmallJavaValidator::INCOMPATIBLE_TYPES,
			"Incompatible types. Expected '" + expectedType 
			+ "' but was '" + actualType + "'"
		)
	}
	
	@Test def void assertVariableDeclExpIncompatibleTypes() {
		"V v = new P();".
			assertIncompatibleTypes(
				SmallJavaPackage::eINSTANCE.SJNew, "V", "P")
	}
	
	@Test def void assertReturnExpIncomaptibleTypes() {
		"return p;".
			assertIncompatibleTypes(
				SmallJavaPackage::eINSTANCE.SJSymbolRef, "R", "P")
			
	}
	
	@Test def void assertArgExpIncompatibleTypes() {
		"this.n(new F(), new V());" => [
			assertIncompatibleTypes(
				SmallJavaPackage::eINSTANCE.SJNew, "P1", "F")
			assertIncompatibleTypes(
				SmallJavaPackage::eINSTANCE.SJNew, "P2", "V")
		]
	}	
}