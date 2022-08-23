import java.util.ArrayList;
import java.util.Arrays;

public class A_7_3_ListeSortieren {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 2));
        for (int i = 1; i < list.size(); i++) {
            for (int j = i; j > 0 && list.get(j) < list.get(j - 1); j--) {
                int temp = list.get(j - 1);
                list.set(j - 1, list.get(j));
                list.set(j, temp);

                for (int number : list) {
                    System.out.printf("%4d", number);
                }
                System.out.println();
            }
        }
    }
}
