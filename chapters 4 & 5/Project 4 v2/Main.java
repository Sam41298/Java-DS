import java.util.*; 
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    /**
   // holds customer info
   private Customer customer;
   // holds product details
   private Inventory inventory;
   // Holds order info 
   private Order order;
   */
   // Wrong to hold multiple pieces of information there must Array List for
   // All but inventory which remains the same
   
   // Stores all customers
   private ArrayList<Customer> customers;
   // Stores all customers
   private ArrayList<Order> orders;
   // Stores all customers HAVE IDEAS, NOT SURE HOW TO IMPLEMENT!!!
   //private ArrayList<CustomerNumbers> customerNum;
   // Stores all customers
    // holds product details
    // incentory remains constant same for all orders and customers
   private Inventory inventory;
   
   
   
   /**
    * Creates an Order
    */
   public Main()
   {  
       customers = new ArrayList();
       //customerNumbers = new ArrayList();
       

   }
}