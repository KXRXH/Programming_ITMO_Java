package Lab3_4.Generator;

import Lab3_4.Objects.Book;
import Lab3_4.Objects.Chair;
import Lab3_4.Objects.ObjectState;
import Lab3_4.People.Man;
import Lab3_4.People.Sex;
import Lab3_4.People.StupidPerson;

import java.util.Random;

public class Generator {
    private static final String[] MaleNames = {"Степан", "Владимир", "Тимофей", "Ярослав", "Павел", "Егор", "Сергей",
            "Владислав", "Федор", "Константин", "Максим", "Артём", "Никита"};
    private static final String[] FemaleNames = {"Анна", "Мария", "Александра", "Анастасия", "Виктория", "Екатерина",
            "Маргарита", "Дарья", "Алиса", "Ангелина", "Валерия", "Вероника", "Василиса", "Вера", "Вероника", "Галина",
            "Дарья", "Диана", "Евгения", "Екатерина", "Елена", "Елизавета", "Ирина", "Карина", "Кристина", "Лариса",
            "Лидия", "Любовь", "Маргарита", "Марина", "Мария", "Надежда", "Наталья", "Нина", "Оксана", "Ольга",
            "Полина", "Светлана", "София", "Татьяна", "Ульяна", "Фаина", "Юлия", "Яна", "Ярослава"};

    public static Man generateNewMan() {
        Integer age = (int) (Math.random() * 55 + 5);
        Sex sex = (new Random().nextInt(2) == 0) ? Sex.Male : Sex.Female;
        final String name;
        if (sex == Sex.Male) {
            name = MaleNames[(int) (Math.random() * MaleNames.length)];
        } else {
            name = FemaleNames[(int) (Math.random() * FemaleNames.length)];
        }
        return new StupidPerson(name, age, sex);
    }

    public static Book generateNewBook() {
        Integer pages = (int) (Math.random() * 1000);
        String name = "Книга №" + (int) (Math.random() * 1000);
        String knowledge = "Новое знание " + (int) (Math.random() * 1000);
        String author = MaleNames[(int) (Math.random() * MaleNames.length)];
        return new Book(author, name, ObjectState.Stand, pages, knowledge);
    }

    public static Chair generateNewChair() {
        return new Chair(4, ObjectState.Stand);
    }
}
