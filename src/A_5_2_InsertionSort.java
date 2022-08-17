public class A_5_2_InsertionSort {
    public static void main(String[] args) {
        int[] list = {5,8,2,1,45,12,55,22,3};

        for(int i = 1; i < list.length; i++){
            for(int j = i; j > 0 && list[j] < list[j-1]; j--){
                int temp = list[j-1];
                list[j-1] = list[j];
                list[j] = temp;

                for(int number : list){
                    System.out.printf("%4d",number);
                }
                System.out.println();
            }
        }
    }
}
