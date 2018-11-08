// Source code for the HelpMenuView class
// The HelpMenuView class is a member of the view layer
// Methods in the  HelpMenuVeiw class manage the user view
// Author: Jeremi Llynch
// Date Last modified: 11/7

package view;
import java.util.Scanner;
import control.*;


/**
 *
 * @author jeremilynch
 */
public class GameMenuView {
    
    Scanner keyboard = new Scanner(System.in);
    private String GameMenu;
    private int max;
    
    
public void displayMenuView()
{
    int menuOption;
    do
    {
     // Display the menu
     System.out.println(GameMenu);

    // Prompt the user and get the user’s input
     menuOption = getMenuOption();

    // Perform the desired action
     doAction(menuOption);

    } while (menuOption != max);
 }  
 
public GameMenuView()
{
       gameMenu = "\n" +
                   "**********************************\n" +
                   "* CITY OF AARON: GAME MENU  *\n" +
                   "**********************************\n" +
                   " 1 - View the map\n" +
                   " 2 - View/Print a list\n" +
                   " 3 - Move to a new location\n" +
                   " 4 - Manage the crops\n" +
                   " 5 - Return to the Main menu\n" ;
                   
        max = 5;
}



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
         
         
 public void doAction(int option)
    {
        switch(option)
        {
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
     
   public void viewmap()
 {
     System.out.println("\nView the map?");
 }
   public void viewView_PrintList()
 {
     System.out.println("\nView/Print a list");
 }
   public void viewNewLocation()
 {
     System.out.println("\nMove to a new location");
 }
   public void viewManageCrops()
 {
     System.out.println("\nManage the crops");
 }
    
    
}
