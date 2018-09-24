/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.provider;


import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionFactory;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineTool;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineTool} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CommandLineToolItemProvider extends FunctionalEntityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandLineToolItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addStandardInputStreamPropertyDescriptor(object);
			addStandardOutputStreamPropertyDescriptor(object);
			addStandardErrorStreamPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Standard Input Stream feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStandardInputStreamPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommandLineTool_standardInputStream_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommandLineTool_standardInputStream_feature", "_UI_CommandLineTool_type"),
				 AnalysisActivityDescriptionPackage.Literals.COMMAND_LINE_TOOL__STANDARD_INPUT_STREAM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Standard Output Stream feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStandardOutputStreamPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommandLineTool_standardOutputStream_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommandLineTool_standardOutputStream_feature", "_UI_CommandLineTool_type"),
				 AnalysisActivityDescriptionPackage.Literals.COMMAND_LINE_TOOL__STANDARD_OUTPUT_STREAM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Standard Error Stream feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStandardErrorStreamPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommandLineTool_standardErrorStream_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommandLineTool_standardErrorStream_feature", "_UI_CommandLineTool_type"),
				 AnalysisActivityDescriptionPackage.Literals.COMMAND_LINE_TOOL__STANDARD_ERROR_STREAM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(AnalysisActivityDescriptionPackage.Literals.COMMAND_LINE_TOOL__COMMAND_LINE_TEMPLATE);
			childrenFeatures.add(AnalysisActivityDescriptionPackage.Literals.COMMAND_LINE_TOOL__EXIT_CODES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns CommandLineTool.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CommandLineTool"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CommandLineTool)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CommandLineTool_type") :
			getString("_UI_CommandLineTool_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(CommandLineTool.class)) {
			case AnalysisActivityDescriptionPackage.COMMAND_LINE_TOOL__COMMAND_LINE_TEMPLATE:
			case AnalysisActivityDescriptionPackage.COMMAND_LINE_TOOL__EXIT_CODES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(AnalysisActivityDescriptionPackage.Literals.COMMAND_LINE_TOOL__COMMAND_LINE_TEMPLATE,
				 AnalysisActivityDescriptionFactory.eINSTANCE.createToolNameCommandLineEntry()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisActivityDescriptionPackage.Literals.COMMAND_LINE_TOOL__COMMAND_LINE_TEMPLATE,
				 AnalysisActivityDescriptionFactory.eINSTANCE.createLiteralCommandLineEntryList()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisActivityDescriptionPackage.Literals.COMMAND_LINE_TOOL__COMMAND_LINE_TEMPLATE,
				 AnalysisActivityDescriptionFactory.eINSTANCE.createDatasetCommandLineEntryList()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisActivityDescriptionPackage.Literals.COMMAND_LINE_TOOL__COMMAND_LINE_TEMPLATE,
				 AnalysisActivityDescriptionFactory.eINSTANCE.createParameterCommandLineEntryList()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisActivityDescriptionPackage.Literals.COMMAND_LINE_TOOL__EXIT_CODES,
				 AnalysisActivityDescriptionFactory.eINSTANCE.createExitCode()));
	}

}
