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
   // Stores all customers
   private ArrayList<Customer> customers;
   // Stores all customers
   private ArrayList<Order> orders;
   // Products for purchase
   private Inventory inventory;
   // Temporary order
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
    * 
    * @param design has the user select a design form out inventory
    * @param customer attaches a customer to the order
    */
   public void StartNewOrder(int design, int customerNumber){
       tempOrder = new Order();
       tempOrder.chooseDesign(design);
       Customer passedCustomer = new Customer();
       Customer test = new Customer();
       passedCustomer = getCustomer(customerNumber);
       if(passedCustomer == test){
           System.out.println("Customer " + customerNumber + " does not exist!");
       } else{
           tempOrder.attachedCustomer(passedCustomer);
       }
   }
   
   /**
    * Prints list of all products w/ featurs and their prices.
    */
    public void viewProducts(){
       inventory.printDesigns();
    }
    
   /**
    * Adds pre-existing customer to customers
    */
   public void addCustomer(Customer customer){
    customers.add(customer);
    }
   
   /**
    * Better method for creating and adding customers
    *  
    * Updates Customer information
    */
   public void addCustomerV2(String firstName, String lastName, String street, String city, String state, int zip, String phoneNumber, String companyName){
       Customer customer= new Customer();
       customer.changeName(firstName, lastName);
       customer.changePhoneNumber(phoneNumber);
       customer.changeAddress(street, city, state, zip);
       customer.changeCompany(companyName);
       
       customers.add(customer);
    }
   
   /**
    * Prints all customers
    */
   public void printAllCustomers(){
        for(Customer customer: customers){
        customer.printCustomerDetails();
      }
   }

   /**
    * Prints Customer information
    */
   public void printCustomerInfo(int searchID){
     boolean foundCustomer = false;
     Customer found = new Customer();
       
      for( Customer customer : customers){
           System.out.println("Entering loop\n");
           customer.printCustomerDetails();
           if (customer.getCustomerNumber() == searchID){
            System.out.println("Found!!!");
            found = customer;
            foundCustomer = true;
           }
           System.out.println("\nexiting loop");
      }
    
      if (foundCustomer == true){
           found.printCustomerDetails();
      } 
      else {
           System.out.println("No matching customer on file.");
      }
     
    
    }
    
   /**
    * seartches for a customer view their number
    */ 
   public Customer getCustomer(int searchID){
      boolean foundCustomer = false;
      Customer found = new Customer();
       
       for( Customer customer : customers){
           if (searchID == customer.getCustomerNumber()){
            foundCustomer = true;
            found = customer;
           }
       }
       return found;
   }
   
   /**
    * get the bill
    * NEED TO MAKE COMPATIBLE WITH ARRAYLIST 
    */
    public void getBill(){
        tempOrder.printBill();
    }
    
    /**
    * finalizes the bill 
    */
    public void finishOrder(){
        tempOrder.printBill();
        orders.add(tempOrder);
    }
}