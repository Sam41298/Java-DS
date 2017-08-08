import java.util.*; 
/**
 * This will be what the customer interacts with, I missed the
 * assignment objectives
 * but I am working to restructure this to fit the assigned
 * guidelines. I plan to bounce between in and chapter six and have both 
 * completed as soon as possible. (preferably by this sunday.)
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
   private NumberGen numGen;
   private Order tempOrder;
   
   
   /**
    * this creates an interface to interact with customers and orders
    */
   public Main()
   {  
       customers = new ArrayList<Customer>();
       orders = new ArrayList<Order>();
       inventory = new Inventory();
       inventory.printDesigns();
   }
   
   /**
    * begins order creation
    */
   public void newOrder(int design){
       tempOrder = new Order();
       
       tempOrder.chooseDesign(design);
       
    }
   
    /**
     * Prints list of all products w/ featurs and their prices.
     */
    public void viewProducts(){
       inventory.printDesigns();
    }
    
   /**
    * adapted method for adding customers
    */
   public void addCustomer(Customer customer){
    customers.add(customer);
    }
   
   /**
    * Better method for creating and adding customers
    *  
    * Updates Customer information
    */
   public void updateCustomerInfo(String firstName, String lastName, String street, String city, String state, int zip, String phoneNumber, String companyName){
       Customer customer= new Customer();
       customer.changeName(firstName, lastName);
       customer.changePhoneNumber(phoneNumber);
       customer.changeAddress(street, city, state, zip);
       customer.changeCompany(companyName);
       
       customers.add(customer);
    }
    
    public void printAllCustomers(){
        for(Customer customer: customers){
        customer.printCustomerDetails();
      }
    }

   /**
    * Prints Customer information
    * WARNING: ETERNAL LOOP, WILL NEVER FIND NAME AND PRINTS NO MATCH MESSAGE UNTIL FORCED RESET
    */
   public void printCustomerInfo(String searchedName){
     boolean foundCustomer = false;
     Customer found = new Customer();
     while(foundCustomer == false){
       
       for( Customer customer : customers){
           if ( customer.getFirstName() == searchedName){
            foundCustomer = true;
            found = customer;
           }
       }
      }
       if (foundCustomer == true){
           found.printCustomerDetails();
       } else {
           System.out.println("No matching customer on file.");
       }
     
    
    }

 
   
   /**
    * get the bill
    * NEED TO MAKE COMPATIBLE WITH ARRAYLIST 
    */
    public void getBill(){
    //order.printBill();
    }
}