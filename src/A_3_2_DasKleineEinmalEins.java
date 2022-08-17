public class A_3_2_DasKleineEinmalEins {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++){
            for(int j = 0; j <= 10; j++){
                System.out.printf("%2d * %2d  = %3d",j,i,(j*i));
                System.out.println();
            }
        }
    }
}
