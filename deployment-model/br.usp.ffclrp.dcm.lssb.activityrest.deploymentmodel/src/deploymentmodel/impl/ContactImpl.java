/**
 */
package deploymentmodel.impl;

import deploymentmodel.Contact;
import deploymentmodel.DeploymentmodelPackage;

import java.net.URL;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link deploymentmodel.impl.ContactImpl#getContactName <em>Contact Name</em>}</li>
 *   <li>{@link deploymentmodel.impl.ContactImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link deploymentmodel.impl.ContactImpl#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContactImpl extends MinimalEObjectImpl.Container implements Contact {
	/**
	 * The default value of the '{@link #getContactName() <em>Contact Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContactName() <em>Contact Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactName()
	 * @generated
	 * @ordered
	 */
	protected String contactName = CONTACT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final URL URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected URL url = URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentmodelPackage.Literals.CONTACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactName() {
		return contactName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactName(String newContactName) {
		String oldContactName = contactName;
		contactName = newContactName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentmodelPackage.CONTACT__CONTACT_NAME, oldContactName, contactName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentmodelPackage.CONTACT__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public URL getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(URL newUrl) {
		URL oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentmodelPackage.CONTACT__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeploymentmodelPackage.CONTACT__CONTACT_NAME:
				return getContactName();
			case DeploymentmodelPackage.CONTACT__EMAIL:
				return getEmail();
			case DeploymentmodelPackage.CONTACT__URL:
				return getUrl();
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
			case DeploymentmodelPackage.CONTACT__CONTACT_NAME:
				setContactName((String)newValue);
				return;
			case DeploymentmodelPackage.CONTACT__EMAIL:
				setEmail((String)newValue);
				return;
			case DeploymentmodelPackage.CONTACT__URL:
				setUrl((URL)newValue);
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
			case DeploymentmodelPackage.CONTACT__CONTACT_NAME:
				setContactName(CONTACT_NAME_EDEFAULT);
				return;
			case DeploymentmodelPackage.CONTACT__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case DeploymentmodelPackage.CONTACT__URL:
				setUrl(URL_EDEFAULT);
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
			case DeploymentmodelPackage.CONTACT__CONTACT_NAME:
				return CONTACT_NAME_EDEFAULT == null ? contactName != null : !CONTACT_NAME_EDEFAULT.equals(contactName);
			case DeploymentmodelPackage.CONTACT__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case DeploymentmodelPackage.CONTACT__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (contactName: ");
		result.append(contactName);
		result.append(", email: ");
		result.append(email);
		result.append(", url: ");
		result.append(url);
		result.append(')');
		return result.toString();
	}

} //ContactImpl
