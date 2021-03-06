import java.util.*;
import java.io.*;

/**
 * Details of a customer.
 * 
 * @author Jacob Knott
 */
public class Customer
{
    
    private NumberGen numberGen = new NumberGen();
    // The first name of customer
    private String firstName;
    // The last name of customer
    private String lastName;
    // Customer full name
    private String fullName;
    // The company name
    private String company;
    // Adress of customer
    private String address;
    // Street of customer
    private String street;
    // City of residience
    private String city;
    // customer state of residience 
    private String state;
    // customer zip code
    private int zip;
    // Tcustomer phone number.
    private String phoneNumber;
    //Unique ID 
    private final int customerNum;
    
    /** 
     * Create and record a customer's information
     */

    public Customer(String firstName, String lastName, String street, String city, String state, int zip, String phoneNumber, String companyName)
    {
        customerNum = numberGen.random5Digit();
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        company = companyName;
        fullName = firstName + " " + lastName;
        address = street + " " + city + " " + state + " " + zip;
    }
    
    /**
     * Create and record all of a customer's information
     */

    public Customer()
    {
        customerNum = numberGen.random5Digit();
        firstName = "unknown";
        lastName = "unknown";
        street = "unknown";
        city = "unknown";
        state = "unknown";
        zip = 00000;
        phoneNumber = "unknown";
        company = "unknown";
        fullName = firstName + " " + lastName;
        address = street + ", " + city + ", " + state + ", " + zip;
    }
    
    /**
     * changes the customer's name
     */
        public void changeName(String firstName, String lastName){
        fullName = firstName + " " + lastName;
    }
    
    /**
     * changes the customer's phone number
     */
        public void changePhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    /**
     * changes the customer's address
     */    
        public void changeAddress(String street, String city, String state, int zip){
        address = street + ", " + city + ", " + state + ", " + zip;
    }
    
    /**
     * changes the company a customer is associated with
     */    
        public void changeCompany(String company){
        this.company = company;
    }
    
    /**
    * get the order number
    */
   public int getCustomerNumber(){
    return customerNum;
    }
    
    /**
     * Return the type of animal spotted.
     * @return The animal type.
     */
    public String getFirstName() 
    {
        return firstName;
    }

    /**
     * Return last name
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
    
     /**
     * Return companyName.
     */
    public String getCompanyName() 
    {
        return company;
    }
    
    /**
     * Prints all of the customer information
     */
    public void printCustomerDetails(){
        System.out.println("Customer number: " + customerNum);
        System.out.println( "Full name: " + fullName);
        System.out.println( "Phone Number: " + phoneNumber);
        System.out.println( "Address: " + address);
        System.out.println( "Company name: " + company );
    }
}