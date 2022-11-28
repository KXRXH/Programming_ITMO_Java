package Lab3_4.World;

public enum Gravity {
    Zero(0.0),
    Low(0.5),
    Earth(1.0);

    private final double GravityValue;

    Gravity(double value) {
        this.GravityValue = value;
    }

    public double getGravityValue() {
        return GravityValue;
    }
}
