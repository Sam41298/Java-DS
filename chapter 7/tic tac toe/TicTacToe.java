
import java.util.*;

public class TicTacToe {
    
    Scanner scanner = new Scanner(System.in);
    private String playerOne = "X", playerTwo = "O", empty = "E";
    private final int WIN = 1, DRAW = 2, CONTINUE = 3;
    private int playerID = 0;
    private String board[][] = new String[3][3];
    
    private boolean firstPlayer, gameOver;

    public TicTacToe(){
       setBoard();
       displayBoard();
       winState();
    }
    
    public void getInput(){
        boolean isValideMove = false;
        
        while(isValideMove == false){
           int choice = 0;
           System.out.println("Where would you like to go? (example 1 for slot 0-0): ");
           choice = scanner.nextInt();
           
           if(validateMove(choice) == 0){
               
            } else {
                
            }
        }
    }
    
    public int validateMove(int moveNum){
        int validNum = 0;
        
        return validNum;
    }
    
    public void setBoard(){
        for(int i = 0; i < 3; i++){
            
            for(int l = 0; l < 3; l ++){
                board[i][l] = empty;
            }
        }
        //board.fill();
    }
    
    public void displayBoard(){
         System.out.println("       0       1       2   ");
         for(int i = 0; i < 3; i++){
            System.out.println(i + "  |   " + board[i][0] + "   |   " + board[i][1] + "   |   " + board[i][2] + "   |");
            System.out.println("   -------------------------");   
        }           
    }
    
    public void move(int row, int column, String xOro){
        if(board[row][column] == "E"){
            board[row][column] = xOro; 
            
            displayBoard();
            winState();
        }
        else{
            System.out.println("\n Please choose an empty location.\n Empty locations are identified by the letter E.");
            displayBoard();
        }
    }
    
    /**
     * this does half of what I want it to do
     */
    public void validmove( int row, int column, String xOro){
        if(board[row][column] == "E"){
            board[row][column] = xOro; 
            
            displayBoard();
            winState();
        }
        else{
            System.out.println("\n Please choose an empty location.\n Empty locations are identified by the letter E.");
            displayBoard();
        }
    }
    
    /**
     * used in if statemetn for cats game
     */
    private int numberOfE(){
        int numOfE = 0;
        for( int row = 0; row < 3; row++){
            for (int column = 0; column < 3; column++){
                numOfE++;
            }
        }
        
        return numOfE;
    }
    
    /**
     * Checks to see if a player has won, a tie has occured or if the game will go on.
     * must alter board to br something other as this returns E won
     */
    private void winState(){
        // top row
        if(board[0][0] == "x" || board[0][0] == "y" && board[0][0] == board[1][0] && board[1][0] == board[2][0]){
            System.out.println( "The winner is " + board[0][0] + "!");
        }
        
        //second row
        else if(board[0][1] == "x" || board[0][0] == "y" && board[0][1] == board[1][1] && board[1][1] == board[2][1]){
            System.out.println( "The winner is " + board[0][1] + "!");
        }
        //bottom row
        else if(board[0][2] == "x" || board[0][0] == "y" && board[0][2] == board[1][2] && board[1][2] == board[2][2]){
            System.out.println( "The winner is " + board[02][0] + "!");
        }
        // 1st column
        else if(board[0][0] == "x" || board[0][0] == "y" && board[0][0] == board[0][1] && board[0][1] == board[0][2]){
            System.out.println( "The winner is " + board[0][0] + "!");
        }
        //2nd colums
        else if(board[1][0] == "x" || board[0][0] == "y" && board[1][0] == board[1][1] && board[1][1] == board[1][2]){
            System.out.println( "The winner is " + board[1][0] + "!");
        }
        // third colum
        else if(board[2][0] == "x" || board[0][0] == "y" && board[2][0] == board[2][1] && board[2][1] == board[2][2]){
            System.out.println( "The winner is " + board[2][0] + "!");
        }
        // upper rigth to bottom left diagnal
        else if(board[0][0] == "x" || board[0][0] == "y" && board[0][0] == board[1][1] && board[1][1] == board[2][2]){
            System.out.println( "The winner is " + board[0][0] + "!");
        }
        // bottom left to upper right diagnal
        else if(board[0][2] == "x" || board[0][0] == "y" && board[0][2] == board[1][1] && board[1][1] == board[2][0]){
            System.out.println( "The winner is " + board[0][2] + "!");
        }
        // cat's game
        else if(numberOfE() < 1){
           System.out.println( "The winner is " + board[0][0] + "!");
        }
        // game not over
        else{
            // game not over 
            //nextPlayerMove() maybe
        }
    }
}
