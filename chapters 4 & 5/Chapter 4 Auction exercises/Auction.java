import java.util.ArrayList;

/**
 * A simple model of an auction.
 * The auction maintains a list of lots of arbitrary length.
 *
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 */
public class Auction
{
    // The list of Lots in this auction.
    private ArrayList<Lot> lots;
    // The number that will be given to the next lot entered
    // into this auction.
    private int nextLotNumber;

    /**
     * Create a new auction.
     */
    public Auction()
    {
        lots = new ArrayList<>();
        nextLotNumber = 1;
    }

    /**
     * Enter a new lot into the auction.
     * @param description A description of the lot.
     */
    public void enterLot(String description)
    {
        lots.add(new Lot(nextLotNumber, description));
        nextLotNumber++;
    }

    /**
     * Show the full list of lots in this auction.
     */
    public void showLots()
    {
        for(Lot lot : lots) {
            System.out.println(lot.toString());
        }
    }
    
    /** Ex 4.52
     * This allows lots to be removed from the auction
     */
    public Lot removeLot(int number){
    int num = number;
    Lot selectedLot = getLot(number);
       for(num = lots.size()-1; num >= 0; num = num-1){
        selectedLot=lots.get(num);
            if(selectedLot.getNumber() == number){
            lots.remove(num);
           }
        }
    return selectedLot;
   }

    /**
     * Make a bid for a lot.
     * A message is printed indicating whether the bid is
     * successful or not.
     * 
     * @param lotNumber The lot being bid for.
     * @param bidder The person bidding for the lot.
     * @param value  The value of the bid.
     */
    public void makeABid(int lotNumber, Person bidder, long value)
    {
         Lot selectedLot = getLot(lotNumber);
        if(selectedLot != null) {
            boolean successful = selectedLot.bidFor(new Bid(bidder, value));
            if(successful) {
                System.out.println("The bid for lot number " +
                                   lotNumber + " was successful.");
            }
            else {
                // Report which bid is higher.
                Bid highestBid = selectedLot.getHighestBid();
                System.out.println("Lot number: " + lotNumber +
                                   " already has a bid of: " +
                                   highestBid.getValue());
            }
        }

    }

    /**
     * Return the lot with the given number. Return null
     * if a lot with this number does not exist.
     * @param lotNumber The number of the lot to return.
     */
    public Lot getLot(int lotNumber)
    {
        if((lotNumber >= 1) && (lotNumber < nextLotNumber)) {
            // The number seems to be reasonable.
            Lot selectedLot = lots.get(lotNumber - 1);
            // Include a confidence check to be sure we have the
            // right lot.
            if(selectedLot.getNumber() != lotNumber) {
                System.out.println("Internal error: Lot number " +
                                   selectedLot.getNumber() +
                                   " was returned instead of " +
                                   lotNumber);
                // Don't return an invalid lot.
                selectedLot = null;
            }
            return selectedLot;
        }
        else {
            System.out.println("Lot number: " + lotNumber +
                               " does not exist.");
            return null;
        }
    }
    
    /** Ex 4.51
     *  this method is the same as getLot but doesn't rely on index values.
     
    public Lot getLot2(int lotNumber){
        for (Lot selectedLot:lots){
        if(Lot selectedLot.getNumber()== lotNumber){
            return selectedLot;
        }
        else{
            system.out.println("lot number: " + lotNumber + " doesn't exist");
        }
    }*/
    
    /** Ex. 4.48
     * This method closes the action then prints which were bought and
     * by who along with displaying a list of lots that have not been sold.
     
    public void close(){
        Bid bid =Lot.getHighestBid(); // This line is giving me trouble I think its because I dont have a specific lot selected
        Person person;
        
        for(Lot lot : lots){
            if(bid !=null){
                person = bid.getBidder();
                Bid highestBid = lot.getHighestBid(); // name is always null, and highestbit prints the address
                System.out.println("Lot " + lot.getNumber() + " was sold to  " + person.getName() +" ");
                System.out.println(" for " + bid.getValue() + "$.");
            }
            else{
                System.out.print( "Lot " + lot.getNumber() + " was not sold.");
            }
        }
}*/

/**
 * This method will display all unsold lots in an auction
 */
public ArrayList getUnsold(){
    ArrayList<Lot> unsold = new ArrayList<Lot>();
   Bid bid;
   
    for(Lot lot : lots){
       bid = lot.getHighestBid();
       if(bid == null){
           unsold.add(lot);
        }
    }
    return unsold;
    
}



/**
 * File search: List all lots with a matching id 
 */
/**
 * 
 public void SearchLot(String or int?){
        direct copy from exercise  for(String filename : files) {
            if(filename.contains(searchString)) {
                // A match.
                System.out.println(filename);
            }
            else{
                System.out.print("No file matches your search.");
            }
        }
        */
       
}