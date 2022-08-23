import java.time.LocalDate;

public class Person {
    private String firstname;
    private String lastname;
    private LocalDate birthdate;
    private Adress adress;
    private boolean gender;

    public Person(String firstname, String lastname, LocalDate birthdate, Adress adress, boolean gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.adress = adress;
        this.gender = gender;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public Adress getAdress() {
        return adress;
    }

    public boolean isGender() {
        return gender;
    }
}
