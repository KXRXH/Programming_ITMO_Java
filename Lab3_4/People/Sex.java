package Lab3_4.People;

public enum Sex {
    Male("Мужской"),
    Female("Женский");

    private final String TextValue;

    Sex(String textValue) {
        this.TextValue = textValue;
    }

    @Override
    public String toString() {
        return TextValue;
    }
}
