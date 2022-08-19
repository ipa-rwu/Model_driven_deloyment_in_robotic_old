/**
 * generated by Xtext 2.27.0
 */
package de.fraunhofer.ipa.deployment.deployModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage
 * @generated
 */
public interface DeployModelFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DeployModelFactory eINSTANCE = de.fraunhofer.ipa.deployment.deployModel.impl.DeployModelFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Yaml</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Yaml</em>'.
   * @generated
   */
  Yaml createYaml();

  /**
   * Returns a new object of class '<em>Yaml Content</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Yaml Content</em>'.
   * @generated
   */
  YamlContent createYamlContent();

  /**
   * Returns a new object of class '<em>Monolithic Implementation Description</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Monolithic Implementation Description</em>'.
   * @generated
   */
  MonolithicImplementationDescription createMonolithicImplementationDescription();

  /**
   * Returns a new object of class '<em>New Implementation Artifact</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>New Implementation Artifact</em>'.
   * @generated
   */
  NewImplementationArtifact createNewImplementationArtifact();

  /**
   * Returns a new object of class '<em>Implementation Artifact Description</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Implementation Artifact Description</em>'.
   * @generated
   */
  ImplementationArtifactDescription createImplementationArtifactDescription();

  /**
   * Returns a new object of class '<em>Reuse Implementation Artifact</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reuse Implementation Artifact</em>'.
   * @generated
   */
  ReuseImplementationArtifact createReuseImplementationArtifact();

  /**
   * Returns a new object of class '<em>Implementation Artifact Abstract</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Implementation Artifact Abstract</em>'.
   * @generated
   */
  ImplementationArtifactAbstract createImplementationArtifactAbstract();

  /**
   * Returns a new object of class '<em>Deployment Requirements</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Deployment Requirements</em>'.
   * @generated
   */
  DeploymentRequirements createDeploymentRequirements();

  /**
   * Returns a new object of class '<em>Resource Requirements</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource Requirements</em>'.
   * @generated
   */
  ResourceRequirements createResourceRequirements();

  /**
   * Returns a new object of class '<em>Property Express Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Express Type</em>'.
   * @generated
   */
  PropertyExpressType createPropertyExpressType();

  /**
   * Returns a new object of class '<em>Common Property Single Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Common Property Single Value</em>'.
   * @generated
   */
  CommonPropertySingleValue createCommonPropertySingleValue();

  /**
   * Returns a new object of class '<em>Common Property Multi Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Common Property Multi Value</em>'.
   * @generated
   */
  CommonPropertyMultiValue createCommonPropertyMultiValue();

  /**
   * Returns a new object of class '<em>Multi Value List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multi Value List</em>'.
   * @generated
   */
  MultiValueList createMultiValueList();

  /**
   * Returns a new object of class '<em>Multi Value List Pre List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multi Value List Pre List</em>'.
   * @generated
   */
  MultiValueListPreList createMultiValueListPreList();

  /**
   * Returns a new object of class '<em>Multi Value List Bracket</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multi Value List Bracket</em>'.
   * @generated
   */
  MultiValueListBracket createMultiValueListBracket();

  /**
   * Returns a new object of class '<em>Build Requirements</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Build Requirements</em>'.
   * @generated
   */
  BuildRequirements createBuildRequirements();

  /**
   * Returns a new object of class '<em>Req Build Dependencies</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Req Build Dependencies</em>'.
   * @generated
   */
  ReqBuildDependencies createReqBuildDependencies();

  /**
   * Returns a new object of class '<em>Dependency Types</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dependency Types</em>'.
   * @generated
   */
  DependencyTypes createDependencyTypes();

  /**
   * Returns a new object of class '<em>Local Package</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local Package</em>'.
   * @generated
   */
  LocalPackage createLocalPackage();

  /**
   * Returns a new object of class '<em>Git Package</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Git Package</em>'.
   * @generated
   */
  GitPackage createGitPackage();

  /**
   * Returns a new object of class '<em>Req Dependency Repositories</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Req Dependency Repositories</em>'.
   * @generated
   */
  ReqDependencyRepositories createReqDependencyRepositories();

  /**
   * Returns a new object of class '<em>Apt Repository Instance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Apt Repository Instance</em>'.
   * @generated
   */
  AptRepositoryInstance createAptRepositoryInstance();

  /**
   * Returns a new object of class '<em>Stack Implementation Description</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stack Implementation Description</em>'.
   * @generated
   */
  StackImplementationDescription createStackImplementationDescription();

  /**
   * Returns a new object of class '<em>Package Description</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package Description</em>'.
   * @generated
   */
  PackageDescription createPackageDescription();

  /**
   * Returns a new object of class '<em>Image Description</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Image Description</em>'.
   * @generated
   */
  ImageDescription createImageDescription();

  /**
   * Returns a new object of class '<em>Repository Description</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Repository Description</em>'.
   * @generated
   */
  RepositoryDescription createRepositoryDescription();

  /**
   * Returns a new object of class '<em>Repository Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Repository Spec</em>'.
   * @generated
   */
  RepositorySpec createRepositorySpec();

  /**
   * Returns a new object of class '<em>Repository</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Repository</em>'.
   * @generated
   */
  Repository createRepository();

  /**
   * Returns a new object of class '<em>CI Setting</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CI Setting</em>'.
   * @generated
   */
  CISetting createCISetting();

  /**
   * Returns a new object of class '<em>Multi Monolithic Implementation Name List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multi Monolithic Implementation Name List</em>'.
   * @generated
   */
  MultiMonolithicImplementationNameList createMultiMonolithicImplementationNameList();

  /**
   * Returns a new object of class '<em>Multi Monolithic Implementation Name Pre List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multi Monolithic Implementation Name Pre List</em>'.
   * @generated
   */
  MultiMonolithicImplementationNamePreList createMultiMonolithicImplementationNamePreList();

  /**
   * Returns a new object of class '<em>Multi Monolithic Implementation Name List Bracket</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multi Monolithic Implementation Name List Bracket</em>'.
   * @generated
   */
  MultiMonolithicImplementationNameListBracket createMultiMonolithicImplementationNameListBracket();

  /**
   * Returns a new object of class '<em>CI Parameters</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CI Parameters</em>'.
   * @generated
   */
  CIParameters createCIParameters();

  /**
   * Returns a new object of class '<em>Grouped Properties</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Grouped Properties</em>'.
   * @generated
   */
  GroupedProperties createGroupedProperties();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DeployModelPackage getDeployModelPackage();

} //DeployModelFactory
