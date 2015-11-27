/**
 */
package ca.mcgill.emf.democdsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Influence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.democdsl.Influence#getWeight <em>Weight</em>}</li>
 *   <li>{@link ca.mcgill.emf.democdsl.Influence#getInfluenced <em>Influenced</em>}</li>
 *   <li>{@link ca.mcgill.emf.democdsl.Influence#getInfluencer <em>Influencer</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.democdsl.DemocdslPackage#getInfluence()
 * @model
 * @generated
 */
public interface Influence extends EObject {
    /**
     * Returns the value of the '<em><b>Weight</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Weight</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Weight</em>' attribute.
     * @see #setWeight(int)
     * @see ca.mcgill.emf.democdsl.DemocdslPackage#getInfluence_Weight()
     * @model
     * @generated
     */
    int getWeight();

    /**
     * Sets the value of the '{@link ca.mcgill.emf.democdsl.Influence#getWeight <em>Weight</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Weight</em>' attribute.
     * @see #getWeight()
     * @generated
     */
    void setWeight(int value);

    /**
     * Returns the value of the '<em><b>Influenced</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Influenced</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Influenced</em>' reference.
     * @see #setInfluenced(Constituent)
     * @see ca.mcgill.emf.democdsl.DemocdslPackage#getInfluence_Influenced()
     * @model required="true"
     * @generated
     */
    Constituent getInfluenced();

    /**
     * Sets the value of the '{@link ca.mcgill.emf.democdsl.Influence#getInfluenced <em>Influenced</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Influenced</em>' reference.
     * @see #getInfluenced()
     * @generated
     */
    void setInfluenced(Constituent value);

    /**
     * Returns the value of the '<em><b>Influencer</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Influencer</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Influencer</em>' reference.
     * @see #setInfluencer(Ideology)
     * @see ca.mcgill.emf.democdsl.DemocdslPackage#getInfluence_Influencer()
     * @model required="true"
     * @generated
     */
    Ideology getInfluencer();

    /**
     * Sets the value of the '{@link ca.mcgill.emf.democdsl.Influence#getInfluencer <em>Influencer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Influencer</em>' reference.
     * @see #getInfluencer()
     * @generated
     */
    void setInfluencer(Ideology value);

} // Influence
