package Norma.SimpleClass.diagram.navigator;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class SimpleClassNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		Norma.SimpleClass.diagram.part.SimpleClassDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		Norma.SimpleClass.diagram.part.SimpleClassDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof Norma.SimpleClass.diagram.navigator.SimpleClassNavigatorItem
				&& !isOwnView(((Norma.SimpleClass.diagram.navigator.SimpleClassNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof Norma.SimpleClass.diagram.navigator.SimpleClassNavigatorGroup) {
			Norma.SimpleClass.diagram.navigator.SimpleClassNavigatorGroup group = (Norma.SimpleClass.diagram.navigator.SimpleClassNavigatorGroup) element;
			return Norma.SimpleClass.diagram.part.SimpleClassDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof Norma.SimpleClass.diagram.navigator.SimpleClassNavigatorItem) {
			Norma.SimpleClass.diagram.navigator.SimpleClassNavigatorItem navigatorItem = (Norma.SimpleClass.diagram.navigator.SimpleClassNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (Norma.SimpleClass.diagram.part.SimpleClassVisualIDRegistry
				.getVisualID(view)) {
		case Norma.SimpleClass.diagram.edit.parts.SchemaEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?sedici.Simple?Schema", Norma.SimpleClass.diagram.providers.SimpleClassElementTypes.Schema_1000); //$NON-NLS-1$
		case Norma.SimpleClass.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?sedici.Simple?Class", Norma.SimpleClass.diagram.providers.SimpleClassElementTypes.Class_2001); //$NON-NLS-1$
		case Norma.SimpleClass.diagram.edit.parts.AssociationSrcEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?sedici.Simple?Association?src", Norma.SimpleClass.diagram.providers.SimpleClassElementTypes.AssociationSrc_4001); //$NON-NLS-1$
		case Norma.SimpleClass.diagram.edit.parts.AssociationDestEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?sedici.Simple?Association?dest", Norma.SimpleClass.diagram.providers.SimpleClassElementTypes.AssociationDest_4002); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = Norma.SimpleClass.diagram.part.SimpleClassDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& Norma.SimpleClass.diagram.providers.SimpleClassElementTypes
						.isKnownElementType(elementType)) {
			image = Norma.SimpleClass.diagram.providers.SimpleClassElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof Norma.SimpleClass.diagram.navigator.SimpleClassNavigatorGroup) {
			Norma.SimpleClass.diagram.navigator.SimpleClassNavigatorGroup group = (Norma.SimpleClass.diagram.navigator.SimpleClassNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof Norma.SimpleClass.diagram.navigator.SimpleClassNavigatorItem) {
			Norma.SimpleClass.diagram.navigator.SimpleClassNavigatorItem navigatorItem = (Norma.SimpleClass.diagram.navigator.SimpleClassNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (Norma.SimpleClass.diagram.part.SimpleClassVisualIDRegistry
				.getVisualID(view)) {
		case Norma.SimpleClass.diagram.edit.parts.SchemaEditPart.VISUAL_ID:
			return getSchema_1000Text(view);
		case Norma.SimpleClass.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2001Text(view);
		case Norma.SimpleClass.diagram.edit.parts.AssociationSrcEditPart.VISUAL_ID:
			return getAssociationSrc_4001Text(view);
		case Norma.SimpleClass.diagram.edit.parts.AssociationDestEditPart.VISUAL_ID:
			return getAssociationDest_4002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getSchema_1000Text(View view) {
		Norma.SimpleClass.Schema domainModelElement = (Norma.SimpleClass.Schema) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getName());
		} else {
			Norma.SimpleClass.diagram.part.SimpleClassDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getClass_2001Text(View view) {
		Norma.SimpleClass.Class domainModelElement = (Norma.SimpleClass.Class) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getName());
		} else {
			Norma.SimpleClass.diagram.part.SimpleClassDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssociationSrc_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAssociationDest_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return Norma.SimpleClass.diagram.edit.parts.SchemaEditPart.MODEL_ID
				.equals(Norma.SimpleClass.diagram.part.SimpleClassVisualIDRegistry
						.getModelID(view));
	}

}
