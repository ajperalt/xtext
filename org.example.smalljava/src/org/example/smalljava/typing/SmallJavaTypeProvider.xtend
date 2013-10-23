package org.example.smalljava.typing

import org.example.smalljava.smallJava.SJBoolConstant
import org.example.smalljava.smallJava.SJClass
import org.example.smalljava.smallJava.SJExpression
import org.example.smalljava.smallJava.SJIntConstant
import org.example.smalljava.smallJava.SJMemberSelection
import org.example.smalljava.smallJava.SJNew
import org.example.smalljava.smallJava.SJNull
import org.example.smalljava.smallJava.SJStringConstant
import org.example.smalljava.smallJava.SJSymbolRef
import org.example.smalljava.smallJava.SJThis
import org.example.smalljava.smallJava.SmallJavaFactory

import static extension org.eclipse.xtext.EcoreUtil2.*
import org.example.smalljava.smallJava.SJVariableDeclaration
import org.example.smalljava.smallJava.SJAssignment
import org.example.smalljava.smallJava.SJReturn
import org.example.smalljava.smallJava.SJMethod
import org.example.smalljava.smallJava.SmallJavaPackage

class SmallJavaTypeProvider {
	public static val stringType = 
		SmallJavaFactory::eINSTANCE.createSJClass => [name='stringType']
		
	public static val intType= 
		SmallJavaFactory::eINSTANCE.createSJClass => [name='intType']
	
	public static val booleanType= 
		SmallJavaFactory::eINSTANCE.createSJClass => [name='booleanType']
		
	public static val nullType= 
		SmallJavaFactory::eINSTANCE.createSJClass => [name='nullType']
		
	val ep = SmallJavaPackage::eINSTANCE
	
	def typeFor(SJExpression e) {
		switch (e) {
			SJNew: e.type
			SJSymbolRef: e.symbol?.type
			SJMemberSelection: e.member?.type
			SJThis: e.getContainerOfType(typeof(SJClass))
			SJNull: nullType
			SJStringConstant: stringType
			SJIntConstant: intType
			SJBoolConstant: booleanType
		}
	}
	
	def isPrimitive(SJClass c) {
		c.eResource == null
	}
	
		def expectedType(SJExpression e) {
		val c = e.eContainer
		val f = e.eContainingFeature
		switch (c) {
			SJVariableDeclaration case f == ep.SJVariableDeclaration_Expression : 
				c.type
			SJAssignment case f == ep.SJAssignment_Right : 
				c.left.typeFor
//			SJReturn case f == ep.SJReturn_Expression :
//				c.containingMethod.type
			SJMemberSelection case f == ep.SJMemberSelection_Args : {
				// assume that it refers to a method and that there
				// is a parameter corresponding to the argument
				try {
					(c.member as SJMethod).params.get(c.args.indexOf(e)).type
				} catch (Throwable t) {
					null // otherwise there is no specific expected type
				}
			}
			case f == ep.SJIfStatement_Expression: booleanType
		}
	}
	
	
	
}