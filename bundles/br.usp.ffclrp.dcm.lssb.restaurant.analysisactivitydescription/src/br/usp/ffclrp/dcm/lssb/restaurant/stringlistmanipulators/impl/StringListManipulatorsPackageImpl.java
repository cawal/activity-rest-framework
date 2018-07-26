/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.impl;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.AnalysisActivityDescriptionPackageImpl;
import br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.AppendEach;
import br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.AppendListWith;
import br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.Join;
import br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.PrependEach;
import br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.PrependListWith;
import br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.StringListManipulator;
import br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.StringListManipulatorsFactory;
import br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.StringListManipulatorsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StringListManipulatorsPackageImpl extends EPackageImpl implements StringListManipulatorsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringListManipulatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prependEachEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appendEachEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appendListWithEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prependListWithEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.StringListManipulatorsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StringListManipulatorsPackageImpl() {
		super(eNS_URI, StringListManipulatorsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link StringListManipulatorsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StringListManipulatorsPackage init() {
		if (isInited) return (StringListManipulatorsPackage)EPackage.Registry.INSTANCE.getEPackage(StringListManipulatorsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStringListManipulatorsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StringListManipulatorsPackageImpl theStringListManipulatorsPackage = registeredStringListManipulatorsPackage instanceof StringListManipulatorsPackageImpl ? (StringListManipulatorsPackageImpl)registeredStringListManipulatorsPackage : new StringListManipulatorsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AnalysisActivityDescriptionPackage.eNS_URI);
		AnalysisActivityDescriptionPackageImpl theAnalysisActivityDescriptionPackage = (AnalysisActivityDescriptionPackageImpl)(registeredPackage instanceof AnalysisActivityDescriptionPackageImpl ? registeredPackage : AnalysisActivityDescriptionPackage.eINSTANCE);

		// Create package meta-data objects
		theStringListManipulatorsPackage.createPackageContents();
		theAnalysisActivityDescriptionPackage.createPackageContents();

		// Initialize created meta-data
		theStringListManipulatorsPackage.initializePackageContents();
		theAnalysisActivityDescriptionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStringListManipulatorsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StringListManipulatorsPackage.eNS_URI, theStringListManipulatorsPackage);
		return theStringListManipulatorsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringListManipulator() {
		return stringListManipulatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStringListManipulator__Transform__EList() {
		return stringListManipulatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoin() {
		return joinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoin_Delimiter() {
		return (EAttribute)joinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrependEach() {
		return prependEachEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrependEach_Value() {
		return (EAttribute)prependEachEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppendEach() {
		return appendEachEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppendEach_Value() {
		return (EAttribute)appendEachEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppendListWith() {
		return appendListWithEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppendListWith_Value() {
		return (EAttribute)appendListWithEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrependListWith() {
		return prependListWithEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrependListWith_Value() {
		return (EAttribute)prependListWithEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringListManipulatorsFactory getStringListManipulatorsFactory() {
		return (StringListManipulatorsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		stringListManipulatorEClass = createEClass(STRING_LIST_MANIPULATOR);
		createEOperation(stringListManipulatorEClass, STRING_LIST_MANIPULATOR___TRANSFORM__ELIST);

		joinEClass = createEClass(JOIN);
		createEAttribute(joinEClass, JOIN__DELIMITER);

		prependEachEClass = createEClass(PREPEND_EACH);
		createEAttribute(prependEachEClass, PREPEND_EACH__VALUE);

		appendEachEClass = createEClass(APPEND_EACH);
		createEAttribute(appendEachEClass, APPEND_EACH__VALUE);

		appendListWithEClass = createEClass(APPEND_LIST_WITH);
		createEAttribute(appendListWithEClass, APPEND_LIST_WITH__VALUE);

		prependListWithEClass = createEClass(PREPEND_LIST_WITH);
		createEAttribute(prependListWithEClass, PREPEND_LIST_WITH__VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		joinEClass.getESuperTypes().add(this.getStringListManipulator());
		prependEachEClass.getESuperTypes().add(this.getStringListManipulator());
		appendEachEClass.getESuperTypes().add(this.getStringListManipulator());
		appendListWithEClass.getESuperTypes().add(this.getStringListManipulator());
		prependListWithEClass.getESuperTypes().add(this.getStringListManipulator());

		// Initialize classes, features, and operations; add parameters
		initEClass(stringListManipulatorEClass, StringListManipulator.class, "StringListManipulator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getStringListManipulator__Transform__EList(), ecorePackage.getEString(), "transform", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "stringList", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(joinEClass, Join.class, "Join", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJoin_Delimiter(), ecorePackage.getEString(), "delimiter", null, 1, 1, Join.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prependEachEClass, PrependEach.class, "PrependEach", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrependEach_Value(), ecorePackage.getEString(), "value", null, 1, 1, PrependEach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appendEachEClass, AppendEach.class, "AppendEach", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAppendEach_Value(), ecorePackage.getEString(), "value", null, 1, 1, AppendEach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appendListWithEClass, AppendListWith.class, "AppendListWith", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAppendListWith_Value(), ecorePackage.getEString(), "value", null, 1, 1, AppendListWith.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prependListWithEClass, PrependListWith.class, "PrependListWith", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrependListWith_Value(), ecorePackage.getEString(), "value", null, 1, 1, PrependListWith.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Collection
		createCollectionAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Collection</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCollectionAnnotations() {
		String source = "http://www.eclipse.org/OCL/Collection";
		addAnnotation
		  (getStringListManipulator__Transform__EList(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  ((getStringListManipulator__Transform__EList()).getEParameters().get(0),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
	}

} //StringListManipulatorsPackageImpl
