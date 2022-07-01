/**
 * generated by Xtext 2.27.0
 */
package de.fraunhofer.ipa.deployment.deployModel.impl;

import de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage;
import de.fraunhofer.ipa.deployment.deployModel.OperatingSystemTypeList;
import de.fraunhofer.ipa.deployment.deployModel.OperatingSystemTypes;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operating System Type List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.impl.OperatingSystemTypeListImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperatingSystemTypeListImpl extends MinimalEObjectImpl.Container implements OperatingSystemTypeList
{
  /**
   * The cached value of the '{@link #getChildren() <em>Children</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChildren()
   * @generated
   * @ordered
   */
  protected EList<OperatingSystemTypes> children;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperatingSystemTypeListImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DeployModelPackage.Literals.OPERATING_SYSTEM_TYPE_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<OperatingSystemTypes> getChildren()
  {
    if (children == null)
    {
      children = new EDataTypeEList<OperatingSystemTypes>(OperatingSystemTypes.class, this, DeployModelPackage.OPERATING_SYSTEM_TYPE_LIST__CHILDREN);
    }
    return children;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DeployModelPackage.OPERATING_SYSTEM_TYPE_LIST__CHILDREN:
        return getChildren();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DeployModelPackage.OPERATING_SYSTEM_TYPE_LIST__CHILDREN:
        getChildren().clear();
        getChildren().addAll((Collection<? extends OperatingSystemTypes>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DeployModelPackage.OPERATING_SYSTEM_TYPE_LIST__CHILDREN:
        getChildren().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DeployModelPackage.OPERATING_SYSTEM_TYPE_LIST__CHILDREN:
        return children != null && !children.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (children: ");
    result.append(children);
    result.append(')');
    return result.toString();
  }

} //OperatingSystemTypeListImpl