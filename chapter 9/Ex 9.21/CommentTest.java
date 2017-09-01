

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CommentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CommentTest
{
    /**
     * Default constructor for test class CommentTest
     */
    public CommentTest()
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
    public void testSameAuthor()
    {
        SalesItem salesIte1 = new SalesItem("BE A JAVA GURU", 9999);
        assertEquals(true, salesIte1.addComment("John", "good deal", 4));
        assertEquals(false, salesIte1.addComment("John", "Not the best", 2));
    }

    @Test
    public void testRatingOutOfBounds()
    {
        SalesItem salesIte1 = new SalesItem("JAVA GURU", 9999);
        assertEquals(false, salesIte1.addComment("J", "GG", 0));
        assertEquals(false, salesIte1.addComment("LL", "BG", 6));
    }

    @Test
    public void commentCreationTest()
    {
        Comment comment1 = new Comment("Joe", "It sorta works", 3);
        assertNotNull(comment1.getFullDetails());
    }

 

    @Test
    public void upVoteTest()
    {
        Comment comment1 = new Comment("Joe", "great deal", 5);
        comment1.upvote();
        comment1.upvote();
        comment1.upvote();
        assertEquals(3, comment1.getVoteCount());
    }

    @Test
    public void downVoteTest()
    {
        Comment comment1 = new Comment("Joe", "Game sucks", 1);
        comment1.downvote();
        comment1.downvote();
        comment1.downvote();
        assertEquals(-3, comment1.getVoteCount());
    }
}






