import java.util.*;
/**
 *  This class is the main class of the "World of Zuul" application. 
 *  "World of Zuul" is a very simple, text based adventure game.  Users 
 *  can walk around some scenery. That's all. It should really be extended 
 *  to make it more interesting!
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
    private Room currentRoom;
    private Stack<Room> movementHistory;
    
    /**
     * Create the game and initialise its internal map.
     */
    public Game() 
    {
        createRooms();
        parser = new Parser();
        movementHistory = new Stack<>();
    }

    /**
     * Ex 8.8
     * Create all the rooms and link their exits together.
     */
    private void createRooms()
    {
         Room outside, foyer, garage, garden, study, studyDesk, secretRoom;
      
        // create the rooms
        outside = new Room("outside the main entrance of the manor" );
        foyer = new Room("in the foyer");
        garage = new Room("in the garage");
        garden = new Room("in a garden");
        study = new Room("in the study, a desks sits on the far side");
        secretRoom = new Room ("in secret room hidden under the study");
        studyDesk = new Room("at the desk, upon inspection hidden door is revealed");
        
        // adds items to room
         outside.addItem(new Item("torn red cloth", 0 ));
         garage.addItem(new Item("Crow Bar", 10 ));
         garden.addItem( new Item("simple ring", 1 ));
         study.addItem(new Item("stack of Books", 12));
         studyDesk.addItem(new Item("I H8 Monday's mug", 1));
         studyDesk.addItem(new Item("old key", 1));
         secretRoom.addItem(new Item("silver idol", 7));
         
        // initialise room exits
        outside.setExit("east", garden);
        outside.setExit("south", foyer);

        garden.setExit("west", outside);

        foyer.setExit("north", outside);
        foyer.setExit("east", study);
        foyer.setExit("west", garage);
        
        garage.setExit("east", foyer);

        study.setExit("west", foyer);
        study.setExit("east", studyDesk);

        studyDesk.setExit("west", study);
        studyDesk.setExit("down", secretRoom);

        secretRoom.setExit("up", studyDesk);
        
        currentRoom = outside;  // start game outside
    }    

    /**
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
     * Print out the opening message for the player.
     */
    private void printWelcome()
    {
        System.out.println();
        System.out.println("Welcome to the Ivory manor!");
        System.out.println("It is a new, incredibly boring adventure game.");
        System.out.println("Type 'help' if you need help.");
        System.out.println();
        System.out.println(currentRoom.getLongDescription());
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
            look();
        }
        else if (commandWord.equals("eat")) {
            eat();
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
        System.out.println("around the manor.");
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
        Room nextRoom = currentRoom.getExit(direction);
        

        if (nextRoom == null) {
            System.out.println("There is no door!");
        }
        else {
            movementHistory.push(currentRoom);
            currentRoom = nextRoom;
            System.out.println(currentRoom.getLongDescription());
        }
    }

    /**
     * 8.23
     * takes player to their previous room
     */    
    private void goBack(){
        if(movementHistory.isEmpty()){
            System.out.println("You can't go back past the begining.");
        }
        else{
            Room previousRoom = movementHistory.pop();
            currentRoom = previousRoom;
            System.out.println(currentRoom.getLongDescription());
        }
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
     * Ex 8.14
     * Prints room description again.
     */
    private void look(){
        System.out.println(currentRoom.getLongDescription());
    }
    
    /**
     * Ex 8.15
     * Prints room description again.
     */
    private void eat(){
        System.out.println("You eat some food and are no longer hungry");
    }
    
}
