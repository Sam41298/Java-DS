
/**
 * Main is the "caller" of all methods. 
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;

public class Main
{
    public static void main(String args[])
    {
    
     ArrayList<ArrayList> MasterList = new ArrayList<ArrayList>();
        ArrayList<Integer> listOne = new ArrayList<Integer>();
        ArrayList<Integer> listTwo = new ArrayList<Integer>();
        ArrayList<Integer> listThree = new ArrayList<Integer>();
        ArrayList<Integer> listFour = new ArrayList<Integer>();
        ArrayList<Integer> listFive = new ArrayList<Integer>();
        
        /**
        *   The integer values are stored in new integer array objects.
        */
        
        Integer listOneNums[] = {300,10,15,30,25,30};
        Integer listTwoNums[] = {350,20,30,40,50,60};
        Integer listThreeNums[] = {375,30,40,50,60,70};
        Integer listFourNums[] = {400, 85,95,110,130,210};
        Integer listFiveNums[] = {500,100,200,300,400,500};
        
        /**
        *   "addNums" is a on-the-fly static function inside this program tasked
        *   with handling the tedious and repettitive method of adding values
        *   of the arrays to their respective ArrayLists. The function takes in
        *   an ArrayList object and an array object.
        */
        
        addNums(listOne, listOneNums);
        addNums(listTwo, listTwoNums);
        addNums(listThree, listThreeNums);
        addNums(listFour, listFourNums);
        addNums(listFive, listFiveNums);
        
        /**
        *   The "MasterList" ArrayList is now to store the "filled" ArrrayLists
        *   of the previous task above
        */
        
        MasterList.add(listOne);
        MasterList.add(listTwo);
        MasterList.add(listThree);
        MasterList.add(listFour);
        MasterList.add(listFive);
        
        /**
        *   Below is some debugging output to test the operations of before.
        */
        
        System.out.println(MasterList.get(0).get(0) ); //  notice first get() is the arrayList and the second get() is which element value you want from that arrayList. NOTE: First element starts with 0 in both.
    
        Ordering ordering = new Ordering();
        ordering.getCustomerInfo();
        ordering.createCustomer();
        ordering.printBillOfSale();
    }
    
    public static void addNums(ArrayList theLists, Integer nums[]) // The function accepts an ArrayList and an array of ints 
    {
        for (int i = 0; i < 5; i++) // 5 is a finite number. you could also use nums.size() for consistency? since my arrays are 6 columbs wide, 0-5 is 6 cycles
        {
            theLists.add(nums[i]);
        }
    }
}
