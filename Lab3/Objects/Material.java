package Lab3.Objects;

public enum Material {
    PAPER("Paper"),
    WOOD("Wood"),
    PLASTIC("Plastic"),
    METAL("Metal");

    private final String name;

    Material(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
