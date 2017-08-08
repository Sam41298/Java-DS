import java.util.*;
/**
 * Write a description of class MapTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MapTester
{
    // instance variables - replace the example below with your own
    private HashMap contacts = new HashMap();

    /**
     * Constructor for objects of class MapTester
     */
    public MapTester()
    {
        
    }

    /**
     * Ex. 6.27
     * Adds a person to contacts
     */
    public void addContact(String name, String number){
        contacts.put(name, number);
    }
    
    /**
     * Ex. 6.27
     * Find a person's phone number
     * 
     * @returns name
     */
    public String lookUpNumber(String name){
        return (String) contacts.get(name);
    }    
}
