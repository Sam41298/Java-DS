import java.util.*;
/**
 * Write a description of class toList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class asList
{
    /**
     * Constructor for objects of class toList
     */
    public asList()
    {
    
    }

    public void asListExample(){
        String array[]= new String []{"Joe", "Jacob", "Seth", "Paul", "Doug"};
        List nameList = Arrays.asList(array);
        System.out.println(nameList);
    }
}
