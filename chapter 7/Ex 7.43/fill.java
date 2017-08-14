import java.util.*;
/**
 * Write a description of class fill here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class fill
{
  
    /**
     * Constructor for objects of class fill
     */
    public fill()
    {
   
    }
    
    public void fillTest(){
    int array[] = new int[]{1,5,4,9,2};
    System.out.println("Before fill");
    for(int key : array){
        System.out.println(key);
    }
    Arrays.fill(array, 42);
    System.out.println("after fill");
    for(int key : array){
        System.out.println(key);
    }
}
}
