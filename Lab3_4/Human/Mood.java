package Lab3_4.Human;

public enum Mood {
    Happy("Счастлив"),
    Sad("Грустный"),
    Angry("Злой"),
    Bored("Заскучавший"),
    Surprised("Удивлённый"),
    Scared("Испуганный"),
    Confused("Смущённый"),
    Neutral("Нейтральный");
    private final String StringValue;

    Mood(String StringValue) {
        this.StringValue = StringValue;
    }

    public String toString() {
        return StringValue;
    }
}
