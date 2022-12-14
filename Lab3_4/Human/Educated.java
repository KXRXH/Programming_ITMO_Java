package Lab3_4.Human;

import Lab3_4.Objects.Book;
import Lab3_4.Objects.BookShelf;

public interface Educated {
    void startReading(BookShelf bookShelf, Integer index);

    void startReading(Book book);

    void learn(String somethingNew);

}
