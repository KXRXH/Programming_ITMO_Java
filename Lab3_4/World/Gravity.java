package Lab3_4.World;

public enum Gravity {
    EARTH(9.8),
    MOON(1.6),
    ZERO(0.0);

    private final double Value;
    Gravity(double value) {
        this.Value = value;
    }

    public final double getGravity() {
        return this.Value;
    }
}
