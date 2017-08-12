import java.util.*;

public class NumberGen
{
    // new random number generator
    Random randomNum = new Random();
    // Value 
    private int value;
    // storing the customer id's
    private ArrayList<Integer> idList = new ArrayList<Integer>();
    
    public NumberGen(){
        
    }
    
    /**
     * this generates a random 5 digit number.
     * 
     */
    public int random5Digit(){
        Random rand = new Random();
        boolean foundID = false; // For the duplicate number.
        boolean done = false; // For the while loop.
        int uniqueId = 0; // For the return value.
        
        while(done == false)
        {
         int possibleId = rand.nextInt(99999-10000+1)+10000;
         
         for(int customerID : idList){
             if (possibleId == customerID){
                 foundID = true;
             }
         }
         
         if(foundID == false){
             uniqueId = possibleId;
             done = true;
            } else {
                done = false;
            }
        }
        
        return uniqueId;
    }     
}
    
