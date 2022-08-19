package de.fraunhofer.ipa.deployment.utils;

import com.google.common.base.Objects;
import de.fraunhofer.ipa.deployment.deployModel.impl.CommonPropertyMultiValueImpl;
import de.fraunhofer.ipa.deployment.deployModel.impl.CommonPropertySingleValueImpl;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class DeployModelUtilsXtend {
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
}
