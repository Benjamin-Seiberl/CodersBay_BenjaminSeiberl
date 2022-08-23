public class A_5_3_BubbleSort {
    public static void main(String[] args) {
        int[] list = {5, 8, 2, 1, 45, 12, 55, 22, 3};
        boolean isChanging = true;

        while (isChanging) {
            isChanging = false;
            for (int j = 0; j < list.length - 1; j++) {

                if (list[j] > list[j + 1]) {
                    int temp = list[j + 1];
                    list[j + 1] = list[j];
                    list[j] = temp;
                    isChanging = true;

                }

                for (int number : list) {
                    System.out.printf("%4d", number);
                }
                System.out.println();
            }
        }
    }
}
