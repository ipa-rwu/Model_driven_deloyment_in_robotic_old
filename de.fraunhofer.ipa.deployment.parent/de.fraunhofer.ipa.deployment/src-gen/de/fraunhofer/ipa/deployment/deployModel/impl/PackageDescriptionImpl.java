/**
 * generated by Xtext 2.27.0
 */
package de.fraunhofer.ipa.deployment.deployModel.impl;

import de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage;
import de.fraunhofer.ipa.deployment.deployModel.ImageDescription;
import de.fraunhofer.ipa.deployment.deployModel.PackageDescription;
import de.fraunhofer.ipa.deployment.deployModel.RepositoryDescription;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.impl.PackageDescriptionImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.impl.PackageDescriptionImpl#getImageDescription <em>Image Description</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.impl.PackageDescriptionImpl#getRepositoryDescription <em>Repository Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageDescriptionImpl extends MinimalEObjectImpl.Container implements PackageDescription
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
   * The cached value of the '{@link #getImageDescription() <em>Image Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImageDescription()
   * @generated
   * @ordered
   */
  protected ImageDescription imageDescription;

  /**
   * The cached value of the '{@link #getRepositoryDescription() <em>Repository Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepositoryDescription()
   * @generated
   * @ordered
   */
  protected RepositoryDescription repositoryDescription;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PackageDescriptionImpl()
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
    return DeployModelPackage.Literals.PACKAGE_DESCRIPTION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DeployModelPackage.PACKAGE_DESCRIPTION__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ImageDescription getImageDescription()
  {
    return imageDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetImageDescription(ImageDescription newImageDescription, NotificationChain msgs)
  {
    ImageDescription oldImageDescription = imageDescription;
    imageDescription = newImageDescription;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeployModelPackage.PACKAGE_DESCRIPTION__IMAGE_DESCRIPTION, oldImageDescription, newImageDescription);
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
  public void setImageDescription(ImageDescription newImageDescription)
  {
    if (newImageDescription != imageDescription)
    {
      NotificationChain msgs = null;
      if (imageDescription != null)
        msgs = ((InternalEObject)imageDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeployModelPackage.PACKAGE_DESCRIPTION__IMAGE_DESCRIPTION, null, msgs);
      if (newImageDescription != null)
        msgs = ((InternalEObject)newImageDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeployModelPackage.PACKAGE_DESCRIPTION__IMAGE_DESCRIPTION, null, msgs);
      msgs = basicSetImageDescription(newImageDescription, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeployModelPackage.PACKAGE_DESCRIPTION__IMAGE_DESCRIPTION, newImageDescription, newImageDescription));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RepositoryDescription getRepositoryDescription()
  {
    return repositoryDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRepositoryDescription(RepositoryDescription newRepositoryDescription, NotificationChain msgs)
  {
    RepositoryDescription oldRepositoryDescription = repositoryDescription;
    repositoryDescription = newRepositoryDescription;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeployModelPackage.PACKAGE_DESCRIPTION__REPOSITORY_DESCRIPTION, oldRepositoryDescription, newRepositoryDescription);
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
  public void setRepositoryDescription(RepositoryDescription newRepositoryDescription)
  {
    if (newRepositoryDescription != repositoryDescription)
    {
      NotificationChain msgs = null;
      if (repositoryDescription != null)
        msgs = ((InternalEObject)repositoryDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeployModelPackage.PACKAGE_DESCRIPTION__REPOSITORY_DESCRIPTION, null, msgs);
      if (newRepositoryDescription != null)
        msgs = ((InternalEObject)newRepositoryDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeployModelPackage.PACKAGE_DESCRIPTION__REPOSITORY_DESCRIPTION, null, msgs);
      msgs = basicSetRepositoryDescription(newRepositoryDescription, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeployModelPackage.PACKAGE_DESCRIPTION__REPOSITORY_DESCRIPTION, newRepositoryDescription, newRepositoryDescription));
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
      case DeployModelPackage.PACKAGE_DESCRIPTION__IMAGE_DESCRIPTION:
        return basicSetImageDescription(null, msgs);
      case DeployModelPackage.PACKAGE_DESCRIPTION__REPOSITORY_DESCRIPTION:
        return basicSetRepositoryDescription(null, msgs);
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
      case DeployModelPackage.PACKAGE_DESCRIPTION__TYPE:
        return getType();
      case DeployModelPackage.PACKAGE_DESCRIPTION__IMAGE_DESCRIPTION:
        return getImageDescription();
      case DeployModelPackage.PACKAGE_DESCRIPTION__REPOSITORY_DESCRIPTION:
        return getRepositoryDescription();
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
      case DeployModelPackage.PACKAGE_DESCRIPTION__TYPE:
        setType((String)newValue);
        return;
      case DeployModelPackage.PACKAGE_DESCRIPTION__IMAGE_DESCRIPTION:
        setImageDescription((ImageDescription)newValue);
        return;
      case DeployModelPackage.PACKAGE_DESCRIPTION__REPOSITORY_DESCRIPTION:
        setRepositoryDescription((RepositoryDescription)newValue);
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
      case DeployModelPackage.PACKAGE_DESCRIPTION__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case DeployModelPackage.PACKAGE_DESCRIPTION__IMAGE_DESCRIPTION:
        setImageDescription((ImageDescription)null);
        return;
      case DeployModelPackage.PACKAGE_DESCRIPTION__REPOSITORY_DESCRIPTION:
        setRepositoryDescription((RepositoryDescription)null);
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
      case DeployModelPackage.PACKAGE_DESCRIPTION__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case DeployModelPackage.PACKAGE_DESCRIPTION__IMAGE_DESCRIPTION:
        return imageDescription != null;
      case DeployModelPackage.PACKAGE_DESCRIPTION__REPOSITORY_DESCRIPTION:
        return repositoryDescription != null;
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
    result.append(')');
    return result.toString();
  }

} //PackageDescriptionImpl
