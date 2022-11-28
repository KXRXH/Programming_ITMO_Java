package Lab3_4.People;

public abstract class Man implements Alive{
    private final String Name;
    private Integer Age;
    private Mood ManMood;
    private final Sex ManSex;
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

    public String getName() {
        return Name;
    }

    public Integer getAge() {
        return Age;
    }

    public Mood getMood() {
        return ManMood;
    }

    public State getState() {
        return ManState;
    }

    public Sex getSex() {
        return ManSex;
    }

    public void growUp() {
        Age++;
        System.out.println(getName() + " стал старше на год. Теперь ему " + getAge() + " лет.");
    }

    public void setMood(Mood mood) {
        ManMood = mood;
    }

    public void setState(State state) {
        // TODO!
        ManState = state;
    }
}
