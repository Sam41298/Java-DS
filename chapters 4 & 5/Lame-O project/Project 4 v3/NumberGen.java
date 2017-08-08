
/**
 * Write a description of class NumberGen here.
 * PUT IN CHECK STATEMENT 
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;

public class NumberGen
{
    
    
    // instance variables - replace the example below with your ow
    Random randomNum = new Random();
    // passed value
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
         
         // Searching for a possible dupe.
         for(int customerID : idList){
             if (possibleId == customerID){
                 foundID = true;
             }
         }
         
         // Checking if a dupe was found.
         if(foundID == false){
             uniqueId = possibleId;
             done = true;
            } else {
                done = false;
            }
        }
        
        return uniqueId;
    }
        //need to add a comparison feature before adding id to customer
        //idList.add(uniqueId); says may be unititialized
        
    }
    
