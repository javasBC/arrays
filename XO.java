import java.util.Arrays;
import java.util.Scanner;

public class XO {
    public static void main(String[] args) {
        System.out.printf("welcome to the best game ever ");
        Scanner scanner = new Scanner(System.in);
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '_';
            }
        } // define
        int turn = 1;

        System.out.printf("select your character X-0 ");
        System.out.println(Arrays.deepToString(board));
        if (scanner.next().equalsIgnoreCase("x")) {
            turn++;
        }
        for (int i = 0; i < 10; i++) {
            char p = 'O';
            if (turn % 2 == 0) {
                p = 'x';
            }
            System.out.println("enter a number between 0-9");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    board[0][0] = p;
                    break;
                case 2:
                    board[0][0] = p;
                    break;
                case 3:
                    board[0][0] = p;
                    break;
                case 4:
                    board[0][0] = p;
                    break;

                case 5:
                    board[0][0] = p;
                    break;
                case 6:
                    board[0][0] = p;
                    break;
                case 7:
                    board[0][0] = p;
                    break;
                case 8:
                    board[0][0] = p;
                    break;
                case 9:
                    board[0][0] = p;
                    break;
                default:
                    i--;
            } //assignment
        }


    }

}
