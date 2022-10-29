package Lab3.Objects;

public abstract class SomeObject {

    private State ObjectState;
    private Material ObjectMaterial;

    public SomeObject(State currentState, Material material) {
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
            SomeObject other = (SomeObject) otherObject;
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
