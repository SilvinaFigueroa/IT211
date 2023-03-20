import javax.security.auth.callback.ChoiceCallback;

class TicTacToe {

    private final int boardLength = 3;
    private final String emptyCell = " - ";
    private final String X = " X ";
    private final String O = " O ";
    private String whoseTurn = " X ";
    int counter_mov = 0;
    Boolean winner = false;

    private String[][] board = new String[boardLength][boardLength];

    // Constructor - initializes the board to empty cells and sets the turn to X.
    TicTacToe() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = emptyCell;
            }
        }

        whoseTurn = X;
    }
    // Method to change turns to the other player.

    private void changeTurn() {
        if (whoseTurn == X) {
            whoseTurn = O;
        } else {
            whoseTurn = X;
        }

        counter_mov++;
    }

    // Validations for wrong coordinates and cell not empty when adding X or Y to
    // the board
    public void updateBoard(int x, int y) {
        if (winner == false) {
            if (x >= boardLength
                    || x < 0
                    || y >= boardLength
                    || y < 0) {
                System.out.println("invalid coordinate x: " + x + "y: " + y);
            }

            if (board[x][y] != emptyCell) {
                System.out.println("invalid move. cell not empty");

            } else {
                // Add X or Y in the coordinates and change turn to the other player.
                board[x][y] = whoseTurn;
                printBoard();
                changeTurn();
            }

        }

        else {
            System.out.println("The game has ended, please use initializeBoard() and start over");
        }

    }

    public void checkWinner() {
        // Check winner validating all possible coodinates

        if (board[0][0] == whoseTurn && board[0][1] == whoseTurn && board[0][2] == whoseTurn) {
            winner = true;
            System.out.println("Congratulations " + whoseTurn + ", you are the winner");

        } else if (board[1][0] == whoseTurn && board[1][1] == whoseTurn && board[1][2] == whoseTurn) {
            winner = true;
            System.out.println("Congratulations " + whoseTurn + ", you are the winner");
        }

        else if (board[2][0] == whoseTurn && board[2][1] == whoseTurn && board[2][2] == whoseTurn) {
            winner = true;
            System.out.println("Congratulations " + whoseTurn + ", you are the winner");
        }

        else if (board[0][0] == whoseTurn && board[1][1] == whoseTurn && board[2][2] == whoseTurn) {
            winner = true;
            System.out.println("Congratulations " + whoseTurn + ", you are the winner");
        }

        else if (board[2][0] == whoseTurn && board[1][1] == whoseTurn && board[0][2] == whoseTurn) {
            winner = true;
            System.out.println("Congratulations " + whoseTurn + ", you are the winner");
        }

        else if (board[0][0] == whoseTurn && board[1][0] == whoseTurn && board[2][0] == whoseTurn) {
            winner = true;
            System.out.println("Congratulations " + whoseTurn + ", you are the winner");
        }

        else if (board[0][1] == whoseTurn && board[1][1] == whoseTurn && board[2][1] == whoseTurn) {
            winner = true;
            System.out.println("Congratulations " + whoseTurn + ", you are the winner");
        }

        else if (board[0][2] == whoseTurn && board[1][2] == whoseTurn && board[2][2] == whoseTurn) {
            winner = true;
            System.out.println("Congratulations " + whoseTurn + ", you are the winner");
        }

        else if (counter_mov == 8) {
            winner = true;
            System.out.println("No one wins. It's a tie");
        }

        else {
            winner = false;
        }

    }

    public void initializeBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = emptyCell;
            }
        }
        whoseTurn = X;
    }

    public void printBoard() {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }

        checkWinner();
        if (winner == false) {
            System.out.println("current turn: " + whoseTurn);

        }

        else {

            System.out.println("Game over");
        }
    }

}
