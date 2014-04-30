/**
 */
package Norma.SimpleClass.tests;

import Norma.SimpleClass.PrimitiveDataType;
import Norma.SimpleClass.SimpleClassFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Primitive Data Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrimitiveDataTypeTest extends ClassifierTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PrimitiveDataTypeTest.class);
	}

	/**
	 * Constructs a new Primitive Data Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveDataTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Primitive Data Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PrimitiveDataType getFixture() {
		return (PrimitiveDataType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SimpleClassFactory.eINSTANCE.createPrimitiveDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //PrimitiveDataTypeTest
