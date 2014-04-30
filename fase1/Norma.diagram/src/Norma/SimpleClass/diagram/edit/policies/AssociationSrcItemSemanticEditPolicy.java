package Norma.SimpleClass.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class AssociationSrcItemSemanticEditPolicy
		extends
		Norma.SimpleClass.diagram.edit.policies.SimpleClassBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AssociationSrcItemSemanticEditPolicy() {
		super(
				Norma.SimpleClass.diagram.providers.SimpleClassElementTypes.AssociationSrc_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
