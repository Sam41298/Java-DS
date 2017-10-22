import java.util.*;
/**
 * Write a description of class Cougar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cougar extends Animal
{
    
    // The age at which a cougar can start to breed.
    private static final int BREEDING_AGE = 20;
    // The age to which a cougar can live.
    private static final int MAX_AGE = 400; //150;
    // The likelihood of a fox breeding.
    private static final double BREEDING_PROBABILITY = 0.035;
    // The maximum number of births.
    private static final int MAX_LITTER_SIZE = 2;
    // The food value of a single Fox. In effect, this is the
    // number of steps a fox can go before it has to eat again.
    private static final int FOX_FOOD_VALUE = 25;
    private static final int RABBIT_FOOD_VALUE = 5;
    // A shared random number generator to control breeding.
    private static final Random rand = Randomizer.getRandom();
    
    // The cougar's food level, which is increased by eating rabbits.
    private int foodLevel;

    /**
     * Create a cougar. A cougar can be created as a new born (age zero
     * and not hungry) or with a random age and food level.
     * 
     * @param randomAge If true, the Cougar will have random age and hunger level.
     * @param field The field currently occupied.
     * @param location The location within the field.
     */
    public Cougar(boolean initialPop, Field field, Location location)
    {
       super(initialPop, field, location);
        
        if(initialPop) {
            changeAge(rand.nextInt(MAX_AGE));
            foodLevel = rand.nextInt(FOX_FOOD_VALUE);
        }
        else {
            foodLevel = rand.nextInt(FOX_FOOD_VALUE);
        }
    }
    
    /**
     * This is what the Cougar does most of the time: it hunts for
     * foxes. In the process, it might breed, die of hunger,
     * or die of old age.
     * @param field The field currently occupied.
     * @param newFoxes A list to return newly born cougars.
     */
    public void act(List<Animal> newCougars){
        incrementAge();
        incrementHunger();
        if(isAlive()) {
            giveBirth(newCougars);            
            // Move towards a source of food if found.
            Location newLocation = findFood();
            if(newLocation == null) { 
                // No food found - try to move to a free location.
                newLocation = getField().freeAdjacentLocation(getLocation());
            }
            // See if it was possible to move.
            if(newLocation != null) {
                setLocation(newLocation);
            }
            else {
                // Overcrowding.
                setDead();
            }
        }
    }
    
    /**
     * Gets cougars max age
     */
    protected int getMaxAge(){
        return MAX_AGE;
    }
    
    /**
     * Make this cougars more hungry. deaThis could result in the cougar's death.
     */
    private void incrementHunger()
    {
        foodLevel--;
        if(foodLevel <= 0) {
            setDead();
        }
    }
    
    /**
     * Look for foxes adjacent to the current location.
     * Only the first live foxes is eaten.
     * @return Where food was found, or null if it wasn't.
     */
    private Location findFood()
    {
        Field field = getField();
        List<Location> adjacent = field.adjacentLocations(getLocation());
        Iterator<Location> it = adjacent.iterator();
        while(it.hasNext()) {
            Location where = it.next();
            Object animal = field.getObjectAt(where);
            if(animal instanceof Fox) {
                Fox fox = (Fox) animal;
                if(fox.isAlive()) { 
                    fox.setDead();
                    foodLevel = FOX_FOOD_VALUE;
                    return where;
                }
            }
            
            if(animal instanceof Rabbit) {
                Rabbit rabbit = (Rabbit) animal;
                if(rabbit.isAlive()) { 
                    rabbit.setDead();
                    foodLevel = RABBIT_FOOD_VALUE;
                    return where;
                }
            }
        }
        return null;
    }
    
    /**
     * Creates new fox
     */
    protected Animal newAnimal(boolean initialPop, Field field, Location location){
        return new Cougar(initialPop, field, location);
    }
       
        
    /**
     * returns breeding probability
     */
    protected double getBreedingProbability(){
        return BREEDING_PROBABILITY;
    }
    
    /**
     * returns the cougars breeding age
     */
    protected int getBreedingAge()
    {
        return BREEDING_AGE;
    }

    /**
     * returns the cougars breeding age
     */
    protected int getMaxLitterSize()
    {
        return MAX_LITTER_SIZE;
    }
}
