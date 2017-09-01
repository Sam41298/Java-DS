

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CalcEngineTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CalcEngineTest
{
    /**
     * Default constructor for test class CalcEngineTest
     */
    public CalcEngineTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testAdd()
    {
        CalcEngine calcEngi1 = new CalcEngine();
        calcEngi1.numberPressed(3);
        calcEngi1.plus();
        calcEngi1.numberPressed(2);
        calcEngi1.equals();
        assertEquals(5, calcEngi1.getDisplayValue());
    }

    @Test
    public void testMinus()
    {
        CalcEngine calcEngi1 = new CalcEngine();
        calcEngi1.numberPressed(10);
        calcEngi1.minus();
        calcEngi1.numberPressed(3);
        calcEngi1.equals();
        assertEquals(7, calcEngi1.getDisplayValue());
    }

    @Test
    public void testNegativeValue()
    {
        CalcEngine calcEngi1 = new CalcEngine();
        calcEngi1.numberPressed(1);
        calcEngi1.minus();
        calcEngi1.numberPressed(4);
        calcEngi1.equals();
        assertEquals(-3, calcEngi1.getDisplayValue());
    }

    @Test
    public void TestAddToNegative()
    {
        CalcEngine calcEngi1 = new CalcEngine();
        calcEngi1.numberPressed(1);
        calcEngi1.minus();
        calcEngi1.numberPressed(10);
        calcEngi1.equals();
        calcEngi1.plus();
        calcEngi1.numberPressed(3);
        calcEngi1.equals();
        assertEquals(-6, calcEngi1.getDisplayValue());
    }

    @Test
    public void testClear()
    {
        CalcEngine calcEngi1 = new CalcEngine();
        calcEngi1.numberPressed(3);
        calcEngi1.plus();
        calcEngi1.numberPressed(2);
        calcEngi1.equals();
        assertEquals(5, calcEngi1.getDisplayValue());
        calcEngi1.clear();
        assertEquals(0, calcEngi1.getDisplayValue());
    }
}





