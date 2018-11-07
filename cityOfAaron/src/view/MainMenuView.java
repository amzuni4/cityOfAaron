// The MainMenuView class - part of the view layer
// Object of this class manage the main menu
// Author: Raylee Haws, Jeremi Lynch, Amy Zuniga
// Date last modified: October 2018
//-------------------------------------------------------------



package view;
import java.util.Scanner;
import control.*;

public class MainMenuView
{
    Scanner keyboard = new Scanner(System.in);
    private String theMenu;
    private int max;
   
    
// The displayMenuView method
// Purpose: displays the menu, gets the user's input, and does the 
//               selected action
// Parameters: none
// Returns: none
// =========================================================    
public void displayMenuView()
{
    int menuOption;
    do
    {
     // Display the menu
     System.out.println(theMenu);

    // Prompt the user and get the user’s input
     menuOption = getMenuOption();

    // Perform the desired action
     doAction(menuOption);

    } while (menuOption != max);
 }
   // The MainMenuView constructor
  // Purpose: Initialize the menu data
 // Parameters: none
// Returns: none
// ===================================
public MainMenuView()
{
        theMenu = "\n" +
                   "**********************************\n" +
                   "* CITY OF AARON: MAIN GAME MENU  *\n" +
                   "**********************************\n" +
                   " 1 - Start new game\n" +
                   " 2 - Get and start a saved game\n" +
                   " 3 - Get help on playing the game\n" +
                   " 4 - Save game\n" +
                   " 5 - Quit\n";
        
        max = 5;
}

// The getMenuOption method
    // Purpose: gets the user's input
    // Parameters: none
    // Returns: integer - the option selected
    // ===================================       
    public int getMenuOption()
    {
        // declare a variable to hold user's input
        int userInput = 0;
         final int MAX = 5;
         //begin loop
         // begin loop  
         do
         {
         // get user input from the keyboard
             userInput = keyboard.nextInt();
         // if it is not a valid value, output an error message
           if(userInput < 1 || userInput > MAX)
               System.out.println("Error: you must select 1, 2, 3, 4, or 5");
        // loop back to the top of the loop if input was not valid
        // end loop
           } while (userInput < 1 || userInput > MAX);
         return userInput; 
         
    
    }
    
    
    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // ===================================       
    public void doAction(int option)
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
    System.out.println("Welcome" + name + " have fun");
    // Display the Game menu

 }


 // The startSavedGame method
 // Purpose: Start a saved game
 // Parameters: none
 // Returns: none
 // ===================================     
 

public void startSavedGame()
 {
     System.out.println("\nStart where you left off.");
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
          hmv.displayMenuView();
////////   

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

