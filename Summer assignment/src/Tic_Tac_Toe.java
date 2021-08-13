import java.util.Scanner;

public class Tic_Tac_Toe {
    public static String[][] initialize(){
        System.out.println("Welcome to Adithya's Tic Tac Toe java game with 2D arrays. Lets begin.");
        System.out.println("What would you like the size of the board to be?");
        Scanner scan = new Scanner(System.in);
        int boardsize = scan.nextInt();
        if (boardsize<3){
            boardsize = 3;
        }
        String[][] board = new String[boardsize][boardsize];
        for(int i = 0; i<=boardsize; i++){
            for (int j = 0; j<boardsize; i++){
                board[i][j] = "-";
            }
        }
        return board;
    }

    public static int[] askARowAndColumn(String[][] board){
        // currentPlayer 0 is Os and 1 is Xs
        Scanner scan = new Scanner(System.in);

        int boardsize = board[0].length;
        int counter = 0;
        for (int i =0; i<boardsize){
            for (int j = 0; j<boardsize; j++){
                if (board[i][j] == "-"){
                    counter+=1;
                }
            }
        }
        if (counter == 0){
            System.out.println("The board is full.");
        }

        System.out.print("What is the row you would like to input?");
        int rowLocation = scan.nextInt();

        System.out.println("What is the column you would like to input?");
        int columnLocation = scan.nextInt();

        int[] Coordinates = new int[2];
        Coordinates[0] = rowLocation;
        Coordinates[1] = columnLocation;

        return Coordinates;
    }

    public static String[][] makeAMove(String[][] board, int currentPlayer, boolean BoardIsFull){
        boolean changehasbeenmade = false ;
        int[] Coordinates = askARowAndColumn();


        while (board[Coordinates[0]][Coordinates[1]] == "O" || board[Coordinates[0]][Coordinates[1]] == "X") {
            System.out.println("This co-ordinate has been filled. Please enter a different co-ordinate.");
            Coordinates = askARowAndColumn();
        }
        return board;
    }

    public static boolean checkIfPlayerHasWon(String[][] board){
        boolean winnerBool = false;
        if (winnerBool)


        return winnerBool;
    }

    public static void main(){
        boolean BoardIsFull = false;

        while (BoardIsFull == false) {
            int currentPlayer = 0;
            String[][] board = initialize();

        }


    }

}
