// Source code for the HelpMenuView class
// The HelpMenuView class is a member of the view layer
// Methods in the  HelpMenuVeiw class manage the user view
// Author: Amy Zuniga
// Date Last modified: 11/5
// ==============================================================
package view;
import java.util.Scanner;
import control.*;

/**
 *
 * @author admin
 */
public class HelpMenuView {
    Scanner keyboard = new Scanner(System.in);
    private String helpMenu;
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
     System.out.println(helpMenu);

    // Prompt the user and get the user’s input
     menuOption = getMenuOption();

    // Perform the desired action
     doAction(menuOption);

    } while (menuOption != max);
 }

// The HelpMenuView constructor
  // Purpose: Initialize the menu data
 // Parameters: none
// Returns: none
// ===================================
public HelpMenuView()
{
       helpMenu = "\n" +
                   "**********************************\n" +
                   "* CITY OF AARON: HELP MENU  *\n" +
                   "**********************************\n" +
                   " 1 - What are the goals of the game\n" +
                   " 2 - Where is the city of Aaron?\n" +
                   " 3 - How do I view the map?\n" +
                   " 4 - How do I move to another location?\n" +
                   " 5 - How do I display a list of animals, provisions, and tools in the city storehouse?\n" +
                   " 6 - Back to Main Menu" ;
        max = 6;
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
         final int MAX = 6;
         //begin loop
         // begin loop  
         do
         {
         // get user input from the keyboard
             userInput = keyboard.nextInt();
         // if it is not a valid value, output an error message
           if(userInput < 1 || userInput > MAX)
               System.out.println("Error: you must select 1, 2, 3, 4, 5, or 6");
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
                viewGoals();
                break;
            case 2: // get and start a saved game
                whereIsTheCity();
                break;
            case 3: // get help menu
                viewMapHelp();
                break;
            case 4: // save game
                viewMoveHelp();
                break;
            case 5:
                viewListHelp();
                break;
            case 6:
               System.out.println("Return to Main Menu.");
        }
    } 
    
    // The viewGoals method
 // Purpose: Tells the user the goal of them game
 // Parameters: none
 // Returns: none
 // ===================================     
 

public void viewGoals()
 {
     System.out.println("\nWhat are the goals of the game?");
 }

 // The whereIsTheCity method
 // Purpose: helps user find the city of Aaron
 // Parameters: none
 // Returns: none
 // ===================================     
 public void  whereIsTheCity()
 {
     System.out.println("\nWhere is the City of Aaron?.");
 }
 // The viewMapHelp method
 // Purpose: Helps the user view the map
 // Parameters: none
 // Returns: none
 // ===================================     
 public void viewMapHelp()
 {
     System.out.println("\nView the Map!");
 }
 
  // The viewMoveHelp method
 // Purpose: Helps the user move to another location
 // Parameters: none
 // Returns: none
 // ===================================     
 public void viewMoveHelp()
 {
     System.out.println("\nMove to another Location.");
 }
 
  // The viewListHelp method
 // Purpose: Displays the list of animals, provisions, and tools
 // Parameters: none
 // Returns: none
 // ===================================     
 public void viewListHelp()
 {
     System.out.println("\nDisplay list of Animals.");
 }
}
