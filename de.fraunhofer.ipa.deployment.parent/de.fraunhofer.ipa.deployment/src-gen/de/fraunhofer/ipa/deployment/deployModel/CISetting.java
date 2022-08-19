/**
 * generated by Xtext 2.27.0
 */
package de.fraunhofer.ipa.deployment.deployModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CI Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.CISetting#getType <em>Type</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.CISetting#getCiTypes <em>Ci Types</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.CISetting#getAppliedRepos <em>Applied Repos</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.CISetting#getReqBranchPrefix <em>Req Branch Prefix</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.CISetting#getCiParameters <em>Ci Parameters</em>}</li>
 * </ul>
 *
 * @see de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage#getCISetting()
 * @model
 * @generated
 */
public interface CISetting extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage#getCISetting_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link de.fraunhofer.ipa.deployment.deployModel.CISetting#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Ci Types</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ci Types</em>' containment reference.
   * @see #setCiTypes(MultiValueList)
   * @see de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage#getCISetting_CiTypes()
   * @model containment="true"
   * @generated
   */
  MultiValueList getCiTypes();

  /**
   * Sets the value of the '{@link de.fraunhofer.ipa.deployment.deployModel.CISetting#getCiTypes <em>Ci Types</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ci Types</em>' containment reference.
   * @see #getCiTypes()
   * @generated
   */
  void setCiTypes(MultiValueList value);

  /**
   * Returns the value of the '<em><b>Applied Repos</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Applied Repos</em>' containment reference.
   * @see #setAppliedRepos(MultiMonolithicImplementationNameList)
   * @see de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage#getCISetting_AppliedRepos()
   * @model containment="true"
   * @generated
   */
  MultiMonolithicImplementationNameList getAppliedRepos();

  /**
   * Sets the value of the '{@link de.fraunhofer.ipa.deployment.deployModel.CISetting#getAppliedRepos <em>Applied Repos</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Applied Repos</em>' containment reference.
   * @see #getAppliedRepos()
   * @generated
   */
  void setAppliedRepos(MultiMonolithicImplementationNameList value);

  /**
   * Returns the value of the '<em><b>Req Branch Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Req Branch Prefix</em>' attribute.
   * @see #setReqBranchPrefix(String)
   * @see de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage#getCISetting_ReqBranchPrefix()
   * @model
   * @generated
   */
  String getReqBranchPrefix();

  /**
   * Sets the value of the '{@link de.fraunhofer.ipa.deployment.deployModel.CISetting#getReqBranchPrefix <em>Req Branch Prefix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Req Branch Prefix</em>' attribute.
   * @see #getReqBranchPrefix()
   * @generated
   */
  void setReqBranchPrefix(String value);

  /**
   * Returns the value of the '<em><b>Ci Parameters</b></em>' containment reference list.
   * The list contents are of type {@link de.fraunhofer.ipa.deployment.deployModel.CIParameters}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ci Parameters</em>' containment reference list.
   * @see de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage#getCISetting_CiParameters()
   * @model containment="true"
   * @generated
   */
  EList<CIParameters> getCiParameters();

} // CISetting
