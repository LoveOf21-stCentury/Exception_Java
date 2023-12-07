package exception_handling.live_stream;

public class Array2D {
    /**
     * Обработайте возможные исключительные ситуации. "Битые" значения
     * в исходном массиве считайте нулями. Можно внести в код правки,
     * которые считаете необходимыми
     */
    public static void main(String[] args) {
        String[][] arr0 = new String[][]{
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1"},
                {"1", "1", "1", "1", "1"}
        };
        System.out.println(sum2d(arr0));
    }

    private static int sum2d(String[][] arr) {
        int sum = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("In array not a number");
        } catch (ArrayIndexOutOfBoundsException e) {
            return sum2d(checkSize(arr));
        }
        return sum;
    }

    private static String[][] checkSize(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            String[] el = arr[i];
            if (el.length > arr.length) {
                throw new RuntimeException("Array is not square");
            }
            if (el.length < arr.length) {
                String[] temp = new String[arr.length];

                // TODO: 12/5/2023 arraycopy works faster because it's method is "native" based on C++
                System.arraycopy(el, 0, temp, 0, el.length);

                for (int j = el.length; j < arr.length; j++) {
                    temp[j] = "0";
                }
                el = temp;
                arr[i] = el;
            }
        }
        return arr;
    }
}
