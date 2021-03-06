import java.util.*;
/**
 *  This class is the main class of the "Hogwarts school of witchcraft and wizardy" application.
 *  it is a very simple, text based adventure game.
 * 
 *  To play this game, create an instance of this class and call the "play"
 *  method.
 * 
 *  This main class creates and initialises all the others: it creates all
 *  rooms, creates the parser and starts the game.  It also evaluates and
 *  executes the commands that the parser returns.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */

public class Game 
{
    private Parser parser;
    //private Stack<Room> movementHistory;
    private Player player;
    private WorldBuilder worldBuilder;
    private Room currentRoom;
    
    /**
     * Create the game and initialise its internal map.
     */
    public Game() 
    {
        worldBuilder = new WorldBuilder();
        currentRoom =worldBuilder.getStartPoint();
        player = new Player("ALousySamaratian");
        parser = new Parser();
        //movementHistory = new Stack<>();
    }

    /**
     * EXCEPTION HERE LINE 88
     *  Main play routine.  Loops until end of play.
     */
    public void play() 
    {            
        printWelcome();

        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.
                
        boolean finished = false;
        while (! finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Thank you for playing.  Good bye.");
    }

    /**
     * EXCEPTION HERE LINE 111
     * Print out the opening message for the player.
     */
    private void printWelcome()
    {
        System.out.println();
        System.out.println("Welcome to the Hogwart's school of witchcraft and wizardry!");
        System.out.println("It is a new, almost boring adventure game.");
        System.out.println("Type 'help' if you need help.");
        System.out.println();
        System.out.print(currentRoom.getLongDescription());
        System.out.println();
    }

    /**
     * Given a command, process (that is: execute) the command.
     * @param command The command to be processed.
     * @return true If the command ends the game, false otherwise.
     */
    private boolean processCommand(Command command) 
    {
        boolean wantToQuit = false;

        if(command.isUnknown()) {
            System.out.println("I don't know what you mean...");
            return false;
        }

        String commandWord = command.getCommandWord();
        if (commandWord.equals("help")) {
            printHelp();
        }
        else if (commandWord.equals("go")) {
            goRoom(command);
        }
        else if (commandWord.equals("look")) {
            //look();
        }
         else if (commandWord.equals("take")) {
            grabItem(command);
        }
        else if (commandWord.equals("drop")) {
            dropItem(command);
        }        
        else if (commandWord.equals("items")) {
            viewInventory();
        }
        else if (commandWord.equals("eat")) {
            eat(command);
        
        }
        else if (commandWord.equals("back")) {
            goBack();
        }
        
         else if (commandWord.equals("quit")) {
            wantToQuit = quit(command);
        }

        return wantToQuit;
    }

    // implementations of user commands:

    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and a list of the 
     * command words.
     */
    private void printHelp() 
    {
        System.out.println("You are lost. You are alone. You wander");
        System.out.println("around the the school.");
        System.out.println();
        System.out.println("Your command words are:");
        System.out.println(parser.getCommandList());
    }

    /** 
     * Try to go in one direction. If there is an exit, enter
     * the new room, otherwise print an error message.
     */
    private void goRoom(Command command) 
    {
        if(!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            System.out.println("Go where?");
            return;
        }

        String direction = command.getSecondWord();
        // Try to leave current room.
        Room nextRoom = player.getRoom().getExit(direction);
        

        if (nextRoom == null) {
            System.out.println("There is no door!");
        }
        else {
            player.storeMovement();
            player.playerEnterRoom(nextRoom);
            System.out.println(player.getRoom().getLongDescription());
        }
    }

    /**
     * EXCEPTION OCCURS HERE
     * 8.23
     * takes player to their previous room
     */    
    private void goBack(){
        player.goBack();
    }
    
    /** 
     * "Quit" was entered. Check the rest of the command to see
     * whether we really quit the game.
     * @return true, if this command quits the game, false otherwise.
     */
    private boolean quit(Command command) 
    {
        if(command.hasSecondWord()) {
            System.out.println("Quit what?");
            return false;
        }
        else {
            return true;  // signal that we want to quit
        }
    }
    
    /**
     * 8.33
     * Allows player to drop a specified item
     */
    private void dropItem(Command command){
        if(!command.hasSecondWord()){
            System.out.println("What can I drop?");
        }

        String itemName = command.getSecondWord();
        Item item = player.dropItem(itemName);
        
        if(item == null) {
            System.out.println("You don't have a/an " + itemName);
        } else {
            System.out.println("You dropped a/an " + item.getDescription());
        }
    }
    
    /**
     * 8.33
     * Allows player to drop a specified item
     */
    private void grabItem(Command command){
        if(!command.hasSecondWord()) {
            // if there is no second word, we don't know what to take...
            System.out.println("You want to carry what?");
            return;
        }
        String itemName = command.getSecondWord();
        Item item = player.grabItem(itemName);
        if(item == null) {
            System.out.println("The " + itemName + " item isn't here.");
        } else {
            System.out.println("You grabbed a " + item.getDescription());
        }
    }

    /**
     * Prints out the items that the player is currently carrying.
     */
    private void viewInventory() {
        System.out.println(player.viewInventory());   
    }

      /** 
     * Try to take an item from the current room. If the item is there,
     * pick it up, if not print an error message.
     */
    private void eat(Command command) 
    {
        if(!command.hasSecondWord()) {
            // if there is no second word, we don't know what to eat...
            System.out.println("What did you want to eat?");
            return;
        }
        String itemName = command.getSecondWord();
        Item item = player.eat(itemName);
        if(item == null) {
            System.out.println("YOu can't eat what you don't have");            
        } 
        else {
            System.out.println("You ate the " + item.getDescription());
        }
    }
}
