package Lab3_4.Objects;

public enum State {
    FLY("Летает"),
    STAND("Стоит");
    private final String name;

    State(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}