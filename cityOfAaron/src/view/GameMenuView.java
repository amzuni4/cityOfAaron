// Source code for the GameMenuView class
// The GameMenuView class is a member of the view layer
// Methods in the  GameMenuView class manage the user view
// Author: Jeremi Llynch
// Date Last modified: 11/17/2018
package view;

import java.util.Scanner;
import control.*;

/**
 *
 * @author jeremilynch
 */
public class GameMenuView extends MenuView {

    //Scanner keyboard = new Scanner(System.in);
    //private String GameMenu;
    //private int max;
    // The displayMenuView method
    // Purpose: displays the menu, gets the user's input, and does the 
    //  selected action
    // Parameters: none
    // Returns: none 
    public GameMenuView() {
        super("\n"
                + "**********************************\n"
                + "* CITY OF AARON: GAME MENU  *\n"
                + "**********************************\n"
                + " 1 - View the map\n"
                + " 2 - View/Print a list\n"
                + " 3 - Move to a new location\n"
                + " 4 - Manage the crops\n"
                + " 5 - Return to the Main menu\n",
                5);
    }

    
// The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // ===================================               

    @Override public void doAction(int option) 
    {
        switch (option) {
            case 1: // create and start a new game
                viewMap();
                break;
            case 2: // get and start a saved game
                view_PrintList();
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

    public void viewMap() {
        System.out.println("\nView the map?");
    }
    // The map method
    // Purpose: map of the city of Aaron
    // Parameters: none
    // Returns: none
    // ===================================  

    public void view_PrintList() {
        System.out.println("\nView/Print a list");
    }
    // The print list method
    // Purpose: prints a list of 
    //1. List or view the animals in the storehouse
    //2. List or view the tools in the storehouse
    //3. List or view the provisions in the storehouse
    //4. List or view the developers of this game

    // Parameters: none
    // Returns: none
    // ===================================  
    public void viewNewLocation() {
        System.out.println("\nMove to a new location");
    }
    // The new location method
    // Purpose: helps user find a new location in the city of Aaron
    // Parameters: none
    // Returns: none
    // ===================================  

    public void viewManageCrops() {
        System.out.println("\nManage the crops");
    }
    // The manage the crops method
    // Purpose: When the user selects this option, they will be taken 
    //through all of the steps outlined in the “Play of the Game” at 
    //  the beginning of this document. There is a user story associated
    //  with each step. The user will go through each step in order.
    // Parameters: none
    // Returns: none
    // ===================================    

}
