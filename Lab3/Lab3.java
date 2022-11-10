package Lab3;


import Lab3.Objects.*;
import Lab3.Persons.Mood;
import Lab3.Persons.PersonState;
import Lab3.Persons.Znayika;

public class Lab3 {
    public static void main(String... args) {
        Znayika znayika = new Znayika(Mood.NEUTRAL, PersonState.STAND);
        Book hpBook = new Book(State.STAND, Material.PAPER, "Harry Potter",
                new String[]{"Title", "main text"}, "J.K.Rowling");
        znayika.startReading(hpBook);
        System.out.println(znayika.getBook());
    }
}
