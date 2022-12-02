package Lab3_4.Human;

import Lab3_4.Exceptions.NullBookException;
import Lab3_4.Objects.Book;
import Lab3_4.Objects.BookShelf;

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

    /**
     * @param state состояние человека
     */
    public void setState(State state) {
        if (state == State.Read) {
            System.out.println("Чтобы читать, нужно взять книгу");
            return;
        }

        if (state == ManState) {
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
            switch (DreamType.getRandDreamType()) {
                case GoodDream -> {
                    System.out.println(getName() + " увидел(а) хороший сон");
                    ManMood = Mood.Happy;
                }
                case BadDream -> {
                    System.out.println(getName() + " увидел(а) плохой сон");
                    ManMood = Mood.Sad;
                }
                case Nightmare -> {
                    System.out.println(getName() + " увидел(а) кошмарный сон");
                    ManMood = Mood.Scared;
                }
                case None -> {
                    System.out.println(getName() + " не увидел(а) сна");
                    ManMood = Mood.Neutral;
                }
            }
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
    public void startReading(Book book) throws NullBookException {
        System.out.println(getName() + " не умеет читать!");
    }

    public void startReading(BookShelf bookShelf, Integer index) throws NullBookException {
        this.startReading(bookShelf.getBook(index));
    }


    /**
     * Человек заканчивает читать книгу
     */
    public void endReading() {
        System.out.println("Не читает!");
    }

}
