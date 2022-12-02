package Lab3_4.Human;

public enum HandsState {
    BothUp("Оба руки подняты"),
    BothDown("Оба руки опущены"),
    LeftUp("Левая рука поднята"),
    RightUp("Правая рука поднята"),
    Strange("Руки в непонятном положении");

    private final String TextValue;

    HandsState(String textValue) {
        TextValue = textValue;
    }

    public String toString() {
        return TextValue;
    }
}
