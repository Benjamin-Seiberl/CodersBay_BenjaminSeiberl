public class A_1_3 {
    public static void main(String[] args) {
        String name = "Hello World";
        System.out.println(name + " is " + name.length() + " chars long!");
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        name = "Hello Codersbay";
        System.out.println(name);
        

        System.out.println();
        for(int i = 0; i < 15; i++){
            System.out.println((i+1) + ": " + name);
        }
    }
}
