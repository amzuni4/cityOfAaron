// Source code for the ListMenuView class
// The ListMenuView class is a member of the view layer
// Methods in the  ListMenuVeiw class manage the user view
// Author: Amy Zuniga, Jeremi Lynch, Week 10; Raylee Haws up until week 10
// Date Last modified: 11/16
// ==============================================================
package view;
import cityofaaron.CityOfAaron;
import control.GameControl;
import model.Game;
import model.ListItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
     


/**
 *
 * @author admin
 */
public class ListMenuView extends MenuView {
    
private Game game = CityOfAaron.getGame();
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
 // Purpose: Shows the user a list of the animals in the storehouse from GameControl
 // Parameters: none
 // Returns: none
 //Author: Amy Zuniga
// Date Modified: Nov 26, 2018
 // ===================================
    public void listAnimals() 
{
    
    // get the reference to the game object that has beens stored in the CityOfAaron class.
// Save the reference in the variable “game"
Game game = CityOfAaron.getGame();   

// Now use this game object to get a reference to the animal list
ArrayList<ListItem> animal = game.getAnimal();
;     
        
 for (int i = 0; i < game.getAnimal().size(); i++){
  
 //}
       System.out.println(game.getAnimal().get(i).getName() + " " + game.getAnimal().get(i).getNumber());}
 }


    
    // The listTools method
 // Purpose: Shows the user a list of the tools in the storehouse
 // Parameters: none
 // Returns: none
 // ===================================
    public void listTools() 
    {
        Game game = CityOfAaron.getGame();   
        ArrayList<ListItem> tool = game.getTool();
               for (int i = 0; i < game.getTool().size(); i++){
  
       System.out.println(game.getTool().get(i).getName() + " " + game.getTool().get(i).getNumber());}
    }
    
    // The listProvisions method
 // Purpose: Shows the user a list of the provisions in the storehouse
 // Parameters: none
 // Returns: none
 // ===================================
    public void listProvisions() 
    {
         Game game = CityOfAaron.getGame();   
        ArrayList<ListItem> provision = game.getProvision();
            for (int i = 0; i < game.getProvision().size(); i++){
  
       System.out.println(game.getProvision().get(i).getName() + " " + game.getProvision().get(i).getNumber());} 
        
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