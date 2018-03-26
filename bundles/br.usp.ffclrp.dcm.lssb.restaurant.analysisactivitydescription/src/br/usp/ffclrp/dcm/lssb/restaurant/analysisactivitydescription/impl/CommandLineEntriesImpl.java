/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineEntries;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command Line Entries</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.CommandLineEntriesImpl#getManipulators <em>Manipulators</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CommandLineEntriesImpl extends MinimalEObjectImpl.Container implements CommandLineEntries {
	/**
	 * The cached value of the '{@link #getManipulators() <em>Manipulators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManipulators()
	 * @generated
	 * @ordered
	 */
	protected EList<br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.StringListManipulator> manipulators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandLineEntriesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisActivityDescriptionPackage.Literals.COMMAND_LINE_ENTRIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.StringListManipulator> getManipulators() {
		if (manipulators == null) {
			manipulators = new EObjectContainmentEList<br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.StringListManipulator>(br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.StringListManipulator.class, this, AnalysisActivityDescriptionPackage.COMMAND_LINE_ENTRIES__MANIPULATORS);
		}
		return manipulators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnalysisActivityDescriptionPackage.COMMAND_LINE_ENTRIES__MANIPULATORS:
				return ((InternalEList<?>)getManipulators()).basicRemove(otherEnd, msgs);
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
			case AnalysisActivityDescriptionPackage.COMMAND_LINE_ENTRIES__MANIPULATORS:
				return getManipulators();
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
			case AnalysisActivityDescriptionPackage.COMMAND_LINE_ENTRIES__MANIPULATORS:
				getManipulators().clear();
				getManipulators().addAll((Collection<? extends br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.StringListManipulator>)newValue);
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
			case AnalysisActivityDescriptionPackage.COMMAND_LINE_ENTRIES__MANIPULATORS:
				getManipulators().clear();
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
			case AnalysisActivityDescriptionPackage.COMMAND_LINE_ENTRIES__MANIPULATORS:
				return manipulators != null && !manipulators.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CommandLineEntriesImpl
