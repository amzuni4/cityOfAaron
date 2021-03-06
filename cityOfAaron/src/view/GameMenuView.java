// Source code for the GameMenuView class
// The GameMenuView class is a member of the view layer
// Methods in the  GameMenuView class manage the user view
// Author: Amy Zuniga, Raylee Haws, Jeremi Lynch; Jeremi Llynch up until week 10
// Date Last modified: 11/20
package view;

import cityofaaron.CityOfAaron;
import java.util.Scanner;
import control.*;
import model.Game;

/**
 *
 * @author jeremilynch
 */
public class GameMenuView extends MenuView {
    // The GameMenuView constructor
    // Purpose: Initialize the menu data
    // Parameters: none
// Returns: none
// ===================================

    public GameMenuView() {
        super("\n"
                + "**********************************\n"
                + "* CITY OF AARON: GAME MENU VIEW *\n"
                + "**********************************\n"
                + " 1 - View the map\n"
                + " 2 - View/Print a list\n"
                + " 3 - Move to a new location\n"
                + " 4 - Manage the crops\n"
                + " 5 - Save Current Game\n"
                + " 6 - Return to the Main menu", 6);

    }

    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // ===================================               
    @Override
    public void doAction(int option) {
        switch (option) {
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
            case 5: // save game
                saveGame();
                break;
            case 6:
                System.out.println("Return to Main Menu.");

        }
    }

    /**
     *
     */
    public void viewMap() {
        System.out.println("\nView the map?");

    }
    // The map method
    // Purpose: map of the city of Aaron
    // Parameters: none
    // Returns: none
    // ===================================  

    // The print list method
    // Purpose: prints a list of 
    //1. List or view the animals in the storehouse
//2. List or view the tools in the storehouse
//3. List or view the provisions in the storehouse
//4. List or view the developers of this game
    public void view_PrintList() {
        System.out.println("\nView/Print a list");
    }
    // Parameters: none
    // Returns: none
    // ===================================  

    // The new location method
    // Purpose: helps user find a new location in the city of Aaron
    // Parameters: none
    // Returns: none
    // ===================================  
    public void viewNewLocation() {
        System.out.println("\nMove to a new location");
    }

    // The manage the crops method
    // Purpose: When the user selects this option, they will be taken 
    //through all of the steps outlined in the “Play of the Game” at 
    //  the beginning of this document. There is a user story associated
    //  with each step. The user will go through each step in order.
    // Parameters: none
    // Returns: none
    // ===================================    
    public void viewManageCrops() {
        System.out.println("\nManage the crops");
        CropView.runCropView();
    }

    // The viewList() method
    // Purpose: Creates a ListMenuView object and calls its
    //    displayMenu( ) method       
    // Parameters: none
    // Returns: none
    public void viewList() {

        ListMenuView lmv = new ListMenuView();
        lmv.displayMenu();

    }

    // Save Game method
    // Purpose: loads a saved game object from disk and start the game
    // Parameters: none
    // Returns: none
    // Author: Amy Zuniga, Raylee Haws, Jeremi Lynch
    // December 4
    public void saveGame() {
        //Prompt user to get file path + get rid of /n character left in stream
        System.out.println("Save game to  file and end the filename with .txt ");
        String filePath = keyboard.next();
        
        // call the save Game() method in the GameControl class
        GameControl.saveGame(filePath);
        
       
    }
}
