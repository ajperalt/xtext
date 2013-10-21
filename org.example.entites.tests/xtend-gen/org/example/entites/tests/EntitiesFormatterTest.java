package org.example.entites.tests;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.formatting.INodeModelFormatter;
import org.eclipse.xtext.formatting.INodeModelFormatter.IFormattedRegion;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.examples.entities.EntitiesInjectorProvider;
import org.examples.entities.entities.Model;
import org.junit.Assert;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(EntitiesInjectorProvider.class)
@SuppressWarnings("all")
public class EntitiesFormatterTest {
  @Inject
  @Extension
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  @Extension
  private INodeModelFormatter _iNodeModelFormatter;
  
  public void assertFormattedAs(final CharSequence input, final CharSequence expected) {
    try {
      String _string = expected.toString();
      Model _parse = this._parseHelper.parse(input);
      Resource _eResource = _parse.eResource();
      IParseResult _parseResult = ((XtextResource) _eResource).getParseResult();
      ICompositeNode _rootNode = _parseResult.getRootNode();
      int _length = input.length();
      IFormattedRegion _format = this._iNodeModelFormatter.format(_rootNode, 0, _length);
      String _formattedText = _format.getFormattedText();
      Assert.assertEquals(_string, _formattedText);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
