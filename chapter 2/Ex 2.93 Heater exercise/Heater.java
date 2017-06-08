
/**
 * Write a description of class Heater here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Heater
{
    // instance variables - replace the example below with your own
    private double temprature;

    /**
     * Constructor for objects of class Heater
     */
    public Heater()
    {
        temprature = 15.0;
    }
    
    public void warmer()
    {
        temprature = temprature + 5;
    }
    
    public void cooler()
    {
        temprature = temprature - 5;
    }
    
    public double viewTemp()
    {
        return temprature;
    }
}