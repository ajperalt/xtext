package org.example.smalljava.typing;

import com.google.common.base.Objects;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.example.smalljava.smallJava.SJBoolConstant;
import org.example.smalljava.smallJava.SJClass;
import org.example.smalljava.smallJava.SJExpression;
import org.example.smalljava.smallJava.SJIntConstant;
import org.example.smalljava.smallJava.SJMember;
import org.example.smalljava.smallJava.SJMemberSelection;
import org.example.smalljava.smallJava.SJNew;
import org.example.smalljava.smallJava.SJNull;
import org.example.smalljava.smallJava.SJStringConstant;
import org.example.smalljava.smallJava.SJSymbol;
import org.example.smalljava.smallJava.SJSymbolRef;
import org.example.smalljava.smallJava.SJThis;
import org.example.smalljava.smallJava.SmallJavaFactory;

@SuppressWarnings("all")
public class SmallJavaTypeProvider {
  public final static SJClass stringType = new Function0<SJClass>() {
    public SJClass apply() {
      SJClass _createSJClass = SmallJavaFactory.eINSTANCE.createSJClass();
      final Procedure1<SJClass> _function = new Procedure1<SJClass>() {
          public void apply(final SJClass it) {
            it.setName("stringType");
          }
        };
      SJClass _doubleArrow = ObjectExtensions.<SJClass>operator_doubleArrow(_createSJClass, _function);
      return _doubleArrow;
    }
  }.apply();
  
  public final static SJClass intType = new Function0<SJClass>() {
    public SJClass apply() {
      SJClass _createSJClass = SmallJavaFactory.eINSTANCE.createSJClass();
      final Procedure1<SJClass> _function = new Procedure1<SJClass>() {
          public void apply(final SJClass it) {
            it.setName("intType");
          }
        };
      SJClass _doubleArrow = ObjectExtensions.<SJClass>operator_doubleArrow(_createSJClass, _function);
      return _doubleArrow;
    }
  }.apply();
  
  public final static SJClass booleanType = new Function0<SJClass>() {
    public SJClass apply() {
      SJClass _createSJClass = SmallJavaFactory.eINSTANCE.createSJClass();
      final Procedure1<SJClass> _function = new Procedure1<SJClass>() {
          public void apply(final SJClass it) {
            it.setName("booleanType");
          }
        };
      SJClass _doubleArrow = ObjectExtensions.<SJClass>operator_doubleArrow(_createSJClass, _function);
      return _doubleArrow;
    }
  }.apply();
  
  public final static SJClass nullType = new Function0<SJClass>() {
    public SJClass apply() {
      SJClass _createSJClass = SmallJavaFactory.eINSTANCE.createSJClass();
      final Procedure1<SJClass> _function = new Procedure1<SJClass>() {
          public void apply(final SJClass it) {
            it.setName("nullType");
          }
        };
      SJClass _doubleArrow = ObjectExtensions.<SJClass>operator_doubleArrow(_createSJClass, _function);
      return _doubleArrow;
    }
  }.apply();
  
  public SJClass typeFor(final SJExpression e) {
    SJClass _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (e instanceof SJNew) {
        final SJNew _sJNew = (SJNew)e;
        _matched=true;
        SJClass _type = _sJNew.getType();
        _switchResult = _type;
      }
    }
    if (!_matched) {
      if (e instanceof SJSymbolRef) {
        final SJSymbolRef _sJSymbolRef = (SJSymbolRef)e;
        _matched=true;
        SJSymbol _symbol = _sJSymbolRef.getSymbol();
        SJClass _type = null;
        if (_symbol!=null) {
          _type=_symbol.getType();
        }
        _switchResult = _type;
      }
    }
    if (!_matched) {
      if (e instanceof SJMemberSelection) {
        final SJMemberSelection _sJMemberSelection = (SJMemberSelection)e;
        _matched=true;
        SJMember _member = _sJMemberSelection.getMember();
        SJClass _type = null;
        if (_member!=null) {
          _type=_member.getType();
        }
        _switchResult = _type;
      }
    }
    if (!_matched) {
      if (e instanceof SJThis) {
        final SJThis _sJThis = (SJThis)e;
        _matched=true;
        SJClass _containerOfType = EcoreUtil2.<SJClass>getContainerOfType(_sJThis, SJClass.class);
        _switchResult = _containerOfType;
      }
    }
    if (!_matched) {
      if (e instanceof SJNull) {
        final SJNull _sJNull = (SJNull)e;
        _matched=true;
        _switchResult = SmallJavaTypeProvider.nullType;
      }
    }
    if (!_matched) {
      if (e instanceof SJStringConstant) {
        final SJStringConstant _sJStringConstant = (SJStringConstant)e;
        _matched=true;
        _switchResult = SmallJavaTypeProvider.stringType;
      }
    }
    if (!_matched) {
      if (e instanceof SJIntConstant) {
        final SJIntConstant _sJIntConstant = (SJIntConstant)e;
        _matched=true;
        _switchResult = SmallJavaTypeProvider.intType;
      }
    }
    if (!_matched) {
      if (e instanceof SJBoolConstant) {
        final SJBoolConstant _sJBoolConstant = (SJBoolConstant)e;
        _matched=true;
        _switchResult = SmallJavaTypeProvider.booleanType;
      }
    }
    return _switchResult;
  }
  
  public boolean isPrimitive(final SJClass c) {
    Resource _eResource = c.eResource();
    boolean _equals = Objects.equal(_eResource, null);
    return _equals;
  }
}
