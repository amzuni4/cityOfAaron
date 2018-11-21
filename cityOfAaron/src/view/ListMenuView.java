// Source code for the ListMenuView class
// The ListMenuView class is a member of the view layer
// Methods in the  ListMenuVeiw class manage the user view
// Author: Amy Zuniga, Jeremi Lynch, Week 10; Raylee Haws up until week 10
// Date Last modified: 11/16
// ==============================================================
package view;
import model.Animal;
import java.util.ArrayList;
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
                   " 1 - List the animals in the storehouse\n" +
                   " 2 - List the tools in the storehouse\n" +
                   " 3 - List the provisions in the storehouse\n" +
                   " 4 - List the developers of this game\n" +
                   " 5 - Back to Main Menu",
        5);
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
 //Author: Amy Zuniga
// Date Modified: Nov 20, 2018
 // ===================================
    public void listAnimals() 
    {
        System.out.println("\nView the Animals in the storehouse"); 
    }
//         public static void createAnimalList()
//    {
//        ArrayList<Animal> animal = new ArrayList<>();
//        
//        animal.add(new Animal("Cows", 122));
//        animal.add(new Animal("Horses", 222));
//        animal.add(new Animal("Pigs", 30));
//        animal.add(new Animal("Goats", 80));
//       
//        theGame.setAnimals(animals);
//    }
//    }
    
    // The listTools method
 // Purpose: Shows the user a list of the tools in the storehouse
 // Parameters: none
 // Returns: none
 // ===================================
    public void listTools() 
    {
        System.out.println("\nView the tools in the storehouse");        
    }
    
    // The listProvisions method
 // Purpose: Shows the user a list of the provisions in the storehouse
 // Parameters: none
 // Returns: none
 // ===================================
    public void listProvisions() 
    {
        System.out.println("\nView the Provisions in the storehouse");        
    }
 
    // The listTeam method
 // Purpose: Shows the user a list of the developers of this game
 // Parameters: none
 // Returns: none
 // ===================================
    public void listTeam() 
    {
        System.out.println("\nView the Developers of this game");        
    }    
}