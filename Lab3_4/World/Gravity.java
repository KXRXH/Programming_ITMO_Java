package Lab3_4.World;

public enum Gravity {
    Zero(0.0),
    Low(1.62),
    Earth(9.8);

    private final double GravityValue;

    Gravity(double value) {
        this.GravityValue = value;
    }

    public double getGravityValue() {
        return GravityValue;
    }
}
