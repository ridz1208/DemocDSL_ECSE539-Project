/**
 */
package ca.mcgill.emf.democdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constituent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.democdsl.Constituent#getName <em>Name</em>}</li>
 *   <li>{@link ca.mcgill.emf.democdsl.Constituent#getIndependence <em>Independence</em>}</li>
 *   <li>{@link ca.mcgill.emf.democdsl.Constituent#getAtomicConstituent <em>Atomic Constituent</em>}</li>
 *   <li>{@link ca.mcgill.emf.democdsl.Constituent#getBeliefs <em>Beliefs</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.democdsl.DemocdslPackage#getConstituent()
 * @model
 * @generated
 */
public interface Constituent extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see ca.mcgill.emf.democdsl.DemocdslPackage#getConstituent_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link ca.mcgill.emf.democdsl.Constituent#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Independence</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Independence</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Independence</em>' attribute.
     * @see #setIndependence(int)
     * @see ca.mcgill.emf.democdsl.DemocdslPackage#getConstituent_Independence()
     * @model
     * @generated
     */
    int getIndependence();

    /**
     * Sets the value of the '{@link ca.mcgill.emf.democdsl.Constituent#getIndependence <em>Independence</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Independence</em>' attribute.
     * @see #getIndependence()
     * @generated
     */
    void setIndependence(int value);

    /**
     * Returns the value of the '<em><b>Atomic Constituent</b></em>' containment reference list.
     * The list contents are of type {@link ca.mcgill.emf.democdsl.Constituent}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Atomic Constituent</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Atomic Constituent</em>' containment reference list.
     * @see ca.mcgill.emf.democdsl.DemocdslPackage#getConstituent_AtomicConstituent()
     * @model containment="true"
     * @generated
     */
    EList<Constituent> getAtomicConstituent();

    /**
     * Returns the value of the '<em><b>Beliefs</b></em>' containment reference list.
     * The list contents are of type {@link ca.mcgill.emf.democdsl.Belief}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Beliefs</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Beliefs</em>' containment reference list.
     * @see ca.mcgill.emf.democdsl.DemocdslPackage#getConstituent_Beliefs()
     * @model containment="true"
     * @generated
     */
    EList<Belief> getBeliefs();

} // Constituent
