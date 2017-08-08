import java.util.*;

/**
 * This class takes an integer array and sorts the values into ascedning order.
 *
 * @author (Jacob Knott)
 * 
 */
public class SortingTestV2{

    /**
     * Constructor for objects of class SortingTestV2
     */
    public SortingTestV2()
    {
        //nothing needs to be constructed
    }

    /**
     * this method sorts all the numbers in an array that the user fills.
     */
    public void sortArray(int [] numbers)//user enters values fot arrary
    {
        Arrays.sort(numbers);
        for (int number : numbers){
            System.out.println( number + "\n");   
        }
    }
}
