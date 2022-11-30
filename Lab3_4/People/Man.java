package Lab3_4.People;

import Lab3_4.Objects.Book;

import java.util.ArrayList;

public abstract class Man implements Alive {
    protected final String Name;
    protected final Sex ManSex;
    protected final ArrayList<String> KnowledgeArray = new ArrayList<>();
    protected Integer Age;
    protected Mood ManMood;
    protected State ManState;

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

    public final Sex getSex() {
        return ManSex;
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
        if (state == State.Read) {
            System.out.println("Чтобы читать, нужно взять книгу");
            return;
        }

        if (state == ManState) {
            System.out.println(getName() + " уже " + state);
            return;
        }
        switch (state) {
            case Fly -> {
                switch (ManState) {
                    case Sleep -> {
                        System.out.println(getName() + " отрывается от земли, но продолжает спать");
                        ManState = State.FlyAndSleep;
                        return;
                    }
                    case FlyAndSleep -> wakeUp();
                    case Read -> {
                        System.out.println(getName() + " отрывает от земли, но продолжает читать");
                        ManState = State.FlyAndRead;
                        return;
                    }
                    case FlyAndRead -> endReading();
                    default -> {
                        System.out.println(getName() + " взлетел в воздух");
                        ManState = state;
                        return;
                    }
                }
            }
            case Sleep -> {
                switch (ManState) {
                    case Fly -> {
                        System.out.println(getName() + " засыпает в воздухе");
                        ManState = State.FlyAndSleep;
                        return;
                    }
                    case FlyAndSleep -> {
                        System.out.println(getName() + " приземляется и продолжает спать");
                        ManState = state;
                        return;
                    }
                    case Read -> {
                        System.out.println(getName() + "не может спать, пока читает");
                        return;
                    }
                    case FlyAndRead -> {
                        System.out.println(getName() + " не может спать, пока читает");
                        return;
                    }
                    default -> {
                        goSleep();
                        return;
                    }
                }
            }
        }
        if ((ManState == State.FlyAndRead || ManState == State.FlyAndSleep) && state != State.Fly) {
            System.out.println(getName() + " не может сделать это, пока " + ManState);
            return;
        }
        ManState = state;
    }

    public final String getKnowledge(Integer index) {
        return KnowledgeArray.get(index);
    }

    protected final void addKnowledge(String knowledge) {
        KnowledgeArray.add(knowledge);
    }

    /**
     * Человек засыпает
     */
    public final void goSleep() {
        if (ManState == State.Fly || ManState == State.Lie) {
            System.out.println(getName() + " засыпает...");
            if (ManState == State.Fly) {
                ManState = State.FlyAndSleep;
                return;
            }
            ManState = State.Sleep;
        }
        System.out.println(getName() + " не может сейчас заснуть!");
    }

    /**
     * Человек просыпается
     */
    public final void wakeUp() {
        if (ManState == State.Sleep || ManState == State.FlyAndSleep) {
            System.out.println(getName() + " просыпается...");
            if (ManState == State.FlyAndSleep) {
                ManState = State.Fly;
                return;
            }
            ManState = State.Lie;
        }
        System.out.println(getName() + " не спит.");
    }

    // Print information about person
    public void info() {
        System.out.println("Имя: " + getName());
        System.out.println("Возраст: " + getAge());
        System.out.println("Пол: " + getSex());
        System.out.println("Настроение: " + getMood());
        System.out.println("Состояние: " + getState());
    }

    /**
     * Человек взрослеет на год
     */
    public void growUp() {
        Age++;
        System.out.println(getName() + " стал старше на год. Теперь ему " + getAge() + " лет.");
    }

    /**
     * @param book Книга, которую человек должен прочитать
     *             Человек начинает читать книгу
     */
    public void startReading(Book book) {
        System.out.println(getName() + " не умеет читать!");
    }

    /**
     * Человек заканчивает читать книгу
     */
    public void endReading() {
        System.out.println("Не читает!");
    }

}
