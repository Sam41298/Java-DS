
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
    
    
}
