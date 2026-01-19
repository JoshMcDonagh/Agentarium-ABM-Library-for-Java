package modelarium.attributes.functional;

import modelarium.ModelElement;

@FunctionalInterface
public interface EventRunFunction {
    void run(ModelElement associatedModelElement);
}
