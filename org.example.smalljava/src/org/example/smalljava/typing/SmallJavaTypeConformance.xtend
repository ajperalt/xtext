package org.example.smalljava.typing

import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.example.smalljava.smallJava.SJClass

import static org.example.smalljava.typing.SmallJavaTypeProvider.*
import static extension org.example.smalljava.util.SmallJavaModelUtil.*

class SmallJavaTypeConformance {

	@Inject extension IQualifiedNameProvider

	
	def isConformant(SJClass c1, SJClass c2) {
		c1 == nullType || // null can be assigned to everything
		c1 == c2 ||
		c1.isSubClassOf(c2)
	}
	
	def isSubClassOf(SJClass c1, SJClass c2) {
		c1.classHierarchy.contains(c2)
	}
	
}