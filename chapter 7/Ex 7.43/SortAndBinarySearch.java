import java.util.*;
/**
 * Write a description of class binarySearch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class  SortAndBinarySearch
{
    /**
     * Constructor for objects of class binarySearch
     */
    public SortAndBinarySearch()
    {
        
    }
    
    /**
     * not sure whats up here, it should search for 42 and find it. but when I try to view the array 
     * it returns an address not the actual list.
     */
    public void binarySearchExample(){
        int array[]= new int[]{42,3,1,2};
        Arrays.sort(array);
        System.out.println(Arrays.asList(array));
        System.out.println("What is answer to the great question of life, the universe, and everything is \n \n");
        int searchValue = 42;
        int returnValue = Arrays.binarySearch(array, searchValue);
        
         System.out.println("The answer to the great question of life, the universe, and everything is... ");
         System.out.println( returnValue + "!");
         
    }
}
