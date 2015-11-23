/**
 */
package ca.mcgill.emf.democdsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ca.mcgill.emf.democdsl.DemocdslFactory
 * @model kind="package"
 * @generated
 */
public interface DemocdslPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "democdsl";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.example.org/democdsl";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "democdsl";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    DemocdslPackage eINSTANCE = ca.mcgill.emf.democdsl.impl.DemocdslPackageImpl.init();

    /**
     * The meta object id for the '{@link ca.mcgill.emf.democdsl.impl.DemocDSLImpl <em>Democ DSL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ca.mcgill.emf.democdsl.impl.DemocDSLImpl
     * @see ca.mcgill.emf.democdsl.impl.DemocdslPackageImpl#getDemocDSL()
     * @generated
     */
    int DEMOC_DSL = 0;

    /**
     * The feature id for the '<em><b>Constituents</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEMOC_DSL__CONSTITUENTS = 0;

    /**
     * The feature id for the '<em><b>Parties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEMOC_DSL__PARTIES = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEMOC_DSL__NAME = 2;

    /**
     * The number of structural features of the '<em>Democ DSL</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEMOC_DSL_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Democ DSL</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEMOC_DSL_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link ca.mcgill.emf.democdsl.impl.ConstituentImpl <em>Constituent</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ca.mcgill.emf.democdsl.impl.ConstituentImpl
     * @see ca.mcgill.emf.democdsl.impl.DemocdslPackageImpl#getConstituent()
     * @generated
     */
    int CONSTITUENT = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTITUENT__NAME = 0;

    /**
     * The feature id for the '<em><b>Independence</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTITUENT__INDEPENDENCE = 1;

    /**
     * The feature id for the '<em><b>Atomic Constituent</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTITUENT__ATOMIC_CONSTITUENT = 2;

    /**
     * The feature id for the '<em><b>Beliefs</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTITUENT__BELIEFS = 3;

    /**
     * The feature id for the '<em><b>Influences</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTITUENT__INFLUENCES = 4;

    /**
     * The number of structural features of the '<em>Constituent</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTITUENT_FEATURE_COUNT = 5;

    /**
     * The number of operations of the '<em>Constituent</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTITUENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link ca.mcgill.emf.democdsl.impl.PartyImpl <em>Party</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ca.mcgill.emf.democdsl.impl.PartyImpl
     * @see ca.mcgill.emf.democdsl.impl.DemocdslPackageImpl#getParty()
     * @generated
     */
    int PARTY = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTY__NAME = 0;

    /**
     * The feature id for the '<em><b>Constituents</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTY__CONSTITUENTS = 1;

    /**
     * The feature id for the '<em><b>Beliefs</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTY__BELIEFS = 2;

    /**
     * The number of structural features of the '<em>Party</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTY_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Party</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTY_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link ca.mcgill.emf.democdsl.impl.InfluenceImpl <em>Influence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ca.mcgill.emf.democdsl.impl.InfluenceImpl
     * @see ca.mcgill.emf.democdsl.impl.DemocdslPackageImpl#getInfluence()
     * @generated
     */
    int INFLUENCE = 3;

    /**
     * The feature id for the '<em><b>Weight</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFLUENCE__WEIGHT = 0;

    /**
     * The number of structural features of the '<em>Influence</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFLUENCE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Influence</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFLUENCE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link ca.mcgill.emf.democdsl.impl.BeliefImpl <em>Belief</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ca.mcgill.emf.democdsl.impl.BeliefImpl
     * @see ca.mcgill.emf.democdsl.impl.DemocdslPackageImpl#getBelief()
     * @generated
     */
    int BELIEF = 4;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BELIEF__VALUE = 0;

    /**
     * The number of structural features of the '<em>Belief</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BELIEF_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Belief</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BELIEF_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link ca.mcgill.emf.democdsl.DemocDSL <em>Democ DSL</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Democ DSL</em>'.
     * @see ca.mcgill.emf.democdsl.DemocDSL
     * @generated
     */
    EClass getDemocDSL();

    /**
     * Returns the meta object for the containment reference list '{@link ca.mcgill.emf.democdsl.DemocDSL#getConstituents <em>Constituents</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Constituents</em>'.
     * @see ca.mcgill.emf.democdsl.DemocDSL#getConstituents()
     * @see #getDemocDSL()
     * @generated
     */
    EReference getDemocDSL_Constituents();

    /**
     * Returns the meta object for the containment reference list '{@link ca.mcgill.emf.democdsl.DemocDSL#getParties <em>Parties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Parties</em>'.
     * @see ca.mcgill.emf.democdsl.DemocDSL#getParties()
     * @see #getDemocDSL()
     * @generated
     */
    EReference getDemocDSL_Parties();

    /**
     * Returns the meta object for the attribute '{@link ca.mcgill.emf.democdsl.DemocDSL#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see ca.mcgill.emf.democdsl.DemocDSL#getName()
     * @see #getDemocDSL()
     * @generated
     */
    EAttribute getDemocDSL_Name();

    /**
     * Returns the meta object for class '{@link ca.mcgill.emf.democdsl.Constituent <em>Constituent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Constituent</em>'.
     * @see ca.mcgill.emf.democdsl.Constituent
     * @generated
     */
    EClass getConstituent();

    /**
     * Returns the meta object for the attribute '{@link ca.mcgill.emf.democdsl.Constituent#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see ca.mcgill.emf.democdsl.Constituent#getName()
     * @see #getConstituent()
     * @generated
     */
    EAttribute getConstituent_Name();

    /**
     * Returns the meta object for the attribute '{@link ca.mcgill.emf.democdsl.Constituent#getIndependence <em>Independence</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Independence</em>'.
     * @see ca.mcgill.emf.democdsl.Constituent#getIndependence()
     * @see #getConstituent()
     * @generated
     */
    EAttribute getConstituent_Independence();

    /**
     * Returns the meta object for the containment reference list '{@link ca.mcgill.emf.democdsl.Constituent#getAtomicConstituent <em>Atomic Constituent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Atomic Constituent</em>'.
     * @see ca.mcgill.emf.democdsl.Constituent#getAtomicConstituent()
     * @see #getConstituent()
     * @generated
     */
    EReference getConstituent_AtomicConstituent();

    /**
     * Returns the meta object for the containment reference list '{@link ca.mcgill.emf.democdsl.Constituent#getBeliefs <em>Beliefs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Beliefs</em>'.
     * @see ca.mcgill.emf.democdsl.Constituent#getBeliefs()
     * @see #getConstituent()
     * @generated
     */
    EReference getConstituent_Beliefs();

    /**
     * Returns the meta object for the containment reference list '{@link ca.mcgill.emf.democdsl.Constituent#getInfluences <em>Influences</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Influences</em>'.
     * @see ca.mcgill.emf.democdsl.Constituent#getInfluences()
     * @see #getConstituent()
     * @generated
     */
    EReference getConstituent_Influences();

    /**
     * Returns the meta object for class '{@link ca.mcgill.emf.democdsl.Party <em>Party</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Party</em>'.
     * @see ca.mcgill.emf.democdsl.Party
     * @generated
     */
    EClass getParty();

    /**
     * Returns the meta object for the attribute '{@link ca.mcgill.emf.democdsl.Party#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see ca.mcgill.emf.democdsl.Party#getName()
     * @see #getParty()
     * @generated
     */
    EAttribute getParty_Name();

    /**
     * Returns the meta object for the containment reference list '{@link ca.mcgill.emf.democdsl.Party#getConstituents <em>Constituents</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Constituents</em>'.
     * @see ca.mcgill.emf.democdsl.Party#getConstituents()
     * @see #getParty()
     * @generated
     */
    EReference getParty_Constituents();

    /**
     * Returns the meta object for the containment reference list '{@link ca.mcgill.emf.democdsl.Party#getBeliefs <em>Beliefs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Beliefs</em>'.
     * @see ca.mcgill.emf.democdsl.Party#getBeliefs()
     * @see #getParty()
     * @generated
     */
    EReference getParty_Beliefs();

    /**
     * Returns the meta object for class '{@link ca.mcgill.emf.democdsl.Influence <em>Influence</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Influence</em>'.
     * @see ca.mcgill.emf.democdsl.Influence
     * @generated
     */
    EClass getInfluence();

    /**
     * Returns the meta object for the attribute '{@link ca.mcgill.emf.democdsl.Influence#getWeight <em>Weight</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Weight</em>'.
     * @see ca.mcgill.emf.democdsl.Influence#getWeight()
     * @see #getInfluence()
     * @generated
     */
    EAttribute getInfluence_Weight();

    /**
     * Returns the meta object for class '{@link ca.mcgill.emf.democdsl.Belief <em>Belief</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Belief</em>'.
     * @see ca.mcgill.emf.democdsl.Belief
     * @generated
     */
    EClass getBelief();

    /**
     * Returns the meta object for the attribute '{@link ca.mcgill.emf.democdsl.Belief#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see ca.mcgill.emf.democdsl.Belief#getValue()
     * @see #getBelief()
     * @generated
     */
    EAttribute getBelief_Value();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    DemocdslFactory getDemocdslFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link ca.mcgill.emf.democdsl.impl.DemocDSLImpl <em>Democ DSL</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ca.mcgill.emf.democdsl.impl.DemocDSLImpl
         * @see ca.mcgill.emf.democdsl.impl.DemocdslPackageImpl#getDemocDSL()
         * @generated
         */
        EClass DEMOC_DSL = eINSTANCE.getDemocDSL();

        /**
         * The meta object literal for the '<em><b>Constituents</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DEMOC_DSL__CONSTITUENTS = eINSTANCE.getDemocDSL_Constituents();

        /**
         * The meta object literal for the '<em><b>Parties</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DEMOC_DSL__PARTIES = eINSTANCE.getDemocDSL_Parties();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DEMOC_DSL__NAME = eINSTANCE.getDemocDSL_Name();

        /**
         * The meta object literal for the '{@link ca.mcgill.emf.democdsl.impl.ConstituentImpl <em>Constituent</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ca.mcgill.emf.democdsl.impl.ConstituentImpl
         * @see ca.mcgill.emf.democdsl.impl.DemocdslPackageImpl#getConstituent()
         * @generated
         */
        EClass CONSTITUENT = eINSTANCE.getConstituent();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONSTITUENT__NAME = eINSTANCE.getConstituent_Name();

        /**
         * The meta object literal for the '<em><b>Independence</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONSTITUENT__INDEPENDENCE = eINSTANCE.getConstituent_Independence();

        /**
         * The meta object literal for the '<em><b>Atomic Constituent</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONSTITUENT__ATOMIC_CONSTITUENT = eINSTANCE.getConstituent_AtomicConstituent();

        /**
         * The meta object literal for the '<em><b>Beliefs</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONSTITUENT__BELIEFS = eINSTANCE.getConstituent_Beliefs();

        /**
         * The meta object literal for the '<em><b>Influences</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONSTITUENT__INFLUENCES = eINSTANCE.getConstituent_Influences();

        /**
         * The meta object literal for the '{@link ca.mcgill.emf.democdsl.impl.PartyImpl <em>Party</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ca.mcgill.emf.democdsl.impl.PartyImpl
         * @see ca.mcgill.emf.democdsl.impl.DemocdslPackageImpl#getParty()
         * @generated
         */
        EClass PARTY = eINSTANCE.getParty();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARTY__NAME = eINSTANCE.getParty_Name();

        /**
         * The meta object literal for the '<em><b>Constituents</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PARTY__CONSTITUENTS = eINSTANCE.getParty_Constituents();

        /**
         * The meta object literal for the '<em><b>Beliefs</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PARTY__BELIEFS = eINSTANCE.getParty_Beliefs();

        /**
         * The meta object literal for the '{@link ca.mcgill.emf.democdsl.impl.InfluenceImpl <em>Influence</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ca.mcgill.emf.democdsl.impl.InfluenceImpl
         * @see ca.mcgill.emf.democdsl.impl.DemocdslPackageImpl#getInfluence()
         * @generated
         */
        EClass INFLUENCE = eINSTANCE.getInfluence();

        /**
         * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INFLUENCE__WEIGHT = eINSTANCE.getInfluence_Weight();

        /**
         * The meta object literal for the '{@link ca.mcgill.emf.democdsl.impl.BeliefImpl <em>Belief</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see ca.mcgill.emf.democdsl.impl.BeliefImpl
         * @see ca.mcgill.emf.democdsl.impl.DemocdslPackageImpl#getBelief()
         * @generated
         */
        EClass BELIEF = eINSTANCE.getBelief();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BELIEF__VALUE = eINSTANCE.getBelief_Value();

    }

} //DemocdslPackage
