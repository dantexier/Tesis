package Norma.SimpleClass.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class SimpleClassNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4004;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof Norma.SimpleClass.diagram.navigator.SimpleClassNavigatorItem) {
			Norma.SimpleClass.diagram.navigator.SimpleClassNavigatorItem item = (Norma.SimpleClass.diagram.navigator.SimpleClassNavigatorItem) element;
			return Norma.SimpleClass.diagram.part.SimpleClassVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
