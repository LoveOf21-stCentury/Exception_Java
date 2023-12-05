package error_processing;

public class DivisionByZero {
    public static void main(String[] args) {
        try {
            divisionByZero(12, 0);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
    }

    public static void divisionByZero(int a, int b) {
        int res = a / b;
        if (b == 0) {
            throw new ArithmeticException();
        } else {
            System.out.println(res);
        }
    }
}
