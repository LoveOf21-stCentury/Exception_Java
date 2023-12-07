package exception_handling;

public class CharA {
    public static void main(String[] args) {
        char a;

        if (args.length == 0) {
            a = 'L';
        } else {
            a = args[0].charAt(0);
        }

        try {
            String result = expr(a);
            System.out.println("Result: Your input was - " + result);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static String expr(char a) {
        String res = String.valueOf(a);
        if (a == ' ') {
            throw new RuntimeException("Empty string has been input.");
        }
        return res;
    }
}