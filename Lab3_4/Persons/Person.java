package Lab3_4.Persons;

import Lab3_4.Interfaces.Alive;
import Lab3_4.World.Gravity;
import Lab3_4.World.ObjectWeight;

public abstract class Person implements Alive {
    private final String Name;
    private int Age;
    private final Sex PersonSex;
    private Mood PersonMood;
    private final ObjectWeight Weight = ObjectWeight.MEDIUM;
    private PersonState State;

    public Person(String name, int age, Sex sex, Mood mood, PersonState state) {
        Name = name;
        Age = age;
        PersonMood = mood;
        PersonSex = sex;
        State = state;
    }

    public Person(String name, int age, Sex sex, Mood mood) {
        Name = name;
        Age = age;
        PersonMood = mood;
        PersonSex = sex;
        State = PersonState.STAND;
    }

    public final PersonState getState(Gravity gravity) {
        if (gravity == Gravity.EARTH) {
            return this.State;
        } else {
            this.State = PersonState.FLY;
        }
        return this.State;
    }

    public final Sex getSex() {
        return this.PersonSex;
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
        if (this.State == PersonState.SIT && newState != PersonState.STAND) {
            System.out.println(this.getName() + " не может сделать это, пока " + this.getState());
            return;
        }
        if (this.State == newState) {
            System.out.println(this.getName() + " уже " + this.getState().toString());
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
            case WALK, SLEEP -> System.out.println(this.getName() + " не может сейчас спать!");
            default -> this.setState(PersonState.SLEEP);
        }
    }

    public final void wakeUp() {
        if (State == PersonState.SLEEP) {
            State = PersonState.STAND;
        } else System.out.println(this.getName() + " не спит!");
    }

    public ObjectWeight getWeight() {
        return Weight;
    }
}
