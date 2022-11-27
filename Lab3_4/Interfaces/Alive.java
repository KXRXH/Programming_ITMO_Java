package Lab3_4.Interfaces;

import Lab3_4.Persons.Mood;
import Lab3_4.Persons.PersonState;
import Lab3_4.Persons.Sex;
import Lab3_4.World.Gravity;

public interface Alive {
    PersonState getState(Gravity gravity);
    Sex getSex();
    Mood getMood();
    int getAge();
    void setState(PersonState newState);
    void setMood(Mood newMood);
    void growUp();
    void goSleep();
}
