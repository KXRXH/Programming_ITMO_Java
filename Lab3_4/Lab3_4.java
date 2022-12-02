package Lab3_4;

import Lab3_4.Exceptions.BadIndexException;
import Lab3_4.Exceptions.NullBookException;
import Lab3_4.Generator.Generator;
import Lab3_4.Human.CleverMan;
import Lab3_4.Human.Mood;
import Lab3_4.Human.Sex;
import Lab3_4.Human.State;
import Lab3_4.Objects.Book;
import Lab3_4.World.Gravity;
import Lab3_4.World.World;

public class Lab3_4 {
    public static void main(String... args) throws BadIndexException, NullBookException {
        World world = new World(Gravity.Earth);
        world.addMan(new CleverMan("Знайка", 8, Sex.Male) {
            @Override
            public void startReading(Book book) throws NullBookException {
                super.startReading(book);
                System.out.println("Знайка становится счастливым");
                setMood(Mood.Happy);
            }
        });
        world.addObject(Generator.generateNewBook());
        world.addObject(Generator.generateNewBookShelf(20));
        System.out.println(world.getObject(1));
        System.out.println("В мире " + world.getPeopleCount() + " человек(а)");
        // world.getMan(0).info();
        world.updateWorldGravity(Gravity.Zero);
        world.getMan(0).setState(State.Sit);
    }
}
