import java.util.*;
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player
{
    private String name;
	private Items inventory;
    private int carryWeight;
	private Room currentRoom;

	private Stack<Room> movementHistory;

    /**
     * Constructor for objects of class Player
     */
    public Player(String name)
    {
        // initialise instance variables
		this.name = name;
        carryWeight = 100;
		inventory = new Items();
		movementHistory = new Stack<>();
    }

    /**
     * EXCEPTION OCCURS ON LINE 33
 	 * Gets player info
 	 */
	 public String getStatus(){
		String playerInfo = "";//currentRoom.getLongDescription();
		playerInfo = playerInfo + "\n " + viewInventory();
		return playerInfo;
	 }
	
	/**
 	* Gets player name
 	*/
	public String getName(){
		return name;
	}

	/**
	 * moves player into a room
	 */
	public void enterRoom(Room room){
		currentRoom = room;
	}

	/**
	 * moves player into a room
	 */
	public Room getRoom(){
		return currentRoom;
	}

	/**
	 * places an item into player inventory
	 */
	public Item grabItem(String itemName){
		Item item = currentRoom.removeItem(itemName);
		inventory.addItem(itemName, item);
		return item;	

	}

	/**
	 * places an item into player inventory
	 */
	public Item dropItem(String itemName){
		Item item = inventory.removeItem(itemName);
		currentRoom.addItem(item);
		return item;	

	}

    /**
     * Returns a String of all items carried.
     */
    public String viewInventory(){
        return "You are carrying: " + inventory.getItemsDescriptions();
    }

	public void storeMovement(){
		movementHistory.push(getRoom());
	}

	/**
	 * Player uses buffout to get stronger
	 */
  	public Item eat(String itemName)
    {
        if(itemName.equals("buffout")) {
            Item buffout = inventory.findItem(itemName);
            if(buffout == null) { 
                buffout = currentRoom.removeItem(itemName);
            }
            if(buffout != null) {
                carryWeight += 25;
                return buffout;    
            }
        }
        return null;
    }

    /**
     * 8.23
     * takes player to their previous room
     */    
    public void goBack(){
        if(movementHistory.isEmpty()){
            System.out.println("You can't go back past the begining.");
        }
        else{
            Room previousRoom = movementHistory.pop();
            enterRoom(previousRoom);
            System.out.println(getRoom().getLongDescription());
        }
    }
}
