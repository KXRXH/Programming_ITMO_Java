package Lab3_4.Objects;

import Lab3_4.Exceptions.BadIndexException;
import Lab3_4.Exceptions.NullBookException;
import Lab3_4.Exceptions.UnexpectedArgumentValueException;
import Lab3_4.Exceptions.UnexpectedMaterialException;

import java.util.ArrayList;

public class BookShelf extends SomeObject {
    private final ArrayList<Book> Books = new ArrayList<>();

    public BookShelf(Material material, ArrayList<Book> Books) {
        super(ObjectState.Stand, Weight.Heavy, material);
        if (material == Lab3_4.Objects.Material.Paper) {
            throw new UnexpectedMaterialException("Книжная полка не может быть из бумаги");
        }
        if (Books == null) {
            throw new UnexpectedArgumentValueException("Книжная полка не может быть равна null");
        }
        this.Books.addAll(Books);
    }

    public BookShelf(Material material) throws UnexpectedMaterialException {
        super(ObjectState.Stand, Weight.Heavy, material);
        if (material == Lab3_4.Objects.Material.Paper) {
            throw new UnexpectedMaterialException("Книжная полка не может быть из бумаги");
        }
    }

    public final void addBook(Book book) throws NullBookException {
        if (book == null) {
            throw new NullBookException();
        }
        Books.add(book);
    }

    public final void removeBook(Book book) throws NullBookException {
        if (book == null) {
            throw new NullBookException();
        }
        Books.remove(book);
    }

    public final Book getBook(Integer index) throws BadIndexException {
        if (index < 0 || index >= Books.size()) {
            throw new BadIndexException("Книги с индексом " + index + " не существует");
        }
        return Books.get(index);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        for (Book book : Books) {
            hash += book.hashCode();
        }
        return hash + getWeight().hashCode() + getState().hashCode();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Книжная полка состоит из ").append(Books.size()).append(" книг:\n");
        for (Book book : Books) {
            result.append(book.toString()).append("\n");
        }
        return result.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        return obj instanceof BookShelf && this.hashCode() == obj.hashCode();
    }
}
