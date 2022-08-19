import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class A_7_1_Mengenlehre {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(49, 30, 14, 47, 13, 2, 12, 29, 19, 11, 15, 39, 43, 45, 34));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(39, 33, 38, 14, 4, 32, 40, 25, 17, 46, 35, 6, 2, 12, 49));
        ArrayList<Integer> c = new ArrayList<>(Arrays.asList(41, 12, 5, 35, 42, 28, 47, 20, 26, 24, 50, 40, 14, 17, 10));


        getDifferenceList(a, b);
        getDifferenceList(b, a);

        System.out.println("Intersect: ");
        for (int num : c) {
            System.out.printf(" %d ", num);
        }
        System.out.println();
    }

    public static ArrayList<Integer> getUnionList(ArrayList<Integer> a, ArrayList<Integer> b1) {
        ArrayList<Integer> b = new ArrayList<>(b1);
        ArrayList<Integer> tempList = new ArrayList<>(a);

        b.removeAll(tempList);
        tempList.addAll(b);
        Collections.sort(tempList);

        return tempList;
    }

    public static ArrayList<Integer> getDifferenceList(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> tempList = new ArrayList<>(a);

        tempList.removeAll(b);
        Collections.sort(tempList);

        return tempList;
    }

    public static ArrayList<Integer> getIntersectionList(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> tempList = new ArrayList<>(a);

        tempList.removeIf(n -> (!b.contains(n)));
        Collections.sort(tempList);

        return tempList;
    }
}
