package Lab3_4.People;

import Lab3_4.Objects.Book;

public class CleverMan extends Man {

    private Book MansBook = null;

    public CleverMan(String name, Integer age, Sex sex) {
        super(name, age, sex);
    }

    public CleverMan(String name, Integer age, Sex sex, Mood mood, State state) {
        super(name, age, sex, mood, state);
    }

    @Override
    public void startReading(Book book) {
        if (MansBook == null) {
            MansBook = book;
            System.out.println(getName() + " начал читать " + MansBook.getTitle());
            addKnowledge(MansBook.getKnowledge());
            return;
        }
        System.out.println(getName() + " уже читает " + MansBook.getTitle());
    }

    @Override
    public void endReading() {
        if (MansBook != null) {
            System.out.println(getName() + " закончил читать " + MansBook.getTitle());
            MansBook = null;
            return;
        }
        System.out.println(getName() + " не читает ничего");
    }
}
