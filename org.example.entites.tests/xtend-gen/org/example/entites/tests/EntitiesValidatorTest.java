package org.example.entites.tests;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.examples.entities.EntitiesInjectorProvider;
import org.examples.entities.entities.EntitiesPackage;
import org.examples.entities.entities.Model;
import org.examples.entities.validation.EntitiesValidator;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(EntitiesInjectorProvider.class)
@SuppressWarnings("all")
public class EntitiesValidatorTest {
  @Inject
  @Extension
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testEntityExtendsItself() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entity MyEntity extends MyEntity {}");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _entity = EntitiesPackage.eINSTANCE.getEntity();
      this._validationTestHelper.assertError(_parse, _entity, 
        EntitiesValidator.HIERARCHY_CYCLE, 
        "cycle in hierarchy of entity \'My Entity\'");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCycleInEntityHierarchy() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entity A extends B {}");
      _builder.newLine();
      _builder.append("entity B extends C {}");
      _builder.newLine();
      _builder.append("entity C extends A {}");
      _builder.newLine();
      final Model model = this._parseHelper.parse(_builder);
      EClass _entity = EntitiesPackage.eINSTANCE.getEntity();
      this._validationTestHelper.assertError(model, _entity, 
        EntitiesValidator.HIERARCHY_CYCLE, 
        "cycle in hieracrhy of entity \'A\'");
      EClass _entity_1 = EntitiesPackage.eINSTANCE.getEntity();
      this._validationTestHelper.assertError(model, _entity_1, 
        EntitiesValidator.HIERARCHY_CYCLE, 
        "cycle in hierarchy of entity \'B\'");
      EClass _entity_2 = EntitiesPackage.eINSTANCE.getEntity();
      this._validationTestHelper.assertError(model, _entity_2, 
        EntitiesValidator.HIERARCHY_CYCLE, 
        "cycle in hierarchy of entity \'C\'");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDuplicatesEntities() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entity MyEntity {}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("entity MyEntity {}");
      _builder.newLine();
      final Model model = this._parseHelper.parse(_builder);
      EClass _entity = EntitiesPackage.eINSTANCE.getEntity();
      this._validationTestHelper.assertError(model, _entity, 
        null, 
        "Duplicate Entity \'MyEntity\'");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
