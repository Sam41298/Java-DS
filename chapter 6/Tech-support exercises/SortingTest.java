import java.util.*;
/**
 * Write a description of class SortingTest here.
 *I HAVE NO FCUKING CLUE WHAT THE HELL THIS CLASS IS DOING AND IT WON'T
 *FUCKING WORK I'M SO DONE WITH THIS CLASS I HATE PROGRAMMING AND ALWAYS WILL
 *I SUCK AT IT AND JUST WANT TO QUIT
 * @author (your name)
 * @version (a version number or a date)
 */
public class SortingTest
{
    /**
     * this will create the array with ints to sort
     */
    public void getUnsortedArray(int arr[]){
        System.out.println("Before sorting");
        for(int number:arr){
            System.out.println("number= " + number);
        }
        Arrays.sort(arr);
        System.out.println("After sorting");
        for(int number : arr){
            System.out.println("number= " + number);
        }
    }
    
    /**
     * creates array to be sorted
     */
    public static void createArray(String args[]){
        int array[]={3,5,2,1,4};
        SortingTest sortTest = new SortingTest();
        sortTest.getUnsortedArray(array);
    }
}