/**
 */
package ca.mcgill.emf.democdsl.impl;

import ca.mcgill.emf.democdsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DemocdslFactoryImpl extends EFactoryImpl implements DemocdslFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DemocdslFactory init() {
        try {
            DemocdslFactory theDemocdslFactory = (DemocdslFactory)EPackage.Registry.INSTANCE.getEFactory(DemocdslPackage.eNS_URI);
            if (theDemocdslFactory != null) {
                return theDemocdslFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new DemocdslFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DemocdslFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case DemocdslPackage.DEMOC_DSL: return createDemocDSL();
            case DemocdslPackage.CONSTITUENT: return createConstituent();
            case DemocdslPackage.PARTY: return createParty();
            case DemocdslPackage.INFLUENCE: return createInfluence();
            case DemocdslPackage.BELIEF: return createBelief();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DemocDSL createDemocDSL() {
        DemocDSLImpl democDSL = new DemocDSLImpl();
        return democDSL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Constituent createConstituent() {
        ConstituentImpl constituent = new ConstituentImpl();
        return constituent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Party createParty() {
        PartyImpl party = new PartyImpl();
        return party;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Influence createInfluence() {
        InfluenceImpl influence = new InfluenceImpl();
        return influence;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Belief createBelief() {
        BeliefImpl belief = new BeliefImpl();
        return belief;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DemocdslPackage getDemocdslPackage() {
        return (DemocdslPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static DemocdslPackage getPackage() {
        return DemocdslPackage.eINSTANCE;
    }

} //DemocdslFactoryImpl
