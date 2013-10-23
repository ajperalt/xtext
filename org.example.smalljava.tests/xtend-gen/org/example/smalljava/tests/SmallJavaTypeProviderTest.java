package org.example.smalljava.tests;

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
import org.example.smalljava.SmallJavaInjectorProvider;
import org.example.smalljava.smallJava.SJClass;
import org.example.smalljava.smallJava.SJExpression;
import org.example.smalljava.smallJava.SJMethod;
import org.example.smalljava.smallJava.SJMethodBody;
import org.example.smalljava.smallJava.SJProgram;
import org.example.smalljava.smallJava.SJStatement;
import org.example.smalljava.typing.SmallJavaTypeProvider;
import org.example.smalljava.util.SmallJavaModelUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(SmallJavaInjectorProvider.class)
@SuppressWarnings("all")
public class SmallJavaTypeProviderTest {
  @Inject
  @Extension
  private ParseHelper<SJProgram> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  @Extension
  private SmallJavaTypeProvider _smallJavaTypeProvider;
  
  private SJProgram assertType(final CharSequence testExp, final String expectedClassName) {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class R { public V v; }");
      _builder.newLine();
      _builder.append("class P extends R { public R m() {return null;} }");
      _builder.newLine();
      _builder.append("class V extends R { public N n; }");
      _builder.newLine();
      _builder.append("class N extends R {}");
      _builder.newLine();
      _builder.append("class F extends R {}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("class C extends R {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("F f;");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("R m(P p) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("V v = null;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append(testExp, "		");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("return null;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      final Procedure1<SJProgram> _function = new Procedure1<SJProgram>() {
          public void apply(final SJProgram it) {
            SmallJavaTypeProviderTest.this._validationTestHelper.assertNoErrors(it);
            EList<SJClass> _classes = it.getClasses();
            SJClass _last = IterableExtensions.<SJClass>last(_classes);
            Iterable<SJMethod> _methods = SmallJavaModelUtil.methods(_last);
            SJMethod _last_1 = IterableExtensions.<SJMethod>last(_methods);
            SJMethodBody _body = _last_1.getBody();
            EList<SJStatement> _statements = _body.getStatements();
            SJStatement _get = _statements.get(1);
            SJClass _statementExpressionsType = SmallJavaTypeProviderTest.this.statementExpressionsType(_get);
            String _name = _statementExpressionsType.getName();
            Assert.assertEquals(expectedClassName, _name);
          }
        };
      SJProgram _doubleArrow = ObjectExtensions.<SJProgram>operator_doubleArrow(_parse, _function);
      return _doubleArrow;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private SJClass statementExpressionsType(final SJStatement s) {
    SJClass _typeFor = this._smallJavaTypeProvider.typeFor(((SJExpression) s));
    return _typeFor;
  }
  
  @Test
  public void thisType() {
    this.assertType("this", "C");
  }
  
  @Test
  public void paramRefType() {
    this.assertType("p", "P");
  }
  
  @Test
  public void varRefType() {
    this.assertType("v", "V");
  }
  
  @Test
  public void newType() {
    this.assertType("new N()", "N");
  }
  
  @Test
  public void fieldSelectionType() {
    this.assertType("this.f", "F");
  }
  
  @Test
  public void intConstantType() {
    this.assertType("10", "intType");
  }
  
  @Test
  public void nullType() {
    this.assertType("null", "nullType");
  }
}
