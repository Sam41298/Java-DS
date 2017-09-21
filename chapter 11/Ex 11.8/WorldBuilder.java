import java.util.*;
/**
 * Write a description of class RoomSelector here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WorldBuilder
{
    private Random rand = new Random();
    private Room mapEntry;
    private ArrayList<Room> rooms = new ArrayList();
    /**
     * Constructor for objects of class RoomSelector
     */
    public WorldBuilder()
    {
        
        //code copied from game class so all rooms accounted for. 
        Room outside, foyer, garage, garden, study, studyDesk, secretRoom, teleporter;
      
        // create the rooms
        outside = new Room("outside the main entrance of the manor" );
        foyer = new Room("in the foyer");
        garage = new Room("in the garage");
        garden = new Room("in a garden");
        study = new Room("in the study, a desks sits on the far side");
        secretRoom = new Room ("in secret room hidden under the study");
        studyDesk = new Room("at the desk, upon inspection hidden door is revealed");
        teleporter = new TransporterRoom ("on a strange platform, surrounded by darkness. /n which way do you step off?", this);
        
        // adds items to room
         outside.addItem(new Item("RedCloth","A torn piece of red cloth", 0 ));
         garage.addItem(new Item("CrowBar", "A heavy steel crow bar", 10 ));
         garden.addItem( new Item("simpleRing"," A simple band found in the garden, was it lost...\n or perhaps left on purpose", 1 ));
         study.addItem(new Item("stackOfBooks"," A heavy stack of books of no paticular use.", 80));
         studyDesk.addItem(new Item("CoffeeMug","An I H8 Mondays coffee mug", 2));
         studyDesk.addItem(new Item("oldKey","A tarnished metal key to who knows what.", 1));secretRoom.addItem(new Item("buffout", "A substance that when consumed makes you stronger", 1));
         
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
        secretRoom.setExit("east", teleporter);
        
        teleporter.setExit("west", secretRoom);
        
        mapEntry = outside;
        
        
        rooms.add(outside);
        rooms.add(foyer);
        rooms.add(garage);
        rooms.add(garden);
        rooms.add(study);
        rooms.add(secretRoom);
        rooms.add(studyDesk);
 
        mapEntry = outside;
    }

    /**
     * Returns one of the rooms in the game (but not the transporter room)
     */
    public Room randomRoom(){
        return rooms.get(rand.nextInt(rooms.size()));
    }

    /**
     * starts player oustide
     */
    public Room enterMap(){
        return rooms.get(0);
    }
}
