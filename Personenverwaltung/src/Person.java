import java.time.LocalDate;

public class Person {
    private String firstname;
    private String lastname;
    private LocalDate birthdate;
    private Adress adress;
    private Enum<Gender> gender;
    private String socialSecurityNumber;

    public Person(String firstname, String lastname, LocalDate birthdate, Adress adress, Enum<Gender> gender, String socialSecurityNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.adress = adress;
        this.gender = gender;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public Person(String firstname, String lastname, LocalDate birthdate, Adress adress, Enum<Gender> gender) {
        this(firstname, lastname, birthdate, adress, gender, "NA");
    }

    public Person(String firstname, String lastname, LocalDate birthdate, Enum<Gender> gender) {
        this(firstname, lastname, birthdate, new Adress(), gender, "NA");
    }

    public Person(String firstname, String lastname) {
        this(firstname, lastname, LocalDate.of(0, 1, 1), new Adress(), Gender.NA, "NA");
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

    public Enum<Gender> getGender() {
        return gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return firstname.equals(person.firstname) && lastname.equals(person.lastname) && gender.equals(person.gender) || socialSecurityNumber.equals(person.socialSecurityNumber);
    }

    @Override
    public String toString() {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Person{");
        stringbuilder.append("firstname='");
        stringbuilder.append(firstname);
        stringbuilder.append("'");
        stringbuilder.append(", lastname='");
        stringbuilder.append(lastname);
        stringbuilder.append("'");
        stringbuilder.append(", birthdate=");
        stringbuilder.append(birthdate);
        stringbuilder.append(", ");
        if (adress != null) {
            stringbuilder.append(adress);
        }
        stringbuilder.append(", gender=");
        stringbuilder.append(gender);
        stringbuilder.append(", socialSecurityNumber='");
        stringbuilder.append(socialSecurityNumber);
        stringbuilder.append("}");

        return stringbuilder.toString();
    }


    enum Gender {
        male,
        female,
        divers,
        NA
    }
}
