import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class A_7_3_ListeSortieren {
    public static void main(String[] args) {
        int size = 1000;
        Random random = new Random();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(size * 100));
        }

        long startTime = System.currentTimeMillis();

        for (int i = 1; i < list.size(); i++) {
            for (int j = i; j > 0 && list.get(j) < list.get(j - 1); j--) {
                int temp = list.get(j - 1);
                list.set(j - 1, list.get(j));
                list.set(j, temp);
//                for (int number : list) {
//                    System.out.printf("%4d", number);
//                }
//                System.out.println();
            }
        }

        System.out.println("It took: " + (System.currentTimeMillis() - startTime) + " ms to sort this.");
        System.out.println(list);
    }
}
