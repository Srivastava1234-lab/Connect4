package as.prog2.exercises.set02;

public class Board {
    private static final int rows = 6;
    private static final int cols = 7;
    private char [][] board = new char [rows][cols];

    public boolean newPiece(int col, char piece){
        if(col < 0 || col >= cols || board[0][col] != '.'){
            return false;
        }
        for (int i = rows-1; i >= 0; i--) {
            if (board[i][col] == '.') {
                board[i][col] = piece;
                return true;
            }
        }
        return false;
    }

    public char[][] getGrid(){
        return board;
    }

    public boolean isFull(){
        for (int col = 0; col < cols; col++) {
            if (board[0][col] == '.') {
                return false;
            }
        }
        return true;
    }

    public void initializeBoard() {
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                board [i][j] = '.' ;
            }
        }
    }

    public void displayBoard() {
        System.out.print("0 1 2 3 4 5 6\n");
        System.out.print("-------------\n");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
