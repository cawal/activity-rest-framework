/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineEntryList;

import br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.StringListManipulator;

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
 * An implementation of the model object '<em><b>Command Line Entry List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.CommandLineEntryListImpl#getManipulators <em>Manipulators</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CommandLineEntryListImpl extends MinimalEObjectImpl.Container implements CommandLineEntryList {
	/**
	 * The cached value of the '{@link #getManipulators() <em>Manipulators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManipulators()
	 * @generated
	 * @ordered
	 */
	protected EList<StringListManipulator> manipulators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandLineEntryListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisActivityDescriptionPackage.Literals.COMMAND_LINE_ENTRY_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StringListManipulator> getManipulators() {
		if (manipulators == null) {
			manipulators = new EObjectContainmentEList<StringListManipulator>(StringListManipulator.class, this, AnalysisActivityDescriptionPackage.COMMAND_LINE_ENTRY_LIST__MANIPULATORS);
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
			case AnalysisActivityDescriptionPackage.COMMAND_LINE_ENTRY_LIST__MANIPULATORS:
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
			case AnalysisActivityDescriptionPackage.COMMAND_LINE_ENTRY_LIST__MANIPULATORS:
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
			case AnalysisActivityDescriptionPackage.COMMAND_LINE_ENTRY_LIST__MANIPULATORS:
				getManipulators().clear();
				getManipulators().addAll((Collection<? extends StringListManipulator>)newValue);
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
			case AnalysisActivityDescriptionPackage.COMMAND_LINE_ENTRY_LIST__MANIPULATORS:
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
			case AnalysisActivityDescriptionPackage.COMMAND_LINE_ENTRY_LIST__MANIPULATORS:
				return manipulators != null && !manipulators.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CommandLineEntryListImpl
