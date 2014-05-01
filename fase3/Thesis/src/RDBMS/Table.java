/**
 */
package RDBMS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link RDBMS.Table#getName <em>Name</em>}</li>
 *   <li>{@link RDBMS.Table#getFkeys <em>Fkeys</em>}</li>
 *   <li>{@link RDBMS.Table#getPkey <em>Pkey</em>}</li>
 *   <li>{@link RDBMS.Table#getCols <em>Cols</em>}</li>
 *   <li>{@link RDBMS.Table#getTipo <em>Tipo</em>}</li>
 * </ul>
 * </p>
 *
 * @see RDBMS.RDBMSPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject {
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
	 * @see RDBMS.RDBMSPackage#getTable_Name()
	 * @model dataType="PT.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link RDBMS.Table#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Fkeys</b></em>' containment reference list.
	 * The list contents are of type {@link RDBMS.FKey}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fkeys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fkeys</em>' containment reference list.
	 * @see RDBMS.RDBMSPackage#getTable_Fkeys()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<FKey> getFkeys();

	/**
	 * Returns the value of the '<em><b>Pkey</b></em>' reference list.
	 * The list contents are of type {@link RDBMS.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pkey</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pkey</em>' reference list.
	 * @see RDBMS.RDBMSPackage#getTable_Pkey()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Column> getPkey();

	/**
	 * Returns the value of the '<em><b>Cols</b></em>' containment reference list.
	 * The list contents are of type {@link RDBMS.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cols</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cols</em>' containment reference list.
	 * @see RDBMS.RDBMSPackage#getTable_Cols()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Column> getCols();

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see #setTipo(String)
	 * @see RDBMS.RDBMSPackage#getTable_Tipo()
	 * @model dataType="PT.String"
	 * @generated
	 */
	String getTipo();

	/**
	 * Sets the value of the '{@link RDBMS.Table#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(String value);

} // Table
