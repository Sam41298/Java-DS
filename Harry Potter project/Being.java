import java.util.*;
/**
 * Abstract class Being - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Being
{
    private String name;
    private Room currentRoom;
    //I know this is bad practice but it is late and I had to get as far as possible
    protected WorldBuilder worldBuilder;
    /**
     * Constructor for objects of class Player
     */
    public Being(String name)
    {
        // initialise instance variables
        worldBuilder = new WorldBuilder();
        this.name = name;
        this.currentRoom = worldBuilder.getStartPoint();
    }

    /**
     * EXCEPTION OCCURS ON LINE 33
     * Gets player info
     */
     public String getStatus(){
        String playerInfo = "";//currentRoom.getLongDescription();
        playerInfo = playerInfo + "\n " ;//+ viewInventory();
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
    
    protected Room changeSpawnPoint(){
        return worldBuilder.getRandRoom();
    }
}
