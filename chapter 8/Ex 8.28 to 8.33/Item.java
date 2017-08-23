
/**
 * Ex 8.33
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Item
{
    private String name;
	private String description;
    private int weight;
    
    /**
     * constructor
     */
    public Item(String name, String description, int weight)
    {
        this.name = name;
        this.description = description;
        this.weight = weight;
    }

	/**
     * get item description
     */
    public String getName(){
        return name;
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
