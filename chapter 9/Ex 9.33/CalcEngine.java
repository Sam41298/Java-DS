/**
 * The main part of the calculator doing the calculations.
 * This version incorporates debugging print statements. 
 * @author Hacker T. Largebrain (version 1.0)
 * @version 1.1
 */
public class CalcEngine
{
    // The value in the display.
    private int displayValue;
    // The previous operator typed (+ or -).
    private char previousOperator;
    // The left operand to previousOperator.
    private int leftOperand;

    /**
     * Create a CalcEngine instance.
     */
    public CalcEngine()
    {
        System.out.println("Instance of calc engine created");
        displayValue = 0;
        previousOperator = ' ';
        leftOperand = 0;      
    }

    /**
     * Return the value currently displayed
     * on the calculator.
     */
    public int getDisplayValue()
    {
        System.out.println("getDisplayedNumber() called.");
        return displayValue;
    }

    /**
     * A number button was pressed.
     */
    public void numberPressed(int number)
    {
        displayValue = displayValue * 10 + number;
    }

    /**
     * The '+' button was pressed. 
     */
    public void plus()
    {
        applyPreviousOperator();
        previousOperator = '+';
        displayValue = 0;
    }

    /**
     * The '-' button was pressed.
     */
    public void minus()
    {
        applyPreviousOperator();
        previousOperator = '-';
        displayValue = 0;
    }
    
    /**
     * The '=' button was pressed.
     */
    public void equals()
    {
        if(previousOperator == '+') {
            displayValue = leftOperand + displayValue;
        }
        else {
            displayValue = leftOperand - displayValue;
        }
        leftOperand = 0;
        
        previousOperator = ' ';
    }

    /**
     * The 'C' (clear) button was pressed.
     */
    public void clear()
    {
        displayValue = 0;
        leftOperand = 0;
        previousOperator = ' ';
    }

    /**
     * Return the title of this calculation engine.
     */
    public String getTitle()
    {
        return "Super Calculator";
    }

    /**
     * Return the author of this engine.
     */
    public String getAuthor()
    {
        return "Hacker T. Largebrain";
    }

    /**
     * Return the version number of this engine.
     */
    public String getVersion()
    {
        return "version 0.2";
    }

    /**
     * Print the values of this object's fields.
     * @param where Where this state occurs.
     */
    public void reportState(String where)
    {
        System.out.println("displayValue: " + displayValue +
                           " leftOperand: " + leftOperand +
                           " previousOperator: " + previousOperator + 
                           " at " + where);
    }
    
    /**
     * An operator button has been pressed.
     * Apply the immediately preceding operator to
     * calculate an intermediate result. This will
     * form the left operand of the new operator.
     */
    private void applyPreviousOperator()
    {
        if(previousOperator == '+') {
            leftOperand += displayValue;
        }
        else if(previousOperator == '-') {
            leftOperand -= displayValue;
        }
        else {
            // There was no preceding operator.
            leftOperand = displayValue;
        }
    }
}
