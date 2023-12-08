package advanced_work_with_excepsion.live_stream;

import java.io.IOException;

public class Task1 {
    /**
     * Создайте метод doSomething(), который может быть источником одного
     * из типов checked exceptions(тело самого метода прописывать не обязательно).
     * Вызовите этот метод из main и обработайте в нем исключение, которое вызвал
     * метод doSomething().
     */
    public static void main(String[] args) {
        try {
            doSmth();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void doSmth() throws IOException {
        throw new IOException("Exception");
    }
}
