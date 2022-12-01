package Lab3_4.Human;

public enum DreamType {
    None(),
    Nightmare(),
    GoodDream(),
    BadDream();

    public static DreamType getRandDreamType() {
        return DreamType.values()[(int) (Math.random() * DreamType.values().length)];
    }
}
