/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineEntryList;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineTool;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ExitCode;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.InputDataset;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.OutputDataset;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command Line Tool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.CommandLineToolImpl#getCommandLineTemplate <em>Command Line Template</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.CommandLineToolImpl#getStandardInputStream <em>Standard Input Stream</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.CommandLineToolImpl#getStandardOutputStream <em>Standard Output Stream</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.CommandLineToolImpl#getStandardErrorStream <em>Standard Error Stream</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.CommandLineToolImpl#getExitCodes <em>Exit Codes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommandLineToolImpl extends FunctionalEntityImpl implements CommandLineTool {
	/**
	 * The cached value of the '{@link #getCommandLineTemplate() <em>Command Line Template</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandLineTemplate()
	 * @generated
	 * @ordered
	 */
	protected EList<CommandLineEntryList> commandLineTemplate;

	/**
	 * The cached value of the '{@link #getStandardInputStream() <em>Standard Input Stream</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardInputStream()
	 * @generated
	 * @ordered
	 */
	protected InputDataset standardInputStream;

	/**
	 * The cached value of the '{@link #getStandardOutputStream() <em>Standard Output Stream</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardOutputStream()
	 * @generated
	 * @ordered
	 */
	protected OutputDataset standardOutputStream;

	/**
	 * The cached value of the '{@link #getStandardErrorStream() <em>Standard Error Stream</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardErrorStream()
	 * @generated
	 * @ordered
	 */
	protected OutputDataset standardErrorStream;

	/**
	 * The cached value of the '{@link #getExitCodes() <em>Exit Codes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<ExitCode> exitCodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandLineToolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisActivityDescriptionPackage.Literals.COMMAND_LINE_TOOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommandLineEntryList> getCommandLineTemplate() {
		if (commandLineTemplate == null) {
			commandLineTemplate = new EObjectContainmentEList<CommandLineEntryList>(CommandLineEntryList.class, this, AnalysisActivityDescriptionPackage.COMMAND_LINE_TOOL__COMMAND_LINE_TEMPLATE);
		}
		return commandLineTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputDataset getStandardInputStream() {
		if (standardInputStream != null && standardInputStream.eIsProxy()) {
			InternalEObject oldStandardInputStream = (InternalEObject)standardInputStream;
			standardInputStream = (InputDataset)eResolveProxy(oldStandardInputStream);
			if (standardInputStream != oldStandardInputStream) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysisActivityDescriptionPackage.COMMAND_LINE_TOOL__STANDARD_INPUT_STREAM, oldStandardInputStream, standardInputStream));
			}
		}
		return standardInputStream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputDataset basicGetStandardInputStream() {
		return standardInputStream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStandardInputStream(InputDataset newStandardInputStream) {
		InputDataset oldStandardInputStream = standardInputStream;
		standardInputStream = newStandardInputStream;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisActivityDescriptionPackage.COMMAND_LINE_TOOL__STANDARD_INPUT_STREAM, oldStandardInputStream, standardInputStream));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputDataset getStandardOutputStream() {
		if (standardOutputStream != null && standardOutputStream.eIsProxy()) {
			InternalEObject oldStandardOutputStream = (InternalEObject)standardOutputStream;
			standardOutputStream = (OutputDataset)eResolveProxy(oldStandardOutputStream);
			if (standardOutputStream != oldStandardOutputStream) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysisActivityDescriptionPackage.COMMAND_LINE_TOOL__STANDARD_OUTPUT_STREAM, oldStandardOutputStream, standardOutputStream));
			}
		}
		return standardOutputStream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputDataset basicGetStandardOutputStream() {
		return standardOutputStream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStandardOutputStream(OutputDataset newStandardOutputStream) {
		OutputDataset oldStandardOutputStream = standardOutputStream;
		standardOutputStream = newStandardOutputStream;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisActivityDescriptionPackage.COMMAND_LINE_TOOL__STANDARD_OUTPUT_STREAM, oldStandardOutputStream, standardOutputStream));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputDataset getStandardErrorStream() {
		if (standardErrorStream != null && standardErrorStream.eIsProxy()) {
			InternalEObject oldStandardErrorStream = (InternalEObject)standardErrorStream;
			standardErrorStream = (OutputDataset)eResolveProxy(oldStandardErrorStream);
			if (standardErrorStream != oldStandardErrorStream) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysisActivityDescriptionPackage.COMMAND_LINE_TOOL__STANDARD_ERROR_STREAM, oldStandardErrorStream, standardErrorStream));
			}
		}
		return standardErrorStream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputDataset basicGetStandardErrorStream() {
		return standardErrorStream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStandardErrorStream(OutputDataset newStandardErrorStream) {
		OutputDataset oldStandardErrorStream = standardErrorStream;
		standardErrorStream = newStandardErrorStream;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisActivityDescriptionPackage.COMMAND_LINE_TOOL__STANDARD_ERROR_STREAM, oldStandardErrorStream, standardErrorStream));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExitCode> getExitCodes() {
		if (exitCodes == null) {
			exitCodes = new EObjectContainmentEList<ExitCode>(ExitCode.class, this, AnalysisActivityDescriptionPackage.COMMAND_LINE_TOOL__EXIT_CODES);
		}
		return exitCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnalysisActivityDescriptionPackage.COMMAND_LINE_TOOL__COMMAND_LINE_TEMPLATE:
				return ((InternalEList<?>)getCommandLineTemplate()).basicRemove(otherEnd, msgs);
			case AnalysisActivityDescriptionPackage.COMMAND_LINE_TOOL__EXIT_CODES:
				return ((InternalEList<?>)getExitCodes()).basicRemove(otherEnd, msgs);
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
			case AnalysisActivityDescriptionPackage.COMMAND_LINE_TOOL__COMMAND_LINE_TEMPLATE:
				return getCommandLineTemplate();
			case AnalysisActivityDescriptionPackage.COMMAND_LINE_TOOL__STANDARD_INPUT_STREAM:
				if (resolve) return getStandardInputStream();
				return basicGetStandardInputStream();
			case AnalysisActivityDescriptionPackage.COMMAND_LINE_TOOL__STANDARD_OUTPUT_STREAM:
				if (resolve) return getStandardOutputStream();
				return basicGetStandardOutputStream();
			case AnalysisActivityDescriptionPackage.COMMAND_LINE_TOOL__STANDARD_ERROR_STREAM:
				if (resolve) return getStandardErrorStream();
				return basicGetStandardErrorStream();
			case AnalysisActivityDescriptionPackage.COMMAND_LINE_TOOL__EXIT_CODES:
				return getExitCodes();
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
			case AnalysisActivityDescriptionPackage.COMMAND_LINE_TOOL__COMMAND_LINE_TEMPLATE:
				getCommandLineTemplate().clear();
				getCommandLineTemplate().addAll((Collection<? extends CommandLineEntryList>)newValue);
				return;
			case AnalysisActivityDescriptionPackage.COMMAND_LINE_TOOL__STANDARD_INPUT_STREAM:
				setStandardInputStream((InputDataset)newValue);
				return;
			case AnalysisActivityDescriptionPackage.COMMAND_LINE_TOOL__STANDARD_OUTPUT_STREAM:
				setStandardOutputStream((OutputDataset)newValue);
				return;
			case AnalysisActivityDescriptionPackage.COMMAND_LINE_TOOL__STANDARD_ERROR_STREAM:
				setStandardErrorStream((OutputDataset)newValue);
				return;
			case AnalysisActivityDescriptionPackage.COMMAND_LINE_TOOL__EXIT_CODES:
				getExitCodes().clear();
				getExitCodes().addAll((Collection<? extends ExitCode>)newValue);
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
			case AnalysisActivityDescriptionPackage.COMMAND_LINE_TOOL__COMMAND_LINE_TEMPLATE:
				getCommandLineTemplate().clear();
				return;
			case AnalysisActivityDescriptionPackage.COMMAND_LINE_TOOL__STANDARD_INPUT_STREAM:
				setStandardInputStream((InputDataset)null);
				return;
			case AnalysisActivityDescriptionPackage.COMMAND_LINE_TOOL__STANDARD_OUTPUT_STREAM:
				setStandardOutputStream((OutputDataset)null);
				return;
			case AnalysisActivityDescriptionPackage.COMMAND_LINE_TOOL__STANDARD_ERROR_STREAM:
				setStandardErrorStream((OutputDataset)null);
				return;
			case AnalysisActivityDescriptionPackage.COMMAND_LINE_TOOL__EXIT_CODES:
				getExitCodes().clear();
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
			case AnalysisActivityDescriptionPackage.COMMAND_LINE_TOOL__COMMAND_LINE_TEMPLATE:
				return commandLineTemplate != null && !commandLineTemplate.isEmpty();
			case AnalysisActivityDescriptionPackage.COMMAND_LINE_TOOL__STANDARD_INPUT_STREAM:
				return standardInputStream != null;
			case AnalysisActivityDescriptionPackage.COMMAND_LINE_TOOL__STANDARD_OUTPUT_STREAM:
				return standardOutputStream != null;
			case AnalysisActivityDescriptionPackage.COMMAND_LINE_TOOL__STANDARD_ERROR_STREAM:
				return standardErrorStream != null;
			case AnalysisActivityDescriptionPackage.COMMAND_LINE_TOOL__EXIT_CODES:
				return exitCodes != null && !exitCodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CommandLineToolImpl
