import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class A_7_1_Mengenlehre {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 3));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(2, 3));
        ArrayList<Integer> c = new ArrayList<>(Arrays.asList(3, 4));
/*
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(49, 30, 14, 47, 13, 2, 12, 29, 19, 11, 15, 39, 43, 45, 34));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(39, 33, 38, 14, 4, 32, 40, 25, 17, 46, 35, 6, 2, 12, 49));
        ArrayList<Integer> c = new ArrayList<>(Arrays.asList(41, 12, 5, 35, 42, 28, 47, 20, 26, 24, 50, 40, 14, 17, 10));
*/
        print(a, b, c, 0);
        print(a, b, c, 1);
        print(a, b, c, 2);
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
        tempList.removeIf(b::contains);
        Collections.sort(tempList);
        return tempList;
    }

    public static ArrayList<Integer> getIntersectionList(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> tempList = new ArrayList<>(a);
        tempList.removeIf(n -> (!b.contains(n)));
        Collections.sort(tempList);
        return tempList;
    }

    public static void print(ArrayList<Integer> a, ArrayList<Integer> b, ArrayList<Integer> c, int function) {
        ArrayList<ArrayList> arrays = new ArrayList<>(Arrays.asList(a, b, c));
        int indexArray1;
        int indexArray2;

        //union
        if (function == 0) {
            System.out.println("\nUnion");
            for (int i = 0; i < 3; i++) {
                if (i == 0) {
                    indexArray1 = 1;
                    indexArray2 = 2;
                    System.out.println("Array: a");
                } else if (i == 1) {
                    indexArray1 = 0;
                    indexArray2 = 2;
                    System.out.println("Array: b");
                } else {
                    indexArray1 = 0;
                    indexArray2 = 1;
                    System.out.println("Array: c");
                }
                ArrayList<Integer> arr1 = getUnionList(arrays.get(i), getUnionList(arrays.get(indexArray1), arrays.get(indexArray2)));
                ArrayList<Integer> arr2 = getUnionList(arrays.get(i), getDifferenceList(arrays.get(indexArray1), arrays.get(indexArray2)));
                ArrayList<Integer> arr3 = getUnionList(arrays.get(i), getIntersectionList(arrays.get(indexArray1), arrays.get(indexArray2)));
                ArrayList<Integer> arr4 = getUnionList(arrays.get(i), getDifferenceList(arrays.get(indexArray2), arrays.get(indexArray1)));

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
                System.out.println();
            }
        } else if (function == 1) {
            System.out.println("\nDifference");
            for (int i = 0; i < 3; i++) {
                if (i == 0) {
                    indexArray1 = 1;
                    indexArray2 = 2;
                    System.out.println("Array: a");
                } else if (i == 1) {
                    indexArray1 = 0;
                    indexArray2 = 2;
                    System.out.println("Array: b");
                } else {
                    indexArray1 = 0;
                    indexArray2 = 1;
                    System.out.println("Array: c");
                }
                ArrayList<Integer> arr1 = getDifferenceList(arrays.get(i), getUnionList(arrays.get(indexArray1), arrays.get(indexArray2)));
                ArrayList<Integer> arr2 = getDifferenceList(arrays.get(i), getDifferenceList(arrays.get(indexArray1), arrays.get(indexArray2)));
                ArrayList<Integer> arr3 = getDifferenceList(arrays.get(i), getIntersectionList(arrays.get(indexArray1), arrays.get(indexArray2)));
                ArrayList<Integer> arr4 = getDifferenceList(arrays.get(i), getDifferenceList(arrays.get(indexArray2), arrays.get(indexArray1)));

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
                System.out.println();
            }
        } else {
            System.out.println("\nIntersection");
            for (int i = 0; i < 3; i++) {
                if (i == 0) {
                    indexArray1 = 1;
                    indexArray2 = 2;
                    System.out.println("Array: a");
                } else if (i == 1) {
                    indexArray1 = 0;
                    indexArray2 = 2;
                    System.out.println("Array: b");
                } else {
                    indexArray1 = 0;
                    indexArray2 = 1;
                    System.out.println("Array: c");
                }
                ArrayList<Integer> arr1 = getIntersectionList(arrays.get(i), getUnionList(arrays.get(indexArray1), arrays.get(indexArray2)));
                ArrayList<Integer> arr2 = getIntersectionList(arrays.get(i), getDifferenceList(arrays.get(indexArray1), arrays.get(indexArray2)));
                ArrayList<Integer> arr3 = getIntersectionList(arrays.get(i), getIntersectionList(arrays.get(indexArray1), arrays.get(indexArray2)));
                ArrayList<Integer> arr4 = getIntersectionList(arrays.get(i), getDifferenceList(arrays.get(indexArray2), arrays.get(indexArray1)));
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
}
