import java.util.*;
/**
 * Write a description of class Items here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Items
{
    // instance variables - replace the example below with your own
     private HashMap<String, Item> items;
    
    /**
     * Constructor for objects of class Items
     */
    public Items()
    {
        // initialise instance variables
        items = new HashMap<>();
    }

    /**
     * Put the given item in the list.
     * @param name The name of the item.
     * @param value The item.
     */
    public void addItem(String name, Item value)
    {
        items.put(name, value);
    }
    
    /**
     * Searches for item with a cetian name
     */
    public Item findItem(String name)
    {
        return items.get(name);
    }
    
    /**
     * Remove the given item.
     */
    public Item removeItem(String name)
    {
        return items.remove(name);
    }
    
    /**
     * Ex 8.33
     * gets all item names 
     */
    public String getItemsNames(){
        String itemNames = "All item names: ";
        for(Iterator<Item> it = items.values().iterator(); it.hasNext();){
            itemNames = itemNames + " " + it.next().getName()+ ",";
        }
        return itemNames;
    }
    
    /**
     * Ex 8.33 (formerly 8.22)
     * gets all item descriptions 
     */
    public String getItemsDescriptions(){
        String itemList = "";
        for(Iterator<Item> it = items.values().iterator(); it.hasNext();){
            itemList = itemList + " " + it.next().getDescription()+ ",";
        }
        return itemList;
    }
    
    /**
     * Return the total weight of all items in the list.
     * @return The total weight
     */
    public int getTotalWeight()
    {
        int totalWeight = 0;
        for(Iterator<Item> it = items.values().iterator(); it.hasNext(); ) {
            totalWeight += it.next().weight();
        }
        return totalWeight;        
    }
}
