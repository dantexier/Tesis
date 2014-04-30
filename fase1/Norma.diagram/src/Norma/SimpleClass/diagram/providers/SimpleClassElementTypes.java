package Norma.SimpleClass.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class SimpleClassElementTypes {

	/**
	 * @generated
	 */
	private SimpleClassElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			Norma.SimpleClass.diagram.part.SimpleClassDiagramEditorPlugin
					.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Schema_1000 = getElementType("Norma.diagram.Schema_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Class_2001 = getElementType("Norma.diagram.Class_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AssociationSrc_4001 = getElementType("Norma.diagram.AssociationSrc_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AssociationDest_4002 = getElementType("Norma.diagram.AssociationDest_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Schema_1000,
					Norma.SimpleClass.SimpleClassPackage.eINSTANCE.getSchema());

			elements.put(Class_2001,
					Norma.SimpleClass.SimpleClassPackage.eINSTANCE.getClass_());

			elements.put(AssociationSrc_4001,
					Norma.SimpleClass.SimpleClassPackage.eINSTANCE
							.getAssociation_Src());

			elements.put(AssociationDest_4002,
					Norma.SimpleClass.SimpleClassPackage.eINSTANCE
							.getAssociation_Dest());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Schema_1000);
			KNOWN_ELEMENT_TYPES.add(Class_2001);
			KNOWN_ELEMENT_TYPES.add(AssociationSrc_4001);
			KNOWN_ELEMENT_TYPES.add(AssociationDest_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case Norma.SimpleClass.diagram.edit.parts.SchemaEditPart.VISUAL_ID:
			return Schema_1000;
		case Norma.SimpleClass.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return Class_2001;
		case Norma.SimpleClass.diagram.edit.parts.AssociationSrcEditPart.VISUAL_ID:
			return AssociationSrc_4001;
		case Norma.SimpleClass.diagram.edit.parts.AssociationDestEditPart.VISUAL_ID:
			return AssociationDest_4002;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return Norma.SimpleClass.diagram.providers.SimpleClassElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return Norma.SimpleClass.diagram.providers.SimpleClassElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return Norma.SimpleClass.diagram.providers.SimpleClassElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
