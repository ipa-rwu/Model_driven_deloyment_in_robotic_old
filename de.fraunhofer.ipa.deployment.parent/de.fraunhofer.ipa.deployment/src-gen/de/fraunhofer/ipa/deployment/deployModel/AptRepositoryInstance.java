/**
 * generated by Xtext 2.27.0
 */
package de.fraunhofer.ipa.deployment.deployModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apt Repository Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.AptRepositoryInstance#getName <em>Name</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.AptRepositoryInstance#getKeyLink <em>Key Link</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.AptRepositoryInstance#getRepositoryPath <em>Repository Path</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.AptRepositoryInstance#getUpdateRosDep <em>Update Ros Dep</em>}</li>
 * </ul>
 *
 * @see de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage#getAptRepositoryInstance()
 * @model
 * @generated
 */
public interface AptRepositoryInstance extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage#getAptRepositoryInstance_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.fraunhofer.ipa.deployment.deployModel.AptRepositoryInstance#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Key Link</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key Link</em>' attribute.
   * @see #setKeyLink(String)
   * @see de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage#getAptRepositoryInstance_KeyLink()
   * @model
   * @generated
   */
  String getKeyLink();

  /**
   * Sets the value of the '{@link de.fraunhofer.ipa.deployment.deployModel.AptRepositoryInstance#getKeyLink <em>Key Link</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key Link</em>' attribute.
   * @see #getKeyLink()
   * @generated
   */
  void setKeyLink(String value);

  /**
   * Returns the value of the '<em><b>Repository Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Repository Path</em>' attribute.
   * @see #setRepositoryPath(String)
   * @see de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage#getAptRepositoryInstance_RepositoryPath()
   * @model
   * @generated
   */
  String getRepositoryPath();

  /**
   * Sets the value of the '{@link de.fraunhofer.ipa.deployment.deployModel.AptRepositoryInstance#getRepositoryPath <em>Repository Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Repository Path</em>' attribute.
   * @see #getRepositoryPath()
   * @generated
   */
  void setRepositoryPath(String value);

  /**
   * Returns the value of the '<em><b>Update Ros Dep</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Update Ros Dep</em>' attribute.
   * @see #setUpdateRosDep(String)
   * @see de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage#getAptRepositoryInstance_UpdateRosDep()
   * @model
   * @generated
   */
  String getUpdateRosDep();

  /**
   * Sets the value of the '{@link de.fraunhofer.ipa.deployment.deployModel.AptRepositoryInstance#getUpdateRosDep <em>Update Ros Dep</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Update Ros Dep</em>' attribute.
   * @see #getUpdateRosDep()
   * @generated
   */
  void setUpdateRosDep(String value);

} // AptRepositoryInstance