package exceptions;

public class InvalidLogin extends RuntimeException {
    public InvalidLogin(String message) {
        super(message);
        System.out.println("Retry Login");
    }
}
