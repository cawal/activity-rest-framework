/**
 */
package br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel;

import java.net.URL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.Contact#getName <em>Name</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.Contact#getEmail <em>Email</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.Contact#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @see br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.DeploymentModelPackage#getContact()
 * @model
 * @generated
 */
public interface Contact extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.DeploymentModelPackage#getContact_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.Contact#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.DeploymentModelPackage#getContact_Email()
	 * @model required="true"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.Contact#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(URL)
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.DeploymentModelPackage#getContact_Url()
	 * @model dataType="br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.URL"
	 * @generated
	 */
	URL getUrl();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.Contact#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(URL value);

} // Contact
