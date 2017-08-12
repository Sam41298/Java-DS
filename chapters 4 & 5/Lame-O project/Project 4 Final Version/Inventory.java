import java.util.*;
import java.io.*;

/**
 * Inventory details
 */
public class Inventory
{
 // this array stores price info for Nature cookie cutters   
 Integer natureCutters[] = {300,10,15,30,25,30};
 // this array stores price info for Nature cookie cutters
 Integer techCutters[]= {350,20,30,40,50,60};
 // this array stores price info for techie cookie cutters
 Integer businessCutters[]= {375,30,40,50,60,70};
 // this array stores price info for musical cookie cutters
 Integer musicCutters[]= {400, 85,95,110,130,210};
 // this array stores price info for Naughty cookie cutters
 Integer naughtyCutters[]= {500,100,200,300,400,500};
 // Stores selected design
 Integer selectedDesign[];
  
  public Inventory(){
      
  }
  
  public int getValue(int design, int feature){
      //
      int number = 0;
      switch (design){
          case 1: number = natureCutters[feature]; break;
          case 2: number = techCutters[feature]; break; 
          case 3: number = businessCutters[feature]; break;
          case 4: number = musicCutters[feature]; break;
          case 5: number = naughtyCutters[feature]; break;
          
      }
      return number;
  }
  
  /**
   * Has the customer select a design and it copies the selected arrays values to the 
   * selectedDesign array
   * 
   * Is there a wau to have this print a message telling what product was selected?
   */
    public int selectDesign(int design){
      //
      switch (design){
          case 1: selectedDesign = natureCutters; break;
          case 2: selectedDesign = techCutters; break; 
          case 3: selectedDesign = businessCutters; break;
          case 4: selectedDesign = musicCutters; break;
          case 5: selectedDesign = naughtyCutters; break;
          default: System.out.println( " there is not design "+"/" + design + "/"+" please select a valid product"); break;
      } // I need to fix default so it returns something, w/out that it is a nullpointer execption

      return selectedDesign[0];// grabs the base price of the selected product
  }
 
  /**
   * Has the customer select a design and it copies the selected arrays values to the 
   * selectedDesign array
   * 
   * Is there a wau to have this print a message telling what product was selected?
   */
  public int selectFeature(int feature){
	feature = selectedDesign[feature];
	return feature;// grabs the base price of the selected product
  } 
  
  /**
   * gets the selected design and base pris
   */
  
  public void printDesigns(){
      //Called to print out meue of designs and features with their prices.
      System.out.println("           |          Feature Prices");
      System.out.println("   Design  |  Base  One  Two  Three  Four  Five");
      System.out.println("-----------------------------------------------------------");
      for(int i = 1; i <= 5; i++){
          switch(i){
              case 1: System.out.print("1. Nature  |"); break;
              case 2: System.out.print("2. Tech    |"); break;
              case 3: System.out.print("3. Business|"); break;
              case 4: System.out.print("4. Music   |"); break;
              case 5: System.out.print("5. Naughty |"); break;
          }
          for(int j = 0; j <= 5; j++){
              System.out.print("  $"+ getValue(i,j));
          }
          System.out.println();
      }
  }
}
