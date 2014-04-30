package Norma.SimpleClass.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class SimpleClassNavigatorContentProvider implements
		ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public SimpleClassNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<Norma.SimpleClass.diagram.navigator.SimpleClassNavigatorItem> result = new ArrayList<Norma.SimpleClass.diagram.navigator.SimpleClassNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(
							topViews,
							Norma.SimpleClass.diagram.edit.parts.SchemaEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof Norma.SimpleClass.diagram.navigator.SimpleClassNavigatorGroup) {
			Norma.SimpleClass.diagram.navigator.SimpleClassNavigatorGroup group = (Norma.SimpleClass.diagram.navigator.SimpleClassNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof Norma.SimpleClass.diagram.navigator.SimpleClassNavigatorItem) {
			Norma.SimpleClass.diagram.navigator.SimpleClassNavigatorItem navigatorItem = (Norma.SimpleClass.diagram.navigator.SimpleClassNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (Norma.SimpleClass.diagram.part.SimpleClassVisualIDRegistry
				.getVisualID(view)) {

		case Norma.SimpleClass.diagram.edit.parts.SchemaEditPart.VISUAL_ID: {
			LinkedList<Norma.SimpleClass.diagram.navigator.SimpleClassAbstractNavigatorItem> result = new LinkedList<Norma.SimpleClass.diagram.navigator.SimpleClassAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			Norma.SimpleClass.diagram.navigator.SimpleClassNavigatorGroup links = new Norma.SimpleClass.diagram.navigator.SimpleClassNavigatorGroup(
					Norma.SimpleClass.diagram.part.Messages.NavigatorGroupName_Schema_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Norma.SimpleClass.diagram.part.SimpleClassVisualIDRegistry
							.getType(Norma.SimpleClass.diagram.edit.parts.ClassEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					Norma.SimpleClass.diagram.part.SimpleClassVisualIDRegistry
							.getType(Norma.SimpleClass.diagram.edit.parts.AssociationSrcEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					Norma.SimpleClass.diagram.part.SimpleClassVisualIDRegistry
							.getType(Norma.SimpleClass.diagram.edit.parts.AssociationDestEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case Norma.SimpleClass.diagram.edit.parts.ClassEditPart.VISUAL_ID: {
			LinkedList<Norma.SimpleClass.diagram.navigator.SimpleClassAbstractNavigatorItem> result = new LinkedList<Norma.SimpleClass.diagram.navigator.SimpleClassAbstractNavigatorItem>();
			Node sv = (Node) view;
			Norma.SimpleClass.diagram.navigator.SimpleClassNavigatorGroup incominglinks = new Norma.SimpleClass.diagram.navigator.SimpleClassNavigatorGroup(
					Norma.SimpleClass.diagram.part.Messages.NavigatorGroupName_Class_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					Norma.SimpleClass.diagram.part.SimpleClassVisualIDRegistry
							.getType(Norma.SimpleClass.diagram.edit.parts.AssociationSrcEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					Norma.SimpleClass.diagram.part.SimpleClassVisualIDRegistry
							.getType(Norma.SimpleClass.diagram.edit.parts.AssociationDestEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Norma.SimpleClass.diagram.edit.parts.AssociationSrcEditPart.VISUAL_ID: {
			LinkedList<Norma.SimpleClass.diagram.navigator.SimpleClassAbstractNavigatorItem> result = new LinkedList<Norma.SimpleClass.diagram.navigator.SimpleClassAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			Norma.SimpleClass.diagram.navigator.SimpleClassNavigatorGroup target = new Norma.SimpleClass.diagram.navigator.SimpleClassNavigatorGroup(
					Norma.SimpleClass.diagram.part.Messages.NavigatorGroupName_AssociationSrc_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					Norma.SimpleClass.diagram.part.SimpleClassVisualIDRegistry
							.getType(Norma.SimpleClass.diagram.edit.parts.ClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}

		case Norma.SimpleClass.diagram.edit.parts.AssociationDestEditPart.VISUAL_ID: {
			LinkedList<Norma.SimpleClass.diagram.navigator.SimpleClassAbstractNavigatorItem> result = new LinkedList<Norma.SimpleClass.diagram.navigator.SimpleClassAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			Norma.SimpleClass.diagram.navigator.SimpleClassNavigatorGroup target = new Norma.SimpleClass.diagram.navigator.SimpleClassNavigatorGroup(
					Norma.SimpleClass.diagram.part.Messages.NavigatorGroupName_AssociationDest_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					Norma.SimpleClass.diagram.part.SimpleClassVisualIDRegistry
							.getType(Norma.SimpleClass.diagram.edit.parts.ClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return Norma.SimpleClass.diagram.edit.parts.SchemaEditPart.MODEL_ID
				.equals(Norma.SimpleClass.diagram.part.SimpleClassVisualIDRegistry
						.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<Norma.SimpleClass.diagram.navigator.SimpleClassNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<Norma.SimpleClass.diagram.navigator.SimpleClassNavigatorItem> result = new ArrayList<Norma.SimpleClass.diagram.navigator.SimpleClassNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new Norma.SimpleClass.diagram.navigator.SimpleClassNavigatorItem(
					nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof Norma.SimpleClass.diagram.navigator.SimpleClassAbstractNavigatorItem) {
			Norma.SimpleClass.diagram.navigator.SimpleClassAbstractNavigatorItem abstractNavigatorItem = (Norma.SimpleClass.diagram.navigator.SimpleClassAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
