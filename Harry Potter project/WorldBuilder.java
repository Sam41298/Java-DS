import java.util.*;
/**
 * The world builder class builds the map and populates it with characters and items
 * 
 * Probably should make this thing into many methods all called by the constructor
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WorldBuilder
{
    // instance variables - replace the example below with your own
    private List<Room> rooms;
    private Room randRoom;
    private Room startPoint;
    private Random rand;
    private List<Character> characters;
    private List<Item> inGameItems;
    /**
     * Constructor for objects of class WorldBuilder
     */
    public WorldBuilder()
    {
        Room Great_Hall, The_Quad, West_Stairwell,
        Hufflepuff_Common_room, Gryffindor_Common_room,
        East_Stairwell, Chamber_of_Secrets_Entrance, RavenClaw_Common_room,
        Slytherin_Commmon_room, Headmasters_Tower, Dumbledores_Study,
        Fountain_Courtyard, Southwest_Fountain_Courtyard, Southeast_Fountain_Courtyard,
        Potions_room, Defense_Against_the_Dark_Arts_room, Wand_Wizadry_room, Divinations_room,
        Library, Gazebo, Green_Houses, Merlins_Gate, Hagrids_Cottage, 
        Broomstick_and_Quiditch_Practice_Field, Boat_House;
        
        Great_Hall = new Room("in the great hall, colors and flags of all houses decorate the walls");
        Boat_House = new Room("inside the boat house, boats and ores are stowed neatly.");
        The_Quad = new Room("in the paved court yard, this is the home to the talking Gargoyle and \n Slytherin's dueling club");
        West_Stairwell = new Room("in a stairwell with pictures lining the walls");
        Hufflepuff_Common_room = new Room("in Hufflepuff's common room");
        Gryffindor_Common_room = new Room("in Gryffindor's common room");
        East_Stairwell = new Room("in a stairwell dimly lit, many of the canddles along the wall are burnt out");
        Chamber_of_Secrets_Entrance = new Room("outside the serpent door to the chamber of secrets");
        RavenClaw_Common_room = new Room("in Ravenclaw's common room");
        Slytherin_Commmon_room = new Room("in Slytherin's common room");
        Headmasters_Tower = new Room("at the base of the headmasters tower");
        Dumbledores_Study = new Room("in Dumbledore's study");
        Fountain_Courtyard = new Room("in the fountain courtyard");
        Southwest_Fountain_Courtyard = new Room("in the southwest section of the fountain courtyard");
        Southeast_Fountain_Courtyard = new Room("in the southeast section of the fountain courtyard");
        Potions_room = new Room("in the potions classroom");
        Defense_Against_the_Dark_Arts_room = new Room("in the defense of the dark arts room");
        Wand_Wizadry_room = new Room("inside the wand wizadry room");
        Divinations_room = new Room("in the divinations classroom");
        Library = new Room("inside the hogwards library, you are overwhelmed b th shear number of books you see");
        Gazebo = new Room("in the gazebo near the green houses");
        Green_Houses = new Room("in the hogwarts green houses, you shudder as you recall the shriek of the mandrake");
        Merlins_Gate = new Room("on the path to hogsmead or Hagrid's cottage");
        Hagrids_Cottage = new Room("in hagrid's cottage, it is cozy and warm");
        Broomstick_and_Quiditch_Practice_Field = new Room("in the open area where firstyears learn to ride broomsticks \n and quiditch tams can practice");
        
        // sets up exits
        Great_Hall.setExit("north", The_Quad);
        Great_Hall.setExit("east", Southwest_Fountain_Courtyard);
               
        The_Quad.setExit("down", Boat_House);
        The_Quad.setExit("northwest", West_Stairwell);
        The_Quad.setExit("northeast", East_Stairwell);
        The_Quad.setExit("east", Headmasters_Tower);
         
        Boat_House.setExit("up", The_Quad);
         
        West_Stairwell.setExit("west", Hufflepuff_Common_room);
        West_Stairwell.setExit("northwest", The_Quad);
        West_Stairwell.setExit("up", Gryffindor_Common_room);
         
        Hufflepuff_Common_room.setExit("east", West_Stairwell);
        
        Gryffindor_Common_room.setExit("down", West_Stairwell);
        
        East_Stairwell.setExit("south", The_Quad);
        East_Stairwell.setExit("up", RavenClaw_Common_room);
        East_Stairwell.setExit("down", Slytherin_Commmon_room);
        
        RavenClaw_Common_room.setExit("down", East_Stairwell);
        
        Slytherin_Commmon_room.setExit("up", East_Stairwell);
        Slytherin_Commmon_room.setExit("down", Chamber_of_Secrets_Entrance);
        
        Chamber_of_Secrets_Entrance.setExit("up", Slytherin_Commmon_room);
        
        Headmasters_Tower.setExit("west", The_Quad);
        Headmasters_Tower.setExit("east", Fountain_Courtyard);
        Headmasters_Tower.setExit("up", Dumbledores_Study);
        
        Dumbledores_Study.setExit("down", Headmasters_Tower);
        
        Fountain_Courtyard.setExit("north", Broomstick_and_Quiditch_Practice_Field);
        Fountain_Courtyard.setExit("southwest", Southwest_Fountain_Courtyard);
        Fountain_Courtyard.setExit("southeast",  Southeast_Fountain_Courtyard);
        Fountain_Courtyard.setExit("east", Gazebo);
        Fountain_Courtyard.setExit("west", Headmasters_Tower);
        
        Southwest_Fountain_Courtyard.setExit("north", Fountain_Courtyard);
        Southwest_Fountain_Courtyard.setExit("east", Southeast_Fountain_Courtyard);
        Southwest_Fountain_Courtyard.setExit("west", Great_Hall);
        Southwest_Fountain_Courtyard.setExit("southwest", Potions_room);
        Southwest_Fountain_Courtyard.setExit("southeast", Defense_Against_the_Dark_Arts_room);
        
        Potions_room.setExit("north", Southwest_Fountain_Courtyard);
        
         Defense_Against_the_Dark_Arts_room.setExit("north", Southwest_Fountain_Courtyard);
        
        Southeast_Fountain_Courtyard.setExit("north", Fountain_Courtyard);
        Southeast_Fountain_Courtyard.setExit("west", Southwest_Fountain_Courtyard);
        Southeast_Fountain_Courtyard.setExit("east", Library);
        Southeast_Fountain_Courtyard.setExit("southwest", Wand_Wizadry_room);
        Southeast_Fountain_Courtyard.setExit("southeast", Divinations_room);
        
        Library.setExit("west", Southeast_Fountain_Courtyard);
        
        Wand_Wizadry_room.setExit("north", Southeast_Fountain_Courtyard);
        
        Divinations_room.setExit("north", Southeast_Fountain_Courtyard);
        
        Gazebo.setExit("west", Fountain_Courtyard);
        Gazebo.setExit("north", Merlins_Gate);
        Gazebo.setExit("south", Green_Houses);
        
        Green_Houses.setExit("north", Gazebo);
        
        Merlins_Gate.setExit("east", Hagrids_Cottage);
        Merlins_Gate.setExit("north", Broomstick_and_Quiditch_Practice_Field);
        Merlins_Gate.setExit("south", Gazebo);
        
        Hagrids_Cottage.setExit("west", Merlins_Gate);
        
        Broomstick_and_Quiditch_Practice_Field.setExit("southwest", Headmasters_Tower);
        Broomstick_and_Quiditch_Practice_Field.setExit("southeast", Merlins_Gate);
        
        //Player starting location
        startPoint = Great_Hall;
        
        //List of all rooms
        rooms = new ArrayList<>();
        rooms.add(Great_Hall);
        rooms.add(The_Quad);
        rooms.add(Boat_House);
        rooms.add(West_Stairwell);
        rooms.add(Hufflepuff_Common_room);
        rooms.add(Gryffindor_Common_room);
        rooms.add(East_Stairwell);
        rooms.add(RavenClaw_Common_room);
        rooms.add(Slytherin_Commmon_room);
        rooms.add(Chamber_of_Secrets_Entrance);
        rooms.add(Headmasters_Tower);
        rooms.add(Dumbledores_Study);
        rooms.add(Fountain_Courtyard);
        rooms.add(Southwest_Fountain_Courtyard);
        rooms.add(Southeast_Fountain_Courtyard);
        rooms.add(Potions_room);
        rooms.add(Defense_Against_the_Dark_Arts_room);
        rooms.add(Library);
        rooms.add(Gazebo);
        rooms.add(Green_Houses);
        rooms.add(Merlins_Gate);
        rooms.add(Hagrids_Cottage);
        rooms.add(Broomstick_and_Quiditch_Practice_Field);
        
        rand = new Random();
        
        inGameItems = new ArrayList();
        createInGameItems();
        placeItems();
        
        characters = new ArrayList();
        //createCharacters(); STACKOVER FLOW ERROR OCCURS HERE
        //spawnCharacters();
        
        //character = new Character("Snape");
    }
    
    
    /**
     * gives the location the player starts the game in.
     */
    public Room getStartPoint(){
        return startPoint;
    }
    
    /**
     * return a randomly selected room
     */
    public Room getRandRoom(){
        randRoom = rooms.get(rand.nextInt(rooms.size()));
        return randRoom;
    }
    
    /**
     * Creates items that are in the game and puts them into a single list
     */
    public void createInGameItems(){
         inGameItems.add(new Item("RedCloth", "a shreaded piece of red fabric",0));
         inGameItems.add(new Item("wand", "a wizards wand",3));
         inGameItems.add(new Item("First year robes", "the black robes all first year students wear before sorting.",5));
         inGameItems.add(new Item("Ravenclaw robes", "the robes worn by members of house Ravenclaw.",5));
         inGameItems.add(new Item("Slytherin robes", "the robes worn by members of house Slytherin.",5));
         inGameItems.add(new Item("Gryffindor robes", "the robes worn by members of house Gryffindor.",5));
         inGameItems.add(new Item("Hufflepuff robes", "the robes worn by members of house Hufflepuff.",5));
         inGameItems.add(new Item("Godric Gryffindor's Sword", "a goblin-made sword adorned with large rubies on the pommel",12));
         inGameItems.add(new Item("Time-Turner", "a small device used to turn back time",1));
         inGameItems.add(new Item("Firebolt", "the worlds  fastest broomstick",15));
         inGameItems.add(new Item("Weasley's Wild-fire Whiz-Bang", "a  enchanted fireworks that have overly spectacular and remarkable effects",10));
         inGameItems.add(new Item("Quaffle", "a ball used to score in Quidditch",6));
         inGameItems.add(new Item("StrengthPotion", "a potion that augments the drinkers strength",3));
         inGameItems.add(new Item("LeatherBoundDiary", "a blank diary with a puncture through many pages and black ink spattered across others ",4));
         inGameItems.add(new Item("Defensive Magical Theory", "a book by Wilbert Slinkhard",5));
         inGameItems.add(new Item("Cauldron", "a heavy black iron cauldron used for brewing potions",20));
    }
    
    /**
     * get random item from in game items
     */
    public Item getRandItem(){
        return inGameItems.get(rand.nextInt(inGameItems.size()));
    }
    
    /**
     * places items in rooms
     */
    public void placeItems(){
        for(int i = 0; i < rooms.size()+1; i++){
            getRandRoom().addItem(getRandItem());
        }
    }
    
    /**
     * creates characters
     */
    public void createCharacters(){
        characters.add(new Character("Severus Snape"));
        characters.add(new Character("Nearly Headless Nick"));
        characters.add(new Character("Sybill Trelawney "));
        characters.add(new Character("Draco Malfoy"));
        characters.add(new Character("Ginny Weasley"));
        characters.add(new Character("Luna Lovegood"));
        characters.add(new Character("Rubeus Hagrid"));
        characters.add(new Character("Albus Dumbledore "));
    }
    
    /**
     * spawns characters
     */
    public void spawnCharacters(){
        for(int i =0; i <characters.size(); i++){
            characters.get(i).getRoom();
        }
    }
}