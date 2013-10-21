package org.example.entites.tests

import org.eclipse.xtext.junit4.XtextRunner
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.InjectWith
import org.examples.entities.EntitiesInjectorProvider
import com.google.inject.Inject
import org.examples.entities.entities.Model
import org.eclipse.xtext.formatting.INodeModelFormatter

import static extension org.junit.Assert.*
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.resource.XtextResource

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EntitiesInjectorProvider))
class EntitiesFormatterTest {
	
	@Inject extension ParseHelper<Model>
	@Inject extension INodeModelFormatter
	
	def void assertFormattedAs(CharSequence input, 
							   CharSequence expected)
	{
		expected.toString.assertEquals((input.parse.eResource as XtextResource).parseResult.
		rootNode.format(0, input.length).formattedText);
	}
	
	
	
	
}
