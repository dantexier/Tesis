/**
 */
package Norma.SimpleClass;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Norma.SimpleClass.Association#getName <em>Name</em>}</li>
 *   <li>{@link Norma.SimpleClass.Association#getSrc <em>Src</em>}</li>
 *   <li>{@link Norma.SimpleClass.Association#getDest <em>Dest</em>}</li>
 * </ul>
 * </p>
 *
 * @see Norma.SimpleClass.SimpleClassPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends EObject {
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
	 * @see Norma.SimpleClass.SimpleClassPackage#getAssociation_Name()
	 * @model dataType="Norma.PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Norma.SimpleClass.Association#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' reference.
	 * @see #setSrc(Norma.SimpleClass.Class)
	 * @see Norma.SimpleClass.SimpleClassPackage#getAssociation_Src()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Norma.SimpleClass.Class getSrc();

	/**
	 * Sets the value of the '{@link Norma.SimpleClass.Association#getSrc <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(Norma.SimpleClass.Class value);

	/**
	 * Returns the value of the '<em><b>Dest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest</em>' reference.
	 * @see #setDest(Norma.SimpleClass.Class)
	 * @see Norma.SimpleClass.SimpleClassPackage#getAssociation_Dest()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Norma.SimpleClass.Class getDest();

	/**
	 * Sets the value of the '{@link Norma.SimpleClass.Association#getDest <em>Dest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest</em>' reference.
	 * @see #getDest()
	 * @generated
	 */
	void setDest(Norma.SimpleClass.Class value);

} // Association
