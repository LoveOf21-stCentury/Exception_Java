package advanced_work_with_excepsion.live_stream.nestes_classes;

public class MyArrayDataException extends RuntimeException{
    public MyArrayDataException(int i, int j){
        super(String.format("In cell [%d][%d] not a number", i, j));

    }
}
