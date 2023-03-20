


class TicTacToeDemo {
    public static void main(String[] args) {

        TicTacToe board1 = new TicTacToe();
        
        // Test a TIE

        System.out.println("\n------------------\n");
        System.out.println("Game Board1 starts");
        System.out.println("------------------\n");

        board1.printBoard();
        board1.updateBoard(1, 1);
        board1.updateBoard(2, 0);
        board1.updateBoard(1, 0);
        board1.updateBoard(2, 1);
        board1.updateBoard(0, 2);
        board1.updateBoard(0, 0);
        board1.updateBoard(0, 1);
        board1.updateBoard(1, 2);
        board1.updateBoard(2, 2);

        // Test a WINNER match
        TicTacToe board2 = new TicTacToe();

        System.out.println("\n------------------");
        System.out.println("Game Board2 starts");
        System.out.println("------------------\n");


        board2.printBoard();
        board2.updateBoard(1, 1);
        board2.updateBoard(2, 0);
        board2.updateBoard(1, 0);
        board2.updateBoard(2, 1);
        board2.updateBoard(1, 2);


    }
}
