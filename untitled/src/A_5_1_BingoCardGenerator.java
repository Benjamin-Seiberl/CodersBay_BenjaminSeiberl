import java.util.Random;

public class A_5_1_BingoCardGenerator {
    public static void main(String[] args) {
        int[][] bingoBoard = new int[5][5];
        Random r = new Random();
        int max = 15;
        int min = 1;
        for (int i = 0; i < bingoBoard.length; i++) {

            for (int j = 0; j < bingoBoard[i].length; j++) {
                boolean duplicate = true;
                while (duplicate) {
                    duplicate = false;
                    int randomNumber = r.nextInt(max + 1 - min) + min;
                    for (int num : bingoBoard[i]) {
                        if (randomNumber == num) {
                            duplicate = true;
                            break;
                        }
                    }
                    if (!duplicate) {
                        bingoBoard[i][j] = randomNumber;
                    }
                }
            }
            for (int k = 1; k < bingoBoard.length; k++) {

                for (int j = k; j > 0 && bingoBoard[i][j] < bingoBoard[i][j - 1]; j--) {
                    int temp = bingoBoard[i][j - 1];
                    bingoBoard[i][j - 1] = bingoBoard[i][j];
                    bingoBoard[i][j] = temp;
                }
            }

            System.out.println();
            max += 15;
            min += 15;
        }

        for (int i = 0; i < bingoBoard.length; i++) {
            System.out.print("|");
            for (int j = 0; j < bingoBoard[i].length; j++) {
                if (i == 2 && j == 2) {
                    bingoBoard[i][j] = 0;
                }
                System.out.printf(" %3d |", bingoBoard[i][j]);
            }
            System.out.println();
        }

    }
}
