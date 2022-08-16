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
        }while(number < min);

        return number;
    }
}
