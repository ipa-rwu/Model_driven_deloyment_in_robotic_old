/**
 * generated by Xtext 2.27.0
 */
package de.fraunhofer.ipa.deployment.generator;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import de.fraunhofer.ipa.deployment.deployModel.CISetting;
import de.fraunhofer.ipa.deployment.deployModel.MonolithicImplementationDescription;
import de.fraunhofer.ipa.deployment.deployModel.PackageDescription;
import de.fraunhofer.ipa.deployment.utils.DeployModelUtils;
import de.fraunhofer.ipa.deployment.validation.CommonRules;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class DeployModelGenerator extends AbstractGenerator {
  @Inject
  @Extension
  private GitLabCICompiler _gitLabCICompiler;

  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<MonolithicImplementationDescription> monolithicImpls = Iterables.<MonolithicImplementationDescription>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), MonolithicImplementationDescription.class);
    Iterable<PackageDescription> packageDess = Iterables.<PackageDescription>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), PackageDescription.class);
    Iterable<CISetting> ciSettings = Iterables.<CISetting>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), CISetting.class);
    for (final MonolithicImplementationDescription monolithicImpl : monolithicImpls) {
      {
        System.out.println(String.format("monolithicImpl name: %s", monolithicImpl.getName()));
        ArrayList<String> repoNames = CollectionLiterals.<String>newArrayList();
        for (final CISetting ciSetting : ciSettings) {
          {
            boolean flagPackDes = false;
            EList<MonolithicImplementationDescription> _values = ciSetting.getAppliedRepos().getValues();
            for (final MonolithicImplementationDescription repo : _values) {
              repoNames.add(repo.getName());
            }
            System.out.println(repoNames);
            boolean _contains = repoNames.contains(monolithicImpl.getName());
            if (_contains) {
              for (final PackageDescription packageDes : packageDess) {
                {
                  System.out.println(packageDes.getImageDescription().getName().getName());
                  boolean _equals = packageDes.getImageDescription().getName().getName().equals(monolithicImpl.getName());
                  if (_equals) {
                    System.out.print("Find Pkg for");
                    System.out.println(packageDes.getImageDescription().getName());
                    flagPackDes = true;
                    boolean _contains_1 = ciSetting.getCiTypes().getValues().contains(DeployModelUtils.camelToLowerUnderscore(CommonRules.RepoTypes.Gitlab.name()));
                    if (_contains_1) {
                      System.out.println(String.format("Generate CI for gitlab with pkg"));
                      fsa.generateFile(String.format("%s/%s.gitlab-ci.yml", monolithicImpl.getName(), monolithicImpl.getName()), 
                        this._gitLabCICompiler.compileGitlabCI(monolithicImpl, packageDes, ciSetting));
                    }
                    boolean _contains_2 = ciSetting.getCiTypes().getValues().contains(DeployModelUtils.camelToLowerUnderscore(CommonRules.RepoTypes.Github.name()));
                    if (_contains_2) {
                      System.out.println(String.format("Generate CI for github with pkg"));
                    }
                  }
                }
              }
              if ((flagPackDes == false)) {
                System.out.println(String.format("Generate CI  without pkg"));
              }
            }
          }
        }
      }
    }
  }
}
