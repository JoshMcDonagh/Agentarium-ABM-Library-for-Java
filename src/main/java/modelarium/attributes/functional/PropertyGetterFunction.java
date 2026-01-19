package modelarium.attributes.functional;

import modelarium.ModelElement;

@FunctionalInterface
public interface PropertyGetterFunction<T> {
    T get(ModelElement associatedModelElement, T propertyValue);
}
