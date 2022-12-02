package Lab3_4.Exceptions;

public class UnexpectedArgumentValueException extends IllegalArgumentException {
    public UnexpectedArgumentValueException(String message) {
        super(message);
    }

    /**
     * Use this method to print the error message
     *
     * @return string representation of this exception
     */
    public String getError() {
        return "Error: " + getMessage();
    }
}
