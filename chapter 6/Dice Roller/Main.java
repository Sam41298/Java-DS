import java.util.*;

/**
 * Main should  be really easy to write because of it is only calling and applying methods from the other two classes
 * so the ground work and leg work must be done in the Dice & RollCheck classes. 
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    // instance variables - replace the example below with your own
    private final int min = 5;
    private final int max = 30;
    private double valueOfOne = 0;
    private double calculation = 0.00;
    private ArrayList<Dice> bagOfDice = new ArrayList<Dice>();
    
    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        // Creating and storing the dice.
        fillDiceBag(4, 4); //, 10);
        
        // Rolling the dice.
        for(Dice die : bagOfDice){
            die.roll();
            if(die.getValue() == 1){
                valueOfOne++;
            }
        }
        
        //
        double calculation = (valueOfOne / bagOfDice.size());
        if(calculation > .5){
           System.out.println("Roll Failed");
        } else {
            System.out.println(" You rolled: "); 
        }
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
                                                                 // going to make this anohter check in roll check.
    public void fillDiceBag(int numberOfSides, int numberOfDice) //, int targetNumber) 
    {
        
     for(int num = 0; num < numberOfDice; num++){
      Dice die = new Dice(numberOfSides);
      bagOfDice.add(die);
      // now i just need to have it print what each die rolled... again i may need to make this into a seperater
      // method to ensure functionality...i hope
      die.rollAV2(numberOfSides);
     }
    }
}
