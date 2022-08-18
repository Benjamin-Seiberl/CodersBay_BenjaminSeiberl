import java.util.Random;

public class A_6_1_GameOfLife {
    public static void main(String[] args) {
        char[][] gameBoard = new char[10][10];
        Random r = new Random();

        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                if (r.nextInt(2) == 0) {
                    gameBoard[i][j] = '#';
                } else {
                    gameBoard[i][j] = '.';
                }
            }
        }

        for (int i = 0; i < 200; i++) {

            gameBoard = liveOrDie(gameBoard);
            System.out.println("Generation: " + i);
            for (char[] chars : gameBoard) {
                for (int l = 0; l < chars.length; l++) {
                    System.out.printf(" %s ", chars[l]);
                }
                System.out.println();
            }

            System.out.println("\n\n\n");
        }


    }


    public static char[][] liveOrDie(char[][] gameBoard) {
        int neighbors;
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                neighbors = 0;
                if (i == 0) {
                    if (j == 0) {
                        if (gameBoard[i][j + 1] == '#') {
                            neighbors++;
                        }
                        if (gameBoard[i + 1][j] == '#') {
                            neighbors++;
                        }
                        if (gameBoard[i + 1][j + 1] == '#') {
                            neighbors++;
                        }
                    } else if (j == gameBoard.length - 1) {
                        if (gameBoard[i][j - 1] == '#') {
                            neighbors++;
                        }
                        if (gameBoard[i + 1][j] == '#') {
                            neighbors++;
                        }
                        if (gameBoard[i + 1][j - 1] == '#') {
                            neighbors = 3;
                        }
                    } else {
                        for (int k = i; k <= i + 1; k++) {
                            for (int l = j - 1; l <= j + 1; l++) {
                                if ((k != i || l != j) && gameBoard[k][l] == '#') {
                                    neighbors++;
                                }
                            }
                        }
                    }
                } else if (i == gameBoard.length - 1) {
                    if (j == 0) {
                        if (gameBoard[i][j + 1] == '#') {
                            neighbors++;
                        }
                        if (gameBoard[i - 1][j] == '#') {
                            neighbors++;
                        }
                        if (gameBoard[i - 1][j + 1] == '#') {
                            neighbors++;
                        }
                    } else if (j == gameBoard.length - 1) {
                        if (gameBoard[i][j - 1] == '#') {
                            neighbors++;
                        }
                        if (gameBoard[i - 1][j] == '#') {
                            neighbors++;
                        }
                        if (gameBoard[i - 1][j - 1] == '#') {
                            neighbors++;
                        }
                    } else {
                        for (int k = i - 1; k <= i; k++) {
                            for (int l = j - 1; l <= j + 1; l++) {
                                if ((k != i || l != j) && gameBoard[k][l] == '#') {
                                    neighbors++;
                                }
                            }
                        }
                    }
                } else {
                    if (j == 0) {
                        for (int k = i - 1; k <= i + 1; k++) {
                            for (int l = j; l <= j + 1; l++) {
                                if ((k != i || l != j) && gameBoard[k][l] == '#') {
                                    neighbors++;
                                }
                            }
                        }
                    } else if (j == gameBoard[i].length - 1) {
                        for (int k = i - 1; k <= i + 1; k++) {
                            for (int l = j - 1; l <= j; l++) {
                                if ((k != i || l != j) && gameBoard[k][l] == '#') {
                                    neighbors++;
                                }
                            }
                        }
                    } else {
                        for (int k = i - 1; k <= i + 1; k++) {
                            for (int l = j - 1; l <= j + 1; l++) {
                                if ((k != i || l != j) && gameBoard[k][l] == '#') {
                                    neighbors++;
                                }
                            }
                        }
                    }
                }
                if (gameBoard[i][j] == '.' && neighbors == 3) {
                    gameBoard[i][j] = '#';
                } else if (gameBoard[i][j] == '#' && neighbors < 2) {
                    gameBoard[i][j] = '.';
                } else if (gameBoard[i][j] == '#' && neighbors == 2 || neighbors == 3) {
                    gameBoard[i][j] = '#';
                } else {
                    gameBoard[i][j] = '.';
                }
                /*System.out.println("y: " + i + " x: " + j);
                for (int k = 0; k < gameBoard.length; k++) {
                    for (int l = 0; l < gameBoard[k].length; l++) {
                        if (k == i && l == j) {
                            System.out.printf(" %s; ", gameBoard[k][l]);
                        } else {
                            System.out.printf(" %s ", gameBoard[k][l]);
                        }
                    }
                    System.out.println();
                }

                System.out.println("\n\n\n");
                */

            }
            //System.out.println();
        }
        return gameBoard;
    }
}


