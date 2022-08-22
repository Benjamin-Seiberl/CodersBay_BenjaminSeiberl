public class A_5_4_SelectionSort {
    public static void main(String[] args) {
        int[] list = {5,8,2,1,45,12,55,22,3};

        for(int i = 0; i < list.length; i++){
            int minNumber = list[i];
            int indexMinNumber = i;
            for(int j = i; j < list.length; j++){
                if(minNumber > list[j]){
                    minNumber = list[j];
                    indexMinNumber = j;
                }
            }

            int temp = list[indexMinNumber];
            list[indexMinNumber] = list[i];
            list[i] = temp;

            for(int number : list){
                System.out.printf("%4d",number);
            }
            System.out.println();
        }
    }
}
