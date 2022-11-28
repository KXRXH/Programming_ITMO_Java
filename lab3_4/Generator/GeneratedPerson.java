package lab3_4.Generator;

import lab3_4.People.Man;
import lab3_4.People.Mood;
import lab3_4.People.Sex;
import lab3_4.People.State;

public class GeneratedPerson extends Man {
    public GeneratedPerson(String name, Integer age, Sex sex) {
        super(name, age, sex, Mood.Neutral, State.Stand);
    }
}
