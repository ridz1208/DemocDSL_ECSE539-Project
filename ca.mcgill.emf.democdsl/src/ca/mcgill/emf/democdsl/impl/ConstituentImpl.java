/**
 */
package ca.mcgill.emf.democdsl.impl;

import ca.mcgill.emf.democdsl.Belief;
import ca.mcgill.emf.democdsl.Constituent;
import ca.mcgill.emf.democdsl.DemocdslPackage;

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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
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
 *   <li>{@link ca.mcgill.emf.democdsl.impl.ConstituentImpl#getBeliefs <em>Beliefs</em>}</li>
 *   <li>{@link ca.mcgill.emf.democdsl.impl.ConstituentImpl#getInfluencesOut <em>Influences Out</em>}</li>
 *   <li>{@link ca.mcgill.emf.democdsl.impl.ConstituentImpl#getInfluencesIn <em>Influences In</em>}</li>
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
     * The cached value of the '{@link #getBeliefs() <em>Beliefs</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBeliefs()
     * @generated
     * @ordered
     */
    protected EList<Belief> beliefs;

    /**
     * The cached value of the '{@link #getInfluencesOut() <em>Influences Out</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInfluencesOut()
     * @generated
     * @ordered
     */
    protected EList<Influence> influencesOut;

    /**
     * The cached value of the '{@link #getInfluencesIn() <em>Influences In</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInfluencesIn()
     * @generated
     * @ordered
     */
    protected EList<Influence> influencesIn;

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
    public EList<Influence> getInfluencesOut() {
        if (influencesOut == null) {
            influencesOut = new EObjectWithInverseResolvingEList<Influence>(Influence.class, this, DemocdslPackage.CONSTITUENT__INFLUENCES_OUT, DemocdslPackage.INFLUENCE__INFLUENCER);
        }
        return influencesOut;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Influence> getInfluencesIn() {
        if (influencesIn == null) {
            influencesIn = new EObjectWithInverseResolvingEList<Influence>(Influence.class, this, DemocdslPackage.CONSTITUENT__INFLUENCES_IN, DemocdslPackage.INFLUENCE__INFLUENCED);
        }
        return influencesIn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DemocdslPackage.CONSTITUENT__INFLUENCES_OUT:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getInfluencesOut()).basicAdd(otherEnd, msgs);
            case DemocdslPackage.CONSTITUENT__INFLUENCES_IN:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getInfluencesIn()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DemocdslPackage.CONSTITUENT__BELIEFS:
                return ((InternalEList<?>)getBeliefs()).basicRemove(otherEnd, msgs);
            case DemocdslPackage.CONSTITUENT__INFLUENCES_OUT:
                return ((InternalEList<?>)getInfluencesOut()).basicRemove(otherEnd, msgs);
            case DemocdslPackage.CONSTITUENT__INFLUENCES_IN:
                return ((InternalEList<?>)getInfluencesIn()).basicRemove(otherEnd, msgs);
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
            case DemocdslPackage.CONSTITUENT__BELIEFS:
                return getBeliefs();
            case DemocdslPackage.CONSTITUENT__INFLUENCES_OUT:
                return getInfluencesOut();
            case DemocdslPackage.CONSTITUENT__INFLUENCES_IN:
                return getInfluencesIn();
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
            case DemocdslPackage.CONSTITUENT__BELIEFS:
                getBeliefs().clear();
                getBeliefs().addAll((Collection<? extends Belief>)newValue);
                return;
            case DemocdslPackage.CONSTITUENT__INFLUENCES_OUT:
                getInfluencesOut().clear();
                getInfluencesOut().addAll((Collection<? extends Influence>)newValue);
                return;
            case DemocdslPackage.CONSTITUENT__INFLUENCES_IN:
                getInfluencesIn().clear();
                getInfluencesIn().addAll((Collection<? extends Influence>)newValue);
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
            case DemocdslPackage.CONSTITUENT__BELIEFS:
                getBeliefs().clear();
                return;
            case DemocdslPackage.CONSTITUENT__INFLUENCES_OUT:
                getInfluencesOut().clear();
                return;
            case DemocdslPackage.CONSTITUENT__INFLUENCES_IN:
                getInfluencesIn().clear();
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
            case DemocdslPackage.CONSTITUENT__BELIEFS:
                return beliefs != null && !beliefs.isEmpty();
            case DemocdslPackage.CONSTITUENT__INFLUENCES_OUT:
                return influencesOut != null && !influencesOut.isEmpty();
            case DemocdslPackage.CONSTITUENT__INFLUENCES_IN:
                return influencesIn != null && !influencesIn.isEmpty();
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
