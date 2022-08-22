public class CustomNumber {
    private int number;

    public CustomNumber(int number) {
        this.number = number;
    }

    public int add(int num) {
        return number += num;
    }

    public static int add(int num, int num2) {
        return num + num2;
    }
}
