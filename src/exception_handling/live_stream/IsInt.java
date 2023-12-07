package exception_handling.live_stream;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IsInt {
    /**
     * Изучите данный код. Все ли с ним хорошо? Если нет,
     * скорректируйте код, попробуйте обосновать свое решение.
     */
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println(
                "Укажите индекс элемента массива, " +
                        "в который хотите записать значение 1");
        try {
//            if(scanner.hasNextInt()) {
            int index = scanner.nextInt();
            arr[index] = 1;
//            }else {
//                System.out.println("Вы ввели не число");
//            }
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Указан индекс за пределами массива");
        } catch (InputMismatchException e) {
            System.out.println("not number");
        } finally {
            scanner.close();
        }
    }
}


