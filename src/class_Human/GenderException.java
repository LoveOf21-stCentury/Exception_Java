package class_Human;

public class GenderException extends RuntimeException{
    public GenderException(){
        super("Gender should be 'f' or 'm'");
    }
}
