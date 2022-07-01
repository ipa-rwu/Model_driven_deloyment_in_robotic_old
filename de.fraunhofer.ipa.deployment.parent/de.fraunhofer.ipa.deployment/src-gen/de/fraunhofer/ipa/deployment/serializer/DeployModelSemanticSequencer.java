/*
 * generated by Xtext 2.27.0
 */
package de.fraunhofer.ipa.deployment.serializer;

import com.google.inject.Inject;
import de.fraunhofer.ipa.deployment.deployModel.AptRepositoryInstance;
import de.fraunhofer.ipa.deployment.deployModel.BuildRequirements;
import de.fraunhofer.ipa.deployment.deployModel.DeployModelPackage;
import de.fraunhofer.ipa.deployment.deployModel.DeploymentRequirements;
import de.fraunhofer.ipa.deployment.deployModel.GitPackage;
import de.fraunhofer.ipa.deployment.deployModel.ImageDescription;
import de.fraunhofer.ipa.deployment.deployModel.ImageTypeList;
import de.fraunhofer.ipa.deployment.deployModel.ImageVersionList;
import de.fraunhofer.ipa.deployment.deployModel.ImplementationArtifactAbstract;
import de.fraunhofer.ipa.deployment.deployModel.ImplementationArtifactDescription;
import de.fraunhofer.ipa.deployment.deployModel.ListStartCommands;
import de.fraunhofer.ipa.deployment.deployModel.LocalPackage;
import de.fraunhofer.ipa.deployment.deployModel.MonolithicImplementationDescription;
import de.fraunhofer.ipa.deployment.deployModel.NewImplementationArtifact;
import de.fraunhofer.ipa.deployment.deployModel.OperatingSystemTypeList;
import de.fraunhofer.ipa.deployment.deployModel.PackageDescription;
import de.fraunhofer.ipa.deployment.deployModel.ProcessorArchitectureTypeList;
import de.fraunhofer.ipa.deployment.deployModel.Repository;
import de.fraunhofer.ipa.deployment.deployModel.RepositoryDescription;
import de.fraunhofer.ipa.deployment.deployModel.RepositorySpec;
import de.fraunhofer.ipa.deployment.deployModel.ReqBuildDependencies;
import de.fraunhofer.ipa.deployment.deployModel.ReqDependencyRepositories;
import de.fraunhofer.ipa.deployment.deployModel.ReqOperatingSystem;
import de.fraunhofer.ipa.deployment.deployModel.ReqProcessorArchitecture;
import de.fraunhofer.ipa.deployment.deployModel.ReqRosDistro;
import de.fraunhofer.ipa.deployment.deployModel.ResourceRequirement;
import de.fraunhofer.ipa.deployment.deployModel.ResourceRequirements;
import de.fraunhofer.ipa.deployment.deployModel.ReuseImplementationArtifact;
import de.fraunhofer.ipa.deployment.deployModel.RosDistroList;
import de.fraunhofer.ipa.deployment.deployModel.StackImplementationDescription;
import de.fraunhofer.ipa.deployment.deployModel.StartCommands;
import de.fraunhofer.ipa.deployment.deployModel.Yaml;
import de.fraunhofer.ipa.deployment.deployModel.YamlContent;
import de.fraunhofer.ipa.deployment.services.DeployModelGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class DeployModelSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DeployModelGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DeployModelPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DeployModelPackage.APT_REPOSITORY_INSTANCE:
				sequence_AptRepositoryInstance(context, (AptRepositoryInstance) semanticObject); 
				return; 
			case DeployModelPackage.BUILD_REQUIREMENTS:
				sequence_BuildRequirements(context, (BuildRequirements) semanticObject); 
				return; 
			case DeployModelPackage.DEPLOYMENT_REQUIREMENTS:
				sequence_DeploymentRequirements(context, (DeploymentRequirements) semanticObject); 
				return; 
			case DeployModelPackage.GIT_PACKAGE:
				sequence_GitPackage(context, (GitPackage) semanticObject); 
				return; 
			case DeployModelPackage.IMAGE_DESCRIPTION:
				sequence_ImageDescription(context, (ImageDescription) semanticObject); 
				return; 
			case DeployModelPackage.IMAGE_TYPE_LIST:
				sequence_ImageTypeList(context, (ImageTypeList) semanticObject); 
				return; 
			case DeployModelPackage.IMAGE_VERSION_LIST:
				sequence_ImageVersionList(context, (ImageVersionList) semanticObject); 
				return; 
			case DeployModelPackage.IMPLEMENTATION_ARTIFACT_ABSTRACT:
				sequence_ImplementationArtifactAbstract(context, (ImplementationArtifactAbstract) semanticObject); 
				return; 
			case DeployModelPackage.IMPLEMENTATION_ARTIFACT_DESCRIPTION:
				sequence_ImplementationArtifactDescription(context, (ImplementationArtifactDescription) semanticObject); 
				return; 
			case DeployModelPackage.LIST_START_COMMANDS:
				sequence_ListStartCommands(context, (ListStartCommands) semanticObject); 
				return; 
			case DeployModelPackage.LOCAL_PACKAGE:
				sequence_LocalPackage(context, (LocalPackage) semanticObject); 
				return; 
			case DeployModelPackage.MONOLITHIC_IMPLEMENTATION_DESCRIPTION:
				sequence_MonolithicImplementationDescription(context, (MonolithicImplementationDescription) semanticObject); 
				return; 
			case DeployModelPackage.NEW_IMPLEMENTATION_ARTIFACT:
				sequence_NewImplementationArtifact(context, (NewImplementationArtifact) semanticObject); 
				return; 
			case DeployModelPackage.OPERATING_SYSTEM_TYPE_LIST:
				sequence_OperatingSystemTypeList(context, (OperatingSystemTypeList) semanticObject); 
				return; 
			case DeployModelPackage.PACKAGE_DESCRIPTION:
				sequence_PackageDescription(context, (PackageDescription) semanticObject); 
				return; 
			case DeployModelPackage.PROCESSOR_ARCHITECTURE_TYPE_LIST:
				sequence_ProcessorArchitectureTypeList(context, (ProcessorArchitectureTypeList) semanticObject); 
				return; 
			case DeployModelPackage.REPOSITORY:
				sequence_Repository(context, (Repository) semanticObject); 
				return; 
			case DeployModelPackage.REPOSITORY_DESCRIPTION:
				sequence_RepositoryDescription(context, (RepositoryDescription) semanticObject); 
				return; 
			case DeployModelPackage.REPOSITORY_SPEC:
				sequence_RepositorySpec(context, (RepositorySpec) semanticObject); 
				return; 
			case DeployModelPackage.REQ_BUILD_DEPENDENCIES:
				sequence_ReqBuildDependencies(context, (ReqBuildDependencies) semanticObject); 
				return; 
			case DeployModelPackage.REQ_DEPENDENCY_REPOSITORIES:
				sequence_ReqDependencyRepositories(context, (ReqDependencyRepositories) semanticObject); 
				return; 
			case DeployModelPackage.REQ_OPERATING_SYSTEM:
				sequence_ReqOperatingSystem(context, (ReqOperatingSystem) semanticObject); 
				return; 
			case DeployModelPackage.REQ_PROCESSOR_ARCHITECTURE:
				sequence_ReqProcessorArchitecture(context, (ReqProcessorArchitecture) semanticObject); 
				return; 
			case DeployModelPackage.REQ_ROS_DISTRO:
				sequence_ReqRosDistro(context, (ReqRosDistro) semanticObject); 
				return; 
			case DeployModelPackage.RESOURCE_REQUIREMENT:
				sequence_ResourceRequirement(context, (ResourceRequirement) semanticObject); 
				return; 
			case DeployModelPackage.RESOURCE_REQUIREMENTS:
				sequence_ResourceRequirements(context, (ResourceRequirements) semanticObject); 
				return; 
			case DeployModelPackage.REUSE_IMPLEMENTATION_ARTIFACT:
				sequence_ReuseImplementationArtifact(context, (ReuseImplementationArtifact) semanticObject); 
				return; 
			case DeployModelPackage.ROS_DISTRO_LIST:
				sequence_RosDistroList(context, (RosDistroList) semanticObject); 
				return; 
			case DeployModelPackage.STACK_IMPLEMENTATION_DESCRIPTION:
				sequence_StackImplementationDescription(context, (StackImplementationDescription) semanticObject); 
				return; 
			case DeployModelPackage.START_COMMANDS:
				sequence_StartCommands(context, (StartCommands) semanticObject); 
				return; 
			case DeployModelPackage.YAML:
				sequence_Yaml(context, (Yaml) semanticObject); 
				return; 
			case DeployModelPackage.YAML_CONTENT:
				sequence_YamlContent(context, (YamlContent) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     AptRepositoryInstance returns AptRepositoryInstance
	 *
	 * Constraint:
	 *     (name=ID keyLink=URL repositoryPath=URL updateRosDep=URL?)
	 * </pre>
	 */
	protected void sequence_AptRepositoryInstance(ISerializationContext context, AptRepositoryInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     BuildRequirements returns BuildRequirements
	 *
	 * Constraint:
	 *     (name='buildRequirements' buildDependencies=ReqBuildDependencies? dependencyRepositories=ReqDependencyRepositories?)
	 * </pre>
	 */
	protected void sequence_BuildRequirements(ISerializationContext context, BuildRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DeploymentRequirements returns DeploymentRequirements
	 *
	 * Constraint:
	 *     (name='deployRequirements' operatingSystem=ReqOperatingSystem processorArchitecture=ReqProcessorArchitecture rosDistro=ReqRosDistro?)
	 * </pre>
	 */
	protected void sequence_DeploymentRequirements(ISerializationContext context, DeploymentRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Dependency returns GitPackage
	 *     GitPackage returns GitPackage
	 *
	 * Constraint:
	 *     (path=URL name=ID branch=STRING?)
	 * </pre>
	 */
	protected void sequence_GitPackage(ISerializationContext context, GitPackage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ImageDescription returns ImageDescription
	 *
	 * Constraint:
	 *     (types+=ImageTypeList name=[MonolithicImplementationDescription|QualifiedName] imageVersions=ImageVersionList)
	 * </pre>
	 */
	protected void sequence_ImageDescription(ISerializationContext context, ImageDescription semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ImageTypeList returns ImageTypeList
	 *
	 * Constraint:
	 *     (children+=ImageTypes children+=ImageTypes*)
	 * </pre>
	 */
	protected void sequence_ImageTypeList(ISerializationContext context, ImageTypeList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ImageVersionList returns ImageVersionList
	 *
	 * Constraint:
	 *     (children+=ImageVersionTypes children+=ImageVersionTypes*)
	 * </pre>
	 */
	protected void sequence_ImageVersionList(ISerializationContext context, ImageVersionList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ImplementationArtifactAbstract returns ImplementationArtifactAbstract
	 *
	 * Constraint:
	 *     (importedNamespace=QualifiedName name=[MonolithicImplementationDescription|QualifiedName] startCommands=StartCommands)
	 * </pre>
	 */
	protected void sequence_ImplementationArtifactAbstract(ISerializationContext context, ImplementationArtifactAbstract semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DeployModelPackage.Literals.IMPLEMENTATION_ARTIFACT_ABSTRACT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeployModelPackage.Literals.IMPLEMENTATION_ARTIFACT_ABSTRACT__IMPORTED_NAMESPACE));
			if (transientValues.isValueTransient(semanticObject, DeployModelPackage.Literals.IMPLEMENTATION_ARTIFACT_ABSTRACT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeployModelPackage.Literals.IMPLEMENTATION_ARTIFACT_ABSTRACT__NAME));
			if (transientValues.isValueTransient(semanticObject, DeployModelPackage.Literals.IMPLEMENTATION_ARTIFACT_ABSTRACT__START_COMMANDS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeployModelPackage.Literals.IMPLEMENTATION_ARTIFACT_ABSTRACT__START_COMMANDS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImplementationArtifactAbstractAccess().getImportedNamespaceQualifiedNameParserRuleCall_2_0(), semanticObject.getImportedNamespace());
		feeder.accept(grammarAccess.getImplementationArtifactAbstractAccess().getNameMonolithicImplementationDescriptionQualifiedNameParserRuleCall_5_0_1(), semanticObject.eGet(DeployModelPackage.Literals.IMPLEMENTATION_ARTIFACT_ABSTRACT__NAME, false));
		feeder.accept(grammarAccess.getImplementationArtifactAbstractAccess().getStartCommandsStartCommandsParserRuleCall_6_0(), semanticObject.getStartCommands());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ImplementationArtifactDescription returns ImplementationArtifactDescription
	 *
	 * Constraint:
	 *     (type='ImplementationArtifactDescription' (impl=NewImplementationArtifact | impl=ReuseImplementationArtifact))
	 * </pre>
	 */
	protected void sequence_ImplementationArtifactDescription(ISerializationContext context, ImplementationArtifactDescription semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ListStartCommands returns ListStartCommands
	 *
	 * Constraint:
	 *     (children+=STRING children+=STRING*)
	 * </pre>
	 */
	protected void sequence_ListStartCommands(ISerializationContext context, ListStartCommands semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Dependency returns LocalPackage
	 *     LocalPackage returns LocalPackage
	 *
	 * Constraint:
	 *     (importedNamespace=QualifiedName name=[MonolithicImplementationDescription|QualifiedName])
	 * </pre>
	 */
	protected void sequence_LocalPackage(ISerializationContext context, LocalPackage semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DeployModelPackage.Literals.LOCAL_PACKAGE__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeployModelPackage.Literals.LOCAL_PACKAGE__IMPORTED_NAMESPACE));
			if (transientValues.isValueTransient(semanticObject, DeployModelPackage.Literals.LOCAL_PACKAGE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeployModelPackage.Literals.LOCAL_PACKAGE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLocalPackageAccess().getImportedNamespaceQualifiedNameParserRuleCall_2_0(), semanticObject.getImportedNamespace());
		feeder.accept(grammarAccess.getLocalPackageAccess().getNameMonolithicImplementationDescriptionQualifiedNameParserRuleCall_5_0_1(), semanticObject.eGet(DeployModelPackage.Literals.LOCAL_PACKAGE__NAME, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     MonolithicImplementationDescription returns MonolithicImplementationDescription
	 *
	 * Constraint:
	 *     (
	 *         type='MonolithicImplementationDescription:' 
	 *         name=QualifiedName 
	 *         impRosmodel=STRING? 
	 *         description=STRING 
	 *         mode=ImplementationModeType 
	 *         branch=BranchType 
	 *         impl=ImplementationArtifactDescription?
	 *     )
	 * </pre>
	 */
	protected void sequence_MonolithicImplementationDescription(ISerializationContext context, MonolithicImplementationDescription semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NewImplementationArtifact returns NewImplementationArtifact
	 *
	 * Constraint:
	 *     (
	 *         (name=LOCALPATH | name=URL) 
	 *         deployRequirements=DeploymentRequirements 
	 *         resourceRequirements=ResourceRequirements? 
	 *         buildRequirements=BuildRequirements? 
	 *         startCommands=StartCommands
	 *     )
	 * </pre>
	 */
	protected void sequence_NewImplementationArtifact(ISerializationContext context, NewImplementationArtifact semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     OperatingSystemTypeList returns OperatingSystemTypeList
	 *
	 * Constraint:
	 *     (children+=OperatingSystemTypes children+=OperatingSystemTypes*)
	 * </pre>
	 */
	protected void sequence_OperatingSystemTypeList(ISerializationContext context, OperatingSystemTypeList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     PackageDescription returns PackageDescription
	 *
	 * Constraint:
	 *     (type='PackageDescription' imageDescription=ImageDescription repositoryDescription=RepositoryDescription)
	 * </pre>
	 */
	protected void sequence_PackageDescription(ISerializationContext context, PackageDescription semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DeployModelPackage.Literals.PACKAGE_DESCRIPTION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeployModelPackage.Literals.PACKAGE_DESCRIPTION__TYPE));
			if (transientValues.isValueTransient(semanticObject, DeployModelPackage.Literals.PACKAGE_DESCRIPTION__IMAGE_DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeployModelPackage.Literals.PACKAGE_DESCRIPTION__IMAGE_DESCRIPTION));
			if (transientValues.isValueTransient(semanticObject, DeployModelPackage.Literals.PACKAGE_DESCRIPTION__REPOSITORY_DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeployModelPackage.Literals.PACKAGE_DESCRIPTION__REPOSITORY_DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPackageDescriptionAccess().getTypePackageDescriptionKeyword_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getPackageDescriptionAccess().getImageDescriptionImageDescriptionParserRuleCall_5_0(), semanticObject.getImageDescription());
		feeder.accept(grammarAccess.getPackageDescriptionAccess().getRepositoryDescriptionRepositoryDescriptionParserRuleCall_8_0(), semanticObject.getRepositoryDescription());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ProcessorArchitectureTypeList returns ProcessorArchitectureTypeList
	 *
	 * Constraint:
	 *     (children+=ProcessorArchitectureTypes children+=ProcessorArchitectureTypes*)
	 * </pre>
	 */
	protected void sequence_ProcessorArchitectureTypeList(ISerializationContext context, ProcessorArchitectureTypeList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     RepositoryDescription returns RepositoryDescription
	 *
	 * Constraint:
	 *     spec+=RepositorySpec+
	 * </pre>
	 */
	protected void sequence_RepositoryDescription(ISerializationContext context, RepositoryDescription semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     RepositorySpec returns RepositorySpec
	 *
	 * Constraint:
	 *     (name=ID repository=Repository)
	 * </pre>
	 */
	protected void sequence_RepositorySpec(ISerializationContext context, RepositorySpec semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DeployModelPackage.Literals.REPOSITORY_SPEC__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeployModelPackage.Literals.REPOSITORY_SPEC__NAME));
			if (transientValues.isValueTransient(semanticObject, DeployModelPackage.Literals.REPOSITORY_SPEC__REPOSITORY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeployModelPackage.Literals.REPOSITORY_SPEC__REPOSITORY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRepositorySpecAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRepositorySpecAccess().getRepositoryRepositoryParserRuleCall_4_0(), semanticObject.getRepository());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Repository returns Repository
	 *
	 * Constraint:
	 *     (type=RepositoryTypes path=STRING?)
	 * </pre>
	 */
	protected void sequence_Repository(ISerializationContext context, Repository semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ReqBuildDependencies returns ReqBuildDependencies
	 *
	 * Constraint:
	 *     (name='dependOn:' dependencies+=Dependency+)
	 * </pre>
	 */
	protected void sequence_ReqBuildDependencies(ISerializationContext context, ReqBuildDependencies semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ReqDependencyRepositories returns ReqDependencyRepositories
	 *
	 * Constraint:
	 *     (name='aptRepositories' children+=AptRepositoryInstance+)
	 * </pre>
	 */
	protected void sequence_ReqDependencyRepositories(ISerializationContext context, ReqDependencyRepositories semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ReqOperatingSystem returns ReqOperatingSystem
	 *
	 * Constraint:
	 *     (name='os' value=OperatingSystemTypeList)
	 * </pre>
	 */
	protected void sequence_ReqOperatingSystem(ISerializationContext context, ReqOperatingSystem semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DeployModelPackage.Literals.REQ_OPERATING_SYSTEM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeployModelPackage.Literals.REQ_OPERATING_SYSTEM__NAME));
			if (transientValues.isValueTransient(semanticObject, DeployModelPackage.Literals.REQ_OPERATING_SYSTEM__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeployModelPackage.Literals.REQ_OPERATING_SYSTEM__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getReqOperatingSystemAccess().getNameOsKeyword_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getReqOperatingSystemAccess().getValueOperatingSystemTypeListParserRuleCall_5_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ReqProcessorArchitecture returns ReqProcessorArchitecture
	 *
	 * Constraint:
	 *     (name='processor_architecture' value=ProcessorArchitectureTypeList)
	 * </pre>
	 */
	protected void sequence_ReqProcessorArchitecture(ISerializationContext context, ReqProcessorArchitecture semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DeployModelPackage.Literals.REQ_PROCESSOR_ARCHITECTURE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeployModelPackage.Literals.REQ_PROCESSOR_ARCHITECTURE__NAME));
			if (transientValues.isValueTransient(semanticObject, DeployModelPackage.Literals.REQ_PROCESSOR_ARCHITECTURE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeployModelPackage.Literals.REQ_PROCESSOR_ARCHITECTURE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getReqProcessorArchitectureAccess().getNameProcessor_architectureKeyword_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getReqProcessorArchitectureAccess().getValueProcessorArchitectureTypeListParserRuleCall_5_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ReqRosDistro returns ReqRosDistro
	 *
	 * Constraint:
	 *     (name='ros_distro' value=RosDistroList)
	 * </pre>
	 */
	protected void sequence_ReqRosDistro(ISerializationContext context, ReqRosDistro semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DeployModelPackage.Literals.REQ_ROS_DISTRO__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeployModelPackage.Literals.REQ_ROS_DISTRO__NAME));
			if (transientValues.isValueTransient(semanticObject, DeployModelPackage.Literals.REQ_ROS_DISTRO__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeployModelPackage.Literals.REQ_ROS_DISTRO__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getReqRosDistroAccess().getNameRos_distroKeyword_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getReqRosDistroAccess().getValueRosDistroListParserRuleCall_5_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ResourceRequirement returns ResourceRequirement
	 *
	 * Constraint:
	 *     (name=ResourceReqTypes value=ScalarNumber)
	 * </pre>
	 */
	protected void sequence_ResourceRequirement(ISerializationContext context, ResourceRequirement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DeployModelPackage.Literals.RESOURCE_REQUIREMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeployModelPackage.Literals.RESOURCE_REQUIREMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, DeployModelPackage.Literals.RESOURCE_REQUIREMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeployModelPackage.Literals.RESOURCE_REQUIREMENT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getResourceRequirementAccess().getNameResourceReqTypesEnumRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getResourceRequirementAccess().getValueScalarNumberParserRuleCall_5_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ResourceRequirements returns ResourceRequirements
	 *
	 * Constraint:
	 *     (name='resourceRequirements' requirements+=ResourceRequirement+)
	 * </pre>
	 */
	protected void sequence_ResourceRequirements(ISerializationContext context, ResourceRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ReuseImplementationArtifact returns ReuseImplementationArtifact
	 *
	 * Constraint:
	 *     lists+=ImplementationArtifactAbstract+
	 * </pre>
	 */
	protected void sequence_ReuseImplementationArtifact(ISerializationContext context, ReuseImplementationArtifact semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     RosDistroList returns RosDistroList
	 *
	 * Constraint:
	 *     (children+=RosDistro children+=RosDistro*)
	 * </pre>
	 */
	protected void sequence_RosDistroList(ISerializationContext context, RosDistroList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     StackImplementationDescription returns StackImplementationDescription
	 *
	 * Constraint:
	 *     (
	 *         type='StackImplementationDescription' 
	 *         name=QualifiedName 
	 *         impRosmodel=QualifiedName? 
	 *         description=STRING 
	 *         mode=ImplementationModeType 
	 *         impl=ImplementationArtifactDescription
	 *     )
	 * </pre>
	 */
	protected void sequence_StackImplementationDescription(ISerializationContext context, StackImplementationDescription semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     StartCommands returns StartCommands
	 *
	 * Constraint:
	 *     (name='startCommands:' startCommands=ListStartCommands)
	 * </pre>
	 */
	protected void sequence_StartCommands(ISerializationContext context, StartCommands semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DeployModelPackage.Literals.START_COMMANDS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeployModelPackage.Literals.START_COMMANDS__NAME));
			if (transientValues.isValueTransient(semanticObject, DeployModelPackage.Literals.START_COMMANDS__START_COMMANDS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeployModelPackage.Literals.START_COMMANDS__START_COMMANDS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStartCommandsAccess().getNameStartCommandsKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getStartCommandsAccess().getStartCommandsListStartCommandsParserRuleCall_1_0(), semanticObject.getStartCommands());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     YamlContent returns YamlContent
	 *
	 * Constraint:
	 *     (rootContent=MonolithicImplementationDescription | rootContent=StackImplementationDescription | rootContent=PackageDescription)
	 * </pre>
	 */
	protected void sequence_YamlContent(ISerializationContext context, YamlContent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Yaml returns Yaml
	 *
	 * Constraint:
	 *     content+=YamlContent*
	 * </pre>
	 */
	protected void sequence_Yaml(ISerializationContext context, Yaml semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}