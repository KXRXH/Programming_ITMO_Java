package Lab3_4.Objects;

public enum Material {
    Wood("Дерево"),
    Metal("Металл"),
    Paper("Бумага"),
    Plastic("Пластик");

    private final String TextValue;

    Material(String textValue) {
        this.TextValue = textValue;
    }

    @Override
    public String toString() {
        return TextValue;
    }

    public Material getRandomMaterial() {
        return Material.values()[(int) (Math.random() * Material.values().length)];
    }
}
