/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl;

import br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.StringListManipulatorsPackage;
import br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.ToFlag;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Flag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.ToFlagImpl#getIfTrue <em>If True</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl.ToFlagImpl#getIfFalse <em>If False</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToFlagImpl extends StringListManipulatorImpl implements ToFlag {
	/**
	 * The default value of the '{@link #getIfTrue() <em>If True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfTrue()
	 * @generated
	 * @ordered
	 */
	protected static final String IF_TRUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIfTrue() <em>If True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfTrue()
	 * @generated
	 * @ordered
	 */
	protected String ifTrue = IF_TRUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIfFalse() <em>If False</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfFalse()
	 * @generated
	 * @ordered
	 */
	protected static final String IF_FALSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIfFalse() <em>If False</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfFalse()
	 * @generated
	 * @ordered
	 */
	protected String ifFalse = IF_FALSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToFlagImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StringListManipulatorsPackage.Literals.TO_FLAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIfTrue() {
		return ifTrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIfTrue(String newIfTrue) {
		String oldIfTrue = ifTrue;
		ifTrue = newIfTrue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StringListManipulatorsPackage.TO_FLAG__IF_TRUE, oldIfTrue, ifTrue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIfFalse() {
		return ifFalse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIfFalse(String newIfFalse) {
		String oldIfFalse = ifFalse;
		ifFalse = newIfFalse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StringListManipulatorsPackage.TO_FLAG__IF_FALSE, oldIfFalse, ifFalse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StringListManipulatorsPackage.TO_FLAG__IF_TRUE:
				return getIfTrue();
			case StringListManipulatorsPackage.TO_FLAG__IF_FALSE:
				return getIfFalse();
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
			case StringListManipulatorsPackage.TO_FLAG__IF_TRUE:
				setIfTrue((String)newValue);
				return;
			case StringListManipulatorsPackage.TO_FLAG__IF_FALSE:
				setIfFalse((String)newValue);
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
			case StringListManipulatorsPackage.TO_FLAG__IF_TRUE:
				setIfTrue(IF_TRUE_EDEFAULT);
				return;
			case StringListManipulatorsPackage.TO_FLAG__IF_FALSE:
				setIfFalse(IF_FALSE_EDEFAULT);
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
			case StringListManipulatorsPackage.TO_FLAG__IF_TRUE:
				return IF_TRUE_EDEFAULT == null ? ifTrue != null : !IF_TRUE_EDEFAULT.equals(ifTrue);
			case StringListManipulatorsPackage.TO_FLAG__IF_FALSE:
				return IF_FALSE_EDEFAULT == null ? ifFalse != null : !IF_FALSE_EDEFAULT.equals(ifFalse);
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
		result.append(" (ifTrue: ");
		result.append(ifTrue);
		result.append(", ifFalse: ");
		result.append(ifFalse);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public EList<String> transform(EList<String> stringList) {
		
		Function<? super String, ? extends String> toFlags = s -> {
			return (s.equalsIgnoreCase("true"))? getIfTrue(): getIfFalse();
		};
		
		Predicate<? super String> notNull = s -> { 
			return s!=null && (s.equalsIgnoreCase(""));
		};
		
		EList<String> newList = new BasicEList<String>();
		
		newList.addAll( stringList.stream().map(toFlags)
			.filter(notNull)
			.collect(Collectors.toList()));
		
		return newList;
	}

} //ToFlagImpl
