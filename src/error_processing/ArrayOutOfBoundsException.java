package error_processing;

public class ArrayOutOfBoundsException {
    public static void main(String[] args) {
        try {
            arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bound");
        }
    }

    public static void arrayOutOfBoundsException() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int i = arr.length;
        int a = arr[10];
        if (a > i) {
            throw new java.lang.ArrayIndexOutOfBoundsException();
        } else {
            System.out.println(a);
        }
    }
}
