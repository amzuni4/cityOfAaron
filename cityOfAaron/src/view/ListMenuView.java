// Source code for the ListMenuView class
// The ListMenuView class is a member of the view layer
// Methods in the  ListMenuVeiw class manage the user view
// Author: Amy Zuniga, Jeremi Lynch, Week 10; Raylee Haws up until week 10
// Date Last modified: 11/16
// ==============================================================
package view;
import model.ListItem;
import control.GameControl;
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
public ListMenuView ()
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
            case 1: // calls listAnimals function
                listAnimals();
                break;
            case 2: // calls a ListTools function
                listTools();
                break;
            case 3: // calls list provisions
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
       GameControl gameControl = new GameControl();
 
       
        ArrayList<ListItem> listItem = new ArrayList<ListItem>();
        ArrayList<ListItem> listAnimal = gameControl.createAnimalList();
        
        //for loop prints out the type of animal, and the quantity of animals
        for(int i = 0; i < listAnimal.size(); i++){
        System.out.println(listAnimal.get(i).getName() + " " + listAnimal.get(i).getNumber());
        }
    }

    
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