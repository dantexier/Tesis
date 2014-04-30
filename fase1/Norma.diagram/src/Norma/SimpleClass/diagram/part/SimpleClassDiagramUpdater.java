package Norma.SimpleClass.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class SimpleClassDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<Norma.SimpleClass.diagram.part.SimpleClassNodeDescriptor> getSemanticChildren(
			View view) {
		switch (Norma.SimpleClass.diagram.part.SimpleClassVisualIDRegistry
				.getVisualID(view)) {
		case Norma.SimpleClass.diagram.edit.parts.SchemaEditPart.VISUAL_ID:
			return getSchema_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Norma.SimpleClass.diagram.part.SimpleClassNodeDescriptor> getSchema_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Norma.SimpleClass.Schema modelElement = (Norma.SimpleClass.Schema) view
				.getElement();
		LinkedList<Norma.SimpleClass.diagram.part.SimpleClassNodeDescriptor> result = new LinkedList<Norma.SimpleClass.diagram.part.SimpleClassNodeDescriptor>();
		for (Iterator<?> it = modelElement.getClases().iterator(); it.hasNext();) {
			Norma.SimpleClass.Class childElement = (Norma.SimpleClass.Class) it
					.next();
			int visualID = Norma.SimpleClass.diagram.part.SimpleClassVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Norma.SimpleClass.diagram.edit.parts.ClassEditPart.VISUAL_ID) {
				result.add(new Norma.SimpleClass.diagram.part.SimpleClassNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Norma.SimpleClass.diagram.part.SimpleClassLinkDescriptor> getContainedLinks(
			View view) {
		switch (Norma.SimpleClass.diagram.part.SimpleClassVisualIDRegistry
				.getVisualID(view)) {
		case Norma.SimpleClass.diagram.edit.parts.SchemaEditPart.VISUAL_ID:
			return getSchema_1000ContainedLinks(view);
		case Norma.SimpleClass.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Norma.SimpleClass.diagram.part.SimpleClassLinkDescriptor> getIncomingLinks(
			View view) {
		switch (Norma.SimpleClass.diagram.part.SimpleClassVisualIDRegistry
				.getVisualID(view)) {
		case Norma.SimpleClass.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Norma.SimpleClass.diagram.part.SimpleClassLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (Norma.SimpleClass.diagram.part.SimpleClassVisualIDRegistry
				.getVisualID(view)) {
		case Norma.SimpleClass.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Norma.SimpleClass.diagram.part.SimpleClassLinkDescriptor> getSchema_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Norma.SimpleClass.diagram.part.SimpleClassLinkDescriptor> getClass_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Norma.SimpleClass.diagram.part.SimpleClassLinkDescriptor> getClass_2001IncomingLinks(
			View view) {
		Norma.SimpleClass.Class modelElement = (Norma.SimpleClass.Class) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Norma.SimpleClass.diagram.part.SimpleClassLinkDescriptor> result = new LinkedList<Norma.SimpleClass.diagram.part.SimpleClassLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Association_Src_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Association_Dest_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Norma.SimpleClass.diagram.part.SimpleClassLinkDescriptor> getClass_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<Norma.SimpleClass.diagram.part.SimpleClassLinkDescriptor> getIncomingFeatureModelFacetLinks_Association_Src_4001(
			Norma.SimpleClass.Class target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Norma.SimpleClass.diagram.part.SimpleClassLinkDescriptor> result = new LinkedList<Norma.SimpleClass.diagram.part.SimpleClassLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == Norma.SimpleClass.SimpleClassPackage.eINSTANCE
					.getAssociation_Src()) {
				result.add(new Norma.SimpleClass.diagram.part.SimpleClassLinkDescriptor(
						setting.getEObject(),
						target,
						Norma.SimpleClass.diagram.providers.SimpleClassElementTypes.AssociationSrc_4001,
						Norma.SimpleClass.diagram.edit.parts.AssociationSrcEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Norma.SimpleClass.diagram.part.SimpleClassLinkDescriptor> getIncomingFeatureModelFacetLinks_Association_Dest_4002(
			Norma.SimpleClass.Class target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Norma.SimpleClass.diagram.part.SimpleClassLinkDescriptor> result = new LinkedList<Norma.SimpleClass.diagram.part.SimpleClassLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == Norma.SimpleClass.SimpleClassPackage.eINSTANCE
					.getAssociation_Dest()) {
				result.add(new Norma.SimpleClass.diagram.part.SimpleClassLinkDescriptor(
						setting.getEObject(),
						target,
						Norma.SimpleClass.diagram.providers.SimpleClassElementTypes.AssociationDest_4002,
						Norma.SimpleClass.diagram.edit.parts.AssociationDestEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<Norma.SimpleClass.diagram.part.SimpleClassNodeDescriptor> getSemanticChildren(
				View view) {
			return SimpleClassDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<Norma.SimpleClass.diagram.part.SimpleClassLinkDescriptor> getContainedLinks(
				View view) {
			return SimpleClassDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<Norma.SimpleClass.diagram.part.SimpleClassLinkDescriptor> getIncomingLinks(
				View view) {
			return SimpleClassDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<Norma.SimpleClass.diagram.part.SimpleClassLinkDescriptor> getOutgoingLinks(
				View view) {
			return SimpleClassDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
