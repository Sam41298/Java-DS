import java.util.*;

/**
 * Write a description of class Dice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dice
{
    // instance variables - replace the example below with your own
    private int sideNumber = 0;
    private double value = 0;

    /**
     * Constructor for objects of class Dice
     */
    public Dice(int sideNumber)
    {
        
        this.sideNumber = sideNumber;
        
    }

    /**
     * A user determines how many sides a dice should have and then rolls the dice. 
     * Valid types of dice are 4, 6, 8, 10, 12, 20, and 100.
     * If not a valid type an error message is printed asking for a valid input.
     *
     * @param  sidedDie (how many sides should the die have)
     * @return number (number you roled)
     */
    public int rollA(int sidedDie)
    {
        Random rand = new Random();
        return rand.nextInt(sidedDie)+1;
    }
    
    public int getSideNumber(){
        return sideNumber;
    }
    
    public void setValue(int value){
        this.value = value;
    }
    
    public double getValue(){
        return value;
    }
    
    public void roll(){
        Random rand = new Random();
        setValue( rand.nextInt(this.sideNumber) + 1 );
    }
    
    /**
     * I doubt this is how cases were inteded to be used but this was one of the two ways I could think to do this project. 
     * I could also have each case add their product to a collection(not sure which kind yet, leaning to HashMap that contains 10 die) and this would easily apply 
     * RollCheck methods with the use of an iterator. I think
     * 
     * A user determines how many sides a dice should have and then rolls the dice. 
     * Valid types of dice are 4, 6, 8, 10, 12, 20, and 100.
     * If not a valid type an error message is printed asking for a valid input.
     *
     *I need help getting the defalut to work in this
     *
     * @param  sidedDie (how many sides should the die have)
     * @return number (number you roled)
     */
    public int rollAV2(int sidedDie)
    {
        int number = 0;
        Random rand = new Random();
        switch(sidedDie){  
          case 4: 
          {
              int roll = rand.nextInt(4)+1;
              System.out.println(roll);
              
          }
          case 6: number = rand.nextInt(6) + 1 ; break;
          case 8: number = rand.nextInt(8) + 1 ; break;
          case 10:number = rand.nextInt(10) + 1 ; break;
          case 12: number = rand.nextInt(12) + 1 ; break;
          case 20: number = rand.nextInt(20) + 1 ; break;
          case 100: number = rand.nextInt(100) + 1 ; break;
          // when passed through the rollCheck the message will be displayed and roll will fail.
          default: System.out.println( " there is not design "+"/" + sidedDie + "/"+" please select a valid product") ; number = 1;
        }
        
        System.out.println(number);
        return number;
        
    }
}
