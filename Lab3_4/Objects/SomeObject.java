package Lab3_4.Objects;

public abstract class SomeObject {
    private ObjectState State;

    public SomeObject(ObjectState state) {
        this.State = state;
    }

    public ObjectState getState() {
        return State;
    }

    public void setState(ObjectState state) {
        this.State = state;
    }
}
