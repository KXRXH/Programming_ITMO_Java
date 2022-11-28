package lab3_4.Generator;

import lab3_4.People.Man;
import lab3_4.People.Sex;

import java.util.Random;

public class Generator {
    private static final String[] Names = {"Бобик"};

    public static Man generateNewMan() {
        Integer age = (int) (Math.random() * 60);
        String name = Names[(int) (Math.random() * Names.length)];
        Random random = new Random();
        Sex sex = (random.nextInt(2) == 0) ? Sex.Male : Sex.Female;
        return new GeneratedPerson(name, age, sex);
    }
}
