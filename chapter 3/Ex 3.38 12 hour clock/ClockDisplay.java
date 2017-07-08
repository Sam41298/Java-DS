
/**
 * The ClockDisplay class implements a digital clock display for a
 * 12 hour clock. The clock shows hours and minutes.
 * 
 * The clock display receives "ticks" (via the timeTick method) every minute
 * and reacts by incrementing the display. This is done in the usual clock
 * fashion: the hour increments when the minutes roll over to zero.
 * 
 * @author Jacob Knott
 */
public class ClockDisplay
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;    // simulates the actual display
    
    /**
     * Constructor for ClockDisplay objects. This constructor 
     * creates a new clock set at 00:00.
     */
    public ClockDisplay()
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        updateDisplay();
    }

    /**
     * Constructor for ClockDisplay objects. This constructor
     * creates a new clock set at the time specified by the 
     * parameters.
     */
    public ClockDisplay(int hour, int minute)
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        setTime(hour, minute);
    }

    /**
     * This method should get called once every minute - it makes
     * the clock display go one minute forward.
     */
    public void timeTick()
    {
        minutes.increment();
        if(minutes.getValue() == 0) {  // it just rolled over!
            hours.increment();
        }
        updateDisplay();
    }

    /**
     * Set the time of the display to the specified hour and
     * minute.
     */
    public void setTime(int hour, int minute)
    {
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay();
    }

    /**
     * Return the current time of this display in the format HH:MM.
     */
    public String getTime()
    {
        return displayString;
    }
    
    /**
     * Update the internal string that represents the display.
     * 
     * This section of code is where we will changesto create our twelve hour clock. 
     * 
     * An if else test will be used to determine if it is AM or PM
     * 
     * to go from the 24 hour clock to a 12 we will simply use an if else statement
     * to cheat numbers over 12 to what they should be (we subtract 12 if value > 12)
     * 
     * the final change is to add an if statement to counter the modulo within the
     * increment method as without it we will get 00 whenever the hour is 12
     */
    private void updateDisplay()
    {
        int hour = hours.getValue();
        String AmPm;
        
        if( hour >= 12) {
            AmPm= "PM";
        }
        else {
            AmPm= "AM";
        }

        if (hour >= 12) {
            hour -= 12;
        }

         if (hour == 00) {
            hour = 12;
        }
        
        displayString = hour + ":" + minutes.getDisplayValue() + AmPm;
    }
}
