import java.util.ArrayList;
import java.util.Iterator;

/**
 * Monitor counts of different types of animal.
 * Sightings are recorded by spotters.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29 (imperative)
 */
public class AnimalMonitor 
{
    // Records of all the sightings of animals.
    private ArrayList<Sighting> sightings;
    
    /**
     * Create an AnimalMonitor.
     */
    public AnimalMonitor()
    {
        this.sightings = new ArrayList<>();
    }
    
    /**
     * Add the sightings recorded in the given filename to the current list.
     * @param filename A CSV file of Sighting records.
     */
    public void addSightings(String filename)
    {// Works with pre made files but cannot "cannot read" sightings I create and add.
        SightingReader reader = new SightingReader();
        sightings.addAll(reader.getSightings(filename));
    }
    
    /**
     * Ex. 5.5
     * Print details of all the sightings.
     */
    public void printList()
    {
        sightings.forEach(
            (Sighting record) -> 
            {
              System.out.println(record.getDetails());
            }
        );
    }
    
    /**
     * Ex. 5.10
     * Print the details of all the sightings of the given animal.
     * @param animal The type of animal.
     */
    public void printSightingsOf(String animal)
    {
        sightings.stream()
        .filter(sighting -> animal.equals(sighting.getAnimal()))
        .forEach(sighting->
        System.out.println(sighting.getDetails()));//What is S? 
    } 
    
    /**
     * Ex 5.14
     * Print all the sightings by the given spotter.
     * @param spotter The ID of the spotter.
     */
    public void printSightingsBy(int spotter)
    {
        sightings.stream()
        .filter(sighting -> sighting.getSpotter() == spotter)
        .map(sighting -> sighting.getDetails())
        .forEach(details -> System.out.println(details));
    }

    /**
     * Ex 5.18
     * Print all the sightings by the given spotter.
     * @param spotter The ID of the spotter.
     */
    public void printSightingsByV2(int spotter)
    {
        sightings.stream()
        .filter(sighting -> sighting.getSpotter() == spotter)
        .map(sighting -> sighting.getDetails())
        .forEach(System.out::println);
    }

    /**
     * Ex 5.15
     * Print all the sightings by the given spotter.
     * Using mao as part of a pipeline.
     * @param spotter The ID of the spotter.
     */
    public void printSightingsOfV2(String animal)
    {
        sightings.stream().filter(sighting ->
        sighting.getAnimal() == animal)
        .map(sighting -> sighting.getDetails())
        .forEach(details -> System.out.println(details));
    }

    /**
     * Ex. 5.11
     * Print all the sightings on a certian day
     * @param spotter The ID of the spotter.
     */
    public void printSightingsOn(int dayID)
    {
        for(Sighting record : sightings) {
            if(record.getPeriod() == dayID) {
                System.out.println(record.getDetails());
            }
        }        
    }

    /**
     * Ex. 5.12
     * This method prints all sighitns of an animal on a given day.
     * Please enter animal name and the desired day.
     */
    public void printSightingsOfOn( String animal, int day){
        sightings.stream()
        .filter(sighting ->
        animal.equals(sighting.getAnimal()))
        .filter(sighting -> sighting.getPeriod()== day)
        .forEach(sighting ->
        System.out.println(sighting.getDetails()));
    }

    /**
     * Ex. 5.17
     * Print a list of the types of animal considered to be endangered.
     * @param animalNames A list of animals names.
     * @param dangerThreshold Counts less-than or equal-to to this level
     *                        are considered to be dangerous.
     */
    public void printEndangered(ArrayList<String> animalNames, 
                                int dangerThreshold)
    {
        animalNames.stream()
        .filter(animal -> getCount(animal) <= dangerThreshold)
        .forEach(animal -> System.out.println(getCount(animal)+ animal +"is endangered!"));
    }
    
    /**
     * Ex 5.19
     * Return a count of the number of sigh tings of the given animal.
     * @param animal The type of animal.
     * @return The count of sightings of the given animal.
     */
    public int getCount(String animal)
    {
        return sightings.stream()
        .filter(sighting -> animal.equals(sighting.getAnimal()))
        .map(sighting->sighting.getCount())
        //.reduce(0,(total,count)-> return total + count);// no clue why this isn't working
        .reduce(0,(total,count)-> total + count);
    }
    
    /**
     * Ex. 5.22
     * Remove from the sightings list all of those records with
     * a count of zero.
     */
    public void removeZeroCounts()
    {
        sightings.removeIf(sighting -> sighting.getCount() == 0);
    }
    
    /**
     * Return a list of all sightings of the given type of animal
     * in a particular area.
     * @param animal The type of animal.
     * @param area The ID of the area.
     * @return A list of sightings.
     */
    public ArrayList<Sighting> getSightingsInArea(String animal, int area)
    {
        ArrayList<Sighting> records = new ArrayList<>();
        for(Sighting record : sightings) {
            if(animal.equals(record.getAnimal())) {
                if(record.getArea() == area) {
                    records.add(record);
                }
            }
        }
        return records;
    }
    
    /**
     * Return a list of all the sightings of the given animal.
     * @param animal The type of animal.
     * @return A list of all sightings of the given animal.
     */
    public ArrayList<Sighting> getSightingsOf(String animal)
    {
        ArrayList<Sighting> filtered = new ArrayList<>();
        for(Sighting record : sightings) {
            if(animal.equals(record.getAnimal())) {
                filtered.add(record);
            }
        }
        return filtered;
    }
    
    /**
     * Ex 5.20
     * this method takes three parameters: animal, spotterID, and day,
     * and returns a count of how many sightings of the given animal 
     * were made by the spotter on a particular day.
     */
    public int getSpecificCount(String animal, int spotterID, int day){
        return( 
        sightings.stream()
        .filter(sighting -> animal.equals(sighting.getAnimal()))
        .filter(sighting -> spotterID.equals(sighting.getSpotterID()))//WTF
        .filter(sighting -> day.equals(sighting.getPeriod()))//WTF
        .map(sighting -> sighting.getCount())
        .reduce(0,(total, count) -> total + count));//did this fix the issue as in 5.22
    }
    
    /**
     * Ex. 5.21
     * This method takes two parameters, spotterID and day
     * then returns a string containing the names of the animals seen by the 
     * spotter on a particular day.
     */
    public void nameOfAnimalsSighted(int spotterID, int day){
        int count;
        for(Sighting record : sightings){
            count = record.getCount();
            if(count > 0){
                System.out.println(record.getAnimal());
            }
        }
    }
    
    /**
     * Ex. 5.23
     * This method removes all records by a given spotter.
     */
    public void removeSpotter( int spotterID) {
        Iterator<Sighting>iterator=sightings.iterator();
        while(iterator.hasNext()){
            Sighting record = iterator.next();
            if(record.getSpotter() == spotterID){
                iterator.remove();
            }
        }
    }
    
    /**
     * Ex. 5.26
     * This method that takes an animal name as a parameter and
     * returns the largest count for that animal in a single Sighting record.
     */
    public long getMax(String animal){
        return(
        (sightings.stream()
        .filter(sighting -> animal.equals(sighting.getAnimal()))
        .count()).max());//???????????????
    }
    
    /**
     * Ex.5.27
     * This method that takes an animal name and spotterID then
     * returns the first  Sighting object stored in the sightings collection 
     * for that combination.
     */
     Sighting useFindFirst(String animal, int spotterID){
        return(
        sightings.stream()
        .filter(animal.equals(sighting.getAnimal()))
        .filter(sighting -> sighting.getSpotter()== spotterID).findFirst());
    }
}
