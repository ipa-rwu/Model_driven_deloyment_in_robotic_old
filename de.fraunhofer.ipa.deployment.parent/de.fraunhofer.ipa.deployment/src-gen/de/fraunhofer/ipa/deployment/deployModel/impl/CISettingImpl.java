/**
 * generated by Xtext 2.27.0
 */
package de.fraunhofer.ipa.deployment.deployModel.impl;

import de.fraunhofer.ipa.deployment.deployModel.CIParameters;
import de.fraunhofer.ipa.deployment.deployModel.CISetting;
import de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage;
import de.fraunhofer.ipa.deployment.deployModel.MultiMonolithicImplementationNameList;
import de.fraunhofer.ipa.deployment.deployModel.MultiValueList;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CI Setting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.impl.CISettingImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.impl.CISettingImpl#getCiTypes <em>Ci Types</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.impl.CISettingImpl#getAppliedRepos <em>Applied Repos</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.impl.CISettingImpl#getReqBranchPrefix <em>Req Branch Prefix</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.impl.CISettingImpl#getCiParameters <em>Ci Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CISettingImpl extends MinimalEObjectImpl.Container implements CISetting
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getCiTypes() <em>Ci Types</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCiTypes()
   * @generated
   * @ordered
   */
  protected MultiValueList ciTypes;

  /**
   * The cached value of the '{@link #getAppliedRepos() <em>Applied Repos</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAppliedRepos()
   * @generated
   * @ordered
   */
  protected MultiMonolithicImplementationNameList appliedRepos;

  /**
   * The default value of the '{@link #getReqBranchPrefix() <em>Req Branch Prefix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReqBranchPrefix()
   * @generated
   * @ordered
   */
  protected static final String REQ_BRANCH_PREFIX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReqBranchPrefix() <em>Req Branch Prefix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReqBranchPrefix()
   * @generated
   * @ordered
   */
  protected String reqBranchPrefix = REQ_BRANCH_PREFIX_EDEFAULT;

  /**
   * The cached value of the '{@link #getCiParameters() <em>Ci Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCiParameters()
   * @generated
   * @ordered
   */
  protected EList<CIParameters> ciParameters;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CISettingImpl()
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
    return DeployModelPackage.Literals.CI_SETTING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeployModelPackage.CI_SETTING__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MultiValueList getCiTypes()
  {
    return ciTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCiTypes(MultiValueList newCiTypes, NotificationChain msgs)
  {
    MultiValueList oldCiTypes = ciTypes;
    ciTypes = newCiTypes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeployModelPackage.CI_SETTING__CI_TYPES, oldCiTypes, newCiTypes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCiTypes(MultiValueList newCiTypes)
  {
    if (newCiTypes != ciTypes)
    {
      NotificationChain msgs = null;
      if (ciTypes != null)
        msgs = ((InternalEObject)ciTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeployModelPackage.CI_SETTING__CI_TYPES, null, msgs);
      if (newCiTypes != null)
        msgs = ((InternalEObject)newCiTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeployModelPackage.CI_SETTING__CI_TYPES, null, msgs);
      msgs = basicSetCiTypes(newCiTypes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeployModelPackage.CI_SETTING__CI_TYPES, newCiTypes, newCiTypes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MultiMonolithicImplementationNameList getAppliedRepos()
  {
    return appliedRepos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAppliedRepos(MultiMonolithicImplementationNameList newAppliedRepos, NotificationChain msgs)
  {
    MultiMonolithicImplementationNameList oldAppliedRepos = appliedRepos;
    appliedRepos = newAppliedRepos;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeployModelPackage.CI_SETTING__APPLIED_REPOS, oldAppliedRepos, newAppliedRepos);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAppliedRepos(MultiMonolithicImplementationNameList newAppliedRepos)
  {
    if (newAppliedRepos != appliedRepos)
    {
      NotificationChain msgs = null;
      if (appliedRepos != null)
        msgs = ((InternalEObject)appliedRepos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeployModelPackage.CI_SETTING__APPLIED_REPOS, null, msgs);
      if (newAppliedRepos != null)
        msgs = ((InternalEObject)newAppliedRepos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeployModelPackage.CI_SETTING__APPLIED_REPOS, null, msgs);
      msgs = basicSetAppliedRepos(newAppliedRepos, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeployModelPackage.CI_SETTING__APPLIED_REPOS, newAppliedRepos, newAppliedRepos));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getReqBranchPrefix()
  {
    return reqBranchPrefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setReqBranchPrefix(String newReqBranchPrefix)
  {
    String oldReqBranchPrefix = reqBranchPrefix;
    reqBranchPrefix = newReqBranchPrefix;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeployModelPackage.CI_SETTING__REQ_BRANCH_PREFIX, oldReqBranchPrefix, reqBranchPrefix));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<CIParameters> getCiParameters()
  {
    if (ciParameters == null)
    {
      ciParameters = new EObjectContainmentEList<CIParameters>(CIParameters.class, this, DeployModelPackage.CI_SETTING__CI_PARAMETERS);
    }
    return ciParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DeployModelPackage.CI_SETTING__CI_TYPES:
        return basicSetCiTypes(null, msgs);
      case DeployModelPackage.CI_SETTING__APPLIED_REPOS:
        return basicSetAppliedRepos(null, msgs);
      case DeployModelPackage.CI_SETTING__CI_PARAMETERS:
        return ((InternalEList<?>)getCiParameters()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case DeployModelPackage.CI_SETTING__TYPE:
        return getType();
      case DeployModelPackage.CI_SETTING__CI_TYPES:
        return getCiTypes();
      case DeployModelPackage.CI_SETTING__APPLIED_REPOS:
        return getAppliedRepos();
      case DeployModelPackage.CI_SETTING__REQ_BRANCH_PREFIX:
        return getReqBranchPrefix();
      case DeployModelPackage.CI_SETTING__CI_PARAMETERS:
        return getCiParameters();
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
      case DeployModelPackage.CI_SETTING__TYPE:
        setType((String)newValue);
        return;
      case DeployModelPackage.CI_SETTING__CI_TYPES:
        setCiTypes((MultiValueList)newValue);
        return;
      case DeployModelPackage.CI_SETTING__APPLIED_REPOS:
        setAppliedRepos((MultiMonolithicImplementationNameList)newValue);
        return;
      case DeployModelPackage.CI_SETTING__REQ_BRANCH_PREFIX:
        setReqBranchPrefix((String)newValue);
        return;
      case DeployModelPackage.CI_SETTING__CI_PARAMETERS:
        getCiParameters().clear();
        getCiParameters().addAll((Collection<? extends CIParameters>)newValue);
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
      case DeployModelPackage.CI_SETTING__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case DeployModelPackage.CI_SETTING__CI_TYPES:
        setCiTypes((MultiValueList)null);
        return;
      case DeployModelPackage.CI_SETTING__APPLIED_REPOS:
        setAppliedRepos((MultiMonolithicImplementationNameList)null);
        return;
      case DeployModelPackage.CI_SETTING__REQ_BRANCH_PREFIX:
        setReqBranchPrefix(REQ_BRANCH_PREFIX_EDEFAULT);
        return;
      case DeployModelPackage.CI_SETTING__CI_PARAMETERS:
        getCiParameters().clear();
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
      case DeployModelPackage.CI_SETTING__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case DeployModelPackage.CI_SETTING__CI_TYPES:
        return ciTypes != null;
      case DeployModelPackage.CI_SETTING__APPLIED_REPOS:
        return appliedRepos != null;
      case DeployModelPackage.CI_SETTING__REQ_BRANCH_PREFIX:
        return REQ_BRANCH_PREFIX_EDEFAULT == null ? reqBranchPrefix != null : !REQ_BRANCH_PREFIX_EDEFAULT.equals(reqBranchPrefix);
      case DeployModelPackage.CI_SETTING__CI_PARAMETERS:
        return ciParameters != null && !ciParameters.isEmpty();
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
    result.append(" (type: ");
    result.append(type);
    result.append(", reqBranchPrefix: ");
    result.append(reqBranchPrefix);
    result.append(')');
    return result.toString();
  }

} //CISettingImpl
