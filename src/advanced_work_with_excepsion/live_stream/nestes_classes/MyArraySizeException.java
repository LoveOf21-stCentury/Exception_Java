package advanced_work_with_excepsion.live_stream.nestes_classes;

public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException(){
        super("Size is not 3x3");
    }
}
