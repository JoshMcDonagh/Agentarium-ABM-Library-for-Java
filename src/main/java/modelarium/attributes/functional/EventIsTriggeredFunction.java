package modelarium.attributes.functional;

import modelarium.ModelElement;

@FunctionalInterface
public interface EventIsTriggeredFunction {
    boolean isTriggered(ModelElement associatedModelElement);
}
