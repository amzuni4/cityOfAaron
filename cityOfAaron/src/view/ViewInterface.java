// The MainMenuView class - part of the view layer
// Object of this class manage the main menu
// Author: Raylee Haws, Jeremi Lynch, Amy Zuniga
// Date last modified: November 14, 2018
//-------------------------------------------------------------
package view;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public interface ViewInterface 
{ 
    public void displayMenu();
    public int getMenuOption();
    public void doAction(int option);

}
