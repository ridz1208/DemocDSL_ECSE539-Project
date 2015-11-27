/**
 */
package ca.mcgill.emf.democdsl.util;

import ca.mcgill.emf.democdsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ca.mcgill.emf.democdsl.DemocdslPackage
 * @generated
 */
public class DemocdslAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static DemocdslPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DemocdslAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = DemocdslPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DemocdslSwitch<Adapter> modelSwitch =
        new DemocdslSwitch<Adapter>() {
            @Override
            public Adapter caseDemocDSL(DemocDSL object) {
                return createDemocDSLAdapter();
            }
            @Override
            public Adapter caseConstituent(Constituent object) {
                return createConstituentAdapter();
            }
            @Override
            public Adapter caseIdeology(Ideology object) {
                return createIdeologyAdapter();
            }
            @Override
            public Adapter caseInfluence(Influence object) {
                return createInfluenceAdapter();
            }
            @Override
            public Adapter caseBelief(Belief object) {
                return createBeliefAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link ca.mcgill.emf.democdsl.DemocDSL <em>Democ DSL</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ca.mcgill.emf.democdsl.DemocDSL
     * @generated
     */
    public Adapter createDemocDSLAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ca.mcgill.emf.democdsl.Constituent <em>Constituent</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ca.mcgill.emf.democdsl.Constituent
     * @generated
     */
    public Adapter createConstituentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ca.mcgill.emf.democdsl.Ideology <em>Ideology</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ca.mcgill.emf.democdsl.Ideology
     * @generated
     */
    public Adapter createIdeologyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ca.mcgill.emf.democdsl.Influence <em>Influence</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ca.mcgill.emf.democdsl.Influence
     * @generated
     */
    public Adapter createInfluenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ca.mcgill.emf.democdsl.Belief <em>Belief</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ca.mcgill.emf.democdsl.Belief
     * @generated
     */
    public Adapter createBeliefAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //DemocdslAdapterFactory
