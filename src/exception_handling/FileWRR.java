package exception_handling;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FileWRR {
    /**
     * Запишите в файл следующие строки:
     * <p>
     * Анна=4
     * Елена=5
     * Марина=6
     * Владимир=?
     * Полина=?
     * Константин=?
     * Иван=4
     * <p>
     * Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив (либо HashMap,
     * если студенты с ним знакомы). В отдельном методе нужно будет пройти по структуре данных,
     * если сохранено значение ?, заменить его на соответствующее число.Если на каком-то месте
     * встречается символ, отличный от числа или ?, бросить подходящее исключение.
     * Записать в тот же файл данные с замененными символами ?.
     */
    private static final List<String> strings = List.of
            ("Анна=4", "Елена=5", "Марина=6", "Полина=?", "Владимир=?", "Константин=?", "Иван=4");
//для проверки, заменить какое-то из значений на null

    public static void main(String[] args) {

//        writeFile(strings, "text.txt");
        System.out.println(readFile("text.txt"));
        rewriteFile("text.txt");
    }

    private static void writeFile(List<String> strings, String path) {
        File file = new File(path);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            for (String string : strings) {
                fileWriter.write(string);
                fileWriter.write("\n");
            }
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static Map<String, Integer> readFile(String path) {
        File file = new File(path);
        Map<String, Integer> map = new LinkedHashMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split("=");
                String name = arr[0];
                String temp = arr[1];
                int num;
                if(temp.equals("?")){
                    num = name.length();
                }else {
                    num = Integer.parseInt(temp);
                }
                map.put(name, num);
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        return map;
    }
    private static void rewriteFile(String path){
        Map<String, Integer> map = readFile(path);
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            list.add(entry.toString());
        }
        writeFile(list, path);
    }
}

