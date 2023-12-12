package class_Human;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Scanner;

public class Constructor {
    Human human;
    String surname;
    public Constructor(){
        human = new Human();
        surname = human.getSurname();
    }

    public void mainWork() {
        System.out.println("Напишите в одну строку через пробел, без знаков: " +
                "Фамилия Имя Отчество дата_рождения номер_телефона пол: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] arrStr = str.split(" ");

        checkFormats(arrStr);

    }

    public void checkFormats(String[] arrStr) {
        if (arrStr.length != 6) {
            throw new RuntimeException("Вы ввели не все данные");
        } else {
            String surname = arrStr[0];
            String name = arrStr[1];
            String father = arrStr[2];

            String date = arrStr[3];
            checkDate(date);

            String number = arrStr[4];
            checkPhone(number);

            String gender = arrStr[5];
            checkGender(gender);
            human = new Human(surname, name, father, date, number, gender);
            System.out.println(human);

            try (FileWriter writer = new FileWriter(surname + ".txt", true)) {
                writer.write(human.toString());
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public void checkPhone(String numb) {
        String cleanNumb = numb.replaceAll("\\\\D+", "");
        int numLen = 11;
        try {
            if (cleanNumb.length() != numLen) {
                throw new NumberException();
            }
            if (!cleanNumb.matches("^[0-9]+$")) {
                throw new NumberException();
            }
        } catch (NumberException e) {
            throw new NumberException();
        }
    }

    public void checkDate(String dateOfBirth) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        try {
            LocalDate.parse(dateOfBirth, formatter);
        } catch (DateTimeParseException e) {
            throw new DateException();
        }
    }

    public void checkGender(String gender) {
        try {
            if (!gender.equals("f") && !gender.equals("m")) {
                throw new GenderException();
            }
        } catch (GenderException e) {
            throw new GenderException();
        }
    }

}
