/*
* generated by Xtext
*/
package org.examples.entities;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class EntitiesUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.examples.entities.ui.internal.EntitiesActivator.getInstance().getInjector("org.examples.entities.Entities");
	}
	
}
