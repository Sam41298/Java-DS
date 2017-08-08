import java.util.HashMap;
import java.util.HashSet;
import java.util.*;

/**
 * Keep a record of how many times each word was
 * entered by users.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    1.0 (2016.02.29)
 */
public class WordCounter
{
    // Associate each word with a count.
    private HashMap<String, Integer> counts;

    /**
     * Create a WordCounter
     */
    public WordCounter()
    {
        counts = new HashMap<>();
    }
    
    /**
     * Update the usage count of all words in input.
     * @param input A set of words entered by the user.
     */
    public void addWords(HashSet<String> input)
    {
        for(String word : input) {
            int counter = counts.getOrDefault(word, 0);
            counts.put(word, counter + 1);
        }
    }
    
    /**
     * Ex 6.49
     * This prints the usage of each word after goodbye message is printed.
     * This runs endlessly, the loop isn't breaking though i think it should after it runs out of
     * tokens
     */
    public void usageCounter(){
        int counter = 0;
        String match = "bye";
        Scanner kb = new Scanner(System.in);//learn more about this class
        String str;
        str = kb.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");// learn more about class
        while(st.hasMoreTokens()){
            if(st.nextToken().equals(match)){
                counter = 1;
            }
            if(counter == 1){
                counter++;
            }
        }
        if(counter == 0){
        System.out.println("No words match");
        }
        else{
            System.out.println("There are " + counter + " word(s) after bye");
        }
    }
    
    /**
     * Ex. 6.50
     * a second attempt to at find method
     
    public void find(){
        HashMap hashMap= accessor();// I quit
        int counter = 0;
        String match = "bye";
        Scanner kb = new Scanner(System.in);//learn more about this class
        String str;
        str = kb.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");// learn more about class
        while(st.hasMoreTokens()){
            if(st.nextToken().equals(hashMap.getValue)){// im sick and tired of this the whole thing
                //nothing is done 
            }
        else{
                counter++;
            }
        } 
    }
    */
}