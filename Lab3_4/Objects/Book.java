package Lab3_4.Objects;

public class Book extends ObjectCreatedByAMan {
    // Author of the book
    private final String Author;
    // Book name
    private final String BookName;
    // Knowledge witch is in the book
    private final String Knowledge;

    public Book(State currentState, Material material, String bookName, String knowledge) {
        super(currentState, material);
        BookName = bookName;
        Knowledge = knowledge;
        Author = "Неизвестный";
    }

    public Book(State currentState, Material material, String bookName, String knowledge, String author) {
        super(currentState, material);
        BookName = bookName;
        Knowledge = knowledge;
        Author = author;
    }

    public final String getAuthor() {
        return Author;
    }

    public final String getName() {
        return BookName;
    }

    public final String getKnowledge() {
        return Knowledge;
    }

    @Override
    public boolean equals(Object otherBook) {
        // Check if the object is the same by hashcode
        if (otherBook.getClass().isInstance(this)) {
            return (this == otherBook);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Author.hashCode() + BookName.hashCode()  + Knowledge.hashCode();
    }

    @Override
    public String toString() {
        return "Книга: " + getName() + " автор: " + getAuthor()  +
                "\nЗнание: " + getKnowledge();
    }
}

