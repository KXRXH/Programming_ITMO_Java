package Lab3_4.People;

public interface Alive {
    Integer getAge();

    String getName();

    Mood getMood();

    void setMood(Mood mood);

    State getState();

    void setState(State state);

    void growUp();

    void goSleep();

    void wakeUp();

    void info();
}
