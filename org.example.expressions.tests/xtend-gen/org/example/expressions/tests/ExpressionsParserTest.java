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
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.example.expressions.ExpressionsInjectorProvider;
import org.example.expressions.expressions.AbstractElement;
import org.example.expressions.expressions.BoolConstant;
import org.example.expressions.expressions.Expression;
import org.example.expressions.expressions.ExpressionModel;
import org.example.expressions.expressions.IntConstant;
import org.example.expressions.expressions.Minus;
import org.example.expressions.expressions.MulOrDiv;
import org.example.expressions.expressions.Plus;
import org.example.expressions.expressions.StringConstant;
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
  
  public String stringRepr(final Expression e) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (e instanceof Plus) {
        final Plus _plus = (Plus)e;
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Expression _left = _plus.getLeft();
        Object _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" + ");
        Expression _right = _plus.getRight();
        Object _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof Minus) {
        final Minus _minus = (Minus)e;
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Expression _left = _minus.getLeft();
        Object _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" - ");
        Expression _right = _minus.getRight();
        Object _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof MulOrDiv) {
        final MulOrDiv _mulOrDiv = (MulOrDiv)e;
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Expression _left = _mulOrDiv.getLeft();
        Object _stringRepr = this.stringRepr(_left);
        _builder.append(_stringRepr, "");
        _builder.append(" ");
        String _op = _mulOrDiv.getOp();
        _builder.append(_op, "");
        _builder.append(" ");
        Expression _right = _mulOrDiv.getRight();
        Object _stringRepr_1 = this.stringRepr(_right);
        _builder.append(_stringRepr_1, "");
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof IntConstant) {
        final IntConstant _intConstant = (IntConstant)e;
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        int _value = _intConstant.getValue();
        _builder.append(_value, "");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof StringConstant) {
        final StringConstant _stringConstant = (StringConstant)e;
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _value = _stringConstant.getValue();
        _builder.append(_value, "");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof BoolConstant) {
        final BoolConstant _boolConstant = (BoolConstant)e;
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _value = _boolConstant.getValue();
        _builder.append(_value, "");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (e instanceof VariableRef) {
        final VariableRef _variableRef = (VariableRef)e;
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        Variable _variable = _variableRef.getVariable();
        String _name = _variable.getName();
        _builder.append(_name, "");
        _switchResult = _builder.toString();
      }
    }
    String _string = _switchResult.toString();
    return _string;
  }
  
  public ExpressionModel assertRepr(final CharSequence input, final CharSequence expected) {
    try {
      ExpressionModel _parse = this._parseHelper.parse(input);
      final Procedure1<ExpressionModel> _function = new Procedure1<ExpressionModel>() {
          public void apply(final ExpressionModel it) {
            ExpressionsParserTest.this._validationTestHelper.assertNoErrors(it);
            EList<AbstractElement> _elements = it.getElements();
            AbstractElement _last = IterableExtensions.<AbstractElement>last(_elements);
            String _stringRepr = ExpressionsParserTest.this.stringRepr(((Expression) _last));
            Assert.assertEquals(expected, _stringRepr);
          }
        };
      ExpressionModel _doubleArrow = ObjectExtensions.<ExpressionModel>operator_doubleArrow(_parse, _function);
      return _doubleArrow;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testPlus() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("10 + 5 + 1 + 2");
    this.assertRepr(_builder, "(((10 + 5) + 1) + 2)");
  }
  
  @Test
  public void testMinus() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("10 - 5 - 1 - 2");
    this.assertRepr(_builder, "(((10 - 5) - 1) - 2)");
  }
  
  @Test
  public void testPlusWithMinus() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("10 - 5 + 1 - 2");
    this.assertRepr(_builder, "(((10 - 5) + 1) - 2)");
  }
  
  @Test
  public void testParenthesis() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(10)");
      ExpressionModel _parse = this._parseHelper.parse(_builder);
      EList<AbstractElement> _elements = _parse.getElements();
      _elements.get(0);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testPlusWithParenthesis() {
    this.assertRepr("( 10 + 5 ) + ( 1 + 2 )", "((10 + 5) + (1 + 2))");
  }
  
  @Test
  public void testPlusMulPrecedence() {
    this.assertRepr("10 + 5 * 2 - 5 / 1", "((10 + (5*2)) - (5/1))");
  }
}
