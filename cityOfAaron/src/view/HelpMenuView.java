// Source code for the HelpMenuView class
// The HelpMenuView class is a member of the view layer
// Methods in the  HelpMenuVeiw class manage the user view
// Author: Amy Zuniga
// Date Last modified: 11/5
// ==============================================================
package view;
import java.util.Scanner;
import control.*;
import model.*;
/**
 *
 * @author admin
 */
public class HelpMenuView extends MenuView
{

// The HelpMenuView constructor
  // Purpose: Initialize the menu data
 // Parameters: none
// Returns: none
// ===================================
public HelpMenuView()
{
       super("\n" +
                   "**********************************\n" +
                   "* CITY OF AARON: HELP MENU VIEW *\n" +
                   "**********************************\n" +
                   " 1 - What are the goals of the game\n" +
                   " 2 - Where is the city of Aaron?\n" +
                   " 3 - How do I view the map?\n" +
                   " 4 - How do I move to another location?\n" +
                   " 5 - How do I display a list of animals, provisions, and tools in the city storehouse?\n" +
                   " 6 - Back to Main Menu", 
         6);
}


    
    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // ===================================       
   @Override public void doAction(int option)
    {
        switch(option)
        {
            case 1: // create and start a new game
                viewGoals();
                break;
            case 2: // get and start a saved game
                whereIsTheCity();
                break;
            case 3: // get help menu
                viewMapHelp();
                break;
            case 4: // save game
                viewMoveHelp();
                break;
            case 5:
                viewListHelp();
                break;
            case 6:
               System.out.println("Return to Main Menu.");
        }
    } 
    
    // The viewGoals method
 // Purpose: Tells the user the goal of them game
 // Parameters: none
 // Returns: none
 // ===================================     
 

public void viewGoals()
 {
     System.out.println("\nWhat are the goals of the game?");
 }

 // The whereIsTheCity method
 // Purpose: helps user find the city of Aaron
 // Parameters: none
 // Returns: none
 // ===================================     
 public void  whereIsTheCity()
 {
     System.out.println("\nWhere is the City of Aaron?.");
 }
 // The viewMapHelp method
 // Purpose: Helps the user view the map
 // Parameters: none
 // Returns: none
 // ===================================     
 public void viewMapHelp()
 {
     System.out.println("\nView the Map!");
 }
 
  // The viewMoveHelp method
 // Purpose: Helps the user move to another location
 // Parameters: none
 // Returns: none
 // ===================================     
 public void viewMoveHelp()
 {
     System.out.println("\nMove to another Location.");
 }
 
  // The viewListHelp method
 // Purpose: Displays the list of animals, provisions, and tools
 // Parameters: none
 // Returns: none
 // ===================================     
 public void viewListHelp()
 {
     System.out.println("\nDisplay list of Animals.");
 }
}
