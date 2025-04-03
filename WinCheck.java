package as.prog2.exercises.set02;

public class WinCheck {

    public boolean gameWon(Board board, char piece){
        return checkDiagonal(board,piece) || checkHorizontal(board, piece) || checkVertical(board,piece)
                || checkOtherDiagonal(board,piece);
    }

    public boolean checkHorizontal(Board board, char piece) {
        char[][] grid = board.getGrid();
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j <= grid[0].length-4; j++) {
                if (grid[i][j] == piece && grid[i][j + 1] == piece && grid[i][j + 2] == piece && grid[i][j + 3]
                        == piece) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkVertical(Board board, char piece) {
        char[][] grid = board.getGrid();
        for(int i = 0; i <= grid.length -4 ; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == piece && grid[i + 1][j] == piece && grid[i + 2][j] ==
                        piece && grid[i + 3][j] == piece) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkDiagonal(Board board, char piece) {
        char[][] grid = board.getGrid();
        for(int i = 0; i <= grid.length -4 ;i++) {
            for(int j = 0; j <= grid[0].length -4; j++) {
                if(grid[i][j] == piece && grid[i+1][j+1]== piece && grid[i+2][j+2] ==
                        piece && grid[i+3][j+3]== piece) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean checkOtherDiagonal(Board board, char piece) {
        char[][] grid = board.getGrid();
        for (int i = 3; i < grid.length; i++) {
            for (int j = 0; j <= grid[0].length - 4; j++) {
                if (grid[i][j] == piece && grid[i - 1][j + 1] == piece &&
                        grid[i - 2][j + 2] == piece && grid[i - 3][j + 3] == piece) {
                    return true;
                }
            }
        }
        return false;
    }
}