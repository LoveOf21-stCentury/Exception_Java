package advanced_work_with_excepsion.live_stream.classWithMainClasses;

import java.io.IOException;

public class Counter implements AutoCloseable{
    /**
     Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение
     внутренней int переменной на 1. Сделайте так, чтобы с объектом такого типа
     можно было работать в блоке try-with-resources. Подумайте, что должно происходить
     при закрытии этого ресурса? Напишите метод для проверки, закрыт ли ресурс.
     При попытке вызвать add() у закрытого ресурса, должен выброситься IOException
     */
    int count = 0;
    boolean work = false;

    public void add(){
        count++;
        work = true;
    }
    public int getCount(){
        return count;
    }

    @Override
    public void close() throws Exception {
        if(work){
            throw new IOException("Resource is closed");
        }
    }
}
