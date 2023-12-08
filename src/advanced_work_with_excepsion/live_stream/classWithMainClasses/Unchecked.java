package advanced_work_with_excepsion.live_stream.classWithMainClasses;

public class Unchecked extends RuntimeException {
    /**
     Задание 3.1
     Создайте класс исключения, который будет выбрасываться при делении на 0.
     Исключение должно отображать понятное для пользователя сообщение об ошибке.
     */
   public Unchecked(){
       super("Divide by zero");
   }
}
