package de.fraunhofer.ipa.deployment.index;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IReferenceDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.scoping.impl.DelegatingEventSource;
import org.eclipse.xtext.util.OnChangeEvictingCache;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class DeploymentIndex {
  @Inject
  @Extension
  private ResourceDescriptionsProvider indexProvider;

  @Inject
  private IContainer.Manager containerManager;

  @Inject
  private IResourceDescription.Manager descriptionManager;

  public Iterable<Iterable<IEObjectDescription>> getVisibleEObjectsByTypeCrossProjets(final Iterable<IResourceDescription> allResourceDescriptions, final EClass type) {
    final Function1<IResourceDescription, Iterable<IEObjectDescription>> _function = new Function1<IResourceDescription, Iterable<IEObjectDescription>>() {
      public Iterable<IEObjectDescription> apply(final IResourceDescription it) {
        return it.getExportedObjectsByType(type);
      }
    };
    return IterableExtensions.<IResourceDescription, Iterable<IEObjectDescription>>map(allResourceDescriptions, _function);
  }

  public Iterable<Iterable<IReferenceDescription>> getReferenceDescriptionsCrossProjets(final Iterable<IResourceDescription> allResourceDescriptions) {
    final Function1<IResourceDescription, Iterable<IReferenceDescription>> _function = new Function1<IResourceDescription, Iterable<IReferenceDescription>>() {
      public Iterable<IReferenceDescription> apply(final IResourceDescription it) {
        return it.getReferenceDescriptions();
      }
    };
    return IterableExtensions.<IResourceDescription, Iterable<IReferenceDescription>>map(allResourceDescriptions, _function);
  }

  public Iterable<IEObjectDescription> getCurrentResouceVisibleEObjectsByType(final Resource context, final EClass type) {
    Iterable<IEObjectDescription> _xblockexpression = null;
    {
      final IResourceDescriptions index = this.indexProvider.getResourceDescriptions(context);
      final IResourceDescription resourceDescription = index.getResourceDescription(context.getURI());
      _xblockexpression = resourceDescription.getExportedObjectsByType(type);
    }
    return _xblockexpression;
  }

  public IEObjectDescription getMachedEntity(final Resource context, final EClass type, final QualifiedName qName) {
    final Function1<IEObjectDescription, Boolean> _function = new Function1<IEObjectDescription, Boolean>() {
      public Boolean apply(final IEObjectDescription it) {
        return Boolean.valueOf(it.getQualifiedName().equals(qName));
      }
    };
    Iterable<IEObjectDescription> _filter = IterableExtensions.<IEObjectDescription>filter(this.getVisibleEObjectsByType(context, type), _function);
    IEObjectDescription _head = null;
    if (_filter!=null) {
      _head=IterableExtensions.<IEObjectDescription>head(_filter);
    }
    return _head;
  }

  public Iterable<IEObjectDescription> getVisibleEObjectsByType(final Resource context, final EClass type) {
    final Function1<IContainer, Iterable<IEObjectDescription>> _function = new Function1<IContainer, Iterable<IEObjectDescription>>() {
      public Iterable<IEObjectDescription> apply(final IContainer it) {
        return it.getExportedObjectsByType(type);
      }
    };
    return Iterables.<IEObjectDescription>concat(ListExtensions.<IContainer, Iterable<IEObjectDescription>>map(this.getVisibleContainers(context), _function));
  }

  protected String getCacheKey(final String base, final ResourceSet context) {
    Map<Object, Object> loadOptions = context.getLoadOptions();
    boolean _containsKey = loadOptions.containsKey(ResourceDescriptionsProvider.NAMED_BUILDER_SCOPE);
    if (_containsKey) {
      return ((base + "@") + ResourceDescriptionsProvider.NAMED_BUILDER_SCOPE);
    }
    return (base + "@DEFAULT_SCOPE");
  }

  public List<IContainer> getVisibleContainers(final Resource resource) {
    IResourceDescription description = this.descriptionManager.getResourceDescription(resource);
    IResourceDescriptions resourceDescriptions = this.indexProvider.getResourceDescriptions(resource);
    String cacheKey = this.getCacheKey("VisibleContainers", resource.getResourceSet());
    OnChangeEvictingCache.CacheAdapter cache = new OnChangeEvictingCache().getOrCreate(resource);
    List<IContainer> result = CollectionLiterals.<IContainer>newArrayList();
    result = cache.<List<IContainer>>get(cacheKey);
    if ((result == null)) {
      result = this.containerManager.getVisibleContainers(description, resourceDescriptions);
      if ((resourceDescriptions instanceof IResourceDescription.Event.Source)) {
        IResourceDescription.Event.Source eventSource = ((IResourceDescription.Event.Source) resourceDescriptions);
        DelegatingEventSource delegatingEventSource = new DelegatingEventSource(eventSource);
        delegatingEventSource.addListeners(Lists.<IResourceDescription.Event.Listener>newArrayList(Iterables.<IResourceDescription.Event.Listener>filter(result, IResourceDescription.Event.Listener.class)));
        delegatingEventSource.initialize();
        cache.addCacheListener(delegatingEventSource);
      }
      cache.set(cacheKey, result);
    }
    return result;
  }
}
