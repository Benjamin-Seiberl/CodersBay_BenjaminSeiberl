public class A_2_1 {
    public static void main(String[] args) {
        System.out.println("Gib eine positive Zahl ein!");
        int userNumber;

        userNumber = UserInput.getInt(1, "Gib eine Zahl größer als 1 ein!");
        int luckyNumber = 10;
        System.out.println("Meine Glückszahl: " + luckyNumber);
        if (userNumber % 10 == 0) {
            System.out.println("Die Zahl " + userNumber + " ist eine runde Zahl!");
        }
        if (userNumber % 2 == 0) {
            System.out.println("Die Zahl " + userNumber + " ist eine gerade Zahl!");
        }
        if (userNumber == luckyNumber) {
            System.out.println("Die Zahl " + userNumber + " ist meine Glückszahl!");
        }
        if (userNumber > 9 && userNumber < 100) {
            System.out.println("Die Zahl " + userNumber + " ist zweistellig!");
        }

    }
}
