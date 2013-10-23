package org.example.smalljava.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.example.smalljava.SmallJavaInjectorProvider;
import org.example.smalljava.smallJava.SJClass;
import org.example.smalljava.smallJava.SJExpression;
import org.example.smalljava.smallJava.SJMethod;
import org.example.smalljava.smallJava.SJProgram;
import org.example.smalljava.smallJava.SJReturn;
import org.example.smalljava.typing.SmallJavaTypeConformance;
import org.example.smalljava.typing.SmallJavaTypeProvider;
import org.example.smalljava.util.SmallJavaModelUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(SmallJavaInjectorProvider.class)
@SuppressWarnings("all")
public class SmallJavaTypeConformanceTest {
  @Inject
  @Extension
  private ParseHelper<SJProgram> _parseHelper;
  
  @Inject
  @Extension
  private SmallJavaTypeConformance _smallJavaTypeConformance;
  
  @Inject
  @Extension
  private SmallJavaTypeProvider _smallJavaTypeProvider;
  
  @Test
  public void testClassConformance() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class A {}");
      _builder.newLine();
      _builder.append("class B extends A {}");
      _builder.newLine();
      _builder.append("class C {}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      EList<SJClass> _classes = _parse.getClasses();
      final Procedure1<EList<SJClass>> _function = new Procedure1<EList<SJClass>>() {
          public void apply(final EList<SJClass> it) {
            SJClass _get = it.get(0);
            SJClass _get_1 = it.get(0);
            boolean _isConformant = SmallJavaTypeConformanceTest.this._smallJavaTypeConformance.isConformant(_get, _get_1);
            Assert.assertTrue(_isConformant);
            SJClass _get_2 = it.get(1);
            SJClass _get_3 = it.get(0);
            boolean _isConformant_1 = SmallJavaTypeConformanceTest.this._smallJavaTypeConformance.isConformant(_get_2, _get_3);
            Assert.assertTrue(_isConformant_1);
            SJClass _get_4 = it.get(2);
            SJClass _get_5 = it.get(0);
            boolean _isConformant_2 = SmallJavaTypeConformanceTest.this._smallJavaTypeConformance.isConformant(_get_4, _get_5);
            Assert.assertFalse(_isConformant_2);
          }
        };
      ObjectExtensions.<EList<SJClass>>operator_doubleArrow(_classes, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testNullConformance() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class C {}");
      _builder.newLine();
      _builder.append("class D {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C m() { return null; }");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      EList<SJClass> _classes = _parse.getClasses();
      final Procedure1<EList<SJClass>> _function = new Procedure1<EList<SJClass>>() {
          public void apply(final EList<SJClass> it) {
            SJClass _last = IterableExtensions.<SJClass>last(it);
            Iterable<SJMethod> _methods = SmallJavaModelUtil.methods(_last);
            SJMethod _head = IterableExtensions.<SJMethod>head(_methods);
            SJReturn _returnsStatment = SmallJavaModelUtil.returnsStatment(_head);
            SJExpression _expression = _returnsStatment.getExpression();
            final SJClass typeOfNull = SmallJavaTypeConformanceTest.this._smallJavaTypeProvider.typeFor(_expression);
            SJClass _get = it.get(0);
            boolean _isConformant = SmallJavaTypeConformanceTest.this._smallJavaTypeConformance.isConformant(typeOfNull, _get);
            Assert.assertTrue(_isConformant);
            SJClass _get_1 = it.get(1);
            boolean _isConformant_1 = SmallJavaTypeConformanceTest.this._smallJavaTypeConformance.isConformant(typeOfNull, _get_1);
            Assert.assertTrue(_isConformant_1);
          }
        };
      ObjectExtensions.<EList<SJClass>>operator_doubleArrow(_classes, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
