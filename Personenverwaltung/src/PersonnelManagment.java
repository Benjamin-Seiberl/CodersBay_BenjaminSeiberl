import java.time.LocalDate;
import java.util.ArrayList;

public class PersonnelManagment {
    private final ArrayList<Person> personnel;

    public PersonnelManagment() {
        personnel = new ArrayList<>();
    }

    public PersonnelManagment(ArrayList<Person> personnel) {
        this.personnel = personnel;
    }

    public void createPerson(String firstname, String lastname) {
        personnel.add(new Person(firstname, lastname));
    }

    public void createPerson(String firstname, String lastname, LocalDate birthdate, Enum<Person.Gender> gender) {
        personnel.add(new Person(firstname, lastname, birthdate, gender));
    }

    public void createPerson(String firstname, String lastname, LocalDate birthdate, Adress adress, Enum<Person.Gender> gender) {
        personnel.add(new Person(firstname, lastname, birthdate, adress, gender));
    }

    public void createPerson(String firstname, String lastname, LocalDate birthdate, Adress adress, Enum<Person.Gender> gender, String socialSecurityNumber) {
        boolean hasAlready = false;
        for (Person p : personnel) {
            if (new Person(firstname, lastname, birthdate, adress, gender, socialSecurityNumber).equals(p)) {
                hasAlready = true;
            }
        }
        if (!hasAlready) {
            personnel.add(new Person(firstname, lastname, birthdate, adress, gender, socialSecurityNumber));
        }
    }


    public ArrayList<Person> getPersonnel() {
        return personnel;
    }

}
