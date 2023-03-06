

public class GoDemo {
    public static void main(String[] args) throws Exception {

        
    BoardClass game = new BoardClass();

    game.printBoard();

    game.placeStone(3, 2); // B
    game.placeStone(2, 1); // W
    game.placeStone(0, 1); // B
    game.placeStone(4, 0); // W
    game.placeStone(3, 2); // B
    

    }
}
