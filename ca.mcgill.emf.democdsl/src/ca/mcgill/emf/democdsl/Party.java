/**
 */
package ca.mcgill.emf.democdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.democdsl.Party#getName <em>Name</em>}</li>
 *   <li>{@link ca.mcgill.emf.democdsl.Party#getConstituents <em>Constituents</em>}</li>
 *   <li>{@link ca.mcgill.emf.democdsl.Party#getBeliefs <em>Beliefs</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.democdsl.DemocdslPackage#getParty()
 * @model
 * @generated
 */
public interface Party extends EObject {
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
     * @see ca.mcgill.emf.democdsl.DemocdslPackage#getParty_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link ca.mcgill.emf.democdsl.Party#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Constituents</b></em>' containment reference list.
     * The list contents are of type {@link ca.mcgill.emf.democdsl.Constituent}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Constituents</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Constituents</em>' containment reference list.
     * @see ca.mcgill.emf.democdsl.DemocdslPackage#getParty_Constituents()
     * @model containment="true"
     * @generated
     */
    EList<Constituent> getConstituents();

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
     * @see ca.mcgill.emf.democdsl.DemocdslPackage#getParty_Beliefs()
     * @model containment="true"
     * @generated
     */
    EList<Belief> getBeliefs();

} // Party
