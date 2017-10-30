import java.util.*;
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player extends Being
{
    private String name;
    private Items inventory;
    private int carryWeight;
    //private Room current  Room;
    private Random rand;
    private Stack<Room> movementHistory;

    /**
     * Constructor for objects of class Player
     */
    public Player(String name)
    {
        super(name);
        carryWeight = 100;
        rand = new Random();
        movementHistory = new Stack<>();
    }

    /**
     * generates new random number
     */
    private int randomNum(){
        return rand.nextInt(100)+1; 
    }
    
    /**
     * EXCEPTION OCCURS ON LINE 33
     * Gets player info
     */
     public String getStatus(){
        String playerInfo = ""; //currentRoom.getLongDescription();
        playerInfo = playerInfo + "\n " + viewInventory();
        return playerInfo;
     }
    
    /**
     * moves player into a room
     * has 1 in a 100 chances of being randomly teleported.
     */
    
    public void playerEnterRoom(Room room){
       if(randomNum()==1){  
         enterRoom(worldBuilder.getRandRoom());
         System.out.print("you find yourself in a different room after a strange fog surrounds you. ");
        }
       else{
            enterRoom(room);
        }
    }

    /**
     * moves player into a room
     */
    public Room getPlayerRoom(){
        return getRoom();
    }

    /**
     * places an item into player inventory
     */
    public Item grabItem(String itemName){
        Item item = getRoom().removeItem(itemName);
        inventory.addItem(itemName, item);
        return item;    

    }

    /**
     * places an item into player inventory
     */
    public Item dropItem(String itemName){
        Item item = inventory.removeItem(itemName);
        getRoom().addItem(item);
        return item;    

    }

    /**
     * edit made here 1-29 330
     * Returns a String of all items carried.
     */
    public String viewInventory(){
        return inventory.getItemsDescriptions();
    }

    /**
     * stores the player's past moves
     */
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
                buffout = getRoom().removeItem(itemName);
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
