/**
 * generated by Xtext 2.27.0
 */
package de.fraunhofer.ipa.deployment.deployModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.LocalPackage#getImportedNamespace <em>Imported Namespace</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.LocalPackage#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage#getLocalPackage()
 * @model
 * @generated
 */
public interface LocalPackage extends Dependency
{
  /**
   * Returns the value of the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Namespace</em>' attribute.
   * @see #setImportedNamespace(String)
   * @see de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage#getLocalPackage_ImportedNamespace()
   * @model
   * @generated
   */
  String getImportedNamespace();

  /**
   * Sets the value of the '{@link de.fraunhofer.ipa.deployment.deployModel.LocalPackage#getImportedNamespace <em>Imported Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imported Namespace</em>' attribute.
   * @see #getImportedNamespace()
   * @generated
   */
  void setImportedNamespace(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(MonolithicImplementationDescription)
   * @see de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage#getLocalPackage_Name()
   * @model
   * @generated
   */
  MonolithicImplementationDescription getName();

  /**
   * Sets the value of the '{@link de.fraunhofer.ipa.deployment.deployModel.LocalPackage#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(MonolithicImplementationDescription value);

} // LocalPackage