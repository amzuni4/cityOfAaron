// Source code for the ListMenuView class
// The ListMenuView class is a member of the view layer
// Methods in the  ListMenuVeiw class manage the user view
// Author: Raylee Haws
// Date Last modified: 11/16
// ==============================================================
package view;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class ListMenuView extends MenuView {
    

// The ListMenuView constructor
  // Purpose: Initialize the menu data
 // Parameters: none
// Returns: none
// ===================================
public ListMenuView()
{
       super("\n" +
                   "**********************************\n" +
                   "* CITY OF AARON: LIST MENU  *\n" +
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
                listAnimals();
                break;
            case 2: // get and start a saved game
                listTools();
                break;
            case 3: // get help menu
                listProvisions();
                break;
            case 4: // save game
                listTeam();
                break;
            case 5:
               System.out.println("Return to Main Menu.");
        }
    } 
    
    // The listAnimals method
 // Purpose: Shows the user a list of the animals in the storehouse
 // Parameters: none
 // Returns: none
 // ===================================
    public void listAnimals() 
    {
        System.out.println("\nList or view the Animals in the storehouse");        
    }
    
    // The listTools method
 // Purpose: Shows the user a list of the tools in the storehouse
 // Parameters: none
 // Returns: none
 // ===================================
    public void listTools() 
    {
        System.out.println("\nList or view the tools in the storehouse");        
    }
    
    // The listProvisions method
 // Purpose: Shows the user a list of the provisions in the storehouse
 // Parameters: none
 // Returns: none
 // ===================================
    public void listProvisions() 
    {
        System.out.println("\nList or view the Provisios in the storehouse");        
    }
 
    // The listTeam method
 // Purpose: Shows the user a list of the developers of this game
 // Parameters: none
 // Returns: none
 // ===================================
    public void listTeam() 
    {
        System.out.println("\nList or view the Developers of this game");        
    }    
}