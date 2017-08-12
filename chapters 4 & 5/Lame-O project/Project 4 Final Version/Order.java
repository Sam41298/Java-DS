import java.util.*;
import java.io.*;

/**
 * Manages a customers order.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Order
{
   // holds customer info
   private Customer attachedCustomer;
   // holds product details
   private Inventory inventory;
   // Stores the price o customer order
   private int price;
  
   
   /**
    * Creates an Order
    */
   public Order()
   {  
       attachedCustomer = new Customer();
       inventory = new Inventory();
       price = 0;
   }
   
   /**
    * gets price
    */
   private int getPrice(){
       return price;
    }
   
   /**
    * used in main
    */
   public void attachedCustomer(Customer billedCustomer){
       attachedCustomer = billedCustomer;
   }  
    
    /**
     * Prints list of all products w/ featurs and their prices.
     */
   public void viewProducts(){
       inventory.printDesigns();
    }
  
   /**
    * Customer chooses product design 
    */
   public void chooseDesign(int design){
       price = 0 + inventory.selectDesign(design); 
       System.out.println("Current price: " + price);
   }

   /**
    * adds a feature to product.
    */
   public void addFeature(int feature){
       price = price + inventory.selectFeature(feature); 
       System.out.println("You added feature: " + feature + ".");
       System.out.println("Current price: " + price + ".");
  
    }
    
    /**
     * THis method has the same problem as addFeature
     * Allows a user to remove a feature and change price back.
     */
       public void removeFeature(int feature){
       //inventory.selectDesign(feature); // is this line necessay
       price = price - inventory.selectFeature(feature); 
  
    }
    
    /**
     * This method will print the users bill and customer information
     */
    public void printBill(){
        System.out.println("\n Cusotmer information");
        attachedCustomer.printCustomerDetails();
        System.out.println( "\n Order Details");
        System.out.println("Final price: "+ price);
    }
    
    
}
