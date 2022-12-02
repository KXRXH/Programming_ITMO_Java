package Lab3_4.Objects;

public class Book extends SomeObject {
    private final String Author;
    private final String Title;

    private final Integer PagesCount;
    private final String Knowledge;


    public Book(String author, String title, ObjectState state, Integer pagesCount, String knowledge) {
        super(state, Weight.Light, Lab3_4.Objects.Material.Paper);
        this.Author = author;
        this.Title = title;
        PagesCount = pagesCount;
        Knowledge = knowledge;
    }

    public String getAuthor() {
        return Author;
    }

    @Override
    public void setState(ObjectState state) {
        if (State == state) {
            return;
        }
        System.out.println("Книга " + this.getTitle() + " теперь " + state.toString().toLowerCase());
        this.State = state;
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

    @Override
    public String toString() {
        return "Книга с названием: \"" + this.getTitle() + "\"| Автора: " + this.getAuthor() +
                " | Состояние: " + this.getState().toString().toLowerCase() +
                " | Страниц: " + this.getPagesCount() + "| Содержит: " + this.getKnowledge();
    }

    @Override
    public int hashCode() {
        return this.getTitle().hashCode() + this.getAuthor().hashCode() + this.getPagesCount().hashCode()
                + this.getKnowledge().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        return obj instanceof Book && this.hashCode() == obj.hashCode();
    }
}
