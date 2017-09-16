
/**
 * Write a description of class TestStuff here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestStuff
{


    /**
     * Constructor for objects of class TestStuff
     */
    public TestStuff()
    {
        
    }
    
    /**
     *  Tests Person p1 = new Student();
     */
    public void testStatement1(){
        Person p1 = new Student();
    }
    
    /**
     *  Tests Person p2 = new PhdStudent();
     */
    public void testStatement2(){
        Person p2 = new PhDStudent();
    }
    
    /**
     *  Tests PhDStudent phd1 = new Student();
     */
    public void testStatement3(){
        PhDStudent phd1 = new Student();
    }
    
    /**
     *  Tests  Teacher t1 = new Person();
     */
    public void testStatement4(){
        Teacher t1 = new Person();
    }
    
    /**
     *  Tests new PhDStudent();
     */
    public void testStatement5(){
        Student s1 = new PhDStudent();
    }
}
