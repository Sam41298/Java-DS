import java.util.*;
import java.io.*;

/**
 * Manages a customer order. It tracks and uses information from
 * the Inventory class(NOT COMPLETED) and Customer class (COMPLETE)
 * methods here will use information from both classes to help a 
 * customer build and price their desired cookie cutters.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Order
{
    // holds customer info
   private Customer customer;
   // holds product details
   private Inventory inventory;
   // Stores the price o customer order
   private int price;
   
   /**
    * Creates an Order
    */
   public Order()
   {  
       customer = new Customer();
       inventory = new Inventory();
       price = 0;
   }
   
   private int getPrice(){
       return price;
    }
   
   /**
    * I want to make this obselete, see customer class 1st constructor to see how, hopefully
    * Updates Customer information
    */
   public void updateCustomerInfo(String firstName, String lastName, String street, String city, String state, int zip, String phoneNumber, String companyName){
       customer.changeName(firstName, lastName);
       customer.changePhoneNumber(phoneNumber);
       customer.changeAddress(street, city, state, zip);
       customer.changeCompany(companyName);
    }
   
   /**
    * Prints Customer information
    */
   public void printCustomerInfo(){
       customer.printCustomerDetails();
    }
    
    /**
     * Prints list of all products w/ featurs and their prices.
     */
   public void viewProducts(){
       inventory.printDesigns();
       getDesignChoice();
       //getFeatureChoice();
       
   }
   
   /**
    * For the selection and price builder I want to make it so the customer
    * can have multiple features selected. An add feature method is needed
    * 
    * for initial selection they will choose a design
    * it it will display the product name and its base price
    * after that have it print "If you would like features, please add them with
    * the add feature to select desigend feautures"
    */
   public void getDesignChoice(){
       
   }
  
   /**
    * Having trouble geting it to store the right values in selected array currently it stair
	* stair steps it's way through the arrays ie feature 1 = 10 2 = 30 3 =50 4 = 130 5 = 500
	* I have no clue why
    */
   public void chooseDesign(int design){
       inventory.selectDesign(design);
       price =  0 + inventory.selectedDesign[0]; //resets price to base price whenever
       // a new design is chosen
   }

   public void addFeature(int feature){
       inventory.selectDesign(feature); // is this line necessay
       price = price + inventory.selectedDesign[feature]; 
  
    }
    
    /**
     * THis method has the same problem as addFeature
     * Allows a user to remove a feature and change price back. I would like to make 
     * it so this method can't be used until a feature is applied at the very least. 
     * if I had time I'd want to make is so it can only remove applied feautures.
     */
       public void removeFeature(int feature){
       inventory.selectDesign(feature); // is this line necessay
       price = price - inventory.selectedDesign[feature]; 
  
    }
    
    /**
     * This method will print the users bill and customer information
     *METHOD NOT COMPLET I WANT TO FIND A WAY TO PRINT COOKIE CUTTER SELECTION AND
     * SELECTED FEATURES IF THERE ARE ANY.
     */
    public void printBill(){
        System.out.println("\n Cusotmer information");
        customer.printCustomerDetails();
        System.out.println( "\n Order Details");
        System.out.println("Final price: "+ price);
    }
    
}
