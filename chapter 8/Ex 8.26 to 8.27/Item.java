
/**
 * Ex 8.22
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Item
{
    private String description;
    private int weight;
    
    /**
     * constructor
     */
    public Item(String description, int weight){
        this.description = description;
        this.weight = weight;
    }
    
    /**
     * get item description
     */
    public String getDescription(){
        return description;
    }
    
    /**
     * get item weight
     */
    public int weight(){
        return weight;
    }
    
    /**
     * gives a descrition of the item
     */
    public String getItemInfo(){
        String item = "In the room is a/an ";
        item = item + this.description + 
        "\nItem weight : " + this.weight;
        return item;
    }
}
