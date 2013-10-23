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

class SmallJavaTypeProvider {
	public static val stringType = 
		SmallJavaFactory::eINSTANCE.createSJClass => [name='stringType']
		
	public static val intType= 
		SmallJavaFactory::eINSTANCE.createSJClass => [name='intType']
	
	public static val booleanType= 
		SmallJavaFactory::eINSTANCE.createSJClass => [name='booleanType']
		
	public static val nullType= 
		SmallJavaFactory::eINSTANCE.createSJClass => [name='nullType']
	
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
	
	
}