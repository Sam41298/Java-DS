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
    private int numbOfDice;
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
     * * TO try and get the re-roll if roll = type i used a while loop but when the condition is true
     * gets stuck in the loop forever
     */
    public void RealRoller(int numberOfSides, int numberOfDice,int targetNumber){
           emptyBag();
           diceCheck(numberOfDice);
            for(int num = 0; num < numbOfDice; num++){
            Dice die = new Dice(numberOfSides);
            bagOfDice.add(die);
            rollBag(numberOfSides);
            
            System.out.println("You rolled: " + die.getValue());
            targetHit(die.getValue());
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
    }
   
    /**
     * rolls bag of dice
     */
    public void rollBag(int numberOfSides){
        for (Dice die:bagOfDice){
                die.roll();
            }
            
    }
    
    /**
     * empty bag of dice
     */
    public void emptyBag(){
        for(Dice die: bagOfDice){
            bagOfDice.remove(die);
        }
    }
    
    /**
     * only 10 dice can be rolled at a time
     */
    public void diceCheck(int x){
        if(x > 0 && x < 10){
            numbOfDice = x;
        }
        else{
            System.out.println( "You can roll a most 10 dice and at least 1 die. No more and no less");
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
    public void targetHit(double targetNumber){
        if(targetNum == targetNumber){
            System.out.println("Target Number Hit");
        }
        else{
            System.out.println("Target number missed");
        }
  }
}