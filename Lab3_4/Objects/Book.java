package Lab3_4.Objects;

public class Book extends SomeObject {
    private final String Author;
    private final String Title;

    private final Integer PagesCount;
    private final String Knowledge;


    public Book(String author, String title, ObjectState state, Integer pagesCount, String knowledge) {
        super(state, Weight.Light);
        this.Author = author;
        this.Title = title;
        PagesCount = pagesCount;
        Knowledge = knowledge;
    }

    public String getAuthor() {
        return Author;
    }

    public String getTitle() {
        return Title;
    }

    public String getKnowledge() {
        return Knowledge;
    }

    public Integer getPagesCount() {
        return PagesCount;
    }
}
