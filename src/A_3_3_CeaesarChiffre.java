import java.util.Random;

public class A_3_3_CeaesarChiffre {
    public static void main(String[] args) {
        char z = 'z';
        System.out.println((int)z);
        char a = 'a';
        System.out.println((int)a);
        z = 'Z';
        System.out.println((int)z);
        a = 'A';
        System.out.println((int)a);
        System.out.println("Gib einen beliebigen Text aus Buchstaben ein! (Ohne Sonderzeichen)");
        String input = UserInput.getString("Gib einen beliebigen Text ein!");
        Random r = new Random();
        int key = r.nextInt(25);
        char[] chars = input.toCharArray();

        for(int i = 0; i < chars.length; i++){
            if(chars[i] != ' '  && chars[i] != ',') {
                if((chars[i] + key) > 90 && (int)chars[i] < 90){
                    chars[i] -= 26;
                }else if((chars[i] + key) > 122){
                    chars[i] -= 26;
                }
                chars[i] += key;
            }
            System.out.print(chars[i]);
        }

    }
}
