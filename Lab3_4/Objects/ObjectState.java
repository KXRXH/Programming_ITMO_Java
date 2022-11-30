package Lab3_4.Objects;

public enum ObjectState {
    Stand("Стоит(лежит)"), Fly("Летает");

    private final String TextValue;

    ObjectState(String textValue) {
        this.TextValue = textValue;
    }

    @Override
    public String toString() {
        return TextValue;
    }
}
