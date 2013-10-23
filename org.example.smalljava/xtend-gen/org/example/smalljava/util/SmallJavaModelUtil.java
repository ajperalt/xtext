package org.example.smalljava.util;

import com.google.common.collect.Iterables;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.example.smalljava.smallJava.SJBlock;
import org.example.smalljava.smallJava.SJClass;
import org.example.smalljava.smallJava.SJField;
import org.example.smalljava.smallJava.SJMember;
import org.example.smalljava.smallJava.SJMethod;
import org.example.smalljava.smallJava.SJMethodBody;
import org.example.smalljava.smallJava.SJProgram;
import org.example.smalljava.smallJava.SJReturn;
import org.example.smalljava.smallJava.SJStatement;

@SuppressWarnings("all")
public class SmallJavaModelUtil {
  public static Iterable<SJField> fields(final SJClass c) {
    EList<SJMember> _members = c.getMembers();
    Iterable<SJField> _filter = Iterables.<SJField>filter(_members, SJField.class);
    return _filter;
  }
  
  public static Iterable<SJMethod> methods(final SJClass c) {
    EList<SJMember> _members = c.getMembers();
    Iterable<SJMethod> _filter = Iterables.<SJMethod>filter(_members, SJMethod.class);
    return _filter;
  }
  
  public static SJReturn returnsStatment(final SJMethod m) {
    SJMethodBody _body = m.getBody();
    EList<SJStatement> _statements = _body.getStatements();
    List<SJReturn> _typeSelect = EcoreUtil2.<SJReturn>typeSelect(_statements, SJReturn.class);
    SJReturn _head = IterableExtensions.<SJReturn>head(_typeSelect);
    return _head;
  }
  
  public static SJClass containingClass(final EObject e) {
    SJClass _containerOfType = EcoreUtil2.<SJClass>getContainerOfType(e, SJClass.class);
    return _containerOfType;
  }
  
  public static SJBlock containingBlock(final EObject e) {
    SJBlock _containerOfType = EcoreUtil2.<SJBlock>getContainerOfType(e, SJBlock.class);
    return _containerOfType;
  }
  
  public static SJProgram containingProgram(final EObject e) {
    SJProgram _containerOfType = EcoreUtil2.<SJProgram>getContainerOfType(e, SJProgram.class);
    return _containerOfType;
  }
  
  public static SJMethod containingMethod(final EObject e) {
    SJMethod _containerOfType = EcoreUtil2.<SJMethod>getContainerOfType(e, SJMethod.class);
    return _containerOfType;
  }
}
