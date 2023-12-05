package error_processing;

public class NumberFormat {
    public static void main(String[] args) {
        try {
            numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Number format exception");
        }
    }

    public static void numberFormatException(){
        String str = "asd";
        int num = Integer.parseInt(str);
    }
}
