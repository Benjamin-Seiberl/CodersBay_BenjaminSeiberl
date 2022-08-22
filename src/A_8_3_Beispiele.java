import java.time.LocalDate;

public class A_8_3_Beispiele {
    public static void main(String[] args) {
        //CustomNumber
        System.out.println("CustomNumber");
        CustomNumber number = new CustomNumber(3);
        System.out.println(number.add(4));
        System.out.println(CustomNumber.add(5, 6));

        //Special-Dates
        System.out.println("\nSpecial Dates");
        LocalDate.of(2022, 8, 30);

        Appointment[] appointments = new Appointment[3];
        appointments[0] = new Appointment("HNO Artz", LocalDate.of(2022, 8, 30));
        appointments[1] = new Appointment("Tante Hochzeit", LocalDate.of(2022, 8, 28));
        appointments[2] = new Appointment("Kegel Match", LocalDate.of(2022, 9, 10));

        for (Appointment a : appointments) {
            System.out.printf("%-15s: %s", a.getName(), a.getTime().toString());
            System.out.println();
        }

        System.out.println("\nSecure Password");
        //Secure Password
        Password password = new Password();
        password.setPassword("Serve");
        System.out.println(password.getPassword());
        password.toString();
    }
}
