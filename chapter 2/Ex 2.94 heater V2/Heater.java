
/**
 * The heater can heat or cool the rooms temprature
 */
public class Heater
{
    // instance variables - replace the example below with your own
    private double temprature;
    private double increment;
    private double max;
    private double min;

    /**
     * Please enter a maxium and minimium temprature
     */
    public Heater( double maxTemp, double minTemp)
    {
        temprature = 15.0;
        increment = 5.0;
        max = maxTemp;
        min = minTemp;
    }
    
    //Set a new positive value for the increment
    public void newIncrement( double newIncrement)
    {
        if (newIncrement <= 0 ){
             System.out.println(" The new increment MUST be positive non-zero value. ");
            }
        else {
        increment = newIncrement;
       }
    }
    
    // Raises temprature by the increment
    public void warmer()
    {
        if ( temprature > max || temprature + increment > max) {
             System.out.println(" The Maxium Temprature is " + max);
            }
        else {
        temprature = temprature + increment;
        }
    }
    
    // Lowers the temprature by the increment
    public void cooler()
    {
        if ( temprature < min || temprature - increment < min) {
             System.out.println(" The minimuim Temprature is " + min);
            }
        else {
        temprature = temprature - increment;
        }
    }
    
    public double viewTemp()
    {
        return temprature;
    }
}