package Lab3_4;

import Lab3_4.Generator.Generator;
import Lab3_4.Objects.Book;
import Lab3_4.People.CleverMan;
import Lab3_4.People.Mood;
import Lab3_4.People.Sex;
import Lab3_4.People.State;
import Lab3_4.World.Gravity;
import Lab3_4.World.World;

public class Lab3_4 {
    public static void main(String... args) {
        World world = new World(Gravity.Earth);
        world.addMan(new CleverMan("Знайка", 8, Sex.Male) {
            public void startReading(Book book) {
                super.startReading(book);
                System.out.println("Знайка становится счастливым");
                setMood(Mood.Happy);
            }
        });
        world.addObject(Generator.generateNewBook());
        System.out.println("В мире " + world.getPeopleCount() + " человек(а)");
        // world.getMan(0).info();
        world.getMan(0).startReading((Book) world.getObject(0));
        world.updateWorldGravity(Gravity.Zero);
        world.getMan(0).setState(State.Sit);
    }
}
