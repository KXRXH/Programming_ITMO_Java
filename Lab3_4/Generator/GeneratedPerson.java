package Lab3_4.Generator;

import Lab3_4.People.Man;
import Lab3_4.People.Mood;
import Lab3_4.People.Sex;
import Lab3_4.People.State;

public class GeneratedPerson extends Man {
    public GeneratedPerson(String name, Integer age, Sex sex) {
        super(name, age, sex, Mood.Neutral, State.Stand);
    }
}
