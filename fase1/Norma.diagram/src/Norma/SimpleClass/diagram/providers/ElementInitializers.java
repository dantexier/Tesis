package Norma.SimpleClass.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = Norma.SimpleClass.diagram.part.SimpleClassDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			Norma.SimpleClass.diagram.part.SimpleClassDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
