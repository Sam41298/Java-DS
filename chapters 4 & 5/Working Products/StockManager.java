import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        boolean itemExists = false;
        for(Product pro : stock){   
            if(pro.getID() == item.getID()){ 
                itemExists = true;
                break;
            }
        }
           
            if(itemExists == false){
                stock.add(item);
            }
            else{
                System.out.println("A product already has this ID.");
            }
        
    }
    
    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void delivery(int id, int amount)
    {
        for( Product pro: stock){
            if(pro.getID()== id){
                pro.increaseQuantity(amount);
            }
        }
    }
    
    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProductByID(int id)
    {
        for(Product pro: stock){
            if(pro.getID()==id){
                return pro;
            }
        }
        return null;
    }
    
       /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProductByName(String name)
    {
        for(Product pro: stock){
            if(name.equals(pro.getName())== true){
                return pro;
            }
        }
        return null;
    } 
    
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int id)
    {
        for(Product pro:stock){
            if(pro.getID()==id){
                return pro.getQuantity();
            }
    }
    return 0; // May need else statement 
    }

    /**
     * Print details of all the products.
     */
   public void printProductDetails()
    {
        if(stock.size()==0){
            System.out.println("There is nothing to print the details of.");
        }
        else{
            System.out.println("Details of this/these product(s) are: ");
            for(Product pro:stock){
                System.out.println(pro.toString());
            }
       }
    }
   
}
