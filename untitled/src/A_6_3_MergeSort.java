import java.util.ArrayList;
import java.util.Random;

public class A_6_3_MergeSort {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println("UnsortedList: ");
        ArrayList<Integer> unsortedList = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            unsortedList.add(r.nextInt(50) + 1);
            System.out.printf(" %d ,", unsortedList.get(i));
        }
        System.out.println();
        ArrayList<Integer> sortedList = mergeSort(unsortedList);

        System.out.println("SortedList: ");
        for (int num : sortedList) {
            System.out.printf(" %d ,", num);
        }
    }

    public static ArrayList<Integer> mergeSort(ArrayList<Integer> list) {
        if (list.size() == 2) {
            if (list.get(0) > list.get(1)) {
                int temp = list.get(0);
                list.set(0, list.get(1));
                list.set(1, temp);
            }
            return list;
        } else {
            ArrayList<Integer> list2 = (ArrayList<Integer>) list.clone();
            int size = list.size();
            for (int i = 0; i < (size / 2); i++) {
                list.remove(0);
                list2.remove((list2.size() - 1));
            }

            list = mergeSort((list));
            list2 = mergeSort((list2));
            ArrayList<Integer> tempList = new ArrayList<>();
            size = list.size() + list2.size();
            for (int i = 0; i < size; i++) {
                if (list.size() == 0) {
                    tempList.add(list2.get(0));
                    list2.remove(0);
                } else if (list2.size() == 0) {
                    tempList.add(list.get(0));
                    list.remove(0);
                } else {
                    if (list.get(0) < list2.get(0)) {
                        tempList.add(list.get(0));
                        list.remove(0);
                    } else {
                        tempList.add(list2.get(0));
                        list2.remove(0);
                    }
                }
            }
            return tempList;
        }
    }
}

