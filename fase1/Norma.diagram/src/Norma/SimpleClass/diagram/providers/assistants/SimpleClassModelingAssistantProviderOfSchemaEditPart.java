package Norma.SimpleClass.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class SimpleClassModelingAssistantProviderOfSchemaEditPart
		extends
		Norma.SimpleClass.diagram.providers.SimpleClassModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(Norma.SimpleClass.diagram.providers.SimpleClassElementTypes.Class_2001);
		return types;
	}

}
