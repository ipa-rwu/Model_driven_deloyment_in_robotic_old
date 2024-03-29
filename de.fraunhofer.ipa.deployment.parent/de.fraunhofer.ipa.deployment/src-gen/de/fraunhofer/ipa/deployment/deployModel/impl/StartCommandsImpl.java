/**
 * generated by Xtext 2.27.0
 */
package de.fraunhofer.ipa.deployment.deployModel.impl;

import de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage;
import de.fraunhofer.ipa.deployment.deployModel.ListStartCommands;
import de.fraunhofer.ipa.deployment.deployModel.StartCommands;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start Commands</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.impl.StartCommandsImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.impl.StartCommandsImpl#getStartCommands <em>Start Commands</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StartCommandsImpl extends MinimalEObjectImpl.Container implements StartCommands
{
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
   * The cached value of the '{@link #getStartCommands() <em>Start Commands</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartCommands()
   * @generated
   * @ordered
   */
  protected ListStartCommands startCommands;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StartCommandsImpl()
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
    return DeployModelPackage.Literals.START_COMMANDS;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DeployModelPackage.START_COMMANDS__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ListStartCommands getStartCommands()
  {
    return startCommands;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStartCommands(ListStartCommands newStartCommands, NotificationChain msgs)
  {
    ListStartCommands oldStartCommands = startCommands;
    startCommands = newStartCommands;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeployModelPackage.START_COMMANDS__START_COMMANDS, oldStartCommands, newStartCommands);
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
  public void setStartCommands(ListStartCommands newStartCommands)
  {
    if (newStartCommands != startCommands)
    {
      NotificationChain msgs = null;
      if (startCommands != null)
        msgs = ((InternalEObject)startCommands).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeployModelPackage.START_COMMANDS__START_COMMANDS, null, msgs);
      if (newStartCommands != null)
        msgs = ((InternalEObject)newStartCommands).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeployModelPackage.START_COMMANDS__START_COMMANDS, null, msgs);
      msgs = basicSetStartCommands(newStartCommands, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeployModelPackage.START_COMMANDS__START_COMMANDS, newStartCommands, newStartCommands));
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
      case DeployModelPackage.START_COMMANDS__START_COMMANDS:
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
      case DeployModelPackage.START_COMMANDS__NAME:
        return getName();
      case DeployModelPackage.START_COMMANDS__START_COMMANDS:
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
      case DeployModelPackage.START_COMMANDS__NAME:
        setName((String)newValue);
        return;
      case DeployModelPackage.START_COMMANDS__START_COMMANDS:
        setStartCommands((ListStartCommands)newValue);
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
      case DeployModelPackage.START_COMMANDS__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DeployModelPackage.START_COMMANDS__START_COMMANDS:
        setStartCommands((ListStartCommands)null);
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
      case DeployModelPackage.START_COMMANDS__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DeployModelPackage.START_COMMANDS__START_COMMANDS:
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //StartCommandsImpl
