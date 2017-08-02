
/**
 * Write a description of class Ordering here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
import java.io.*;

public class Ordering
{
    
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    private String fName;
    private String lName;
    private String address;
    private String city;
    private String state;
    private String designChoice;
    private String featureChoice;
    private int zip;
    private int phoneNum;
    private int billing;
    private int customerID;
    
    public Ordering()
    {
        //Create random number.
        customerID = random.nextInt(9999)+1;
    }
    
    public void createCustomer()
    {
        Customer customer = new Customer();//Fill param list with fields. 
    }
    
    public void inputCustomerInfo()
    {
        System.out.println("Enter First Name:");
        fName = input.nextLine();
        System.out.println("Enter Last Name:");
        lName = input.nextLine();
        System.out.println("Enter Address:");
        address = input.nextLine();
        System.out.println("Enter city:");
        city = input.nextLine();
        System.out.println("Enter state:");
        state = input.nextLine();
        System.out.println("Enter zip:");
        zip = input.nextInt();
        System.out.println("Enter phoneNum (example = 2311234567):");
        zip = input.nextInt();
        printDesigns();
        System.out.println("Which design would you like? enter a number 1-5:");
        int designNum = input.nextInt();
        designNum--;
        //Case statement for what they choose.
        printFeatures();
        System.out.println("Which feature would you like? enter a number 1-5:");
        int featureNum = input.nextInt();
        featureNum--;
        //Case statment for what they choose.
        //After all that, add the bill total.
    }
    
    public void printDesigns()
    {
     //Print out design names
    }
    public void printFeatures()
    {
     //For loop within a For loop to display grid view of prices.
    }
    
    public void printBillOfSale()
    {
        //Whenever we get to it
    }
}
