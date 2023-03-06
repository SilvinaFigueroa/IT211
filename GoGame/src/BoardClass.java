

public class BoardClass {

    private String currentPlayer;


    // declare a variable with the board size to use a small board for testing 
    int boardSize = 19;
    
    String  goBoard [][] = new String [boardSize][boardSize];
    // Constructor - only called when you create an object - 
    BoardClass () {
       // Initialize the object BoardClass
        cleanBoard();
        currentPlayer = "B";
    }
    public void cleanBoard(){
        // iterate in array of String 1D - row - in goBoard 
        for (int i = 0; i < goBoard.length; i++){
             // iterate in row (array of String 2D)
             for (int j = 0; j < goBoard[i].length; j++){
                  goBoard[i][j] = "-";
            }
        }
    }
    public void printBoard(){
        // Array string "row" in goBoard 2D array
        for (String [] row : goBoard){
            // find element in row 
            for( String element : row) {
                // print the element row 
                System.out.print(element + " ");       
            }
            // start a new line after itirate in each row 
            System.out.println();
        }
    
        System.out.println();
        System.out.println();

    }

    public void placeStone(int x , int y){
    // validation when the position is taken 
    if (goBoard[x][y] == "-"){
        goBoard[x][y] = currentPlayer; 

    // current player - switching - 
    // First player always set to black 

        if (currentPlayer == "B") {
            currentPlayer = "W";
            
        }
        else if (currentPlayer == "W") {
                currentPlayer = "B";
        }  

        // Print boar in every movement 
        printBoard();
    
    }
    
    else {

        System.out.printf("The coordenates " + x + " and " + y +  " are already taken, ilegal movement");
    }

}


}
