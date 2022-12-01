package Lab3_4.People;

public enum DreamType {
    None(),
    Nightmare(),
    GoodDream(),
    BadDream();

    public static final DreamType getRandDreamType() {
        return DreamType.values()[(int) (Math.random() * DreamType.values().length)];
    }
}
