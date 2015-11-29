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
 *   <li>{@link ca.mcgill.emf.democdsl.Constituent#getBeliefs <em>Beliefs</em>}</li>
 *   <li>{@link ca.mcgill.emf.democdsl.Constituent#getInfluencesOut <em>Influences Out</em>}</li>
 *   <li>{@link ca.mcgill.emf.democdsl.Constituent#getInfluencesIn <em>Influences In</em>}</li>
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

    /**
     * Returns the value of the '<em><b>Influences Out</b></em>' reference list.
     * The list contents are of type {@link ca.mcgill.emf.democdsl.Influence}.
     * It is bidirectional and its opposite is '{@link ca.mcgill.emf.democdsl.Influence#getInfluencer <em>Influencer</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Influences Out</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Influences Out</em>' reference list.
     * @see ca.mcgill.emf.democdsl.DemocdslPackage#getConstituent_InfluencesOut()
     * @see ca.mcgill.emf.democdsl.Influence#getInfluencer
     * @model opposite="influencer"
     * @generated
     */
    EList<Influence> getInfluencesOut();

    /**
     * Returns the value of the '<em><b>Influences In</b></em>' reference list.
     * The list contents are of type {@link ca.mcgill.emf.democdsl.Influence}.
     * It is bidirectional and its opposite is '{@link ca.mcgill.emf.democdsl.Influence#getInfluenced <em>Influenced</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Influences In</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Influences In</em>' reference list.
     * @see ca.mcgill.emf.democdsl.DemocdslPackage#getConstituent_InfluencesIn()
     * @see ca.mcgill.emf.democdsl.Influence#getInfluenced
     * @model opposite="influenced"
     * @generated
     */
    EList<Influence> getInfluencesIn();

} // Constituent
