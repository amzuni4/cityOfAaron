// The MainMenuView class - part of the view layer
// Object of this class manage the main menu
// Author: Raylee Haws, Jeremi Lynch, Amy Zuniga
// Date last modified: November 14, 2018
//-------------------------------------------------------------
package view;

import java.util.Scanner;
import control.*;
import java.io.Serializable;

public class MainMenuView extends MenuView {

    public MainMenuView() {
        super("\n"
                + "**********************************\n"
                + "* CITY OF AARON: MAIN MENU VIEW *\n"
                + "**********************************\n"
                + " 1 - Start new game\n"
                + " 2 - Load a saved game\n"
                + " 3 - Get help on playing the game\n"
                + " 4 - Quit\n",
                4);
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
                startNewGame();
                break;
            case 2: // get and start a saved game
                startSavedGame();
                break;
            case 3: // get help menu
                displayHelpMenuView();
                break;
            case 4:
                System.out.println("Thanks for playing ... goodbye.");
        }
    }

    // The startNewGame method
    // Purpose: creates game object and starts the game
    // Parameters: none
    // Returns: none
    // ===================================     
    public void startNewGame() {

        // Display the Banner Page.
        System.out.println("Welcome to the City of Aaron");
        
        // Prompt for and get the user’s name.
        String name;
        System.out.println("\nPlease type in your first name: ");
        name = keyboard.next();
        
        // Call the createNewGame() method in the GameControl class
        GameControl.createNewGame(name);
        
        // Display a welcome message
        System.out.println("Welcome " + name + " have fun");
        
        // Display the Game menu
        GameMenuView gmv = new GameMenuView();
        gmv.displayMenu();

    }

// The startSavedGame method
    // Purpose: loads a saved game object from disk and start the game
    // Parameters: none
    // Returns: none
    // Author: Amy Zuniga, Raylee Haws, Jeremi Lynch
    // December 4
    // ===================================     
    public void startSavedGame() {
        // 1. Prompt user for file name
        System.out.println("Get a Saved Game");

        //Prompt user to get file path + get rid of /n character left in stream
        System.out.println("Please enter the file path to your saved game ending in .txt: ");
        String filePath = keyboard.next();

        // 2. pass file to method in gameControl (loads saved game from disk
        try {
            GameControl gc = new GameControl();
            gc.getSavedGame(filePath);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("Your Game Loaded!");

        // Display the Game menu
        GameMenuView gmv = new GameMenuView();
        gmv.displayMenu();

    }

    // The displayHelpMenuVeiw method
    // Purpose: displays help menu
    // Parameters: none
    // Returns: none
    // ===================================     
    public void displayHelpMenuView() {
        System.out.println("\nPick your game option selection");
        HelpMenuView hmv = new HelpMenuView();
        hmv.displayMenu();

    }

}
