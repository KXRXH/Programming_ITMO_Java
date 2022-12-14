package Lab3_4.Generator;

import Lab3_4.Human.FoolishPerson;
import Lab3_4.Human.Person;
import Lab3_4.Human.Sex;
import Lab3_4.Objects.*;

import java.util.ArrayList;
import java.util.Random;

public class Generator {
    private static final String[] MaleNames = {"Степан", "Владимир", "Тимофей", "Ярослав", "Павел", "Егор", "Сергей",
            "Владислав", "Федор", "Константин", "Максим", "Артём", "Никита"};
    private static final String[] FemaleNames = {"Анна", "Мария", "Александра", "Анастасия", "Виктория", "Екатерина",
            "Маргарита", "Дарья", "Алиса", "Ангелина", "Валерия", "Вероника", "Василиса", "Вера", "Вероника", "Галина",
            "Дарья", "Диана", "Евгения", "Екатерина", "Елена", "Елизавета", "Ирина", "Карина", "Кристина", "Лариса",
            "Лидия", "Любовь", "Маргарита", "Марина", "Мария", "Надежда", "Наталья", "Нина", "Оксана", "Ольга",
            "Полина", "Светлана", "София", "Татьяна", "Ульяна", "Фаина", "Юлия", "Яна", "Ярослава"};

    public static Person generateNewMan() {
        Integer age = (int) (Math.random() * 55 + 5);
        Sex sex = (new Random().nextInt(2) == 0) ? Sex.Male : Sex.Female;
        final String name;
        if (sex == Sex.Male) {
            name = MaleNames[(int) (Math.random() * MaleNames.length)];
        } else {
            name = FemaleNames[(int) (Math.random() * FemaleNames.length)];
        }
        return new FoolishPerson(name, age, sex);
    }

    public static Book generateNewBook() {
        Integer pages = (int) (Math.random() * 1000);
        String name = "Книга №" + (int) (Math.random() * 1000);
        String knowledge = "Новое знание " + (int) (Math.random() * 1000);
        String author = MaleNames[(int) (Math.random() * MaleNames.length)];
        return new Book(author, name, ObjectState.Stand, pages, knowledge);
    }

    public static Chair generateNewChair() {
        return new Chair(Material.Wood, 4, ObjectState.Stand);
    }

    public static BookShelf generateNewBookShelf(int booksCount) {
        ArrayList<Book> books = new ArrayList<>();
        for (int i = 0; i < booksCount; i++) {
            books.add(generateNewBook());
        }
        return new BookShelf(Material.Wood, books);
    }
}
