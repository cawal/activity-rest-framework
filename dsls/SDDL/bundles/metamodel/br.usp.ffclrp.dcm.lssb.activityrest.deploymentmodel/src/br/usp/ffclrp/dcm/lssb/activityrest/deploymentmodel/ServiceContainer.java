/**
 */
package br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel;

import java.net.URL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.ServiceContainer#getName <em>Name</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.ServiceContainer#getDescription <em>Description</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.ServiceContainer#getBaseUrl <em>Base Url</em>}</li>
 * </ul>
 *
 * @see br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.DeploymentModelPackage#getServiceContainer()
 * @model
 * @generated
 */
public interface ServiceContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.DeploymentModelPackage#getServiceContainer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.ServiceContainer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.DeploymentModelPackage#getServiceContainer_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.ServiceContainer#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Base Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Url</em>' attribute.
	 * @see #setBaseUrl(URL)
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.DeploymentModelPackage#getServiceContainer_BaseUrl()
	 * @model dataType="br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.URL" required="true"
	 * @generated
	 */
	URL getBaseUrl();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.ServiceContainer#getBaseUrl <em>Base Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Url</em>' attribute.
	 * @see #getBaseUrl()
	 * @generated
	 */
	void setBaseUrl(URL value);

} // ServiceContainer
