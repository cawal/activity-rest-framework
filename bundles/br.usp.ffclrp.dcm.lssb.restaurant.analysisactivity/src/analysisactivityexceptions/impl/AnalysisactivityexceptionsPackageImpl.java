/**
 */
package analysisactivityexceptions.impl;

import analysisactivityexceptions.AnalysisactivityexceptionsFactory;
import analysisactivityexceptions.AnalysisactivityexceptionsPackage;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivityModelPackage;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.exceptions.ParameterUpdateException;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.impl.AnalysisActivityModelPackageImpl;

import br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.StringListManipulatorsPackage;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnalysisactivityexceptionsPackageImpl extends EPackageImpl implements AnalysisactivityexceptionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType parameterUpdateExceptionEDataType = null;

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
	 * @see analysisactivityexceptions.AnalysisactivityexceptionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AnalysisactivityexceptionsPackageImpl() {
		super(eNS_URI, AnalysisactivityexceptionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AnalysisactivityexceptionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AnalysisactivityexceptionsPackage init() {
		if (isInited) return (AnalysisactivityexceptionsPackage)EPackage.Registry.INSTANCE.getEPackage(AnalysisactivityexceptionsPackage.eNS_URI);

		// Obtain or create and register package
		AnalysisactivityexceptionsPackageImpl theAnalysisactivityexceptionsPackage = (AnalysisactivityexceptionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AnalysisactivityexceptionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AnalysisactivityexceptionsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		AnalysisActivityDescriptionPackage.eINSTANCE.eClass();
		StringListManipulatorsPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		AnalysisActivityModelPackageImpl theAnalysisActivityModelPackage = (AnalysisActivityModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AnalysisActivityModelPackage.eNS_URI) instanceof AnalysisActivityModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AnalysisActivityModelPackage.eNS_URI) : AnalysisActivityModelPackage.eINSTANCE);

		// Create package meta-data objects
		theAnalysisactivityexceptionsPackage.createPackageContents();
		theAnalysisActivityModelPackage.createPackageContents();

		// Initialize created meta-data
		theAnalysisactivityexceptionsPackage.initializePackageContents();
		theAnalysisActivityModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAnalysisactivityexceptionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AnalysisactivityexceptionsPackage.eNS_URI, theAnalysisactivityexceptionsPackage);
		return theAnalysisactivityexceptionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getParameterUpdateException() {
		return parameterUpdateExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisactivityexceptionsFactory getAnalysisactivityexceptionsFactory() {
		return (AnalysisactivityexceptionsFactory)getEFactoryInstance();
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

		// Create data types
		parameterUpdateExceptionEDataType = createEDataType(PARAMETER_UPDATE_EXCEPTION);
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

		// Initialize data types
		initEDataType(parameterUpdateExceptionEDataType, ParameterUpdateException.class, "ParameterUpdateException", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //AnalysisactivityexceptionsPackageImpl
