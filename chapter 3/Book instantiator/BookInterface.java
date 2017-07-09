
/**
 * This allows the user to interact with the book object
 *
 * @author (Jacob Knott)
 */
public class BookInterface
{
    private Book book;
    
    /**
     * Creates and allows interaction with an individual book object
	 *
     */
    public BookInterface()
    {
        book = new Book("unknown", "unknown", "unknown", "unknown","unknown", 0
        );
    }
    
/**
*  Use this method to give the book object details. 
*/
    public void setBookDetials( String lastName, String firstName, String isbn, String title, 
    String datePublished, int pages){
        book.changeTitle(title);
		book.changeFirstName(firstName);
        book.changeLastName(lastName);
		book.changeISBN(isbn);
		book.changeDatePublished(datePublished);
		book.editNumberOfPages(pages);
    }  

	//Method calls printDetials
	public void printBookDetails(){
	book.printBookDetails();
	}

	//Method calls printTitle
	public void printTitle(){
	 System.out.println();
	}	
	
	//Method calls printDetials
	public void printAuthorName(){
	book.printAuthorName();
	}

	//this method calls printNumberOfPages
	public void printNumberOfPages(){
	book.printPageCount();
	}

	//This method calls and displays the ISBN #
	public void printISBN(){
	book.printISBN();
	}

	//this prints the date it was published
	public void prindPublishmentDate(){
	book.printDatePublished();
	}
}