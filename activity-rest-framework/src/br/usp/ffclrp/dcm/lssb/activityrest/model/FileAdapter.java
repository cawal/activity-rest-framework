/**
 */
package br.usp.ffclrp.dcm.lssb.activityrest.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.activityrest.model.FileAdapter#getName <em>Name</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.activityrest.model.FileAdapter#getContent <em>Content</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.activityrest.model.FileAdapter#getContentType <em>Content Type</em>}</li>
 * </ul>
 *
 * @see br.usp.ffclrp.dcm.lssb.activityrest.model.ActivityPackage#getFileAdapter()
 * @model
 * @generated
 */
public interface FileAdapter extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.model.ActivityPackage#getFileAdapter_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.activityrest.model.FileAdapter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(Object)
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.model.ActivityPackage#getFileAdapter_Content()
	 * @model dataType="br.usp.ffclrp.dcm.lssb.activityrest.model.Object" required="true"
	 * @generated
	 */
	Object getContent();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.activityrest.model.FileAdapter#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(Object value);

	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type</em>' attribute.
	 * @see #setContentType(String)
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.model.ActivityPackage#getFileAdapter_ContentType()
	 * @model
	 * @generated
	 */
	String getContentType();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.activityrest.model.FileAdapter#getContentType <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' attribute.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(String value);

} // FileAdapter
