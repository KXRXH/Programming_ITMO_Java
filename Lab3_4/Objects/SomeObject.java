package Lab3_4.Objects;

public abstract class SomeObject {
    private final Weight ObjectWeight;
    private ObjectState State;

    public SomeObject(ObjectState state, Weight objectWeight) {
        this.ObjectWeight = objectWeight;
        this.State = state;
    }

    public ObjectState getState() {
        return State;
    }

    public void setState(ObjectState state) {
        this.State = state;
    }

    public Weight getWeight() {
        return ObjectWeight;
    }
}
