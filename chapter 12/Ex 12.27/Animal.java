import java.util.*;
/**
 * Abstract class Animal - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Animal
{
    // Whether the Animal is alive or not.
    private boolean alive;
    // The Animal's position.
    private Location location;
    // The field occupied.
    private Field field;

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Animal(Location location, Field field)
    {
        alive = true;
        setLocation(location);
        this.field = field;
    }
    
     /**
      * Sees if animal is alive
      */
    protected boolean isAlive(){
        return alive;
    }
    
    /**
     * Return the Animal's location.
     * @return The Animal's location.
     */
    protected Location getLocation()
    {
        return location;
    }
    
    /**
     * Returns the animals field
     */
    protected Field getField(){
        return field;
    }
    
    /**
     * sets tje Animal's location
     */
        protected void setLocation(Location newLocation)
        {
            if(location != null) {
                field.clear(location);
            }
            location = newLocation;
            field.place(this, newLocation);
        }
    
    /**
     * Indicate that the Animal is no longer alive.
     * It is removed from the field.
     */
    protected void setDead()
    {
        alive = false;
        if(location != null) {
            field.clear(location);
            location = null;
            field = null;
        }
    }
    
    /**
     * Causes animal to behave as inteded
     */
    abstract public void act(List<Animal> newAnimals);
}
