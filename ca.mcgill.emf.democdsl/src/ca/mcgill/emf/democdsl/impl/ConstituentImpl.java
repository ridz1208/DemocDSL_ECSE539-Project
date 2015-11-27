/**
 */
package ca.mcgill.emf.democdsl.impl;

import ca.mcgill.emf.democdsl.Belief;
import ca.mcgill.emf.democdsl.Constituent;
import ca.mcgill.emf.democdsl.DemocdslPackage;

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
 * An implementation of the model object '<em><b>Constituent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.democdsl.impl.ConstituentImpl#getName <em>Name</em>}</li>
 *   <li>{@link ca.mcgill.emf.democdsl.impl.ConstituentImpl#getIndependence <em>Independence</em>}</li>
 *   <li>{@link ca.mcgill.emf.democdsl.impl.ConstituentImpl#getAtomicConstituent <em>Atomic Constituent</em>}</li>
 *   <li>{@link ca.mcgill.emf.democdsl.impl.ConstituentImpl#getBeliefs <em>Beliefs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstituentImpl extends MinimalEObjectImpl.Container implements Constituent {
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
     * The default value of the '{@link #getIndependence() <em>Independence</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIndependence()
     * @generated
     * @ordered
     */
    protected static final int INDEPENDENCE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getIndependence() <em>Independence</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIndependence()
     * @generated
     * @ordered
     */
    protected int independence = INDEPENDENCE_EDEFAULT;

    /**
     * The cached value of the '{@link #getAtomicConstituent() <em>Atomic Constituent</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAtomicConstituent()
     * @generated
     * @ordered
     */
    protected EList<Constituent> atomicConstituent;

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
    protected ConstituentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DemocdslPackage.Literals.CONSTITUENT;
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
            eNotify(new ENotificationImpl(this, Notification.SET, DemocdslPackage.CONSTITUENT__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getIndependence() {
        return independence;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIndependence(int newIndependence) {
        int oldIndependence = independence;
        independence = newIndependence;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DemocdslPackage.CONSTITUENT__INDEPENDENCE, oldIndependence, independence));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Constituent> getAtomicConstituent() {
        if (atomicConstituent == null) {
            atomicConstituent = new EObjectContainmentEList<Constituent>(Constituent.class, this, DemocdslPackage.CONSTITUENT__ATOMIC_CONSTITUENT);
        }
        return atomicConstituent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Belief> getBeliefs() {
        if (beliefs == null) {
            beliefs = new EObjectContainmentEList<Belief>(Belief.class, this, DemocdslPackage.CONSTITUENT__BELIEFS);
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
            case DemocdslPackage.CONSTITUENT__ATOMIC_CONSTITUENT:
                return ((InternalEList<?>)getAtomicConstituent()).basicRemove(otherEnd, msgs);
            case DemocdslPackage.CONSTITUENT__BELIEFS:
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
            case DemocdslPackage.CONSTITUENT__NAME:
                return getName();
            case DemocdslPackage.CONSTITUENT__INDEPENDENCE:
                return getIndependence();
            case DemocdslPackage.CONSTITUENT__ATOMIC_CONSTITUENT:
                return getAtomicConstituent();
            case DemocdslPackage.CONSTITUENT__BELIEFS:
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
            case DemocdslPackage.CONSTITUENT__NAME:
                setName((String)newValue);
                return;
            case DemocdslPackage.CONSTITUENT__INDEPENDENCE:
                setIndependence((Integer)newValue);
                return;
            case DemocdslPackage.CONSTITUENT__ATOMIC_CONSTITUENT:
                getAtomicConstituent().clear();
                getAtomicConstituent().addAll((Collection<? extends Constituent>)newValue);
                return;
            case DemocdslPackage.CONSTITUENT__BELIEFS:
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
            case DemocdslPackage.CONSTITUENT__NAME:
                setName(NAME_EDEFAULT);
                return;
            case DemocdslPackage.CONSTITUENT__INDEPENDENCE:
                setIndependence(INDEPENDENCE_EDEFAULT);
                return;
            case DemocdslPackage.CONSTITUENT__ATOMIC_CONSTITUENT:
                getAtomicConstituent().clear();
                return;
            case DemocdslPackage.CONSTITUENT__BELIEFS:
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
            case DemocdslPackage.CONSTITUENT__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case DemocdslPackage.CONSTITUENT__INDEPENDENCE:
                return independence != INDEPENDENCE_EDEFAULT;
            case DemocdslPackage.CONSTITUENT__ATOMIC_CONSTITUENT:
                return atomicConstituent != null && !atomicConstituent.isEmpty();
            case DemocdslPackage.CONSTITUENT__BELIEFS:
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
        result.append(", independence: ");
        result.append(independence);
        result.append(')');
        return result.toString();
    }

} //ConstituentImpl
