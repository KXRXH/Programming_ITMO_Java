package Lab3_4.Human;

import Lab3_4.Exceptions.NullBookException;
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
    public void startReading(Book book) throws NullBookException {
        if (book == null) {
            throw new NullBookException();
        }
        if (MansBook == null) {
            MansBook = book;
            System.out.println("\uD83D\uDCDA " + getName() + " начал читать " + MansBook.getTitle() +" \uD83D\uDCDA");
            addKnowledge(MansBook.getKnowledge());
            return;
        }
        System.out.println("\uD83D\uDCDA " + getName() + " уже читает " + MansBook.getTitle() + " \uD83D\uDCDA");
    }

    @Override
    public void endReading() {
        if (MansBook != null) {
            System.out.println(getName() + " закончил читать " + MansBook.getTitle());
            MansBook = null;
            return;
        }
        System.out.println("\uD83D\uDCDA " + getName() + " не читает ничего \uD83D\uDCDA");
    }

    @Override
    public String toString() {
        return "CleverMan{" +
                "MansBook=" + MansBook +
                ", Name='" + Name + '\'' +
                ", ManSex=" + ManSex +
                ", KnowledgeArray=" + KnowledgeArray +
                ", Age=" + Age +
                ", ManMood=" + ManMood +
                ", ManState=" + ManState +
                ", ManHands=" + ManHands +
                '}';
    }
}
