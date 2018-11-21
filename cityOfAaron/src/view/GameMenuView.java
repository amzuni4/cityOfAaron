// Source code for the GameMenuView class
// The GameMenuView class is a member of the view layer
// Methods in the  GameMenuView class manage the user view
// Author: Amy Zuniga, Raylee Haws, Jeremi Lynch; Jeremi Llynch up until week 10
// Date Last modified: 11/20

package view;
import java.util.Scanner;
import control.*;


/**
 *
 * @author jeremilynch
 */
public class GameMenuView extends MenuView
{
 // The GameMenuView constructor
  // Purpose: Initialize the menu data
 // Parameters: none
// Returns: none
// ===================================
public GameMenuView()
{
       super ("\n" +
                   "**********************************\n" +
                   "* CITY OF AARON: GAME MENU  *\n" +
                   "**********************************\n" +
                   " 1 - View the map\n" +
                   " 2 - View/Print a list\n" +
                   " 3 - Move to a new location\n" +
                   " 4 - Manage the crops\n" +
                   " 5 - Return to the Main menu", 5); 
                   
      
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
                viewMap();
                break;
            case 2: // get and start a saved game
                viewList();
                break;
            case 3: // get help menu
                viewNewLocation();
                break;
            case 4: // save game
                viewManageCrops();
                break;
            case 5:
                System.out.println("Return to Main Menu.");
            
        }
    } 
     
   public void viewMap()
 {
     System.out.println("\nView the map?");
 }
   public void view_PrintList()
 {
     System.out.println("\nView/Print a list");
 }
   public void viewNewLocation()
 {
     System.out.println("\nMove to a new location");
 }
   public void viewManageCrops()
 {
     System.out.println("\nManage the crops");
 }
    // The viewList() method
    // Purpose: Creates a ListMenuView object and calls its
    //    displayMenu( ) method       
    // Parameters: none
    // Returns: none
    public void viewList()
    {
        ListMenuView lmv = new ListMenuView();
        lmv.displayMenu();
    } 
    
}
