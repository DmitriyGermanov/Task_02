package customExceptions;

public class IllegalGender extends RuntimeException {
    public IllegalGender(String message) {
        super(message);
    }
}
