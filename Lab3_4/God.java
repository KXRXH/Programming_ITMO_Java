package Lab3_4;


import Lab3_4.Arts.Art;
import Lab3_4.Objects.ObjectCreatedByAMan;
import Lab3_4.Persons.*;
import Lab3_4.World.Gravity;

import java.util.ArrayList;
import java.util.Objects;

import static Lab3_4.Persons.PersonState.READ;

public class God {
    private static class World {
        private final ArrayList<Person> Persons = new ArrayList<>();
        private final ArrayList<ObjectCreatedByAMan> Objects = new ArrayList<>();

        private Gravity WorldGravity;
        private boolean ZnaykaIsHere;

        World(Gravity worldGravity) {
            WorldGravity = worldGravity;
        }

        public final Gravity getWorldGravity() {
            return WorldGravity;
        }

        public final void setWorldGravity(Gravity newGravity) {
            WorldGravity = newGravity;
        }

        public void createPerson(Person newPerson) {
            System.out.println("Бог создал человека: " + newPerson.getName());
            Persons.add(newPerson);
        }

        public void createObject(ObjectCreatedByAMan _object) {
            System.out.println("Бог создал предмет!");
            Objects.add(_object);
        }

        public Person getPerson(String name) {
            for (Person person : Persons) {
                if (person.getName().equals(name)) {
                    return person;
                }
            }
            return null;
        }

        public final CleverPerson createZnayka() {
            if (this.ZnaykaIsHere) {
                System.out.println("Знайка уже существует!");
                return null;
            }
            System.out.println("Бог создал Знайку!");
            this.ZnaykaIsHere = true;
            CleverPerson znayka = new CleverPerson("Знайка", 7, Sex.MALE, Mood.HAPPY, PersonState.STAND) {
                @Override
                public void startReading(Lab3_4.Objects.Book book) {
                    this.setState(READ);
                    if (this.getState() == READ) {
                        this.Book = book;
                        // Знайка становится счастливым, когда читает
                        this.setMood(Mood.HAPPY);
                        this.Knowledges.add(book.getKnowledge());
                        System.out.println(this.getName() + " начал читать " + book.getName());
                    }
                }
            };
            Persons.add(znayka);
            return znayka;
        }
    }

    private static final ArrayList<World> Worlds = new ArrayList<>();

    public static void main(String... args) {
        System.out.println("Бог появился!");
        System.out.println(Art.God);
        GodCreateWorld(Gravity.EARTH);
        Worlds.get(0).setWorldGravity(Gravity.ZERO);
        Worlds.get(0).createZnayka();
        Worlds.get(0).createZnayka();
        System.out.println(Objects.requireNonNull(Worlds.get(0).getPerson("Знайка")).getState(Worlds.get(0).getWorldGravity()));
        GodDestroyWorld(Worlds.get(0));
    }

    // God methods
    private static void GodDestroyWorld(World world) {
        System.out.println("Бог уничтожил мир!");
        System.out.println(Art.Explosion);
        Worlds.remove(world);
    }

    private static void GodCreateWorld(Gravity gravity) {
        System.out.println("Бог создал новый мир!");
        var world = new World(gravity);
        Worlds.add(world);
    }
}
