/**
 */
package ca.mcgill.emf.democdsl.impl;

import ca.mcgill.emf.democdsl.Belief;
import ca.mcgill.emf.democdsl.Constituent;
import ca.mcgill.emf.democdsl.DemocdslPackage;
import ca.mcgill.emf.democdsl.Party;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.democdsl.impl.PartyImpl#getName <em>Name</em>}</li>
 *   <li>{@link ca.mcgill.emf.democdsl.impl.PartyImpl#getConstituents <em>Constituents</em>}</li>
 *   <li>{@link ca.mcgill.emf.democdsl.impl.PartyImpl#getBeliefs <em>Beliefs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartyImpl extends MinimalEObjectImpl.Container implements Party {
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
     * The cached value of the '{@link #getConstituents() <em>Constituents</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConstituents()
     * @generated
     * @ordered
     */
    protected EList<Constituent> constituents;

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
    protected PartyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DemocdslPackage.Literals.PARTY;
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
            eNotify(new ENotificationImpl(this, Notification.SET, DemocdslPackage.PARTY__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Constituent> getConstituents() {
        if (constituents == null) {
            constituents = new EObjectContainmentEList<Constituent>(Constituent.class, this, DemocdslPackage.PARTY__CONSTITUENTS);
        }
        return constituents;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Belief> getBeliefs() {
        if (beliefs == null) {
            beliefs = new EObjectContainmentEList<Belief>(Belief.class, this, DemocdslPackage.PARTY__BELIEFS);
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
            case DemocdslPackage.PARTY__CONSTITUENTS:
                return ((InternalEList<?>)getConstituents()).basicRemove(otherEnd, msgs);
            case DemocdslPackage.PARTY__BELIEFS:
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
            case DemocdslPackage.PARTY__NAME:
                return getName();
            case DemocdslPackage.PARTY__CONSTITUENTS:
                return getConstituents();
            case DemocdslPackage.PARTY__BELIEFS:
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
            case DemocdslPackage.PARTY__NAME:
                setName((String)newValue);
                return;
            case DemocdslPackage.PARTY__CONSTITUENTS:
                getConstituents().clear();
                getConstituents().addAll((Collection<? extends Constituent>)newValue);
                return;
            case DemocdslPackage.PARTY__BELIEFS:
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
            case DemocdslPackage.PARTY__NAME:
                setName(NAME_EDEFAULT);
                return;
            case DemocdslPackage.PARTY__CONSTITUENTS:
                getConstituents().clear();
                return;
            case DemocdslPackage.PARTY__BELIEFS:
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
            case DemocdslPackage.PARTY__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case DemocdslPackage.PARTY__CONSTITUENTS:
                return constituents != null && !constituents.isEmpty();
            case DemocdslPackage.PARTY__BELIEFS:
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

} //PartyImpl
