/**
 */
package ca.mcgill.emf.democdsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.mcgill.emf.democdsl.DemocdslPackage
 * @generated
 */
public interface DemocdslFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    DemocdslFactory eINSTANCE = ca.mcgill.emf.democdsl.impl.DemocdslFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Democ DSL</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Democ DSL</em>'.
     * @generated
     */
    DemocDSL createDemocDSL();

    /**
     * Returns a new object of class '<em>Constituent</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Constituent</em>'.
     * @generated
     */
    Constituent createConstituent();

    /**
     * Returns a new object of class '<em>Ideology</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ideology</em>'.
     * @generated
     */
    Ideology createIdeology();

    /**
     * Returns a new object of class '<em>Influence</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Influence</em>'.
     * @generated
     */
    Influence createInfluence();

    /**
     * Returns a new object of class '<em>Belief</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Belief</em>'.
     * @generated
     */
    Belief createBelief();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    DemocdslPackage getDemocdslPackage();

} //DemocdslFactory
