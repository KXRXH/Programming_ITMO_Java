package Lab3_4.Objects;

public abstract class SomeObject implements Inanimate {
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
        System.out.println("\uD83D\uDCE6 Объект " + this.getClass().getSimpleName() + " теперь " + state.toString().toLowerCase() + " \uD83D\uDCE6");
        this.State = state;
    }

    public Material getMaterial() {
        return Material;
    }

    public Weight getWeight() {
        return ObjectWeight;
    }
}
