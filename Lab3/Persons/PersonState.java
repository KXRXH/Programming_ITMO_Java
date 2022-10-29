package Lab3.Persons;

public enum PersonState {
    WALK("Walking"),
    RUN("Running"),
    SIT("Sitting"),
    STAND("Standing"),
    LIE("Lying"),
    READ("Reading"),
    SLEEP("Sleeping");

    private final String Status;

    PersonState(String status) {
        Status = status;
    }

    public final String toString() {
        return this.Status;
    }

}
