public class A_2_3_NotenÜbersetzen {
    public static void main(String[] args) {

        System.out.println("Gib deine Note ein!");
        int mark = UserInput.getInt(1,5,"Gib eine Zahl zwischen 1 und 5 ein!");
        if(mark == 1){
            System.out.println("Note: Sehr Gut!");
        }
        else if(mark == 2){
            System.out.println("Note: Gut!");
        }
        else if(mark == 3){
            System.out.println("Note: Befriedigend!");
        }
        else if(mark == 4){
            System.out.println("Note: Genügend!");
        }
        else{
            System.out.println("Note: Nicht Gengügend!");
        }
    }
}
