package Lab3_4.Human;

public enum State {
    Stand("Стоит"),
    Sit("Сидит"),
    Fly("Летает"),
    Read("Читает"),
    FlyAndRead("Летает и читает"),
    FlyAndSleep("Летает и спит"),
    Sleep("Спит"),
    Run("Бежит"),
    Lie("Лежит");

    private final String TextValue;

    State(String textValue) {
        this.TextValue = textValue;
    }

    public String toString() {
        return TextValue;
    }
}