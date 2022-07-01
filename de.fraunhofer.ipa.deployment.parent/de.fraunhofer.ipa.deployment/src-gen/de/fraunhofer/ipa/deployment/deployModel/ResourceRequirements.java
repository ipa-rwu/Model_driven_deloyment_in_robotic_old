/**
 * generated by Xtext 2.27.0
 */
package de.fraunhofer.ipa.deployment.deployModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Requirements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.ResourceRequirements#getName <em>Name</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.ResourceRequirements#getRequirements <em>Requirements</em>}</li>
 * </ul>
 *
 * @see de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage#getResourceRequirements()
 * @model
 * @generated
 */
public interface ResourceRequirements extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage#getResourceRequirements_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.fraunhofer.ipa.deployment.deployModel.ResourceRequirements#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Requirements</b></em>' containment reference list.
   * The list contents are of type {@link de.fraunhofer.ipa.deployment.deployModel.ResourceRequirement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requirements</em>' containment reference list.
   * @see de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage#getResourceRequirements_Requirements()
   * @model containment="true"
   * @generated
   */
  EList<ResourceRequirement> getRequirements();

} // ResourceRequirements