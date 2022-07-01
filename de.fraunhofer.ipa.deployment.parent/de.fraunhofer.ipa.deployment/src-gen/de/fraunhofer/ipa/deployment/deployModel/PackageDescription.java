/**
 * generated by Xtext 2.27.0
 */
package de.fraunhofer.ipa.deployment.deployModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.PackageDescription#getType <em>Type</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.PackageDescription#getImageDescription <em>Image Description</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.PackageDescription#getRepositoryDescription <em>Repository Description</em>}</li>
 * </ul>
 *
 * @see de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage#getPackageDescription()
 * @model
 * @generated
 */
public interface PackageDescription extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage#getPackageDescription_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link de.fraunhofer.ipa.deployment.deployModel.PackageDescription#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Image Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Image Description</em>' containment reference.
   * @see #setImageDescription(ImageDescription)
   * @see de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage#getPackageDescription_ImageDescription()
   * @model containment="true"
   * @generated
   */
  ImageDescription getImageDescription();

  /**
   * Sets the value of the '{@link de.fraunhofer.ipa.deployment.deployModel.PackageDescription#getImageDescription <em>Image Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Image Description</em>' containment reference.
   * @see #getImageDescription()
   * @generated
   */
  void setImageDescription(ImageDescription value);

  /**
   * Returns the value of the '<em><b>Repository Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Repository Description</em>' containment reference.
   * @see #setRepositoryDescription(RepositoryDescription)
   * @see de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage#getPackageDescription_RepositoryDescription()
   * @model containment="true"
   * @generated
   */
  RepositoryDescription getRepositoryDescription();

  /**
   * Sets the value of the '{@link de.fraunhofer.ipa.deployment.deployModel.PackageDescription#getRepositoryDescription <em>Repository Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Repository Description</em>' containment reference.
   * @see #getRepositoryDescription()
   * @generated
   */
  void setRepositoryDescription(RepositoryDescription value);

} // PackageDescription
