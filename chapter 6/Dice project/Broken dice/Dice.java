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
    
    /**
     * rolls dice defined ind constructor
     */
    public void roll(){
        Random rand = new Random();
        setValue( rand.nextInt(this.sideNumber) + 1 );
        //System.out.println(value);
    }
    
    /**
     * lets fuck some shit up!
     */
    public void testRoller(){
        Random rand = new Random();

        setValue( rand.nextInt(this.sideNumber) + 1 );
		
		if( value == 1){
        System.out.println("Roll Failed (from testRoller() )");
    	}
		else {
			//System.out.println(value);
		}
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
          default: System.out.println( " there is no "+"/" + sidedDie + "/"+" sided die, please select a valid die type") ; number = 1;
        }
        
        System.out.println(number);
        return number;
        
    }
    
    public int rollAV3(int sidedDie)
    {
        int number = 0;
        Random rand = new Random();
        switch(sidedDie){  
          case 4: number = rand.nextInt(4) + 1 ; break;
          case 6: number = rand.nextInt(6) + 1 ; break;
          case 8: number = rand.nextInt(8) + 1 ; break;
          case 10:number = rand.nextInt(10) + 1 ; break;
          case 12: number = rand.nextInt(12) + 1 ; break;
          case 20: number = rand.nextInt(20) + 1 ; break;
          case 100: number = rand.nextInt(100) + 1 ; break;
          // when passed through the rollCheck the message will be displayed and roll will fail.
          default: System.out.println( " there is no "+"/" + sidedDie + "/"+" sided die, please select a valid die type") ; number = 1;
        }
        
        System.out.println(number);
        return number;
        
    }
}
