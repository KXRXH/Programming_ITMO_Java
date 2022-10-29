package Lab3.Persons;

import Lab3.Objects.Book;

import static Lab3.Persons.PersonState.*;

public final class Znayika extends Person {
    // The book which Znayika is reading
    private Book Book;

    public Znayika(Mood mood, PersonState state) {
        super("Знайка", 7, mood, state);
    }

    public Book getBook() {
        return this.Book;
    }

    @Override
    public void setState(PersonState newState) {
        switch (this.getState()) {
            case SLEEP, WALK -> System.out.println("Znayika can't do this while he is " + this.getState().toString());
            default -> super.setState(newState);
        }
    }

    public void startReading(Book book) {
        this.setState(READ);
        if (this.getState() == READ) {
            this.Book = book;
            // Znayika becomes happy when he starts reading
            this.setMood(Mood.HAPPY);
            System.out.println("Znayika started reading " + book.getName());
        }
    }

    public void stopReading(PersonState newState) {
        this.Book = null;
        this.setState(newState);
    }

    public void stopReading() {
        this.Book = null;
        this.setState(PersonState.STAND);
    }
}
