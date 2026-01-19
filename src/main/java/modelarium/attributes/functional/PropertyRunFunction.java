package modelarium.attributes.functional;

import modelarium.ModelElement;

@FunctionalInterface
public interface PropertyRunFunction<T> {
    T run(ModelElement associatedModelElement, T propertyValue);
}
