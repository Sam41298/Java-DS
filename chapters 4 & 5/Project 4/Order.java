import java.util.*;
import java.io.*;

/**
 * Write a description of class Order here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Order
{
    // Stores Order number
   private int Ordernum;
    // holds customer info
   private Customer customer;
   
   /**
    * Creates an Order
    */
   public Order()
   {
       customer = new Customer();
       
   }
  
   /**
    * gets prints customer info
    */
   public void printcustomerInfo(){
       customer.printcustomerDetails();
    }
}
