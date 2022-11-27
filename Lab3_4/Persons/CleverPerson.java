package Lab3_4.Persons;

import Lab3_4.Objects.Book;

import java.util.ArrayList;

import static Lab3_4.Persons.PersonState.*;

public class CleverPerson extends Person {
    // The book which CleverPerson is reading
    protected Book Book;
    protected final ArrayList<String> Knowledges = new ArrayList<>();

    public CleverPerson(String name, Integer age, Sex sex, Mood mood, PersonState state) {
        super(name, age, sex, mood, state);
    }

    public Book getBook() {
        return this.Book;
    }


    @Override
    public void setState(PersonState newState) {
        switch (this.getState()) {
            case SLEEP, WALK -> System.out.println("Знайка не может это сделать, пока он " + this.getState());
            default -> super.setState(newState);
        }
    }

    public void startReading(Book book) {
        this.setState(READ);
        if (this.getState() == READ) {
            this.Book = book;
            this.Knowledges.add(book.getKnowledge());
            System.out.println(this.getName() + " начал читать " + book.getName());
        }
    }

    public void stopReading() {
        stopReading(STAND);
    }

    public void stopReading(PersonState newState) {
        System.out.println(this.getName() + " перестал читать книгу: " + this.getBook().getName());
        this.Book = null;
        this.setState(newState);
    }

    @Override
    public int hashCode() {
        int book_hash = (this.Book == null ? 0 : this.Book.hashCode());
        return book_hash + this.getName().hashCode() + this.getSex().hashCode()
                + this.getAge() + this.getMood().hashCode() + this.getState().hashCode();
    }

}
