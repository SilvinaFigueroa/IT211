


class TicTacToeDemo {
    public static void main(String[] args) {

        TicTacToe board = new TicTacToe();
        
        board.printBoard();
        board.updateBoard(1, 1);
        board.updateBoard(2, 0);
        board.updateBoard(1, 0);
        board.updateBoard(2, 1);
        board.updateBoard(0, 2);
        board.updateBoard(0, 0);
        board.updateBoard(0, 1);
        board.updateBoard(1, 2);
        board.updateBoard(2, 2);
        




    }
}
