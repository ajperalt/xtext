/*
* generated by Xtext
*/
package org.examples.entities.ui.quickfix

import org.examples.entities.validation.EntitiesValidator
import org.eclipse.xtext.validation.Issue
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.examples.entities.entities.Entity

//import org.eclipse.xtext.ui.editor.quickfix.Fix
//import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
//import org.eclipse.xtext.validation.Issue

/**
 * Custom quickfixes.
 *
 * see http://www.eclipse.org/Xtext/documentation.html#quickfixes
 */
class EntitiesQuickfixProvider extends org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider {

//	@Fix(MyDslValidator::INVALID_NAME)
//	def capitalizeName(Issue issue, IssueResolutionAcceptor acceptor) {
//		acceptor.accept(issue, 'Capitalize name', 'Capitalize the name.', 'upcase.png') [
//			context |
//			val xtextDocument = context.xtextDocument
//			val firstLetter = xtextDocument.get(issue.offset, 1)
//			xtextDocument.replace(issue.offset, 1, firstLetter.toUpperCase)
//		]
//	}

@Fix(EntitiesValidator::INVALID_ENTITY_NAME)
def void capitalizeEntityNameFirstLetter(Issue issue,
	IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Capitalize first letter", //label
		"Capitalize first letter of '" 
		+ issue.data.get(0) + "'", // description
		"Entity.gif", // icon
		[
			context | 
			val xtextDocument = context.xtextDocument
			val firstLetter = xtextDocument.get(issue.offset, 1);
			xtextDocument.replace(issue.offset,1,
				firstLetter.toFirstUpper);
			
		]
   	  );
}

@Fix(EntitiesValidator::HIERARCHY_CYCLE)
def void removeSuperType(Issue issue, 
	IssueResolutionAcceptor acceptor) {
		
		acceptor.accept(issue, 
			"Remove supertype",
			'''Remove supertype '«issue.data.get(0)»' ''',
			"delete_obj.gif",
			[element, context |
				(element as Entity).superType = null;
			]
		);
	
		
	}
}