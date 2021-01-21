/**
 * generated by Xtext 2.23.0
 */
package fr.polytech.si5.dsl.arduino.arduinoML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.polytech.si5.dsl.arduino.arduinoML.State#getName <em>Name</em>}</li>
 *   <li>{@link fr.polytech.si5.dsl.arduino.arduinoML.State#getActions <em>Actions</em>}</li>
 *   <li>{@link fr.polytech.si5.dsl.arduino.arduinoML.State#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @see fr.polytech.si5.dsl.arduino.arduinoML.ArduinoMLPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.polytech.si5.dsl.arduino.arduinoML.ArduinoMLPackage#getState_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.polytech.si5.dsl.arduino.arduinoML.State#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link fr.polytech.si5.dsl.arduino.arduinoML.Action}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see fr.polytech.si5.dsl.arduino.arduinoML.ArduinoMLPackage#getState_Actions()
   * @model containment="true"
   * @generated
   */
  EList<Action> getActions();

  /**
   * Returns the value of the '<em><b>Transition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transition</em>' containment reference.
   * @see #setTransition(Transition)
   * @see fr.polytech.si5.dsl.arduino.arduinoML.ArduinoMLPackage#getState_Transition()
   * @model containment="true"
   * @generated
   */
  Transition getTransition();

  /**
   * Sets the value of the '{@link fr.polytech.si5.dsl.arduino.arduinoML.State#getTransition <em>Transition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transition</em>' containment reference.
   * @see #getTransition()
   * @generated
   */
  void setTransition(Transition value);

} // State
