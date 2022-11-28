package lab3_4.People;

public interface Alive {
    Integer getAge();

    String getName();

    Mood getMood();

    State getState();

    void growUp();

    void setMood(Mood mood);

    void setState(State state);
}
