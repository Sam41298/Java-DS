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
    private int numberOfSides;
    private double value = 0;

    /**
     * Constructor for objects of class Dice
     */
    public Dice(int numberOfSide)
    {
        numberOfSidesCheck(numberOfSide);
    }
    
    /**
     * ensures number of sides is an acceptable number
     */
    private void numberOfSidesCheck(int x){
        if ( x == 4 || x == 6 || x == 8 || x == 10 || x == 12 || x == 20 || x == 100){
            numberOfSides = x;
        }  
        else{
            System.out.println( x + " is not a valid die Type.\n Please try again valid die types are 4, 6, 8, 10, 12, 20, or 100.");
        }
    }
    
    public int getSideNumber(){
        return numberOfSides;
    }
    
    public void setValue(int value){
        this.value = value;
    }
    
    public double getValue(){
        return value;
    }
    
    /**
     * rolls dice defined ind constructor
     */
    public void roll(){
        Random rand = new Random();
        setValue( rand.nextInt(this.numberOfSides) + 1 );
        //System.out.println(value);
    }
    
    /**
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
               number = roll;
          }
          case 6:
          {
              int roll = rand.nextInt(6)+1;
              System.out.println(roll);
               number = roll;
          }
          case 8:
          {
              int roll = rand.nextInt(8)+1;
              System.out.println(roll);
               number = roll;
          }
          case 10:
          {
              int roll = rand.nextInt(10)+1;
              System.out.println(roll);
               number = roll;
          }
          case 12: 
          {
              int roll = rand.nextInt(12)+1;
              System.out.println(roll);
               number = roll;
          }
          case 20:
          {
              int roll = rand.nextInt(20)+1;
              System.out.println(roll);
               number = roll;
          }
          case 100:
          {
              int roll = rand.nextInt(100)+1;
              System.out.println(roll);
              number = roll;
          }
          // when passed through the rollCheck the message will be displayed and roll will fail.
          //default: System.out.println( " there is no "+"/" + sidedDie + "/"+" sided die, please select a valid die type") ; number = 1;
        }
        
        System.out.println(number);
        return number;
        
    }
    
}
