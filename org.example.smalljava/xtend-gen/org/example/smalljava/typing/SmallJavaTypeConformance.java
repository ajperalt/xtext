package org.example.smalljava.typing;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.ArrayList;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.xbase.lib.Extension;
import org.example.smalljava.smallJava.SJClass;
import org.example.smalljava.smallJava.SmallJavaPackage;
import org.example.smalljava.typing.SmallJavaTypeProvider;
import org.example.smalljava.util.SmallJavaModelUtil;

@SuppressWarnings("all")
public class SmallJavaTypeConformance {
  private final SmallJavaPackage ep = SmallJavaPackage.eINSTANCE;
  
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  public boolean isConformant(final SJClass c1, final SJClass c2) {
    boolean _or = false;
    boolean _or_1 = false;
    boolean _equals = Objects.equal(c1, SmallJavaTypeProvider.nullType);
    if (_equals) {
      _or_1 = true;
    } else {
      boolean _equals_1 = Objects.equal(c1, c2);
      _or_1 = (_equals || _equals_1);
    }
    if (_or_1) {
      _or = true;
    } else {
      boolean _isSubClassOf = this.isSubClassOf(c1, c2);
      _or = (_or_1 || _isSubClassOf);
    }
    return _or;
  }
  
  public boolean isSubClassOf(final SJClass c1, final SJClass c2) {
    ArrayList<SJClass> _classHierarchy = SmallJavaModelUtil.classHierarchy(c1);
    boolean _contains = _classHierarchy.contains(c2);
    return _contains;
  }
}
