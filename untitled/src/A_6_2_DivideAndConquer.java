import java.util.ArrayList;
import java.util.Random;

public class A_6_2_DivideAndConquer {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            numbers.add(r.nextInt(10) + 1);
            System.out.printf(" %d ,", numbers.get(i));
        }
        System.out.println();
        System.out.println(getMaximum(numbers));
    }

    public static int getMaximum(ArrayList<Integer> array) {
        if (array.size() == 1) {
            return array.get(0);
        } else {
            ArrayList<Integer> array2 = (ArrayList<Integer>) array.clone();
            int size = array.size();
            for (int i = 0; i < (size / 2); i++) {
                array.remove(0);
                array2.remove((array2.size() - 1));
            }
            int maximumRight = getMaximum(array);
            int maximumLeft = getMaximum(array2);
            return Math.max(maximumRight, maximumLeft);
        }
    }
}

