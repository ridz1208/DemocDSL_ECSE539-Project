/**
 */
package ca.mcgill.emf.democdsl.impl;

import ca.mcgill.emf.democdsl.Constituent;
import ca.mcgill.emf.democdsl.DemocDSL;
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
 * An implementation of the model object '<em><b>Democ DSL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.democdsl.impl.DemocDSLImpl#getConstituents <em>Constituents</em>}</li>
 *   <li>{@link ca.mcgill.emf.democdsl.impl.DemocDSLImpl#getParties <em>Parties</em>}</li>
 *   <li>{@link ca.mcgill.emf.democdsl.impl.DemocDSLImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DemocDSLImpl extends MinimalEObjectImpl.Container implements DemocDSL {
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
     * The cached value of the '{@link #getParties() <em>Parties</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParties()
     * @generated
     * @ordered
     */
    protected EList<Party> parties;

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
            constituents = new EObjectContainmentEList<Constituent>(Constituent.class, this, DemocdslPackage.DEMOC_DSL__CONSTITUENTS);
        }
        return constituents;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Party> getParties() {
        if (parties == null) {
            parties = new EObjectContainmentEList<Party>(Party.class, this, DemocdslPackage.DEMOC_DSL__PARTIES);
        }
        return parties;
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
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DemocdslPackage.DEMOC_DSL__CONSTITUENTS:
                return ((InternalEList<?>)getConstituents()).basicRemove(otherEnd, msgs);
            case DemocdslPackage.DEMOC_DSL__PARTIES:
                return ((InternalEList<?>)getParties()).basicRemove(otherEnd, msgs);
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
            case DemocdslPackage.DEMOC_DSL__PARTIES:
                return getParties();
            case DemocdslPackage.DEMOC_DSL__NAME:
                return getName();
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
            case DemocdslPackage.DEMOC_DSL__PARTIES:
                getParties().clear();
                getParties().addAll((Collection<? extends Party>)newValue);
                return;
            case DemocdslPackage.DEMOC_DSL__NAME:
                setName((String)newValue);
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
            case DemocdslPackage.DEMOC_DSL__PARTIES:
                getParties().clear();
                return;
            case DemocdslPackage.DEMOC_DSL__NAME:
                setName(NAME_EDEFAULT);
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
            case DemocdslPackage.DEMOC_DSL__PARTIES:
                return parties != null && !parties.isEmpty();
            case DemocdslPackage.DEMOC_DSL__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
