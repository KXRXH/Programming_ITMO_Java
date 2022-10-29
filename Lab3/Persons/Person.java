package Lab3.Persons;

public abstract class Person {
    private String Name;
    private int Age;
    private Mood PersonMood;
    private PersonState State;

    public Person(String name, int age, Mood mood, PersonState state) {
        Name = name;
        Age = age;
        PersonMood = mood;
        State = state;
    }

    public Person(String name, int age, Mood mood) {
        Name = name;
        Age = age;
        PersonMood = mood;
        State = PersonState.STAND;
    }

    public final PersonState getState() {
        return this.State;
    }

    public final Mood getMood() {
        return this.PersonMood;
    }

    public final String getName() {
        return this.Name;
    }

    public final int getAge() {
        return this.Age;
    }

    public void setState(PersonState newState) {
        if (this.State == newState) {
            System.out.println(this.getName() + " is already " + this.getState().toString());
        } else State = newState;
    }

    public void setMood(Mood newMood) {
        PersonMood = newMood;
    }

    public final void growUp() {
        this.Age++;
    }

    public final void goSleep() {
        switch (State) {
            case WALK, SLEEP -> System.out.println(this.getName() + " can't go sleep now!");
            default -> this.setState(PersonState.SLEEP);
        }
    }

    public final void wakeUp() {
        if (State == PersonState.SLEEP) {
            State = PersonState.STAND;
        } else System.out.println(this.getName() + " isn't sleeping!");
    }

}
