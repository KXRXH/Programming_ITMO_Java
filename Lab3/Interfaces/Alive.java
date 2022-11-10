package Lab3.Interfaces;

import Lab3.Persons.Mood;
import Lab3.Persons.PersonState;
import Lab3.Persons.Sex;

public interface Alive {
    PersonState getState();
    Sex getSex();
    Mood getMood();
    int getAge();
    void setState(PersonState newState);
    void setMood(Mood newMood);
    void growUp();
    void goSleep();
}
