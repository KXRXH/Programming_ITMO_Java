package Lab3_4.Objects;

import Lab3_4.Interfaces.NotAlive;

public abstract class ObjectCreatedByAMan implements NotAlive {

    private State ObjectState;
    private final Material ObjectMaterial;

    public ObjectCreatedByAMan(State currentState, Material material) {
        ObjectState = currentState;
        ObjectMaterial = material;
    }

    public final State getState() {
        return ObjectState;
    }

    public final void setState(State newState) {
        ObjectState = newState;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (otherObject.getClass().isInstance(this)) {
            ObjectCreatedByAMan other = (ObjectCreatedByAMan) otherObject;
            return ObjectState == other.ObjectState && ObjectMaterial == other.ObjectMaterial;
        }
        return false;
    }

    @Override
    public String toString() {
        return "SomeObject{" +
                "ObjectState=" + ObjectState +
                ", ObjectMaterial=" + ObjectMaterial +
                '}';
    }

    @Override
    public int hashCode() {
        return ObjectState.hashCode() + ObjectMaterial.hashCode();
    }

    protected Material getMaterial() {
        return ObjectMaterial;
    }
}
