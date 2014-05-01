/**
 */
package PT.impl;

import PT.PTFactory;
import PT.PTPackage;

import RDBMS.RDBMSPackage;

import RDBMS.impl.RDBMSPackageImpl;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PTPackageImpl extends EPackageImpl implements PTPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringEDataType = null;

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
	 * @see PT.PTPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PTPackageImpl() {
		super(eNS_URI, PTFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PTPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PTPackage init() {
		if (isInited) return (PTPackage)EPackage.Registry.INSTANCE.getEPackage(PTPackage.eNS_URI);

		// Obtain or create and register package
		PTPackageImpl thePTPackage = (PTPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PTPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PTPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		RDBMSPackageImpl theRDBMSPackage = (RDBMSPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RDBMSPackage.eNS_URI) instanceof RDBMSPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RDBMSPackage.eNS_URI) : RDBMSPackage.eINSTANCE);

		// Create package meta-data objects
		thePTPackage.createPackageContents();
		theRDBMSPackage.createPackageContents();

		// Initialize created meta-data
		thePTPackage.initializePackageContents();
		theRDBMSPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePTPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PTPackage.eNS_URI, thePTPackage);
		return thePTPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getString() {
		return stringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTFactory getPTFactory() {
		return (PTFactory)getEFactoryInstance();
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
		stringEDataType = createEDataType(STRING);
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
		initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //PTPackageImpl
