/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;

    /**
     * Please Enter the book's Author, Title, Number of Pages, and
     * for course text enter "true" if used as a course textbook 
     * or enter "false" if it is not.
     */
    public Book(String bookAuthor, String bookTitle, int numberOfPages, boolean isCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = numberOfPages;
        borrowed = 0;
        courseText = isCourseText;
    }

    // get author returns the authors names 
    public String getAuthor()
    {
        return author;
    }
    
    // Returns books title
    public String getTitle()
    {
        return title;
    }
    
    // returns number of pages in book
    public int getNumberOfPages()
    {
        return pages;
    }
    
    // shows if book is a course's text book
    public boolean isCourseText()
    {
        return courseText;
    }
    
    // Returns the number of times the book was borrowed
    public int getTimesBorrowed()
    {
        return borrowed;
    }
    
    // Keeps tracks times book was borrowed
    public void borrowBook()
    {
        //int timesBorrowed = 0;
        borrowed = borrowed + 1;
    }
    
    // Assigns a reference number to the book
    public void setRefNumber(String ref)
    {
        if( ref.length() < 3){
            System.out.println("Reference number must be 3 or more characters. ");
        }
        else {
        refNumber = ref;
        }
    }
    
    public String getRefNumber()
    {
        return refNumber;
    }
    
    // Prints author name to terminal
    public void printAuthor()
    {
        System.out.println(" The author is " + author + ". ");
    }
    
    // Prints book title to terminal
    public void printTitle()
    {
        System.out.println(" The title is " + title + ". ");
    }
    
    public void printDetails()
    {
        if (refNumber != null){
            System.out.println();
            System.out.println(" Title: " + title );
            System.out.println(" Author: " + author);
            System.out.println(" Number of pages: " + pages);
            System.out.println( " Reference Number: " + refNumber);
            System.out.println( " Times Borrowed: " + borrowed);
            System.out.println();
        }
        else {
            System.out.println();
            System.out.println(" Title: " + title );
            System.out.println(" Author: " + author);
            System.out.println(" Number of pages: " + pages);
            System.out.println( " Reference Number: ZZZ");
            System.out.println( " Times Borrowed: " + borrowed);
            System.out.println();
        }
    }
}
