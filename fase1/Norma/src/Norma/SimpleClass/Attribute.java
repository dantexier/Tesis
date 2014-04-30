/**
 */
package Norma.SimpleClass;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Norma.SimpleClass.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link Norma.SimpleClass.Attribute#getIs_primary <em>Is primary</em>}</li>
 *   <li>{@link Norma.SimpleClass.Attribute#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see Norma.SimpleClass.SimpleClassPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
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
	 * @see Norma.SimpleClass.SimpleClassPackage#getAttribute_Name()
	 * @model dataType="Norma.PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Norma.SimpleClass.Attribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is primary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is primary</em>' attribute.
	 * @see #setIs_primary(Boolean)
	 * @see Norma.SimpleClass.SimpleClassPackage#getAttribute_Is_primary()
	 * @model dataType="Norma.PrimitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIs_primary();

	/**
	 * Sets the value of the '{@link Norma.SimpleClass.Attribute#getIs_primary <em>Is primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is primary</em>' attribute.
	 * @see #getIs_primary()
	 * @generated
	 */
	void setIs_primary(Boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Classifier)
	 * @see Norma.SimpleClass.SimpleClassPackage#getAttribute_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Classifier getType();

	/**
	 * Sets the value of the '{@link Norma.SimpleClass.Attribute#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Classifier value);

} // Attribute
