package exceptions;

public class InvalidMarks extends RuntimeException {
    public InvalidMarks(String message) {
        super(message);
    }
}
