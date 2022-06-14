package AssignmentsAndClassWorks;

import java.util.Arrays;
import java.util.List;

public class TicTacToe {
    String[][] game;

    //      public TicTacToe(int row, int column) {
//          this.game =  new String[row][column];
//      }
    public static void printGameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char column : row) {
                System.out.print(column);

            }
            System.out.println();
        }


    }

    public static String placePiece(char[][] gameBoard, int numberPosition, String user) {

        char symbol = ' ';
        if (user.equals("player")) {
            symbol = 'X';
        } else if (user.equals("computer")) {
            symbol = '0';
        }

        switch (numberPosition) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;


        }


        return user;
    }
    public static  String checkWinner() {
        List topRow = Arrays.asList(1,2,3);
        List midRow = Arrays.asList(4,5,6);
        List botRow = Arrays.asList(7,8,9);
        List leftColumn = Arrays.asList(1,4,7);
        List midColumn = Arrays.asList(2,5,8);
        List rightColumn = Arrays.asList(3,6,9);
        List cross1 = Arrays.asList(1,5,9);
        List cross2 = Arrays.asList(7,5,3);

        return"";
    }

}














//    Symbol gamePiece;
//    TicTacToe() {
//        this.ticTac = new String[row][column];
//    }

//    public void initializeBoardDefaultValue() {
//        for (int i = 0; i < ticTac.length; i++) {
//            for (int j = 0; j < ticTac[i].length; j++) {
////                gamePiece = Symbol.EMPTY;
//                ticTac[i][j] = GamePiece.EMPTY;
//            }
//        }

//    }


//    public String[][] getArray() {
//        return ticTac;
//    }


