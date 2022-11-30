package Lab3_4.People;

public interface Alive {
    default Integer getAge() {
        return 0;
    }

    default String getName() {
        return "Неизвестно";
    }

    default Mood getMood() {
        return Mood.Neutral;
    }

    void setMood(Mood mood);

    default State getState() {
        return State.Stand;
    }

    void setState(State state);

    void growUp();

    void goSleep();

    void wakeUp();

    default void info() {
        System.out.println("Имя: " + getName());
        System.out.println("Возраст: " + getAge());
        System.out.println("Настроение: " + getMood());
        System.out.println("Состояние: " + getState());
    }
}
