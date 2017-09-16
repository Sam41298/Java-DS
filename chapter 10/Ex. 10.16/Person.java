
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    // the Person's full name
    private String name;
    // the Person's ID
    private String id;
   

    /**
     * Create a new Person with a given name and ID number.
     */
    public Person(String fullName, String studentID)
    {
        name = fullName;
        id = studentID;
    }

    /**
     * Return the full name of this Person.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Set a new name for this Person.
     */
    public void changeName(String replacementName)
    {
        name = replacementName;
    }

    /**
     * Return the student ID of this student.
     */
    public String getStudentID()
    {
        return id;
    }

    /**
     * Return the login name of this Person. The login name is a combination
     * of the first four characters of the Person's name and the first three
     * characters of the Person's ID number.
     */
    public String getLoginName()
    {
        return name.substring(0,4) + id.substring(0,3);
    }
    
    /**
     * Print the Person's name and ID number to the output terminal.
     */
    public void print()
    {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}
