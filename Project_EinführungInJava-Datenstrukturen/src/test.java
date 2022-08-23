public class test {
    public static void main(String[] args) {
        System.out.println(sum(4));
    }

    public static int sum(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number + sum(number-1);
        }
    }

    public static int fibonaci(int number){
        return number;
    }
}
