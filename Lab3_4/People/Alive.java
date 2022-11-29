package Lab3_4.People;

public interface Alive {
    Integer getAge();

    String getName();

    Mood getMood();

    State getState();

    void growUp();

    void goSleep();

    void wakeUp();

    void info();

    void setMood(Mood mood);

    void setState(State state);
}
