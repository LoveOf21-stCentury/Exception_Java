package exception_handling;

import java.util.Arrays;

public class ArraysElemDivision {
    public static void main(String[] args) {
        int[] intArray;
        int d;

        if (args.length == 0) {
            intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
            d = 9;
        } else {
            intArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
            d = Integer.parseInt(args[1]);
        }

        double result = expr(intArray, d);
        System.out.println(result);
    }

    public static double expr(int[] intArray, int d) {
        try {
            double res = intArray[8] / d;
            return res;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Array out bounds exception");
            return Double.NaN;
        } catch (ArithmeticException ex) {
            System.err.println("Division by zero");
            return Double.NaN;
        }
    }
}
