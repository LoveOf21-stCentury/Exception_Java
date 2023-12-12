package class_Human;

public class Human {
    private String surname;
    private String name;
    private String patronymic;
    private String dateOfBirth;
    private String phoneNumber;
    private String gender;

    public Human(){

    }
    public Human(String surname, String name, String patronymic, String dateOfBirth,
                 String phoneNumber, String gender) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }
    public String getSurname(){
        return this.surname;
    }

    @Override
    public String toString() {
        return String.format("<%s>, <%s>, <%s>, <%s>, <%s>, <%s>\n",
                surname, name, patronymic, dateOfBirth, phoneNumber, gender);
    }
}
