package advanced_work_with_excepsion.live_stream.classWithMainClasses;

import java.io.IOException;

public class Checked extends IOException {
    /**
     * Задание 3.3
     * Создайте класс исключения, которое будет возникать при попытке открыть несуществующий файл.
     * Исключение должно отображать понятное для пользователя сообщение об ошибке.
     */
    public Checked(){
        super("File not found");
    }
    public Checked(String message){
        super(message);
    }
}
