import java.util.Random;

public class A_5_1_BingoCardGenerator {
    public static void main(String[] args) {
        int[][] bingoBoard = new int[5][5];
        Random r = new Random();
        int max = 15;
        int min = 1;
        for(int i = 0; i < bingoBoard.length; i++){
            System.out.print("|");
            for(int j = 0; j < bingoBoard[i].length; j++) {
                if (i != 2 || j != 2) {
                    bingoBoard[i][j] = r.nextInt(max + 1 - min) + min;
                    System.out.printf(" %3d |", bingoBoard[i][j]);
                }else{
                    System.out.print("     |");
                }
            }
            System.out.println();
            max += 15;
            min += 15;
        }

    }
}
