/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
