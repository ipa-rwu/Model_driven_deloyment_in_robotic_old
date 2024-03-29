/**
 * generated by Xtext 2.27.0
 */
package de.fraunhofer.ipa.deployment.deployModel.impl;

import de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage;
import de.fraunhofer.ipa.deployment.deployModel.ImplementationArtifactDescription;
import de.fraunhofer.ipa.deployment.deployModel.ImplementationModeType;
import de.fraunhofer.ipa.deployment.deployModel.MonolithicImplementationDescription;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monolithic Implementation Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.impl.MonolithicImplementationDescriptionImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.impl.MonolithicImplementationDescriptionImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.impl.MonolithicImplementationDescriptionImpl#getImpRosmodel <em>Imp Rosmodel</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.impl.MonolithicImplementationDescriptionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.impl.MonolithicImplementationDescriptionImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.impl.MonolithicImplementationDescriptionImpl#getBranch <em>Branch</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.impl.MonolithicImplementationDescriptionImpl#getImpl <em>Impl</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MonolithicImplementationDescriptionImpl extends MinimalEObjectImpl.Container implements MonolithicImplementationDescription
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
   * The default value of the '{@link #getImpRosmodel() <em>Imp Rosmodel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImpRosmodel()
   * @generated
   * @ordered
   */
  protected static final String IMP_ROSMODEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImpRosmodel() <em>Imp Rosmodel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImpRosmodel()
   * @generated
   * @ordered
   */
  protected String impRosmodel = IMP_ROSMODEL_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMode()
   * @generated
   * @ordered
   */
  protected static final ImplementationModeType MODE_EDEFAULT = ImplementationModeType.DEBUG_MODE;

  /**
   * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMode()
   * @generated
   * @ordered
   */
  protected ImplementationModeType mode = MODE_EDEFAULT;

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
   * The cached value of the '{@link #getImpl() <em>Impl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImpl()
   * @generated
   * @ordered
   */
  protected ImplementationArtifactDescription impl;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MonolithicImplementationDescriptionImpl()
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
    return DeployModelPackage.Literals.MONOLITHIC_IMPLEMENTATION_DESCRIPTION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DeployModelPackage.MONOLITHIC_IMPLEMENTATION_DESCRIPTION__TYPE, oldType, type));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DeployModelPackage.MONOLITHIC_IMPLEMENTATION_DESCRIPTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getImpRosmodel()
  {
    return impRosmodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setImpRosmodel(String newImpRosmodel)
  {
    String oldImpRosmodel = impRosmodel;
    impRosmodel = newImpRosmodel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeployModelPackage.MONOLITHIC_IMPLEMENTATION_DESCRIPTION__IMP_ROSMODEL, oldImpRosmodel, impRosmodel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeployModelPackage.MONOLITHIC_IMPLEMENTATION_DESCRIPTION__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ImplementationModeType getMode()
  {
    return mode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMode(ImplementationModeType newMode)
  {
    ImplementationModeType oldMode = mode;
    mode = newMode == null ? MODE_EDEFAULT : newMode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeployModelPackage.MONOLITHIC_IMPLEMENTATION_DESCRIPTION__MODE, oldMode, mode));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DeployModelPackage.MONOLITHIC_IMPLEMENTATION_DESCRIPTION__BRANCH, oldBranch, branch));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ImplementationArtifactDescription getImpl()
  {
    return impl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetImpl(ImplementationArtifactDescription newImpl, NotificationChain msgs)
  {
    ImplementationArtifactDescription oldImpl = impl;
    impl = newImpl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeployModelPackage.MONOLITHIC_IMPLEMENTATION_DESCRIPTION__IMPL, oldImpl, newImpl);
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
  public void setImpl(ImplementationArtifactDescription newImpl)
  {
    if (newImpl != impl)
    {
      NotificationChain msgs = null;
      if (impl != null)
        msgs = ((InternalEObject)impl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeployModelPackage.MONOLITHIC_IMPLEMENTATION_DESCRIPTION__IMPL, null, msgs);
      if (newImpl != null)
        msgs = ((InternalEObject)newImpl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeployModelPackage.MONOLITHIC_IMPLEMENTATION_DESCRIPTION__IMPL, null, msgs);
      msgs = basicSetImpl(newImpl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeployModelPackage.MONOLITHIC_IMPLEMENTATION_DESCRIPTION__IMPL, newImpl, newImpl));
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
      case DeployModelPackage.MONOLITHIC_IMPLEMENTATION_DESCRIPTION__IMPL:
        return basicSetImpl(null, msgs);
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
      case DeployModelPackage.MONOLITHIC_IMPLEMENTATION_DESCRIPTION__TYPE:
        return getType();
      case DeployModelPackage.MONOLITHIC_IMPLEMENTATION_DESCRIPTION__NAME:
        return getName();
      case DeployModelPackage.MONOLITHIC_IMPLEMENTATION_DESCRIPTION__IMP_ROSMODEL:
        return getImpRosmodel();
      case DeployModelPackage.MONOLITHIC_IMPLEMENTATION_DESCRIPTION__DESCRIPTION:
        return getDescription();
      case DeployModelPackage.MONOLITHIC_IMPLEMENTATION_DESCRIPTION__MODE:
        return getMode();
      case DeployModelPackage.MONOLITHIC_IMPLEMENTATION_DESCRIPTION__BRANCH:
        return getBranch();
      case DeployModelPackage.MONOLITHIC_IMPLEMENTATION_DESCRIPTION__IMPL:
        return getImpl();
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
      case DeployModelPackage.MONOLITHIC_IMPLEMENTATION_DESCRIPTION__TYPE:
        setType((String)newValue);
        return;
      case DeployModelPackage.MONOLITHIC_IMPLEMENTATION_DESCRIPTION__NAME:
        setName((String)newValue);
        return;
      case DeployModelPackage.MONOLITHIC_IMPLEMENTATION_DESCRIPTION__IMP_ROSMODEL:
        setImpRosmodel((String)newValue);
        return;
      case DeployModelPackage.MONOLITHIC_IMPLEMENTATION_DESCRIPTION__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case DeployModelPackage.MONOLITHIC_IMPLEMENTATION_DESCRIPTION__MODE:
        setMode((ImplementationModeType)newValue);
        return;
      case DeployModelPackage.MONOLITHIC_IMPLEMENTATION_DESCRIPTION__BRANCH:
        setBranch((String)newValue);
        return;
      case DeployModelPackage.MONOLITHIC_IMPLEMENTATION_DESCRIPTION__IMPL:
        setImpl((ImplementationArtifactDescription)newValue);
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
      case DeployModelPackage.MONOLITHIC_IMPLEMENTATION_DESCRIPTION__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case DeployModelPackage.MONOLITHIC_IMPLEMENTATION_DESCRIPTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DeployModelPackage.MONOLITHIC_IMPLEMENTATION_DESCRIPTION__IMP_ROSMODEL:
        setImpRosmodel(IMP_ROSMODEL_EDEFAULT);
        return;
      case DeployModelPackage.MONOLITHIC_IMPLEMENTATION_DESCRIPTION__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case DeployModelPackage.MONOLITHIC_IMPLEMENTATION_DESCRIPTION__MODE:
        setMode(MODE_EDEFAULT);
        return;
      case DeployModelPackage.MONOLITHIC_IMPLEMENTATION_DESCRIPTION__BRANCH:
        setBranch(BRANCH_EDEFAULT);
        return;
      case DeployModelPackage.MONOLITHIC_IMPLEMENTATION_DESCRIPTION__IMPL:
        setImpl((ImplementationArtifactDescription)null);
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
      case DeployModelPackage.MONOLITHIC_IMPLEMENTATION_DESCRIPTION__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case DeployModelPackage.MONOLITHIC_IMPLEMENTATION_DESCRIPTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DeployModelPackage.MONOLITHIC_IMPLEMENTATION_DESCRIPTION__IMP_ROSMODEL:
        return IMP_ROSMODEL_EDEFAULT == null ? impRosmodel != null : !IMP_ROSMODEL_EDEFAULT.equals(impRosmodel);
      case DeployModelPackage.MONOLITHIC_IMPLEMENTATION_DESCRIPTION__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case DeployModelPackage.MONOLITHIC_IMPLEMENTATION_DESCRIPTION__MODE:
        return mode != MODE_EDEFAULT;
      case DeployModelPackage.MONOLITHIC_IMPLEMENTATION_DESCRIPTION__BRANCH:
        return BRANCH_EDEFAULT == null ? branch != null : !BRANCH_EDEFAULT.equals(branch);
      case DeployModelPackage.MONOLITHIC_IMPLEMENTATION_DESCRIPTION__IMPL:
        return impl != null;
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
    result.append(", name: ");
    result.append(name);
    result.append(", impRosmodel: ");
    result.append(impRosmodel);
    result.append(", description: ");
    result.append(description);
    result.append(", mode: ");
    result.append(mode);
    result.append(", branch: ");
    result.append(branch);
    result.append(')');
    return result.toString();
  }

} //MonolithicImplementationDescriptionImpl
