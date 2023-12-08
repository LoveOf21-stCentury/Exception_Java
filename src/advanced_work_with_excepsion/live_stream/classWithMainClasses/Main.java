package advanced_work_with_excepsion.live_stream.classWithMainClasses;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
//        try (Counter counter = new Counter()) {
//            System.out.println(counter.getCount());
//            counter.add();
//            System.out.println(counter.getCount());
//        } catch (Exception e) {
//
//        }

//        System.out.println(divide(12, 0));

        try {
            fileReader("wdwd");
        } catch (Checked e) {
            e.printStackTrace();
        }
    }
    public static double divide(int a, int b){
        double res = 0;
        try{
            res = a/b;
        }catch(ArithmeticException e){
            throw new Unchecked();
        }
        return res;
    }

    public static void fileReader(String path) throws Checked {
        try{
            FileReader fileReader = new FileReader(path);
        } catch (FileNotFoundException e){
            throw new Checked("Don't exist");
        }
    }
}
