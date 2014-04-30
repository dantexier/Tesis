package Norma.SimpleClass.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ClassItemSemanticEditPolicy
		extends
		Norma.SimpleClass.diagram.edit.policies.SimpleClassBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ClassItemSemanticEditPolicy() {
		super(
				Norma.SimpleClass.diagram.providers.SimpleClassElementTypes.Class_2001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (Norma.SimpleClass.diagram.part.SimpleClassVisualIDRegistry
					.getVisualID(incomingLink) == Norma.SimpleClass.diagram.edit.parts.AssociationSrcEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (Norma.SimpleClass.diagram.part.SimpleClassVisualIDRegistry
					.getVisualID(incomingLink) == Norma.SimpleClass.diagram.edit.parts.AssociationDestEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (Norma.SimpleClass.diagram.providers.SimpleClassElementTypes.AssociationSrc_4001 == req
				.getElementType()) {
			return null;
		}
		if (Norma.SimpleClass.diagram.providers.SimpleClassElementTypes.AssociationDest_4002 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (Norma.SimpleClass.diagram.providers.SimpleClassElementTypes.AssociationSrc_4001 == req
				.getElementType()) {
			return getGEFWrapper(new Norma.SimpleClass.diagram.edit.commands.AssociationSrcCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (Norma.SimpleClass.diagram.providers.SimpleClassElementTypes.AssociationDest_4002 == req
				.getElementType()) {
			return getGEFWrapper(new Norma.SimpleClass.diagram.edit.commands.AssociationDestCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case Norma.SimpleClass.diagram.edit.parts.AssociationSrcEditPart.VISUAL_ID:
			return getGEFWrapper(new Norma.SimpleClass.diagram.edit.commands.AssociationSrcReorientCommand(
					req));
		case Norma.SimpleClass.diagram.edit.parts.AssociationDestEditPart.VISUAL_ID:
			return getGEFWrapper(new Norma.SimpleClass.diagram.edit.commands.AssociationDestReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
