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
    // The company name
    private final String companyName;
    // Adress of customer
    private final String address;
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
     * Create a record of a sighting of a particular type of animal.
     * @param animal The animal spotted.
     * @param spotter The ID of the spotter.
     * @param count How many were seen (>= 0).
     * @param area The ID of the area in which they were seen.
     * @param period The reporting period.
     */

    public Customer(String firstName, String lastName, String address, String city, String state, int zip, String phoneNumber, String companyName, int billAmount, int featureNum)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.companyName = companyName;
		//this.billAmount = billAmount;
		//this.featureNum = featureNum;
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
     * Return address
     * FIGURE OUT HOW TO DISPLAY ALL IN SAME I0N LOGICAL ORDER. 
     */
    public String getAddress() 
    {
		String theAddress = address + " " + city + " " + state;
        return theAddress;
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
        return companyName;
    }
	
}
