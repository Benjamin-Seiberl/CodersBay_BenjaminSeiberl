import java.time.LocalDate;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        PersonnelManagment pm = new PersonnelManagment();
        pm.createPerson("Benjamin", "Seiberl", LocalDate.of(1999, 7, 22), new Adress("Reichenauerstraße", 2, "Gallneukirchen", 4210), Person.Gender.male, "368622071999");
        pm.createPerson("Benjamin", "Seiberl", LocalDate.of(1999, 7, 22), new Adress("Reichenauerstraße", 2, "Gallneukirchen", 4210), Person.Gender.male, "368622071999");
        pm.createPerson("Benjamin", "Sei", LocalDate.of(1999, 7, 22), new Adress("Reichenauerstraße", 2, "Gallneukirchen", 4210), Person.Gender.male, "368622071999");
        pm.createPerson("Maja", "Nikolic", LocalDate.of(2000, 6, 17), new Adress("Reichenauerstraße", 2, "Gallneukirchen", 4210), Person.Gender.female, "784517062000");

        pm.createPerson("Benjamin", "Seiberl");
        printArray(pm.getPersonnel());
    }


    public static void printArray(ArrayList<Person> personnel) {
        for (Person p : personnel) {
            System.out.println(p.toString());
        }
    }
}
