package Norma.SimpleClass.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class SimpleClassPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createSimpleClass1Group());
	}

	/**
	 * Creates "SimpleClass" palette tool group
	 * @generated
	 */
	private PaletteContainer createSimpleClass1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Norma.SimpleClass.diagram.part.Messages.SimpleClass1Group_title);
		paletteContainer.setId("createSimpleClass1Group"); //$NON-NLS-1$
		paletteContainer.add(createClass1CreationTool());
		paletteContainer.add(createAssociation2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClass1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Norma.SimpleClass.diagram.part.Messages.Class1CreationTool_title,
				Norma.SimpleClass.diagram.part.Messages.Class1CreationTool_desc,
				Collections
						.singletonList(Norma.SimpleClass.diagram.providers.SimpleClassElementTypes.Class_2001));
		entry.setId("createClass1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Norma.SimpleClass.diagram.providers.SimpleClassElementTypes
				.getImageDescriptor(Norma.SimpleClass.diagram.providers.SimpleClassElementTypes.Class_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssociation2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Norma.SimpleClass.diagram.part.Messages.Association2CreationTool_title,
				Norma.SimpleClass.diagram.part.Messages.Association2CreationTool_desc,
				Collections
						.singletonList(Norma.SimpleClass.diagram.providers.SimpleClassElementTypes.AssociationSrc_4001));
		entry.setId("createAssociation2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Norma.SimpleClass.diagram.providers.SimpleClassElementTypes
				.getImageDescriptor(Norma.SimpleClass.diagram.providers.SimpleClassElementTypes.AssociationSrc_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
