/**
 */
package ca.mcgill.emf.democdsl.impl;

import ca.mcgill.emf.democdsl.Constituent;
import ca.mcgill.emf.democdsl.DemocdslPackage;
import ca.mcgill.emf.democdsl.Influence;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Influence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.democdsl.impl.InfluenceImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link ca.mcgill.emf.democdsl.impl.InfluenceImpl#getInfluenced <em>Influenced</em>}</li>
 *   <li>{@link ca.mcgill.emf.democdsl.impl.InfluenceImpl#getInfluencer <em>Influencer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfluenceImpl extends MinimalEObjectImpl.Container implements Influence {
    /**
     * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWeight()
     * @generated
     * @ordered
     */
    protected static final int WEIGHT_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWeight()
     * @generated
     * @ordered
     */
    protected int weight = WEIGHT_EDEFAULT;

    /**
     * The cached value of the '{@link #getInfluenced() <em>Influenced</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInfluenced()
     * @generated
     * @ordered
     */
    protected Constituent influenced;

    /**
     * The cached value of the '{@link #getInfluencer() <em>Influencer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInfluencer()
     * @generated
     * @ordered
     */
    protected Constituent influencer;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InfluenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DemocdslPackage.Literals.INFLUENCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getWeight() {
        return weight;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWeight(int newWeight) {
        int oldWeight = weight;
        weight = newWeight;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DemocdslPackage.INFLUENCE__WEIGHT, oldWeight, weight));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Constituent getInfluenced() {
        if (influenced != null && influenced.eIsProxy()) {
            InternalEObject oldInfluenced = (InternalEObject)influenced;
            influenced = (Constituent)eResolveProxy(oldInfluenced);
            if (influenced != oldInfluenced) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DemocdslPackage.INFLUENCE__INFLUENCED, oldInfluenced, influenced));
            }
        }
        return influenced;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Constituent basicGetInfluenced() {
        return influenced;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInfluenced(Constituent newInfluenced, NotificationChain msgs) {
        Constituent oldInfluenced = influenced;
        influenced = newInfluenced;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DemocdslPackage.INFLUENCE__INFLUENCED, oldInfluenced, newInfluenced);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInfluenced(Constituent newInfluenced) {
        if (newInfluenced != influenced) {
            NotificationChain msgs = null;
            if (influenced != null)
                msgs = ((InternalEObject)influenced).eInverseRemove(this, DemocdslPackage.CONSTITUENT__INFLUENCES_IN, Constituent.class, msgs);
            if (newInfluenced != null)
                msgs = ((InternalEObject)newInfluenced).eInverseAdd(this, DemocdslPackage.CONSTITUENT__INFLUENCES_IN, Constituent.class, msgs);
            msgs = basicSetInfluenced(newInfluenced, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DemocdslPackage.INFLUENCE__INFLUENCED, newInfluenced, newInfluenced));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Constituent getInfluencer() {
        if (influencer != null && influencer.eIsProxy()) {
            InternalEObject oldInfluencer = (InternalEObject)influencer;
            influencer = (Constituent)eResolveProxy(oldInfluencer);
            if (influencer != oldInfluencer) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DemocdslPackage.INFLUENCE__INFLUENCER, oldInfluencer, influencer));
            }
        }
        return influencer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Constituent basicGetInfluencer() {
        return influencer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInfluencer(Constituent newInfluencer, NotificationChain msgs) {
        Constituent oldInfluencer = influencer;
        influencer = newInfluencer;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DemocdslPackage.INFLUENCE__INFLUENCER, oldInfluencer, newInfluencer);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInfluencer(Constituent newInfluencer) {
        if (newInfluencer != influencer) {
            NotificationChain msgs = null;
            if (influencer != null)
                msgs = ((InternalEObject)influencer).eInverseRemove(this, DemocdslPackage.CONSTITUENT__INFLUENCES_OUT, Constituent.class, msgs);
            if (newInfluencer != null)
                msgs = ((InternalEObject)newInfluencer).eInverseAdd(this, DemocdslPackage.CONSTITUENT__INFLUENCES_OUT, Constituent.class, msgs);
            msgs = basicSetInfluencer(newInfluencer, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DemocdslPackage.INFLUENCE__INFLUENCER, newInfluencer, newInfluencer));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DemocdslPackage.INFLUENCE__INFLUENCED:
                if (influenced != null)
                    msgs = ((InternalEObject)influenced).eInverseRemove(this, DemocdslPackage.CONSTITUENT__INFLUENCES_IN, Constituent.class, msgs);
                return basicSetInfluenced((Constituent)otherEnd, msgs);
            case DemocdslPackage.INFLUENCE__INFLUENCER:
                if (influencer != null)
                    msgs = ((InternalEObject)influencer).eInverseRemove(this, DemocdslPackage.CONSTITUENT__INFLUENCES_OUT, Constituent.class, msgs);
                return basicSetInfluencer((Constituent)otherEnd, msgs);
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
            case DemocdslPackage.INFLUENCE__INFLUENCED:
                return basicSetInfluenced(null, msgs);
            case DemocdslPackage.INFLUENCE__INFLUENCER:
                return basicSetInfluencer(null, msgs);
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
            case DemocdslPackage.INFLUENCE__WEIGHT:
                return getWeight();
            case DemocdslPackage.INFLUENCE__INFLUENCED:
                if (resolve) return getInfluenced();
                return basicGetInfluenced();
            case DemocdslPackage.INFLUENCE__INFLUENCER:
                if (resolve) return getInfluencer();
                return basicGetInfluencer();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case DemocdslPackage.INFLUENCE__WEIGHT:
                setWeight((Integer)newValue);
                return;
            case DemocdslPackage.INFLUENCE__INFLUENCED:
                setInfluenced((Constituent)newValue);
                return;
            case DemocdslPackage.INFLUENCE__INFLUENCER:
                setInfluencer((Constituent)newValue);
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
            case DemocdslPackage.INFLUENCE__WEIGHT:
                setWeight(WEIGHT_EDEFAULT);
                return;
            case DemocdslPackage.INFLUENCE__INFLUENCED:
                setInfluenced((Constituent)null);
                return;
            case DemocdslPackage.INFLUENCE__INFLUENCER:
                setInfluencer((Constituent)null);
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
            case DemocdslPackage.INFLUENCE__WEIGHT:
                return weight != WEIGHT_EDEFAULT;
            case DemocdslPackage.INFLUENCE__INFLUENCED:
                return influenced != null;
            case DemocdslPackage.INFLUENCE__INFLUENCER:
                return influencer != null;
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
        result.append(" (weight: ");
        result.append(weight);
        result.append(')');
        return result.toString();
    }

} //InfluenceImpl
