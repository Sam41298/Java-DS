
/**
 * Write a description of class NameGenerator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NameGenerator
{
    // instance variables - replace the example below with your own
    private String fictName;
    private String fictSirName;

    /**
     * genterates star wars name
     */
    public String nameGenerator(String firstName, String lastName,String momMaidenName, String homeCity)
    {
        String fictName = lastName.substring(0,3) + firstName.substring(0,2);
        String fictSirName = momMaidenName.substring(0,2) + homeCity.substring(0,3);
        return fictName + " " + fictSirName;
    }
}
