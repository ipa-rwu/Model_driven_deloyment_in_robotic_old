/*
 * generated by Xtext 2.27.0
 */
package de.fraunhofer.ipa.deployment.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import de.fraunhofer.ipa.deployment.ide.contentassist.antlr.internal.InternalDeployModelParser;
import de.fraunhofer.ipa.deployment.services.DeployModelGrammarAccess;
import java.util.Map;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class DeployModelParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(DeployModelGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, DeployModelGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getYamlContentAccess().getRootContentAlternatives_0(), "rule__YamlContent__RootContentAlternatives_0");
			builder.put(grammarAccess.getBranchTypeAccess().getAlternatives(), "rule__BranchType__Alternatives");
			builder.put(grammarAccess.getNewImplementationArtifactAccess().getLocationAlternatives_2_0(), "rule__NewImplementationArtifact__LocationAlternatives_2_0");
			builder.put(grammarAccess.getImplementationArtifactDescriptionAccess().getImplAlternatives_1_0(), "rule__ImplementationArtifactDescription__ImplAlternatives_1_0");
			builder.put(grammarAccess.getPropertyExpressTypeAccess().getAlternatives(), "rule__PropertyExpressType__Alternatives");
			builder.put(grammarAccess.getMultiValueListAccess().getAlternatives(), "rule__MultiValueList__Alternatives");
			builder.put(grammarAccess.getValueTypesAccess().getAlternatives(), "rule__ValueTypes__Alternatives");
			builder.put(grammarAccess.getDependencyTypesAccess().getAlternatives(), "rule__DependencyTypes__Alternatives");
			builder.put(grammarAccess.getMultiMonolithicImplementationNameListAccess().getAlternatives(), "rule__MultiMonolithicImplementationNameList__Alternatives");
			builder.put(grammarAccess.getNumberAccess().getAlternatives(), "rule__Number__Alternatives");
			builder.put(grammarAccess.getUnitAccess().getAlternatives(), "rule__Unit__Alternatives");
			builder.put(grammarAccess.getScalarUnitSizeAccess().getAlternatives(), "rule__ScalarUnitSize__Alternatives");
			builder.put(grammarAccess.getScalarUnitTimeAccess().getAlternatives(), "rule__ScalarUnitTime__Alternatives");
			builder.put(grammarAccess.getScalarUnitFrequencyAccess().getAlternatives(), "rule__ScalarUnitFrequency__Alternatives");
			builder.put(grammarAccess.getImplementationModeTypeAccess().getAlternatives(), "rule__ImplementationModeType__Alternatives");
			builder.put(grammarAccess.getBOOLEANAccess().getAlternatives(), "rule__BOOLEAN__Alternatives");
			builder.put(grammarAccess.getYamlAccess().getGroup(), "rule__Yaml__Group__0");
			builder.put(grammarAccess.getMonolithicImplementationDescriptionAccess().getGroup(), "rule__MonolithicImplementationDescription__Group__0");
			builder.put(grammarAccess.getMonolithicImplementationDescriptionAccess().getGroup_4(), "rule__MonolithicImplementationDescription__Group_4__0");
			builder.put(grammarAccess.getMonolithicImplementationDescriptionAccess().getGroup_11(), "rule__MonolithicImplementationDescription__Group_11__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
			builder.put(grammarAccess.getNewImplementationArtifactAccess().getGroup(), "rule__NewImplementationArtifact__Group__0");
			builder.put(grammarAccess.getNewImplementationArtifactAccess().getGroup_5(), "rule__NewImplementationArtifact__Group_5__0");
			builder.put(grammarAccess.getNewImplementationArtifactAccess().getGroup_6(), "rule__NewImplementationArtifact__Group_6__0");
			builder.put(grammarAccess.getNewImplementationArtifactAccess().getGroup_7(), "rule__NewImplementationArtifact__Group_7__0");
			builder.put(grammarAccess.getImplementationArtifactDescriptionAccess().getGroup(), "rule__ImplementationArtifactDescription__Group__0");
			builder.put(grammarAccess.getReuseImplementationArtifactAccess().getGroup(), "rule__ReuseImplementationArtifact__Group__0");
			builder.put(grammarAccess.getImplementationArtifactAbstractAccess().getGroup(), "rule__ImplementationArtifactAbstract__Group__0");
			builder.put(grammarAccess.getImplementationArtifactAbstractAccess().getGroup_6(), "rule__ImplementationArtifactAbstract__Group_6__0");
			builder.put(grammarAccess.getDeploymentRequirementsAccess().getGroup(), "rule__DeploymentRequirements__Group__0");
			builder.put(grammarAccess.getResourceRequirementsAccess().getGroup(), "rule__ResourceRequirements__Group__0");
			builder.put(grammarAccess.getCommonPropertySingleValueAccess().getGroup(), "rule__CommonPropertySingleValue__Group__0");
			builder.put(grammarAccess.getCommonPropertyMultiValueAccess().getGroup(), "rule__CommonPropertyMultiValue__Group__0");
			builder.put(grammarAccess.getMultiValueListPreListAccess().getGroup(), "rule__MultiValueListPreList__Group__0");
			builder.put(grammarAccess.getMultiValueListPreListAccess().getGroup_2(), "rule__MultiValueListPreList__Group_2__0");
			builder.put(grammarAccess.getMultiValueListBracketAccess().getGroup(), "rule__MultiValueListBracket__Group__0");
			builder.put(grammarAccess.getMultiValueListBracketAccess().getGroup_2(), "rule__MultiValueListBracket__Group_2__0");
			builder.put(grammarAccess.getBuildRequirementsAccess().getGroup(), "rule__BuildRequirements__Group__0");
			builder.put(grammarAccess.getBuildRequirementsAccess().getGroup_4(), "rule__BuildRequirements__Group_4__0");
			builder.put(grammarAccess.getBuildRequirementsAccess().getGroup_5(), "rule__BuildRequirements__Group_5__0");
			builder.put(grammarAccess.getBuildRequirementsAccess().getGroup_6(), "rule__BuildRequirements__Group_6__0");
			builder.put(grammarAccess.getBuildRequirementsAccess().getGroup_7(), "rule__BuildRequirements__Group_7__0");
			builder.put(grammarAccess.getReqBuildDependenciesAccess().getGroup(), "rule__ReqBuildDependencies__Group__0");
			builder.put(grammarAccess.getLocalPackageAccess().getGroup(), "rule__LocalPackage__Group__0");
			builder.put(grammarAccess.getGitPackageAccess().getGroup(), "rule__GitPackage__Group__0");
			builder.put(grammarAccess.getGitPackageAccess().getGroup_6(), "rule__GitPackage__Group_6__0");
			builder.put(grammarAccess.getReqDependencyRepositoriesAccess().getGroup(), "rule__ReqDependencyRepositories__Group__0");
			builder.put(grammarAccess.getAptRepositoryInstanceAccess().getGroup(), "rule__AptRepositoryInstance__Group__0");
			builder.put(grammarAccess.getAptRepositoryInstanceAccess().getGroup_8(), "rule__AptRepositoryInstance__Group_8__0");
			builder.put(grammarAccess.getStackImplementationDescriptionAccess().getGroup(), "rule__StackImplementationDescription__Group__0");
			builder.put(grammarAccess.getStackImplementationDescriptionAccess().getGroup_4(), "rule__StackImplementationDescription__Group_4__0");
			builder.put(grammarAccess.getPackageDescriptionAccess().getGroup(), "rule__PackageDescription__Group__0");
			builder.put(grammarAccess.getImageDescriptionAccess().getGroup(), "rule__ImageDescription__Group__0");
			builder.put(grammarAccess.getRepositoryDescriptionAccess().getGroup(), "rule__RepositoryDescription__Group__0");
			builder.put(grammarAccess.getRepositorySpecAccess().getGroup(), "rule__RepositorySpec__Group__0");
			builder.put(grammarAccess.getRepositoryAccess().getGroup(), "rule__Repository__Group__0");
			builder.put(grammarAccess.getRepositoryAccess().getGroup_2(), "rule__Repository__Group_2__0");
			builder.put(grammarAccess.getCISettingAccess().getGroup(), "rule__CISetting__Group__0");
			builder.put(grammarAccess.getMultiMonolithicImplementationNamePreListAccess().getGroup(), "rule__MultiMonolithicImplementationNamePreList__Group__0");
			builder.put(grammarAccess.getMultiMonolithicImplementationNamePreListAccess().getGroup_2(), "rule__MultiMonolithicImplementationNamePreList__Group_2__0");
			builder.put(grammarAccess.getMultiMonolithicImplementationNameListBracketAccess().getGroup(), "rule__MultiMonolithicImplementationNameListBracket__Group__0");
			builder.put(grammarAccess.getMultiMonolithicImplementationNameListBracketAccess().getGroup_2(), "rule__MultiMonolithicImplementationNameListBracket__Group_2__0");
			builder.put(grammarAccess.getCIParametersAccess().getGroup(), "rule__CIParameters__Group__0");
			builder.put(grammarAccess.getGroupedPropertiesAccess().getGroup(), "rule__GroupedProperties__Group__0");
			builder.put(grammarAccess.getScalarNumberAccess().getGroup(), "rule__ScalarNumber__Group__0");
			builder.put(grammarAccess.getScalarUnitSizeAccess().getGroup_1(), "rule__ScalarUnitSize__Group_1__0");
			builder.put(grammarAccess.getYamlAccess().getContentAssignment_1(), "rule__Yaml__ContentAssignment_1");
			builder.put(grammarAccess.getYamlContentAccess().getRootContentAssignment(), "rule__YamlContent__RootContentAssignment");
			builder.put(grammarAccess.getMonolithicImplementationDescriptionAccess().getTypeAssignment_0(), "rule__MonolithicImplementationDescription__TypeAssignment_0");
			builder.put(grammarAccess.getMonolithicImplementationDescriptionAccess().getNameAssignment_3(), "rule__MonolithicImplementationDescription__NameAssignment_3");
			builder.put(grammarAccess.getMonolithicImplementationDescriptionAccess().getImpRosmodelAssignment_4_1(), "rule__MonolithicImplementationDescription__ImpRosmodelAssignment_4_1");
			builder.put(grammarAccess.getMonolithicImplementationDescriptionAccess().getDescriptionAssignment_6(), "rule__MonolithicImplementationDescription__DescriptionAssignment_6");
			builder.put(grammarAccess.getMonolithicImplementationDescriptionAccess().getModeAssignment_8(), "rule__MonolithicImplementationDescription__ModeAssignment_8");
			builder.put(grammarAccess.getMonolithicImplementationDescriptionAccess().getBranchAssignment_10(), "rule__MonolithicImplementationDescription__BranchAssignment_10");
			builder.put(grammarAccess.getMonolithicImplementationDescriptionAccess().getImplementationAssignment_11_1(), "rule__MonolithicImplementationDescription__ImplementationAssignment_11_1");
			builder.put(grammarAccess.getNewImplementationArtifactAccess().getLocationAssignment_2(), "rule__NewImplementationArtifact__LocationAssignment_2");
			builder.put(grammarAccess.getNewImplementationArtifactAccess().getDeployRequirementsAssignment_4(), "rule__NewImplementationArtifact__DeployRequirementsAssignment_4");
			builder.put(grammarAccess.getNewImplementationArtifactAccess().getResourceRequirementsAssignment_5_1(), "rule__NewImplementationArtifact__ResourceRequirementsAssignment_5_1");
			builder.put(grammarAccess.getNewImplementationArtifactAccess().getBuildRequirementsAssignment_6_1(), "rule__NewImplementationArtifact__BuildRequirementsAssignment_6_1");
			builder.put(grammarAccess.getNewImplementationArtifactAccess().getStartCommandsAssignment_7_1(), "rule__NewImplementationArtifact__StartCommandsAssignment_7_1");
			builder.put(grammarAccess.getImplementationArtifactDescriptionAccess().getImplAssignment_1(), "rule__ImplementationArtifactDescription__ImplAssignment_1");
			builder.put(grammarAccess.getReuseImplementationArtifactAccess().getListsAssignment_1(), "rule__ReuseImplementationArtifact__ListsAssignment_1");
			builder.put(grammarAccess.getImplementationArtifactAbstractAccess().getImportedNamespaceAssignment_2(), "rule__ImplementationArtifactAbstract__ImportedNamespaceAssignment_2");
			builder.put(grammarAccess.getImplementationArtifactAbstractAccess().getNameAssignment_5(), "rule__ImplementationArtifactAbstract__NameAssignment_5");
			builder.put(grammarAccess.getImplementationArtifactAbstractAccess().getStartCommandsAssignment_6_1(), "rule__ImplementationArtifactAbstract__StartCommandsAssignment_6_1");
			builder.put(grammarAccess.getDeploymentRequirementsAccess().getRequirementsAssignment_2(), "rule__DeploymentRequirements__RequirementsAssignment_2");
			builder.put(grammarAccess.getResourceRequirementsAccess().getRequirementsAssignment_2(), "rule__ResourceRequirements__RequirementsAssignment_2");
			builder.put(grammarAccess.getCommonPropertySingleValueAccess().getNameAssignment_2(), "rule__CommonPropertySingleValue__NameAssignment_2");
			builder.put(grammarAccess.getCommonPropertySingleValueAccess().getValueAssignment_5(), "rule__CommonPropertySingleValue__ValueAssignment_5");
			builder.put(grammarAccess.getCommonPropertyMultiValueAccess().getNameAssignment_2(), "rule__CommonPropertyMultiValue__NameAssignment_2");
			builder.put(grammarAccess.getCommonPropertyMultiValueAccess().getValueAssignment_5(), "rule__CommonPropertyMultiValue__ValueAssignment_5");
			builder.put(grammarAccess.getMultiValueListPreListAccess().getValuesAssignment_2_1(), "rule__MultiValueListPreList__ValuesAssignment_2_1");
			builder.put(grammarAccess.getMultiValueListBracketAccess().getValuesAssignment_1(), "rule__MultiValueListBracket__ValuesAssignment_1");
			builder.put(grammarAccess.getMultiValueListBracketAccess().getValuesAssignment_2_1(), "rule__MultiValueListBracket__ValuesAssignment_2_1");
			builder.put(grammarAccess.getBuildRequirementsAccess().getReqRosDistrosAssignment_3(), "rule__BuildRequirements__ReqRosDistrosAssignment_3");
			builder.put(grammarAccess.getBuildRequirementsAccess().getReqTestRosDistrosAssignment_4_1(), "rule__BuildRequirements__ReqTestRosDistrosAssignment_4_1");
			builder.put(grammarAccess.getBuildRequirementsAccess().getReqBuildDependenciesAssignment_5_1(), "rule__BuildRequirements__ReqBuildDependenciesAssignment_5_1");
			builder.put(grammarAccess.getBuildRequirementsAccess().getReqDependencyRepositoriesAssignment_6_1(), "rule__BuildRequirements__ReqDependencyRepositoriesAssignment_6_1");
			builder.put(grammarAccess.getBuildRequirementsAccess().getReqCMakeArgsAssignment_7_1(), "rule__BuildRequirements__ReqCMakeArgsAssignment_7_1");
			builder.put(grammarAccess.getReqBuildDependenciesAccess().getDependenciesAssignment_2(), "rule__ReqBuildDependencies__DependenciesAssignment_2");
			builder.put(grammarAccess.getLocalPackageAccess().getNameAssignment_2(), "rule__LocalPackage__NameAssignment_2");
			builder.put(grammarAccess.getGitPackageAccess().getNameAssignment_2(), "rule__GitPackage__NameAssignment_2");
			builder.put(grammarAccess.getGitPackageAccess().getPathAssignment_5(), "rule__GitPackage__PathAssignment_5");
			builder.put(grammarAccess.getGitPackageAccess().getVisibilityAssignment_6_1(), "rule__GitPackage__VisibilityAssignment_6_1");
			builder.put(grammarAccess.getReqDependencyRepositoriesAccess().getChildrenAssignment_1(), "rule__ReqDependencyRepositories__ChildrenAssignment_1");
			builder.put(grammarAccess.getAptRepositoryInstanceAccess().getNameAssignment_2(), "rule__AptRepositoryInstance__NameAssignment_2");
			builder.put(grammarAccess.getAptRepositoryInstanceAccess().getKeyLinkAssignment_5(), "rule__AptRepositoryInstance__KeyLinkAssignment_5");
			builder.put(grammarAccess.getAptRepositoryInstanceAccess().getRepositoryPathAssignment_7(), "rule__AptRepositoryInstance__RepositoryPathAssignment_7");
			builder.put(grammarAccess.getAptRepositoryInstanceAccess().getUpdateRosDepAssignment_8_1(), "rule__AptRepositoryInstance__UpdateRosDepAssignment_8_1");
			builder.put(grammarAccess.getStackImplementationDescriptionAccess().getTypeAssignment_0(), "rule__StackImplementationDescription__TypeAssignment_0");
			builder.put(grammarAccess.getStackImplementationDescriptionAccess().getNameAssignment_3(), "rule__StackImplementationDescription__NameAssignment_3");
			builder.put(grammarAccess.getStackImplementationDescriptionAccess().getImpRosmodelAssignment_4_1(), "rule__StackImplementationDescription__ImpRosmodelAssignment_4_1");
			builder.put(grammarAccess.getStackImplementationDescriptionAccess().getDescriptionAssignment_6(), "rule__StackImplementationDescription__DescriptionAssignment_6");
			builder.put(grammarAccess.getStackImplementationDescriptionAccess().getModeAssignment_8(), "rule__StackImplementationDescription__ModeAssignment_8");
			builder.put(grammarAccess.getStackImplementationDescriptionAccess().getImplAssignment_10(), "rule__StackImplementationDescription__ImplAssignment_10");
			builder.put(grammarAccess.getPackageDescriptionAccess().getTypeAssignment_0(), "rule__PackageDescription__TypeAssignment_0");
			builder.put(grammarAccess.getPackageDescriptionAccess().getImageDescriptionAssignment_5(), "rule__PackageDescription__ImageDescriptionAssignment_5");
			builder.put(grammarAccess.getPackageDescriptionAccess().getRepositoryDescriptionAssignment_8(), "rule__PackageDescription__RepositoryDescriptionAssignment_8");
			builder.put(grammarAccess.getImageDescriptionAccess().getTypesAssignment_1(), "rule__ImageDescription__TypesAssignment_1");
			builder.put(grammarAccess.getImageDescriptionAccess().getNameAssignment_3(), "rule__ImageDescription__NameAssignment_3");
			builder.put(grammarAccess.getImageDescriptionAccess().getImageTagsAssignment_5(), "rule__ImageDescription__ImageTagsAssignment_5");
			builder.put(grammarAccess.getRepositoryDescriptionAccess().getSpecAssignment_1(), "rule__RepositoryDescription__SpecAssignment_1");
			builder.put(grammarAccess.getRepositorySpecAccess().getNameAssignment_2(), "rule__RepositorySpec__NameAssignment_2");
			builder.put(grammarAccess.getRepositorySpecAccess().getRepositoryAssignment_4(), "rule__RepositorySpec__RepositoryAssignment_4");
			builder.put(grammarAccess.getRepositoryAccess().getTypeAssignment_1(), "rule__Repository__TypeAssignment_1");
			builder.put(grammarAccess.getRepositoryAccess().getPathAssignment_2_1(), "rule__Repository__PathAssignment_2_1");
			builder.put(grammarAccess.getCISettingAccess().getTypeAssignment_0(), "rule__CISetting__TypeAssignment_0");
			builder.put(grammarAccess.getCISettingAccess().getCiTypesAssignment_3(), "rule__CISetting__CiTypesAssignment_3");
			builder.put(grammarAccess.getCISettingAccess().getAppliedReposAssignment_5(), "rule__CISetting__AppliedReposAssignment_5");
			builder.put(grammarAccess.getCISettingAccess().getReqBranchPrefixAssignment_7(), "rule__CISetting__ReqBranchPrefixAssignment_7");
			builder.put(grammarAccess.getCISettingAccess().getCiParametersAssignment_8(), "rule__CISetting__CiParametersAssignment_8");
			builder.put(grammarAccess.getMultiMonolithicImplementationNamePreListAccess().getValuesAssignment_2_1(), "rule__MultiMonolithicImplementationNamePreList__ValuesAssignment_2_1");
			builder.put(grammarAccess.getMultiMonolithicImplementationNameListBracketAccess().getValuesAssignment_1(), "rule__MultiMonolithicImplementationNameListBracket__ValuesAssignment_1");
			builder.put(grammarAccess.getMultiMonolithicImplementationNameListBracketAccess().getValuesAssignment_2_1(), "rule__MultiMonolithicImplementationNameListBracket__ValuesAssignment_2_1");
			builder.put(grammarAccess.getCIParametersAccess().getTypeAssignment_0(), "rule__CIParameters__TypeAssignment_0");
			builder.put(grammarAccess.getCIParametersAccess().getParametersAssignment_3(), "rule__CIParameters__ParametersAssignment_3");
			builder.put(grammarAccess.getGroupedPropertiesAccess().getTypeAssignment_0(), "rule__GroupedProperties__TypeAssignment_0");
			builder.put(grammarAccess.getGroupedPropertiesAccess().getPropertiesAssignment_3(), "rule__GroupedProperties__PropertiesAssignment_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private DeployModelGrammarAccess grammarAccess;

	@Override
	protected InternalDeployModelParser createParser() {
		InternalDeployModelParser result = new InternalDeployModelParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected TokenSource createLexer(CharStream stream) {
		return new DeployModelTokenSource(super.createLexer(stream));
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DeployModelGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DeployModelGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
