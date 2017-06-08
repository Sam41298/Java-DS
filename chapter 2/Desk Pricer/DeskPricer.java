
/**
 * This Class is used calculate the price of a custom desk
 * and Store order/customer infomation
 *
 * @author (Jacob Knott)
 * @version (6-8-2017)
 */
public class DeskPricer
{
    // instance variables - replace the example below with your own
    private int order;
    private String name;
    private int drawers;
    private double surfaceArea;
    private String wood;
    private int price;
    
    /**
     * Please enter order number and Your full Name.
     */
    public DeskPricer(int newOrder, String newName)
    {
     order = newOrder;
     name = newName;
     price = 200;
     drawers = 0;
     wood = "pine";
    }

    // Enter desired Dimensions in inches
    public void dimensions( double length, double width)
    { 
     surfaceArea = length * width;
     if (surfaceArea >= 750){
         price= price + 50;
        }
        else {
         price = price +0;
        }
    }
    
    // Enter type of wood ( “mahogany”, "oak", or "pine"
    public void woodType( String typeOfWood)
    {
        wood = typeOfWood;
        if ( typeOfWood.equals ("mahogany")){
            price = price + 150;
        }
        else if ( typeOfWood.equals ("oak")){
            price = price + 125;
        }
        else { 
            typeOfWood.equals ("pine");
            price = price + 0;
        }
       
    }
    // How many drawers do you want?
    public void addDrawers( int newDrawers)
    {
        drawers = newDrawers;
        price = price + drawers * 30;
    }
    
    public int getPrice()
    {
        return price;
    }
    // Print Order information
    public void printOrder()
    {
       System.out.println();
       System.out.println("Order Number: " + order);
       System.out.println("Name: " + name);
       System.out.println("Surface area: " + surfaceArea);
       System.out.println("Number of drawers: " + drawers);
       System.out.println("Type of wood: " + wood);
       System.out.println("Final price: " + price);
       System.out.println();
    }
}
