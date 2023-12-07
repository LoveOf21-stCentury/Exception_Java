package exception_handling;

public class DivAndSum {
    public static void main(String[] args) {
        int a;
        int b;

        if (args.length == 0) {
            a = 90;
            b = 3;
        } else {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        }

        double result = expr(a, b);
        System.out.println(result);
    }

    public static double expr(int a, int b) {
        double res = 0;
        if (b != 0) {
            printSum(a, b);
            res = (double) a / b;
            return res;
        } else {
            System.err.println("Division by zero");
            return res;
        }
    }

    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }
}
