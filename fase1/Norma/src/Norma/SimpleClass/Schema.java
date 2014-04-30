/**
 */
package Norma.SimpleClass;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Norma.SimpleClass.Schema#getClases <em>Clases</em>}</li>
 *   <li>{@link Norma.SimpleClass.Schema#getRelaciones <em>Relaciones</em>}</li>
 *   <li>{@link Norma.SimpleClass.Schema#getDatos <em>Datos</em>}</li>
 * </ul>
 * </p>
 *
 * @see Norma.SimpleClass.SimpleClassPackage#getSchema()
 * @model
 * @generated
 */
public interface Schema extends Classifier {
	/**
	 * Returns the value of the '<em><b>Clases</b></em>' containment reference list.
	 * The list contents are of type {@link Norma.SimpleClass.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clases</em>' containment reference list.
	 * @see Norma.SimpleClass.SimpleClassPackage#getSchema_Clases()
	 * @model containment="true"
	 * @generated
	 */
	EList<Norma.SimpleClass.Class> getClases();

	/**
	 * Returns the value of the '<em><b>Relaciones</b></em>' containment reference list.
	 * The list contents are of type {@link Norma.SimpleClass.Association}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relaciones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relaciones</em>' containment reference list.
	 * @see Norma.SimpleClass.SimpleClassPackage#getSchema_Relaciones()
	 * @model containment="true"
	 * @generated
	 */
	EList<Association> getRelaciones();

	/**
	 * Returns the value of the '<em><b>Datos</b></em>' containment reference list.
	 * The list contents are of type {@link Norma.SimpleClass.PrimitiveDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datos</em>' containment reference list.
	 * @see Norma.SimpleClass.SimpleClassPackage#getSchema_Datos()
	 * @model containment="true"
	 * @generated
	 */
	EList<PrimitiveDataType> getDatos();

} // Schema
