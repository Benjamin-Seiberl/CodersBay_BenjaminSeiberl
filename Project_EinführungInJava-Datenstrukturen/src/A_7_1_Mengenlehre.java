import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class A_7_1_Mengenlehre {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>(Arrays.asList(1, 3));
        HashSet<Integer> b = new HashSet<>(Arrays.asList(2, 3));
        HashSet<Integer> c = new HashSet<>(Arrays.asList(3, 4));
/*
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(49, 30, 14, 47, 13, 2, 12, 29, 19, 11, 15, 39, 43, 45, 34));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(39, 33, 38, 14, 4, 32, 40, 25, 17, 46, 35, 6, 2, 12, 49));
        ArrayList<Integer> c = new ArrayList<>(Arrays.asList(41, 12, 5, 35, 42, 28, 47, 20, 26, 24, 50, 40, 14, 17, 10));
*/
        print(a, b, c, 0);
//        System.out.println(getUnionList(a, b));
//        System.out.println(getIntersectionList(a, b));
//        System.out.println(b);
        print(a, b, c, 1);
        print(a, b, c, 2);
    }

    public static HashSet<Integer> getUnionList(HashSet<Integer> a, HashSet<Integer> b1) {
        HashSet<Integer> tempList = new HashSet<>(a);
        tempList.addAll(b1);
        return tempList;
    }

    public static HashSet<Integer> getDifferenceList(HashSet<Integer> a, HashSet<Integer> b) {
        HashSet<Integer> tempList = new HashSet<>(a);
        tempList.removeIf(b::contains);
        return tempList;
    }

    public static HashSet<Integer> getIntersectionList(HashSet<Integer> a, HashSet<Integer> b) {
        HashSet<Integer> tempList = new HashSet<>(a);
        tempList.retainAll(b);
        return tempList;
    }

    public static void print(HashSet<Integer> a, HashSet<Integer> b, HashSet<Integer> c, int function) {
        ArrayList<HashSet> hashSet = new ArrayList<>(Arrays.asList(a, b, c));
        int indexArray1;
        int indexArray2;

        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                indexArray1 = 1;
                indexArray2 = 2;
                System.out.println("\nArray: a");
            } else if (i == 1) {
                indexArray1 = 0;
                indexArray2 = 2;
                System.out.println("\nArray: b");
            } else {
                indexArray1 = 0;
                indexArray2 = 1;
                System.out.println("\nArray: c");
            }
            HashSet<Integer> arr1;
            HashSet<Integer> arr2;
            HashSet<Integer> arr3;
            HashSet<Integer> arr4;

            if (function == 0) {
                System.out.println("Union");
                arr1 = getUnionList(hashSet.get(i), getUnionList(hashSet.get(indexArray1), hashSet.get(indexArray2)));
                arr2 = getUnionList(hashSet.get(i), getDifferenceList(hashSet.get(indexArray1), hashSet.get(indexArray2)));
                arr3 = getUnionList(hashSet.get(i), getIntersectionList(hashSet.get(indexArray1), hashSet.get(indexArray2)));
                arr4 = getUnionList(hashSet.get(i), getDifferenceList(hashSet.get(indexArray2), hashSet.get(indexArray1)));
            } else if (function == 1) {
                System.out.println("Difference");
                arr1 = getDifferenceList(hashSet.get(i), getUnionList(hashSet.get(indexArray1), hashSet.get(indexArray2)));
                arr2 = getDifferenceList(hashSet.get(i), getDifferenceList(hashSet.get(indexArray1), hashSet.get(indexArray2)));
                arr3 = getDifferenceList(hashSet.get(i), getIntersectionList(hashSet.get(indexArray1), hashSet.get(indexArray2)));
                arr4 = getDifferenceList(hashSet.get(i), getDifferenceList(hashSet.get(indexArray2), hashSet.get(indexArray1)));
            } else {
                System.out.println("Intersection");
                arr1 = getIntersectionList(hashSet.get(i), getUnionList(hashSet.get(indexArray1), hashSet.get(indexArray2)));
                arr2 = getIntersectionList(hashSet.get(i), getDifferenceList(hashSet.get(indexArray1), hashSet.get(indexArray2)));
                arr3 = getIntersectionList(hashSet.get(i), getIntersectionList(hashSet.get(indexArray1), hashSet.get(indexArray2)));
                arr4 = getIntersectionList(hashSet.get(i), getDifferenceList(hashSet.get(indexArray2), hashSet.get(indexArray1)));
            }
            for (int num : arr1) {
                System.out.printf(" %d ", num);
            }
            System.out.println();
            for (int num : arr2) {
                System.out.printf(" %d ", num);
            }
            System.out.println();
            for (int num : arr3) {
                System.out.printf(" %d ", num);
            }
            System.out.println();
            for (int num : arr4) {
                System.out.printf(" %d ", num);
            }
        }
    }
}
