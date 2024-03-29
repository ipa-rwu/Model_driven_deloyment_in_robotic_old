/**
 * generated by Xtext 2.27.0
 */
package de.fraunhofer.ipa.deployment.deployModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Version List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.ImageVersionList#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage#getImageVersionList()
 * @model
 * @generated
 */
public interface ImageVersionList extends EObject
{
  /**
   * Returns the value of the '<em><b>Children</b></em>' attribute list.
   * The list contents are of type {@link de.fraunhofer.ipa.deployment.deployModel.ImageVersionTypes}.
   * The literals are from the enumeration {@link de.fraunhofer.ipa.deployment.deployModel.ImageVersionTypes}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' attribute list.
   * @see de.fraunhofer.ipa.deployment.deployModel.ImageVersionTypes
   * @see de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage#getImageVersionList_Children()
   * @model unique="false"
   * @generated
   */
  EList<ImageVersionTypes> getChildren();

} // ImageVersionList
