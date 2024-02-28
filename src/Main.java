import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ticTakToe();
    }

    public static void ticTakToe(){
        char[][] board = new char[3][3];
        char p1 = 'X';
        char p2 = 'O';
        boolean gameStatus = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
        for (int i = 0; i < 9; i ++ ){
            markSpot(board,p1);
            if(checkThreeInARow(board, p1)){
                System.out.println("Player 1 has won");
                i = 9;
            }else{
                markSpot(board,p2);
                if(checkThreeInARow(board, p2)){
                    System.out.println("Player 2 has won");
                    i = 9;
                }

            }


        }







    }

    public static void printBoard(char[][] board){
        System.out.println(board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println(board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println(board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
    }

    public static void markSpot(char[][] board, char symbol){
        Scanner scanner = new Scanner(System.in);
        String player = "Player 2";
        int userChoice;
        boolean positionNotFilled = true;

        if (symbol == 'X'){
            player = "Player 1";
        }

        while(positionNotFilled){
            System.out.println(player + " please select a position to mark [1-9]: ");
            userChoice = scanner.nextInt();
            scanner.nextLine();

            switch (userChoice) {
                case 1 -> {
                    if (board[0][0] == ' ') {
                        board[0][0] = symbol;
                        positionNotFilled = false;
                    }
                }
                case 2 -> {
                    if (board[0][1] == ' ') {
                        board[0][1] = symbol;
                        positionNotFilled = false;
                    }

                }
                case 3 -> {
                    if (board[0][2] == ' ') {
                        board[0][2] = symbol;
                        positionNotFilled = false;
                    }
                }
                case 4 -> {
                    if (board[1][0] == ' ') {
                        board[1][0] = symbol;
                        positionNotFilled = false;
                    }
                }
                case 5 -> {
                    if (board[1][1] == ' ') {
                        board[1][1] = symbol;
                        positionNotFilled = false;
                    }
                }
                case 6 -> {
                    if (board[1][2] == ' ') {
                        board[1][2] = symbol;
                        positionNotFilled = false;
                    }
                }
                case 7 -> {
                    if (board[2][0] == ' ') {
                        board[2][0] = symbol;
                        positionNotFilled = false;
                    }
                }
                case 8 -> {
                    if (board[2][1] == ' ') {
                        board[2][1] = symbol;
                        positionNotFilled = false;
                    }
                }
                case 9 -> {
                    if (board[2][2] == ' ') {
                        board[2][2] = symbol;
                        positionNotFilled = false;
                    }
                }
            }

            if (positionNotFilled){
                System.out.println("Position has already been selected make a new selection");
            }
            printBoard(board);
        }


    }

    public static boolean checkThreeInARow(char[][] board, char targetElement) {
        // Check rows
        for (char[] chars : board) {
            if (chars[0] == targetElement && chars[1] == targetElement && chars[2] == targetElement) {
                return true;
            }
        }

        // Check columns
        for (int j = 0; j < board[0].length; j++) {
            if (board[0][j] == targetElement && board[1][j] == targetElement && board[2][j] == targetElement) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] == targetElement && board[1][1] == targetElement && board[2][2] == targetElement) {
            return true;
        }
        if (board[0][2] == targetElement && board[1][1] == targetElement && board[2][0] == targetElement) {
            return true;
        }

        return false;
    }
}