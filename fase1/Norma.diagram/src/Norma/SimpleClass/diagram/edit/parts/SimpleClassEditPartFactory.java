package Norma.SimpleClass.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class SimpleClassEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (Norma.SimpleClass.diagram.part.SimpleClassVisualIDRegistry
					.getVisualID(view)) {

			case Norma.SimpleClass.diagram.edit.parts.SchemaEditPart.VISUAL_ID:
				return new Norma.SimpleClass.diagram.edit.parts.SchemaEditPart(
						view);

			case Norma.SimpleClass.diagram.edit.parts.ClassEditPart.VISUAL_ID:
				return new Norma.SimpleClass.diagram.edit.parts.ClassEditPart(
						view);

			case Norma.SimpleClass.diagram.edit.parts.AssociationSrcEditPart.VISUAL_ID:
				return new Norma.SimpleClass.diagram.edit.parts.AssociationSrcEditPart(
						view);

			case Norma.SimpleClass.diagram.edit.parts.AssociationDestEditPart.VISUAL_ID:
				return new Norma.SimpleClass.diagram.edit.parts.AssociationDestEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
