import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class A_7_1_Mengenlehre {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(49, 30, 14, 47, 13, 2, 12, 29, 19, 11, 15, 39, 43, 45, 34));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(39, 33, 38, 14, 4, 32, 40, 25, 17, 46, 35, 6, 2, 12, 49));
        ArrayList<Integer> c = new ArrayList<>(Arrays.asList(41, 12, 5, 35, 42, 28, 47, 20, 26, 24, 50, 40, 14, 17, 10));

        ArrayList<ArrayList> arrays = new ArrayList<>(Arrays.asList(a, b, c));
        char[] methods = {'u', '/', 'n'};


        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                /*getUnionList(arrays.get(aIndex), getUnionList(arrays.get(bIndex), arrays.get(cIndex)));
                getUnionList(arrays.get(aIndex), getDifferenceList(arrays.get(bIndex), arrays.get(cIndex)));
                getUnionList(arrays.get(aIndex), getIntersectionList(arrays.get(bIndex), arrays.get(cIndex)));
                getUnionList(arrays.get(aIndex), getDifferenceList(arrays.get(cIndex), arrays.get(bIndex)));
*/
            }
        }












        /*for (int i = 0; i < methods.length; i++) {
            for (int j = 0; j < arrays.size(); j++) {
                for (int k = 0; k < 4; k++) {
                    if (k == 0) {
                        if (methods[i] == 'u') {
                            getUnionList(arrays.get(j),
                        }else if(methods[i] == '/'){

                        }else{

                        }
                    } else if (k == 1) {

                    } else if (k == 2) {

                    } else {

                    }
                }
            }
        }*/
        //getDifferenceList(a, b);
        //getDifferenceList(b, a);


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
