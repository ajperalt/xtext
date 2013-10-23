package org.example.smalljava.typing;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.example.smalljava.smallJava.SJAssignment;
import org.example.smalljava.smallJava.SJBoolConstant;
import org.example.smalljava.smallJava.SJClass;
import org.example.smalljava.smallJava.SJExpression;
import org.example.smalljava.smallJava.SJIntConstant;
import org.example.smalljava.smallJava.SJMember;
import org.example.smalljava.smallJava.SJMemberSelection;
import org.example.smalljava.smallJava.SJMethod;
import org.example.smalljava.smallJava.SJNew;
import org.example.smalljava.smallJava.SJNull;
import org.example.smalljava.smallJava.SJParameter;
import org.example.smalljava.smallJava.SJStringConstant;
import org.example.smalljava.smallJava.SJSymbol;
import org.example.smalljava.smallJava.SJSymbolRef;
import org.example.smalljava.smallJava.SJThis;
import org.example.smalljava.smallJava.SJVariableDeclaration;
import org.example.smalljava.smallJava.SmallJavaFactory;
import org.example.smalljava.smallJava.SmallJavaPackage;

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
  
  private final SmallJavaPackage ep = SmallJavaPackage.eINSTANCE;
  
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
  
  public SJClass expectedType(final SJExpression e) {
    SJClass _xblockexpression = null;
    {
      final EObject c = e.eContainer();
      final EStructuralFeature f = e.eContainingFeature();
      SJClass _switchResult = null;
      boolean _matched = false;
      if (!_matched) {
        if (c instanceof SJVariableDeclaration) {
          final SJVariableDeclaration _sJVariableDeclaration = (SJVariableDeclaration)c;
          EReference _sJVariableDeclaration_Expression = this.ep.getSJVariableDeclaration_Expression();
          boolean _equals = Objects.equal(f, _sJVariableDeclaration_Expression);
          if (_equals) {
            _matched=true;
            SJClass _type = _sJVariableDeclaration.getType();
            _switchResult = _type;
          }
        }
      }
      if (!_matched) {
        if (c instanceof SJAssignment) {
          final SJAssignment _sJAssignment = (SJAssignment)c;
          EReference _sJAssignment_Right = this.ep.getSJAssignment_Right();
          boolean _equals = Objects.equal(f, _sJAssignment_Right);
          if (_equals) {
            _matched=true;
            SJExpression _left = _sJAssignment.getLeft();
            SJClass _typeFor = this.typeFor(_left);
            _switchResult = _typeFor;
          }
        }
      }
      if (!_matched) {
        if (c instanceof SJMemberSelection) {
          final SJMemberSelection _sJMemberSelection = (SJMemberSelection)c;
          EReference _sJMemberSelection_Args = this.ep.getSJMemberSelection_Args();
          boolean _equals = Objects.equal(f, _sJMemberSelection_Args);
          if (_equals) {
            _matched=true;
            SJClass _xtrycatchfinallyexpression = null;
            try {
              SJMember _member = _sJMemberSelection.getMember();
              EList<SJParameter> _params = ((SJMethod) _member).getParams();
              EList<SJExpression> _args = _sJMemberSelection.getArgs();
              int _indexOf = _args.indexOf(e);
              SJParameter _get = _params.get(_indexOf);
              SJClass _type = _get.getType();
              _xtrycatchfinallyexpression = _type;
            } catch (final Throwable _t) {
              if (_t instanceof Throwable) {
                final Throwable t = (Throwable)_t;
                _xtrycatchfinallyexpression = null;
              } else {
                throw Exceptions.sneakyThrow(_t);
              }
            }
            _switchResult = _xtrycatchfinallyexpression;
          }
        }
      }
      if (!_matched) {
        EReference _sJIfStatement_Expression = this.ep.getSJIfStatement_Expression();
        boolean _equals = Objects.equal(f, _sJIfStatement_Expression);
        if (_equals) {
          _matched=true;
          _switchResult = SmallJavaTypeProvider.booleanType;
        }
      }
      _xblockexpression = (_switchResult);
    }
    return _xblockexpression;
  }
}
