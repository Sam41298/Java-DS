
import java.util.*;
/**
 * creates tic tac toe game
 */
public class TicTacToe {
    
    Scanner input = new Scanner(System.in);
    private String playerOne = "X", playerTwo = "O", empty = "E";
    private final int WIN = 1, DRAW = 2, CONTINUE = 3;
    String player = "X";
    private String board[][] = new String[3][3];
    
    private boolean gameOver;
    /**
     * creates and plays the game
     */
    public TicTacToe(){
       
       setBoard();
       displayBoard();
       int row;
       int column;
       gameOver = false;
       
       
       while(gameOver == false){
           Scanner input = new Scanner(System.in);
           
           try{
               System.out.println("Please enter row (0-2) of your move: ");
               row = input.nextInt();
               System.out.println("Please enter column (0-2); of your move: ");
               column = input.nextInt();
                  if(row  < 0 && row > 2 || column < 0 && column > 2 ){
                  System.out.println("PLEASE ENTER NUMBER IN THE GIVEN RANGE!");
                  }else {
                  //Program goes here when having good input
                  move(row, column);
                 }
            }catch(Exception e){System.out.println(e);}
           
       }
    }
    
    /**
     * swithes between X and O
     */
    public void switchPlayer(){
     if (player == "O") {
                player = "X";

            }
            else {
                player = "O";
            }
    }
    
    /**
     * sets up game board
     */
    public void setBoard(){
        for(int i = 0; i < 3; i++){
            
            for(int l = 0; l < 3; l ++){
                board[i][l] = empty;
            }
        }
    }
    
    /**
     * displays the game board
     */
    public void displayBoard(){
         System.out.println("       0       1       2   ");
         for(int i = 0; i < 3; i++){
            System.out.println(i + "  |   " + board[i][0] + "   |   " + board[i][1] + "   |   " + board[i][2] + "   |");
            System.out.println("   -------------------------");   
        }           
    }
    
    /**
     * has the player move, validates move, and updates the board
     */
    public void move(int row, int column){
        if(board[row][column] == "E"){
            board[row][column] = player; 
            
            displayBoard();
            winState();
            switchPlayer();
        }
        else{
            displayBoard();
            System.out.println("\n Please choose an empty location.\n Empty locations are identified by the letter E.");
            //displayBoard();
        }
    }
    
    /**
     * used in if statement for cats game
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
        if(board[0][0] != "E" && board[0][0] == board[1][0] && board[1][0] == board[2][0]){
            System.out.println( "The winner is " + board[0][0] + "!");
            gameOver = true;
        }
        
        //second row
        else if(board[0][1]  != "E"  && board[0][1] == board[1][1] && board[1][1] == board[2][1]){
            System.out.println( "The winner is " + board[0][1] + "!");
            gameOver = true;
        }
        //bottom row
        else if(board[0][2]  != "E" && board[0][2] == board[1][2] && board[1][2] == board[2][2]){
            System.out.println( "The winner is " + board[02][0] + "!");
            gameOver = true;
        }
        // 1st column
        else if(board[0][0]  != "E"  && board[0][0] == board[0][1] && board[0][1] == board[0][2]){
            System.out.println( "The winner is " + board[0][0] + "!");
            gameOver = true;
        }
        //2nd columbs
        else if(board[1][0]  != "E" && board[1][0] == board[1][1] && board[1][1] == board[1][2]){
            System.out.println( "The winner is " + board[1][0] + "!");
            gameOver = true;
        }
        // third colum
        else if(board[2][0]  != "E"  && board[2][0] == board[2][1] && board[2][1] == board[2][2]){
            System.out.println( "The winner is " + board[2][0] + "!");
            gameOver = true;
        }
        // upper rigth to bottom left diagnal
        else if(board[0][0]  != "E"  && board[0][0] == board[1][1] && board[1][1] == board[2][2]){
            System.out.println( "The winner is " + board[0][0] + "!");
            gameOver = true;
        }
        // bottom left to upper right diagnal
        else if(board[0][2]  != "E"  && board[0][2] == board[1][1] && board[1][1] == board[2][0]){
            System.out.println( "The winner is " + board[0][2] + "!");
            gameOver = true;
        }
        // cat's game
        else if(numberOfE() < 1){
           System.out.println( "It's a cat's game!");
           gameOver = true;
        }
        // game not over
        else{
            System.out.println(" The game continues...next player moves");
            //gameOver = false; //is this redundancy needed?
        }
    }
}
