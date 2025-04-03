package as.prog2.exercises.set02;

import java.util.Scanner;

public class Game {
    private Board board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    public Game() {
        board = new Board();
        player1 = new Player("Player 1", 'X');
        player2 = new Player("Player 2", 'O');
        currentPlayer = player1;
    }

    public void Connect4() {
        Scanner scanner = new Scanner(System.in);
        board.initializeBoard();

        while (true) {
            board.displayBoard();
            System.out.println(currentPlayer.getName() + " ("+ currentPlayer.getPiece()+")"+", your turn!");
            System.out.print("Choose a column (0-6): ");
            int column = scanner.nextInt();

            if (!board.newPiece(column, currentPlayer.getPiece())) {
                System.out.println("Invalid move! Try again.");
                continue;
            }

            if (checkWin()) {
                board.displayBoard();
                System.out.println(currentPlayer.getName() + " wins!");
                break;
            }
            if (board.isFull()) {
                board.displayBoard();
                System.out.println("It's a draw!");
                break;
            }
            if (currentPlayer == player1) {
                currentPlayer = player2;
            }
            else {
                currentPlayer = player1;
            }
        }
        scanner.close();
}


private boolean checkWin() {
    WinCheck checker = new WinCheck();
    return checker.gameWon(board, currentPlayer.getPiece());
}
}
