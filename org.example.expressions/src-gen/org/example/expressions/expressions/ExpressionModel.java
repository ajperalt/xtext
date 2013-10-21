/**
 */
package org.example.expressions.expressions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.example.expressions.expressions.ExpressionModel#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.example.expressions.expressions.ExpressionsPackage#getExpressionModel()
 * @model
 * @generated
 */
public interface ExpressionModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.example.expressions.expressions.AbstractElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.example.expressions.expressions.ExpressionsPackage#getExpressionModel_Elements()
   * @model containment="true"
   * @generated
   */
  EList<AbstractElement> getElements();

} // ExpressionModel
