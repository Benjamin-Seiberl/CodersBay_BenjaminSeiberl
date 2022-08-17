import java.util.ArrayList;

public class A_3_4_BerechnungDesMaximums {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        while(true){
            System.out.println("Gib eine Zahl ein! (Zum Beenden 'q')");
            String input = UserInput.getString("");
            if(input.equals("q")){
                break;
            }else{
                int number = Integer.parseInt(input);
                numbers.add(number);
            }
        }
        int maximum = 0;
        if(!numbers.isEmpty()){
            for(int number : numbers){
                if(number > maximum){
                    maximum = number;
                }
            }
        }
        System.out.println("Maximum is: " + maximum);
    }
}
