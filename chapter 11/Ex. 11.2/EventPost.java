import java.util.*;
/**
 * Write a description of class EventPost here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EventPost extends Post
{
        private String eventName;  // an arbitrarily long, multi-line message

    /**
     * Constructor for objects of class MessagePost.
     * 
     * @param author    The username of the author of this post.
     * @param text      The text of this post.
     */
    public EventPost(String author, String eventName)
    {
        super(author);
        this.eventName = eventName;
    }
    
    /**
     * Return the text of this post.
     * 
     * @return The post's message text.
     */
    public String getText()
    {
        return eventName;
    }
}
