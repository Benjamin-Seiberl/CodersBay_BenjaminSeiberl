public class A_3_3_CeaesarChiffre {
    public static void main(String[] args) {
        System.out.println("Gib einen beliebigen Text aus Buchstaben ein! (Ohne Sonderzeichen)");
        String input = UserInput.getString("Gib einen beliebigen Text ein!");
        //Random r = new Random();
        System.out.println("Gib eine Zahl an!");
        int key = UserInput.getInt(0, 26, "Gib eine Zahl von 1 bis 26 an!");
        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ' && chars[i] != ',') {
                if ((chars[i] + key) > 90 && (int) chars[i] < 90) {
                    chars[i] -= 26;
                } else if ((chars[i] + key) > 122) {
                    chars[i] -= 26;
                }
                chars[i] += key;
            }
            System.out.print(chars[i]);
        }

    }
}
