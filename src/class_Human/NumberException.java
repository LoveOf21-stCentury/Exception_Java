package class_Human;

import java.io.IOException;

public class NumberException extends RuntimeException{
    public NumberException() {
        super("Format is not correct:\n1.Length should be by 11 numbers.\n2.There is needed the ONLY Integer numbers.");
    }
}
