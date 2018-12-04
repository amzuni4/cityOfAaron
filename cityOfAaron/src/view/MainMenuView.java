// The MainMenuView class - part of the view layer
// Object of this class manage the main menu
// Author: Raylee Haws, Jeremi Lynch, Amy Zuniga
// Date last modified: November 14, 2018
//-------------------------------------------------------------



package view;
import java.util.Scanner;
import control.*;


public class MainMenuView extends MenuView
{
    
public MainMenuView()
{
        super( "\n" +
                   "**********************************\n" +
                   "* CITY OF AARON: MAIN GAME MENU  *\n" +
                   "**********************************\n" +
                   " 1 - Start new game\n" +
                   " 2 - Get and start a saved game\n" +
                   " 3 - Get help on playing the game\n" +
                   " 4 - Save game\n" +
                  " 5 - Quit\n", 
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
                startNewGame();
                break;
            case 2: // get and start a saved game
                startSavedGame();
                break;
            case 3: // get help menu
                displayHelpMenuView();
                break;
            case 4: // save game
                displaySaveGameView();
                break;
            case 5:
                System.out.println("Thanks for playing ... goodbye.");
        }
    } 

 // The startNewGame method
 // Purpose: creates game object and starts the game
 // Parameters: none
 // Returns: none
 // ===================================     
 public void startNewGame()
 {
     
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
// Display the Game menu
GameMenuView gmv = new GameMenuView();
gmv.displayMenu();

 }


// The startSavedGame method
 // Purpose: loads a saved game object from disk and start the game
 // Parameters: none
 // Returns: none
 // ===================================     
 public void startSavedGame()
 {        
       // get rid of nl character left in the stream

       // prompt user and get a file path
       
    String name;
   System.out.println("\nPlease type in your first name: ");
    name = keyboard.next(
    );
      // call the getSavedGame( ) method in the GameControl class to load the game
 GameControl.getSavedGame();
      // display the game menu for the loaded game
}
 // The displayHelpMenuVeiw method
 // Purpose: displays help menu
 // Parameters: none
 // Returns: none
 // ===================================     
 public void  displayHelpMenuView()
 {
  System.out.println("\nPick your game option selection");
          HelpMenuView hmv = new HelpMenuView();
          hmv.displayMenu();


 }
 // The displaySaveGameView method
 // Purpose: saves the user's place in the game
 // Parameters: none
 // Returns: none
 // ===================================     
 public void displaySaveGameView()
 {
     System.out.println("\nSave Game.");
 }
 
   
}


