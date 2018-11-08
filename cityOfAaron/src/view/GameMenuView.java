// Source code for the GameMenuView class
// The GameMenuView class is a member of the view layer
// Methods in the  GameMenuView class manage the user view
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
    
    
    
    
}
