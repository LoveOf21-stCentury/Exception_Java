package exception_handling;

public class IsFloat {
    public static void main(String[] args) {
        String input;
        if (args.length == 0) {
            input = "3.14";
        } else {
            input = args[0];
        }
        float result = IsFloat.isFloat(input);
        System.out.println(result);
    }

    public static float isFloat(String input) {
        try {
           return Float.parseFloat(input);
        } catch (NumberFormatException e){
            System.err.println("Format is not a float");
            return Float.NaN;
        }
    }
}
