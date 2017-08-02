import java.util.ArrayList;

/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    // Define any necessary fields here ...
   private ArrayList<Membership> members;
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        members = new ArrayList();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        members.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return members.size();
    }
    
    /**
     * Ex 4.54
     * This method will have a user enter a month to find out
     * how many members joined that month.
     
    public int joinedInMonth(int month){
        int numberOfMembers = 0;
        if ( month > 12|| month < 0) {
            System.out.println( "There are only 12 months. Please try again and enter  a value between 1 and 12.");
            return 0;
        }
        for(int x=0; x <numberOfMembers();x++){
          if(members.getMonth()==month){//supposed to be a method call for it's value
              numberOfMembers = numberOfMembers + 1;
            }
            return numberOfMembers;
        }
    }*/
    
    /**
     * Ex 4.55 -Purge
     * takes all members who joined in a certian month and year and 
     * places them in their own collection.
     */
    
    public ArrayList Purge(int month, int year){
       ArrayList newMembers = new ArrayList();
        if ( month > 12|| month < 0) {
            System.out.println( "There are only 12 months. Please try again and enter  a value between 1 and 12.");
            return newMembers;
        }
        for(Membership member : members){
            if(member.getMonth()=month && member.getYear()==year){//I don't care just compile 
                newMembers.add(member);
            }
        }
        return newMembers;
    }
}

