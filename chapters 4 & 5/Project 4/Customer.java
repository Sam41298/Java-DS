import java.util.*;
import java.io.*;

/**
 * Details of a customer.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class Customer
{
    // The first name of customer
    private final String firstName;
    // The last name of customer
    private final String lastName;
    // Customer full name
    private final String fullName;
    // The company name
    private final String companyName;
    // Adress of customer
    private final String address;
    // Street of customer
    private final String street;
    // City of residience
    private final String city;
    // customer state of residience 
    private final String state;
    // customer zip code
    private final int zip;
    // Tcustomer phone number.
    private final String phoneNumber;
    //Bill Number
    //private final int billAmount;
    //Featrue choosen
    //private final int featureNum;
    //Unique ID 
    private int customerID;
    
    /** 
     * Create and record all of a customers information
     * If I can find away this constructor will be used
     * when an order is created.
     */

    public Customer(String firstName, String lastName, String street, String city, String state, int zip, String phoneNumber, String companyName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.companyName = companyName;
        fullName = firstName + " " + lastName;
        address = street + " " + city + " " + state + " " + zip;
    }
    
    /**
     * Create and record all of a customers information
     * Until I find a way to use the first constructor this will setup
     * a dummy customere that is updated during the order process via 
     * a method in the class
     */

    public Customer()
    {
        firstName = "unknown";
        lastName = "unknown";
        street = "unknown";
        city = "unknown";
        state = "unknown";
        zip = 00000;
        phoneNumber = "unknown";
        companyName = "unknown";
        fullName = firstName + " " + lastName;
        address = street + " " + city + " " + state + " " + zip;
    }
    
    /**
     * Return the type of animal spotted.
     * @return The animal type.
     */
    public String getfirstName() 
    {
        return firstName;
    }

    /**
     * Return the 
     */
    public String getlastName() 
    {
        return lastName;
    }
    
    /**
     * Return the customers full name
     */
    public String getFullName() 
    {
        return fullName;
    }
    
    /**
     * Return address 
     */
    public String getAddress() 
    {
        return address;
    }

    /**
     * Return phone number
     */
    public String getPhoneNumber() 
    {
        return phoneNumber;
    }
    
     /** MOVE TO ORDER CLASS
     * Return companyName.
     */
    public String getCompanyName() 
    {
        return companyName;
    }
    
    /**
     * Prints all of the customer information
     */
    public void printcustomerDetails(){
        System.out.println( "Full name: " + fullName);
        System.out.println( "Phone Number: " + phoneNumber);
        System.out.println( "Address: " + address);
        System.out.println( "Company name: " + companyName );
    }
}