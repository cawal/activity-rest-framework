/**
 */
package deploymentmodel.impl;

import deploymentmodel.Contact;
import deploymentmodel.Deployment;
import deploymentmodel.DeploymentmodelPackage;
import deploymentmodel.Service;
import deploymentmodel.ServiceContainer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link deploymentmodel.impl.DeploymentImpl#getService <em>Service</em>}</li>
 *   <li>{@link deploymentmodel.impl.DeploymentImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link deploymentmodel.impl.DeploymentImpl#getContactInformation <em>Contact Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentImpl extends MinimalEObjectImpl.Container implements Deployment {
	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected Service service;

	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected ServiceContainer container;

	/**
	 * The cached value of the '{@link #getContactInformation() <em>Contact Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactInformation()
	 * @generated
	 * @ordered
	 */
	protected Contact contactInformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentmodelPackage.Literals.DEPLOYMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Service getService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetService(Service newService, NotificationChain msgs) {
		Service oldService = service;
		service = newService;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeploymentmodelPackage.DEPLOYMENT__SERVICE, oldService, newService);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setService(Service newService) {
		if (newService != service) {
			NotificationChain msgs = null;
			if (service != null)
				msgs = ((InternalEObject)service).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeploymentmodelPackage.DEPLOYMENT__SERVICE, null, msgs);
			if (newService != null)
				msgs = ((InternalEObject)newService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeploymentmodelPackage.DEPLOYMENT__SERVICE, null, msgs);
			msgs = basicSetService(newService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentmodelPackage.DEPLOYMENT__SERVICE, newService, newService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceContainer getContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(ServiceContainer newContainer, NotificationChain msgs) {
		ServiceContainer oldContainer = container;
		container = newContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeploymentmodelPackage.DEPLOYMENT__CONTAINER, oldContainer, newContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainer(ServiceContainer newContainer) {
		if (newContainer != container) {
			NotificationChain msgs = null;
			if (container != null)
				msgs = ((InternalEObject)container).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeploymentmodelPackage.DEPLOYMENT__CONTAINER, null, msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeploymentmodelPackage.DEPLOYMENT__CONTAINER, null, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentmodelPackage.DEPLOYMENT__CONTAINER, newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Contact getContactInformation() {
		return contactInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContactInformation(Contact newContactInformation, NotificationChain msgs) {
		Contact oldContactInformation = contactInformation;
		contactInformation = newContactInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeploymentmodelPackage.DEPLOYMENT__CONTACT_INFORMATION, oldContactInformation, newContactInformation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactInformation(Contact newContactInformation) {
		if (newContactInformation != contactInformation) {
			NotificationChain msgs = null;
			if (contactInformation != null)
				msgs = ((InternalEObject)contactInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeploymentmodelPackage.DEPLOYMENT__CONTACT_INFORMATION, null, msgs);
			if (newContactInformation != null)
				msgs = ((InternalEObject)newContactInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeploymentmodelPackage.DEPLOYMENT__CONTACT_INFORMATION, null, msgs);
			msgs = basicSetContactInformation(newContactInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentmodelPackage.DEPLOYMENT__CONTACT_INFORMATION, newContactInformation, newContactInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeploymentmodelPackage.DEPLOYMENT__SERVICE:
				return basicSetService(null, msgs);
			case DeploymentmodelPackage.DEPLOYMENT__CONTAINER:
				return basicSetContainer(null, msgs);
			case DeploymentmodelPackage.DEPLOYMENT__CONTACT_INFORMATION:
				return basicSetContactInformation(null, msgs);
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
			case DeploymentmodelPackage.DEPLOYMENT__SERVICE:
				return getService();
			case DeploymentmodelPackage.DEPLOYMENT__CONTAINER:
				return getContainer();
			case DeploymentmodelPackage.DEPLOYMENT__CONTACT_INFORMATION:
				return getContactInformation();
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
			case DeploymentmodelPackage.DEPLOYMENT__SERVICE:
				setService((Service)newValue);
				return;
			case DeploymentmodelPackage.DEPLOYMENT__CONTAINER:
				setContainer((ServiceContainer)newValue);
				return;
			case DeploymentmodelPackage.DEPLOYMENT__CONTACT_INFORMATION:
				setContactInformation((Contact)newValue);
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
			case DeploymentmodelPackage.DEPLOYMENT__SERVICE:
				setService((Service)null);
				return;
			case DeploymentmodelPackage.DEPLOYMENT__CONTAINER:
				setContainer((ServiceContainer)null);
				return;
			case DeploymentmodelPackage.DEPLOYMENT__CONTACT_INFORMATION:
				setContactInformation((Contact)null);
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
			case DeploymentmodelPackage.DEPLOYMENT__SERVICE:
				return service != null;
			case DeploymentmodelPackage.DEPLOYMENT__CONTAINER:
				return container != null;
			case DeploymentmodelPackage.DEPLOYMENT__CONTACT_INFORMATION:
				return contactInformation != null;
		}
		return super.eIsSet(featureID);
	}

} //DeploymentImpl
