package Lab3_4.Human;

public enum Health {
    Ok("Здоров"),
    Sick("Болен"),
    Hit("Побит"),
    Dead("Мертв");

    private final String TextValue;

    Health(String textValue) {
        TextValue = textValue;
    }

    public String toString() {
        return TextValue;
    }
}
