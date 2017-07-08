
/**
 * the class Book is a template for all books 
 *
 * @author Jacob Knott
 */
public class Book
{
    // Author's Last Name
    private String lastName;
    // Authour's First Name
    private String firstName;
    // ISBN number
    private String isbn;
    // Book title
    private String title;
    // Publication Date
    private String pubDate;
    // Number of pages in the book
    private int pages;

    /**
     * Constructor for objects of class Book
     * Please enter the authors first and last name, the isbn, title, and
     * publishment date within quotation marks ("reqested info")
     */
    public Book(String lastName, String firstName, String isbn, String title, 
    String datePublished, int pages)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.isbn = isbn;
        this.title = title;
        pubDate = datePublished;
        if(pages < 10){
          System.out.println( "Books must be more than 10 pages long. Please try again");  
          
        }
    else {
        this.pages = pages;
        }
    }
    
    // Changes the numeber of pages in the Book
    public void editNumberOfPages(int page)
    {
        if( page < 10){
            System.out.println( "Books must be more than 10 pages long. Please try again");
        }
        else{
            pages = page;
        }
    }
    
}