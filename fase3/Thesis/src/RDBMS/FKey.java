/**
 */
package RDBMS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FKey</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link RDBMS.FKey#getReferences <em>References</em>}</li>
 *   <li>{@link RDBMS.FKey#getCols <em>Cols</em>}</li>
 * </ul>
 * </p>
 *
 * @see RDBMS.RDBMSPackage#getFKey()
 * @model
 * @generated
 */
public interface FKey extends EObject {
	/**
	 * Returns the value of the '<em><b>References</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' reference.
	 * @see #setReferences(Table)
	 * @see RDBMS.RDBMSPackage#getFKey_References()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Table getReferences();

	/**
	 * Sets the value of the '{@link RDBMS.FKey#getReferences <em>References</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>References</em>' reference.
	 * @see #getReferences()
	 * @generated
	 */
	void setReferences(Table value);

	/**
	 * Returns the value of the '<em><b>Cols</b></em>' reference list.
	 * The list contents are of type {@link RDBMS.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cols</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cols</em>' reference list.
	 * @see RDBMS.RDBMSPackage#getFKey_Cols()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Column> getCols();

} // FKey
