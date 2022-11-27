package Lab3_4.Persons;

public enum PersonState {
    WALK("Идет"),
    RUN("Бежит"),
    SIT("Сидит"),
    STAND("Стоит"),
    LIE("Лежит"),
    READ("Читает"),
    SLEEP("Спит"),
    FLY("Летит");

    private final String Status;

    PersonState(String status) {
        Status = status;
    }

    public final String toString() {
        return this.Status;
    }

}
