public class A_2_2 {
    public static void main(String[] args) {
        System.out.println("Gib eine Stunde des Tages an!");
        int hourUser = UserInput.getInt(1, 23,"Gib eine Zahl zwischen 0 und 24 ein!");
        if(hourUser > 7 && hourUser < 16  && hourUser != 12){
            System.out.println("Stunde liegt in der Arbeitszeit!");
        }else if((hourUser < 8 || hourUser > 15) && hourUser != 12){
            System.out.println("Stunde liegt in der Freizeit!");
        }else{
            System.out.println("Es ist gerade Mittagszeit!");
        }
    }
}
