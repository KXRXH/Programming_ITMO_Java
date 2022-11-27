package Lab3_4.World;

public enum ObjectWeight {
    LIGHT(0.1),
    MEDIUM(1.0),
    HEAVY(10.0);

    private final double Value;

    ObjectWeight(double value) {
        this.Value = value;
    }

    public final double getWeight() {
        return this.Value;
    }
}
