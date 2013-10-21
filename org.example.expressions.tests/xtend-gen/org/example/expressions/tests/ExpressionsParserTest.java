package org.example.expressions.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.example.expressions.ExpressionsInjectorProvider;
import org.example.expressions.expressions.AbstractElement;
import org.example.expressions.expressions.ExpressionModel;
import org.example.expressions.expressions.Variable;
import org.example.expressions.expressions.VariableRef;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(ExpressionsInjectorProvider.class)
@SuppressWarnings("all")
public class ExpressionsParserTest {
  @Inject
  @Extension
  private ParseHelper<ExpressionModel> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testSimpleExpression() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("10");
      ExpressionModel _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableExpression() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 10");
      ExpressionModel _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleString() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\"simpleString\"");
      ExpressionModel _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableString() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("s = \"String with variable\"");
      ExpressionModel _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testTrueBoolean() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("true");
      ExpressionModel _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testFalseBoolean() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("false");
      ExpressionModel _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableTrueBoolean() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("t = true");
      ExpressionModel _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableFalseBoolean() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("f = false");
      ExpressionModel _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleInteger() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("10");
      ExpressionModel _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableInteger() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a = 19");
      ExpressionModel _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testVariableReference() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i = 10");
      _builder.newLine();
      _builder.append("i");
      _builder.newLine();
      final ExpressionModel e = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(e);
      EList<AbstractElement> _elements = e.getElements();
      AbstractElement _get = _elements.get(1);
      Variable _variable = ((VariableRef) _get).getVariable();
      EList<AbstractElement> _elements_1 = e.getElements();
      AbstractElement _get_1 = _elements_1.get(0);
      Assert.assertSame(_variable, _get_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
