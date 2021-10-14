/**
 */
package br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.Deployment#getService <em>Service</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.Deployment#getContainer <em>Container</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.Deployment#getContactInformation <em>Contact Information</em>}</li>
 * </ul>
 *
 * @see br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.DeploymentModelPackage#getDeployment()
 * @model
 * @generated
 */
public interface Deployment extends EObject {
	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' containment reference.
	 * @see #setService(Service)
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.DeploymentModelPackage#getDeployment_Service()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Service getService();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.Deployment#getService <em>Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' containment reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(Service value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' containment reference.
	 * @see #setContainer(ServiceContainer)
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.DeploymentModelPackage#getDeployment_Container()
	 * @model containment="true"
	 * @generated
	 */
	ServiceContainer getContainer();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.Deployment#getContainer <em>Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' containment reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(ServiceContainer value);

	/**
	 * Returns the value of the '<em><b>Contact Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Information</em>' containment reference.
	 * @see #setContactInformation(Contact)
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.DeploymentModelPackage#getDeployment_ContactInformation()
	 * @model containment="true"
	 * @generated
	 */
	Contact getContactInformation();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.Deployment#getContactInformation <em>Contact Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Information</em>' containment reference.
	 * @see #getContactInformation()
	 * @generated
	 */
	void setContactInformation(Contact value);

} // Deployment
