package Norma.SimpleClass.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class AssociationDestItemSemanticEditPolicy
		extends
		Norma.SimpleClass.diagram.edit.policies.SimpleClassBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AssociationDestItemSemanticEditPolicy() {
		super(
				Norma.SimpleClass.diagram.providers.SimpleClassElementTypes.AssociationDest_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
