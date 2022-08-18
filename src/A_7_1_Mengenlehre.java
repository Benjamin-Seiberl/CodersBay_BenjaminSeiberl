import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class A_7_1_Mengenlehre {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 3, 5, 7));//, 13, 2, 12, 29, 19, 11, 15, 39, 43, 45, 34));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(2, 6, 8));//, 4, 32, 40, 25, 17, 46, 35, 6, 2, 12, 49));
        ArrayList<Integer> c = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 6, 7, 8));//, 42, 28, 47, 20, 26, 24, 50, 40, 14, 17, 10));

        /*ArrayList<Integer> a = new ArrayList<>(Arrays.asList(49, 30, 14, 47, 13, 2, 12, 29, 19, 11, 15, 39, 43, 45, 34));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(39, 33, 38, 14, 4, 32, 40, 25, 17, 46, 35, 6, 2, 12, 49));
        ArrayList<Integer> c = new ArrayList<>(Arrays.asList(41, 12, 5, 35, 42, 28, 47, 20, 26, 24, 50, 40, 14, 17, 10));*/

        union(a, b, c);

    }

    public static void union(ArrayList<Integer> a, ArrayList<Integer> b, ArrayList<Integer> c) {
        ArrayList<Integer> tempList = new ArrayList<>(List.of());
        tempList.addAll(a);
        b.removeAll(tempList);
        tempList.addAll(b);
        c.removeAll(tempList);
        tempList.addAll(c);
        Collections.sort(tempList);

        for (int num : tempList) {
            System.out.printf(" %d ", num);
        }


    }
}
