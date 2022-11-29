package Lab3_4.Objects;

public abstract class SomeObject {
    private ObjectState State;
    private final Weight ObjectWeight;

    public SomeObject(ObjectState state, Weight objectWeight) {
        this.ObjectWeight = objectWeight;
        this.State = state;
    }

    public ObjectState getState() {
        return State;
    }

    public Weight getWeight() {
        return ObjectWeight;
    }

    public void setState(ObjectState state) {
        this.State = state;
    }
}
