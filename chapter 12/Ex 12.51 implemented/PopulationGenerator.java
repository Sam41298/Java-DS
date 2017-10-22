import java.util.*;
import java.awt.Color;
/**
 * built by cutting and pasting sections of Simulator that dealt 
 * with population generation
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PopulationGenerator
{
    // The probability that a fox will be created in any given grid position.
    private static final double FOX_CREATION_PROBABILITY = 0.06;
    // The probability that a rabbit will be created in any given position.
    private static final double RABBIT_CREATION_PROBABILITY = 0.09;    
    // The probability that a Cougars will be created in any given grid position.
    private static final double COUGAR_CREATION_PROBABILITY = 0.01;
    
    /**
     * Constructor for objects of class PopulationGenerator
     */
    public PopulationGenerator(SimulatorView view)
    {
        view.setColor(Rabbit.class, Color.orange);
        view.setColor(Fox.class, Color.blue);
        view.setColor(Cougar.class, Color.red);
    }

    /**
     * Randomly populate the field with foxes and rabbits and cougar.
     */
    public void populate(Field field, List<Animal>animals)
    {
        Random rand = Randomizer.getRandom();
        for(int row = 0; row < field.getDepth(); row++) {
            for(int col = 0; col < field.getWidth(); col++) {
                if(rand.nextDouble() <= FOX_CREATION_PROBABILITY) {
                    Location location = new Location(row, col);
                    Fox fox = new Fox(true, field, location);
                    animals.add(fox);
                }
                else if(rand.nextDouble() <= RABBIT_CREATION_PROBABILITY) {
                    Location location = new Location(row, col);
                    Rabbit rabbit = new Rabbit(true, field, location);
                    animals.add(rabbit);
                }
                else if(rand.nextDouble() <= COUGAR_CREATION_PROBABILITY) {
                    Location location = new Location(row, col);
                    Cougar cougar = new Cougar(true, field, location);
                    animals.add(cougar);
                }
                // else leave the location empty.
            }
        }
    }
}
