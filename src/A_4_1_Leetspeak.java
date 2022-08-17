public class A_4_1_Leetspeak {
    public static void main(String[] args) {
        char[][] leetspeak = {
                {'A','@'},{'B','8'},{'C','('},{'D','D'},{'E','3'},
                {'F','F'},{'G','6'},{'H','#'},{'I','!'},{'J','J'},
                {'K','K'},{'L','1'},{'M','M'},{'N','N'},{'O','0'},
                {'P','P'},{'Q','Q'},{'R','R'},{'S','$'},{'T','7'},
                {'U','U'},{'V','V'},{'W','W'},{'X','X'},{'Y','Y'},
                {'Z','2'}
        };

        System.out.println("Gib eine beliebige Zeichenkette ein!");
        String input = UserInput.getString("Gib einen beliebige Zeichenkette an!");
        char[] inputChars = input.toUpperCase().toCharArray();

        for (char inputChar : inputChars)
            if (inputChar != ' ' && inputChar != ',') {
                for (char[] chars : leetspeak) {
                    if (chars[0] == inputChar) {
                        System.out.print(chars[1]);
                    }

                }
            } else {
                System.out.print(inputChar);
            }



    }
}
