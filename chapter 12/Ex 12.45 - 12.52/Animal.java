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
    // deaks with age
    private int age;
    
    private static final Random rand = Randomizer.getRandom();
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Animal(boolean initialPop, Field field, Location location)
    {
        if(initialPop){
            age = rand.nextInt(getMaxAge());
        }
        else{
            age = 0;
        }
        alive = true;
        this.field = field;
        setLocation(location);
    }
    
    /**
     * gets the animals age
     */
    protected int getAge(){
        return age;
    }
    
    /**
     * 
     */
    protected void changeAge(int age){
        this.age = age;
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
    protected void setLocation(Location newLocation){
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
    
    /**
     * Animal can breed if it is old enough 
     */
    public boolean canBreed(){
       return age >= getBreedingAge(); 
    }
    
    /**
     * return breeding age of this animal
     */
    abstract protected int getBreedingAge();
   
    /**
     * returns max age of animal
     */
    abstract protected int getMaxAge();
    
     /**
      * Increase age of animal until reach a certian age.
      */ 
     protected void incrementAge(){
           age++;
           if(age > getMaxAge()){
               setDead();
            }
        }
        
     /**
      * return breeding probability
      */    
     abstract protected double getBreedingProbability();
     
     /**
      * return max litter size
      */
     abstract int getMaxLitterSize();
     
     /**
     * Generate a number representing the number of births,
     * if it can breed.
     * @return The number of births (may be zero).
     */
    protected int breed()
    {
        int births = 0;
        if(canBreed() && rand.nextDouble() <= getBreedingProbability()) {
            births = rand.nextInt(getMaxLitterSize()) + 1;
        }
        return births;
    }
    
    /**
     * Creates a new animal
     */
    abstract protected Animal newAnimal(boolean initialPop, Field field, Location location); 
    
    /**
     * Check whether or not this fox is to give birth at this step.
     * New births will be made into free adjacent locations.
     * @param newFoxes A list to return newly born foxes.
     */
    protected void giveBirth(List<Animal> newAnimal)
    {
        // New foxes are born into adjacent locations.
        // Get a list of adjacent free locations.
        Field field = getField();
        List<Location> free = field.getFreeAdjacentLocations(getLocation());
        int births = breed();
        for(int b = 0; b < births && free.size() > 0; b++) {
            Location loc = free.remove(0);
            newAnimal.add(newAnimal(false, field, location));
        }
    }
        
}
