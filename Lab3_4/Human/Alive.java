package Lab3_4.Human;

import Lab3_4.Objects.Book;
import Lab3_4.Objects.BookShelf;
import Lab3_4.Objects.Chair;

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

    Sex getSex();

    void goSleep();

    void wakeUp();

    void startReading(BookShelf bookShelf, Integer index);

    void startReading(Book book);

    void sitOnChair(Chair chair);

    default void info() {
        System.out.println("Имя: " + getName());
        System.out.println("Возраст: " + getAge());
        System.out.println("Настроение: " + getMood());
        System.out.println("Состояние: " + getState());
    }
}
