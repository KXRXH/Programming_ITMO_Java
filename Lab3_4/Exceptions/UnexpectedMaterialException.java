package Lab3_4.Exceptions;

public class UnexpectedMaterialException extends IllegalArgumentException {
    public UnexpectedMaterialException(String message) {
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
