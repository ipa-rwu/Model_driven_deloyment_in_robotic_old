/**
 * generated by Xtext 2.27.0
 */
package de.fraunhofer.ipa.deployment.deployModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Monolithic Implementation Name List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.MultiMonolithicImplementationNameList#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage#getMultiMonolithicImplementationNameList()
 * @model
 * @generated
 */
public interface MultiMonolithicImplementationNameList extends EObject
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' reference list.
   * The list contents are of type {@link de.fraunhofer.ipa.deployment.deployModel.MonolithicImplementationDescription}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' reference list.
   * @see de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage#getMultiMonolithicImplementationNameList_Values()
   * @model
   * @generated
   */
  EList<MonolithicImplementationDescription> getValues();

} // MultiMonolithicImplementationNameList
