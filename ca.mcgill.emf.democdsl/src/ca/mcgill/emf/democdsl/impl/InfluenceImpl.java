/**
 */
package ca.mcgill.emf.democdsl.impl;

import ca.mcgill.emf.democdsl.Constituent;
import ca.mcgill.emf.democdsl.DemocdslPackage;
import ca.mcgill.emf.democdsl.Ideology;
import ca.mcgill.emf.democdsl.Influence;

import org.eclipse.emf.common.notify.Notification;

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
    protected Ideology influencer;

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
    public void setInfluenced(Constituent newInfluenced) {
        Constituent oldInfluenced = influenced;
        influenced = newInfluenced;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DemocdslPackage.INFLUENCE__INFLUENCED, oldInfluenced, influenced));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Ideology getInfluencer() {
        if (influencer != null && influencer.eIsProxy()) {
            InternalEObject oldInfluencer = (InternalEObject)influencer;
            influencer = (Ideology)eResolveProxy(oldInfluencer);
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
    public Ideology basicGetInfluencer() {
        return influencer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInfluencer(Ideology newInfluencer) {
        Ideology oldInfluencer = influencer;
        influencer = newInfluencer;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DemocdslPackage.INFLUENCE__INFLUENCER, oldInfluencer, influencer));
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
                setInfluencer((Ideology)newValue);
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
                setInfluencer((Ideology)null);
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
