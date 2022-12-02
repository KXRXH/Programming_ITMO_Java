package Lab3_4.Human;

public enum HandsState {
    BothUp("Обе руки подняты \uD83D\uDE4C"),
    BothDown("Обе руки опущены"),
    LeftUp("Левая рука поднята"),
    RightUp("Правая рука поднята"),
    Strange("Руки в непонятном положении \uD83E\uDD1E");

    private final String TextValue;

    HandsState(String textValue) {
        TextValue = textValue;
    }

    public String toString() {
        return TextValue;
    }
}
