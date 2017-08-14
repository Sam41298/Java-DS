import java.util.*;

/**
 * OK I have the base for the two rules that have to be followed. one works the 
 * other i think is close.
 *Now I need a way to get a running total of what some one rolled so that we can 
 *even start a check for the min and max limit.
 *
 * @author (your name)
 * @version (a version number or a date)
 * 
 * @Last Edit: RealRollerv2 method.
 */
public class Main
{
    // instance variables - replace the example below with your own
    private final int min = 5;
    private final int max = 30;
    private int targetNum;
    private double total;
    private double valueOfOne = 0;
    private double calculation = 0.00;
    private ArrayList<Dice> bagOfDice = new ArrayList<Dice>();
    
    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        total = 0;
    }

    /**
     * TO try and get the re-roll if roll = type i used a while loop but when the condition is true
     * gets stuck in the loop forever
     */
    public void RealRoller(int numberOfSides, int numberOfDice, int targetNumber){
        for(int num = 0; num < numberOfDice; num++){
            Dice die = new Dice(numberOfSides);
            bagOfDice.add(die);
            minMaxCheck(targetNumber);
            die.roll();
             if(die.getValue() == 1){
                valueOfOne++;
            }
            double calculation = (valueOfOne / numberOfDice);
            System.out.println("valueOfOne = " + valueOfOne + " | bag = " + numberOfDice);
            System.out.println("Calculation = " + calculation);
             if(calculation > .5){
           System.out.println("Roll Failed ");
          } else {
            System.out.println(" You rolled ");
            System.out.println(die.getValue());
          }
        }
        
        //double calculation = (valueOfOne / bagOfDice.size());
       
    }
    
    /**
     * * TO try and get the re-roll if roll = type i used a while loop but when the condition is true
     * gets stuck in the loop forever
     */
    public void RealRoller(int numberOfSides, int numberOfDice){
        
        int checkNumber = 1; //= validateInput();
        if( checkNumber == 1){
        
            for(int num = 0; num < numberOfDice; num++){
            Dice die = new Dice(numberOfSides);
            bagOfDice.add(die);
            die.roll();
            
            System.out.println("You rolled: " + die.getValue());
            if(die.getValue() == numberOfSides){
                int numOfAttempts = 1;
                total += die.getValue();
               while(die.getValue() == numberOfSides){
                System.out.println("re-roll attempt " + numOfAttempts);
                numOfAttempts++;
                die.roll();
                System.out.println("New roll = " + die.getValue());
                total += die.getValue();
               }
            }
            
            if(die.getValue() == 1){
                valueOfOne++;
            }
            
            double calculation = (valueOfOne /numberOfDice);
            
             if(calculation > .5){
             System.out.println("Roll Failed");
            }
           }
            System.out.println("Total = " + total);
        } else {
            System.out.println("Your input was invalide!");
        }
    
        
       
    }
    
    /**
     * Test Roller for code experimentation
     */
    public void testRoller(int numberOfSides, int numberOfDice){
        for(int num = 0; num < numberOfDice; num++){
            Dice die = new Dice(numberOfSides);
            bagOfDice.add(die);
            die.roll();
            total = total + die.getValue();
            double calculation = (valueOfOne / bagOfDice.size());
             if(die.getValue() == 1){
                valueOfOne++;
            }
          
         // this is causing diplay issues when method is activated   
             if(calculation > .5){
           System.out.println("Roll Failed");
          } else {
            System.out.println(" You rolled");
            System.out.println(die.getValue());
            System.out.println("Total rolled");
            System.out.println(total);
          }
        }
        
        //double calculation = (valueOfOne / bagOfDice.size());
       
    }
    
    public void targetCheck( int targetNum){
        if(targetNum > 4 && targetNum < 31){
        this.targetNum = targetNum;
        }
        else{
        System.out.println("Target numbers must be between 5 and 30. \n Please try again with a valid target");
        }
    }
    
   
    /**
     * ensures target number is within range.
     */
    public void minMaxCheck( int targetNum){
        if( total < min || total > max){
            this.targetNum = targetNum;
        }
    }
    
    /**
     * checks to see if target number hit
     */
    public void targetHit(){
        if(targetNum
    }
  }