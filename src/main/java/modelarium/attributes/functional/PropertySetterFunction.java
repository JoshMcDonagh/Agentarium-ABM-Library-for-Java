package modelarium.attributes.functional;

import modelarium.ModelElement;

@FunctionalInterface
public interface PropertySetterFunction<T> {
    T set(ModelElement associatedModelElement, T currentPropertyValue, T newValue);
}
