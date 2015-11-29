/**
 */
package ca.mcgill.emf.democdsl.impl;

import ca.mcgill.emf.democdsl.Belief;
import ca.mcgill.emf.democdsl.Constituent;
import ca.mcgill.emf.democdsl.DemocDSL;
import ca.mcgill.emf.democdsl.DemocdslPackage;
import ca.mcgill.emf.democdsl.Ideology;
import ca.mcgill.emf.democdsl.Influence;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Democ DSL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.democdsl.impl.DemocDSLImpl#getConstituents <em>Constituents</em>}</li>
 *   <li>{@link ca.mcgill.emf.democdsl.impl.DemocDSLImpl#getIdeologies <em>Ideologies</em>}</li>
 *   <li>{@link ca.mcgill.emf.democdsl.impl.DemocDSLImpl#getName <em>Name</em>}</li>
 *   <li>{@link ca.mcgill.emf.democdsl.impl.DemocDSLImpl#getInfluences <em>Influences</em>}</li>
 *   <li>{@link ca.mcgill.emf.democdsl.impl.DemocDSLImpl#getBeliefs <em>Beliefs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DemocDSLImpl extends MinimalEObjectImpl.Container implements DemocDSL {
    /**
     * The cached value of the '{@link #getConstituents() <em>Constituents</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConstituents()
     * @generated
     * @ordered
     */
    protected EList<Constituent> constituents;

    /**
     * The cached value of the '{@link #getIdeologies() <em>Ideologies</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdeologies()
     * @generated
     * @ordered
     */
    protected EList<Ideology> ideologies;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getInfluences() <em>Influences</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInfluences()
     * @generated
     * @ordered
     */
    protected EList<Influence> influences;

    /**
     * The cached value of the '{@link #getBeliefs() <em>Beliefs</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBeliefs()
     * @generated
     * @ordered
     */
    protected EList<Belief> beliefs;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DemocDSLImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DemocdslPackage.Literals.DEMOC_DSL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Constituent> getConstituents() {
        if (constituents == null) {
            constituents = new EObjectResolvingEList<Constituent>(Constituent.class, this, DemocdslPackage.DEMOC_DSL__CONSTITUENTS);
        }
        return constituents;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Ideology> getIdeologies() {
        if (ideologies == null) {
            ideologies = new EObjectResolvingEList<Ideology>(Ideology.class, this, DemocdslPackage.DEMOC_DSL__IDEOLOGIES);
        }
        return ideologies;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DemocdslPackage.DEMOC_DSL__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Influence> getInfluences() {
        if (influences == null) {
            influences = new EObjectResolvingEList<Influence>(Influence.class, this, DemocdslPackage.DEMOC_DSL__INFLUENCES);
        }
        return influences;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Belief> getBeliefs() {
        if (beliefs == null) {
            beliefs = new EObjectContainmentEList<Belief>(Belief.class, this, DemocdslPackage.DEMOC_DSL__BELIEFS);
        }
        return beliefs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DemocdslPackage.DEMOC_DSL__BELIEFS:
                return ((InternalEList<?>)getBeliefs()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DemocdslPackage.DEMOC_DSL__CONSTITUENTS:
                return getConstituents();
            case DemocdslPackage.DEMOC_DSL__IDEOLOGIES:
                return getIdeologies();
            case DemocdslPackage.DEMOC_DSL__NAME:
                return getName();
            case DemocdslPackage.DEMOC_DSL__INFLUENCES:
                return getInfluences();
            case DemocdslPackage.DEMOC_DSL__BELIEFS:
                return getBeliefs();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case DemocdslPackage.DEMOC_DSL__CONSTITUENTS:
                getConstituents().clear();
                getConstituents().addAll((Collection<? extends Constituent>)newValue);
                return;
            case DemocdslPackage.DEMOC_DSL__IDEOLOGIES:
                getIdeologies().clear();
                getIdeologies().addAll((Collection<? extends Ideology>)newValue);
                return;
            case DemocdslPackage.DEMOC_DSL__NAME:
                setName((String)newValue);
                return;
            case DemocdslPackage.DEMOC_DSL__INFLUENCES:
                getInfluences().clear();
                getInfluences().addAll((Collection<? extends Influence>)newValue);
                return;
            case DemocdslPackage.DEMOC_DSL__BELIEFS:
                getBeliefs().clear();
                getBeliefs().addAll((Collection<? extends Belief>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case DemocdslPackage.DEMOC_DSL__CONSTITUENTS:
                getConstituents().clear();
                return;
            case DemocdslPackage.DEMOC_DSL__IDEOLOGIES:
                getIdeologies().clear();
                return;
            case DemocdslPackage.DEMOC_DSL__NAME:
                setName(NAME_EDEFAULT);
                return;
            case DemocdslPackage.DEMOC_DSL__INFLUENCES:
                getInfluences().clear();
                return;
            case DemocdslPackage.DEMOC_DSL__BELIEFS:
                getBeliefs().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case DemocdslPackage.DEMOC_DSL__CONSTITUENTS:
                return constituents != null && !constituents.isEmpty();
            case DemocdslPackage.DEMOC_DSL__IDEOLOGIES:
                return ideologies != null && !ideologies.isEmpty();
            case DemocdslPackage.DEMOC_DSL__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case DemocdslPackage.DEMOC_DSL__INFLUENCES:
                return influences != null && !influences.isEmpty();
            case DemocdslPackage.DEMOC_DSL__BELIEFS:
                return beliefs != null && !beliefs.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //DemocDSLImpl
