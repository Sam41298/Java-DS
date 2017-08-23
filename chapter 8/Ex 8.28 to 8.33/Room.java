import java.util.*;
/**
 * E
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */
public class Room 
{
    private String description;
    private HashMap<String, Room> exits;
 	private Items items; 
    
    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        this.description = description;
        exits = new HashMap<>();
        items = new Items();
    }

    /**
     * Ex. 8.8 
     * Define an exit from this room.
     * @param direction The direction of the exit.
     * @param neighbor  The room to which the exit leads.
     */
    public void setExit(String direction, Room neighbor) 
    {
        exits.put(direction, neighbor);
    }

    /**
     * Ex 8.11
     * Return a description of the room
     */
    public String getLongDescription()
    {
        return "You are " + description + ".\n" + getExitString() + "\nItems in area: " + items.getItemsNames();
    }
    

    
    /**
     * Ex 8.11
     * Return a string describing the room's exits, for example
     * "Exits: north west".
     * @return Details of the room's exits.
     */
    private String getExitString()
    {
        String returnString = "Exits:";
        Set<String> keys = exits.keySet();
        for(String exit : keys) {
            returnString += " " + exit;
        }
        return returnString;
    }

    
    /**
     * Ex 8.8 
     * gets direction of exists
     */
    public Room getExit(String direction){
        return exits.get(direction);
    }
    
    /**
     * Searches for an item witha certian name
     */
    public Item findItem(String name)
    {
        return items.findItem(name);
    }

    /**
     * adds an item into this room.
     */
    public void addItem(Item item)
    {
        items.addItem(item.getName(), item);
    }

	/**
	 *	remove Item from room
	 */
    public Item removeItem(String name)
    {
        return items.removeItem(name);
    }
}
