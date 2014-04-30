package Norma.SimpleClass.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		Norma.SimpleClass.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		Norma.SimpleClass.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		Norma.SimpleClass.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		Norma.SimpleClass.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		Norma.SimpleClass.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return Norma.SimpleClass.diagram.part.SimpleClassDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
