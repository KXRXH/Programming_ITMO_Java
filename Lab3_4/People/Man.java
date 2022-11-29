package Lab3_4.People;

import Lab3_4.Objects.Book;

public abstract class Man implements Alive {
    private final String Name;
    private final Sex ManSex;
    private Integer Age;
    private Mood ManMood;
    private State ManState;

    public Man(String name, Integer age, Sex sex) {
        Name = name;
        Age = age;
        ManSex = sex;
        ManMood = Mood.Neutral;
        ManState = State.Stand;
    }

    public Man(String name, Integer age, Sex sex, Mood mood, State state) {
        Name = name;
        Age = age;
        ManSex = sex;
        ManMood = mood;
        ManState = state;
    }

    public final String getName() {
        return Name;
    }

    public final Integer getAge() {
        return Age;
    }

    public final Mood getMood() {
        return ManMood;
    }

    public void setMood(Mood mood) {
        ManMood = mood;
    }

    public final State getState() {
        return ManState;
    }

    public void setState(State state) {
        // TODO
        ManState = state;
    }

    public final Sex getSex() {
        return ManSex;
    }

    public final void goSleep() {
        if (ManState == State.Fly || ManState == State.Lie) {
            System.out.println(getName() + " засыпает");
            if (ManState == State.Fly) {
                ManState = State.FlyAndSleep;
                return;
            }
            ManState = State.Sleep;
        }
        System.out.println(getName() + " не может сейчас заснуть");
    }

    public final void wakeUp() {
        if (ManState == State.Sleep || ManState == State.FlyAndSleep) {
            System.out.println(getName() + " просыпается");
            if (ManState == State.FlyAndSleep) {
                ManState = State.Fly;
                return;
            }
            ManState = State.Lie;
        }
        System.out.println(getName() + " не может сейчас проснуться");
    }

    // Print information about person
    public void info() {
        System.out.println("Имя: " + getName());
        System.out.println("Возраст: " + getAge());
        System.out.println("Пол: " + getSex());
        System.out.println("Настроение: " + getMood());
        System.out.println("Состояние: " + getState());
    }

    public void growUp() {
        Age++;
        System.out.println(getName() + " стал старше на год. Теперь ему " + getAge() + " лет.");
    }

    public void startReading(Book book) {
        System.out.println(getName() + " не умеет читать!");
    }

    public void endReading() {
        System.out.println("Не читает!");
    }

}
