package customExceptions;

public class IllegalPhoneNumber extends NumberFormatException{
    public IllegalPhoneNumber(String message) {
        super(message);
    }
}
