package Lab3_4.Objects;

public abstract class SomeObject {
    protected final Weight ObjectWeight;
    protected final Material Material;
    protected ObjectState State;

    public SomeObject(ObjectState state, Weight objectWeight, Material material) {
        this.ObjectWeight = objectWeight;
        this.State = state;
        this.Material = material;
    }

    public ObjectState getState() {
        return State;
    }

    public void setState(ObjectState state) {
        System.out.println("Объект " + this.getClass().getSimpleName() + " теперь " + state.toString().toLowerCase());
        this.State = state;
    }

    public Weight getWeight() {
        return ObjectWeight;
    }
}
