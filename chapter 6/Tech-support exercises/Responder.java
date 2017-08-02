import java.util.*;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class Responder
{
    // Used to map key words to responses.
    
    private HashMap<String, String> responseMap;
    // Default responses to use if we don't recognise a word.
    private ArrayList<String> defaultResponses;
    private Random randomGenerator;
    private int prevIndex =-1;

    /**
     * Construct a Responder
     */
    public Responder()
    {
        responseMap = new HashMap<>();
        defaultResponses = new ArrayList<>();
        fillResponseMap();
        fillDefaultResponses();
        randomGenerator = new Random();
    }

    
    public String generateResponseV1(HashSet<String> words)
    {
        for (String word : words) {
            String response = responseMap.get(word);
            if(response != null) {
                return response;
            }
        }
        
        // if no mathces it returns one of our default responses. 
        return selectDefaultResponse();
    }
    
    /**
     * Ex 6.45, 6.46, 
     */
        public String generateResponse(HashSet<String> words)
    {
        Iterator iterator = words.iterator();
        while(iterator.hasNext()){
            String word = iterator.next();
            if(word.equalsIgnoreCase("crashes")){
                word = "crash";
            }
            else if(word.equalsIgnoreCase("buggy")){
                word = "bug";
            }
            else if(word.equalsIgnoreCase("garbage")){
                word = "stupid";
            }
            else if(word.equalsIgnoreCase("glitch")){
                word = "bug";
            }
            else if(word.equalsIgnoreCase("blue screen")){
                word = "crash";
            }
            String response =responseMap.get(word);
            if(response != null){
             return selectDefaultResponse();
            }
            }

    }

    /**
     * Enter all the known keywords and their associated responses
     * into our response map.
     */
    private void fillResponseMap()
    {
         responseMap.put("stupid", 
                        "I am doing the best I can to help you. I would ask that you\n" +
                        "calm down and explain the issue in greater detail to me.");
         responseMap.put("When I", 
                        "That is a user error. Please read the training booklet \n" +
                        "or check your reference manual. If you give me more information I can see what \n"+
                        "I can find out when you check the manual.");
        responseMap.put("crash", 
                        "Well, it never crashes on our system. It must have something\n" +
                        "to do with your system. Tell me more about your configuration.");
        responseMap.put("crashes", 
                        "Well, it never crashes on our system. It must have something\n" +
                        "to do with your system. Tell me more about your configuration.");
        responseMap.put("slow", 
                        "You're computer is likely out of date. Try updating it or get a new computer.");
        responseMap.put("performance", 
                        "Performance was quite adequate in all our tests. Are you running\n" +
                        "any other processes in the background?");
        responseMap.put("bug", 
                        "Don't worry, this is a known bug. We ask that you remain patient, \n" +
                        "we release reuglar updates to improve performance \n" +
                        "It should be fixed in the next update");
        responseMap.put("buggy", 
                        "Please be pat");
        responseMap.put("windows", 
                        "This is a known bug to do with the Windows operating system. Please\n" +
                        "report it to Microsoft. There is nothing we can do about this.");
        responseMap.put("mac", 
                        "There is you're problem, our program isn't supported on mac. \n"+
                        "Please purchase a linux or windows computer");
        responseMap.put("installation", 
                        "The installation is really simple. Just liste to clippy\n" +
                        "He should be instruct you in the proper setup procedure.");
        responseMap.put("memory", 
                        "If you read the system requirements carefully, you will see that the\n" +
                        "specified memory requirements are 1.5 giga byte. You really should\n" +
                        "upgrade your memory. You can download more memory here www.NotAVirus.net");
        responseMap.put("linux", 
                        "We take Linux support very seriously. But there are some problems.\n" +
                        "Most have to do with incompatible glibc versions. Can you be a bit\n" +
                        "more precise?");
    }

    /**
     * Build up a list of default responses from which we can pick one
     * if we don't know what else to say.
     */
    private void fillDefaultResponses()
    {
        defaultResponses.add("That sounds odd. Could you describe that problem in more detail?");
        defaultResponses.add("That sounds interesting. Tell me more...");
        defaultResponses.add("Have you checked that you do not have a dll conflict?");
        defaultResponses.add("That is explained in the manual. Have you read the manual?");
        defaultResponses.add("That's not a bug, it's a feature!");
        defaultResponses.add("I have never heard of this issue before, could you plese tell me more?");
        defaultResponses.add("Have you tried turning it on and off?");
        defaultResponses.add("Woah, that not supposed to happen. \n"+
        "Can you recreate the issue and describe it step by step?");
        defaultResponses.add("I'm sorry, I need a little more to go on.");
        defaultResponses.add("Is everything plugged in?");
    }

    /**
     * Ex. 6.44 alterations should stop default resposnses from ever being repeated. 
     * Randomly select and return one of the default responses.
     * @return     A random default response
     */
    private String selectDefaultResponse()
    {
        // Pick a random number for the index in the default response list.
        // The number will be between 0 (inclusive) and the size of the list (exclusive).
        
        int index = 0;
        do{
            index=randomGenerator.nextInt(defaultResponses.size());
        } while( index == prevIndex);
        prevIndex = index;
        return defaultResponses.get(index);
    
      }
        
    }

