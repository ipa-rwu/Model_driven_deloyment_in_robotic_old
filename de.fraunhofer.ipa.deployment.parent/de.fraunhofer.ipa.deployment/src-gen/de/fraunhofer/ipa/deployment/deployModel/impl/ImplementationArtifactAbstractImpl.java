/**
 * generated by Xtext 2.27.0
 */
package de.fraunhofer.ipa.deployment.deployModel.impl;

import de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage;
import de.fraunhofer.ipa.deployment.deployModel.ImplementationArtifactAbstract;
import de.fraunhofer.ipa.deployment.deployModel.MonolithicImplementationDescription;
import de.fraunhofer.ipa.deployment.deployModel.MultiValueList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Artifact Abstract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.impl.ImplementationArtifactAbstractImpl#getImportedNamespace <em>Imported Namespace</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.impl.ImplementationArtifactAbstractImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.impl.ImplementationArtifactAbstractImpl#getStartCommands <em>Start Commands</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplementationArtifactAbstractImpl extends MinimalEObjectImpl.Container implements ImplementationArtifactAbstract
{
  /**
   * The default value of the '{@link #getImportedNamespace() <em>Imported Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportedNamespace()
   * @generated
   * @ordered
   */
  protected static final String IMPORTED_NAMESPACE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImportedNamespace() <em>Imported Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportedNamespace()
   * @generated
   * @ordered
   */
  protected String importedNamespace = IMPORTED_NAMESPACE_EDEFAULT;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected MonolithicImplementationDescription name;

  /**
   * The cached value of the '{@link #getStartCommands() <em>Start Commands</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartCommands()
   * @generated
   * @ordered
   */
  protected MultiValueList startCommands;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImplementationArtifactAbstractImpl()
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
    return DeployModelPackage.Literals.IMPLEMENTATION_ARTIFACT_ABSTRACT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getImportedNamespace()
  {
    return importedNamespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setImportedNamespace(String newImportedNamespace)
  {
    String oldImportedNamespace = importedNamespace;
    importedNamespace = newImportedNamespace;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeployModelPackage.IMPLEMENTATION_ARTIFACT_ABSTRACT__IMPORTED_NAMESPACE, oldImportedNamespace, importedNamespace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MonolithicImplementationDescription getName()
  {
    if (name != null && name.eIsProxy())
    {
      InternalEObject oldName = (InternalEObject)name;
      name = (MonolithicImplementationDescription)eResolveProxy(oldName);
      if (name != oldName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeployModelPackage.IMPLEMENTATION_ARTIFACT_ABSTRACT__NAME, oldName, name));
      }
    }
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MonolithicImplementationDescription basicGetName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(MonolithicImplementationDescription newName)
  {
    MonolithicImplementationDescription oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeployModelPackage.IMPLEMENTATION_ARTIFACT_ABSTRACT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MultiValueList getStartCommands()
  {
    return startCommands;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStartCommands(MultiValueList newStartCommands, NotificationChain msgs)
  {
    MultiValueList oldStartCommands = startCommands;
    startCommands = newStartCommands;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeployModelPackage.IMPLEMENTATION_ARTIFACT_ABSTRACT__START_COMMANDS, oldStartCommands, newStartCommands);
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
  public void setStartCommands(MultiValueList newStartCommands)
  {
    if (newStartCommands != startCommands)
    {
      NotificationChain msgs = null;
      if (startCommands != null)
        msgs = ((InternalEObject)startCommands).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeployModelPackage.IMPLEMENTATION_ARTIFACT_ABSTRACT__START_COMMANDS, null, msgs);
      if (newStartCommands != null)
        msgs = ((InternalEObject)newStartCommands).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeployModelPackage.IMPLEMENTATION_ARTIFACT_ABSTRACT__START_COMMANDS, null, msgs);
      msgs = basicSetStartCommands(newStartCommands, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeployModelPackage.IMPLEMENTATION_ARTIFACT_ABSTRACT__START_COMMANDS, newStartCommands, newStartCommands));
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
      case DeployModelPackage.IMPLEMENTATION_ARTIFACT_ABSTRACT__START_COMMANDS:
        return basicSetStartCommands(null, msgs);
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
      case DeployModelPackage.IMPLEMENTATION_ARTIFACT_ABSTRACT__IMPORTED_NAMESPACE:
        return getImportedNamespace();
      case DeployModelPackage.IMPLEMENTATION_ARTIFACT_ABSTRACT__NAME:
        if (resolve) return getName();
        return basicGetName();
      case DeployModelPackage.IMPLEMENTATION_ARTIFACT_ABSTRACT__START_COMMANDS:
        return getStartCommands();
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
      case DeployModelPackage.IMPLEMENTATION_ARTIFACT_ABSTRACT__IMPORTED_NAMESPACE:
        setImportedNamespace((String)newValue);
        return;
      case DeployModelPackage.IMPLEMENTATION_ARTIFACT_ABSTRACT__NAME:
        setName((MonolithicImplementationDescription)newValue);
        return;
      case DeployModelPackage.IMPLEMENTATION_ARTIFACT_ABSTRACT__START_COMMANDS:
        setStartCommands((MultiValueList)newValue);
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
      case DeployModelPackage.IMPLEMENTATION_ARTIFACT_ABSTRACT__IMPORTED_NAMESPACE:
        setImportedNamespace(IMPORTED_NAMESPACE_EDEFAULT);
        return;
      case DeployModelPackage.IMPLEMENTATION_ARTIFACT_ABSTRACT__NAME:
        setName((MonolithicImplementationDescription)null);
        return;
      case DeployModelPackage.IMPLEMENTATION_ARTIFACT_ABSTRACT__START_COMMANDS:
        setStartCommands((MultiValueList)null);
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
      case DeployModelPackage.IMPLEMENTATION_ARTIFACT_ABSTRACT__IMPORTED_NAMESPACE:
        return IMPORTED_NAMESPACE_EDEFAULT == null ? importedNamespace != null : !IMPORTED_NAMESPACE_EDEFAULT.equals(importedNamespace);
      case DeployModelPackage.IMPLEMENTATION_ARTIFACT_ABSTRACT__NAME:
        return name != null;
      case DeployModelPackage.IMPLEMENTATION_ARTIFACT_ABSTRACT__START_COMMANDS:
        return startCommands != null;
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
    result.append(" (importedNamespace: ");
    result.append(importedNamespace);
    result.append(')');
    return result.toString();
  }

} //ImplementationArtifactAbstractImpl
