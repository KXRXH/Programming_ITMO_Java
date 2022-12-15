package Lab3_4.Human;

import Lab3_4.Exceptions.NullBookException;
import Lab3_4.Objects.Book;
import Lab3_4.Objects.BookShelf;
import Lab3_4.Objects.Chair;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Person implements Man, Alive {
    protected final String Name;
    protected final Sex ManSex;
    protected final ArrayList<String> KnowledgeArray = new ArrayList<>();
    protected Integer Age;
    protected Mood ManMood;
    protected Health ManHealth;
    protected State ManState;
    protected HandsState ManHands;

    public Person(String name, Integer age, Sex sex) {
        Name = name;
        Age = age;
        ManSex = sex;
        ManMood = Mood.Neutral;
        ManHealth = Health.Ok;
        ManState = State.Stand;
    }

    public Person(String name, Integer age, Sex sex, Mood mood, State state) {
        Name = name;
        Age = age;
        ManSex = sex;
        ManHealth = Health.Ok;
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

    public final Health getHealth() {
        return ManHealth;
    }

    public final void setHealth(Health health) {
        if (ManHealth == Health.Dead) {
            System.out.println("Нельзя изменить здоровье мертвого");
            return;
        }
        System.out.println(getName() + " теперь " + health);
        ManHealth = health;
    }

    public final Mood getMood() {
        return ManMood;
    }

    public void setMood(Mood mood) {
        ManMood = mood;
    }

    public final void die() {
        if (ManHealth == Health.Dead) {
            System.out.println("Нельзя умереть дважды");
            return;
        }
        ManHealth = Health.Dead;
        ManHands = HandsState.Strange;
        System.out.println("RIP " + getName() + " умер.");
    }

    public HandsState getHandState() {
        return ManHands;
    }

    public final void setHandState(HandsState handsState) {
        if (getHandState() == handsState) {
            return;
        }
        ManHands = handsState;
        System.out.println(getName() + ": " + getHandState());
    }

    public final State getState() {
        return ManState;
    }

    /**
     * @param state состояние человека
     */
    public void setState(State state) {
        if (getHealth() == Health.Dead) {
            System.out.println(getName() + " мертв");
            return;
        }
        if (state == State.Read) {
            System.out.println("Чтобы читать, нужно взять книгу");
            return;
        }

        if (state == ManState) {
            return;
        }
        switch (state) {
            case Sit -> {
                switch (ManState) {
                    case Fly, FlyAndRead, FlyLikeABird, FlyAndSleep, Sleep -> {
                        return;
                    }
                    default -> {
                        ManState = State.Sit;
                        return;
                    }
                }
            }
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

    public final void startFly() {
        if (getHealth() == Health.Dead) {
            System.out.println(getName() + " мертв");
            return;
        }
        if (getHandState() == HandsState.BothUp && getState() == State.Fly) {
            setState(State.FlyLikeABird);
            System.out.println("\uD83D\uDC26 " + getName() + " летает словно птица! \uD83D\uDC26");
            return;
        }
        System.out.println("\uD83D\uDC4E " + getName() + " не может летать, пока не поднимет руки \uD83D\uDC4E");
    }

    protected final void addKnowledge(String knowledge) {
        KnowledgeArray.add(knowledge);
    }

    /**
     * Человек засыпает
     */
    public final void goSleep() {
        if (getHealth() == Health.Dead) {
            System.out.println(getName() + " мертв");
            return;
        }
        if (ManState == State.Fly || ManState == State.Lie) {
            System.out.println("\uD83D\uDE34 " + getName() + " засыпает... \uD83D\uDE34");
            switch (DreamType.getRandDreamType()) {
                case GoodDream -> {
                    System.out.println("\uD83D\uDCA4 " + getName() + " увидел(а) хороший сон \uD83D\uDCA4");
                    ManMood = Mood.Happy;
                }
                case BadDream -> {
                    System.out.println("\uD83D\uDCA4 " + getName() + " увидел(а) плохой сон \uD83D\uDCA4");
                    ManMood = Mood.Sad;
                }
                case Nightmare -> {
                    System.out.println("\uD83D\uDCA4 " + getName() + " увидел(а) кошмарный сон \uD83D\uDCA4");
                    ManMood = Mood.Scared;
                }
                case None -> {
                    System.out.println("\uD83D\uDCA4 " + getName() + " не увидел(а) сна \uD83D\uDCA4");
                    ManMood = Mood.Neutral;
                }
            }
            if (ManState == State.Fly) {
                ManState = State.FlyAndSleep;
                return;
            }
            ManState = State.Sleep;
        }
        System.out.println("❌ " + getName() + " не может сейчас заснуть! ❌");
    }

    /**
     * Человек просыпается
     */
    public final void wakeUp() {
        if (getHealth() == Health.Dead) {
            System.out.println(getName() + " мертв");
            return;
        }
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
        if (getHealth() == Health.Dead) {
            System.out.println(getName() + " мертв");
            return;
        }
        Age++;
        System.out.println(getName() + " стал старше на год. Теперь ему " + getAge() + " лет.");
    }

    /**
     * @param book Книга, которую человек должен прочитать
     *             Человек начинает читать книгу
     */
    public void startReading(Book book) throws NullBookException {
        if (getHealth() == Health.Dead) {
            System.out.println(getName() + " мертв");
            return;
        }
        System.out.println(getName() + " не умеет читать!");
    }

    public final void startReading(BookShelf bookShelf, Integer index) throws NullBookException {
        this.startReading(bookShelf.getBook(index));
    }

    /**
     * Человек содится на стул
     *
     * @param chair Стул, на который человек должен сесть
     */
    public void sitOnChair(Chair chair) {
        this.setState(State.Sit);
        if (getState() == State.Sit) {
            chair.setSittingMan(this);
            System.out.println(getName() + " сел на cтул#" + chair.getChairId());
        }
    }

    /**
     * Человек заканчивает читать книгу
     */
    public void endReading() {
        System.out.println(getName() + "не начинал читать!");
    }

    @Override
    public String toString() {
        return "Man{" + "Name='" + Name + '\'' + ", ManSex=" + ManSex + ", KnowledgeArray=" + KnowledgeArray + ", Age=" + Age + ", ManMood=" + ManMood + ", ManState=" + ManState + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        return o instanceof Person && ((Person) o).getName().equals(getName()) && ((Person) o).getAge().equals(getAge()) && ((Person) o).KnowledgeArray.equals(KnowledgeArray) && ((Person) o).getSex().equals(getSex()) && ((Person) o).getMood().equals(getMood()) && ((Person) o).getHandState().equals(getHandState());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), ManSex, KnowledgeArray, getAge(), ManMood, ManState);
    }
}
