import java.util.*;
/**
 * Write a description of class RandomTester here.
 *
 * @author (Jacob Knott)
 * @version (1 - 8/4/2017)
 */
public class RandomTester
{
    // instance variables - replace the example below with your own
    private Random random;

    /**
     * Constructor for objects of class RandomTester
     */
    public RandomTester()
    {
        random = new Random();
    }

    /**
     * Ex 6.15
     * Prints one random number
     */
    public void printOneRandom()
    { // It would generate and keep the same random. The nextInt method fixes this issue.
        System.out.println(random.nextInt());
    }
    
    /**
     * Ex 6.15
     * Prints mutliple random numbers
     */
    public void printMultiRandom(int howMany)
    {
        for(int x = 0; x < howMany; x++){
            printOneRandom();
        }
    }
    
    /**
     * Ex 6.16
     * Generates a random number between 1 and 6
     * 
     * @returns random number
     */
    public int roleDie(){
        return random.nextInt(6)+ 1;
    }
    
    /**
     * Ex 6.17
     * "Randomly" selects a response
     */
    public String getResponse(){
        Random random = new Random();
        int randomString = random.nextInt(3);
        if(randomString == 0){
            return "yes";
        }
        else if(randomString == 1){
            return "no";
        }
        else{
            return "maybe";
        }
    }


    /**
     * Ex 6.18
     * "Randomly" selects a response
     */
    public String getResponseV2(){
        Random random = new Random();
        int randomInt = random.nextInt(3);
        ArrayList response = new ArrayList();
        
        if(randomInt == 0){
            response.add("yes");
            return "yes";
        }
        else if(randomInt == 1){
            response.add("no");
            return "no";
        }
        else{
            response.add("maybe");
            return "maybe";
        }
    }
    
    /**
     * Ex 6.19
     * Generates a random number between 1 and max
     * 
     * @returns random.nextInt(max)+1
     */
    public int randomInclusiveBound(int max){
        return random.nextInt(max)+ 1;
    }    
    
    /**+
     * Ex 6.20
     * Generates a random number between min and max
     */
    public int randomWithBounds(int min, int max){
        return random.nextInt(max - min + 1)+ min;
    }    
    
    
}
