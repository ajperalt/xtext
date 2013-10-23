package org.example.smalljava.tests;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.example.smalljava.SmallJavaInjectorProvider;
import org.example.smalljava.smallJava.SJProgram;
import org.example.smalljava.smallJava.SmallJavaPackage;
import org.example.smalljava.validation.SmallJavaValidator;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(SmallJavaInjectorProvider.class)
@SuppressWarnings("all")
public class SmallJavaValidatorTest {
  @Inject
  @Extension
  private ParseHelper<SJProgram> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testClassHierarchyCycle() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class A extends C {}");
      _builder.newLine();
      _builder.append("class C extends B {}");
      _builder.newLine();
      _builder.append("class B extends A {}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      final Procedure1<SJProgram> _function = new Procedure1<SJProgram>() {
          public void apply(final SJProgram it) {
            SmallJavaValidatorTest.this.assertHierarchyCycle(it, "A");
            SmallJavaValidatorTest.this.assertHierarchyCycle(it, "A");
            SmallJavaValidatorTest.this.assertHierarchyCycle(it, "A");
          }
        };
      ObjectExtensions.<SJProgram>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private void assertHierarchyCycle(final SJProgram p, final String expectedClassName) {
    EClass _sJClass = SmallJavaPackage.eINSTANCE.getSJClass();
    String _plus = ("cycle in hierarchy of class \'" + expectedClassName);
    String _plus_1 = (_plus + "\'");
    this._validationTestHelper.assertError(p, _sJClass, 
      SmallJavaValidator.HIERARCHY_CYCLE, _plus_1);
  }
  
  @Test
  public void invocationOnField() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A f;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A m() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return this.f();");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      EClass _sJMemberSelection = SmallJavaPackage.eINSTANCE.getSJMemberSelection();
      this._validationTestHelper.assertError(_parse, _sJMemberSelection, 
        SmallJavaValidator.METHOD_INVOCATION_ON_FIELD, 
        "Method invocation on a field");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void fieldSelectionOnMethod() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A m() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return this.m;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      EClass _sJMemberSelection = SmallJavaPackage.eINSTANCE.getSJMemberSelection();
      this._validationTestHelper.assertError(_parse, _sJMemberSelection, 
        SmallJavaValidator.FIELD_SELECTION_ON_METHOD, 
        "Field selection on a method");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testUnreachableCode() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C m() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return null;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("this.m(); // the error should be placed here");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      EClass _sJMemberSelection = SmallJavaPackage.eINSTANCE.getSJMemberSelection();
      this._validationTestHelper.assertError(_parse, _sJMemberSelection, 
        SmallJavaValidator.UNREACHABLE_CODE, 
        "Unreachable code");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDuplicateMethods() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C m() { return null; }");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C m() { return null; }");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      EClass _sJMethod = SmallJavaPackage.eINSTANCE.getSJMethod();
      this._validationTestHelper.assertError(_parse, _sJMethod, 
        SmallJavaValidator.DUPLICATE_ELEMENT, 
        "Duplicate member \'m\'");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDuplicateFields() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C f;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C f;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      EClass _sJField = SmallJavaPackage.eINSTANCE.getSJField();
      this._validationTestHelper.assertError(_parse, _sJField, 
        SmallJavaValidator.DUPLICATE_ELEMENT, 
        "Duplicate member \'f\'");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testFieldAndMethodWithTheSameNameAreOK() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C f;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C f() { return null; }");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
