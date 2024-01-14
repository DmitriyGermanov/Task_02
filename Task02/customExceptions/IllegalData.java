package customExceptions;

import java.text.ParseException;

public class IllegalData extends RuntimeException {
    public IllegalData(String message) {
        super(message);
    }
}

