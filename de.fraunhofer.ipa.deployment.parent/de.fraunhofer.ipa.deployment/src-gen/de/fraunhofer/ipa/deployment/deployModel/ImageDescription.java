/**
 * generated by Xtext 2.27.0
 */
package de.fraunhofer.ipa.deployment.deployModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.ImageDescription#getTypes <em>Types</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.ImageDescription#getName <em>Name</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.ImageDescription#getImageTags <em>Image Tags</em>}</li>
 * </ul>
 *
 * @see de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage#getImageDescription()
 * @model
 * @generated
 */
public interface ImageDescription extends EObject
{
  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference.
   * @see #setTypes(MultiValueList)
   * @see de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage#getImageDescription_Types()
   * @model containment="true"
   * @generated
   */
  MultiValueList getTypes();

  /**
   * Sets the value of the '{@link de.fraunhofer.ipa.deployment.deployModel.ImageDescription#getTypes <em>Types</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Types</em>' containment reference.
   * @see #getTypes()
   * @generated
   */
  void setTypes(MultiValueList value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(MonolithicImplementationDescription)
   * @see de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage#getImageDescription_Name()
   * @model
   * @generated
   */
  MonolithicImplementationDescription getName();

  /**
   * Sets the value of the '{@link de.fraunhofer.ipa.deployment.deployModel.ImageDescription#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(MonolithicImplementationDescription value);

  /**
   * Returns the value of the '<em><b>Image Tags</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Image Tags</em>' containment reference.
   * @see #setImageTags(MultiValueList)
   * @see de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage#getImageDescription_ImageTags()
   * @model containment="true"
   * @generated
   */
  MultiValueList getImageTags();

  /**
   * Sets the value of the '{@link de.fraunhofer.ipa.deployment.deployModel.ImageDescription#getImageTags <em>Image Tags</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Image Tags</em>' containment reference.
   * @see #getImageTags()
   * @generated
   */
  void setImageTags(MultiValueList value);

} // ImageDescription
