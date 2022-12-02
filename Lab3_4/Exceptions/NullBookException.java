package Lab3_4.Exceptions;

public class NullBookException extends NullPointerException {
    public NullBookException() {
        super("Книга не может быть null");

    }

    /**
     * Use this method to print the error message
     *
     * @return string representation of this exception
     */
    public String getError() {
        return "Error: Книга не может быть null";
    }
}
