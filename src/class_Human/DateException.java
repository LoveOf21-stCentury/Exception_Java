package class_Human;

import java.io.IOException;

public class DateException extends RuntimeException {
    public DateException(String message) {
        super(message);
    }
    public DateException() {
        super("Format of date non correct. 'DD.MM.YYYY'");
    }
}
