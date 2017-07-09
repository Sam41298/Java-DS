
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
    
    //THis method allows us to change all details of a book object
    public void setBookDetails(String title, String firstName, String lastName,int pages, String isbn, 
    String datePublished){
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
    
    //changes the title
    public void changeTitle(String title){
        this.title = title;
    }

    //changes the first name
    public void changeFirstName(String firstName){
        this.firstName = firstName;
    }

    //changes the last name
    public void changeLastName(String lastName){
        this.lastName = lastName;
    }
    
      //changes the isbn name
    public void changeISBN(String isbn){
        this.isbn = isbn;
    }
    
     //changes the isbn name
    public void changeDatePublished(String pubDate){
        this.pubDate = pubDate;
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
   
    // Print author's full Name
    public void printAuthorName(){
        System.out.println( "Author: " + firstName + lastName);
    }
    
    // Print the books title
    public void printTitle(){
        System.out.println( "Title: " + title);
    }
    
    // Print number of pages
    public void printPageCount(){
        System.out.println( "Number of Pages: " + pages);
    }
    
    // Print the books ISBN #
    public void printISBN(){
        System.out.println( "ISBN: " + isbn);
    }
    
    // Print the date published
    public void printDatePublished(){
        System.out.println( "Date Published: " + pubDate);
    }
    
    // Print Books Detials
    public void printBookDetails(){
        System.out.println();
        System.out.println( "Book Details");
        System.out.println( "Title: " + title);
        System.out.println( "Author: " + firstName + lastName);
        System.out.println( "Number of Pages: " + pages);
        System.out.println( "ISBN: " + isbn);
        System.out.println( "Date Published: " + pubDate);
        System.out.println();
    }
}