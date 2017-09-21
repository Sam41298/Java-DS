import java.util.*;
/**
 * Write a description of class TransporterRoom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TransporterRoom extends Room{
    private WorldBuilder map;

    /**
     * Constructor for objects of class TransporterRoom
     */
    public TransporterRoom(String description, WorldBuilder map)
    {
        super(description);
        this.map = map;
    }

    /**
     * Returns the random room when play tries to leave the teleporter
     */
    public Room getExit(String goWhere){
        return map.randomRoom();
    }
}
