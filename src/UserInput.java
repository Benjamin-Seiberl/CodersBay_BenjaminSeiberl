import java.util.Scanner;

public class UserInput {
    public static int getInt(int min, String errorText){
        int number = 0;

        do {
            try {
                Scanner sc = new Scanner(System.in);
                String tmp = sc.nextLine();
                number = Integer.parseInt(tmp);
            } catch (Exception e) {
                System.out.println(errorText);
            }
        }while(number <= min);

        return number;
    }
    public static int getInt(int min, int max, String errorText){
        int number = 0;

        do {
            try {
                Scanner sc = new Scanner(System.in);
                String tmp = sc.nextLine();
                number = Integer.parseInt(tmp);
            } catch (Exception e) {
                System.out.println(errorText);
            }
        }while(number < min && number < max);

        return number;
    }

    public static String getString(String errorText){
        String input = "";
        boolean error = false;
       do {
            try {
                Scanner sc = new Scanner(System.in);
                input = sc.nextLine();
            } catch (Exception e) {
                System.out.println(errorText);
                error = true;
            }
        }while(error);

        return input;
    }
}
