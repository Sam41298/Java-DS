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
   //private Customer customer;
   // holds product details
   private Inventory inventory;
   // Stores the price o customer order
   private int price;
   
   /**
    * Creates an Order
    */
   public Order()
   {  
       //customer = new Customer();
       inventory = new Inventory();
       price = 0;
   }
   
   private int getPrice(){
       return price;
    }
    
    /**
     * Need to think through this a little more. 
     * I need a way to add a customer to the bill
    
    public void attachCustomer(Customer billedCustomer){
        Customer attachedCustomer = Customer (billedcustomer);
        
        System.out.println(attachedattachedCustomer);
    }  */
    
    /**
     * Prints list of all products w/ featurs and their prices.
     */
   public void viewProducts(){
       inventory.printDesigns();
       //getFeatureChoice();
       
    }
  
   /**
    * Having trouble geting it to store the right values in selected array currently it stair
    * stair steps it's way through the arrays ie feature 1 = 10 2 = 30 3 =50 4 = 130 5 = 500
    * I have no clue why
    * 
    * THis appears to be fixed 
    */
   public void chooseDesign(int design){
       //int passedPrice = inventory.selectDesign(design);
       price =  0 + inventory.selectDesign(design); //resets price to base price whenever
       System.out.println("Current price: " + price);
       // a new design is chosen
   }

   public void addFeature(int feature){
       //inventory.selectDesign(feature); // is this line necessay
       price = price + inventory.selectFeature(feature); 
       
       System.out.println("You added feature: " + feature + ".");
       System.out.println("Current price: " + price + ".");
  
    }
    
    /**
     * THis method has the same problem as addFeature
     * Allows a user to remove a feature and change price back. I would like to make 
     * it so this method can't be used until a feature is applied at the very least. 
     * if I had time I'd want to make is so it can only remove applied feautures.
     */
       public void removeFeature(int feature){
       //inventory.selectDesign(feature); // is this line necessay
       price = price - inventory.selectFeature(feature); 
  
    }
    
    /**
     * This method will print the users bill and customer information
     *METHOD NOT COMPLET I WANT TO FIND A WAY TO PRINT COOKIE CUTTER SELECTION AND
     * SELECTED FEATURES IF THERE ARE ANY.
     */
    public void printBill(){
        System.out.println("\n Cusotmer information");
        //customer.printCustomerDetails();
        System.out.println( "\n Order Details");
        System.out.println("Final price: "+ price);
    }
    
}
