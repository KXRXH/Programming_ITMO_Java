package Lab3_4.Objects;

public enum Material {
    PAPER("Бумага"),
    WOOD("Дерево"),
    PLASTIC("Пластик"),
    METAL("Метал");

    private final String name;

    Material(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
