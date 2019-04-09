/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exit Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ExitCode#getCode <em>Code</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ExitCode#getReportMessage <em>Report Message</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ExitCode#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getExitCode()
 * @model
 * @generated
 */
public interface ExitCode extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(BigInteger)
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getExitCode_Code()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getCode();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ExitCode#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Report Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Report Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Report Message</em>' attribute.
	 * @see #setReportMessage(String)
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getExitCode_ReportMessage()
	 * @model
	 * @generated
	 */
	String getReportMessage();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ExitCode#getReportMessage <em>Report Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report Message</em>' attribute.
	 * @see #getReportMessage()
	 * @generated
	 */
	void setReportMessage(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.TerminationStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.TerminationStatus
	 * @see #setStatus(TerminationStatus)
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getExitCode_Status()
	 * @model required="true"
	 * @generated
	 */
	TerminationStatus getStatus();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ExitCode#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.TerminationStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(TerminationStatus value);

} // ExitCode
