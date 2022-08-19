package de.fraunhofer.ipa.deployment.generator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class CIGeneratorHelper {
  public List<String> setEnvVaribalesCommon() {
    final List<String> envVaribales = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("SUFFIX", "PREFIX", "BUILDER_PREFIX", "BUILDER_SUFFIX", "FOLDER", "NAME"));
    return envVaribales;
  }

  public ArrayList<String> setEnvVaribalesAccessGitlabRepo(final Boolean privateGitlabRepo) {
    ArrayList<String> envVaribales = CollectionLiterals.<String>newArrayList();
    if ((privateGitlabRepo).booleanValue()) {
      envVaribales.add("ROSINSTALL_CI_JOB_TOKEN");
    }
    return envVaribales;
  }

  public ArrayList<String> setEnvVaribalesUnreleasedDep(final Boolean UnreleasedDep) {
    ArrayList<String> envVaribales = CollectionLiterals.<String>newArrayList();
    if ((UnreleasedDep).booleanValue()) {
      envVaribales.add("UNRELEASED_DEP_PREFIX");
      envVaribales.add("UNRELEASED_DEP_SUFFIX");
    }
    return envVaribales;
  }

  public ArrayList<String> setEnvVaribalesROSDistro(final Boolean useBranchPrefix) {
    ArrayList<String> envVaribales = CollectionLiterals.<String>newArrayList("ROS_DISTRO");
    if ((useBranchPrefix).booleanValue()) {
      envVaribales.add("ROS_DISTROS");
    }
    return envVaribales;
  }

  public List<String> setEnvVaribalesDockerTLS() {
    final List<String> envVaribales = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("DOCKER_TLS_CERTDIR"));
    return envVaribales;
  }
}
