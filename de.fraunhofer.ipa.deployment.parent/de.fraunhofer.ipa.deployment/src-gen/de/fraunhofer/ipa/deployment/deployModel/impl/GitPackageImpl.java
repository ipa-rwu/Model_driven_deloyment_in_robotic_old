/**
 * generated by Xtext 2.27.0
 */
package de.fraunhofer.ipa.deployment.deployModel.impl;

import de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage;
import de.fraunhofer.ipa.deployment.deployModel.GitPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Git Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.impl.GitPackageImpl#getPath <em>Path</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.impl.GitPackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.impl.GitPackageImpl#getBranch <em>Branch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GitPackageImpl extends DependencyImpl implements GitPackage
{
  /**
   * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected static final String PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected String path = PATH_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getBranch() <em>Branch</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBranch()
   * @generated
   * @ordered
   */
  protected static final String BRANCH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBranch() <em>Branch</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBranch()
   * @generated
   * @ordered
   */
  protected String branch = BRANCH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GitPackageImpl()
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
    return DeployModelPackage.Literals.GIT_PACKAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPath()
  {
    return path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPath(String newPath)
  {
    String oldPath = path;
    path = newPath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeployModelPackage.GIT_PACKAGE__PATH, oldPath, path));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeployModelPackage.GIT_PACKAGE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getBranch()
  {
    return branch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBranch(String newBranch)
  {
    String oldBranch = branch;
    branch = newBranch;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeployModelPackage.GIT_PACKAGE__BRANCH, oldBranch, branch));
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
      case DeployModelPackage.GIT_PACKAGE__PATH:
        return getPath();
      case DeployModelPackage.GIT_PACKAGE__NAME:
        return getName();
      case DeployModelPackage.GIT_PACKAGE__BRANCH:
        return getBranch();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DeployModelPackage.GIT_PACKAGE__PATH:
        setPath((String)newValue);
        return;
      case DeployModelPackage.GIT_PACKAGE__NAME:
        setName((String)newValue);
        return;
      case DeployModelPackage.GIT_PACKAGE__BRANCH:
        setBranch((String)newValue);
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
      case DeployModelPackage.GIT_PACKAGE__PATH:
        setPath(PATH_EDEFAULT);
        return;
      case DeployModelPackage.GIT_PACKAGE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DeployModelPackage.GIT_PACKAGE__BRANCH:
        setBranch(BRANCH_EDEFAULT);
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
      case DeployModelPackage.GIT_PACKAGE__PATH:
        return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
      case DeployModelPackage.GIT_PACKAGE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DeployModelPackage.GIT_PACKAGE__BRANCH:
        return BRANCH_EDEFAULT == null ? branch != null : !BRANCH_EDEFAULT.equals(branch);
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
    result.append(" (path: ");
    result.append(path);
    result.append(", name: ");
    result.append(name);
    result.append(", branch: ");
    result.append(branch);
    result.append(')');
    return result.toString();
  }

} //GitPackageImpl
