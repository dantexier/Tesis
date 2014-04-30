/**
 */
package Norma.SimpleClass.impl;

import Norma.SimpleClass.Association;
import Norma.SimpleClass.PrimitiveDataType;
import Norma.SimpleClass.Schema;
import Norma.SimpleClass.SimpleClassPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Norma.SimpleClass.impl.SchemaImpl#getClases <em>Clases</em>}</li>
 *   <li>{@link Norma.SimpleClass.impl.SchemaImpl#getRelaciones <em>Relaciones</em>}</li>
 *   <li>{@link Norma.SimpleClass.impl.SchemaImpl#getDatos <em>Datos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchemaImpl extends ClassifierImpl implements Schema {
	/**
	 * The cached value of the '{@link #getClases() <em>Clases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClases()
	 * @generated
	 * @ordered
	 */
	protected EList<Norma.SimpleClass.Class> clases;

	/**
	 * The cached value of the '{@link #getRelaciones() <em>Relaciones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelaciones()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> relaciones;

	/**
	 * The cached value of the '{@link #getDatos() <em>Datos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatos()
	 * @generated
	 * @ordered
	 */
	protected EList<PrimitiveDataType> datos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleClassPackage.Literals.SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Norma.SimpleClass.Class> getClases() {
		if (clases == null) {
			clases = new EObjectContainmentEList<Norma.SimpleClass.Class>(Norma.SimpleClass.Class.class, this, SimpleClassPackage.SCHEMA__CLASES);
		}
		return clases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getRelaciones() {
		if (relaciones == null) {
			relaciones = new EObjectContainmentEList<Association>(Association.class, this, SimpleClassPackage.SCHEMA__RELACIONES);
		}
		return relaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrimitiveDataType> getDatos() {
		if (datos == null) {
			datos = new EObjectContainmentEList<PrimitiveDataType>(PrimitiveDataType.class, this, SimpleClassPackage.SCHEMA__DATOS);
		}
		return datos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimpleClassPackage.SCHEMA__CLASES:
				return ((InternalEList<?>)getClases()).basicRemove(otherEnd, msgs);
			case SimpleClassPackage.SCHEMA__RELACIONES:
				return ((InternalEList<?>)getRelaciones()).basicRemove(otherEnd, msgs);
			case SimpleClassPackage.SCHEMA__DATOS:
				return ((InternalEList<?>)getDatos()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimpleClassPackage.SCHEMA__CLASES:
				return getClases();
			case SimpleClassPackage.SCHEMA__RELACIONES:
				return getRelaciones();
			case SimpleClassPackage.SCHEMA__DATOS:
				return getDatos();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimpleClassPackage.SCHEMA__CLASES:
				getClases().clear();
				getClases().addAll((Collection<? extends Norma.SimpleClass.Class>)newValue);
				return;
			case SimpleClassPackage.SCHEMA__RELACIONES:
				getRelaciones().clear();
				getRelaciones().addAll((Collection<? extends Association>)newValue);
				return;
			case SimpleClassPackage.SCHEMA__DATOS:
				getDatos().clear();
				getDatos().addAll((Collection<? extends PrimitiveDataType>)newValue);
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
			case SimpleClassPackage.SCHEMA__CLASES:
				getClases().clear();
				return;
			case SimpleClassPackage.SCHEMA__RELACIONES:
				getRelaciones().clear();
				return;
			case SimpleClassPackage.SCHEMA__DATOS:
				getDatos().clear();
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
			case SimpleClassPackage.SCHEMA__CLASES:
				return clases != null && !clases.isEmpty();
			case SimpleClassPackage.SCHEMA__RELACIONES:
				return relaciones != null && !relaciones.isEmpty();
			case SimpleClassPackage.SCHEMA__DATOS:
				return datos != null && !datos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SchemaImpl
