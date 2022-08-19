package de.fraunhofer.ipa.deployment.generator;

import com.google.common.base.CaseFormat;
import com.google.common.base.Objects;
import de.fraunhofer.ipa.deployment.deployModel.BuildRequirements;
import de.fraunhofer.ipa.deployment.deployModel.CIParameters;
import de.fraunhofer.ipa.deployment.deployModel.CISetting;
import de.fraunhofer.ipa.deployment.deployModel.DependencyTypes;
import de.fraunhofer.ipa.deployment.deployModel.GitPackage;
import de.fraunhofer.ipa.deployment.deployModel.GroupedProperties;
import de.fraunhofer.ipa.deployment.deployModel.MonolithicImplementationDescription;
import de.fraunhofer.ipa.deployment.deployModel.MultiValueList;
import de.fraunhofer.ipa.deployment.deployModel.PackageDescription;
import de.fraunhofer.ipa.deployment.deployModel.PropertyExpressType;
import de.fraunhofer.ipa.deployment.deployModel.ReqBuildDependencies;
import de.fraunhofer.ipa.deployment.deployModel.impl.CommonPropertyMultiValueImpl;
import de.fraunhofer.ipa.deployment.deployModel.impl.CommonPropertySingleValueImpl;
import de.fraunhofer.ipa.deployment.deployModel.impl.MultiValueListBracketImpl;
import de.fraunhofer.ipa.deployment.deployModel.impl.MultiValueListPreListImpl;
import de.fraunhofer.ipa.deployment.utils.DeployModelUtils;
import de.fraunhofer.ipa.deployment.validation.CommonRules;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class GitLabCICompiler {
  private DeployModelUtils utils = new DeployModelUtils();

  private CIGeneratorHelper ciHelper = new CIGeneratorHelper();

  private List<String> commonVariableList = this.ciHelper.setEnvVaribalesCommon();

  private boolean dockerRunnerSaveCacheFlag = false;

  private boolean dockerRunnerNoCacheFlag = false;

  private boolean simpleRunnerFlag = false;

  private String builderRepo = "ghcr.io/ipa-rwu/";

  public CharSequence compileGitlabCI(final MonolithicImplementationDescription monImpl) {
    StringConcatenation _builder = new StringConcatenation();
    final Function1<String, String> _function = new Function1<String, String>() {
      public String apply(final String it) {
        return it;
      }
    };
    final Function1<String, String> _function_1 = new Function1<String, String>() {
      public String apply(final String it) {
        return "\"\"";
      }
    };
    final Map<String, String> variableMap = IterableExtensions.<String, String, String>toMap(this.commonVariableList, _function, _function_1);
    _builder.newLineIfNotEmpty();
    CharSequence _addVariables = this.addVariables(variableMap, monImpl);
    _builder.append(_addVariables);
    _builder.newLineIfNotEmpty();
    return _builder;
  }

  public CharSequence compileGitlabCI(final MonolithicImplementationDescription monImpl, final PackageDescription pkgDes, final CISetting ciSetting) {
    StringConcatenation _builder = new StringConcatenation();
    final Function1<String, String> _function = new Function1<String, String>() {
      public String apply(final String it) {
        return it;
      }
    };
    final Function1<String, String> _function_1 = new Function1<String, String>() {
      public String apply(final String it) {
        return "\"\"";
      }
    };
    final Map<String, String> variableMap = IterableExtensions.<String, String, String>toMap(this.commonVariableList, _function, _function_1);
    _builder.newLineIfNotEmpty();
    CharSequence _addVariables = this.addVariables(variableMap, monImpl, pkgDes, ciSetting);
    _builder.append(_addVariables);
    _builder.newLineIfNotEmpty();
    CharSequence _addCommonBlock = this.addCommonBlock(pkgDes, ciSetting);
    _builder.append(_addCommonBlock);
    _builder.newLineIfNotEmpty();
    {
      String _reqBranchPrefix = ciSetting.getReqBranchPrefix();
      String _camelToLowerUnderscore = DeployModelUtils.camelToLowerUnderscore(CommonRules.BranchPrefixTypes.None.name());
      boolean _equals = Objects.equal(_reqBranchPrefix, _camelToLowerUnderscore);
      if (_equals) {
        CharSequence _findRosDistroFromBranchPrefix = this.findRosDistroFromBranchPrefix();
        _builder.append(_findRosDistroFromBranchPrefix);
        _builder.newLineIfNotEmpty();
      }
    }
    CharSequence _commonBuild = this.commonBuild();
    _builder.append(_commonBuild);
    _builder.newLineIfNotEmpty();
    CharSequence _build = this.build(monImpl, ciSetting);
    _builder.append(_build);
    _builder.newLineIfNotEmpty();
    CharSequence _commonPublish = this.commonPublish();
    _builder.append(_commonPublish);
    _builder.newLineIfNotEmpty();
    CharSequence _publish = this.publish(monImpl, pkgDes, ciSetting);
    _builder.append(_publish);
    _builder.newLineIfNotEmpty();
    return _builder;
  }

  /**
   * fill Variables
   */
  public String fillVaribalesFromMonImpl(final Map<String, String> variableMap, final MonolithicImplementationDescription monImpl) {
    String _xblockexpression = null;
    {
      variableMap.put("PREFIX", "\"${CI_REGISTRY_IMAGE}/${CI_PIPELINE_ID}:\"");
      variableMap.put("BUILDER_PREFIX", String.format("\"%s\"", this.builderRepo));
      variableMap.put("BUILDER_SUFFIX", "\":latest\"");
      variableMap.put("FOLDER", "${CI_JOB_NAME}");
      variableMap.put("NAME", "${CI_JOB_NAME}");
      variableMap.put("DOCKER_BUILDKIT", "1");
      this.setVariableDockerTLS(variableMap, "");
      this.setVariableROSDistros(variableMap, monImpl.getImplementation().getBuildRequirements().getReqRosDistros().getValues());
      ReqBuildDependencies _reqBuildDependencies = monImpl.getImplementation().getBuildRequirements().getReqBuildDependencies();
      boolean _tripleNotEquals = (_reqBuildDependencies != null);
      if (_tripleNotEquals) {
        EList<DependencyTypes> _dependencies = monImpl.getImplementation().getBuildRequirements().getReqBuildDependencies().getDependencies();
        for (final DependencyTypes dep : _dependencies) {
          Class<? extends DependencyTypes> _class = dep.getClass();
          boolean _equals = Objects.equal(_class, GitPackage.class);
          if (_equals) {
            this.setVariablePrivateRepoToken(variableMap, ((GitPackage) dep).getVisibility());
          }
        }
      }
      String _xifexpression = null;
      MultiValueList _reqCMakeArgs = monImpl.getImplementation().getBuildRequirements().getReqCMakeArgs();
      boolean _tripleNotEquals_1 = (_reqCMakeArgs != null);
      if (_tripleNotEquals_1) {
        _xifexpression = this.setVariableCMakeArgs(variableMap, monImpl.getImplementation().getBuildRequirements().getReqCMakeArgs().getValues());
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }

  public EList<String> getObjectListValues(final Object object) {
    Class<?> _class = object.getClass();
    boolean _equals = Objects.equal(_class, MultiValueListBracketImpl.class);
    if (_equals) {
      return ((MultiValueListBracketImpl) object).getValues();
    }
    Class<?> _class_1 = object.getClass();
    boolean _equals_1 = Objects.equal(_class_1, MultiValueListPreListImpl.class);
    if (_equals_1) {
      return ((MultiValueListPreListImpl) object).getValues();
    }
    return null;
  }

  public void fillVaribalesFromPackage(final Map<String, String> variableMap, final PackageDescription pkg) {
    EList<String> _values = pkg.getImageDescription().getTypes().getValues();
    for (final String v : _values) {
      String _to = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, v);
      String _name = CommonRules.CreatedImageTypes.Docker.name();
      boolean _equals = Objects.equal(_to, _name);
      if (_equals) {
        this.setVariableDockerImageTag(variableMap, pkg.getImageDescription().getImageTags().getValues());
      }
    }
  }

  public String fillVaribalesFromCiSetting(final Map<String, String> variableMap, final CISetting setting, final EList<String> distros) {
    return this.setVariableROSDistros(variableMap, setting.getReqBranchPrefix(), distros);
  }

  public String setVariableROSDistros(final Map<String, String> variableMap, final EList<String> distros) {
    String _xifexpression = null;
    int _length = ((Object[])Conversions.unwrapArray(distros, Object.class)).length;
    boolean _equals = (_length == 1);
    if (_equals) {
      _xifexpression = variableMap.put("ROS_DISTRO", distros.get(0));
    }
    return _xifexpression;
  }

  public String setVariableROSDistros(final Map<String, String> variableMap, final String branchPrefixType, final EList<String> distros) {
    String _xblockexpression = null;
    {
      boolean _equals = branchPrefixType.equals(DeployModelUtils.camelToLowerUnderscore(CommonRules.BranchPrefixTypes.RosDistro.name()));
      if (_equals) {
        variableMap.put("ROS_DISTROS", 
          distros.stream().collect(Collectors.joining(" ")));
        variableMap.put("ROS_DISTRO", "\"\"");
      }
      String _xifexpression = null;
      boolean _equals_1 = branchPrefixType.equals(DeployModelUtils.camelToLowerUnderscore(CommonRules.BranchPrefixTypes.RosVersion.name()));
      if (_equals_1) {
        _xifexpression = variableMap.put("DEFAULT_ROS_DISTROS", 
          distros.stream().collect(Collectors.joining(" ")));
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }

  public ArrayList<String> getAllRosDistros(final BuildRequirements req) {
    final List<String> rosVersions = DeployModelUtils.<CommonRules.RosVersions>enumToList(CommonRules.RosVersions.class);
    final List<String> rosDistros = DeployModelUtils.<CommonRules.RosDistros>enumToList(CommonRules.RosDistros.class);
    ArrayList<String> distros = CollectionLiterals.<String>newArrayList();
    MultiValueList _reqTestRosDistros = req.getReqTestRosDistros();
    boolean _tripleNotEquals = (_reqTestRosDistros != null);
    if (_tripleNotEquals) {
      EList<String> _values = req.getReqTestRosDistros().getValues();
      for (final String distro : _values) {
        {
          boolean _contains = rosVersions.contains(distro);
          if (_contains) {
            distros.addAll(CommonRules.RosDistros.getRosDistrosByVersionToString(distro));
          }
          boolean _contains_1 = rosDistros.contains(distro);
          if (_contains_1) {
            distros.add(distro);
          }
        }
      }
    }
    EList<String> buildDistros = req.getReqRosDistros().getValues();
    for (final String x : buildDistros) {
      boolean _contains = distros.contains(x);
      boolean _not = (!_contains);
      if (_not) {
        distros.add(x);
      }
    }
    return distros;
  }

  public CharSequence setRosDistroMatrix(final List<String> rosDistross) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("parallel:");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("matrix:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- ROS_DISTRO:");
    _builder.newLine();
    {
      for(final String distro : rosDistross) {
        _builder.append("    \t");
        _builder.append("- ");
        _builder.append(distro, "    \t");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }

  public String setVariablePrivateRepoToken(final Map<String, String> variableMap, final String visibility) {
    String _xifexpression = null;
    String _name = CommonRules.RepoVisibility.Privat.name();
    boolean _equals = Objects.equal(visibility, _name);
    if (_equals) {
      _xifexpression = variableMap.put("ROSINSTALL_CI_JOB_TOKEN", "\"true\"");
    }
    return _xifexpression;
  }

  public void setVariableDockerImageTag(final Map<String, String> variableMap, final EList<String> tagTypes) {
    for (final String tag : tagTypes) {
      {
        String tag_camel = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, tag);
        String _name = CommonRules.ImageTagTypes.Branch.name();
        boolean _equals = Objects.equal(tag_camel, _name);
        if (_equals) {
          variableMap.put("TARGET_BRANCH", "\"${CI_REGISTRY_IMAGE}/${NAME}:${CI_COMMIT_REF_NAME//\\//-}\"");
        }
        String _name_1 = CommonRules.ImageTagTypes.Latest.name();
        boolean _equals_1 = Objects.equal(tag_camel, _name_1);
        if (_equals_1) {
          variableMap.put("TARGET_LATEST", "\"${CI_REGISTRY_IMAGE}/${NAME}:latest\"");
        }
        String _name_2 = CommonRules.ImageTagTypes.CommitTag.name();
        boolean _equals_2 = Objects.equal(tag_camel, _name_2);
        if (_equals_2) {
          variableMap.put("TARGET_RELEASE", "\"${CI_REGISTRY_IMAGE}/${NAME}:${CI_COMMIT_TAG//\\//-}\"");
        }
      }
    }
  }

  public String setVariableDockerTLS(final Map<String, String> variableMap, final String TLSPath) {
    return variableMap.put("DOCKER_TLS_CERTDIR", String.format("\"%s\"", TLSPath));
  }

  public String setVariableCMakeArgs(final Map<String, String> variableMap, final EList<String> args) {
    return variableMap.put("CMAKE_ARGS", args.stream().collect(Collectors.joining(" -", "\"-", "\"")));
  }

  public CharSequence addVariables(final Map<String, String> variableMap, final MonolithicImplementationDescription monImpl) {
    StringConcatenation _builder = new StringConcatenation();
    String _xblockexpression = null;
    {
      this.fillVaribalesFromMonImpl(variableMap, monImpl);
      _xblockexpression = "";
    }
    _builder.append(_xblockexpression);
    _builder.newLineIfNotEmpty();
    _builder.append("variables:");
    _builder.newLine();
    {
      Set<String> _keySet = variableMap.keySet();
      for(final String variable : _keySet) {
        _builder.append("  ");
        _builder.append(variable);
        _builder.append(": ");
        String _get = variableMap.get(variable);
        _builder.append(_get);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    return _builder;
  }

  public CharSequence addVariables(final Map<String, String> variableMap, final MonolithicImplementationDescription monImpl, final PackageDescription pkgDes) {
    StringConcatenation _builder = new StringConcatenation();
    String _xblockexpression = null;
    {
      this.fillVaribalesFromMonImpl(variableMap, monImpl);
      _xblockexpression = "";
    }
    _builder.append(_xblockexpression);
    _builder.newLineIfNotEmpty();
    String _xblockexpression_1 = null;
    {
      this.fillVaribalesFromPackage(variableMap, pkgDes);
      _xblockexpression_1 = "";
    }
    _builder.append(_xblockexpression_1);
    _builder.newLineIfNotEmpty();
    _builder.append("variables:");
    _builder.newLine();
    {
      Set<String> _keySet = variableMap.keySet();
      for(final String variable : _keySet) {
        _builder.append("  ");
        _builder.append(variable);
        _builder.append(": ");
        String _get = variableMap.get(variable);
        _builder.append(_get);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    return _builder;
  }

  public CharSequence addVariables(final Map<String, String> variableMap, final MonolithicImplementationDescription monImpl, final PackageDescription pkgDes, final CISetting ci) {
    StringConcatenation _builder = new StringConcatenation();
    String _xblockexpression = null;
    {
      this.fillVaribalesFromMonImpl(variableMap, monImpl);
      _xblockexpression = "";
    }
    _builder.append(_xblockexpression);
    _builder.newLineIfNotEmpty();
    String _xblockexpression_1 = null;
    {
      this.fillVaribalesFromPackage(variableMap, pkgDes);
      _xblockexpression_1 = "";
    }
    _builder.append(_xblockexpression_1);
    _builder.newLineIfNotEmpty();
    String _xblockexpression_2 = null;
    {
      this.fillVaribalesFromCiSetting(variableMap, ci, monImpl.getImplementation().getBuildRequirements().getReqRosDistros().getValues());
      _xblockexpression_2 = "";
    }
    _builder.append(_xblockexpression_2);
    _builder.newLineIfNotEmpty();
    _builder.append("variables:");
    _builder.newLine();
    {
      Set<String> _keySet = variableMap.keySet();
      for(final String variable : _keySet) {
        _builder.append("  ");
        _builder.append(variable);
        _builder.append(": ");
        String _get = variableMap.get(variable);
        _builder.append(_get);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    return _builder;
  }

  /**
   * fill .common block
   */
  public CharSequence addCommonBlock(final PackageDescription pkg, final CISetting setting) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(".common:");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("docker_login_script:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- docker login -u $CI_REGISTRY_USER -p $CI_REGISTRY_PASSWORD $CI_REGISTRY");
    _builder.newLine();
    {
      EList<CIParameters> _ciParameters = setting.getCiParameters();
      for(final CIParameters ciParam : _ciParameters) {
        {
          String _type = ciParam.getType();
          String _camelToLowerUnderscore = DeployModelUtils.camelToLowerUnderscore(CommonRules.RepoTypes.Gitlab.name());
          boolean _equals = Objects.equal(_type, _camelToLowerUnderscore);
          if (_equals) {
            {
              EList<GroupedProperties> _parameters = ciParam.getParameters();
              for(final GroupedProperties param : _parameters) {
                {
                  String _type_1 = param.getType();
                  String _camelToLowerUnderscore_1 = DeployModelUtils.camelToLowerUnderscore(CommonRules.GitlabParameters.Services.name());
                  boolean _equals_1 = Objects.equal(_type_1, _camelToLowerUnderscore_1);
                  if (_equals_1) {
                    CharSequence _setPropertyLabels = this.setPropertyLabels(param);
                    _builder.append(_setPropertyLabels);
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  String _type_2 = param.getType();
                  String _camelToLowerUnderscore_2 = DeployModelUtils.camelToLowerUnderscore(CommonRules.GitlabParameters.Tags.name());
                  boolean _equals_2 = Objects.equal(_type_2, _camelToLowerUnderscore_2);
                  if (_equals_2) {
                    CharSequence _setPropertyLabels_1 = this.setPropertyLabels(param);
                    _builder.append(_setPropertyLabels_1);
                    _builder.newLineIfNotEmpty();
                    {
                      if ((this.dockerRunnerSaveCacheFlag == false)) {
                        String _xblockexpression = null;
                        {
                          this.dockerRunnerSaveCacheFlag = this.findTargetParameter(param, CommonRules.GitlabDefaultRunnerTags.DockerRunnerSaveCache.name());
                          _xblockexpression = "";
                        }
                        _builder.append(_xblockexpression);
                        _builder.newLineIfNotEmpty();
                      }
                    }
                    {
                      if ((this.dockerRunnerNoCacheFlag == false)) {
                        String _xblockexpression_1 = null;
                        {
                          this.dockerRunnerNoCacheFlag = this.findTargetParameter(param, CommonRules.GitlabDefaultRunnerTags.DockerRunnerNoCache.name());
                          _xblockexpression_1 = "";
                        }
                        _builder.append(_xblockexpression_1);
                        _builder.newLineIfNotEmpty();
                      }
                    }
                    {
                      if ((this.simpleRunnerFlag == false)) {
                        String _xblockexpression_2 = null;
                        {
                          this.simpleRunnerFlag = this.findTargetParameter(param, CommonRules.GitlabDefaultRunnerTags.SimpleRunner.name());
                          _xblockexpression_2 = "";
                        }
                        _builder.append(_xblockexpression_2);
                        _builder.newLineIfNotEmpty();
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    {
      boolean _equals_3 = setting.getReqBranchPrefix().equals(DeployModelUtils.camelToLowerUnderscore(CommonRules.BranchPrefixTypes.RosVersion.name()));
      boolean _not = (!_equals_3);
      if (_not) {
        ArrayList<String> rules = this.collectRules(pkg.getImageDescription().getImageTags().getValues(), setting.getReqBranchPrefix());
        _builder.newLineIfNotEmpty();
        {
          int _size = rules.size();
          boolean _greaterThan = (_size > 0);
          if (_greaterThan) {
            _builder.append("  ");
            _builder.append("rules:");
            _builder.newLineIfNotEmpty();
            {
              for(final String rule : rules) {
                _builder.append("    ");
                _builder.append("- if: ");
                _builder.append(rule);
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    _builder.newLine();
    return _builder;
  }

  public ArrayList<String> collectRules(final EList<String> tagTypes, final String branchPrefix) {
    ArrayList<String> rules = CollectionLiterals.<String>newArrayList();
    for (final String tag : tagTypes) {
      {
        String tag_camel = DeployModelUtils.lowerUnderscoreToCamel(tag);
        String _name = CommonRules.ImageTagTypes.CommitTag.name();
        boolean _equals = Objects.equal(tag_camel, _name);
        if (_equals) {
          rules.add("&commit_tag \'$CI_COMMIT_TAG != null\'");
        }
      }
    }
    boolean _equals = Objects.equal(branchPrefix, CommonRules.BranchPrefixTypes.RosDistro);
    if (_equals) {
      rules.add("&merge_into_devel \'$CI_COMMIT_REF_NAME =~ /devel/\'");
    }
    return rules;
  }

  public List<String> getPropertyValues(final Object object) {
    Class<?> _class = object.getClass();
    boolean _equals = Objects.equal(_class, CommonPropertySingleValueImpl.class);
    if (_equals) {
      final ArrayList<String> v = CollectionLiterals.<String>newArrayList(((CommonPropertySingleValueImpl) object).getValue());
      final List<String> l = v;
      return l;
    }
    Class<?> _class_1 = object.getClass();
    boolean _equals_1 = Objects.equal(_class_1, CommonPropertyMultiValueImpl.class);
    if (_equals_1) {
      final List<String> l_1 = ((CommonPropertyMultiValueImpl) object).getValue().getValues();
      return l_1;
    }
    return null;
  }

  public CharSequence setPropertyLabels(final GroupedProperties properties) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<PropertyExpressType> _properties = properties.getProperties();
      for(final PropertyExpressType p : _properties) {
        _builder.append("  ");
        String _type = properties.getType();
        _builder.append(_type);
        _builder.append(": &");
        String _name = p.getName();
        _builder.append(_name);
        _builder.newLineIfNotEmpty();
        {
          List<String> _propertyValues = this.getPropertyValues(p);
          for(final String v : _propertyValues) {
            _builder.append("    ");
            _builder.append("- ");
            _builder.append(v);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }

  public boolean findTargetParameter(final GroupedProperties properties, final String target) {
    EList<PropertyExpressType> _properties = properties.getProperties();
    for (final PropertyExpressType p : _properties) {
      boolean _equals = p.getName().equals(DeployModelUtils.camelToLowerUnderscore(target));
      if (_equals) {
        return true;
      }
    }
    return false;
  }

  public CharSequence findRosDistroFromBranchPrefix() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("prepare:");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("stage: check_ros_distro");
    _builder.newLine();
    {
      if (this.simpleRunnerFlag) {
        _builder.append("  ");
        _builder.append("tags: *");
        String _camelToLowerUnderscore = DeployModelUtils.camelToLowerUnderscore(CommonRules.GitlabDefaultRunnerTags.SimpleRunner.name());
        _builder.append(_camelToLowerUnderscore, "  ");
        _builder.newLineIfNotEmpty();
      } else {
        if (this.dockerRunnerSaveCacheFlag) {
          _builder.append("  ");
          _builder.append("tags: *");
          String _camelToLowerUnderscore_1 = DeployModelUtils.camelToLowerUnderscore(CommonRules.GitlabDefaultRunnerTags.DockerRunnerSaveCache.name());
          _builder.append(_camelToLowerUnderscore_1, "  ");
          _builder.newLineIfNotEmpty();
        } else {
          if (this.dockerRunnerNoCacheFlag) {
            _builder.append("  ");
            _builder.append("tags: *");
            String _camelToLowerUnderscore_2 = DeployModelUtils.camelToLowerUnderscore(CommonRules.GitlabDefaultRunnerTags.DockerRunnerNoCache.name());
            _builder.append(_camelToLowerUnderscore_2, "  ");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("  ");
    _builder.append("script:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- |");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("for distro in $ROS_DISTROS; do");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("raw=${CI_COMMIT_REF_NAME//\\//-}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if [[ \"$distro\" = \"${raw%%-*}\" ]] || [[ \"$distro\" = \"${CI_COMMIT_REF_NAME}\" ]] || [[ \"$distro\" = \"${raw%%_*}\" ]]; then");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("echo \"found\"");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("echo \"ROS_DISTRO=$distro\" >> build.env");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("break");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("fi");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("done;");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("if [[ $ROS_DISTRO = \"\" ]]; then");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("exit 1");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("echo \"Not found\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("fi");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("artifacts:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("reports:");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("dotenv: build.env");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }

  public CharSequence commonBuild() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(".build:");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("stage: ${CI_JOB_NAME}");
    _builder.newLine();
    {
      if ((this.dockerRunnerNoCacheFlag || this.dockerRunnerSaveCacheFlag)) {
        _builder.append("  ");
        _builder.append("services: *docker_service");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("tags: *docker_runner");
        _builder.newLine();
      }
    }
    _builder.append("  ");
    _builder.append("before_script:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- !reference [.common, docker_login_script]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- echo \"CI_PIPELINE_SOURCE=$CI_PIPELINE_SOURCE\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("script:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- >");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("TARGET=${CI_REGISTRY_IMAGE}/${NAME}:${CI_COMMIT_REF_NAME//\\//-};");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("docker build --cache-from $TARGET --cache-from $TARGET_LATEST --cache-from $TARGET_BRANCH");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("--build-arg SUFFIX");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("--build-arg PREFIX");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("--build-arg BUILDER_PREFIX");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("--build-arg BUILDER_SUFFIX");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("--build-arg ROS_DISTRO");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("--build-arg ROSINSTALL_CI_JOB_TOKEN=$ROSINSTALL_CI_JOB_TOKEN");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("--build-arg CI_JOB_TOKEN=$CI_JOB_TOKEN");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("--build-arg BUILDKIT_INLINE_CACHE=1");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("--build-arg CMAKE_ARGS");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("-t ${PREFIX}${NAME}${SUFFIX} ${FOLDER}");
    _builder.newLine();
    {
      if (this.dockerRunnerSaveCacheFlag) {
      } else {
        _builder.append("     ");
        _builder.append("- docker push ${PREFIX}${NAME}${SUFFIX}");
        _builder.newLine();
      }
    }
    _builder.append("  ");
    _builder.append("needs:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- prepare");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("variables:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("NAME: ${CI_JOB_NAME}_${ROS_DISTRO}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }

  public HashSet<String> findRosVersion(final List<String> distros) {
    HashSet<String> versions = CollectionLiterals.<String>newHashSet();
    for (final String distro : distros) {
      {
        CommonRules.RosVersions _rosVersion = CommonRules.RosDistros.getRosVersion(CommonRules.RosDistros.valueOf(DeployModelUtils.lowerUnderscoreToCamel(distro)));
        boolean _equals = Objects.equal(_rosVersion, CommonRules.RosVersions.Ros1);
        if (_equals) {
          versions.add(DeployModelUtils.camelToLowerUnderscore(CommonRules.RosVersions.Ros1.name()));
        }
        CommonRules.RosVersions _rosVersion_1 = CommonRules.RosDistros.getRosVersion(CommonRules.RosDistros.valueOf(DeployModelUtils.lowerUnderscoreToCamel(distro)));
        boolean _equals_1 = Objects.equal(_rosVersion_1, CommonRules.RosVersions.Ros2);
        if (_equals_1) {
          versions.add(DeployModelUtils.camelToLowerUnderscore(CommonRules.RosVersions.Ros2.name()));
        }
      }
    }
    return versions;
  }

  public HashSet<String> filterRosDistros(final List<String> distros, final String version) {
    HashSet<String> res = CollectionLiterals.<String>newHashSet();
    for (final String distro : distros) {
      CommonRules.RosVersions _rosVersion = CommonRules.RosDistros.getRosVersion(CommonRules.RosDistros.valueOf(DeployModelUtils.lowerUnderscoreToCamel(distro)));
      CommonRules.RosVersions _valueOf = CommonRules.RosVersions.valueOf(DeployModelUtils.lowerUnderscoreToCamel(version));
      boolean _equals = Objects.equal(_rosVersion, _valueOf);
      if (_equals) {
        res.add(distro);
      }
    }
    return res;
  }

  public CharSequence build(final MonolithicImplementationDescription monImpl, final CISetting ci) {
    StringConcatenation _builder = new StringConcatenation();
    ArrayList<String> reqDistros = this.getAllRosDistros(monImpl.getImplementation().getBuildRequirements());
    _builder.newLineIfNotEmpty();
    HashSet<String> reqVersions = this.findRosVersion(reqDistros);
    _builder.newLineIfNotEmpty();
    {
      boolean _equals = ci.getReqBranchPrefix().equals(DeployModelUtils.camelToLowerUnderscore(CommonRules.BranchPrefixTypes.RosVersion.name()));
      if (_equals) {
        {
          for(final String version : reqVersions) {
            String _name = monImpl.getName();
            _builder.append(_name);
            _builder.append(":");
            _builder.append(version);
            _builder.append(":");
            _builder.newLineIfNotEmpty();
            _builder.append("  ");
            _builder.append("extends:");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("- .build");
            _builder.newLine();
            {
              boolean _equals_1 = ci.getReqBranchPrefix().equals(DeployModelUtils.camelToLowerUnderscore(CommonRules.BranchPrefixTypes.RosVersion.name()));
              if (_equals_1) {
                _builder.append("    ");
                _builder.append("- .on_");
                _builder.append(version, "    ");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("  ");
            _builder.append("variables:");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("NAME: ");
            String _name_1 = monImpl.getName();
            _builder.append(_name_1, "    ");
            _builder.append("_${ROS_DISTRO}");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("FOLDER: \"");
            String _location = monImpl.getImplementation().getLocation();
            _builder.append(_location, "    ");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
            _builder.append("  ");
            CharSequence _setRosDistroMatrix = this.setRosDistroMatrix(IterableExtensions.<String>toList(this.filterRosDistros(reqDistros, version)));
            _builder.append(_setRosDistroMatrix, "  ");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
          }
        }
      }
    }
    _builder.newLine();
    return _builder;
  }

  public CharSequence commonPublish() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(".publish:");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("stage: publish");
    _builder.newLine();
    {
      if ((this.dockerRunnerNoCacheFlag || this.dockerRunnerSaveCacheFlag)) {
        _builder.append("services: *docker_service");
        _builder.newLine();
        _builder.append("tags: *docker_runner");
        _builder.newLine();
      }
    }
    _builder.append("  ");
    _builder.append("before_script:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- !reference [.common, docker_login_script]");
    _builder.newLine();
    {
      if (this.dockerRunnerSaveCacheFlag) {
      } else {
        _builder.append("   ");
        _builder.append("- docker pull ${PREFIX}${NAME}${SUFFIX}");
        _builder.newLine();
      }
    }
    _builder.append("  ");
    _builder.append("script:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- |");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("TARGET=${CI_REGISTRY_IMAGE}/${NAME}:${CI_COMMIT_REF_NAME//\\//-}");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("if [ \"$CI_COMMIT_REF_NAME\" = \"main\" ]; then");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("TARGET=$TARGET_LATEST");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("fi");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("if [ \"$CI_COMMIT_REF_NAME\" = \"${ROS_DISTRO}/devel\" ]; then");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("TARGET=$TARGET_LATEST");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("fi");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("if [ $CI_COMMIT_TAG ]; then");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("convert_tag=${CI_COMMIT_TAG//\\//-}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("distro_prefix=${ROS_DISTRO}-");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("remove_distro_tag=${convert_tag#\"$distro_prefix\"}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("TARGET_RELEASE=${CI_REGISTRY_IMAGE}/${NAME}:${remove_distro_tag}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("TARGET=$TARGET_RELEASE");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("fi");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("docker tag ${PREFIX}${NAME}${SUFFIX} ${TARGET} && docker push ${TARGET}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("needs:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- build");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }

  public CharSequence publish(final MonolithicImplementationDescription monImpl, final PackageDescription pkg, final CISetting ci) {
    StringConcatenation _builder = new StringConcatenation();
    ArrayList<String> reqDistros = this.getAllRosDistros(monImpl.getImplementation().getBuildRequirements());
    _builder.newLineIfNotEmpty();
    HashSet<String> reqVersions = this.findRosVersion(reqDistros);
    _builder.newLineIfNotEmpty();
    {
      boolean _equals = ci.getReqBranchPrefix().equals(DeployModelUtils.camelToLowerUnderscore(CommonRules.BranchPrefixTypes.RosVersion.name()));
      if (_equals) {
        {
          for(final String version : reqVersions) {
            _builder.append("publish:");
            String _name = monImpl.getName();
            _builder.append(_name);
            _builder.append(":");
            _builder.append(version);
            _builder.append(":");
            _builder.newLineIfNotEmpty();
            _builder.append("  ");
            _builder.append("extends:");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("- .publish");
            _builder.newLine();
            {
              boolean _contains = pkg.getImageDescription().getImageTags().getValues().contains(DeployModelUtils.camelToLowerUnderscore(CommonRules.ImageTagTypes.CommitTag.name()));
              if (_contains) {
                {
                  boolean _contains_1 = pkg.getImageDescription().getImageTags().getValues().contains(DeployModelUtils.camelToLowerUnderscore(CommonRules.ImageTagTypes.Latest.name()));
                  if (_contains_1) {
                    _builder.append("  ");
                    _builder.append("- .on_");
                    _builder.append(version, "  ");
                    _builder.append("_merge_tag");
                    _builder.newLineIfNotEmpty();
                  } else {
                    _builder.append("  ");
                    _builder.append("- .on_");
                    _builder.append(version, "  ");
                    _builder.append("_tag");
                    _builder.newLineIfNotEmpty();
                  }
                }
              } else {
                {
                  boolean _contains_2 = pkg.getImageDescription().getImageTags().getValues().contains(DeployModelUtils.camelToLowerUnderscore(CommonRules.ImageTagTypes.Latest.name()));
                  if (_contains_2) {
                    _builder.append("  ");
                    _builder.append("- .on_");
                    _builder.append(version, "  ");
                    _builder.append("_merge");
                    _builder.newLineIfNotEmpty();
                  } else {
                    _builder.append("  ");
                    _builder.append("- .on_");
                    _builder.append(version, "  ");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
            _builder.append("  ");
            _builder.append("variables:");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("NAME: ");
            String _name_1 = monImpl.getName();
            _builder.append(_name_1, "    ");
            _builder.append("_${ROS_DISTRO}");
            _builder.newLineIfNotEmpty();
            _builder.append("  ");
            _builder.append("needs:");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("- ");
            String _name_2 = monImpl.getName();
            _builder.append(_name_2, "    ");
            _builder.append(":");
            _builder.append(version, "    ");
            _builder.newLineIfNotEmpty();
            _builder.append("  ");
            CharSequence _setRosDistroMatrix = this.setRosDistroMatrix(IterableExtensions.<String>toList(this.filterRosDistros(reqDistros, version)));
            _builder.append(_setRosDistroMatrix, "  ");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
          }
        }
      }
    }
    _builder.newLine();
    return _builder;
  }

  public CharSequence compileRules(final MonolithicImplementationDescription monImpl) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("variables:");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("ROS2_DEV_BRANCH: ros2/devel");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("ROS1_DEV_BRANCH: ros1/devel");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("ROS2_PREFIX: ros2");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("ROS1_PREFIX: ros1");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".on_ros2:");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("rules:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- !reference [.rules-map, not_ros2_branch]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- !reference [.rules-map, allow_failure_distros]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- !reference [.rules-map, not_allow_failure_distros]");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".on_ros1:");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("rules:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- !reference [.rules-map, not_ros1_branch]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- !reference [.rules-map, allow_failure_distros]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- !reference [.rules-map, not_allow_failure_distros]");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".on_ros2_tag:");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("rules:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- !reference [.rules-map, not_ros2_branch]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- !reference [.rules-map, not_commit_tag]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- !reference [.rules-map, allow_failure_distros]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- !reference [.rules-map, not_allow_failure_distros]");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".on_ros1_tag:");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("rules:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- !reference [.rules-map, not_ros1_branch]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- !reference [.rules-map, not_commit_tag]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- !reference [.rules-map, allow_failure_distros]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- !reference [.rules-map, not_allow_failure_distros]");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".on_ros2_merge:");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("rules:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- !reference [.rules-map, not_ros2_branch]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- !reference [.rules-map, not_merge_into_ros2_devel]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- !reference [.rules-map, allow_failure_distros]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- !reference [.rules-map, not_allow_failure_distros]");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".on_ros1_merge:");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("rules:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- !reference [.rules-map, not_ros1_branch]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- !reference [.rules-map, not_merge_into_ros1_devel]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- !reference [.rules-map, allow_failure_distros]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- !reference [.rules-map, not_allow_failure_distros]");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".on_ros2_merge_tag:");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("rules:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- !reference [.rules-map, not_ros2_branch]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- !reference [.rules-map, not_merge_into_ros2_devel_and_tag]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- !reference [.rules-map, allow_failure_distros]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- !reference [.rules-map, not_allow_failure_distros]");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".on_ros1_merge_tag:");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("rules:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- !reference [.rules-map, not_ros1_branch]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- !reference [.rules-map, not_merge_into_ros1_devel_and_tag]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- !reference [.rules-map, allow_failure_distros]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- !reference [.rules-map, not_allow_failure_distros]");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".rules-map:");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("ros2_branch:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- if: $CI_COMMIT_REF_NAME =~ /ros2/");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("when: on_success");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("not_ros2_branch:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- if: $CI_COMMIT_REF_NAME !~ /^ros2.*/");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("when: never");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("not_ros1_branch:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- if: $CI_COMMIT_REF_NAME !~ /^ros1.*/");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("when: never");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("allow_failure_distros:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- if: $ROS_DISTRO !~ $DEFAULT_ROS_DISTROS");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("when: on_success");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("allow_failure: true");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("not_allow_failure_distros:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- if: $ROS_DISTRO =~ $DEFAULT_ROS_DISTROS");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("when: on_success");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("allow_failure: false");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("not_merge_into_ros1_devel:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- if: $CI_COMMIT_BRANCH != $ROS1_DEV_BRANCH");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("when: never");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("not_merge_into_ros2_devel:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- if: $CI_COMMIT_BRANCH != $ROS2_DEV_BRANCH");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("when: never");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("not_merge_into_ros2_devel_and_tag:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- if: $CI_COMMIT_BRANCH != $ROS2_DEV_BRANCH && $CI_COMMIT_TAG == null");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("when: never");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("not_merge_into_ros1_devel_and_tag:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- if: $CI_COMMIT_BRANCH != $ROS1_DEV_BRANCH && $CI_COMMIT_TAG == null");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("when: never");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("commit_tag:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- if: $CI_COMMIT_TAG != null");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("when: on_success");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("not_commit_tag:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- if: $CI_COMMIT_TAG == null");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("when: never");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
}
