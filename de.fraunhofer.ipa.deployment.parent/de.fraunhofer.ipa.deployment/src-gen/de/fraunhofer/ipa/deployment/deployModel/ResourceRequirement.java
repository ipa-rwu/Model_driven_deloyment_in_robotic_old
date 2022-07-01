/**
 * generated by Xtext 2.27.0
 */
package de.fraunhofer.ipa.deployment.deployModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.ResourceRequirement#getName <em>Name</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.ResourceRequirement#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage#getResourceRequirement()
 * @model
 * @generated
 */
public interface ResourceRequirement extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * The literals are from the enumeration {@link de.fraunhofer.ipa.deployment.deployModel.ResourceReqTypes}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see de.fraunhofer.ipa.deployment.deployModel.ResourceReqTypes
   * @see #setName(ResourceReqTypes)
   * @see de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage#getResourceRequirement_Name()
   * @model
   * @generated
   */
  ResourceReqTypes getName();

  /**
   * Sets the value of the '{@link de.fraunhofer.ipa.deployment.deployModel.ResourceRequirement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see de.fraunhofer.ipa.deployment.deployModel.ResourceReqTypes
   * @see #getName()
   * @generated
   */
  void setName(ResourceReqTypes value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage#getResourceRequirement_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link de.fraunhofer.ipa.deployment.deployModel.ResourceRequirement#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // ResourceRequirement
