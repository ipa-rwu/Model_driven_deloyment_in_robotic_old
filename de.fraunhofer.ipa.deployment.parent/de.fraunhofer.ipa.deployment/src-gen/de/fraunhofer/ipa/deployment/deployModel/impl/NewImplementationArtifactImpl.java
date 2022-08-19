/**
 * generated by Xtext 2.27.0
 */
package de.fraunhofer.ipa.deployment.deployModel.impl;

import de.fraunhofer.ipa.deployment.deployModel.BuildRequirements;
import de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage;
import de.fraunhofer.ipa.deployment.deployModel.DeploymentRequirements;
import de.fraunhofer.ipa.deployment.deployModel.MultiValueList;
import de.fraunhofer.ipa.deployment.deployModel.NewImplementationArtifact;
import de.fraunhofer.ipa.deployment.deployModel.ResourceRequirements;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>New Implementation Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.impl.NewImplementationArtifactImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.impl.NewImplementationArtifactImpl#getDeployRequirements <em>Deploy Requirements</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.impl.NewImplementationArtifactImpl#getResourceRequirements <em>Resource Requirements</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.impl.NewImplementationArtifactImpl#getBuildRequirements <em>Build Requirements</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.deployModel.impl.NewImplementationArtifactImpl#getStartCommands <em>Start Commands</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NewImplementationArtifactImpl extends MinimalEObjectImpl.Container implements NewImplementationArtifact
{
  /**
   * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected static final String LOCATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected String location = LOCATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getDeployRequirements() <em>Deploy Requirements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeployRequirements()
   * @generated
   * @ordered
   */
  protected DeploymentRequirements deployRequirements;

  /**
   * The cached value of the '{@link #getResourceRequirements() <em>Resource Requirements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResourceRequirements()
   * @generated
   * @ordered
   */
  protected ResourceRequirements resourceRequirements;

  /**
   * The cached value of the '{@link #getBuildRequirements() <em>Build Requirements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuildRequirements()
   * @generated
   * @ordered
   */
  protected BuildRequirements buildRequirements;

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
  protected NewImplementationArtifactImpl()
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
    return DeployModelPackage.Literals.NEW_IMPLEMENTATION_ARTIFACT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLocation()
  {
    return location;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLocation(String newLocation)
  {
    String oldLocation = location;
    location = newLocation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeployModelPackage.NEW_IMPLEMENTATION_ARTIFACT__LOCATION, oldLocation, location));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DeploymentRequirements getDeployRequirements()
  {
    return deployRequirements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeployRequirements(DeploymentRequirements newDeployRequirements, NotificationChain msgs)
  {
    DeploymentRequirements oldDeployRequirements = deployRequirements;
    deployRequirements = newDeployRequirements;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeployModelPackage.NEW_IMPLEMENTATION_ARTIFACT__DEPLOY_REQUIREMENTS, oldDeployRequirements, newDeployRequirements);
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
  public void setDeployRequirements(DeploymentRequirements newDeployRequirements)
  {
    if (newDeployRequirements != deployRequirements)
    {
      NotificationChain msgs = null;
      if (deployRequirements != null)
        msgs = ((InternalEObject)deployRequirements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeployModelPackage.NEW_IMPLEMENTATION_ARTIFACT__DEPLOY_REQUIREMENTS, null, msgs);
      if (newDeployRequirements != null)
        msgs = ((InternalEObject)newDeployRequirements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeployModelPackage.NEW_IMPLEMENTATION_ARTIFACT__DEPLOY_REQUIREMENTS, null, msgs);
      msgs = basicSetDeployRequirements(newDeployRequirements, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeployModelPackage.NEW_IMPLEMENTATION_ARTIFACT__DEPLOY_REQUIREMENTS, newDeployRequirements, newDeployRequirements));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ResourceRequirements getResourceRequirements()
  {
    return resourceRequirements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResourceRequirements(ResourceRequirements newResourceRequirements, NotificationChain msgs)
  {
    ResourceRequirements oldResourceRequirements = resourceRequirements;
    resourceRequirements = newResourceRequirements;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeployModelPackage.NEW_IMPLEMENTATION_ARTIFACT__RESOURCE_REQUIREMENTS, oldResourceRequirements, newResourceRequirements);
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
  public void setResourceRequirements(ResourceRequirements newResourceRequirements)
  {
    if (newResourceRequirements != resourceRequirements)
    {
      NotificationChain msgs = null;
      if (resourceRequirements != null)
        msgs = ((InternalEObject)resourceRequirements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeployModelPackage.NEW_IMPLEMENTATION_ARTIFACT__RESOURCE_REQUIREMENTS, null, msgs);
      if (newResourceRequirements != null)
        msgs = ((InternalEObject)newResourceRequirements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeployModelPackage.NEW_IMPLEMENTATION_ARTIFACT__RESOURCE_REQUIREMENTS, null, msgs);
      msgs = basicSetResourceRequirements(newResourceRequirements, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeployModelPackage.NEW_IMPLEMENTATION_ARTIFACT__RESOURCE_REQUIREMENTS, newResourceRequirements, newResourceRequirements));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BuildRequirements getBuildRequirements()
  {
    return buildRequirements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBuildRequirements(BuildRequirements newBuildRequirements, NotificationChain msgs)
  {
    BuildRequirements oldBuildRequirements = buildRequirements;
    buildRequirements = newBuildRequirements;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeployModelPackage.NEW_IMPLEMENTATION_ARTIFACT__BUILD_REQUIREMENTS, oldBuildRequirements, newBuildRequirements);
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
  public void setBuildRequirements(BuildRequirements newBuildRequirements)
  {
    if (newBuildRequirements != buildRequirements)
    {
      NotificationChain msgs = null;
      if (buildRequirements != null)
        msgs = ((InternalEObject)buildRequirements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeployModelPackage.NEW_IMPLEMENTATION_ARTIFACT__BUILD_REQUIREMENTS, null, msgs);
      if (newBuildRequirements != null)
        msgs = ((InternalEObject)newBuildRequirements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeployModelPackage.NEW_IMPLEMENTATION_ARTIFACT__BUILD_REQUIREMENTS, null, msgs);
      msgs = basicSetBuildRequirements(newBuildRequirements, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeployModelPackage.NEW_IMPLEMENTATION_ARTIFACT__BUILD_REQUIREMENTS, newBuildRequirements, newBuildRequirements));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeployModelPackage.NEW_IMPLEMENTATION_ARTIFACT__START_COMMANDS, oldStartCommands, newStartCommands);
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
        msgs = ((InternalEObject)startCommands).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeployModelPackage.NEW_IMPLEMENTATION_ARTIFACT__START_COMMANDS, null, msgs);
      if (newStartCommands != null)
        msgs = ((InternalEObject)newStartCommands).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeployModelPackage.NEW_IMPLEMENTATION_ARTIFACT__START_COMMANDS, null, msgs);
      msgs = basicSetStartCommands(newStartCommands, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeployModelPackage.NEW_IMPLEMENTATION_ARTIFACT__START_COMMANDS, newStartCommands, newStartCommands));
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
      case DeployModelPackage.NEW_IMPLEMENTATION_ARTIFACT__DEPLOY_REQUIREMENTS:
        return basicSetDeployRequirements(null, msgs);
      case DeployModelPackage.NEW_IMPLEMENTATION_ARTIFACT__RESOURCE_REQUIREMENTS:
        return basicSetResourceRequirements(null, msgs);
      case DeployModelPackage.NEW_IMPLEMENTATION_ARTIFACT__BUILD_REQUIREMENTS:
        return basicSetBuildRequirements(null, msgs);
      case DeployModelPackage.NEW_IMPLEMENTATION_ARTIFACT__START_COMMANDS:
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
      case DeployModelPackage.NEW_IMPLEMENTATION_ARTIFACT__LOCATION:
        return getLocation();
      case DeployModelPackage.NEW_IMPLEMENTATION_ARTIFACT__DEPLOY_REQUIREMENTS:
        return getDeployRequirements();
      case DeployModelPackage.NEW_IMPLEMENTATION_ARTIFACT__RESOURCE_REQUIREMENTS:
        return getResourceRequirements();
      case DeployModelPackage.NEW_IMPLEMENTATION_ARTIFACT__BUILD_REQUIREMENTS:
        return getBuildRequirements();
      case DeployModelPackage.NEW_IMPLEMENTATION_ARTIFACT__START_COMMANDS:
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
      case DeployModelPackage.NEW_IMPLEMENTATION_ARTIFACT__LOCATION:
        setLocation((String)newValue);
        return;
      case DeployModelPackage.NEW_IMPLEMENTATION_ARTIFACT__DEPLOY_REQUIREMENTS:
        setDeployRequirements((DeploymentRequirements)newValue);
        return;
      case DeployModelPackage.NEW_IMPLEMENTATION_ARTIFACT__RESOURCE_REQUIREMENTS:
        setResourceRequirements((ResourceRequirements)newValue);
        return;
      case DeployModelPackage.NEW_IMPLEMENTATION_ARTIFACT__BUILD_REQUIREMENTS:
        setBuildRequirements((BuildRequirements)newValue);
        return;
      case DeployModelPackage.NEW_IMPLEMENTATION_ARTIFACT__START_COMMANDS:
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
      case DeployModelPackage.NEW_IMPLEMENTATION_ARTIFACT__LOCATION:
        setLocation(LOCATION_EDEFAULT);
        return;
      case DeployModelPackage.NEW_IMPLEMENTATION_ARTIFACT__DEPLOY_REQUIREMENTS:
        setDeployRequirements((DeploymentRequirements)null);
        return;
      case DeployModelPackage.NEW_IMPLEMENTATION_ARTIFACT__RESOURCE_REQUIREMENTS:
        setResourceRequirements((ResourceRequirements)null);
        return;
      case DeployModelPackage.NEW_IMPLEMENTATION_ARTIFACT__BUILD_REQUIREMENTS:
        setBuildRequirements((BuildRequirements)null);
        return;
      case DeployModelPackage.NEW_IMPLEMENTATION_ARTIFACT__START_COMMANDS:
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
      case DeployModelPackage.NEW_IMPLEMENTATION_ARTIFACT__LOCATION:
        return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
      case DeployModelPackage.NEW_IMPLEMENTATION_ARTIFACT__DEPLOY_REQUIREMENTS:
        return deployRequirements != null;
      case DeployModelPackage.NEW_IMPLEMENTATION_ARTIFACT__RESOURCE_REQUIREMENTS:
        return resourceRequirements != null;
      case DeployModelPackage.NEW_IMPLEMENTATION_ARTIFACT__BUILD_REQUIREMENTS:
        return buildRequirements != null;
      case DeployModelPackage.NEW_IMPLEMENTATION_ARTIFACT__START_COMMANDS:
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
    result.append(" (location: ");
    result.append(location);
    result.append(')');
    return result.toString();
  }

} //NewImplementationArtifactImpl
